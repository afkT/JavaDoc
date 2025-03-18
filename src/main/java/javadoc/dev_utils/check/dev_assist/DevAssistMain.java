package javadoc.dev_utils.check.dev_assist;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import dev.utils.common.ArrayUtils;
import dev.utils.common.ConvertUtils;
import javadoc.Utils;
import javadoc.dev_utils.ApiConfig;
import javadoc.dev_utils.check.dev.CheckInfo;
import javadoc.dev_utils.check.dev.CheckMain;
import javadoc.dev_utils.check.dev.ICheckConfig;

/**
 * detail: 代码读取检测分析 Main 方法 
 * @author Ttt
 */
public final class DevAssistMain {

    private DevAssistMain() {
    }

    /**
     * 检测方法 
     * @param coverText      是否覆盖文件内容
     * @param generateConfig 是否需要生成 Config
     * @return 检测结果 HashMap
     */
    public static LinkedHashMap<String, HashMap<String, List<String>>> checker(
            boolean coverText,
            boolean generateConfig
    ) {
        // 检测路径
        String path = ApiConfig.DEV_ASSIST_PATH;
        // 代码检测分析配置接口
        ICheckConfig iCheckConfig = new DevAssistConfig();
        // 是否使用 List<File>
        boolean isLists = false;
        // 检测指定文件集合
        List<File> listFiles = new ArrayList<>();
        // 是否打印方法返回值 void 记录
        boolean isPrintVoid = false;

        // 执行检测
        return CheckMain.execute(DevAssistMain.class, new CheckInfo(path, iCheckConfig)
                .setCoverText(coverText)
                .setLists(isLists)
                .setListFiles(listFiles)
                .setPrintVoid(isPrintVoid)
                .setGenerateConfig(generateConfig)
        );
    }

    public static void main(String[] args) {
        // 是否覆盖文件内容
        boolean coverText = ConvertUtils.toBoolean(ArrayUtils.get(args, 0));
        // 是否需要生成 Config
        boolean generateConfig = ConvertUtils.toBoolean(ArrayUtils.get(args, 1));

        // 执行检测方法
        LinkedHashMap<String, HashMap<String, List<String>>> printMap = checker(coverText, generateConfig);
        // 转换 JSON 数据
        String mapJSON = Utils.toJsonFormat(printMap, true);
        System.out.println(mapJSON);
    }
}