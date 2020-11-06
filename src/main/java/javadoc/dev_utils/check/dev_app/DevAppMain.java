package javadoc.dev_utils.check.dev_app;

import dev.utils.common.ArrayUtils;
import dev.utils.common.ConvertUtils;
import javadoc.dev_utils.ApiConfig;
import javadoc.dev_utils.check.dev.CheckInfo;
import javadoc.dev_utils.check.dev.CheckMain;
import javadoc.dev_utils.check.dev.ICheckConfig;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * detail: 代码读取检测分析 Main 方法
 * @author Ttt
 */
public class DevAppMain {

    public static void main(String[] args) {
        // 检测路径
        String path = ApiConfig.DEV_APP_PATH + "utils/";
        // 代码检测分析配置接口
        ICheckConfig iCheckConfig = new DevAppConfig();
        // 是否覆盖文件内容
        boolean coverText = ConvertUtils.toBoolean(ArrayUtils.get(args, 0), CheckInfo.COVER_TEXT);
        // 是否使用 List<File>
        boolean isLists = false;
        // 检测指定文件集合
        List<File> listFiles = new ArrayList<>();
        // 是否打印方法返回值 void 记录
        boolean isPrintVoid = false;
        // 是否需要生成 Config
        boolean generateConfig = ConvertUtils.toBoolean(ArrayUtils.get(args, 1));

        // 执行检测
        CheckMain.execute(DevAppMain.class, new CheckInfo(path, iCheckConfig)
                .setCoverText(coverText)
                .setLists(isLists)
                .setListFiles(listFiles)
                .setPrintVoid(isPrintVoid)
                .setGenerateConfig(generateConfig)
                .setIgnoreAnnotationSpaceSet("AliasMethod.java", "Base64.java")
        );
    }
}