package javadoc.dev_utils.check.function;

import dev.utils.common.FileUtils;
import dev.utils.common.StringUtils;
import javadoc.dev_utils.ApiConfig;
import javadoc.dev_utils.check.dev.CodeAnnotationAnalyzeRecord;

import java.io.File;
import java.io.FileFilter;
import java.util.List;

/**
 * detail: 代码重复换行检测
 * @author Ttt
 */
public final class CodePanguAnalyze {

    // 匹配文件后缀
    private static final String[] SUFFIX = {"kt", "java", "gradle", "md", "txt", "properties", "pro"};

    public static void main(String[] args) {
        // 获取文件列表
        List<File> lists = FileUtils.listFilesInDirWithFilter(ApiConfig.PROJECT_PATH, new FileFilter() {
            @Override
            public boolean accept(File file) {
                String absolutePath = file.getAbsolutePath();
                if (Code.isHidden(absolutePath)) return false;
                if (Code.isBuild(absolutePath)) return false;

                String fileSuffix = FileUtils.getFileSuffix(file);
                return StringUtils.isOrEquals(fileSuffix, SUFFIX);
            }
        }, true);
        // 代码分析检测
        CodeAnnotationAnalyzeRecord.codeAnalyze(lists, true);
        System.out.println("代码分析结束");
    }
}