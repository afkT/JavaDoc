package javadoc.dev_utils.check.function;

import java.io.File;
import java.util.LinkedHashSet;
import java.util.List;

import dev.utils.DevFinal;
import dev.utils.common.FileUtils;
import dev.utils.common.StringUtils;
import dev.utils.common.assist.search.FileDepthFirstSearchUtils;
import javadoc.dev_utils.ApiConfig;

/**
 * detail: Xml Encoding 追加处理
 * @author Ttt
 */
public final class CodeXmlEncoding {

    private static final LinkedHashSet<String> sSets       = new LinkedHashSet<>();
    // 开头
    private static final String                STARTS_WITH = "<?xml version=\"1.0\" encoding=\"utf-8\"?>";
    // 追加内容
    private static final String                APPEND      = STARTS_WITH + DevFinal.SYMBOL.NEW_LINE;
    // 文件后缀
    private static final String[]              SUFFIX      = {"xml"};

    public static void main(String[] args) {
        new FileDepthFirstSearchUtils()
                .setSearchHandler(new FileDepthFirstSearchUtils.SearchHandler() {
                    @Override
                    public boolean isHandlerFile(File file) {
                        return true;
                    }

                    @Override
                    public boolean isAddToList(File file) {
                        String absolutePath = file.getAbsolutePath();
                        if (Code.isHidden(absolutePath)) return false;
                        if (Code.isBuild(absolutePath)) return false;

                        String fileSuffix = FileUtils.getFileSuffix(file);
                        if (!StringUtils.isOrEquals(fileSuffix, SUFFIX)) {
                            return true;
                        }

                        String data = new String(FileUtils.readFileBytes(file)); // , "UTF-8"
                        if (!data.startsWith(STARTS_WITH)) {
                            // 删减内容
                            data = APPEND + data;
                            // 替换内容
                            FileUtils.saveFile(file.getAbsolutePath(), data.getBytes()); // "UTF-8"
                            // 存储路径
                            sSets.add(FileUtils.getAbsolutePath(file));
                        }
                        return true;
                    }

                    @Override
                    public void onEndListener(
                            List<FileDepthFirstSearchUtils.FileItem> lists,
                            long startTime,
                            long endTime
                    ) {
                        for (String path : sSets) {
                            System.out.println(path);
                        }
                        System.out.println("搜索结束");
                    }
                }).query(ApiConfig.DEV_UTILS_PROJECT_PATH, true);
    }
}