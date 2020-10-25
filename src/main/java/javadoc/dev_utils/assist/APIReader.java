package javadoc.dev_utils.assist;

import com.sun.javadoc.ClassDoc;
import com.sun.javadoc.MethodDoc;
import com.sun.javadoc.RootDoc;
import dev.utils.common.ArrayUtils;
import dev.utils.common.StringUtils;
import dev.utils.common.validator.ValidatorUtils;
import javadoc.api.JavaDocReader;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * detail: API(JavaDoc) 读取类
 * @author Ttt
 */
public final class APIReader implements JavaDocReader.CallBack {

    // 对应的类 Github 链接地址
    private String                             mClassGithubUrl;
    // 忽略不保存的方法
    private HashMap<String, String[]>          mFilterMethodMap;
    // 方法名匹配正则表达式
    private String                             mMethodNameRegex;
    // 方法名匹配存储 Map<类名, ArrayList<方法名>>
    private HashMap<String, ArrayList<String>> mMethodNameMatchesMap;
    // 方法名重复记录存储
    private StringBuffer                       mMethodRepeatBuffer;
    // 方法没有注释记录存储
    private StringBuffer                       mMethodNotAnnotateBuffer;
    // 类不存在方法记录存储
    private StringBuffer                       mNotMethodBuffer;

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
        if (mMethodRepeatBuffer == null) mMethodRepeatBuffer = new StringBuffer();
        if (mMethodNotAnnotateBuffer == null) mMethodNotAnnotateBuffer = new StringBuffer();
        if (mNotMethodBuffer == null) mNotMethodBuffer = new StringBuffer();
    }

    // =============
    // = 对外公开方法 =
    // =============

    /**
     * 读取文档处理
     * @param path                    文件路径
     * @param className               文件名 ( 类名 )
     * @param classGithubUrl          对应的类 Github 链接地址
     * @param filterMethodMap         忽略不保存方法 Map
     * @param methodNameRegex         方法名匹配正则表达式
     * @param methodNameMatchesMap    方法名匹配存储 Map
     * @param methodRepeatBuffer      方法名重复记录存储 Buffer
     * @param methodNotAnnotateBuffer 方法没有注释记录存储 Buffer
     * @param notMethodBuffer         类不存在方法记录存储 Buffer
     * @return 处理后的文档信息
     */
    public static String readDoc(final String path, final String className, final String classGithubUrl,
                                 final HashMap<String, String[]> filterMethodMap,
                                 final String methodNameRegex,
                                 final HashMap<String, ArrayList<String>> methodNameMatchesMap,
                                 final StringBuffer methodRepeatBuffer,
                                 final StringBuffer methodNotAnnotateBuffer,
                                 final StringBuffer notMethodBuffer) {
        // API 读取配置处理
        APIReader apiReader = new APIReader(classGithubUrl);
        apiReader.mFilterMethodMap = filterMethodMap;
        apiReader.mMethodNameRegex = methodNameRegex;
        apiReader.mMethodNameMatchesMap = methodNameMatchesMap;
        apiReader.mMethodRepeatBuffer = methodRepeatBuffer;
        apiReader.mMethodNotAnnotateBuffer = methodNotAnnotateBuffer;
        apiReader.mNotMethodBuffer = notMethodBuffer;
        apiReader.init(); // 初始化防止为 null
        // 执行参数, 生成 API readAll 设置为 false, 不读取 private、protected 等修饰符方法
        String[] executeParams = JavaDocReader.getExecuteParams(false, path, className);
        // 读取 class javaDoc 并返回文档信息
        return JavaDocReader.readDoc(apiReader, path, className, executeParams);
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
        // 长度为 0, 则不处理
        if (classDocs.length == 0) return "";

        // 最终返回数据
        StringBuffer finalBuffer = new StringBuffer();
        finalBuffer.append("\n\n");

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
        } catch (Exception e) {
        }
        // 格式化标题 - 替换 %s 为类注释
        finalBuffer.append(String.format(title, classAnnotate));
        // 拼接方法、注释 Table 语法
        finalBuffer.append("\n\n| 方法 | 注释 |");
        //finalBuffer.append("\n| :-: | :-: |"); // 居中
        finalBuffer.append("\n| :- | :- |"); // 左对齐
        // ========================

        // 临时存储 Buffer
        StringBuffer tempBuffer = new StringBuffer();
        // 保存开头
        tempBuffer.append(finalBuffer);

        // 循环 Class Doc 信息
        for (int i = 0, len = classDocs.length; i < len; ++i) {
            // 循环 Method Doc 信息
            for (MethodDoc method : classDocs[i].methods()) {
                // 属于枚举的 values 、valueOf 不处理
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
                    mMethodNotAnnotateBuffer.append("\n" + className + " - " + methodName);
                }

                // ========================
                // 方法名正则表达式匹配处理
                if (ValidatorUtils.match(mMethodNameRegex, methodName)) {
                    ArrayList<String> listMatchs = mMethodNameMatchesMap.get(className);
                    if (listMatchs == null) {
                        listMatchs = new ArrayList<>();
                        mMethodNameMatchesMap.put(className, listMatchs);
                    }
                    // 追加匹配的方法名数据
                    listMatchs.add(methodName);
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
                            int annotateln = methodAnnotate.indexOf("\n");
                            // 如果存在换行
                            if (annotateln != -1) { // 把注释换行的直接不要
                                methodAnnotate = methodAnnotate.split("\n")[0];
                            }
                        }
                        // 保存方法名、方法注释
                        finalBuffer.append("\n| " + methodName + " | " + methodAnnotate + " |");
                        // 进行保存过滤字段
                        methodNameMap.put(methodName, methodName);
                    } else {
                        // 表示方法存在重复的
                        isMethodRepeat = true;
                        // 保存重复的数据
                        tempBuffer.append("\n| " + methodName + " | " + methodAnnotate + " |");
                    }
                }
                // ========================
            }
        }

        // 判断是否存在方法
        if (methodNameMap.size() != 0) {
            // 存在重复的数据才处理
            if (isMethodRepeat) mMethodRepeatBuffer.append(tempBuffer);
        } else { // 该类没有任何方法
            mNotMethodBuffer.append(tempBuffer);
            // 不存在方法数据, 则不处理
            return "";
        }
        // 返回数据
        return finalBuffer.toString();
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