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
final class DevHttpCapture_READMEMain {

    private DevHttpCapture_READMEMain() {
    }

    /**
     * 创建 DevHttpCapture - README 头部前缀
     * @param buffer      拼接 Buffer
     * @param path        文件路径
     * @param packageName 包名
     * @param mapCatalog  对应目录的注释
     */
    private static void createREADMEHead(
            final StringBuffer buffer,
            final String path,
            final String packageName,
            final HashMap<String, String> mapCatalog
    ) {
        buffer.append("\n");
        buffer.append("## Gradle");

        buffer.append("\n\n");
        buffer.append("```java");
        buffer.append("\n");
        buffer.append("implementation 'io.github.afkt:DevHttpCapture:" + ApiConfig.DEV_HTTP_CAPTURE_VERSION + "'");
        buffer.append("\n");
        buffer.append("```");

        buffer.append("\n\n");
        buffer.append("## 目录结构");

        buffer.append("\n\n");
        // 不增加锚链接 -> 一级目录
        buffer.append(PackageCatalog.apiCatalog(false, path, packageName, mapCatalog));

        buffer.append("\n\n");
        buffer.append("## 使用");

        buffer.append("\n\n");
        buffer.append("> 该库主要对使用 Okhttp 网络请求库的项目，提供 Http 抓包功能，并支持抓包数据加密存储。");
        buffer.append("\n");
        buffer.append(">");
        buffer.append("\n");
        buffer.append("> **并且是以 Module ( ModuleName Key ) 为基础，支持组件化不同 Module 各自的抓包功能**，支持实时开关抓包功能、可控 Http 拦截过滤器。");
        buffer.append("\n");
        buffer.append(">");
        buffer.append("\n");
        buffer.append("> 内置两个 Http 抓包拦截器，CallbackInterceptor ( 无存储逻辑，进行回调通知 )、HttpCaptureInterceptor ( 存在存储抓包数据逻辑 )");

        buffer.append("\n\n");
        buffer.append("## 事项");

        buffer.append("\n\n");
        buffer.append("- 部分 API 更新不及时或有遗漏等，`具体以对应的工具类为准`");

        buffer.append("\n\n");
        buffer.append("- [检测代码规范、注释内容排版，API 文档生成](https://github.com/afkT/JavaDoc)");

        buffer.append("\n\n");
        buffer.append("- [Change Log](https://github.com/afkT/DevUtils/blob/master/lib/DevHttpCapture/CHANGELOG.md)");

        buffer.append("\n\n");
        buffer.append("## API");

        buffer.append("\n\n");
        // 增加锚链接 -> 二级目录
        buffer.append(PackageCatalog.apiCatalog(true, path, packageName, mapCatalog));

        buffer.append("\n\n");
    }

    /**
     * 创建 REAMDE 文件
     * @return Create Result
     */
    public static String createREADME() {
        // 包名
        final String packageName = ApiConfig.DEV_HTTP_CAPTURE_PACKAGE;
        // 本地文件路径
        final String path = ApiConfig.DEV_HTTP_CAPTURE_PATH;
        // Github 链接地址
        final String githubUrl = ApiConfig.DEV_HTTP_CAPTURE_GITHUB_URL;

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
        createREADMEHead(buffer, path, packageName, ApiConfig.sCatalogMap_HttpCapture);

        // 生成 API 目录
        String httpCaptureAPI = APIGenerate.apiGenerate("", path, packageName, githubUrl,
                ApiConfig.sFilterClassSet_HttpCapture, ApiConfig.sFilterMethodMap_HttpCapture, ApiConfig.sMethodNameRegex,
                methodNameMatchesMap, methodRepeatBuffer, methodNotAnnotateBuffer, notMethodBuffer);

        buffer.append(httpCaptureAPI);

        // 保存合成后的 API REAMDE
        FileUtils.saveFile(new File(ApiConfig.DEV_HTTP_CAPTURE_API_FILE_SAVE_PATH, ApiConfig.README_FILE_NAME).getAbsolutePath(),
                buffer.toString().getBytes());

//        // 方法名重复记录存储
//        Utils.saveFile(ApiConfig.DEV_HTTP_CAPTURE_API_FILE_SAVE_PATH, "readme_method_repeat_api.md", methodRepeatBuffer.toString());
//        // 方法没有注释记录存储
//        Utils.saveFile(ApiConfig.DEV_HTTP_CAPTURE_API_FILE_SAVE_PATH, "readme_method_not_annotate_api.md", methodNotAnnotateBuffer.toString());
//        // 类不存在方法记录存储
//        Utils.saveFile(ApiConfig.DEV_HTTP_CAPTURE_API_FILE_SAVE_PATH, "readme_not_method_api.md", notMethodBuffer.toString());

        StringBuffer resultBuffer = new StringBuffer();
        resultBuffer.append("\n\n");
        resultBuffer.append("\n===================");
        resultBuffer.append("\n= 保存 JavaDoc 成功 =");
        resultBuffer.append("\n===================");
        resultBuffer.append("\n");
        resultBuffer.append("\n");
        resultBuffer.append("保存地址: " + ApiConfig.DEV_HTTP_CAPTURE_API_FILE_SAVE_PATH + ApiConfig.README_FILE_NAME);
        resultBuffer.append("\n");
        return resultBuffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(DevHttpCapture_READMEMain.createREADME());
    }
}