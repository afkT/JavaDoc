package javadoc.dev_utils.check;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import javadoc.Utils;
import javadoc.dev_utils.check.dev_app.DevAppMain;
import javadoc.dev_utils.check.dev_assist.DevAssistMain;
import javadoc.dev_utils.check.dev_deprecated.DevDeprecatedMain;
import javadoc.dev_utils.check.dev_other.DevOtherMain;
import javadoc.dev_utils.check.dev_widget.DevWidgetMain;

/**
 * detail: 统一检测 Dev 模块 
 * @author Ttt
 */
public class DevMain {

    public static void main(String[] args) {

        boolean coverText      = true;
        boolean generateConfig = true;

        // 检测结果
        LinkedHashMap<String, LinkedHashMap<String, HashMap<String, List<String>>>> maps = new LinkedHashMap<>();
        maps.put("DevAppMain", DevAppMain.checker(coverText, generateConfig));
        maps.put("DevAssistMain", DevAssistMain.checker(coverText, generateConfig));
        maps.put("DevWidgetMain", DevWidgetMain.checker(coverText, generateConfig));
        maps.put("DevDeprecatedMain", DevDeprecatedMain.checker(coverText, generateConfig));
        maps.put("DevOtherMain", DevOtherMain.checker(coverText, generateConfig));

        // 转换 JSON 数据
        String mapJSON = Utils.toJsonFormat(maps, true);
        System.out.println(mapJSON);
    }
}