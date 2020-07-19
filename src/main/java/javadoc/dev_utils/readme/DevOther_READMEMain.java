package javadoc.dev_utils.readme;

import dev.utils.common.FileUtils;
import javadoc.dev_utils.ApiConfig;
import javadoc.dev_utils.assist.APIGenerate;
import javadoc.dev_utils.assist.PackageCatalog;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * detail: 创建 README Main 方法
 * @author Ttt
 */
final class DevOther_READMEMain {

    private DevOther_READMEMain() {
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
        buffer.append("\n\n");
        buffer.append("## 目录结构");

        buffer.append("\n\n");
        // 不增加锚链接 -> 一级目录
        buffer.append(PackageCatalog.apiCatalog(false, path, packageName, mapCatelog));

        buffer.append("\n\n");
        buffer.append("## Use");

        buffer.append("\n\n");
        buffer.append("> 直接 copy 所需要的类到项目中使用");
        buffer.append("\n");

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
        final String packageName = ApiConfig.DEV_OTHER_PACKAGE;
        // 本地文件路径
        final String path = ApiConfig.DEV_OTHER_PATH;
        // Github 链接地址
        final String githubUrl = ApiConfig.DEV_OTHER_GITHUB_URL;

        // 方法名匹配存储 Map<类名, ArrayList<方法名>>
        final HashMap<String, ArrayList<String>> methodNameMatchesMap = new HashMap<>();
        // 方法名重复记录存储
        final StringBuffer methodRepeatBuffer = new StringBuffer();
        // 方法没有注释记录存储
        final StringBuffer methodNotAnnotateBuffer = new StringBuffer();
        // 类不存在方法记录存储
        final StringBuffer notMethodBuffer = new StringBuffer();

        // ============
        // = 生成 API =
        // ============

        // 最终的数据
        StringBuffer buffer = new StringBuffer();
        // 添加头部信息
        createREADMEHead(buffer, path, packageName, ApiConfig.sCatelogMap_Other);

        // 生成 dev 包下
        String otherAPI = APIGenerate.apiGenerate("", path, packageName, githubUrl,
                ApiConfig.sFilterClassMap_Other, ApiConfig.sFilterMethodMap_Other, ApiConfig.sMethodNameRegex,
                methodNameMatchesMap, methodRepeatBuffer, methodNotAnnotateBuffer, notMethodBuffer);

        buffer.append(otherAPI);

        // 保存合成后的 API REAMDE
        FileUtils.saveFile(new File(ApiConfig.DEV_OTHER_API_FILE_SAVE_PATH, ApiConfig.README_FILE_NAME).getAbsolutePath(),
                buffer.toString().getBytes());

//        // 方法名重复记录存储
//        Utils.saveFile(ApiConfig.DEV_OTHER_API_FILE_SAVE_PATH, "readme_method_repeat_api.md", methodRepeatBuffer.toString());
//        // 方法没有注释记录存储
//        Utils.saveFile(ApiConfig.DEV_OTHER_API_FILE_SAVE_PATH, "readme_method_not_annotate_api.md", methodNotAnnotateBuffer.toString());
//        // 类不存在方法记录存储
//        Utils.saveFile(ApiConfig.DEV_OTHER_API_FILE_SAVE_PATH, "readme_not_method_api.md", notMethodBuffer.toString());

        StringBuffer resultBuffer = new StringBuffer();
        resultBuffer.append("\n\n");
        resultBuffer.append("\n=====================");
        resultBuffer.append("\n= 保存 JavaDoc 成功 =");
        resultBuffer.append("\n=====================");
        resultBuffer.append("\n");
        resultBuffer.append("\n");
        resultBuffer.append("保存地址: " + ApiConfig.DEV_OTHER_API_FILE_SAVE_PATH + ApiConfig.README_FILE_NAME);
        resultBuffer.append("\n");
        return resultBuffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(DevOther_READMEMain.createREADME());
    }
}
