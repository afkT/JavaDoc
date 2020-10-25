package javadoc.dev_utils.check.function;

import dev.utils.common.FileIOUtils;
import dev.utils.common.FileUtils;
import dev.utils.common.StringUtils;
import javadoc.Utils;
import javadoc.dev_utils.ApiConfig;

import java.io.File;
import java.io.FileFilter;
import java.util.HashMap;
import java.util.List;

/**
 * detail: 代码重复换行检测
 * @author Ttt
 */
public final class CodeRepeatNewLineRemove {

    // 代码注释重复换行记录
    private static HashMap<String, List<String>> sAnnotationRepeatLineMap = new HashMap<>();

    // 忽略文件后缀
    private static final String[] SUFFIX = {"kt", "xml", "java", "gradle",};

    public static void main(String[] args) {
        // 获取文件列表
        List<File> lists = FileUtils.listFilesInDirWithFilter(ApiConfig.PROJECT_PATH, new FileFilter() {
            @Override
            public boolean accept(File file) {
                if (file.getAbsolutePath().indexOf("\\.") != -1) return false;
                if (file.getAbsolutePath().indexOf("\\build\\") != -1) return false;
                if (file.isDirectory()) return false;

                String fileSuffix = FileUtils.getFileSuffix(file);
                if (!StringUtils.isOrEquals(fileSuffix, SUFFIX)) return false;
                return true;
            }
        }, true);

        for (File file : lists) {
            readFile(file);
        }

        String json = Utils.toJsonFormat(sAnnotationRepeatLineMap, true);
        // 打印文件多余换行信息
        System.out.println(json);
    }

    /**
     * 读取文件
     * @param file 文件
     */
    private static void readFile(final File file) {
        // 读取文件内容
        List<String> lists = FileIOUtils.readFileToList(file, 0, Integer.MAX_VALUE);

        // 判断是否需要判断 重复出现情况
        boolean repeat = false;
        // 循环判断
        for (int i = 0, len = lists.size(); i < len; i++) {
            // 获取每一行代码
            String code = lists.get(i);
            // 判断是否 null
            boolean isSpace = StringUtils.isSpace(code);
            // 防止为 null
            if (!isSpace) {
                repeat = false; // 不需要判断重复
            } else {
                if (code != null && repeat) {
                    Utils.putToList(sAnnotationRepeatLineMap, file.getName(), (i + 1) + "");
                }
                // 表示需要检测重复
                repeat = true;
            }
        }
    }
}