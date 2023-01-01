package javadoc.dev_utils.assist;

import com.sun.javadoc.ClassDoc;
import com.sun.javadoc.MethodDoc;
import com.sun.javadoc.RootDoc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import dev.utils.common.ArrayUtils;
import dev.utils.common.StringUtils;
import dev.utils.common.validator.ValidatorUtils;
import javadoc.api.JavaDocReader;

/**
 * detail: API(JavaDoc) 读取类
 * @author Ttt
 */
public final class APIReader
        implements JavaDocReader.Callback {

    // 对应的类 Github 链接地址
    private final String                        mClassGithubUrl;
    // 忽略不保存的方法
    private       HashMap<String, String[]>     mFilterMethodMap;
    // 方法名匹配正则表达式
    private       String                        mMethodNameRegex;
    // 方法名匹配存储 Map<类名, List<方法名>>
    private       HashMap<String, List<String>> mMethodNameMatchesMap;
    // 方法名重复记录存储
    private       StringBuilder                 mMethodRepeatBuilder;
    // 方法没有注释记录存储
    private       StringBuilder                 mMethodNotAnnotateBuilder;
    // 类不存在方法记录存储
    private       StringBuilder                 mNotMethodBuilder;

    /**
     * 构造函数
     * @param classGithubUrl 类 Github 链接地址
     */
    private APIReader(String classGithubUrl) {
        this.mClassGithubUrl = classGithubUrl;
    }

    /**
     * 初始化处理
     */
    private void init() {
        if (mFilterMethodMap == null) mFilterMethodMap = new HashMap<>();
        if (mMethodNameMatchesMap == null) mMethodNameMatchesMap = new HashMap<>();
        if (mMethodRepeatBuilder == null) mMethodRepeatBuilder = new StringBuilder();
        if (mMethodNotAnnotateBuilder == null) mMethodNotAnnotateBuilder = new StringBuilder();
        if (mNotMethodBuilder == null) mNotMethodBuilder = new StringBuilder();
    }

    // =============
    // = 对外公开方法 =
    // =============

    /**
     * 读取文档处理
     * @param path                     文件路径
     * @param className                文件名 ( 类名 )
     * @param classGithubUrl           对应的类 Github 链接地址
     * @param filterMethodMap          忽略不保存方法 Map
     * @param methodNameRegex          方法名匹配正则表达式
     * @param methodNameMatchesMap     方法名匹配存储 Map
     * @param methodRepeatBuilder      方法名重复记录存储 Builder
     * @param methodNotAnnotateBuilder 方法没有注释记录存储 Builder
     * @param notMethodBuilder         类不存在方法记录存储 Builder
     * @return 处理后的文档信息
     */
    public static String readDoc(
            final String path,
            final String className,
            final String classGithubUrl,
            final HashMap<String, String[]> filterMethodMap,
            final String methodNameRegex,
            final HashMap<String, List<String>> methodNameMatchesMap,
            final StringBuilder methodRepeatBuilder,
            final StringBuilder methodNotAnnotateBuilder,
            final StringBuilder notMethodBuilder
    ) {
        // API 读取配置处理
        APIReader apiReader = new APIReader(classGithubUrl);
        apiReader.mFilterMethodMap          = filterMethodMap;
        apiReader.mMethodNameRegex          = methodNameRegex;
        apiReader.mMethodNameMatchesMap     = methodNameMatchesMap;
        apiReader.mMethodRepeatBuilder      = methodRepeatBuilder;
        apiReader.mMethodNotAnnotateBuilder = methodNotAnnotateBuilder;
        apiReader.mNotMethodBuilder         = notMethodBuilder;
        apiReader.init(); // 初始化防止为 null
        // 执行参数, 生成 API readAll 设置为 false, 不读取 private、protected 等修饰符方法
        String[] executeParams = JavaDocReader.getExecuteParams(false, path, className);
        // 读取 class javaDoc 并返回文档信息
        return JavaDocReader.readDoc(apiReader, path, className, executeParams);
    }

    // ==========================
    // = JavaDocReader.Callback =
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
    public String callback(
            String path,
            String className,
            RootDoc rootDoc,
            ClassDoc[] classDocs
    ) {
        // 长度为 0, 则不处理
        if (classDocs.length == 0) return "";

        // 最终返回数据
        StringBuilder finalBuilder = new StringBuilder();
        finalBuilder.append("\n\n");

        // 判断是否存在重复的方法名
        boolean isMethodRepeat = false;
        // 方法去重 Map
        HashMap<String, String> methodNameMap = new HashMap<>();
        // 获取需要过滤的方法
        String[] filterMethods = mFilterMethodMap.get(className);

        // ========================
        // 拼接标题 => * **类注释 ->** [类名](该类 Github 链接地址)
        String title = "\n* **%s ->** [" + className + "](" + mClassGithubUrl + ")";
        // 获取类注释
        String classAnnotate = classDocs[0].commentText();
        try {
            int ln = classAnnotate.indexOf("\n");
            // 进行拆分处理
            classAnnotate = classAnnotate.substring("detail:".length(), ln == -1 ? classAnnotate.length() : ln);
            // 去掉前后空格
            classAnnotate = StringUtils.clearSpaceTrim(classAnnotate);
        } catch (Exception ignored) {
        }
        // 格式化标题 - 替换 %s 为类注释
        finalBuilder.append(String.format(title, classAnnotate));
        // 拼接方法、注释 Table 语法
        finalBuilder.append("\n\n| 方法 | 注释 |");
        //finalBuilder.append("\n| :-: | :-: |"); // 居中
        finalBuilder.append("\n| :- | :- |"); // 左对齐
        // ========================

        // 临时存储 Builder
        StringBuilder tempBuilder = new StringBuilder();
        // 保存开头
        tempBuilder.append(finalBuilder);

        // 循环 Class Doc 信息
        for (ClassDoc classDoc : classDocs) {
            // 循环 Method Doc 信息
            for (MethodDoc method : classDoc.methods()) {
                // 属于枚举的 values、valueOf 不处理
                if (method.name().equals("values") ||
                        method.name().equals("valueOf")) {
                    continue;
                }

                // 获取方法名
                String methodName = method.name();
                // 获取方法注释
                String methodAnnotate = method.commentText();

                // 如果方法没有注释, 则进行记录
                if (StringUtils.isEmpty(methodAnnotate)) {
                    mMethodNotAnnotateBuilder.append("\n" + className + " - " + methodName);
                }

                // ========================
                // 方法名正则表达式匹配处理
                if (ValidatorUtils.match(mMethodNameRegex, methodName)) {
                    List<String> listMatch = mMethodNameMatchesMap.get(className);
                    if (listMatch == null) {
                        listMatch = new ArrayList<>();
                        mMethodNameMatchesMap.put(className, listMatch);
                    }
                    // 追加匹配的方法名数据
                    listMatch.add(methodName);
                }
                // ========================

                // ========================
                // 判断是否过滤方法
                boolean isFilterMethod = false;
                // 获取过滤方法数组长度
                int filterMethodAryLength = ArrayUtils.length(filterMethods, 0);
                // 判断是否过滤
                if (filterMethodAryLength != 0) {
                    for (int index = 0; index < filterMethodAryLength; index++) {
                        // 进行判断处理
                        if (ArrayUtils.equals(filterMethods[index], methodName)) {
                            // 表示需要过滤
                            isFilterMethod = true;
                            break;
                        }
                    }
                }
                // ========================

                // ========================
                // 不过滤才处理该方法
                if (!isFilterMethod) {
                    if (methodNameMap.get(methodName) == null) {
                        // 如果注释为 null, 则设置方法名为注释
                        if (StringUtils.isEmpty(methodAnnotate)) {
                            methodAnnotate = methodName;
                        } else {
                            // 判断方法注释是否存在换行
                            int annotateLn = methodAnnotate.indexOf("\n");
                            // 如果存在换行
                            if (annotateLn != -1) { // 把注释换行的直接不要
                                methodAnnotate = methodAnnotate.split("\n")[0];
                            }
                        }
//                        // 方法注释进行括号追加空格处理
//                        methodAnnotate = methodAnnotate.replaceAll("\\(", " ( ")
//                                .replaceAll("\\)", " ) ")
//                                .replaceAll("  ", " ")
//                                .replaceAll("  ", " ")
//                                .replaceAll(" \\( \\)", "()");
//                        methodAnnotate = StringUtils.clearSpaceTabLineTrim(methodAnnotate);

                        // 保存方法名、方法注释
                        finalBuilder.append("\n| " + methodName + " | " + methodAnnotate + " |");
                        // 进行保存过滤字段
                        methodNameMap.put(methodName, methodName);
                    } else {
                        // 表示方法存在重复的
                        isMethodRepeat = true;
                        // 保存重复的数据
                        tempBuilder.append("\n| " + methodName + " | " + methodAnnotate + " |");
                    }
                }
                // ========================
            }
        }

        // 判断是否存在方法
        if (methodNameMap.size() != 0) {
            // 存在重复的数据才处理
            if (isMethodRepeat) mMethodRepeatBuilder.append(tempBuilder);
        } else { // 该类没有任何方法
            mNotMethodBuilder.append(tempBuilder);
            // 不存在方法数据, 则不处理
            return "";
        }
        // 返回数据
        return finalBuilder.toString();
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