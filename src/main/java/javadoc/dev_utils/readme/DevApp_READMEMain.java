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
final class DevApp_READMEMain {

    private DevApp_READMEMain() {
    }

    /**
     * 创建 DevUtils - README 头部前缀
     * @param buffer      拼接 Buffer
     * @param path        文件路径
     * @param packageName 包名
     * @param mapCatalog  对应目录的注释
     */
    private static void createREADMEHead(final StringBuffer buffer, final String path, final String packageName,
                                         final HashMap<String, String> mapCatalog) {
        buffer.append("\n");
        buffer.append("## Gradle");

        buffer.append("\n\n");
        buffer.append("```java");
        buffer.append("\n");
        buffer.append("// Android ( 1.9.4 以后只更新 AndroidX )");
        buffer.append("\n");
        buffer.append("//implementation 'com.afkt:DevApp:1.9.4'");
        buffer.append("\n\n");
        buffer.append("// AndroidX");
        buffer.append("\n");
        buffer.append("implementation 'com.afkt:DevAppX:" + ApiConfig.DEV_APP_VERSION + "'");
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
        buffer.append("> ##### ~~只需要在 Application 中调用 `DevUtils.init()` 进行初始化~~ , 在 DevUtils FileProviderDevApp 中已初始化 , 无需主动调用");

        buffer.append("\n\n");
        buffer.append("## 事项");

        buffer.append("\n\n");
        buffer.append("- 内部存在两个日志工具类 ( 工具类内部调用 )，对外使用 [DevLogger](https://github.com/afkT/DevUtils/blob/master/lib/DevApp/utils_readme/logger/DevLogger.md)");

        buffer.append("\n\n");
        buffer.append("```java");
        buffer.append("\n");
        buffer.append("// 整个工具类内部日志信息，都通过以下两个工具类输出打印，并且通过 DevUtils.openLog() 控制开关");
        buffer.append("\n");
        buffer.append("\n");
        buffer.append("// dev.utils.app - APP 日志打印工具类");
        buffer.append("\n");
        buffer.append("LogPrintUtils");
        buffer.append("\n");
        buffer.append("// dev.utils.common - Java Common 日志打印工具类");
        buffer.append("\n");
        buffer.append("JCLogUtils");
        buffer.append("\n");
        buffer.append("```");

        buffer.append("\n\n");
        buffer.append("- 开启日志");
        buffer.append("\n");
        buffer.append("```java");
        buffer.append("\n");
        buffer.append("// 打开 lib 内部日志 - 线上 (release) 环境，不调用方法");
        buffer.append("\n");
        buffer.append("DevUtils.openLog();");
        buffer.append("\n");
        buffer.append("// 标示 debug 模式");
        buffer.append("\n");
        buffer.append("DevUtils.openDebug();");
        buffer.append("\n");
        buffer.append("```");

        buffer.append("\n\n");
        buffer.append("- 如果出现 ```Failed to resolve: DevAppX-x.x.x``` 可在根目录 build.gradle 添加");
        buffer.append("\n");
        buffer.append("```java");
        buffer.append("\n");
        buffer.append("allprojects {");
        buffer.append("\n");
        buffer.append("    repositories {");
        buffer.append("\n");
        buffer.append("        // bintray maven 出现 Failed to resolve: DevAppX-x.x.x 可考虑加上这句");
        buffer.append("\n");
        buffer.append("        maven { url 'https://dl.bintray.com/afkt/maven' }");
        buffer.append("\n");
        buffer.append("    }");
        buffer.append("\n");
        buffer.append("}");
        buffer.append("\n");
        buffer.append("```");

        buffer.append("\n\n");
        buffer.append("- 工具类部分模块配置与使用 - [Use and Config](https://github.com/afkT/DevUtils/blob/master/lib/DevApp/utils_readme/USE_CONFIG.md)");

        buffer.append("\n\n");
        buffer.append("- 部分 API 更新不及时或有遗漏等，`具体以对应的工具类为准`");

        buffer.append("\n\n");
        buffer.append("- [检测代码规范、注释内容排版，API 文档生成](https://github.com/afkT/JavaDoc)");

        buffer.append("\n\n");
        buffer.append("- [Change Log](https://github.com/afkT/DevUtils/blob/master/lib/DevApp/CHANGELOG.md)");

        buffer.append("\n\n");
        buffer.append("- [View 链式调用快捷设置 Helper 类](https://github.com/afkT/DevUtils/blob/master/lib/DevApp/src/main/java/dev/utils/app/helper/ViewHelper.java)");

        buffer.append("\n\n");
        buffer.append("- [Dev 工具类链式调用 Helper 类](https://github.com/afkT/DevUtils/blob/master/lib/DevApp/src/main/java/dev/utils/app/helper/DevHelper.java)");

        buffer.append("\n\n");
        buffer.append("- [Android 版本适配 Helper 类](https://github.com/afkT/DevUtils/blob/master/lib/DevApp/src/main/java/dev/utils/app/helper/VersionHelper.java)");

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
        final String packageName = ApiConfig.DEV_PACKAGE;
        // 本地文件路径
        final String path = ApiConfig.DEV_APP_UTILS_PATH;
        // Github 链接地址
        final String githubUrl = ApiConfig.DEV_APP_GITHUB_URL;

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
        createREADMEHead(buffer, path, packageName, ApiConfig.sCatalogMap);

        // 生成 dev.utils.app 包下 dev.utils
        String appAPI = APIGenerate.apiGenerate("app", path, packageName, githubUrl,
                ApiConfig.sFilterClassSet, ApiConfig.sFilterMethodMap, ApiConfig.sMethodNameRegex,
                methodNameMatchesMap, methodRepeatBuffer, methodNotAnnotateBuffer, notMethodBuffer);

        // 生成 dev.utils.common 包下 dev.utils
        String commonAPI = APIGenerate.apiGenerate("common", path, packageName, githubUrl,
                ApiConfig.sFilterClassSet, ApiConfig.sFilterMethodMap, ApiConfig.sMethodNameRegex,
                methodNameMatchesMap, methodRepeatBuffer, methodNotAnnotateBuffer, notMethodBuffer);

        buffer.append(appAPI);
        buffer.append("\n\n");
        buffer.append(commonAPI);

        // 保存合成后的 API REAMDE
        FileUtils.saveFile(new File(ApiConfig.DEV_APP_API_FILE_SAVE_PATH, ApiConfig.README_FILE_NAME).getAbsolutePath(),
                buffer.toString().getBytes());

//        // 方法名重复记录存储
//        Utils.saveFile(ApiConfig.DEV_APP_API_FILE_SAVE_PATH, "readme_method_repeat_api.md", methodRepeatBuffer.toString());
//        // 方法没有注释记录存储
//        Utils.saveFile(ApiConfig.DEV_APP_API_FILE_SAVE_PATH, "readme_method_not_annotate_api.md", methodNotAnnotateBuffer.toString());
//        // 类不存在方法记录存储
//        Utils.saveFile(ApiConfig.DEV_APP_API_FILE_SAVE_PATH, "readme_not_method_api.md", notMethodBuffer.toString());

        StringBuffer resultBuffer = new StringBuffer();
        resultBuffer.append("\n\n");
        resultBuffer.append("\n=====================");
        resultBuffer.append("\n= 保存 JavaDoc 成功 =");
        resultBuffer.append("\n=====================");
        resultBuffer.append("\n");
        resultBuffer.append("\n");
        resultBuffer.append("保存地址: " + ApiConfig.DEV_APP_API_FILE_SAVE_PATH + ApiConfig.README_FILE_NAME);
        resultBuffer.append("\n");
        return resultBuffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(DevApp_READMEMain.createREADME());
    }
}