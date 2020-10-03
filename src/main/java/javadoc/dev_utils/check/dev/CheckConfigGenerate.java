package javadoc.dev_utils.check.dev;

import dev.utils.common.ArrayUtils;
import dev.utils.common.FileUtils;
import dev.utils.common.StringUtils;
import javadoc.Utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * detail: CheckConfig 文件生成
 * @author Ttt
 */
public class CheckConfigGenerate {

    // 格式化内容
    private static final String FORMAT_STR;
    // 项目目录
    private static final String USER_DIR = System.getProperty("user.dir");
    // 包目录
    private static final String PAGE_DIP = USER_DIR + "\\src\\main\\java\\javadoc\\dev_utils\\check\\";
    // 当前文件目录
    private static final String FILE_DIP = PAGE_DIP + "dev\\";

    static {
        byte[] bytes = FileUtils.readFileBytes(FILE_DIP + "\\format.txt");
        FORMAT_STR = new String(bytes);
    }

    /**
     * 格式化处理
     * @param clazz                    {@link Class}
     * @param mapStr                   map 校验字符串
     * @param ignoreAnnotationSpaceSet 忽略注释间距异常文件 Set
     */
    public static void format(final Class clazz, final String[] mapStr,
                              final Set<String> ignoreAnnotationSpaceSet) {
        String className = clazz.getSimpleName();
        // 类名
        className = className.substring(0, className.indexOf("Main"));
        // 包名
        String packageName = "dev_" + className.substring(3, className.length()).toLowerCase();
        // 格式化处理
        format(packageName, className, mapStr, ignoreAnnotationSpaceSet);
    }

    /**
     * 格式化处理
     * @param packageName              包名
     * @param className                类名
     * @param mapStr                   map 校验字符串
     * @param ignoreAnnotationSpaceSet 忽略注释间距异常文件 Set
     */
    private static void format(final String packageName, final String className, final String[] mapStr,
                               final Set<String> ignoreAnnotationSpaceSet) {
        List<String> lists = new ArrayList<>();
        lists.add(packageName);
        lists.add(className + "Config");
        lists.add(className + "Config");
        lists.addAll(ArrayUtils.asList(mapStr));
        lists.add(Utils.generateSetString(ignoreAnnotationSpaceSet, "map"));
        String format = StringUtils.getFormatString(FORMAT_STR, lists.toArray());
        // 生成 Config
        FileUtils.saveFile(new File(PAGE_DIP + "\\" + packageName,
                className + "Config.java").getAbsolutePath(), format.getBytes());
    }
}