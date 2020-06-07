package javadoc.dev_utils.check.dev_other;

import javadoc.Utils;
import javadoc.dev_utils.check.dev.ICheckConfig;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
    public Map<String, ArrayList<String>> getIgnoreAnnotateMap() {
        Map<String, ArrayList<String>> ignoreAnnotateMap = new HashMap<>();
        ignoreAnnotateMap.put("AccessibilityListenerService", Utils.asList("onCreate","onDestroy"));
        ignoreAnnotateMap.put("AppStateReceiver", Utils.asList("onReceive"));
        ignoreAnnotateMap.put("BatteryReceiver", Utils.asList("onReceive"));
        ignoreAnnotateMap.put("GlideTransformUtils.GlideBlurformation", Utils.asList("transform","updateDiskCacheKey"));
        ignoreAnnotateMap.put("GlideTransformUtils.GlideCircleTransform", Utils.asList("transform","circleCrop","updateDiskCacheKey"));
        ignoreAnnotateMap.put("GlideTransformUtils.GlideRoundTransform", Utils.asList("transform","roundCrop","updateDiskCacheKey"));
        ignoreAnnotateMap.put("GlideTransformUtils.RotateTransformation", Utils.asList("transform","updateDiskCacheKey"));
        ignoreAnnotateMap.put("GlideUtils", Utils.asList("with","with","with","with","with","with"));
        ignoreAnnotateMap.put("HttpLoggingInterceptor", Utils.asList("intercept","isPlaintext","bodyEncoded"));
        ignoreAnnotateMap.put("NetWorkReceiver", Utils.asList("onReceive"));
        ignoreAnnotateMap.put("NotificationService", Utils.asList("onCreate","onDestroy","onStartCommand"));
        ignoreAnnotateMap.put("OkGoResponse.Builder", Utils.asList("setData","setMessage","setCode","setToast","setResult","setOriginal","setException"));
        ignoreAnnotateMap.put("PhoneReceiver", Utils.asList("onReceive"));
        ignoreAnnotateMap.put("ScreenReceiver", Utils.asList("onReceive"));
        ignoreAnnotateMap.put("SmsReceiver", Utils.asList("onReceive"));
        ignoreAnnotateMap.put("TimeReceiver", Utils.asList("onReceive"));
        ignoreAnnotateMap.put("WifiReceiver", Utils.asList("onReceive"));

        return ignoreAnnotateMap;
    }

    /**
     * 获取忽略指定方法参数 final 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreFinalMap() {
        Map<String, ArrayList<String>> ignoreFinalMap = new HashMap<>();
        ignoreFinalMap.put("AccessibilityListenerService", Utils.asList("onAccessibilityEvent"));
        ignoreFinalMap.put("AppStateReceiver", Utils.asList("onReceive"));
        ignoreFinalMap.put("BatteryReceiver", Utils.asList("onReceive"));
        ignoreFinalMap.put("GlideTransformUtils.GlideBlurformation", Utils.asList("transform","updateDiskCacheKey","blurBitmap"));
        ignoreFinalMap.put("GlideTransformUtils.GlideCircleTransform", Utils.asList("transform","circleCrop","updateDiskCacheKey"));
        ignoreFinalMap.put("GlideTransformUtils.GlideRoundTransform", Utils.asList("transform","roundCrop","updateDiskCacheKey"));
        ignoreFinalMap.put("GlideTransformUtils.RotateTransformation", Utils.asList("transform","updateDiskCacheKey"));
        ignoreFinalMap.put("GlideUtils", Utils.asList("with","with","with","with","with","with"));
        ignoreFinalMap.put("HttpLoggingInterceptor", Utils.asList("intercept","_finalPrintLog","isPlaintext","bodyEncoded"));
        ignoreFinalMap.put("NetWorkReceiver", Utils.asList("onReceive"));
        ignoreFinalMap.put("NotificationService", Utils.asList("onNotificationPosted","onNotificationRemoved","onStartCommand"));
        ignoreFinalMap.put("OkGoDemo", Utils.asList("getUserInfo","getUserList","uploadImage","uploadImages"));
        ignoreFinalMap.put("OkGoResponse.Builder", Utils.asList("setData","setMessage","setCode","setToast","setResult","setOriginal","setException"));
        ignoreFinalMap.put("OkGoUtils", Utils.asList("initOkGo","execute","execute"));
        ignoreFinalMap.put("PhoneReceiver", Utils.asList("onReceive"));
        ignoreFinalMap.put("ScreenReceiver", Utils.asList("onReceive"));
        ignoreFinalMap.put("SmsReceiver", Utils.asList("onReceive"));
        ignoreFinalMap.put("TimeReceiver", Utils.asList("onReceive"));
        ignoreFinalMap.put("WifiReceiver", Utils.asList("onReceive"));

        return ignoreFinalMap;
    }

    /**
     * 获取忽略指定方法 static 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreStaticMap() {
        Map<String, ArrayList<String>> ignoreStaticMap = new HashMap<>();
        ignoreStaticMap.put("AccessibilityListenerService", Utils.asList("onAccessibilityEvent","onInterrupt","onServiceConnected","onCreate","onDestroy"));
        ignoreStaticMap.put("AppStateReceiver", Utils.asList("onReceive"));
        ignoreStaticMap.put("BatteryReceiver", Utils.asList("onReceive"));
        ignoreStaticMap.put("GlideTransformUtils.GlideBlurformation", Utils.asList("transform","updateDiskCacheKey","blurBitmap"));
        ignoreStaticMap.put("GlideTransformUtils.GlideCircleTransform", Utils.asList("transform","circleCrop","updateDiskCacheKey"));
        ignoreStaticMap.put("GlideTransformUtils.GlideRoundTransform", Utils.asList("transform","roundCrop","updateDiskCacheKey"));
        ignoreStaticMap.put("GlideTransformUtils.RotateTransformation", Utils.asList("transform","updateDiskCacheKey"));
        ignoreStaticMap.put("GlideUtils.GlideLoader", Utils.asList("preload","preload","displayImage","displayImage","displayImage","displayImage","displayImageToGif","displayImageToGif","displayImageToGif","displayImageToGif","displayImageToDrawable","displayImageToDrawable","displayImageToDrawable","displayImageToDrawable","displayImageToFile","displayImageToFile","displayImageToFile","displayImageToFile","loadImageBitmap","loadImageBitmap","loadImageDrawable","loadImageDrawable","loadImageFile","loadImageFile","loadImageGif","loadImageGif","cancelDisplayTask","cancelDisplayTask","destroy","pause","resume","stop","start"));
        ignoreStaticMap.put("HttpLoggingInterceptor", Utils.asList("intercept","_finalPrintLog","isPlaintext","bodyEncoded"));
        ignoreStaticMap.put("NetWorkReceiver", Utils.asList("onReceive"));
        ignoreStaticMap.put("NotificationService", Utils.asList("onNotificationPosted","onNotificationRemoved","onCreate","onDestroy","onStartCommand","cancelNotification"));
        ignoreStaticMap.put("OkGoResponse", Utils.asList("getDataString"));
        ignoreStaticMap.put("OkGoResponse.Builder", Utils.asList("build","setData","setMessage","setCode","setToast","setResult","setOriginal","setException"));
        ignoreStaticMap.put("PhoneReceiver", Utils.asList("onReceive"));
        ignoreStaticMap.put("PictureSelectorUtils.PicConfig", Utils.asList("getMimeType","setMimeType","getSelectionMode","setSelectionMode","isCamera","setCamera","isCrop","setCrop","isCircleCrop","setCircleCrop","isCompress","setCompress","getMinimumCompressSize","setMinimumCompressSize","getWithAspectRatio","setWithAspectRatio","isGif","setGif","getImageSpanCount","setImageSpanCount","getMinSelectNum","setMinSelectNum","getMaxSelectNum","setMaxSelectNum","getLocalMedia","setLocalMedia","getCameraSavePath","setCameraSavePath","getCompressSavePath","setCompressSavePath","clone","set"));
        ignoreStaticMap.put("ScreenReceiver", Utils.asList("onReceive"));
        ignoreStaticMap.put("SmsReceiver", Utils.asList("onReceive"));
        ignoreStaticMap.put("TimeReceiver", Utils.asList("onReceive"));
        ignoreStaticMap.put("WebViewAssist", Utils.asList("setWebView","getWebView","isWebViewNotEmpty","setBuilder","setBuilder","getBuilder","apply","loadUrl","loadUrl","loadData","loadDataWithBaseURL","postUrl","loadDataWithBaseURL","loadDataWithBaseURL","getSettings","getUserAgentString","setUserAgentString","addJavascriptInterface","removeJavascriptInterface","evaluateJavascript","setWebViewClient","getWebViewClient","setWebChromeClient","getWebChromeClient","destroy","canGoBack","goBack","canGoForward","goForward","canGoBackOrForward","goBackOrForward","reload","stopLoading","clearCache","clearHistory","clearFormData","getScale","getScrollY","getScrollX","getContentHeight","getScaleHeight","getScaleHeight","getHeight","pageDown","pageUp","handlerKeyDown","setLayerTypeSoftware","setLayerType","getUrl","getOriginalUrl","getHitTestResult"));
        ignoreStaticMap.put("WebViewAssist.Builder", Utils.asList("setWebViewAssist","apply","setOnApplyListener","getApplyListener","clone","reset","applyPri","isJavaScriptEnabled","setJavaScriptEnabled","getRenderPriority","setRenderPriority","isUseWideViewPort","setUseWideViewPort","isLoadWithOverviewMode","setLoadWithOverviewMode","getLayoutAlgorithm","setLayoutAlgorithm","isSupportZoom","setSupportZoom","isBuiltInZoomControls","setBuiltInZoomControls","isDisplayZoomControls","setDisplayZoomControls","getTextZoom","setTextZoom","getStandardFontFamily","setStandardFontFamily","getDefaultFontSize","setDefaultFontSize","getMinimumFontSize","setMinimumFontSize","getMixedContentMode","setMixedContentMode","isLoadsImagesAutomatically","setLoadsImagesAutomatically","isJavaScriptCanOpenWindowsAutomatically","setJavaScriptCanOpenWindowsAutomatically","getDefaultTextEncodingName","setDefaultTextEncodingName","isGeolocationEnabled","setGeolocationEnabled","getUserAgentString","setUserAgentString","isAllowFileAccess","setAllowFileAccess","isAllowFileAccessFromFileURLs","setAllowFileAccessFromFileURLs","isAllowUniversalAccessFromFileURLs","setAllowUniversalAccessFromFileURLs","getCacheMode","setCacheMode","isDomStorageEnabled","setDomStorageEnabled","isAppCacheEnabled","setAppCacheEnabled","getAppCachePath","setAppCachePath","getAppCacheMaxSize","setAppCacheMaxSize","isDatabaseEnabled","setDatabaseEnabled","getDatabasePath","setDatabasePath"));
        ignoreStaticMap.put("WifiReceiver", Utils.asList("onReceive"));

        return ignoreStaticMap;
    }

    /**
     * 获取忽略指定方法 @param 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreParamMap() {
        Map<String, ArrayList<String>> ignoreParamMap = new HashMap<>();
        ignoreParamMap.put("AppStateReceiver", Utils.asList("onReceive"));
        ignoreParamMap.put("BatteryReceiver", Utils.asList("onReceive"));
        ignoreParamMap.put("GlideTransformUtils.GlideBlurformation", Utils.asList("transform","updateDiskCacheKey","blurBitmap"));
        ignoreParamMap.put("GlideTransformUtils.GlideCircleTransform", Utils.asList("transform","circleCrop","updateDiskCacheKey"));
        ignoreParamMap.put("GlideTransformUtils.GlideRoundTransform", Utils.asList("transform","roundCrop","updateDiskCacheKey"));
        ignoreParamMap.put("GlideTransformUtils.RotateTransformation", Utils.asList("transform","updateDiskCacheKey"));
        ignoreParamMap.put("GlideUtils", Utils.asList("with","with","with","with","with","with"));
        ignoreParamMap.put("HttpLoggingInterceptor", Utils.asList("intercept","isPlaintext","bodyEncoded"));
        ignoreParamMap.put("NetWorkReceiver", Utils.asList("onReceive"));
        ignoreParamMap.put("NotificationService", Utils.asList("onStartCommand"));
        ignoreParamMap.put("OkGoCallback", Utils.asList("onStart","uploadProgress","downloadProgress","onCacheSuccess","onError","onSuccess","convertResponse"));
        ignoreParamMap.put("OkGoResponse.Builder", Utils.asList("setData","setMessage","setCode","setToast","setResult","setOriginal","setException"));
        ignoreParamMap.put("PhoneReceiver", Utils.asList("onReceive"));
        ignoreParamMap.put("ScreenReceiver", Utils.asList("onReceive"));
        ignoreParamMap.put("SmsReceiver", Utils.asList("onReceive"));
        ignoreParamMap.put("TimeReceiver", Utils.asList("onReceive"));
        ignoreParamMap.put("WifiReceiver", Utils.asList("onReceive"));

        return ignoreParamMap;
    }

    /**
     * 获取忽略指定方法 @return 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreReturnMap() {
        Map<String, ArrayList<String>> ignoreReturnMap = new HashMap<>();
        ignoreReturnMap.put("OkGoCallback", Utils.asList("convertResponse"));

        return ignoreReturnMap;
    }

    /**
     * 获取忽略指定方法非 public 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreUnPublicMap() {
        Map<String, ArrayList<String>> ignoreUnPublicMap = new HashMap<>();
        ignoreUnPublicMap.put("AccessibilityListenerService", Utils.asList("onServiceConnected"));
        ignoreUnPublicMap.put("AppStateReceiver.AppStateListener", Utils.asList("onAdded","onReplaced","onRemoved"));
        ignoreUnPublicMap.put("BatteryReceiver.BatteryListener", Utils.asList("onBatteryChanged","onBatteryLow","onBatteryOkay","onPowerConnected","onPowerUsageSummary"));
        ignoreUnPublicMap.put("GlideTransformUtils.GlideBlurformation", Utils.asList("transform"));
        ignoreUnPublicMap.put("GlideTransformUtils.GlideCircleTransform", Utils.asList("transform","circleCrop"));
        ignoreUnPublicMap.put("GlideTransformUtils.GlideRoundTransform", Utils.asList("transform","roundCrop"));
        ignoreUnPublicMap.put("GlideTransformUtils.RotateTransformation", Utils.asList("transform"));
        ignoreUnPublicMap.put("HttpLoggingInterceptor", Utils.asList("_finalPrintLog","isPlaintext","bodyEncoded"));
        ignoreUnPublicMap.put("NetWorkReceiver.NetwordStateListener", Utils.asList("onNetworkState"));
        ignoreUnPublicMap.put("NotificationService.NotificationListener", Utils.asList("onServiceCreated","onServiceDestroy","onStartCommand","onNotificationPosted","onNotificationRemoved"));
        ignoreUnPublicMap.put("OkGoCallback", Utils.asList("_response","isSuccess"));
        ignoreUnPublicMap.put("OkGoDemo", Utils.asList("demo"));
        ignoreUnPublicMap.put("PhoneReceiver.PhoneListener", Utils.asList("onPhoneStateChanged"));
        ignoreUnPublicMap.put("ScreenReceiver.ScreenListener", Utils.asList("screenOn","screenOff","userPresent"));
        ignoreUnPublicMap.put("TimeReceiver.TimeListener", Utils.asList("onTimeZoneChanged","onTimeChanged","onTimeTick"));
        ignoreUnPublicMap.put("WebViewAssist.Builder", Utils.asList("setWebViewAssist","applyPri"));
        ignoreUnPublicMap.put("WebViewAssist.Builder.OnApplyListener", Utils.asList("onApply"));
        ignoreUnPublicMap.put("ZXingQRCodeUtils.QRResultCallBack", Utils.asList("onResult"));
        ignoreUnPublicMap.put("ZXingQRCodeUtils.QRScanCallBack", Utils.asList("onResult"));

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
        ignoreReturnVoidMap.put("AccessibilityListenerService", Utils.asList("onAccessibilityEvent - void","onInterrupt - void","onServiceConnected - void","startService - void","stopService - void","setAccessibilityListener - void"));
        ignoreReturnVoidMap.put("AccessibilityListenerService.AccessibilityListener", Utils.asList("onAccessibilityEvent - void","onInterrupt - void","onServiceCreated - void","onServiceDestroy - void"));
        ignoreReturnVoidMap.put("AppStateReceiver", Utils.asList("registerReceiver - void","unregisterReceiver - void"));
        ignoreReturnVoidMap.put("AppStateReceiver.AppStateListener", Utils.asList("onAdded - void","onReplaced - void","onRemoved - void"));
        ignoreReturnVoidMap.put("BatteryReceiver", Utils.asList("registerReceiver - void","unregisterReceiver - void"));
        ignoreReturnVoidMap.put("BatteryReceiver.BatteryListener", Utils.asList("onBatteryChanged - void","onBatteryLow - void","onBatteryOkay - void","onPowerConnected - void","onPowerUsageSummary - void"));
        ignoreReturnVoidMap.put("EventBusUtils", Utils.asList("register - void","unregister - void","post - void","cancelEventDelivery - void","postSticky - void","removeStickyEvent - void","removeAllStickyEvents - void"));
        ignoreReturnVoidMap.put("GlideUtils", Utils.asList("init - void","clearDiskCache - void","clearMemoryCache - void","onLowMemory - void"));
        ignoreReturnVoidMap.put("GlideUtils.GlideLoader", Utils.asList("preload - void","preload - void","displayImage - void","displayImage - void","displayImage - void","displayImage - void","displayImageToGif - void","displayImageToGif - void","displayImageToGif - void","displayImageToGif - void","displayImageToDrawable - void","displayImageToDrawable - void","displayImageToDrawable - void","displayImageToDrawable - void","displayImageToFile - void","displayImageToFile - void","displayImageToFile - void","displayImageToFile - void","loadImageBitmap - void","loadImageBitmap - void","loadImageDrawable - void","loadImageDrawable - void","loadImageFile - void","loadImageFile - void","loadImageGif - void","loadImageGif - void","cancelDisplayTask - void","cancelDisplayTask - void","destroy - void","pause - void","resume - void","stop - void","start - void"));
        ignoreReturnVoidMap.put("HttpLoggingInterceptor", Utils.asList("_finalPrintLog - void"));
        ignoreReturnVoidMap.put("ImageLoaderUtils", Utils.asList("init - void","displayImage - void","displayImage - void","displayImage - void","displayImage - void","displayImage - void","displayImage - void","displayImage - void","displayImage - void","loadImage - void","loadImage - void","loadImage - void","loadImage - void","loadImage - void","loadImage - void","clearDiskCache - void","clearMemoryCache - void","handleSlowNetwork - void","denyNetworkDownloads - void","cancelDisplayTask - void","setDefaultLoadingListener - void","destroy - void","pause - void","resume - void","stop - void"));
        ignoreReturnVoidMap.put("NetWorkReceiver", Utils.asList("registerReceiver - void","unregisterReceiver - void"));
        ignoreReturnVoidMap.put("NetWorkReceiver.NetwordStateListener", Utils.asList("onNetworkState - void"));
        ignoreReturnVoidMap.put("NotificationService", Utils.asList("onNotificationPosted - void","onNotificationRemoved - void","startService - void","stopService - void","startNotificationListenSettings - void","cancelNotification - void","setNotificationListener - void"));
        ignoreReturnVoidMap.put("NotificationService.NotificationListener", Utils.asList("onServiceCreated - void","onServiceDestroy - void","onNotificationPosted - void","onNotificationRemoved - void"));
        ignoreReturnVoidMap.put("OkGoCallback", Utils.asList("onStart - void","onFinish - void","uploadProgress - void","downloadProgress - void","onCacheSuccess - void","onError - void","onSuccess - void","onSuccessResponse - void","onErrorResponse - void","_response - void"));
        ignoreReturnVoidMap.put("OkGoDemo", Utils.asList("getUserInfo - void","getUserList - void","uploadImage - void","uploadImages - void","demo - void"));
        ignoreReturnVoidMap.put("OkGoUtils", Utils.asList("initOkGo - void","execute - void","execute - void"));
        ignoreReturnVoidMap.put("PhoneReceiver", Utils.asList("registerReceiver - void","unregisterReceiver - void"));
        ignoreReturnVoidMap.put("PhoneReceiver.PhoneListener", Utils.asList("onPhoneStateChanged - void"));
        ignoreReturnVoidMap.put("PictureSelectorUtils", Utils.asList("setPicConfig - void","setSavePath - void","setMinimumCompressSize - void","deleteCacheDirFile - void"));
        ignoreReturnVoidMap.put("ScreenReceiver", Utils.asList("registerReceiver - void","unregisterReceiver - void"));
        ignoreReturnVoidMap.put("ScreenReceiver.ScreenListener", Utils.asList("screenOn - void","screenOff - void","userPresent - void"));
        ignoreReturnVoidMap.put("SmsReceiver", Utils.asList("registerReceiver - void","unregisterReceiver - void"));
        ignoreReturnVoidMap.put("SmsReceiver.SmsListener", Utils.asList("onMessage - void","onMessage - void"));
        ignoreReturnVoidMap.put("TimeReceiver", Utils.asList("registerReceiver - void","unregisterReceiver - void"));
        ignoreReturnVoidMap.put("TimeReceiver.TimeListener", Utils.asList("onTimeZoneChanged - void","onTimeChanged - void","onTimeTick - void"));
        ignoreReturnVoidMap.put("WebViewAssist", Utils.asList("setGlobalBuilder - void","removeCookie - void"));
        ignoreReturnVoidMap.put("WebViewAssist.Builder.OnApplyListener", Utils.asList("onApply - void"));
        ignoreReturnVoidMap.put("WifiReceiver", Utils.asList("registerReceiver - void","unregisterReceiver - void"));
        ignoreReturnVoidMap.put("WifiReceiver.WifiListener", Utils.asList("onIntoTrigger - void","onTrigger - void","onTrigger - void","onWifiSwitch - void"));
        ignoreReturnVoidMap.put("ZXingQRCodeUtils", Utils.asList("createQRCodeImage - void","createQRCodeImage - void","createQRCodeImage - void","decodeQRCode - void"));
        ignoreReturnVoidMap.put("ZXingQRCodeUtils.QRResultCallBack", Utils.asList("onResult - void"));
        ignoreReturnVoidMap.put("ZXingQRCodeUtils.QRScanCallBack", Utils.asList("onResult - void"));

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