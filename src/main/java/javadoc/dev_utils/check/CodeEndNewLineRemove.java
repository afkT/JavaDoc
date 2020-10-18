package javadoc.dev_utils.check;

import dev.utils.common.FileUtils;
import dev.utils.common.StringUtils;
import dev.utils.common.assist.search.FileDepthFirstSearchUtils;
import javadoc.dev_utils.ApiConfig;

import java.io.File;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * detail: 代码结尾换行移除
 * @author Ttt
 */
public final class CodeEndNewLineRemove {

    private static       LinkedHashSet<String> sSets            = new LinkedHashSet<>();
    // 结尾符合
    private static final String                SYMBOL           = ""; // }
    // 检查 Key
    private static final String                END_KEY          = SYMBOL + StringUtils.NEW_LINE_STR;
    // 追加内容
    private static final String                APPEND           = SYMBOL;
    // 忽略文件后缀
    private static final String[]              IGNORE_SUFFIX    = {"md", "txt", "bat"};
    // 是否忽略后缀
    private static final boolean               IS_IGNORE_SUFFIX = false;

    public static void main(String[] args) {
        new FileDepthFirstSearchUtils()
                .setSearchHandler(new FileDepthFirstSearchUtils.SearchHandler() {
                    @Override
                    public boolean isHandlerFile(File file) {
                        return true;
                    }

                    @Override
                    public boolean isAddToList(File file) {
                        if (file.getAbsolutePath().indexOf("\\.") != -1) return false;

                        String fileSuffix = FileUtils.getFileSuffix(file);
                        if (!IS_IGNORE_SUFFIX && StringUtils.isOrEquals(fileSuffix, IGNORE_SUFFIX)) {
                            return true;
                        }

                        String data = new String(FileUtils.readFileBytes(file));
                        if (data != null) {
                            if (data.endsWith(END_KEY)) {
                                // 删减内容
                                data = data.substring(0, data.length() - END_KEY.length()) + APPEND;
                                // 替换内容
                                FileUtils.saveFile(file.getAbsolutePath(), data.getBytes());
                                // 存储路径
                                sSets.add(FileUtils.getAbsolutePath(file));
                            }
                        }
                        return true;
                    }

                    @Override
                    public void OnEndListener(List<FileDepthFirstSearchUtils.FileItem> lists, long startTime, long endTime) {
                        for (String path : sSets) {
                            System.out.println(path);
                        }
                        System.out.println("搜索结束");
                    }
                }).query(ApiConfig.PROJECT_PATH, true);
    }
}