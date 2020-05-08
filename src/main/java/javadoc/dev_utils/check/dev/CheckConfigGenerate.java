package javadoc.dev_utils.check.dev;

import dev.utils.common.FileUtils;
import dev.utils.common.StringUtils;

/**
 * detail: CheckConfig 文件生成
 * @author Ttt
 */
public class CheckConfigGenerate {

    private final static String FORMAT_STR;
    // 项目目录
    public static final String USER_DIR = System.getProperty("user.dir");
    // 包目录
    public static final String PAGE_DIP = USER_DIR + "\\src\\main\\java\\javadoc\\dev_utils\\check\\";
    // 当前文件目录
    public static final String FILE_DIP = PAGE_DIP + "dev\\";

    static {
        byte[] bytes = FileUtils.readFileBytes(FILE_DIP + "\\format.txt");
        FORMAT_STR = new String(bytes);
    }

    /**
     * 格式化处理
     * @param replace 是否替换
     * @param clazz   {@link Class}
     * @param mapStr  map 校验字符串
     */
    public static void format(boolean replace, final Class clazz, final String[] mapStr) {
        String className = clazz.getSimpleName();
        // 类名
        className = className.substring(0, className.indexOf("Main"));
        // 包名
        String packageName = "dev_" + className.substring(3, className.length()).toLowerCase();
        // 格式化处理
        format(replace, packageName, className, mapStr);
    }

    /**
     * 格式化处理
     * @param replace     是否替换
     * @param packageName 包名
     * @param className   类名
     * @param mapStr      map 校验字符串
     */
    private static void format(final boolean replace, final String packageName,
                               final String className, final String[] mapStr) {
        String format = StringUtils.getFormatString(FORMAT_STR, packageName, className, className, mapStr);
        // 判断是否替换
        if (replace) {
            FileUtils.saveFile(PAGE_DIP + "\\" + packageName,
                    className + "Config.java", format);
        }
    }
}
