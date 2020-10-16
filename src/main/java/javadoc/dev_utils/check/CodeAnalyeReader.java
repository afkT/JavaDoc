package javadoc.dev_utils.check;

import com.sun.javadoc.ClassDoc;
import com.sun.javadoc.MethodDoc;
import com.sun.javadoc.RootDoc;
import com.sun.tools.javac.tree.JCTree;
import dev.utils.common.*;
import dev.utils.common.validator.ValidatorUtils;
import javadoc.Utils;
import javadoc.api.JavaDocReader;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * detail: 代码读取检测分析
 * @author Ttt
 */
public final class CodeAnalyeReader {

    private CodeAnalyeReader() {
    }

    // ================================
    // = Map<类名, ArrayList<方法名>> =
    // ================================

    /**
     * detail: Map 配置
     * @author Ttt
     */
    public static class MapConfig {

        // 方法注释缺少注释记录
        public final HashMap<String, ArrayList<String>> sMethodUnAnnotateMap = new HashMap<>();

        // 方法中参数未添加 final 记录
        public final HashMap<String, ArrayList<String>> sParamUnFinalMap = new HashMap<>();

        // 方法非 static 记录
        public final HashMap<String, ArrayList<String>> sMethodUnStaticMap = new HashMap<>();

        // 方法注释缺少 @param 记录
        public final HashMap<String, ArrayList<String>> sMethodLackParamMap = new HashMap<>();

        // 方法注释缺少 @return 记录
        public final HashMap<String, ArrayList<String>> sMethodLackReturnMap = new HashMap<>();

        // =

        // 方法存在 @param 但缺少注释记录
        public final HashMap<String, ArrayList<String>> sMethodUnAnnotateParamMap = new HashMap<>();

        // 方法存在 @return 但缺少注释记录
        public final HashMap<String, ArrayList<String>> sMethodUnAnnotateReturnMap = new HashMap<>();

        // =

        // 非 public 方法记录
        public final HashMap<String, ArrayList<String>> sMethodUnPublicMap = new HashMap<>();

        // 无修饰符变量 记录
        public final HashMap<String, ArrayList<String>> sNoModifierVariableMap = new HashMap<>();

        // 方法返回值 void 记录
        public final HashMap<String, ArrayList<String>> sMethodReturnVoidMap = new HashMap<>();
    }

    /**
     * 代码分析检测
     * @param path 文件夹路径
     * @return 返回分析检测后的记录 Map 集合
     */
    public static ArrayList<HashMap<String, ArrayList<String>>> codeAnalye(final String path) {
        return codeAnalye(Utils.getFileCatalogLists(path));
    }

    /**
     * 代码分析检测
     * @param listFiles 文件集合
     * @return 返回分析检测后的记录 Map 集合
     */
    public static ArrayList<HashMap<String, ArrayList<String>>> codeAnalye(final ArrayList<File> listFiles) {
        MapConfig mapConfig = new MapConfig();
        // 循环读取
        forReader(listFiles, mapConfig);
        // 返回结果
        ArrayList<HashMap<String, ArrayList<String>>> lists = new ArrayList<>();
        lists.add(mapConfig.sMethodUnAnnotateMap); // 方法注释缺少注释记录
        lists.add(mapConfig.sParamUnFinalMap); // 方法中参数未添加 final 记录
        lists.add(mapConfig.sMethodUnStaticMap); // 方法非 static 记录
        lists.add(mapConfig.sMethodLackParamMap); // 方法注释缺少 @param 记录
        lists.add(mapConfig.sMethodLackReturnMap); // 方法注释缺少 @return 记录
        lists.add(mapConfig.sMethodUnAnnotateParamMap); // 方法存在 @param 但缺少注释记录
        lists.add(mapConfig.sMethodUnAnnotateReturnMap); // 方法存在 @return 但缺少注释记录
        lists.add(mapConfig.sMethodUnPublicMap); // 非 public 方法记录
        lists.add(mapConfig.sNoModifierVariableMap); // 无修饰符变量 记录
        lists.add(mapConfig.sMethodReturnVoidMap); // 方法返回值 void 记录
        return lists;
    }

    // ================
    // = 内部处理方法 =
    // ================

