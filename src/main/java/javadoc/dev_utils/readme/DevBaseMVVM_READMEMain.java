package javadoc.dev_utils.readme;

import java.io.File;
import java.util.HashMap;

import dev.utils.common.FileUtils;
import javadoc.dev_utils.ApiConfig;
import javadoc.dev_utils.assist.PackageCatalog;

/**
 * detail: 创建 README Main 方法
 * @author Ttt
 */
final class DevBaseMVVM_READMEMain {

    private DevBaseMVVM_READMEMain() {
    }

    /**
     * 创建 DevBaseMVVM - README 头部前缀
     * @param buffer       拼接 Buffer
     * @param path         文件路径
     * @param packageName  包名
     * @param mapCatalog   对应目录的注释
     * @param githubUrl    项目 github 链接
     * @param templatePath Readme 模板路径
     */
    private static void createREADMEHead(
            final StringBuffer buffer,
            final String path,
            final String packageName,
            final HashMap<String, String> mapCatalog,
            final String githubUrl,
            final String templatePath
    ) {
        // 不增加锚链接 -> 一级目录
        String catalog = PackageCatalog.apiCatalog(false, path, packageName, mapCatalog);

        // template readme content
        byte[] bytes           = FileUtils.readFileBytes(templatePath);
        String templateContent = new String(bytes);

        // 保存 README 内容
        buffer.append(String.format(
                templateContent, ApiConfig.DEV_BASE_MVVM_VERSION, catalog
        ));
    }

    /**
     * 创建 REAMDE 文件
     * @return Create Result
     */
    public static String createREADME() {
        // 包名
        final String packageName = ApiConfig.DEV_BASE_MVVM_PACKAGE;
        // 本地文件路径
        final String path = ApiConfig.DEV_BASE_MVVM_PATH;
        // Github 链接地址
        final String githubUrl = ApiConfig.DEV_BASE_MVVM_GITHUB_URL;

        // ===========
        // = 生成 API =
        // ===========

        // 最终的数据
        StringBuffer buffer = new StringBuffer();
        // 添加头部信息
        createREADMEHead(
                buffer, path, packageName, ApiConfig.sCatalogMap_BaseMVVM,
                githubUrl, ApiConfig.DEV_BASE_MVVM_TEMPLATE
        );

        // 保存合成后的 API REAMDE
        FileUtils.saveFile(new File(ApiConfig.DEV_BASE_MVVM_API_FILE_SAVE_PATH, ApiConfig.README_FILE_NAME).getAbsolutePath(),
                buffer.toString().getBytes());

        StringBuffer resultBuffer = new StringBuffer();
        resultBuffer.append("\n\n");
        resultBuffer.append("\n===================");
        resultBuffer.append("\n= 保存 JavaDoc 成功 =");
        resultBuffer.append("\n===================");
        resultBuffer.append("\n");
        resultBuffer.append("\n");
        resultBuffer.append("保存地址: " + ApiConfig.DEV_BASE_MVVM_API_FILE_SAVE_PATH + ApiConfig.README_FILE_NAME);
        resultBuffer.append("\n");
        return resultBuffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(DevBaseMVVM_READMEMain.createREADME());
    }
}