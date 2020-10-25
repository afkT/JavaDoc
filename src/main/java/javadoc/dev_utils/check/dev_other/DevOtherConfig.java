package javadoc.dev_utils.check.dev_other;

import javadoc.Utils;
import javadoc.dev_utils.check.dev.ICheckConfig;

import java.util.HashMap;
import java.util.List;
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
    public Map<String, List<String>> getIgnoreAnnotateMap() {
        Map<String, List<String>> ignoreAnnotateMap = new HashMap<>();
        ignoreAnnotateMap.put("AccessibilityListenerService", Utils.asListArgs("onCreate","onDestroy"));
        ignoreAnnotateMap.put("AppStateReceiver", Utils.asListArgs("onReceive"));
        ignoreAnnotateMap.put("BaseBeanSubscriber", Utils.asListArgs("onNext","onError","onStart","onComplete"));
        ignoreAnnotateMap.put("BaseResponse", Utils.asListArgs("getOriginal"));
        ignoreAnnotateMap.put("BaseResponseSubscriber", Utils.asListArgs("onNext","onError","onStart","onComplete"));
        ignoreAnnotateMap.put("BatteryReceiver", Utils.asListArgs("onReceive"));
        ignoreAnnotateMap.put("GlideEngine", Utils.asListArgs("createGlideEngine"));
        ignoreAnnotateMap.put("GlideTransformUtils.GlideBlurformation", Utils.asListArgs("transform","updateDiskCacheKey"));
        ignoreAnnotateMap.put("GlideTransformUtils.GlideCircleTransform", Utils.asListArgs("transform","circleCrop","updateDiskCacheKey"));
        ignoreAnnotateMap.put("GlideTransformUtils.GlideRoundTransform", Utils.asListArgs("transform","roundCrop","updateDiskCacheKey"));
        ignoreAnnotateMap.put("GlideTransformUtils.RotateTransformation", Utils.asListArgs("transform","updateDiskCacheKey"));
        ignoreAnnotateMap.put("GlideUtils", Utils.asListArgs("with","with","with","with","with","with"));
        ignoreAnnotateMap.put("HttpLoggingInterceptor", Utils.asListArgs("intercept","isPlaintext","bodyEncoded"));
        ignoreAnnotateMap.put("NetWorkReceiver", Utils.asListArgs("onReceive"));
        ignoreAnnotateMap.put("NotificationService", Utils.asListArgs("onCreate","onDestroy","onStartCommand"));
        ignoreAnnotateMap.put("OkGoResponse.Builder", Utils.asListArgs("setData","setMessage","setCode","setToast","setResult","setOriginal","setException"));
        ignoreAnnotateMap.put("PhoneReceiver", Utils.asListArgs("onReceive"));
        ignoreAnnotateMap.put("RetrofitManager", Utils.asListArgs("getInstance"));
        ignoreAnnotateMap.put("RxJavaManager", Utils.asListArgs("getInstance"));
        ignoreAnnotateMap.put("ScreenReceiver", Utils.asListArgs("onReceive"));
        ignoreAnnotateMap.put("SmsReceiver", Utils.asListArgs("onReceive"));
        ignoreAnnotateMap.put("TimeReceiver", Utils.asListArgs("onReceive"));
        ignoreAnnotateMap.put("WifiReceiver", Utils.asListArgs("onReceive"));

        return ignoreAnnotateMap;
    }

    /**
     * 获取忽略指定方法参数 final 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreFinalMap() {
        Map<String, List<String>> ignoreFinalMap = new HashMap<>();
        ignoreFinalMap.put("AccessibilityListenerService", Utils.asListArgs("onAccessibilityEvent"));
        ignoreFinalMap.put("AppStateReceiver", Utils.asListArgs("onReceive"));
        ignoreFinalMap.put("BatteryReceiver", Utils.asListArgs("onReceive"));
        ignoreFinalMap.put("GlideEngine", Utils.asListArgs("loadImage","loadImage","loadImage","loadFolderImage","loadAsGifImage","loadGridImage"));
        ignoreFinalMap.put("GlideTransformUtils.GlideBlurformation", Utils.asListArgs("transform","updateDiskCacheKey","blurBitmap"));
        ignoreFinalMap.put("GlideTransformUtils.GlideCircleTransform", Utils.asListArgs("transform","circleCrop","updateDiskCacheKey"));
        ignoreFinalMap.put("GlideTransformUtils.GlideRoundTransform", Utils.asListArgs("transform","roundCrop","updateDiskCacheKey"));
        ignoreFinalMap.put("GlideTransformUtils.RotateTransformation", Utils.asListArgs("transform","updateDiskCacheKey"));
        ignoreFinalMap.put("GlideUtils", Utils.asListArgs("with","with","with","with","with","with"));
        ignoreFinalMap.put("HttpLoggingInterceptor", Utils.asListArgs("intercept","_finalPrintLog","isPlaintext","bodyEncoded"));
        ignoreFinalMap.put("LubanUtils", Utils.asListArgs("compress","compress","compress","compress","compress","compress","compress"));
        ignoreFinalMap.put("NetWorkReceiver", Utils.asListArgs("onReceive"));
        ignoreFinalMap.put("NotificationService", Utils.asListArgs("onNotificationPosted","onNotificationRemoved","onStartCommand"));
        ignoreFinalMap.put("OkGoDemo", Utils.asListArgs("getUserInfo","getUserList","uploadImage","uploadImages"));
        ignoreFinalMap.put("OkGoResponse.Builder", Utils.asListArgs("setData","setMessage","setCode","setToast","setResult","setOriginal","setException"));
        ignoreFinalMap.put("OkGoUtils", Utils.asListArgs("initOkGo","execute","execute"));
        ignoreFinalMap.put("PhoneReceiver", Utils.asListArgs("onReceive"));
        ignoreFinalMap.put("ScreenReceiver", Utils.asListArgs("onReceive"));
        ignoreFinalMap.put("SmsReceiver", Utils.asListArgs("onReceive"));
        ignoreFinalMap.put("TimeReceiver", Utils.asListArgs("onReceive"));
        ignoreFinalMap.put("WifiReceiver", Utils.asListArgs("onReceive"));

        return ignoreFinalMap;
    }

    /**
     * 获取忽略指定方法 static 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreStaticMap() {
        Map<String, List<String>> ignoreStaticMap = new HashMap<>();
        ignoreStaticMap.put("AccessibilityListenerService", Utils.asListArgs("onAccessibilityEvent","onInterrupt","onServiceConnected","onCreate","onDestroy"));
        ignoreStaticMap.put("AppStateReceiver", Utils.asListArgs("onReceive"));
        ignoreStaticMap.put("BaseResponse", Utils.asListArgs("getOriginal"));
        ignoreStaticMap.put("BatteryReceiver", Utils.asListArgs("onReceive"));
        ignoreStaticMap.put("GlideEngine", Utils.asListArgs("loadImage","loadImage","loadImage","loadFolderImage","loadAsGifImage","loadGridImage"));
        ignoreStaticMap.put("GlideTransformUtils.GlideBlurformation", Utils.asListArgs("transform","updateDiskCacheKey","blurBitmap"));
        ignoreStaticMap.put("GlideTransformUtils.GlideCircleTransform", Utils.asListArgs("transform","circleCrop","updateDiskCacheKey"));
        ignoreStaticMap.put("GlideTransformUtils.GlideRoundTransform", Utils.asListArgs("transform","roundCrop","updateDiskCacheKey"));
        ignoreStaticMap.put("GlideTransformUtils.RotateTransformation", Utils.asListArgs("transform","updateDiskCacheKey"));
        ignoreStaticMap.put("GlideUtils.GlideLoader", Utils.asListArgs("preload","preload","displayImage","displayImage","displayImage","displayImage","displayImageToGif","displayImageToGif","displayImageToGif","displayImageToGif","displayImageToDrawable","displayImageToDrawable","displayImageToDrawable","displayImageToDrawable","displayImageToFile","displayImageToFile","displayImageToFile","displayImageToFile","loadImageBitmap","loadImageBitmap","loadImageDrawable","loadImageDrawable","loadImageFile","loadImageFile","loadImageGif","loadImageGif","cancelDisplayTask","cancelDisplayTask","destroy","pause","resume","stop","start"));
        ignoreStaticMap.put("HttpLoggingInterceptor", Utils.asListArgs("intercept","_finalPrintLog","isPlaintext","bodyEncoded"));
        ignoreStaticMap.put("NetWorkReceiver", Utils.asListArgs("onReceive"));
        ignoreStaticMap.put("NotificationService", Utils.asListArgs("onNotificationPosted","onNotificationRemoved","onCreate","onDestroy","onStartCommand","cancelNotification"));
        ignoreStaticMap.put("OkGoResponse", Utils.asListArgs("getDataString"));
        ignoreStaticMap.put("OkGoResponse.Builder", Utils.asListArgs("build","setData","setMessage","setCode","setToast","setResult","setOriginal","setException"));
        ignoreStaticMap.put("PhoneReceiver", Utils.asListArgs("onReceive"));
        ignoreStaticMap.put("PictureSelectorUtils.PicConfig", Utils.asListArgs("getMimeType","setMimeType","getSelectionMode","setSelectionMode","isCamera","setCamera","isCrop","setCrop","isCircleCrop","setCircleCrop","isCompress","setCompress","getMinimumCompressSize","setMinimumCompressSize","getWithAspectRatio","setWithAspectRatio","isGif","setGif","getImageSpanCount","setImageSpanCount","getMinSelectNum","setMinSelectNum","getMaxSelectNum","setMaxSelectNum","getLocalMedia","setLocalMedia","getCameraSavePath","setCameraSavePath","getCompressSavePath","setCompressSavePath","clone","set"));
        ignoreStaticMap.put("RetrofitManager", Utils.asListArgs("get","put","remove","contains","getRetrofitMap","create"));
        ignoreStaticMap.put("RxJavaManager", Utils.asListArgs("add","remove","contains","getManagerMap"));
        ignoreStaticMap.put("ScreenReceiver", Utils.asListArgs("onReceive"));
        ignoreStaticMap.put("SmsReceiver", Utils.asListArgs("onReceive"));
        ignoreStaticMap.put("TimeReceiver", Utils.asListArgs("onReceive"));
        ignoreStaticMap.put("WebViewAssist", Utils.asListArgs("setWebView","getWebView","isWebViewNotEmpty","setBuilder","setBuilder","getBuilder","apply","loadUrl","loadUrl","loadData","loadDataWithBaseURL","postUrl","loadDataWithBaseURL","loadDataWithBaseURL","getSettings","getUserAgentString","setUserAgentString","addJavascriptInterface","removeJavascriptInterface","evaluateJavascript","setWebViewClient","getWebViewClient","setWebChromeClient","getWebChromeClient","destroy","canGoBack","goBack","canGoForward","goForward","canGoBackOrForward","goBackOrForward","reload","stopLoading","clearCache","clearHistory","clearFormData","getScale","getScrollY","getScrollX","getContentHeight","getScaleHeight","getScaleHeight","getHeight","pageDown","pageUp","handlerKeyDown","setLayerTypeSoftware","setLayerType","getUrl","getOriginalUrl","getHitTestResult"));
        ignoreStaticMap.put("WebViewAssist.Builder", Utils.asListArgs("setWebViewAssist","apply","setOnApplyListener","getApplyListener","clone","reset","applyPri","isJavaScriptEnabled","setJavaScriptEnabled","getRenderPriority","setRenderPriority","isUseWideViewPort","setUseWideViewPort","isLoadWithOverviewMode","setLoadWithOverviewMode","getLayoutAlgorithm","setLayoutAlgorithm","isSupportZoom","setSupportZoom","isBuiltInZoomControls","setBuiltInZoomControls","isDisplayZoomControls","setDisplayZoomControls","getTextZoom","setTextZoom","getStandardFontFamily","setStandardFontFamily","getDefaultFontSize","setDefaultFontSize","getMinimumFontSize","setMinimumFontSize","getMixedContentMode","setMixedContentMode","isLoadsImagesAutomatically","setLoadsImagesAutomatically","isJavaScriptCanOpenWindowsAutomatically","setJavaScriptCanOpenWindowsAutomatically","getDefaultTextEncodingName","setDefaultTextEncodingName","isGeolocationEnabled","setGeolocationEnabled","getUserAgentString","setUserAgentString","isAllowFileAccess","setAllowFileAccess","isAllowFileAccessFromFileURLs","setAllowFileAccessFromFileURLs","isAllowUniversalAccessFromFileURLs","setAllowUniversalAccessFromFileURLs","getCacheMode","setCacheMode","isDomStorageEnabled","setDomStorageEnabled","isAppCacheEnabled","setAppCacheEnabled","getAppCachePath","setAppCachePath","getAppCacheMaxSize","setAppCacheMaxSize","isDatabaseEnabled","setDatabaseEnabled","getDatabasePath","setDatabasePath"));
        ignoreStaticMap.put("WifiReceiver", Utils.asListArgs("onReceive"));

        return ignoreStaticMap;
    }

    /**
     * 获取忽略指定方法 @param 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreParamMap() {
        Map<String, List<String>> ignoreParamMap = new HashMap<>();
        ignoreParamMap.put("AppStateReceiver", Utils.asListArgs("onReceive"));
        ignoreParamMap.put("BaseBeanSubscriber", Utils.asListArgs("onNext","onError"));
        ignoreParamMap.put("BaseResponseSubscriber", Utils.asListArgs("onNext","onError"));
        ignoreParamMap.put("BatteryReceiver", Utils.asListArgs("onReceive"));
        ignoreParamMap.put("GlideTransformUtils.GlideBlurformation", Utils.asListArgs("transform","updateDiskCacheKey","blurBitmap"));
        ignoreParamMap.put("GlideTransformUtils.GlideCircleTransform", Utils.asListArgs("transform","circleCrop","updateDiskCacheKey"));
        ignoreParamMap.put("GlideTransformUtils.GlideRoundTransform", Utils.asListArgs("transform","roundCrop","updateDiskCacheKey"));
        ignoreParamMap.put("GlideTransformUtils.RotateTransformation", Utils.asListArgs("transform","updateDiskCacheKey"));
        ignoreParamMap.put("GlideUtils", Utils.asListArgs("with","with","with","with","with","with"));
        ignoreParamMap.put("HttpLoggingInterceptor", Utils.asListArgs("intercept","isPlaintext","bodyEncoded"));
        ignoreParamMap.put("LubanUtils", Utils.asListArgs("compress","compress","compress","compress","compress","compress","compress"));
        ignoreParamMap.put("NetWorkReceiver", Utils.asListArgs("onReceive"));
        ignoreParamMap.put("NotificationService", Utils.asListArgs("onStartCommand"));
        ignoreParamMap.put("OkGoCallback", Utils.asListArgs("onStart","uploadProgress","downloadProgress","onCacheSuccess","onError","onSuccess","convertResponse"));
        ignoreParamMap.put("OkGoResponse.Builder", Utils.asListArgs("setData","setMessage","setCode","setToast","setResult","setOriginal","setException"));
        ignoreParamMap.put("PhoneReceiver", Utils.asListArgs("onReceive"));
        ignoreParamMap.put("ScreenReceiver", Utils.asListArgs("onReceive"));
        ignoreParamMap.put("SmsReceiver", Utils.asListArgs("onReceive"));
        ignoreParamMap.put("TimeReceiver", Utils.asListArgs("onReceive"));
        ignoreParamMap.put("WifiReceiver", Utils.asListArgs("onReceive"));

        return ignoreParamMap;
    }

    /**
     * 获取忽略指定方法 @return 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreReturnMap() {
        Map<String, List<String>> ignoreReturnMap = new HashMap<>();
        ignoreReturnMap.put("OkGoCallback", Utils.asListArgs("convertResponse"));

        return ignoreReturnMap;
    }

    /**
     * 获取忽略指定方法非 public 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreUnPublicMap() {
        Map<String, List<String>> ignoreUnPublicMap = new HashMap<>();
        ignoreUnPublicMap.put("AccessibilityListenerService", Utils.asListArgs("onServiceConnected"));
        ignoreUnPublicMap.put("AppStateReceiver.AppStateListener", Utils.asListArgs("onAdded","onReplaced","onRemoved"));
        ignoreUnPublicMap.put("BaseBeanSubscriber", Utils.asListArgs("onStart","getErrorMessage"));
        ignoreUnPublicMap.put("BaseResponseSubscriber", Utils.asListArgs("onStart","getErrorMessage","isSuccess"));
        ignoreUnPublicMap.put("BatteryReceiver.BatteryListener", Utils.asListArgs("onBatteryChanged","onBatteryLow","onBatteryOkay","onPowerConnected","onPowerUsageSummary"));
        ignoreUnPublicMap.put("GlideTransformUtils.GlideBlurformation", Utils.asListArgs("transform"));
        ignoreUnPublicMap.put("GlideTransformUtils.GlideCircleTransform", Utils.asListArgs("transform","circleCrop"));
        ignoreUnPublicMap.put("GlideTransformUtils.GlideRoundTransform", Utils.asListArgs("transform","roundCrop"));
        ignoreUnPublicMap.put("GlideTransformUtils.RotateTransformation", Utils.asListArgs("transform"));
        ignoreUnPublicMap.put("HttpLoggingInterceptor", Utils.asListArgs("_finalPrintLog","isPlaintext","bodyEncoded"));
        ignoreUnPublicMap.put("LubanUtils", Utils.asListArgs("getContext"));
        ignoreUnPublicMap.put("LubanUtils.OnCompressListener", Utils.asListArgs("onStart","onSuccess","onError","onComplete"));
        ignoreUnPublicMap.put("NetWorkReceiver.NetwordStateListener", Utils.asListArgs("onNetworkState"));
        ignoreUnPublicMap.put("NotificationService.NotificationListener", Utils.asListArgs("onServiceCreated","onServiceDestroy","onStartCommand","onNotificationPosted","onNotificationRemoved"));
        ignoreUnPublicMap.put("OkGoCallback", Utils.asListArgs("_response","isSuccess"));
        ignoreUnPublicMap.put("OkGoDemo", Utils.asListArgs("demo"));
        ignoreUnPublicMap.put("PhoneReceiver.PhoneListener", Utils.asListArgs("onPhoneStateChanged"));
        ignoreUnPublicMap.put("ScreenReceiver.ScreenListener", Utils.asListArgs("screenOn","screenOff","userPresent"));
        ignoreUnPublicMap.put("TimeReceiver.TimeListener", Utils.asListArgs("onTimeZoneChanged","onTimeChanged","onTimeTick"));
        ignoreUnPublicMap.put("WebViewAssist.Builder", Utils.asListArgs("setWebViewAssist","applyPri"));
        ignoreUnPublicMap.put("WebViewAssist.Builder.OnApplyListener", Utils.asListArgs("onApply"));
        ignoreUnPublicMap.put("ZXingQRCodeUtils.QRResultCallBack", Utils.asListArgs("onResult"));
        ignoreUnPublicMap.put("ZXingQRCodeUtils.QRScanCallBack", Utils.asListArgs("onResult"));

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
        ignoreReturnVoidMap.put("AccessibilityListenerService", Utils.asListArgs("onAccessibilityEvent - void","onInterrupt - void","onServiceConnected - void","startService - void","stopService - void","setAccessibilityListener - void"));
        ignoreReturnVoidMap.put("AccessibilityListenerService.AccessibilityListener", Utils.asListArgs("onAccessibilityEvent - void","onInterrupt - void","onServiceCreated - void","onServiceDestroy - void"));
        ignoreReturnVoidMap.put("AppStateReceiver", Utils.asListArgs("registerReceiver - void","unregisterReceiver - void"));
        ignoreReturnVoidMap.put("AppStateReceiver.AppStateListener", Utils.asListArgs("onAdded - void","onReplaced - void","onRemoved - void"));
        ignoreReturnVoidMap.put("BaseBeanSubscriber", Utils.asListArgs("onSuccessResponse - void","onErrorResponse - void"));
        ignoreReturnVoidMap.put("BaseResponseSubscriber", Utils.asListArgs("onSuccessResponse - void","onErrorResponse - void"));
        ignoreReturnVoidMap.put("BatteryReceiver", Utils.asListArgs("registerReceiver - void","unregisterReceiver - void"));
        ignoreReturnVoidMap.put("BatteryReceiver.BatteryListener", Utils.asListArgs("onBatteryChanged - void","onBatteryLow - void","onBatteryOkay - void","onPowerConnected - void","onPowerUsageSummary - void"));
        ignoreReturnVoidMap.put("EventBusUtils", Utils.asListArgs("register - void","unregister - void","post - void","cancelEventDelivery - void","postSticky - void","removeStickyEvent - void","removeAllStickyEvents - void"));
        ignoreReturnVoidMap.put("GlideEngine", Utils.asListArgs("loadImage - void","loadImage - void","loadImage - void","loadFolderImage - void","loadAsGifImage - void","loadGridImage - void"));
        ignoreReturnVoidMap.put("GlideUtils", Utils.asListArgs("init - void","clearDiskCache - void","clearMemoryCache - void","onLowMemory - void"));
        ignoreReturnVoidMap.put("GlideUtils.GlideLoader", Utils.asListArgs("preload - void","preload - void","displayImage - void","displayImage - void","displayImage - void","displayImage - void","displayImageToGif - void","displayImageToGif - void","displayImageToGif - void","displayImageToGif - void","displayImageToDrawable - void","displayImageToDrawable - void","displayImageToDrawable - void","displayImageToDrawable - void","displayImageToFile - void","displayImageToFile - void","displayImageToFile - void","displayImageToFile - void","loadImageBitmap - void","loadImageBitmap - void","loadImageDrawable - void","loadImageDrawable - void","loadImageFile - void","loadImageFile - void","loadImageGif - void","loadImageGif - void","cancelDisplayTask - void","cancelDisplayTask - void","destroy - void","pause - void","resume - void","stop - void","start - void"));
        ignoreReturnVoidMap.put("HttpLoggingInterceptor", Utils.asListArgs("_finalPrintLog - void"));
        ignoreReturnVoidMap.put("ImageLoaderUtils", Utils.asListArgs("init - void","displayImage - void","displayImage - void","displayImage - void","displayImage - void","displayImage - void","displayImage - void","displayImage - void","displayImage - void","loadImage - void","loadImage - void","loadImage - void","loadImage - void","loadImage - void","loadImage - void","clearDiskCache - void","clearMemoryCache - void","handleSlowNetwork - void","denyNetworkDownloads - void","cancelDisplayTask - void","setDefaultLoadingListener - void","destroy - void","pause - void","resume - void","stop - void"));
        ignoreReturnVoidMap.put("LubanUtils", Utils.asListArgs("setConfig - void"));
        ignoreReturnVoidMap.put("LubanUtils.OnCompressListener", Utils.asListArgs("onStart - void","onSuccess - void","onError - void","onComplete - void"));
        ignoreReturnVoidMap.put("NetWorkReceiver", Utils.asListArgs("registerReceiver - void","unregisterReceiver - void"));
        ignoreReturnVoidMap.put("NetWorkReceiver.NetwordStateListener", Utils.asListArgs("onNetworkState - void"));
        ignoreReturnVoidMap.put("NotificationService", Utils.asListArgs("onNotificationPosted - void","onNotificationRemoved - void","startService - void","stopService - void","startNotificationListenSettings - void","cancelNotification - void","setNotificationListener - void"));
        ignoreReturnVoidMap.put("NotificationService.NotificationListener", Utils.asListArgs("onServiceCreated - void","onServiceDestroy - void","onNotificationPosted - void","onNotificationRemoved - void"));
        ignoreReturnVoidMap.put("OkGoCallback", Utils.asListArgs("onStart - void","onFinish - void","uploadProgress - void","downloadProgress - void","onCacheSuccess - void","onError - void","onSuccess - void","onSuccessResponse - void","onErrorResponse - void","_response - void"));
        ignoreReturnVoidMap.put("OkGoDemo", Utils.asListArgs("getUserInfo - void","getUserList - void","uploadImage - void","uploadImages - void","demo - void"));
        ignoreReturnVoidMap.put("OkGoUtils", Utils.asListArgs("initOkGo - void","execute - void","execute - void"));
        ignoreReturnVoidMap.put("PhoneReceiver", Utils.asListArgs("registerReceiver - void","unregisterReceiver - void"));
        ignoreReturnVoidMap.put("PhoneReceiver.PhoneListener", Utils.asListArgs("onPhoneStateChanged - void"));
        ignoreReturnVoidMap.put("PictureSelectorUtils", Utils.asListArgs("setPicConfig - void","setSavePath - void","setMinimumCompressSize - void","deleteCacheDirFile - void"));
        ignoreReturnVoidMap.put("RxJavaManager", Utils.asListArgs("add - void","remove - void"));
        ignoreReturnVoidMap.put("ScreenReceiver", Utils.asListArgs("registerReceiver - void","unregisterReceiver - void"));
        ignoreReturnVoidMap.put("ScreenReceiver.ScreenListener", Utils.asListArgs("screenOn - void","screenOff - void","userPresent - void"));
        ignoreReturnVoidMap.put("SmsReceiver", Utils.asListArgs("registerReceiver - void","unregisterReceiver - void"));
        ignoreReturnVoidMap.put("SmsReceiver.SmsListener", Utils.asListArgs("onMessage - void","onMessage - void"));
        ignoreReturnVoidMap.put("TimeReceiver", Utils.asListArgs("registerReceiver - void","unregisterReceiver - void"));
        ignoreReturnVoidMap.put("TimeReceiver.TimeListener", Utils.asListArgs("onTimeZoneChanged - void","onTimeChanged - void","onTimeTick - void"));
        ignoreReturnVoidMap.put("WebViewAssist", Utils.asListArgs("setGlobalBuilder - void","removeCookie - void"));
        ignoreReturnVoidMap.put("WebViewAssist.Builder.OnApplyListener", Utils.asListArgs("onApply - void"));
        ignoreReturnVoidMap.put("WifiReceiver", Utils.asListArgs("registerReceiver - void","unregisterReceiver - void"));
        ignoreReturnVoidMap.put("WifiReceiver.WifiListener", Utils.asListArgs("onIntoTrigger - void","onTrigger - void","onTrigger - void","onWifiSwitch - void"));
        ignoreReturnVoidMap.put("ZXingQRCodeUtils", Utils.asListArgs("createQRCodeImage - void","createQRCodeImage - void","createQRCodeImage - void","decodeQRCode - void"));
        ignoreReturnVoidMap.put("ZXingQRCodeUtils.QRResultCallBack", Utils.asListArgs("onResult - void"));
        ignoreReturnVoidMap.put("ZXingQRCodeUtils.QRScanCallBack", Utils.asListArgs("onResult - void"));

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