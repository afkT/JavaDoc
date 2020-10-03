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

    private static LinkedHashSet<String> sSets = new LinkedHashSet<>();

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
                    if (data.endsWith("}" + StringUtils.NEW_LINE_STR)) {
                        String path = FileUtils.getAbsolutePath(file);
                        sSets.add(path);
                    }
                }
                return true;
            }

            @Override
            public void OnEndListener(List<FileDepthFirstSearchUtils.FileItem> lists, long startTime, long endTime) {
                for (String path : sSets) {
                    System.out.println(path);
                }
                System.out.println("搜索结束了");
            }
        });
        utils.query(ApiConfig.PROJECT_PATH, true);
    }
}