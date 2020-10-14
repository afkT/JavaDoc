package javadoc.dev_utils.check;

import dev.utils.common.FileUtils;
import dev.utils.common.StringUtils;
import dev.utils.common.assist.search.FileDepthFirstSearchUtils;
import javadoc.dev_utils.ApiConfig;

import java.io.File;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * detail: 代码换行移除
 * @author Ttt
 */
public final class CodeNewLineRemove {

    private static       LinkedHashSet<String> sSets   = new LinkedHashSet<>();
    // 检查 Key
    private static final String                END_KEY = "}" + StringUtils.NEW_LINE_STR;
    // 追加内容
    private static final String                APPEND  = "}";

    public static void main(String[] args) {
        FileDepthFirstSearchUtils utils = new FileDepthFirstSearchUtils();
        utils.setSearchHandler(new FileDepthFirstSearchUtils.SearchHandler() {
            @Override
            public boolean isHandlerFile(File file) {
                return true;
            }

            @Override
            public boolean isAddToList(File file) {
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
        });
        utils.query(ApiConfig.PROJECT_PATH, true);
    }
}