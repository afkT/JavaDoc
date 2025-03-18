package javadoc.dev_utils.check.function;

import java.io.File;
import java.io.FileFilter;
import java.util.List;

import dev.utils.common.FileUtils;
import dev.utils.common.StringUtils;
import javadoc.dev_utils.ApiConfig;
import javadoc.dev_utils.check.dev.CodeAnnotationAnalyzeRecord;

/**
 * detail: 代码、注释间距规范检测
 * @author Ttt
 */
public final class CodePanguAnalyze {

    // 匹配文件后缀
    private static final String[] SUFFIX = {"kt", "java", "gradle", "md", "txt", "properties", "pro"};

    public static void main(String[] args) {
        // ApiConfig.DEV_UTILS_PROJECT_PATH
        // ApiConfig.DEV_COMPONENT_PROJECT_PATH
        // 获取文件列表
        List<File> lists = FileUtils.listFilesInDirWithFilter(ApiConfig.DEV_UTILS_PROJECT_PATH, new FileFilter() {
            @Override
            public boolean accept(File file) {
                String absolutePath = file.getAbsolutePath();
                if (Code.isHidden(absolutePath)) return false;
                // 如果检测 DevComponent 可考虑注释该句代码, 并单独校验 gradle 后缀
                // 例: file/gradle/build/config/xxx.gradle
                if (Code.isBuild(absolutePath)) return false;

                String fileSuffix = FileUtils.getFileSuffix(file);
                return StringUtils.isOrEquals(fileSuffix, SUFFIX);
            }
        }, true);
        // 代码分析检测
        new CodeAnnotationAnalyzeRecord().codeAnalyze(lists, true);
        System.out.println("代码分析结束");
    }
}