package javadoc.dev_utils.check.dev_standard;

import javadoc.dev_utils.ApiConfig;
import javadoc.dev_utils.check.dev.CheckInfo;
import javadoc.dev_utils.check.dev.CheckMain;
import javadoc.dev_utils.check.dev.ICheckConfig;

import java.io.File;
import java.util.ArrayList;

/**
 * detail: 代码读取检测分析 Main 方法
 * @author Ttt
 */
class DevStandardMain {

    public static void main(String[] args) {
        // 检测路径
        String path = ApiConfig.DEV_STANDARD_PATH;
        // 代码检测分析配置接口
        ICheckConfig iCheckConfig = new DevStandardConfig();
        // 是否覆盖文件内容
        boolean coverText = true;
        // 是否使用 ArrayList<File>
        boolean isLists = false;
        // 检测指定文件集合
        ArrayList<File> listFiles = new ArrayList<>();
        // 是否打印方法返回值 void 记录
        boolean isPrintVoid = false;

        // 执行检测
        CheckMain.execute(DevStandardMain.class, new CheckInfo(path, iCheckConfig)
                .setCoverText(coverText)
                .setLists(isLists)
                .setListFiles(listFiles)
                .setPrintVoid(isPrintVoid)
        );
    }
}
