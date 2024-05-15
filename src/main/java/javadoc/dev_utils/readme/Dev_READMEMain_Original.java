package javadoc.dev_utils.readme;

import dev.utils.common.FileUtils;
import javadoc.dev_utils.ApiConfig;

import java.io.File;

/**
 * detail: 创建 README Main 方法
 * @author Ttt
 */
final class Dev_READMEMain_Original {

    private Dev_READMEMain_Original() {
    }

    /**
     * 创建 README 文件
     * @return Create Result
     */
    public static String createREADME() {
        StringBuilder builder = new StringBuilder();
        // template readme content
        byte[] bytes           = FileUtils.readFileBytes(ApiConfig.DEV_UTILS_README_ORIGINAL);
        String templateContent = new String(bytes);

        // 格式化 README 全部版本内容
        builder.append(ApiConfig.formatAllVersion(templateContent));

        // 保存 README
        FileUtils.saveFile(
                new File(
                        ApiConfig.DEV_UTILS_README_FILE_SAVE_PATH,
                        ApiConfig.README_FILE_NAME_ORIGINAL
                ).getAbsolutePath(), builder.toString().getBytes()
        );

        StringBuilder resultBuilder = new StringBuilder();
        resultBuilder.append("\n");
        resultBuilder.append("\n==================");
        resultBuilder.append("\n= 保存 Readme 成功 =");
        resultBuilder.append("\n==================");
        resultBuilder.append("\n");
        resultBuilder.append("\n");
        resultBuilder.append("保存地址: " + ApiConfig.DEV_UTILS_README_FILE_SAVE_PATH + ApiConfig.README_FILE_NAME_ORIGINAL);
        resultBuilder.append("\n");
        return resultBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(Dev_READMEMain_Original.createREADME());
    }
}