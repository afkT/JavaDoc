package javadoc.dev_utils.check.dev_standard;

import javadoc.Utils;
import javadoc.dev_utils.check.dev.ICheckConfig;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * detail: DevStandardConfig 代码检测分析配置
 * @author Ttt
 */
final class DevStandardConfig implements ICheckConfig {

    /**
     * 获取忽略指定方法注释配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreAnnotateMap() {
        Map<String, List<String>> ignoreAnnotateMap = new HashMap<>();
        ignoreAnnotateMap.put("CatalogMain", Utils.asListArgs("main"));
        ignoreAnnotateMap.put("ColorSortMain", Utils.asListArgs("main"));
        ignoreAnnotateMap.put("ColorSortMain.SAXXml.SAXDemoHandel", Utils.asListArgs("startDocument","endDocument","startElement","endElement","characters"));
        ignoreAnnotateMap.put("ConfigMain", Utils.asListArgs("main"));
        ignoreAnnotateMap.put("PanguAnalyzeMain", Utils.asListArgs("main"));

        return ignoreAnnotateMap;
    }

    /**
     * 获取忽略指定方法参数 final 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreFinalMap() {
        Map<String, List<String>> ignoreFinalMap = new HashMap<>();
        ignoreFinalMap.put("CatalogMain", Utils.asListArgs("main"));
        ignoreFinalMap.put("ColorSortMain", Utils.asListArgs("main"));
        ignoreFinalMap.put("ColorSortMain.SAXXml.SAXDemoHandel", Utils.asListArgs("startElement","endElement","characters"));
        ignoreFinalMap.put("ConfigMain", Utils.asListArgs("main"));
        ignoreFinalMap.put("Pangu", Utils.asListArgs("spacingText","spacingFile"));
        ignoreFinalMap.put("PanguAnalyzeMain", Utils.asListArgs("main"));

        return ignoreFinalMap;
    }

    /**
     * 获取忽略指定方法 static 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreStaticMap() {
        Map<String, List<String>> ignoreStaticMap = new HashMap<>();
        ignoreStaticMap.put("ColorSortMain.SAXXml", Utils.asListArgs("analysisColorsXml"));
        ignoreStaticMap.put("ColorSortMain.SAXXml.SAXDemoHandel", Utils.asListArgs("startDocument","endDocument","startElement","endElement","characters"));
        ignoreStaticMap.put("DepsJsonBean", Utils.asListArgs("map","getDependencies","getAllDependencies","getAllDependencies"));
        ignoreStaticMap.put("Pangu", Utils.asListArgs("spacingText","spacingFile"));

        return ignoreStaticMap;
    }

    /**
     * 获取忽略指定方法 @param 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreParamMap() {
        Map<String, List<String>> ignoreParamMap = new HashMap<>();
        ignoreParamMap.put("CatalogMain", Utils.asListArgs("main"));
        ignoreParamMap.put("ColorSortMain", Utils.asListArgs("main"));
        ignoreParamMap.put("ColorSortMain.SAXXml.SAXDemoHandel", Utils.asListArgs("startElement","endElement","characters"));
        ignoreParamMap.put("ConfigMain", Utils.asListArgs("main"));
        ignoreParamMap.put("PanguAnalyzeMain", Utils.asListArgs("main"));

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
        ignoreUnPublicMap.put("CatalogGenerate", Utils.asListArgs("getFolderLists","getFolderLists","calculateMaxLength","createCatalog","createCatalogLine","forCatalog"));
        ignoreUnPublicMap.put("CatalogGenerate.CatalogCallback", Utils.asListArgs("callback"));
        ignoreUnPublicMap.put("CatalogMain", Utils.asListArgs("print"));
        ignoreUnPublicMap.put("ColorSortMain.SAXXml.DocumentListener", Utils.asListArgs("OnEnd"));
        ignoreUnPublicMap.put("PanguAnalyzeMain", Utils.asListArgs("getFileCatalogLists","forReader","readFile","createGson","toJsonFormat"));
        ignoreUnPublicMap.put("PanguAnalyzeMain.Filter", Utils.asListArgs("filter"));

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
        ignoreReturnVoidMap.put("CatalogGenerate", Utils.asListArgs("calculateMaxLength - void","forCatalog - void"));
        ignoreReturnVoidMap.put("CatalogGenerate.CatalogCallback", Utils.asListArgs("callback - void"));
        ignoreReturnVoidMap.put("CatalogMain", Utils.asListArgs("print - void"));
        ignoreReturnVoidMap.put("ColorSortMain.SAXXml", Utils.asListArgs("analysisColorsXml - void"));
        ignoreReturnVoidMap.put("ColorSortMain.SAXXml.DocumentListener", Utils.asListArgs("OnEnd - void"));
        ignoreReturnVoidMap.put("Pangu", Utils.asListArgs("spacingFile - void"));
        ignoreReturnVoidMap.put("PanguAnalyzeMain", Utils.asListArgs("forReader - void","readFile - void"));

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