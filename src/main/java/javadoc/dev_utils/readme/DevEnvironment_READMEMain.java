package javadoc.dev_utils.readme;

import dev.utils.common.FileUtils;
import javadoc.dev_utils.ApiConfig;

import java.io.File;

/**
 * detail: 创建 README Main 方法
 * @author Ttt
 */
final class DevEnvironment_READMEMain {

    private DevEnvironment_READMEMain() {
    }

    /**
     * 创建 REAMDE 文件
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
                new File(ApiConfig.DEV_ENVIRONMENT_API_FILE_SAVE_PATH, ApiConfig.README_FILE_NAME).getAbsolutePath(),
                templateContent.getBytes()
        );

        StringBuffer resultBuffer = new StringBuffer();
        resultBuffer.append("\n\n");
        resultBuffer.append("\n===================");
        resultBuffer.append("\n= 保存 JavaDoc 成功 =");
        resultBuffer.append("\n===================");
        resultBuffer.append("\n");
        resultBuffer.append("\n");
        resultBuffer.append("保存地址: " + ApiConfig.DEV_ENVIRONMENT_API_FILE_SAVE_PATH + ApiConfig.README_FILE_NAME);
        resultBuffer.append("\n");
        return resultBuffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(DevEnvironment_READMEMain.createREADME());
    }
}