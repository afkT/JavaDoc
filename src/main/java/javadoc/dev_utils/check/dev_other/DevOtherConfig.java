package javadoc.dev_utils.check.dev_other;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dev.utils.common.ArrayUtils;
import javadoc.dev_utils.check.dev.ICheckConfig;

/**
 * detail: DevOtherConfig 代码检测分析配置
 * @author Ttt
 */
final class DevOtherConfig implements ICheckConfig {

    /**
     * 获取忽略指定方法注释配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreAnnotateMap() {
        Map<String, List<String>> ignoreAnnotateMap = new HashMap<>();
        ignoreAnnotateMap.put("ACache.XFileOutputStream", ArrayUtils.asListArgs("close"));
        ignoreAnnotateMap.put("ChainWorker", ArrayUtils.asListArgs("builder"));
        ignoreAnnotateMap.put("ChainWorker.AWorker", ArrayUtils.asListArgs("doWork"));
        ignoreAnnotateMap.put("ChainWorker.BWorker", ArrayUtils.asListArgs("doWork"));
        ignoreAnnotateMap.put("ChainWorker.CWorker", ArrayUtils.asListArgs("doWork"));
        ignoreAnnotateMap.put("ChainWorker.DWorker", ArrayUtils.asListArgs("doWork"));
        ignoreAnnotateMap.put("LocationWorker", ArrayUtils.asListArgs("doWork","test"));
        ignoreAnnotateMap.put("LogWorker", ArrayUtils.asListArgs("doWork"));
        ignoreAnnotateMap.put("LubanUtils.Config", ArrayUtils.asListArgs("isFailFinish","setFailFinish"));
        ignoreAnnotateMap.put("MMKVUtils.Holder", ArrayUtils.asListArgs("encode","encode","encode","encode","encode","encode","encode","encode","encode","decodeBool","decodeBool","decodeInt","decodeInt","decodeLong","decodeLong","decodeFloat","decodeFloat","decodeDouble","decodeDouble","decodeString","decodeString","decodeStringSet","decodeStringSet","decodeStringSet","decodeBytes","decodeBytes","decodeParcelable","decodeParcelable"));
        ignoreAnnotateMap.put("WorkManagerUtils", ArrayUtils.asListArgs("enqueue","enqueueUniqueWork","beginWith","beginUniqueWork"));

        return ignoreAnnotateMap;
    }

    /**
     * 获取忽略指定方法参数 final 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreFinalMap() {
        Map<String, List<String>> ignoreFinalMap = new HashMap<>();
        ignoreFinalMap.put("LogWorker", ArrayUtils.asListArgs("observe"));
        ignoreFinalMap.put("LubanUtils", ArrayUtils.asListArgs("compress","compress","compress","compress"));
        ignoreFinalMap.put("LubanUtils.Config", ArrayUtils.asListArgs("setFailFinish"));
        ignoreFinalMap.put("MMKVUtils.Holder", ArrayUtils.asListArgs("containsKey","removeValueForKey","removeValuesForKeys","encode","encode","encode","encode","encode","encode","encode","encode","encode","decodeBool","decodeBool","decodeInt","decodeInt","decodeLong","decodeLong","decodeFloat","decodeFloat","decodeDouble","decodeDouble","decodeString","decodeString","decodeStringSet","decodeStringSet","decodeStringSet","decodeBytes","decodeBytes","decodeParcelable","decodeParcelable"));

        return ignoreFinalMap;
    }

    /**
     * 获取忽略指定方法 static 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreStaticMap() {
        Map<String, List<String>> ignoreStaticMap = new HashMap<>();
        ignoreStaticMap.put("ACache", ArrayUtils.asListArgs("put","put","getAsString","put","put","getAsJSONObject","put","put","getAsJSONArray","put","get","getAsBinary","getAsObject","put","put","getAsBitmap","put","put","getAsDrawable","file","remove","clear"));
        ignoreStaticMap.put("ACache.XFileOutputStream", ArrayUtils.asListArgs("close"));
        ignoreStaticMap.put("ACacheManager", ArrayUtils.asListArgs("calculateCacheSizeAndCacheCount","put","get","newFile","remove","clear","removeNext","calculateSize"));
        ignoreStaticMap.put("ChainWorker.AWorker", ArrayUtils.asListArgs("doWork"));
        ignoreStaticMap.put("ChainWorker.BWorker", ArrayUtils.asListArgs("doWork"));
        ignoreStaticMap.put("ChainWorker.CWorker", ArrayUtils.asListArgs("doWork"));
        ignoreStaticMap.put("ChainWorker.DWorker", ArrayUtils.asListArgs("doWork"));
        ignoreStaticMap.put("LocationWorker", ArrayUtils.asListArgs("doWork","test"));
        ignoreStaticMap.put("LogWorker", ArrayUtils.asListArgs("onStopped","doWork","code","getLog"));
        ignoreStaticMap.put("LubanUtils.Config", ArrayUtils.asListArgs("isFailFinish","setFailFinish"));
        ignoreStaticMap.put("MMKVUtils.Holder", ArrayUtils.asListArgs("getMMKV","mmapID","isMMKVEmpty","isMMKVNotEmpty","containsKey","removeValueForKey","removeValuesForKeys","sync","async","clear","encode","encode","encode","encode","encode","encode","encode","encode","encode","decodeBool","decodeBool","decodeInt","decodeInt","decodeLong","decodeLong","decodeFloat","decodeFloat","decodeDouble","decodeDouble","decodeString","decodeString","decodeStringSet","decodeStringSet","decodeStringSet","decodeBytes","decodeBytes","decodeParcelable","decodeParcelable"));
        ignoreStaticMap.put("WebViewAssist", ArrayUtils.asListArgs("setWebView","getWebView","isWebViewNotEmpty","setBuilder","setBuilder","getBuilder","apply","loadUrl","loadUrl","loadData","loadDataWithBaseURL","postUrl","loadDataWithBaseURL","loadDataWithBaseURL","getSettings","getUserAgentString","setUserAgentString","addJavascriptInterface","removeJavascriptInterface","evaluateJavascript","setWebViewClient","getWebViewClient","setWebChromeClient","getWebChromeClient","destroy","canGoBack","goBack","canGoForward","goForward","canGoBackOrForward","goBackOrForward","reload","stopLoading","clearCache","clearHistory","clearFormData","getScale","getScrollY","getScrollX","getContentHeight","getScaleHeight","getScaleHeight","getHeight","pageDown","pageUp","handlerKeyDown","setLayerTypeSoftware","setLayerType","getUrl","getOriginalUrl","getHitTestResult"));
        ignoreStaticMap.put("WebViewAssist.Builder", ArrayUtils.asListArgs("setWebViewAssist","apply","setOnApplyListener","getApplyListener","clone","reset","applyPri","isJavaScriptEnabled","setJavaScriptEnabled","getRenderPriority","setRenderPriority","isUseWideViewPort","setUseWideViewPort","isLoadWithOverviewMode","setLoadWithOverviewMode","getLayoutAlgorithm","setLayoutAlgorithm","isSupportZoom","setSupportZoom","isBuiltInZoomControls","setBuiltInZoomControls","isDisplayZoomControls","setDisplayZoomControls","getTextZoom","setTextZoom","getStandardFontFamily","setStandardFontFamily","getDefaultFontSize","setDefaultFontSize","getMinimumFontSize","setMinimumFontSize","getMixedContentMode","setMixedContentMode","isLoadsImagesAutomatically","setLoadsImagesAutomatically","isJavaScriptCanOpenWindowsAutomatically","setJavaScriptCanOpenWindowsAutomatically","getDefaultTextEncodingName","setDefaultTextEncodingName","isGeolocationEnabled","setGeolocationEnabled","getUserAgentString","setUserAgentString","isAllowFileAccess","setAllowFileAccess","isAllowFileAccessFromFileURLs","setAllowFileAccessFromFileURLs","isAllowUniversalAccessFromFileURLs","setAllowUniversalAccessFromFileURLs","getCacheMode","setCacheMode","isDomStorageEnabled","setDomStorageEnabled","isAppCacheEnabled","setAppCacheEnabled","getAppCachePath","setAppCachePath","getAppCacheMaxSize","setAppCacheMaxSize","isDatabaseEnabled","setDatabaseEnabled","getDatabasePath","setDatabasePath"));
        ignoreStaticMap.put("WorkManagerUtils", ArrayUtils.asListArgs("getWorkManager","setWorkManager","cancelAllWork","cancelWorkById","cancelAllWorkByTag","cancelUniqueWork","pruneWork","getLastCancelAllTimeMillisLiveData","getLastCancelAllTimeMillis","getWorkInfoByIdLiveData","getWorkInfoById","getWorkInfosByTagLiveData","getWorkInfosByTag","getWorkInfosForUniqueWorkLiveData","getWorkInfosForUniqueWork","getWorkInfosLiveData","getWorkInfos","enqueue","enqueue","enqueueUniqueWork","enqueueUniqueWork","enqueueUniquePeriodicWork","beginWith","beginWith","beginUniqueWork","beginUniqueWork"));

        return ignoreStaticMap;
    }

    /**
     * 获取忽略指定方法 @param 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreParamMap() {
        Map<String, List<String>> ignoreParamMap = new HashMap<>();
        ignoreParamMap.put("ChainWorker", ArrayUtils.asListArgs("builder"));
        ignoreParamMap.put("LogWorker", ArrayUtils.asListArgs("observe"));
        ignoreParamMap.put("LubanUtils.Config", ArrayUtils.asListArgs("setFailFinish"));
        ignoreParamMap.put("MMKVUtils.Holder", ArrayUtils.asListArgs("encode","encode","encode","encode","encode","encode","encode","encode","encode","decodeBool","decodeBool","decodeInt","decodeInt","decodeLong","decodeLong","decodeFloat","decodeFloat","decodeDouble","decodeDouble","decodeString","decodeString","decodeStringSet","decodeStringSet","decodeStringSet","decodeBytes","decodeBytes","decodeParcelable","decodeParcelable"));
        ignoreParamMap.put("WorkManagerUtils", ArrayUtils.asListArgs("enqueue","enqueueUniqueWork","beginWith","beginUniqueWork"));

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
        ignoreUnPublicMap.put("ACache", ArrayUtils.asListArgs("myPid","getCachePath"));
        ignoreUnPublicMap.put("ACacheManager", ArrayUtils.asListArgs("calculateCacheSizeAndCacheCount","put","get","newFile","remove","clear","removeNext","calculateSize"));
        ignoreUnPublicMap.put("ACacheUtils", ArrayUtils.asListArgs("isDue","isDue","newStringWithDateInfo","newByteArrayWithDateInfo","createDateInfo","clearDateInfo","clearDateInfo","hasDateInfo","getDateInfoFromDate","indexOf","copyOfRange","bitmapToByte","byteToBitmap","drawableToBitmap","bitmapToDrawable"));
        ignoreUnPublicMap.put("LocationWorker", ArrayUtils.asListArgs("test"));
        ignoreUnPublicMap.put("LogWorker", ArrayUtils.asListArgs("code","createData","getLog"));
        ignoreUnPublicMap.put("LubanUtils.OnCompressListener", ArrayUtils.asListArgs("onStart","onSuccess","onError","onComplete"));
        ignoreUnPublicMap.put("WebViewAssist.Builder", ArrayUtils.asListArgs("setWebViewAssist","applyPri"));
        ignoreUnPublicMap.put("WebViewAssist.Builder.OnApplyListener", ArrayUtils.asListArgs("onApply"));

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
        ignoreReturnVoidMap.put("ACache", ArrayUtils.asListArgs("clear - void"));
        ignoreReturnVoidMap.put("ACacheManager", ArrayUtils.asListArgs("calculateCacheSizeAndCacheCount - void","put - void","clear - void"));
        ignoreReturnVoidMap.put("ChainWorker", ArrayUtils.asListArgs("start - void"));
        ignoreReturnVoidMap.put("EventBusUtils", ArrayUtils.asListArgs("register - void","unregister - void","post - void","cancelEventDelivery - void","postSticky - void","removeStickyEvent - void","removeAllStickyEvents - void"));
        ignoreReturnVoidMap.put("LogWorker", ArrayUtils.asListArgs("onStopped - void","code - void","observe - void"));
        ignoreReturnVoidMap.put("LubanUtils.OnCompressListener", ArrayUtils.asListArgs("onStart - void","onSuccess - void","onError - void","onComplete - void"));
        ignoreReturnVoidMap.put("MMKVUtils", ArrayUtils.asListArgs("initialize - void"));
        ignoreReturnVoidMap.put("WebViewAssist", ArrayUtils.asListArgs("setGlobalBuilder - void","removeCookie - void"));
        ignoreReturnVoidMap.put("WebViewAssist.Builder.OnApplyListener", ArrayUtils.asListArgs("onApply - void"));

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