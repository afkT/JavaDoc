package javadoc.dev_utils.check;

import dev.utils.common.FileIOUtils;
import dev.utils.common.FileUtils;
import dev.utils.common.StringUtils;
import javadoc.Utils;
import other.Pangu;

import java.io.File;
import java.util.HashMap;
import java.util.List;

/**
 * detail: 代码注释读取检测分析
 * @author Ttt
 */
public final class CodeAnnotationAnalyzeRecord {

    private CodeAnnotationAnalyzeRecord() {
    }

    // 代码间距等规范处理
    private static final Pangu   sPangu = new Pangu();
    // 判断是否覆盖文件内容
    private static       boolean sCoverText;

    // ===================
    // = Map<类名, 类代码> =
    // ===================

    // 代码注释空格间距异常记录
    private static HashMap<String, String> sAnnotationSpaceMap = new HashMap<>();

    // 代码注释重复换行记录
    private static HashMap<String, List<String>> sAnnotationRepeatLineMap = new HashMap<>();

    /**
     * 代码分析检测
     * @param path      文件夹路径
     * @param coverText 是否覆盖内容
     * @return 返回分析检测后的记录 Map 集合
     */
    public static HashMap<String, String> codeAnalyze(final String path, final boolean coverText) {
        return codeAnalyze(Utils.getFileCatalogLists(path), coverText);
    }

    /**
     * 代码分析检测
     * @param listFiles 文件集合
     * @param coverText 是否覆盖内容
     * @return 返回分析检测后的记录 Map 集合
     */
    public static HashMap<String, String> codeAnalyze(final List<File> listFiles, final boolean coverText) {
        sCoverText = coverText;
        forReader(listFiles);
        return sAnnotationSpaceMap;
    }

    // =============
    // = 内部处理方法 =
    // =============

    /**
     * 循环读取处理
     * @param lists 文件列表
     */
    private static void forReader(final List<File> lists) {
        // 循环子文件
        for (File file : lists) {
            if (file.isDirectory()) {
                forReader(Utils.getFileCatalogLists(file.getAbsolutePath() + "/"));
            } else {
                // = 慎用, 需要仔细对比部分代码差异化, 如 " " 会被替换成 "" 等 =
                // 读取文件内容
                String text = FileIOUtils.readFileToString(file, null);
                // 处理后的代码
                String newText = sPangu.spacingText(text);
                newText = sPangu.spacingText(newText); // 多次处理
                // 判断一样
                if (!newText.equals(text)) {
                    sAnnotationSpaceMap.put(file.getName(), newText);
                    // 不一样才覆盖
                    if (sCoverText) {
                        FileUtils.saveFile(file.getAbsolutePath(), newText.getBytes());
                    }
                }
                // =

                // 读取文件
                readFile(file);
            }
        }
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

    // =============
    // = 外部获取方法 =
    // =============

    /**
     * 代码注释重复换行记录
     * @return {@link HashMap}
     */
    public static HashMap<String, List<String>> getAnnotationRepeatLineMap() {
        return sAnnotationRepeatLineMap;
    }
}