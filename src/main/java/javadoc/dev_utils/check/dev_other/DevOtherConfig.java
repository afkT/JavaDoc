package javadoc.dev_utils.check.dev_other;

import dev.utils.common.ArrayUtils;
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
        ignoreAnnotateMap.put("AccessibilityListenerService", ArrayUtils.asListArgs("onCreate","onDestroy"));
        ignoreAnnotateMap.put("AppStateReceiver", ArrayUtils.asListArgs("onReceive"));
        ignoreAnnotateMap.put("BaseBeanSubscriber", ArrayUtils.asListArgs("onNext","onError","onStart","onComplete"));
        ignoreAnnotateMap.put("BaseResponse", ArrayUtils.asListArgs("getOriginal"));
        ignoreAnnotateMap.put("BaseResponseSubscriber", ArrayUtils.asListArgs("onNext","onError","onStart","onComplete"));
        ignoreAnnotateMap.put("BatteryReceiver", ArrayUtils.asListArgs("onReceive"));
        ignoreAnnotateMap.put("GlideEngine", ArrayUtils.asListArgs("createGlideEngine"));
        ignoreAnnotateMap.put("GlideTransformUtils.GlideBlurformation", ArrayUtils.asListArgs("transform","updateDiskCacheKey"));
        ignoreAnnotateMap.put("GlideTransformUtils.GlideCircleTransform", ArrayUtils.asListArgs("transform","circleCrop","updateDiskCacheKey"));
        ignoreAnnotateMap.put("GlideTransformUtils.GlideRoundTransform", ArrayUtils.asListArgs("transform","roundCrop","updateDiskCacheKey"));
        ignoreAnnotateMap.put("GlideTransformUtils.RotateTransformation", ArrayUtils.asListArgs("transform","updateDiskCacheKey"));
        ignoreAnnotateMap.put("GlideUtils", ArrayUtils.asListArgs("with","with","with","with","with","with"));
        ignoreAnnotateMap.put("HttpLoggingInterceptor", ArrayUtils.asListArgs("intercept","isPlaintext","bodyEncoded"));
        ignoreAnnotateMap.put("MMKVUtils.Holder", ArrayUtils.asListArgs("encode","encode","encode","encode","encode","encode","encode","encode","encode","decodeBool","decodeBool","decodeInt","decodeInt","decodeLong","decodeLong","decodeFloat","decodeFloat","decodeDouble","decodeDouble","decodeString","decodeString","decodeStringSet","decodeStringSet","decodeStringSet","decodeBytes","decodeBytes","decodeParcelable","decodeParcelable"));
        ignoreAnnotateMap.put("NetWorkReceiver", ArrayUtils.asListArgs("onReceive"));
        ignoreAnnotateMap.put("NotificationService", ArrayUtils.asListArgs("onCreate","onDestroy","onStartCommand"));
        ignoreAnnotateMap.put("OkGoResponse.Builder", ArrayUtils.asListArgs("setData","setMessage","setCode","setToast","setResult","setOriginal","setException"));
        ignoreAnnotateMap.put("PhoneReceiver", ArrayUtils.asListArgs("onReceive"));
        ignoreAnnotateMap.put("RetrofitManager", ArrayUtils.asListArgs("getInstance"));
        ignoreAnnotateMap.put("RxJavaManager", ArrayUtils.asListArgs("getInstance"));
        ignoreAnnotateMap.put("ScreenReceiver", ArrayUtils.asListArgs("onReceive"));
        ignoreAnnotateMap.put("SmsReceiver", ArrayUtils.asListArgs("onReceive"));
        ignoreAnnotateMap.put("TimeReceiver", ArrayUtils.asListArgs("onReceive"));
        ignoreAnnotateMap.put("WifiReceiver", ArrayUtils.asListArgs("onReceive"));

        return ignoreAnnotateMap;
    }

    /**
     * 获取忽略指定方法参数 final 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreFinalMap() {
        Map<String, List<String>> ignoreFinalMap = new HashMap<>();
        ignoreFinalMap.put("AccessibilityListenerService", ArrayUtils.asListArgs("onAccessibilityEvent"));
        ignoreFinalMap.put("AppStateReceiver", ArrayUtils.asListArgs("onReceive"));
        ignoreFinalMap.put("BatteryReceiver", ArrayUtils.asListArgs("onReceive"));
        ignoreFinalMap.put("GlideEngine", ArrayUtils.asListArgs("loadImage","loadImage","loadImage","loadFolderImage","loadAsGifImage","loadGridImage"));
        ignoreFinalMap.put("GlideTransformUtils.GlideBlurformation", ArrayUtils.asListArgs("transform","updateDiskCacheKey","blurBitmap"));
        ignoreFinalMap.put("GlideTransformUtils.GlideCircleTransform", ArrayUtils.asListArgs("transform","circleCrop","updateDiskCacheKey"));
        ignoreFinalMap.put("GlideTransformUtils.GlideRoundTransform", ArrayUtils.asListArgs("transform","roundCrop","updateDiskCacheKey"));
        ignoreFinalMap.put("GlideTransformUtils.RotateTransformation", ArrayUtils.asListArgs("transform","updateDiskCacheKey"));
        ignoreFinalMap.put("GlideUtils", ArrayUtils.asListArgs("with","with","with","with","with","with"));
        ignoreFinalMap.put("HttpLoggingInterceptor", ArrayUtils.asListArgs("intercept","_finalPrintLog","isPlaintext","bodyEncoded"));
        ignoreFinalMap.put("LubanUtils", ArrayUtils.asListArgs("compress","compress","compress","compress","compress","compress","compress"));
        ignoreFinalMap.put("MMKVUtils.Holder", ArrayUtils.asListArgs("containsKey","removeValueForKey","removeValuesForKeys","encode","encode","encode","encode","encode","encode","encode","encode","encode","decodeBool","decodeBool","decodeInt","decodeInt","decodeLong","decodeLong","decodeFloat","decodeFloat","decodeDouble","decodeDouble","decodeString","decodeString","decodeStringSet","decodeStringSet","decodeStringSet","decodeBytes","decodeBytes","decodeParcelable","decodeParcelable"));
        ignoreFinalMap.put("NetWorkReceiver", ArrayUtils.asListArgs("onReceive"));
        ignoreFinalMap.put("NotificationService", ArrayUtils.asListArgs("onNotificationPosted","onNotificationRemoved","onStartCommand"));
        ignoreFinalMap.put("OkGoDemo", ArrayUtils.asListArgs("getUserInfo","getUserList","uploadImage","uploadImages"));
        ignoreFinalMap.put("OkGoResponse.Builder", ArrayUtils.asListArgs("setData","setMessage","setCode","setToast","setResult","setOriginal","setException"));
        ignoreFinalMap.put("OkGoUtils", ArrayUtils.asListArgs("initOkGo","execute","execute"));
        ignoreFinalMap.put("PhoneReceiver", ArrayUtils.asListArgs("onReceive"));
        ignoreFinalMap.put("ScreenReceiver", ArrayUtils.asListArgs("onReceive"));
        ignoreFinalMap.put("SmsReceiver", ArrayUtils.asListArgs("onReceive"));
        ignoreFinalMap.put("TimeReceiver", ArrayUtils.asListArgs("onReceive"));
        ignoreFinalMap.put("WifiReceiver", ArrayUtils.asListArgs("onReceive"));

        return ignoreFinalMap;
    }

    /**
     * 获取忽略指定方法 static 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreStaticMap() {
        Map<String, List<String>> ignoreStaticMap = new HashMap<>();
        ignoreStaticMap.put("AccessibilityListenerService", ArrayUtils.asListArgs("onAccessibilityEvent","onInterrupt","onServiceConnected","onCreate","onDestroy"));
        ignoreStaticMap.put("AppStateReceiver", ArrayUtils.asListArgs("onReceive"));
        ignoreStaticMap.put("BaseResponse", ArrayUtils.asListArgs("getOriginal"));
        ignoreStaticMap.put("BatteryReceiver", ArrayUtils.asListArgs("onReceive"));
        ignoreStaticMap.put("GlideEngine", ArrayUtils.asListArgs("loadImage","loadImage","loadImage","loadFolderImage","loadAsGifImage","loadGridImage"));
        ignoreStaticMap.put("GlideTransformUtils.GlideBlurformation", ArrayUtils.asListArgs("transform","updateDiskCacheKey","blurBitmap"));
        ignoreStaticMap.put("GlideTransformUtils.GlideCircleTransform", ArrayUtils.asListArgs("transform","circleCrop","updateDiskCacheKey"));
        ignoreStaticMap.put("GlideTransformUtils.GlideRoundTransform", ArrayUtils.asListArgs("transform","roundCrop","updateDiskCacheKey"));
        ignoreStaticMap.put("GlideTransformUtils.RotateTransformation", ArrayUtils.asListArgs("transform","updateDiskCacheKey"));
        ignoreStaticMap.put("GlideUtils.GlideLoader", ArrayUtils.asListArgs("preload","preload","displayImage","displayImage","displayImage","displayImage","displayImageToGif","displayImageToGif","displayImageToGif","displayImageToGif","displayImageToDrawable","displayImageToDrawable","displayImageToDrawable","displayImageToDrawable","displayImageToFile","displayImageToFile","displayImageToFile","displayImageToFile","loadImageBitmap","loadImageBitmap","loadImageDrawable","loadImageDrawable","loadImageFile","loadImageFile","loadImageGif","loadImageGif","cancelDisplayTask","cancelDisplayTask","destroy","pause","resume","stop","start"));
        ignoreStaticMap.put("HttpLoggingInterceptor", ArrayUtils.asListArgs("intercept","_finalPrintLog","isPlaintext","bodyEncoded"));
        ignoreStaticMap.put("MMKVUtils.Holder", ArrayUtils.asListArgs("getMMKV","mmapID","isMMKVEmpty","isMMKVNotEmpty","containsKey","removeValueForKey","removeValuesForKeys","sync","async","encode","encode","encode","encode","encode","encode","encode","encode","encode","decodeBool","decodeBool","decodeInt","decodeInt","decodeLong","decodeLong","decodeFloat","decodeFloat","decodeDouble","decodeDouble","decodeString","decodeString","decodeStringSet","decodeStringSet","decodeStringSet","decodeBytes","decodeBytes","decodeParcelable","decodeParcelable"));
        ignoreStaticMap.put("NetWorkReceiver", ArrayUtils.asListArgs("onReceive"));
        ignoreStaticMap.put("NotificationService", ArrayUtils.asListArgs("onNotificationPosted","onNotificationRemoved","onCreate","onDestroy","onStartCommand","cancelNotification"));
        ignoreStaticMap.put("OkGoResponse", ArrayUtils.asListArgs("getDataString"));
        ignoreStaticMap.put("OkGoResponse.Builder", ArrayUtils.asListArgs("build","setData","setMessage","setCode","setToast","setResult","setOriginal","setException"));
        ignoreStaticMap.put("PhoneReceiver", ArrayUtils.asListArgs("onReceive"));
        ignoreStaticMap.put("PictureSelectorUtils.PicConfig", ArrayUtils.asListArgs("getMimeType","setMimeType","getSelectionMode","setSelectionMode","isCamera","setCamera","isCrop","setCrop","isCircleCrop","setCircleCrop","isCompress","setCompress","getMinimumCompressSize","setMinimumCompressSize","getWithAspectRatio","setWithAspectRatio","isGif","setGif","getImageSpanCount","setImageSpanCount","getMinSelectNum","setMinSelectNum","getMaxSelectNum","setMaxSelectNum","getLocalMedia","setLocalMedia","getCameraSavePath","setCameraSavePath","getCompressSavePath","setCompressSavePath","clone","set"));
        ignoreStaticMap.put("RetrofitManager", ArrayUtils.asListArgs("get","put","remove","contains","getRetrofitMap","create"));
        ignoreStaticMap.put("RxJavaManager", ArrayUtils.asListArgs("add","remove","contains","getManagerMap"));
        ignoreStaticMap.put("ScreenReceiver", ArrayUtils.asListArgs("onReceive"));
        ignoreStaticMap.put("SmsReceiver", ArrayUtils.asListArgs("onReceive"));
        ignoreStaticMap.put("TimeReceiver", ArrayUtils.asListArgs("onReceive"));
        ignoreStaticMap.put("WebViewAssist", ArrayUtils.asListArgs("setWebView","getWebView","isWebViewNotEmpty","setBuilder","setBuilder","getBuilder","apply","loadUrl","loadUrl","loadData","loadDataWithBaseURL","postUrl","loadDataWithBaseURL","loadDataWithBaseURL","getSettings","getUserAgentString","setUserAgentString","addJavascriptInterface","removeJavascriptInterface","evaluateJavascript","setWebViewClient","getWebViewClient","setWebChromeClient","getWebChromeClient","destroy","canGoBack","goBack","canGoForward","goForward","canGoBackOrForward","goBackOrForward","reload","stopLoading","clearCache","clearHistory","clearFormData","getScale","getScrollY","getScrollX","getContentHeight","getScaleHeight","getScaleHeight","getHeight","pageDown","pageUp","handlerKeyDown","setLayerTypeSoftware","setLayerType","getUrl","getOriginalUrl","getHitTestResult"));
        ignoreStaticMap.put("WebViewAssist.Builder", ArrayUtils.asListArgs("setWebViewAssist","apply","setOnApplyListener","getApplyListener","clone","reset","applyPri","isJavaScriptEnabled","setJavaScriptEnabled","getRenderPriority","setRenderPriority","isUseWideViewPort","setUseWideViewPort","isLoadWithOverviewMode","setLoadWithOverviewMode","getLayoutAlgorithm","setLayoutAlgorithm","isSupportZoom","setSupportZoom","isBuiltInZoomControls","setBuiltInZoomControls","isDisplayZoomControls","setDisplayZoomControls","getTextZoom","setTextZoom","getStandardFontFamily","setStandardFontFamily","getDefaultFontSize","setDefaultFontSize","getMinimumFontSize","setMinimumFontSize","getMixedContentMode","setMixedContentMode","isLoadsImagesAutomatically","setLoadsImagesAutomatically","isJavaScriptCanOpenWindowsAutomatically","setJavaScriptCanOpenWindowsAutomatically","getDefaultTextEncodingName","setDefaultTextEncodingName","isGeolocationEnabled","setGeolocationEnabled","getUserAgentString","setUserAgentString","isAllowFileAccess","setAllowFileAccess","isAllowFileAccessFromFileURLs","setAllowFileAccessFromFileURLs","isAllowUniversalAccessFromFileURLs","setAllowUniversalAccessFromFileURLs","getCacheMode","setCacheMode","isDomStorageEnabled","setDomStorageEnabled","isAppCacheEnabled","setAppCacheEnabled","getAppCachePath","setAppCachePath","getAppCacheMaxSize","setAppCacheMaxSize","isDatabaseEnabled","setDatabaseEnabled","getDatabasePath","setDatabasePath"));
        ignoreStaticMap.put("WifiReceiver", ArrayUtils.asListArgs("onReceive"));

        return ignoreStaticMap;
    }

    /**
     * 获取忽略指定方法 @param 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreParamMap() {
        Map<String, List<String>> ignoreParamMap = new HashMap<>();
        ignoreParamMap.put("AppStateReceiver", ArrayUtils.asListArgs("onReceive"));
        ignoreParamMap.put("BaseBeanSubscriber", ArrayUtils.asListArgs("onNext","onError"));
        ignoreParamMap.put("BaseResponseSubscriber", ArrayUtils.asListArgs("onNext","onError"));
        ignoreParamMap.put("BatteryReceiver", ArrayUtils.asListArgs("onReceive"));
        ignoreParamMap.put("GlideTransformUtils.GlideBlurformation", ArrayUtils.asListArgs("transform","updateDiskCacheKey","blurBitmap"));
        ignoreParamMap.put("GlideTransformUtils.GlideCircleTransform", ArrayUtils.asListArgs("transform","circleCrop","updateDiskCacheKey"));
        ignoreParamMap.put("GlideTransformUtils.GlideRoundTransform", ArrayUtils.asListArgs("transform","roundCrop","updateDiskCacheKey"));
        ignoreParamMap.put("GlideTransformUtils.RotateTransformation", ArrayUtils.asListArgs("transform","updateDiskCacheKey"));
        ignoreParamMap.put("GlideUtils", ArrayUtils.asListArgs("with","with","with","with","with","with"));
        ignoreParamMap.put("HttpLoggingInterceptor", ArrayUtils.asListArgs("intercept","isPlaintext","bodyEncoded"));
        ignoreParamMap.put("LubanUtils", ArrayUtils.asListArgs("compress","compress","compress","compress","compress","compress","compress"));
        ignoreParamMap.put("MMKVUtils.Holder", ArrayUtils.asListArgs("encode","encode","encode","encode","encode","encode","encode","encode","encode","decodeBool","decodeBool","decodeInt","decodeInt","decodeLong","decodeLong","decodeFloat","decodeFloat","decodeDouble","decodeDouble","decodeString","decodeString","decodeStringSet","decodeStringSet","decodeStringSet","decodeBytes","decodeBytes","decodeParcelable","decodeParcelable"));
        ignoreParamMap.put("NetWorkReceiver", ArrayUtils.asListArgs("onReceive"));
        ignoreParamMap.put("NotificationService", ArrayUtils.asListArgs("onStartCommand"));
        ignoreParamMap.put("OkGoCallback", ArrayUtils.asListArgs("onStart","uploadProgress","downloadProgress","onCacheSuccess","onError","onSuccess","convertResponse"));
        ignoreParamMap.put("OkGoResponse.Builder", ArrayUtils.asListArgs("setData","setMessage","setCode","setToast","setResult","setOriginal","setException"));
        ignoreParamMap.put("PhoneReceiver", ArrayUtils.asListArgs("onReceive"));
        ignoreParamMap.put("ScreenReceiver", ArrayUtils.asListArgs("onReceive"));
        ignoreParamMap.put("SmsReceiver", ArrayUtils.asListArgs("onReceive"));
        ignoreParamMap.put("TimeReceiver", ArrayUtils.asListArgs("onReceive"));
        ignoreParamMap.put("WifiReceiver", ArrayUtils.asListArgs("onReceive"));

        return ignoreParamMap;
    }

    /**
     * 获取忽略指定方法 @return 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreReturnMap() {
        Map<String, List<String>> ignoreReturnMap = new HashMap<>();
        ignoreReturnMap.put("OkGoCallback", ArrayUtils.asListArgs("convertResponse"));

        return ignoreReturnMap;
    }

    /**
     * 获取忽略指定方法非 public 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreUnPublicMap() {
        Map<String, List<String>> ignoreUnPublicMap = new HashMap<>();
        ignoreUnPublicMap.put("AccessibilityListenerService", ArrayUtils.asListArgs("onServiceConnected"));
        ignoreUnPublicMap.put("AppStateReceiver.AppStateListener", ArrayUtils.asListArgs("onAdded","onReplaced","onRemoved"));
        ignoreUnPublicMap.put("BaseBeanSubscriber", ArrayUtils.asListArgs("onStart","getErrorMessage"));
        ignoreUnPublicMap.put("BaseResponseSubscriber", ArrayUtils.asListArgs("onStart","getErrorMessage","isSuccess"));
        ignoreUnPublicMap.put("BatteryReceiver.BatteryListener", ArrayUtils.asListArgs("onBatteryChanged","onBatteryLow","onBatteryOkay","onPowerConnected","onPowerUsageSummary"));
        ignoreUnPublicMap.put("GlideTransformUtils.GlideBlurformation", ArrayUtils.asListArgs("transform"));
        ignoreUnPublicMap.put("GlideTransformUtils.GlideCircleTransform", ArrayUtils.asListArgs("transform","circleCrop"));
        ignoreUnPublicMap.put("GlideTransformUtils.GlideRoundTransform", ArrayUtils.asListArgs("transform","roundCrop"));
        ignoreUnPublicMap.put("GlideTransformUtils.RotateTransformation", ArrayUtils.asListArgs("transform"));
        ignoreUnPublicMap.put("HttpLoggingInterceptor", ArrayUtils.asListArgs("_finalPrintLog","isPlaintext","bodyEncoded"));
        ignoreUnPublicMap.put("LubanUtils", ArrayUtils.asListArgs("getContext"));
        ignoreUnPublicMap.put("LubanUtils.OnCompressListener", ArrayUtils.asListArgs("onStart","onSuccess","onError","onComplete"));
        ignoreUnPublicMap.put("NetWorkReceiver.NetwordStateListener", ArrayUtils.asListArgs("onNetworkState"));
        ignoreUnPublicMap.put("NotificationService.NotificationListener", ArrayUtils.asListArgs("onServiceCreated","onServiceDestroy","onStartCommand","onNotificationPosted","onNotificationRemoved"));
        ignoreUnPublicMap.put("OkGoCallback", ArrayUtils.asListArgs("_response","isSuccess"));
        ignoreUnPublicMap.put("OkGoDemo", ArrayUtils.asListArgs("demo"));
        ignoreUnPublicMap.put("PhoneReceiver.PhoneListener", ArrayUtils.asListArgs("onPhoneStateChanged"));
        ignoreUnPublicMap.put("ScreenReceiver.ScreenListener", ArrayUtils.asListArgs("screenOn","screenOff","userPresent"));
        ignoreUnPublicMap.put("TimeReceiver.TimeListener", ArrayUtils.asListArgs("onTimeZoneChanged","onTimeChanged","onTimeTick"));
        ignoreUnPublicMap.put("WebViewAssist.Builder", ArrayUtils.asListArgs("setWebViewAssist","applyPri"));
        ignoreUnPublicMap.put("WebViewAssist.Builder.OnApplyListener", ArrayUtils.asListArgs("onApply"));
        ignoreUnPublicMap.put("ZXingQRCodeUtils.QRResultCallBack", ArrayUtils.asListArgs("onResult"));
        ignoreUnPublicMap.put("ZXingQRCodeUtils.QRScanCallBack", ArrayUtils.asListArgs("onResult"));

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
        ignoreReturnVoidMap.put("AccessibilityListenerService", ArrayUtils.asListArgs("onAccessibilityEvent - void","onInterrupt - void","onServiceConnected - void","startService - void","stopService - void","setAccessibilityListener - void"));
        ignoreReturnVoidMap.put("AccessibilityListenerService.AccessibilityListener", ArrayUtils.asListArgs("onAccessibilityEvent - void","onInterrupt - void","onServiceCreated - void","onServiceDestroy - void"));
        ignoreReturnVoidMap.put("AppStateReceiver", ArrayUtils.asListArgs("registerReceiver - void","unregisterReceiver - void"));
        ignoreReturnVoidMap.put("AppStateReceiver.AppStateListener", ArrayUtils.asListArgs("onAdded - void","onReplaced - void","onRemoved - void"));
        ignoreReturnVoidMap.put("BaseBeanSubscriber", ArrayUtils.asListArgs("onSuccessResponse - void","onErrorResponse - void"));
        ignoreReturnVoidMap.put("BaseResponseSubscriber", ArrayUtils.asListArgs("onSuccessResponse - void","onErrorResponse - void"));
        ignoreReturnVoidMap.put("BatteryReceiver", ArrayUtils.asListArgs("registerReceiver - void","unregisterReceiver - void"));
        ignoreReturnVoidMap.put("BatteryReceiver.BatteryListener", ArrayUtils.asListArgs("onBatteryChanged - void","onBatteryLow - void","onBatteryOkay - void","onPowerConnected - void","onPowerUsageSummary - void"));
        ignoreReturnVoidMap.put("EventBusUtils", ArrayUtils.asListArgs("register - void","unregister - void","post - void","cancelEventDelivery - void","postSticky - void","removeStickyEvent - void","removeAllStickyEvents - void"));
        ignoreReturnVoidMap.put("GlideEngine", ArrayUtils.asListArgs("loadImage - void","loadImage - void","loadImage - void","loadFolderImage - void","loadAsGifImage - void","loadGridImage - void"));
        ignoreReturnVoidMap.put("GlideUtils", ArrayUtils.asListArgs("init - void","clearDiskCache - void","clearMemoryCache - void","onLowMemory - void"));
        ignoreReturnVoidMap.put("GlideUtils.GlideLoader", ArrayUtils.asListArgs("preload - void","preload - void","displayImage - void","displayImage - void","displayImage - void","displayImage - void","displayImageToGif - void","displayImageToGif - void","displayImageToGif - void","displayImageToGif - void","displayImageToDrawable - void","displayImageToDrawable - void","displayImageToDrawable - void","displayImageToDrawable - void","displayImageToFile - void","displayImageToFile - void","displayImageToFile - void","displayImageToFile - void","loadImageBitmap - void","loadImageBitmap - void","loadImageDrawable - void","loadImageDrawable - void","loadImageFile - void","loadImageFile - void","loadImageGif - void","loadImageGif - void","cancelDisplayTask - void","cancelDisplayTask - void","destroy - void","pause - void","resume - void","stop - void","start - void"));
        ignoreReturnVoidMap.put("HttpLoggingInterceptor", ArrayUtils.asListArgs("_finalPrintLog - void"));
        ignoreReturnVoidMap.put("ImageLoaderUtils", ArrayUtils.asListArgs("init - void","displayImage - void","displayImage - void","displayImage - void","displayImage - void","displayImage - void","displayImage - void","displayImage - void","displayImage - void","loadImage - void","loadImage - void","loadImage - void","loadImage - void","loadImage - void","loadImage - void","clearDiskCache - void","clearMemoryCache - void","handleSlowNetwork - void","denyNetworkDownloads - void","cancelDisplayTask - void","setDefaultLoadingListener - void","destroy - void","pause - void","resume - void","stop - void"));
        ignoreReturnVoidMap.put("LubanUtils", ArrayUtils.asListArgs("setConfig - void"));
        ignoreReturnVoidMap.put("LubanUtils.OnCompressListener", ArrayUtils.asListArgs("onStart - void","onSuccess - void","onError - void","onComplete - void"));
        ignoreReturnVoidMap.put("MMKVUtils", ArrayUtils.asListArgs("init - void"));
        ignoreReturnVoidMap.put("NetWorkReceiver", ArrayUtils.asListArgs("registerReceiver - void","unregisterReceiver - void"));
        ignoreReturnVoidMap.put("NetWorkReceiver.NetwordStateListener", ArrayUtils.asListArgs("onNetworkState - void"));
        ignoreReturnVoidMap.put("NotificationService", ArrayUtils.asListArgs("onNotificationPosted - void","onNotificationRemoved - void","startService - void","stopService - void","startNotificationListenSettings - void","cancelNotification - void","setNotificationListener - void"));
        ignoreReturnVoidMap.put("NotificationService.NotificationListener", ArrayUtils.asListArgs("onServiceCreated - void","onServiceDestroy - void","onNotificationPosted - void","onNotificationRemoved - void"));
        ignoreReturnVoidMap.put("OkGoCallback", ArrayUtils.asListArgs("onStart - void","onFinish - void","uploadProgress - void","downloadProgress - void","onCacheSuccess - void","onError - void","onSuccess - void","onSuccessResponse - void","onErrorResponse - void","_response - void"));
        ignoreReturnVoidMap.put("OkGoDemo", ArrayUtils.asListArgs("getUserInfo - void","getUserList - void","uploadImage - void","uploadImages - void","demo - void"));
        ignoreReturnVoidMap.put("OkGoUtils", ArrayUtils.asListArgs("initOkGo - void","execute - void","execute - void"));
        ignoreReturnVoidMap.put("PhoneReceiver", ArrayUtils.asListArgs("registerReceiver - void","unregisterReceiver - void"));
        ignoreReturnVoidMap.put("PhoneReceiver.PhoneListener", ArrayUtils.asListArgs("onPhoneStateChanged - void"));
        ignoreReturnVoidMap.put("PictureSelectorUtils", ArrayUtils.asListArgs("setPicConfig - void","setSavePath - void","setMinimumCompressSize - void","deleteCacheDirFile - void"));
        ignoreReturnVoidMap.put("RxJavaManager", ArrayUtils.asListArgs("add - void","remove - void"));
        ignoreReturnVoidMap.put("ScreenReceiver", ArrayUtils.asListArgs("registerReceiver - void","unregisterReceiver - void"));
        ignoreReturnVoidMap.put("ScreenReceiver.ScreenListener", ArrayUtils.asListArgs("screenOn - void","screenOff - void","userPresent - void"));
        ignoreReturnVoidMap.put("SmsReceiver", ArrayUtils.asListArgs("registerReceiver - void","unregisterReceiver - void"));
        ignoreReturnVoidMap.put("SmsReceiver.SmsListener", ArrayUtils.asListArgs("onMessage - void","onMessage - void"));
        ignoreReturnVoidMap.put("TimeReceiver", ArrayUtils.asListArgs("registerReceiver - void","unregisterReceiver - void"));
        ignoreReturnVoidMap.put("TimeReceiver.TimeListener", ArrayUtils.asListArgs("onTimeZoneChanged - void","onTimeChanged - void","onTimeTick - void"));
        ignoreReturnVoidMap.put("WebViewAssist", ArrayUtils.asListArgs("setGlobalBuilder - void","removeCookie - void"));
        ignoreReturnVoidMap.put("WebViewAssist.Builder.OnApplyListener", ArrayUtils.asListArgs("onApply - void"));
        ignoreReturnVoidMap.put("WifiReceiver", ArrayUtils.asListArgs("registerReceiver - void","unregisterReceiver - void"));
        ignoreReturnVoidMap.put("WifiReceiver.WifiListener", ArrayUtils.asListArgs("onIntoTrigger - void","onTrigger - void","onTrigger - void","onWifiSwitch - void"));
        ignoreReturnVoidMap.put("ZXingQRCodeUtils", ArrayUtils.asListArgs("createQRCodeImage - void","createQRCodeImage - void","createQRCodeImage - void","decodeQRCode - void"));
        ignoreReturnVoidMap.put("ZXingQRCodeUtils.QRResultCallBack", ArrayUtils.asListArgs("onResult - void"));
        ignoreReturnVoidMap.put("ZXingQRCodeUtils.QRScanCallBack", ArrayUtils.asListArgs("onResult - void"));

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