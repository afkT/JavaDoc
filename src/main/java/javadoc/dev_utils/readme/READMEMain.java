package javadoc.dev_utils.readme;

/**
 * detail: 创建 README
 * @author Ttt
 */
final class READMEMain {

    private READMEMain() {
    }

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append(Dev_READMEMain.createREADME());
        builder.append(DevApp_READMEMain.createREADME());
        builder.append(DevAssist_READMEMain.createREADME());
        builder.append(DevBase_READMEMain.createREADME());
        builder.append(DevBaseMVVM_READMEMain.createREADME());
        builder.append(DevEngine_READMEMain.createREADME());
        builder.append(DevHttpCapture_READMEMain.createREADME());
        builder.append(DevHttpCaptureCompiler_READMEMain.createREADME());
        builder.append(DevHttpManager_READMEMain.createREADME());
        builder.append(DevJava_READMEMain.createREADME());
        builder.append(DevOther_READMEMain.createREADME());
        builder.append(DevRetrofit_READMEMain.createREADME());
        builder.append(DevWidget_READMEMain.createREADME());
        builder.append(DevEnvironment_READMEMain.createREADME());
        print(builder.toString());
    }

    /**
     * 输出信息
     * @param str str info
     */
    private static void print(final String str) {
        new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (Exception ignored) {
            }
            System.out.println(str);
        }).start();
    }
}