    /**
     * 循环读取处理
     * @param lists     文件列表
     * @param mapConfig Map 配置
     */
    private static void forReader(final ArrayList<File> lists, final MapConfig mapConfig) {
        // 循环子文件
        for (File file : lists) {
            if (file.isDirectory()) {
                forReader(Utils.getFileCatalogLists(file.getAbsolutePath() + "/"), mapConfig);
            } else {
                CodeReader.readDoc(file.getAbsolutePath(), "", mapConfig);
            }
        }
    }

    // ==============
    // = 内部实现类 =
    // ==============

    /**
     * detail: 代码读取
     * @author Ttt
     */
    private static class CodeReader implements JavaDocReader.CallBack {

        MapConfig mapConfig;

        public CodeReader(MapConfig mapConfig) {
            this.mapConfig = mapConfig;
        }

        // ================
        // = 对外公开方法 =
        // ================

        /**
         * 读取文档处理
         * @param path      文件路径
         * @param className 文件名 ( 类名 )
         * @param mapConfig Map 配置
         * @return 处理后的文档信息
         */
        public static String readDoc(final String path, final String className, final MapConfig mapConfig) {
            // 执行参数, 生成 API readAll 设置为 false, 不读取 private、protected 等修饰符方法
            String[] executeParams = JavaDocReader.getExecuteParams(true, path, className);
            // 读取 class javaDoc 并返回文档信息
            return JavaDocReader.readDoc(new CodeReader(mapConfig), path, className, executeParams);
        }

        // ==========================
        // = JavaDocReader.CallBack =
        // ==========================

