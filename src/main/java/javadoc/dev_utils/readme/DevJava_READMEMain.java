package javadoc.dev_utils.readme;

import dev.utils.common.FileUtils;
import javadoc.dev_utils.ApiConfig;
import javadoc.dev_utils.assist.APIGenerate;
import javadoc.dev_utils.assist.PackageCatalog;

import java.io.File;
import java.util.HashMap;
import java.util.List;

/**
 * detail: 创建 README Main 方法
 * @author Ttt
 */
final class DevJava_READMEMain {

    private DevJava_READMEMain() {
    }

    /**
     * 创建 DevUtils - README 头部前缀
     * @param buffer      拼接 Buffer
     * @param path        文件路径
     * @param packageName 包名
     * @param mapCatelog  对应目录的注释
     */
    private static void createREADMEHead(final StringBuffer buffer, final String path, final String packageName,
                                         final HashMap<String, String> mapCatelog) {
        buffer.append("\n");
        buffer.append("## Gradle");

        buffer.append("\n\n");
        buffer.append("```java");
        buffer.append("\n");
        buffer.append("implementation 'com.afkt:DevJava:" + ApiConfig.DEV_JAVA_VERSION + "'");
        buffer.append("\n");
        buffer.append("```");

        buffer.append("\n\n");
        buffer.append("## 目录结构");

        buffer.append("\n\n");
        // 不增加锚链接 -> 一级目录
        buffer.append(PackageCatalog.apiCatalog(false, path, packageName, mapCatelog));

        buffer.append("\n\n");
        buffer.append("## 事项");

        buffer.append("\n\n");
        buffer.append("- 该工具类不依赖 android api，属于 Java 工具类库");

        buffer.append("\n\n");
        buffer.append("- 开启日志");
        buffer.append("\n");
        buffer.append("```java");
        buffer.append("\n");
        buffer.append("// 打开 lib 内部日志 - 线上 (release) 环境，不调用方法");
        buffer.append("\n");
        buffer.append("JCLogUtils.setPrintLog(true);");
        buffer.append("\n");
        buffer.append("// 控制台打印日志");
        buffer.append("\n");
        buffer.append("JCLogUtils.setControlPrintLog(true);");
        buffer.append("\n");
        buffer.append("// 设置 Java 模块日志信息监听");
        buffer.append("\n");
        buffer.append("JCLogUtils.setPrint(new JCLogUtils.Print() {});");
        buffer.append("\n");
        buffer.append("```");

        buffer.append("\n\n");
        buffer.append("- 部分 API 更新不及时或有遗漏等，`具体以对应的工具类为准`");

        buffer.append("\n\n");
        buffer.append("- [检测代码规范、注释内容排版，API 文档生成](https://github.com/afkT/JavaDoc)");

        buffer.append("\n\n");
        buffer.append("## API");

        buffer.append("\n\n");
        // 增加锚链接 -> 二级目录
        buffer.append(PackageCatalog.apiCatalog(true, path, packageName, mapCatelog));

        buffer.append("\n\n");
    }

    /**
     * 创建 REAMDE 文件
     * @return Create Result
     */
    public static String createREADME() {
        // 包名
        final String packageName = ApiConfig.DEV_PACKAGE;
        // 本地文件路径
        final String path = ApiConfig.DEV_JAVA_UTILS_PATH;
        // Github 链接地址
        final String githubUrl = ApiConfig.DEV_JAVA_GITHUB_URL;

        // 方法名匹配存储 Map<类名, List<方法名>>
        final HashMap<String, List<String>> methodNameMatchesMap = new HashMap<>();
        // 方法名重复记录存储
        final StringBuffer methodRepeatBuffer = new StringBuffer();
        // 方法没有注释记录存储
        final StringBuffer methodNotAnnotateBuffer = new StringBuffer();
        // 类不存在方法记录存储
        final StringBuffer notMethodBuffer = new StringBuffer();

        // ===========
        // = 生成 API =
        // ===========

        // 最终的数据
        StringBuffer buffer = new StringBuffer();
        // 添加头部信息
        createREADMEHead(buffer, path, packageName, ApiConfig.sCatelogMap);

        // 生成 dev.utils.common 包下 dev.utils
        String commonAPI = APIGenerate.apiGenerate("common", path, packageName, githubUrl,
                ApiConfig.sFilterClassMap, ApiConfig.sFilterMethodMap, ApiConfig.sMethodNameRegex,
                methodNameMatchesMap, methodRepeatBuffer, methodNotAnnotateBuffer, notMethodBuffer);

        buffer.append(commonAPI);

        // 保存合成后的 API REAMDE
        FileUtils.saveFile(new File(ApiConfig.DEV_JAVA_API_FILE_SAVE_PATH, ApiConfig.README_FILE_NAME).getAbsolutePath(),
                buffer.toString().getBytes());

//        // 方法名重复记录存储
//        Utils.saveFile(ApiConfig.DEV_JAVA_API_FILE_SAVE_PATH, "readme_method_repeat_api.md", methodRepeatBuffer.toString());
//        // 方法没有注释记录存储
//        Utils.saveFile(ApiConfig.DEV_JAVA_API_FILE_SAVE_PATH, "readme_method_not_annotate_api.md", methodNotAnnotateBuffer.toString());
//        // 类不存在方法记录存储
//        Utils.saveFile(ApiConfig.DEV_JAVA_API_FILE_SAVE_PATH, "readme_not_method_api.md", notMethodBuffer.toString());

        StringBuffer resultBuffer = new StringBuffer();
        resultBuffer.append("\n\n");
        resultBuffer.append("\n=====================");
        resultBuffer.append("\n= 保存 JavaDoc 成功 =");
        resultBuffer.append("\n=====================");
        resultBuffer.append("\n");
        resultBuffer.append("\n");
        resultBuffer.append("保存地址: " + ApiConfig.DEV_JAVA_API_FILE_SAVE_PATH + ApiConfig.README_FILE_NAME);
        resultBuffer.append("\n");
        return resultBuffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(DevJava_READMEMain.createREADME());
    }
}