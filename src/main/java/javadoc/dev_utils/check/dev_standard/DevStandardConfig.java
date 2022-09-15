package javadoc.dev_utils.check.dev_standard;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dev.utils.common.ArrayUtils;
import javadoc.dev_utils.check.dev.ICheckConfig;

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
        ignoreAnnotateMap.put("CatalogMain", ArrayUtils.asListArgs("main"));
        ignoreAnnotateMap.put("ColorSortMain", ArrayUtils.asListArgs("main"));
        ignoreAnnotateMap.put("ColorSortMain.SAXXml.SAXHandler", ArrayUtils.asListArgs("startDocument","endDocument","startElement","endElement","characters"));
        ignoreAnnotateMap.put("CommonAbleMain", ArrayUtils.asListArgs("main","returnGetAbleAnnotation","getIgnoreAbleCLass","main","returnGetAbleAnnotation","getIgnoreAbleCLass"));
        ignoreAnnotateMap.put("ConfigMain", ArrayUtils.asListArgs("main"));
        ignoreAnnotateMap.put("DevFinalIgnore", ArrayUtils.asListArgs("ignoreSet"));
        ignoreAnnotateMap.put("DimenGenerateMain", ArrayUtils.asListArgs("main"));
        ignoreAnnotateMap.put("FinalSortMain", ArrayUtils.asListArgs("main"));
        ignoreAnnotateMap.put("FinalSortMain2", ArrayUtils.asListArgs("main","main","main"));
        ignoreAnnotateMap.put("GitDeleteQuery", ArrayUtils.asListArgs("main"));
        ignoreAnnotateMap.put("GitDeleteQuerySimple", ArrayUtils.asListArgs("main"));
        ignoreAnnotateMap.put("GradleMain", ArrayUtils.asListArgs("main","getGradleFileName"));
        ignoreAnnotateMap.put("IntentDataJavaGenerateMain", ArrayUtils.asListArgs("main"));
        ignoreAnnotateMap.put("IntentDataKotlinGenerateMain", ArrayUtils.asListArgs("main"));
        ignoreAnnotateMap.put("Main", ArrayUtils.asListArgs("print","main"));
        ignoreAnnotateMap.put("StateGenerateMain", ArrayUtils.asListArgs("main"));
        ignoreAnnotateMap.put("Utils", ArrayUtils.asListArgs("getPackagePath","getFormatFilePath","getGenerateDirectory","getPackagePath","getFormatFilePath","getResultFilePath"));
        ignoreAnnotateMap.put("Utils.Replace", ArrayUtils.asListArgs("getFileName"));
        ignoreAnnotateMap.put("ValiPhoneMain", ArrayUtils.asListArgs("main"));

        return ignoreAnnotateMap;
    }

    /**
     * 获取忽略指定方法参数 final 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreFinalMap() {
        Map<String, List<String>> ignoreFinalMap = new HashMap<>();
        ignoreFinalMap.put("CatalogMain", ArrayUtils.asListArgs("main"));
        ignoreFinalMap.put("ColorSortMain", ArrayUtils.asListArgs("main"));
        ignoreFinalMap.put("ColorSortMain.SAXXml.SAXHandler", ArrayUtils.asListArgs("startElement","endElement","characters"));
        ignoreFinalMap.put("CommonAbleMain", ArrayUtils.asListArgs("main","main"));
        ignoreFinalMap.put("ConfigMain", ArrayUtils.asListArgs("main"));
        ignoreFinalMap.put("DimenGenerateMain", ArrayUtils.asListArgs("main"));
        ignoreFinalMap.put("FinalSortMain", ArrayUtils.asListArgs("main"));
        ignoreFinalMap.put("FinalSortMain2", ArrayUtils.asListArgs("main","main","main"));
        ignoreFinalMap.put("GitDeleteQuery", ArrayUtils.asListArgs("main"));
        ignoreFinalMap.put("GitDeleteQuerySimple", ArrayUtils.asListArgs("main"));
        ignoreFinalMap.put("GradleMain", ArrayUtils.asListArgs("main"));
        ignoreFinalMap.put("IntentDataJavaGenerateMain", ArrayUtils.asListArgs("main"));
        ignoreFinalMap.put("IntentDataKotlinGenerateMain", ArrayUtils.asListArgs("main"));
        ignoreFinalMap.put("Main", ArrayUtils.asListArgs("print","main"));
        ignoreFinalMap.put("StateGenerateMain", ArrayUtils.asListArgs("main"));
        ignoreFinalMap.put("ValiPhoneMain", ArrayUtils.asListArgs("main"));

        return ignoreFinalMap;
    }

    /**
     * 获取忽略指定方法 static 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreStaticMap() {
        Map<String, List<String>> ignoreStaticMap = new HashMap<>();
        ignoreStaticMap.put("ColorSortMain.SAXXml", ArrayUtils.asListArgs("analysisColorsXml"));
        ignoreStaticMap.put("ColorSortMain.SAXXml.SAXHandler", ArrayUtils.asListArgs("startDocument","endDocument","startElement","endElement","characters"));
        ignoreStaticMap.put("DepsJsonBean", ArrayUtils.asListArgs("map","getDependencies","getAllDependencies","getAllDependencies"));
        ignoreStaticMap.put("Utils.Replace", ArrayUtils.asListArgs("getFileName"));

        return ignoreStaticMap;
    }

    /**
     * 获取忽略指定方法 @param 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreParamMap() {
        Map<String, List<String>> ignoreParamMap = new HashMap<>();
        ignoreParamMap.put("CatalogMain", ArrayUtils.asListArgs("main"));
        ignoreParamMap.put("ColorSortMain", ArrayUtils.asListArgs("main"));
        ignoreParamMap.put("ColorSortMain.SAXXml.SAXHandler", ArrayUtils.asListArgs("startElement","endElement","characters"));
        ignoreParamMap.put("CommonAbleMain", ArrayUtils.asListArgs("main","main"));
        ignoreParamMap.put("ConfigMain", ArrayUtils.asListArgs("main"));
        ignoreParamMap.put("DimenGenerateMain", ArrayUtils.asListArgs("main"));
        ignoreParamMap.put("FinalSortMain", ArrayUtils.asListArgs("main"));
        ignoreParamMap.put("FinalSortMain2", ArrayUtils.asListArgs("main","main","main"));
        ignoreParamMap.put("GitDeleteQuery", ArrayUtils.asListArgs("main"));
        ignoreParamMap.put("GitDeleteQuerySimple", ArrayUtils.asListArgs("main"));
        ignoreParamMap.put("GradleMain", ArrayUtils.asListArgs("main","getGradleFileName"));
        ignoreParamMap.put("IntentDataJavaGenerateMain", ArrayUtils.asListArgs("main"));
        ignoreParamMap.put("IntentDataKotlinGenerateMain", ArrayUtils.asListArgs("main"));
        ignoreParamMap.put("Main", ArrayUtils.asListArgs("print","main"));
        ignoreParamMap.put("StateGenerateMain", ArrayUtils.asListArgs("main"));
        ignoreParamMap.put("Utils", ArrayUtils.asListArgs("getGenerateDirectory"));
        ignoreParamMap.put("ValiPhoneMain", ArrayUtils.asListArgs("main"));

        return ignoreParamMap;
    }

    /**
     * 获取忽略指定方法 @return 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreReturnMap() {
        Map<String, List<String>> ignoreReturnMap = new HashMap<>();
        ignoreReturnMap.put("GitDeleteQuery", ArrayUtils.asListArgs("convertDeleteNames"));

        return ignoreReturnMap;
    }

    /**
     * 获取忽略指定方法非 public 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreUnPublicMap() {
        Map<String, List<String>> ignoreUnPublicMap = new HashMap<>();
        ignoreUnPublicMap.put("CatalogGenerate", ArrayUtils.asListArgs("getFolderLists","getFolderLists","resetMaxLength","calculateMaxLength","createCatalog","createCatalogLine","forCatalog"));
        ignoreUnPublicMap.put("CatalogGenerate.CatalogCallback", ArrayUtils.asListArgs("callback"));
        ignoreUnPublicMap.put("CatalogMain", ArrayUtils.asListArgs("print"));
        ignoreUnPublicMap.put("ColorSortMain", ArrayUtils.asListArgs("colorXMLSort"));
        ignoreUnPublicMap.put("ColorSortMain.SAXXml.DocumentListener", ArrayUtils.asListArgs("onEnd"));
        ignoreUnPublicMap.put("CommonAbleMain", ArrayUtils.asListArgs("returnGetAbleAnnotation","getIgnoreAbleCLass","returnGetAbleAnnotation","getIgnoreAbleCLass"));
        ignoreUnPublicMap.put("DimenGenerateMain", ArrayUtils.asListArgs("forDimen"));
        ignoreUnPublicMap.put("GitDeleteQuery", ArrayUtils.asListArgs("searchAllFile","forFileListBean","getWaitDeletePath","getWaitDeleteMap","convertDeleteNames","checkDeleteRepeatFile","calculateSize","calculateMapSize","printMapSize","printRepeatList","println","generateCMD"));
        ignoreUnPublicMap.put("GitDeleteQuerySimple", ArrayUtils.asListArgs("println","generateCMD"));
        ignoreUnPublicMap.put("GradleMain", ArrayUtils.asListArgs("getGradleFileName"));
        ignoreUnPublicMap.put("Main", ArrayUtils.asListArgs("print"));
        ignoreUnPublicMap.put("Utils", ArrayUtils.asListArgs("getFormatTXT","saveFile","getPackagePath","getFormatFilePath","getGenerateDirectory","getPackagePath"));
        ignoreUnPublicMap.put("ValiPhoneMain", ArrayUtils.asListArgs("getTypeNumber","toNumberMap","generatePATTERN"));

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
        ignoreReturnVoidMap.put("CatalogGenerate", ArrayUtils.asListArgs("resetMaxLength - void","calculateMaxLength - void","forCatalog - void"));
        ignoreReturnVoidMap.put("CatalogGenerate.CatalogCallback", ArrayUtils.asListArgs("callback - void"));
        ignoreReturnVoidMap.put("CatalogMain", ArrayUtils.asListArgs("print - void"));
        ignoreReturnVoidMap.put("ColorSortMain", ArrayUtils.asListArgs("colorXMLSort - void"));
        ignoreReturnVoidMap.put("ColorSortMain.SAXXml", ArrayUtils.asListArgs("analysisColorsXml - void"));
        ignoreReturnVoidMap.put("ColorSortMain.SAXXml.DocumentListener", ArrayUtils.asListArgs("onEnd - void"));
        ignoreReturnVoidMap.put("GitDeleteQuery", ArrayUtils.asListArgs("forFileListBean - void","printMapSize - void","printRepeatList - void","println - void","generateCMD - void"));
        ignoreReturnVoidMap.put("GitDeleteQuerySimple", ArrayUtils.asListArgs("println - void","generateCMD - void"));
        ignoreReturnVoidMap.put("Utils", ArrayUtils.asListArgs("generateAbleFile - void","convertPSFS - void","sortAppend - void"));

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