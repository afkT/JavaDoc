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
        System.out.println(builder.toString());
    }
}
