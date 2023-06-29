package javadoc.dev_utils.readme;

import java.io.File;
import java.text.MessageFormat;

import dev.utils.common.FileUtils;
import javadoc.dev_utils.ApiConfig;

/**
 * detail: 创建 README Main 方法
 * @author Ttt
 */
final class Dev_READMEMain_API {

    private Dev_READMEMain_API() {
    }

    /**
     * 创建 README 文件
     * @return Create Result
     */
    public static String createREADME() {
        StringBuilder builder = new StringBuilder();
        // template readme content
        byte[] bytes           = FileUtils.readFileBytes(ApiConfig.DEV_UTILS_README_API);
        String templateContent = new String(bytes);

        // 保存 README 内容
        builder.append(MessageFormat.format(
                // MessageFormat 会移除单引号, 所以需要加上双引号处理
                templateContent.replaceAll("'", "''"),
                ApiConfig.DEV_APP_VERSION,
                ApiConfig.DEV_APP_VERSION,
                ApiConfig.DEV_ASSIST_VERSION,
                ApiConfig.DEV_BASE_VERSION,
                ApiConfig.DEV_BASE_MVVM_VERSION,
                ApiConfig.DEV_ENGINE_VERSION,
                ApiConfig.DEV_HTTP_CAPTURE_VERSION,
                ApiConfig.DEV_HTTP_CAPTURE_VERSION,
                ApiConfig.DEV_HTTP_CAPTURE_VERSION,
                ApiConfig.DEV_HTTP_MANAGER_VERSION,
                ApiConfig.DEV_RETROFIT_VERSION,
                ApiConfig.DEV_WIDGET_VERSION,
                ApiConfig.DEV_ENVIRONMENT_VERSION,
                ApiConfig.DEV_ENVIRONMENT_VERSION,
                ApiConfig.DEV_ENVIRONMENT_VERSION,
                ApiConfig.DEV_ENVIRONMENT_VERSION,
                ApiConfig.DEV_JAVA_VERSION
        ));

        // 保存 README
        FileUtils.saveFile(
                new File(
                        ApiConfig.DEV_UTILS_README_FILE_SAVE_PATH,
                        ApiConfig.README_FILE_NAME_API
                ).getAbsolutePath(), builder.toString().getBytes()
        );

        StringBuilder resultBuilder = new StringBuilder();
        resultBuilder.append("\n");
        resultBuilder.append("\n==================");
        resultBuilder.append("\n= 保存 Readme 成功 =");
        resultBuilder.append("\n==================");
        resultBuilder.append("\n");
        resultBuilder.append("\n");
        resultBuilder.append("保存地址: " + ApiConfig.DEV_UTILS_README_FILE_SAVE_PATH + ApiConfig.README_FILE_NAME_API);
        resultBuilder.append("\n");
        return resultBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(Dev_READMEMain_API.createREADME());
    }
}