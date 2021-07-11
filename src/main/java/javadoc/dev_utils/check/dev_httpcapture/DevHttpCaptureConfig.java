package javadoc.dev_utils.check.dev_httpcapture;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dev.utils.common.ArrayUtils;
import javadoc.dev_utils.check.dev.ICheckConfig;

/**
 * detail: DevHttpCaptureConfig 代码检测分析配置
 * @author Ttt
 */
final class DevHttpCaptureConfig implements ICheckConfig {

    /**
     * 获取忽略指定方法注释配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreAnnotateMap() {
        Map<String, List<String>> ignoreAnnotateMap = new HashMap<>();
        ignoreAnnotateMap.put("CallbackInterceptor", ArrayUtils.asListArgs("intercept","isPlaintext","bodyEncoded"));
        ignoreAnnotateMap.put("CaptureFile", ArrayUtils.asListArgs("getUrl","getMethod","getHttpCaptureData","isEncrypt","getTime","getFileName","getModuleName","setUrl","setMethod","setHttpCaptureData","setEncrypt","setTime","setFileName","setModuleName"));
        ignoreAnnotateMap.put("CaptureInfo", ArrayUtils.asListArgs("getRequestUrl","getRequestMethod","getRequestHeader","getRequestBody","getResponseStatus","getResponseHeader","getResponseBody"));
        ignoreAnnotateMap.put("CaptureItem", ArrayUtils.asListArgs("getYyyyMMdd","getData","setYyyyMMdd"));
        ignoreAnnotateMap.put("HttpCaptureInterceptor", ArrayUtils.asListArgs("getModuleName","getEncrypt","getHttpFilter","isCapture","setCapture","getModulePath","getModuleHttpCaptures","intercept","isPlaintext","bodyEncoded"));

        return ignoreAnnotateMap;
    }

    /**
     * 获取忽略指定方法参数 final 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreFinalMap() {
        Map<String, List<String>> ignoreFinalMap = new HashMap<>();
        ignoreFinalMap.put("CallbackInterceptor", ArrayUtils.asListArgs("intercept","innerResponse"));
        ignoreFinalMap.put("CaptureFile", ArrayUtils.asListArgs("setUrl","setMethod","setHttpCaptureData","setEncrypt","setTime","setFileName","setModuleName"));
        ignoreFinalMap.put("CaptureItem", ArrayUtils.asListArgs("setYyyyMMdd"));
        ignoreFinalMap.put("HttpCaptureInterceptor", ArrayUtils.asListArgs("setCapture","intercept","innerResponse"));

        return ignoreFinalMap;
    }

    /**
     * 获取忽略指定方法 static 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreStaticMap() {
        Map<String, List<String>> ignoreStaticMap = new HashMap<>();
        ignoreStaticMap.put("CallbackInterceptor", ArrayUtils.asListArgs("intercept","innerResponse","finalHttpCallback","isPlaintext","bodyEncoded"));
        ignoreStaticMap.put("CaptureFile", ArrayUtils.asListArgs("getUrl","getMethod","getHttpCaptureData","isEncrypt","getTime","getFileName","getModuleName","setUrl","setMethod","setHttpCaptureData","setEncrypt","setTime","setFileName","setModuleName","getCaptureInfo","toJson","deleteFile","getFile"));
        ignoreStaticMap.put("CaptureInfo", ArrayUtils.asListArgs("getRequestUrl","getRequestMethod","getRequestHeader","getRequestBody","getResponseStatus","getResponseHeader","getResponseBody","toJson"));
        ignoreStaticMap.put("CaptureItem", ArrayUtils.asListArgs("getYyyyMMdd","getData","setYyyyMMdd"));
        ignoreStaticMap.put("HttpCaptureInterceptor", ArrayUtils.asListArgs("getModuleName","getEncrypt","getHttpFilter","isCapture","setCapture","getModulePath","getModuleHttpCaptures","intercept","innerResponse","finalHttpCaptureSave","isPlaintext","bodyEncoded"));

        return ignoreStaticMap;
    }

    /**
     * 获取忽略指定方法 @param 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreParamMap() {
        Map<String, List<String>> ignoreParamMap = new HashMap<>();
        ignoreParamMap.put("CallbackInterceptor", ArrayUtils.asListArgs("intercept","innerResponse","isPlaintext","bodyEncoded"));
        ignoreParamMap.put("CaptureFile", ArrayUtils.asListArgs("setUrl","setMethod","setHttpCaptureData","setEncrypt","setTime","setFileName","setModuleName"));
        ignoreParamMap.put("CaptureItem", ArrayUtils.asListArgs("setYyyyMMdd"));
        ignoreParamMap.put("HttpCaptureInterceptor", ArrayUtils.asListArgs("setCapture","intercept","innerResponse","isPlaintext","bodyEncoded"));

        return ignoreParamMap;
    }

    /**
     * 获取忽略指定方法 @return 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreReturnMap() {
        Map<String, List<String>> ignoreReturnMap = new HashMap<>();
        ignoreReturnMap.put("CallbackInterceptor", ArrayUtils.asListArgs("innerResponse"));
        ignoreReturnMap.put("HttpCaptureInterceptor", ArrayUtils.asListArgs("innerResponse"));

        return ignoreReturnMap;
    }

    /**
     * 获取忽略指定方法非 public 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreUnPublicMap() {
        Map<String, List<String>> ignoreUnPublicMap = new HashMap<>();
        ignoreUnPublicMap.put("CallbackInterceptor", ArrayUtils.asListArgs("finalHttpCallback","isPlaintext","bodyEncoded"));
        ignoreUnPublicMap.put("CaptureFile", ArrayUtils.asListArgs("setUrl","setMethod","setHttpCaptureData","setEncrypt","setTime","setFileName","setModuleName"));
        ignoreUnPublicMap.put("CaptureItem", ArrayUtils.asListArgs("setYyyyMMdd"));
        ignoreUnPublicMap.put("HttpCaptureInterceptor", ArrayUtils.asListArgs("finalHttpCaptureSave","isPlaintext","bodyEncoded"));
        ignoreUnPublicMap.put("IHttpCapture", ArrayUtils.asListArgs("getModuleName","getEncrypt","getHttpFilter","isCapture","setCapture","getModulePath","getModuleHttpCaptures"));
        ignoreUnPublicMap.put("IHttpCaptureCallback", ArrayUtils.asListArgs("callback"));
        ignoreUnPublicMap.put("IHttpFilter", ArrayUtils.asListArgs("filter"));
        ignoreUnPublicMap.put("Utils", ArrayUtils.asListArgs("getUniqueFileName"));

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
        ignoreReturnVoidMap.put("CallbackInterceptor", ArrayUtils.asListArgs("finalHttpCallback - void"));
        ignoreReturnVoidMap.put("HttpCaptureInterceptor", ArrayUtils.asListArgs("finalHttpCaptureSave - void"));
        ignoreReturnVoidMap.put("IHttpCapture", ArrayUtils.asListArgs("setCapture - void"));
        ignoreReturnVoidMap.put("IHttpCaptureCallback", ArrayUtils.asListArgs("callback - void"));

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