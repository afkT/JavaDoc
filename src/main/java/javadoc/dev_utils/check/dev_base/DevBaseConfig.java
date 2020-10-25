package javadoc.dev_utils.check.dev_base;

import javadoc.Utils;
import javadoc.dev_utils.check.dev.ICheckConfig;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * detail: DevBaseConfig 代码检测分析配置
 * @author Ttt
 */
final class DevBaseConfig implements ICheckConfig {

    /**
     * 获取忽略指定方法注释配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreAnnotateMap() {
        Map<String, List<String>> ignoreAnnotateMap = new HashMap<>();

        return ignoreAnnotateMap;
    }

    /**
     * 获取忽略指定方法参数 final 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreFinalMap() {
        Map<String, List<String>> ignoreFinalMap = new HashMap<>();

        return ignoreFinalMap;
    }

    /**
     * 获取忽略指定方法 static 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreStaticMap() {
        Map<String, List<String>> ignoreStaticMap = new HashMap<>();

        return ignoreStaticMap;
    }

    /**
     * 获取忽略指定方法 @param 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreParamMap() {
        Map<String, List<String>> ignoreParamMap = new HashMap<>();

        return ignoreParamMap;
    }

    /**
     * 获取忽略指定方法 @return 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreReturnMap() {
        Map<String, List<String>> ignoreReturnMap = new HashMap<>();

        return ignoreReturnMap;
    }

    /**
     * 获取忽略指定方法非 public 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreUnPublicMap() {
        Map<String, List<String>> ignoreUnPublicMap = new HashMap<>();
        ignoreUnPublicMap.put("ILogEngine", Utils.asList("isPrintLog", "d", "e", "e", "e", "w", "i", "v", "wtf", "json", "xml", "dTag", "eTag", "eTag", "eTag", "wTag", "iTag", "vTag", "wtfTag", "jsonTag", "xmlTag", "isPrintLog", "d", "e", "e", "e", "w", "i", "v", "wtf", "json", "xml", "dTag", "eTag", "eTag", "eTag", "wTag", "iTag", "vTag", "wtfTag", "jsonTag", "xmlTag", "isPrintLog", "d", "e", "e", "e", "w", "i", "v", "wtf", "json", "xml", "dTag", "eTag", "eTag", "eTag", "wTag", "iTag", "vTag", "wtfTag", "jsonTag", "xmlTag", "isPrintLog", "d", "e", "e", "e", "w", "i", "v", "wtf", "json", "xml", "dTag", "eTag", "eTag", "eTag", "wTag", "iTag", "vTag", "wtfTag", "jsonTag", "xmlTag", "isPrintLog", "d", "e", "e", "e", "w", "i", "v", "wtf", "json", "xml", "dTag", "eTag", "eTag", "eTag", "wTag", "iTag", "vTag", "wtfTag", "jsonTag", "xmlTag", "isPrintLog", "d", "e", "e", "e", "w", "i", "v", "wtf", "json", "xml", "dTag", "eTag", "eTag", "eTag", "wTag", "iTag", "vTag", "wtfTag", "jsonTag", "xmlTag", "isPrintLog", "d", "e", "e", "e", "w", "i", "v", "wtf", "json", "xml", "dTag", "eTag", "eTag", "eTag", "wTag", "iTag", "vTag", "wtfTag", "jsonTag", "xmlTag", "isPrintLog", "d", "e", "e", "e", "w", "i", "v", "wtf", "json", "xml", "dTag", "eTag", "eTag", "eTag", "wTag", "iTag", "vTag", "wtfTag", "jsonTag", "xmlTag", "isPrintLog", "d", "e", "e", "e", "w", "i", "v", "wtf", "json", "xml", "dTag", "eTag", "eTag", "eTag", "wTag", "iTag", "vTag", "wtfTag", "jsonTag", "xmlTag", "isPrintLog", "d", "e", "e", "e", "w", "i", "v", "wtf", "json", "xml", "dTag", "eTag", "eTag", "eTag", "wTag", "iTag", "vTag", "wtfTag", "jsonTag", "xmlTag", "isPrintLog", "d", "e", "e", "e", "w", "i", "v", "wtf", "json", "xml", "dTag", "eTag", "eTag", "eTag", "wTag", "iTag", "vTag", "wtfTag", "jsonTag", "xmlTag", "isPrintLog", "d", "e", "e", "e", "w", "i", "v", "wtf", "json", "xml", "dTag", "eTag", "eTag", "eTag", "wTag", "iTag", "vTag", "wtfTag", "jsonTag", "xmlTag", "isPrintLog", "d", "e", "e", "e", "w", "i", "v", "wtf", "json", "xml", "dTag", "eTag", "eTag", "eTag", "wTag", "iTag", "vTag", "wtfTag", "jsonTag", "xmlTag", "isPrintLog", "d", "e", "e", "e", "w", "i", "v", "wtf", "json", "xml", "dTag", "eTag", "eTag", "eTag", "wTag", "iTag", "vTag", "wtfTag", "jsonTag", "xmlTag", "isPrintLog", "d", "e", "e", "e", "w", "i", "v", "wtf", "json", "xml", "dTag", "eTag", "eTag", "eTag", "wTag", "iTag", "vTag", "wtfTag", "jsonTag", "xmlTag", "isPrintLog", "d", "e", "e", "e", "w", "i", "v", "wtf", "json", "xml", "dTag", "eTag", "eTag", "eTag", "wTag", "iTag", "vTag", "wtfTag", "jsonTag", "xmlTag", "isPrintLog", "d", "e", "e", "e", "w", "i", "v", "wtf", "json", "xml", "dTag", "eTag", "eTag", "eTag", "wTag", "iTag", "vTag", "wtfTag", "jsonTag", "xmlTag", "isPrintLog", "d", "e", "e", "e", "w", "i", "v", "wtf", "json", "xml", "dTag", "eTag", "eTag", "eTag", "wTag", "iTag", "vTag", "wtfTag", "jsonTag", "xmlTag", "isPrintLog", "d", "e", "e", "e", "w", "i", "v", "wtf", "json", "xml", "dTag", "eTag", "eTag", "eTag", "wTag", "iTag", "vTag", "wtfTag", "jsonTag", "xmlTag", "isPrintLog", "d", "e", "e", "e", "w", "i", "v", "wtf", "json", "xml", "dTag", "eTag", "eTag", "eTag", "wTag", "iTag", "vTag", "wtfTag", "jsonTag", "xmlTag", "isPrintLog", "d", "e", "e", "e", "w", "i", "v", "wtf", "json", "xml", "dTag", "eTag", "eTag", "eTag", "wTag", "iTag", "vTag", "wtfTag", "jsonTag", "xmlTag", "isPrintLog", "d", "e", "e", "e", "w", "i", "v", "wtf", "json", "xml", "dTag", "eTag", "eTag", "eTag", "wTag", "iTag", "vTag", "wtfTag", "jsonTag", "xmlTag", "isPrintLog", "d", "e", "e", "e", "w", "i", "v", "wtf", "json", "xml", "dTag", "eTag", "eTag", "eTag", "wTag", "iTag", "vTag", "wtfTag", "jsonTag", "xmlTag", "isPrintLog", "d", "e", "e", "e", "w", "i", "v", "wtf", "json", "xml", "dTag", "eTag", "eTag", "eTag", "wTag", "iTag", "vTag", "wtfTag", "jsonTag", "xmlTag", "isPrintLog", "d", "e", "e", "e", "w", "i", "v", "wtf", "json", "xml", "dTag", "eTag", "eTag", "eTag", "wTag", "iTag", "vTag", "wtfTag", "jsonTag", "xmlTag", "isPrintLog", "d", "e", "e", "e", "w", "i", "v", "wtf", "json", "xml", "dTag", "eTag", "eTag", "eTag", "wTag", "iTag", "vTag", "wtfTag", "jsonTag", "xmlTag", "isPrintLog", "d", "e", "e", "e", "w", "i", "v", "wtf", "json", "xml", "dTag", "eTag", "eTag", "eTag", "wTag", "iTag", "vTag", "wtfTag", "jsonTag", "xmlTag", "isPrintLog", "d", "e", "e", "e", "w", "i", "v", "wtf", "json", "xml", "dTag", "eTag", "eTag", "eTag", "wTag", "iTag", "vTag", "wtfTag", "jsonTag", "xmlTag", "isPrintLog", "d", "e", "e", "e", "w", "i", "v", "wtf", "json", "xml", "dTag", "eTag", "eTag", "eTag", "wTag", "iTag", "vTag", "wtfTag", "jsonTag", "xmlTag", "isPrintLog", "d", "e", "e", "e", "w", "i", "v", "wtf", "json", "xml", "dTag", "eTag", "eTag", "eTag", "wTag", "iTag", "vTag", "wtfTag", "jsonTag", "xmlTag"));

        return ignoreUnPublicMap;
    }

    /**
     * 获取忽略无修饰符变量处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreModifierVariableMap() {
        Map<String, List<String>> ignoreModifierVariableMap = new HashMap<>();

        return ignoreModifierVariableMap;
    }

    /**
     * 获取忽略指定方法 return void 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreReturnVoidMap() {
        Map<String, List<String>> ignoreReturnVoidMap = new HashMap<>();
        ignoreReturnVoidMap.put("ILogEngine", Utils.asList("d - void", "e - void", "e - void", "e - void", "w - void", "i - void", "v - void", "wtf - void", "json - void", "xml - void", "dTag - void", "eTag - void", "eTag - void", "eTag - void", "wTag - void", "iTag - void", "vTag - void", "wtfTag - void", "jsonTag - void", "xmlTag - void", "d - void", "e - void", "e - void", "e - void", "w - void", "i - void", "v - void", "wtf - void", "json - void", "xml - void", "dTag - void", "eTag - void", "eTag - void", "eTag - void", "wTag - void", "iTag - void", "vTag - void", "wtfTag - void", "jsonTag - void", "xmlTag - void", "d - void", "e - void", "e - void", "e - void", "w - void", "i - void", "v - void", "wtf - void", "json - void", "xml - void", "dTag - void", "eTag - void", "eTag - void", "eTag - void", "wTag - void", "iTag - void", "vTag - void", "wtfTag - void", "jsonTag - void", "xmlTag - void", "d - void", "e - void", "e - void", "e - void", "w - void", "i - void", "v - void", "wtf - void", "json - void", "xml - void", "dTag - void", "eTag - void", "eTag - void", "eTag - void", "wTag - void", "iTag - void", "vTag - void", "wtfTag - void", "jsonTag - void", "xmlTag - void", "d - void", "e - void", "e - void", "e - void", "w - void", "i - void", "v - void", "wtf - void", "json - void", "xml - void", "dTag - void", "eTag - void", "eTag - void", "eTag - void", "wTag - void", "iTag - void", "vTag - void", "wtfTag - void", "jsonTag - void", "xmlTag - void", "d - void", "e - void", "e - void", "e - void", "w - void", "i - void", "v - void", "wtf - void", "json - void", "xml - void", "dTag - void", "eTag - void", "eTag - void", "eTag - void", "wTag - void", "iTag - void", "vTag - void", "wtfTag - void", "jsonTag - void", "xmlTag - void", "d - void", "e - void", "e - void", "e - void", "w - void", "i - void", "v - void", "wtf - void", "json - void", "xml - void", "dTag - void", "eTag - void", "eTag - void", "eTag - void", "wTag - void", "iTag - void", "vTag - void", "wtfTag - void", "jsonTag - void", "xmlTag - void", "d - void", "e - void", "e - void", "e - void", "w - void", "i - void", "v - void", "wtf - void", "json - void", "xml - void", "dTag - void", "eTag - void", "eTag - void", "eTag - void", "wTag - void", "iTag - void", "vTag - void", "wtfTag - void", "jsonTag - void", "xmlTag - void", "d - void", "e - void", "e - void", "e - void", "w - void", "i - void", "v - void", "wtf - void", "json - void", "xml - void", "dTag - void", "eTag - void", "eTag - void", "eTag - void", "wTag - void", "iTag - void", "vTag - void", "wtfTag - void", "jsonTag - void", "xmlTag - void", "d - void", "e - void", "e - void", "e - void", "w - void", "i - void", "v - void", "wtf - void", "json - void", "xml - void", "dTag - void", "eTag - void", "eTag - void", "eTag - void", "wTag - void", "iTag - void", "vTag - void", "wtfTag - void", "jsonTag - void", "xmlTag - void", "d - void", "e - void", "e - void", "e - void", "w - void", "i - void", "v - void", "wtf - void", "json - void", "xml - void", "dTag - void", "eTag - void", "eTag - void", "eTag - void", "wTag - void", "iTag - void", "vTag - void", "wtfTag - void", "jsonTag - void", "xmlTag - void", "d - void", "e - void", "e - void", "e - void", "w - void", "i - void", "v - void", "wtf - void", "json - void", "xml - void", "dTag - void", "eTag - void", "eTag - void", "eTag - void", "wTag - void", "iTag - void", "vTag - void", "wtfTag - void", "jsonTag - void", "xmlTag - void", "d - void", "e - void", "e - void", "e - void", "w - void", "i - void", "v - void", "wtf - void", "json - void", "xml - void", "dTag - void", "eTag - void", "eTag - void", "eTag - void", "wTag - void", "iTag - void", "vTag - void", "wtfTag - void", "jsonTag - void", "xmlTag - void", "d - void", "e - void", "e - void", "e - void", "w - void", "i - void", "v - void", "wtf - void", "json - void", "xml - void", "dTag - void", "eTag - void", "eTag - void", "eTag - void", "wTag - void", "iTag - void", "vTag - void", "wtfTag - void", "jsonTag - void", "xmlTag - void", "d - void", "e - void", "e - void", "e - void", "w - void", "i - void", "v - void", "wtf - void", "json - void", "xml - void", "dTag - void", "eTag - void", "eTag - void", "eTag - void", "wTag - void", "iTag - void", "vTag - void", "wtfTag - void", "jsonTag - void", "xmlTag - void", "d - void", "e - void", "e - void", "e - void", "w - void", "i - void", "v - void", "wtf - void", "json - void", "xml - void", "dTag - void", "eTag - void", "eTag - void", "eTag - void", "wTag - void", "iTag - void", "vTag - void", "wtfTag - void", "jsonTag - void", "xmlTag - void", "d - void", "e - void", "e - void", "e - void", "w - void", "i - void", "v - void", "wtf - void", "json - void", "xml - void", "dTag - void", "eTag - void", "eTag - void", "eTag - void", "wTag - void", "iTag - void", "vTag - void", "wtfTag - void", "jsonTag - void", "xmlTag - void", "d - void", "e - void", "e - void", "e - void", "w - void", "i - void", "v - void", "wtf - void", "json - void", "xml - void", "dTag - void", "eTag - void", "eTag - void", "eTag - void", "wTag - void", "iTag - void", "vTag - void", "wtfTag - void", "jsonTag - void", "xmlTag - void", "d - void", "e - void", "e - void", "e - void", "w - void", "i - void", "v - void", "wtf - void", "json - void", "xml - void", "dTag - void", "eTag - void", "eTag - void", "eTag - void", "wTag - void", "iTag - void", "vTag - void", "wtfTag - void", "jsonTag - void", "xmlTag - void", "d - void", "e - void", "e - void", "e - void", "w - void", "i - void", "v - void", "wtf - void", "json - void", "xml - void", "dTag - void", "eTag - void", "eTag - void", "eTag - void", "wTag - void", "iTag - void", "vTag - void", "wtfTag - void", "jsonTag - void", "xmlTag - void", "d - void", "e - void", "e - void", "e - void", "w - void", "i - void", "v - void", "wtf - void", "json - void", "xml - void", "dTag - void", "eTag - void", "eTag - void", "eTag - void", "wTag - void", "iTag - void", "vTag - void", "wtfTag - void", "jsonTag - void", "xmlTag - void", "d - void", "e - void", "e - void", "e - void", "w - void", "i - void", "v - void", "wtf - void", "json - void", "xml - void", "dTag - void", "eTag - void", "eTag - void", "eTag - void", "wTag - void", "iTag - void", "vTag - void", "wtfTag - void", "jsonTag - void", "xmlTag - void", "d - void", "e - void", "e - void", "e - void", "w - void", "i - void", "v - void", "wtf - void", "json - void", "xml - void", "dTag - void", "eTag - void", "eTag - void", "eTag - void", "wTag - void", "iTag - void", "vTag - void", "wtfTag - void", "jsonTag - void", "xmlTag - void", "d - void", "e - void", "e - void", "e - void", "w - void", "i - void", "v - void", "wtf - void", "json - void", "xml - void", "dTag - void", "eTag - void", "eTag - void", "eTag - void", "wTag - void", "iTag - void", "vTag - void", "wtfTag - void", "jsonTag - void", "xmlTag - void", "d - void", "e - void", "e - void", "e - void", "w - void", "i - void", "v - void", "wtf - void", "json - void", "xml - void", "dTag - void", "eTag - void", "eTag - void", "eTag - void", "wTag - void", "iTag - void", "vTag - void", "wtfTag - void", "jsonTag - void", "xmlTag - void", "d - void", "e - void", "e - void", "e - void", "w - void", "i - void", "v - void", "wtf - void", "json - void", "xml - void", "dTag - void", "eTag - void", "eTag - void", "eTag - void", "wTag - void", "iTag - void", "vTag - void", "wtfTag - void", "jsonTag - void", "xmlTag - void", "d - void", "e - void", "e - void", "e - void", "w - void", "i - void", "v - void", "wtf - void", "json - void", "xml - void", "dTag - void", "eTag - void", "eTag - void", "eTag - void", "wTag - void", "iTag - void", "vTag - void", "wtfTag - void", "jsonTag - void", "xmlTag - void", "d - void", "e - void", "e - void", "e - void", "w - void", "i - void", "v - void", "wtf - void", "json - void", "xml - void", "dTag - void", "eTag - void", "eTag - void", "eTag - void", "wTag - void", "iTag - void", "vTag - void", "wtfTag - void", "jsonTag - void", "xmlTag - void", "d - void", "e - void", "e - void", "e - void", "w - void", "i - void", "v - void", "wtf - void", "json - void", "xml - void", "dTag - void", "eTag - void", "eTag - void", "eTag - void", "wTag - void", "iTag - void", "vTag - void", "wtfTag - void", "jsonTag - void", "xmlTag - void", "d - void", "e - void", "e - void", "e - void", "w - void", "i - void", "v - void", "wtf - void", "json - void", "xml - void", "dTag - void", "eTag - void", "eTag - void", "eTag - void", "wTag - void", "iTag - void", "vTag - void", "wtfTag - void", "jsonTag - void", "xmlTag - void"));

        return ignoreReturnVoidMap;
    }

    /**
     * 忽略注释间距异常文件
     * @param map {@link HashMap}
     */
    @Override
    public void ignoreAnnotationSpaceMap(Map<String, String> map) {

    }
}