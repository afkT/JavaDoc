package javadoc.dev_utils.readme;

import java.io.File;

import dev.utils.common.FileUtils;
import javadoc.dev_utils.ApiConfig;

/**
 * detail: 创建 README Main 方法
 * @author Ttt
 */
final class DevEnvironment_READMEMain {

    private DevEnvironment_READMEMain() {
    }

    /**
     * 创建 README 文件
     * @return Create Result
     */
    public static String createREADME() {

        // ==============
        // = 生成 README =
        // ==============

        // template readme content
        byte[] bytes           = FileUtils.readFileBytes(ApiConfig.DEV_ENVIRONMENT_TEMPLATE);
        String templateContent = new String(bytes);
        // 保存 README 内容
        templateContent = templateContent.replaceAll("DEVersion", ApiConfig.DEV_ENVIRONMENT_VERSION);
        // 保存 DevEnvironment README.md 文件
        FileUtils.saveFile(
                new File(
                        ApiConfig.DEV_ENVIRONMENT_API_FILE_SAVE_PATH,
                        ApiConfig.README_FILE_NAME
                ).getAbsolutePath(), templateContent.getBytes()
        );

        StringBuilder resultBuilder = new StringBuilder();
        resultBuilder.append("\n\n");
        resultBuilder.append("\n===================");
        resultBuilder.append("\n= 保存 JavaDoc 成功 =");
        resultBuilder.append("\n===================");
        resultBuilder.append("\n");
        resultBuilder.append("\n");
        resultBuilder.append("保存地址: " + ApiConfig.DEV_ENVIRONMENT_API_FILE_SAVE_PATH + ApiConfig.README_FILE_NAME);
        resultBuilder.append("\n");
        return resultBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(DevEnvironment_READMEMain.createREADME());
    }
}