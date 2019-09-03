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
        builder.append(DevApp_READMEMain.createREADME());
        builder.append(DevAssist_READMEMain.createREADME());
        builder.append(DevJava_READMEMain.createREADME());
        print(builder.toString());
    }

    /**
     * 输出信息
     * @param str str info
     */
    private static void print(final String str) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
                System.out.println(str);
            }
        }).start();
    }
}
