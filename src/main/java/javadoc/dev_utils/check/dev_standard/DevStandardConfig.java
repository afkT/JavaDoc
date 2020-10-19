package javadoc.dev_utils.check.dev_standard;

import javadoc.Utils;
import javadoc.dev_utils.check.dev.ICheckConfig;

import java.util.ArrayList;
import java.util.HashMap;
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
    public Map<String, ArrayList<String>> getIgnoreAnnotateMap() {
        Map<String, ArrayList<String>> ignoreAnnotateMap = new HashMap<>();
        ignoreAnnotateMap.put("CatalogMain", Utils.asList("main"));
        ignoreAnnotateMap.put("ColorSortMain", Utils.asList("main"));
        ignoreAnnotateMap.put("ColorSortMain.SAXXml.SAXDemoHandel", Utils.asList("startDocument","endDocument","startElement","endElement","characters"));
        ignoreAnnotateMap.put("ConfigMain", Utils.asList("main"));
        ignoreAnnotateMap.put("PanguAnalyeMain", Utils.asList("main"));

        return ignoreAnnotateMap;
    }

    /**
     * 获取忽略指定方法参数 final 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreFinalMap() {
        Map<String, ArrayList<String>> ignoreFinalMap = new HashMap<>();
        ignoreFinalMap.put("CatalogMain", Utils.asList("main"));
        ignoreFinalMap.put("ColorSortMain", Utils.asList("main"));
        ignoreFinalMap.put("ColorSortMain.SAXXml.SAXDemoHandel", Utils.asList("startElement","endElement","characters"));
        ignoreFinalMap.put("ConfigMain", Utils.asList("main"));
        ignoreFinalMap.put("Pangu", Utils.asList("spacingText","spacingFile"));
        ignoreFinalMap.put("PanguAnalyeMain", Utils.asList("main"));

        return ignoreFinalMap;
    }

    /**
     * 获取忽略指定方法 static 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreStaticMap() {
        Map<String, ArrayList<String>> ignoreStaticMap = new HashMap<>();
        ignoreStaticMap.put("ColorSortMain.SAXXml", Utils.asList("analysisColorsXml"));
        ignoreStaticMap.put("ColorSortMain.SAXXml.SAXDemoHandel", Utils.asList("startDocument","endDocument","startElement","endElement","characters"));
        ignoreStaticMap.put("DepsJsonBean", Utils.asList("map","getDependencies","getAllDependencies","getAllDependencies"));
        ignoreStaticMap.put("Pangu", Utils.asList("spacingText","spacingFile"));

        return ignoreStaticMap;
    }

    /**
     * 获取忽略指定方法 @param 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreParamMap() {
        Map<String, ArrayList<String>> ignoreParamMap = new HashMap<>();
        ignoreParamMap.put("CatalogMain", Utils.asList("main"));
        ignoreParamMap.put("ColorSortMain", Utils.asList("main"));
        ignoreParamMap.put("ColorSortMain.SAXXml.SAXDemoHandel", Utils.asList("startElement","endElement","characters"));
        ignoreParamMap.put("ConfigMain", Utils.asList("main"));
        ignoreParamMap.put("PanguAnalyeMain", Utils.asList("main"));

        return ignoreParamMap;
    }

    /**
     * 获取忽略指定方法 @return 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreReturnMap() {
        Map<String, ArrayList<String>> ignoreReturnMap = new HashMap<>();
        
        return ignoreReturnMap;
    }

    /**
     * 获取忽略指定方法非 public 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreUnPublicMap() {
        Map<String, ArrayList<String>> ignoreUnPublicMap = new HashMap<>();
        ignoreUnPublicMap.put("CatalogGenerate", Utils.asList("getFolderLists","getFolderLists","calculateMaxLength","createCatelog","createCataLogLine","forCatelog"));
        ignoreUnPublicMap.put("CatalogGenerate.CatalogCallback", Utils.asList("callback"));
        ignoreUnPublicMap.put("CatalogMain", Utils.asList("print"));
        ignoreUnPublicMap.put("ColorSortMain.SAXXml.DocumentListener", Utils.asList("OnEnd"));
        ignoreUnPublicMap.put("PanguAnalyeMain", Utils.asList("getFileCatalogLists","forReader","readFile","createGson","toJsonFormat"));
        ignoreUnPublicMap.put("PanguAnalyeMain.Filter", Utils.asList("filter"));

        return ignoreUnPublicMap;
    }

    /**
     * 获取忽略无修饰符变量处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreModifierVariableMap() {
        Map<String, ArrayList<String>> ignoreModifierVariableMap = new HashMap<>();
        
        return ignoreModifierVariableMap;
    }

    /**
     * 获取忽略指定方法 return void 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreReturnVoidMap() {
        Map<String, ArrayList<String>> ignoreReturnVoidMap = new HashMap<>();
        ignoreReturnVoidMap.put("CatalogGenerate", Utils.asList("calculateMaxLength - void","forCatelog - void"));
        ignoreReturnVoidMap.put("CatalogGenerate.CatalogCallback", Utils.asList("callback - void"));
        ignoreReturnVoidMap.put("CatalogMain", Utils.asList("print - void"));
        ignoreReturnVoidMap.put("ColorSortMain.SAXXml", Utils.asList("analysisColorsXml - void"));
        ignoreReturnVoidMap.put("ColorSortMain.SAXXml.DocumentListener", Utils.asList("OnEnd - void"));
        ignoreReturnVoidMap.put("Pangu", Utils.asList("spacingFile - void"));
        ignoreReturnVoidMap.put("PanguAnalyeMain", Utils.asList("forReader - void","readFile - void"));

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