        /**
         * 回调通知
         * @param path      文件路径
         * @param className 文件名 ( 类名 )
         * @param rootDoc   根 Doc 信息
         * @param classDocs 类 Doc 信息
         * @return 处理后的文档信息
         */
        @Override
        public String callback(String path, String className, RootDoc rootDoc, ClassDoc[] classDocs) {
            if (classDocs != null) {
                // 循环 Class Doc 信息
                for (ClassDoc classDoc : classDocs) {
                    // 保存新的类名
                    className = classDoc.name();

                    //  专门用于忽略 接口、抽象类
                    // ========================
                    // 判断是否忽略该类
                    boolean isIgnoreClass = false;
                    // 类标记
                    String classTag = "";
                    // 反射获取 tree 变量
                    JCTree.JCClassDecl jcClassDecl = (JCTree.JCClassDecl) Reflect2Utils.getPropertyByParent(classDoc, "tree");
                    JCTree.JCModifiers jcModifiers = jcClassDecl.getModifiers();
                    if (jcModifiers != null) {
                        // 属于接口的则跳过
                        if (jcModifiers.toString().endsWith("interface ")) {
                            classTag = " [interface]";
                            isIgnoreClass = true;
                        } else if (jcModifiers.toString().endsWith("abstract ")) { // 属于抽象类的跳过
                            classTag = " [abstract]";
                            isIgnoreClass = true;
                        }
                    }
                    // ========================

                    // 判断是否存在无修饰符变量
                    String jcClassDeclStrings = jcClassDecl.toString();
                    if (jcClassDeclStrings != null) {
                        // 拆分处理
                        String[] splits = jcClassDeclStrings.split("\r\n");
                        // 进行判断处理
                        for (String str : splits) {
                            if (!StringUtils.isSpace(str)) {
                                if (ValidatorUtils.match("[ ]*[A-Za-z0-9\\<\\>\\[\\]]+ [A-Za-z0-9]+;", str)) {
                                    MapUtils.putToList(mapConfig.sNoModifierVariableMap, className, str);
                                }
                            }
                        }
                    }

//                    // 方便排查新的接口、抽象类处理
//                    isIgnoreClass = false;

                    // 循环读取方法信息
                    for (MethodDoc methodDoc : classDoc.methods()) {
                        // 属于枚举的 values 、valueOf 不处理
                        if (methodDoc.name().equals("values") ||
                                methodDoc.name().equals("valueOf")) {
                            continue;
                        }
                        // 获取方法名
                        String methodName = methodDoc.name();
                        // 获取方法注释
                        String methodAnnotate = methodDoc.commentText();

                        // 反射获取 tree 变量
                        JCTree.JCMethodDecl jcMethodDecl = (JCTree.JCMethodDecl) Reflect2Utils.getPropertyByParent(methodDoc, "tree");
                        // 反射获取方法参数
                        List<JCTree.JCVariableDecl> listJCVariableDecls = (List<JCTree.JCVariableDecl>) Reflect2Utils.getPropertyByParent(jcMethodDecl, "params");
                        // 获取方法全部注释 (含 @param)
                        String methodDocumentation = (String) Reflect2Utils.getPropertyByParent(methodDoc, "documentation");

                        // 获取方法代码
                        String methodCode = jcMethodDecl.toString();
                        // 判断是否 public 开头
                        boolean isPublic = methodCode.startsWith("public ");

                        // 如果方法名存在换行(注解)
                        if (methodCode.indexOf("\r\n") != -1) {
                            String[] methodCodeSplit = methodCode.split("\r\n");
                            for (String methodCodeStr : methodCodeSplit) {
                                if (methodCodeStr.indexOf(methodName) != -1) {
                                    if (methodCodeStr.startsWith("public ")) {
                                        isPublic = true;
                                    }
                                }
                            }
                        }
                        // 不属于 public 修饰符则记录
                        if (!isPublic) {
                            MapUtils.putToList(mapConfig.sMethodUnPublicMap, className, methodName);
                        }

                        //  专门用于判断方法是否 static 修饰
                        // ========================
                        // 不忽略才处理进行方法参数判断
                        if (!isIgnoreClass) {
                            // 判断方法是否存在 static 修饰符
                            if (jcMethodDecl != null) {
                                // 不存在则保存
                                if (jcMethodDecl.toString().indexOf("static ") == -1) {
                                    MapUtils.putToList(mapConfig.sMethodUnStaticMap, className + classTag, methodName);
                                }
                            }
                        }
                        // ========================

                        // 专门用于判断方法参数是否 final 修饰
                        // ========================
                        // 不忽略才处理进行方法参数判断
                        if (!isIgnoreClass) {
                            // 防止为 null
                            if (!CollectionUtils.isEmpty(listJCVariableDecls)) {
                                for (JCTree.JCVariableDecl jcVariableDecl : listJCVariableDecls) {
                                    jcModifiers = jcVariableDecl.getModifiers();
                                    if (jcModifiers != null) {
                                        if (jcModifiers.toString().endsWith("final ")) {
                                            // 存在 final 修饰
                                        } else {
                                            MapUtils.putToList(mapConfig.sParamUnFinalMap, className + classTag, methodName);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        // ========================

                        // 判断是否添加到 无注释 Map 中
                        boolean isUnAnnotate = false;
                        if (StringUtils.isEmpty(methodAnnotate)) {
                            MapUtils.putToList(mapConfig.sMethodUnAnnotateMap, className, methodName);
                            // 表示已经添加到 Map 中
                            isUnAnnotate = true;
                        }

                        // 专门用于判断方法参数是否都加了 @param、@return
                        // ========================
                        // 判断注释是否为 null
                        if (StringUtils.isEmpty(methodDocumentation)) { // 为 null, 表示没有注释, 需要特殊处理
                            // 没有添加, 才进行添加, 防止多次保存
                            if (!isUnAnnotate) {
                                MapUtils.putToList(mapConfig.sMethodUnAnnotateMap, className, methodName);
                            }
                        } else {
                            // 不存在 void, 表示有返回值
                            if (jcMethodDecl.toString().indexOf("void ") == -1) {
                                // 判断是否存在 @return, 不存在则记录
                                if (methodDocumentation.indexOf("@return") == -1) {
                                    MapUtils.putToList(mapConfig.sMethodLackReturnMap, className, methodName);
                                } else { // 存在则判断数量
                                    // 判断存在的数量
                                    int returnNumber = StringUtils.countMatches(methodDocumentation, "@return");
                                    if (returnNumber >= 2) {
                                        MapUtils.putToList(mapConfig.sMethodLackReturnMap, className, methodName + " - 多个 @return");
                                    } else {
                                        String[] splitReturn = methodDocumentation.replaceAll("\r\n", "").split("@return ");
                                        if (splitReturn.length == 1) {
                                            MapUtils.putToList(mapConfig.sMethodUnAnnotateReturnMap, className, methodName);
                                        }
                                    }
                                }
                            } else { // 无返回值
                                // 判断是否存在 @return, 存在则记录 => 属于 void 并不需要增加 @return
                                if (methodDocumentation.indexOf("@return") != -1) {
                                    MapUtils.putToList(mapConfig.sMethodLackReturnMap, className, methodName + " - 多余 @return");
                                } else { // 方法为 void
                                    MapUtils.putToList(mapConfig.sMethodReturnVoidMap, className, methodName + " - void");
                                }
                            }
                        }
                        // =
                        // 获取参数数量
                        int paramNumber = CollectionUtils.length(listJCVariableDecls);
                        // 判断注释是否为 null
                        if (StringUtils.isEmpty(methodDocumentation)) {
                            // 如果数量不为 0, 表示有参数
                            if (paramNumber != 0) {
                                MapUtils.putToList(mapConfig.sMethodLackParamMap, className, methodName);
                            }
                        } else {
                            // 参数校验处理
                            paramCheckHandler(mapConfig.sMethodLackParamMap, methodDocumentation,
                                    className, methodName, jcMethodDecl, listJCVariableDecls, mapConfig);
                        }
                        // ========================
                    }
                }
            }
            return null;
        }

        /**
         * 异常回调
         * @param e 异常信息
         */
        @Override
        public void error(Exception e) {
            System.out.println(e);
        }
    }

    // =======================
    // = 特殊处理 - 校验参数 =
    // =======================

    /**
     * 参数校验处理
     * @param map                 保存的 Map
     * @param methodDocumentation 方法注释
     * @param className           类名
     * @param methodName          方法名
     * @param jcMethodDecl        方法信息实体类
     * @param listJCVariableDecls 方法参数 List
     * @param mapConfig           Map 配置
     */
    private static void paramCheckHandler(final HashMap<String, ArrayList<String>> map,
                                          final String methodDocumentation,
                                          final String className,
                                          final String methodName,
                                          final JCTree.JCMethodDecl jcMethodDecl,
                                          final List<JCTree.JCVariableDecl> listJCVariableDecls,
                                          final MapConfig mapConfig) {
        // 泛型类型数组
        String[] genericityTypes = null;
        // 参数名
        String[] paramNames = null;

        // 获取方法代码
        String methodCode = jcMethodDecl.toString();
        // 判断是否 @ 开头, 表示存在注解
        if (methodCode.startsWith("\r\n@")) {
            String[] mods = jcMethodDecl.getModifiers().toString().split("\r\n");
            for (String mod : mods) {
                if (!StringUtils.isEmpty(mod) && mod.startsWith("@")) {
                    methodCode = methodCode.replace(mod, "");
                }
            }
        }
        // 去除换行代码
        methodCode = methodCode.replaceAll("\r\n", "").replaceAll("\n", "");
        // 获取 < 开始位置
        int startIndex = methodCode.indexOf("<");
        // 获取 > 结束位置
        int endIndex = methodCode.indexOf(">");
        // 获取方法 ( 位置
        int methodIndex = methodCode.indexOf("(");

        // 泛型处理
        // ========================
        // 判断是否可能存在泛型
        if (startIndex < endIndex && endIndex < methodIndex) { // < 位置小于 > 位置, 并且 > 位置小于 (
            // 进行裁剪获取类型
            String typeStr = methodCode.substring(startIndex + 1, endIndex);
            // 进行拆分处理
            genericityTypes = typeStr.split(",");

            // 防止泛型 extend 等处理
            for (int i = 0, len = ArrayUtils.length(genericityTypes); i < len; i++) {
                String genericity = genericityTypes[i];
                // 清空空格
                genericity = StringUtils.clearSpaceTrim(genericity);
                // 进行空格拆分
                String[] genericityArys = genericity.split(" ");
                // 保存新的内容
                genericityTypes[i] = genericityArys[0];
            }

            // =
            // 判断长度都是否为 1
            for (String type : genericityTypes) {
                if (type.length() != 1) { // 统一规范, 泛型一个字母标记, 长度不为 1 则重置为 null
                    genericityTypes = null;
                    break;
                }
            }
        }

        // 参数处理
        // ========================
        // 获取参数数量
        int paramNumber = CollectionUtils.length(listJCVariableDecls);
        // 防止数据为 null
        if (paramNumber != 0) {
            // 创建对应的数组
            paramNames = new String[paramNumber];
            // 循环遍历
            for (int i = 0; i < paramNumber; i++) {
                // 获取拆分后的数据
                String[] splits = listJCVariableDecls.get(i).toString().split(" ");
                // 获取最后一位
                paramNames[i] = splits[ArrayUtils.length(splits) - 1];
            }
        }

        // 处理泛型参数
        for (int i = 0, len = ArrayUtils.length(genericityTypes); i < len; i++) {
            genericityTypes[i] = "<" + genericityTypes[i] + ">";
        }

        // 最简单的对比处理, 就是直接拼接判断 @param xxx @param xxx
        // 既能判断参数顺序, 又能判断参数数量、参数字段名、泛型参数等

        StringBuffer buffer = new StringBuffer();
        // 合并参数
        String[] arrays = ArrayUtils.arraycopy(paramNames, genericityTypes);
        if (arrays != null) {
            // 循环拼接
            for (String param : arrays) {
                if (!StringUtils.isEmpty(param)) {
                    buffer.append("@param " + param + " ");
                }
            }
        }

        // 方法注释替换处理
        String documentation = methodDocumentation.replaceAll("\r\n", "")
                .replaceAll("\n", "");

        // 获取索引位置
        int paramStart = documentation.indexOf("@param ");
        // 进行裁剪处理
        if (paramStart != -1) {
            // 裁剪字符串 => @param xx 注释 @param xx 注释
            documentation = documentation.substring(paramStart, documentation.length());
            // 裁剪拼接后的数据
            String subparam = subparam(documentation).trim();
            // 判断是否存在
            String paramBuffer = buffer.toString().trim();
            // 注释拼接参数长度
            int subparamLen = subparam.length();
            // 拼接参数参数
            int paramBufferLen = paramBuffer.length();
            // 防止各自缺失、增多 - 自己计算的参数拼接 等于 通过注释拆分拼接的参数长度, 才符合条件
            if (subparamLen == paramBufferLen && paramBuffer.equals(subparam)) {
                // 数据一样, 才检测是否注释
                if (!subparamToCheckAnnotate(documentation)) {
                    // @param 不存在注释则保存
                    MapUtils.putToList(mapConfig.sMethodUnAnnotateParamMap, className, methodName);
                }
            } else {
                MapUtils.putToList(map, className, methodName);
            }
        } else { // 不存在注释, 那么参数也不存在才正常
            if (paramNumber != 0) { // 存在参数, 但没有注释
                MapUtils.putToList(map, className, methodName);
            }
        }
    }

    /**
     * 裁剪参数
     * @param documentation 注释内容
     * @return 返回裁剪字符串
     */
    private static String subparam(final String documentation) {
        StringBuilder builder = new StringBuilder();
        // 进行拆分处理
        String[] splits = documentation.split(" ");
        // 判断是否添加
        boolean isAdd = false;
        // 进行循环处理
        for (String str : splits) {
            if (!StringUtils.isEmpty(str)) {
                if (str.equals("@param")) {
                    builder.append("@param ");
                    isAdd = true;
                } else if (isAdd) {
                    builder.append(str + " ");
                    isAdd = false;
                }
            }
        }
        return builder.toString();
    }

    /**
     * 裁剪参数, 判断是否存在注释
     * @param documentation 注释内容
     * @return {@code true} yes, {@code false} no
     */
    private static boolean subparamToCheckAnnotate(String documentation) {
        StringBuilder builder = new StringBuilder();
        // 判断是否存在 返回值
        int index = documentation.indexOf("@return ");
        if (index != -1) {
            // 进行裁剪处理
            documentation = documentation.substring(0, index);
        }
        // 进行拆分处理
        String[] splits = documentation.split(" ");
        // 判断是否添加
        boolean isAdd = false;
        // 判断是否需要检测
        boolean isCheck = false;
        // 进行循环处理
        for (String str : splits) {
            if (!StringUtils.isEmpty(str)) {
                if (str.equals("@param")) {
                    builder.append("@param ");
                    isAdd = true;
                    if (isCheck) {
                        return false;
                    }
                } else if (isAdd) {
                    builder.append(str + " ");
                    isAdd = false;
                    isCheck = true;
                } else {
                    isCheck = false;
                }
            }
        }
        if (isCheck) {
            return false;
        }
        return true;
    }
}