package javadoc.dev_utils.check.dev_app;

import javadoc.Utils;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * detail: 代码检测分析配置
 * @author Ttt
 */
final class DevAppConfig {

    private DevAppConfig() {
    }

    // 忽略指定方法 @param 处理
    protected static final HashMap<String, ArrayList<String>> sIgnoreAnnotateMap = new HashMap<>();
    // 忽略指定方法参数 final 修饰符
    protected static final HashMap<String, ArrayList<String>> sIgnoreFinalMap = new HashMap<>();
    // 忽略指定方法 static 修饰符
    protected static final HashMap<String, ArrayList<String>> sIgnoreStaticMap = new HashMap<>();
    // 忽略指定方法 @param 处理
    protected static final HashMap<String, ArrayList<String>> sIgnoreParamMap = new HashMap<>();
    // 忽略指定方法 @return 处理
    protected static final HashMap<String, ArrayList<String>> sIgnoreReturnMap = new HashMap<>();
    // 忽略指定方法非 public 处理
    protected static final HashMap<String, ArrayList<String>> sIgnoreUnPublicMap = new HashMap<>();
    // 忽略无修饰符变量 处理
    protected static final HashMap<String, ArrayList<String>> sIgnoreModifierVariableMap = new HashMap<>();
    // 忽略指定方法 return void 处理
    protected static final HashMap<String, ArrayList<String>> sIgnoreReturnVoidMap = new HashMap<>();

    // ==========
    // = 初始化 =
    // ==========

    static {
        // 初始化 忽略指定方法注释处理
        initIgnoreAnnotateMap();
        // 初始化 忽略指定方法参数 final 修饰符
        initIgnoreFinalMap();
        // 初始化 忽略指定方法 static 修饰符
        initIgnoreStaticMap();
        // 初始化 忽略指定方法 @param 处理
        initIgnoreParamMap();
        // 初始化 忽略指定方法 @return 处理
        initIgnoreReturnMap();
        // 初始化 忽略指定方法非 public 处理
        initIgnoreUnPublicMap();
        // 初始化 忽略无修饰符变量 处理
        initIgnoreModifierVariableMap();
        // 初始化 忽略指定方法 return void 处理
        initIgnoreReturnVoidMap();
    }

    // =

    /**
     * 初始化 忽略指定方法注释处理
     */
    private static void initIgnoreAnnotateMap() {

        // ====================
        // = 根目录三个工具类 =
        // ====================

        sIgnoreAnnotateMap.put("DevUtils.AbstractActivityLifecycle", Utils.asList("onActivityCreated", "onActivityStarted", "onActivityResumed", "onActivityPaused", "onActivityStopped", "onActivitySaveInstanceState", "onActivityDestroyed"));
        sIgnoreAnnotateMap.put("DevUtils.ActivityLifecycleImpl", Utils.asList("onActivityCreated", "onActivityStarted", "onActivityResumed", "onActivityPaused", "onActivityStopped", "onActivitySaveInstanceState", "onActivityDestroyed"));
        sIgnoreAnnotateMap.put("DevUtils.FileProviderDevApp", Utils.asList("onCreate"));
        sIgnoreAnnotateMap.put("JCLogUtils", Utils.asList("d", "e", "e", "e", "i", "xml", "dTag", "eTag", "eTag", "eTag", "iTag", "xmlTag"));
        sIgnoreAnnotateMap.put("LogPrintUtils", Utils.asList("d", "e", "e", "e", "w", "i", "v", "wtf", "json", "xml", "dTag", "eTag", "eTag", "eTag", "wTag", "iTag", "vTag", "wtfTag", "jsonTag", "xmlTag"));

        // =======
        // = APP =
        // =======

        sIgnoreAnnotateMap.put("AutoFocusAssist.AutoFocusTask", Utils.asList("doInBackground"));
        sIgnoreAnnotateMap.put("DevCache.xFileOutputStream", Utils.asList("close"));
        sIgnoreAnnotateMap.put("InactivityTimerAssist.InactivityAsyncTask", Utils.asList("doInBackground"));
        sIgnoreAnnotateMap.put("InactivityTimerAssist.PowerStatusReceiver", Utils.asList("onReceive"));
        sIgnoreAnnotateMap.put("KeyValueBean", Utils.asList("toString"));
        sIgnoreAnnotateMap.put("PreferenceImpl.ComparatorImpl", Utils.asList("compare"));
        sIgnoreAnnotateMap.put("ScreenSensorAssist.OrientationSensorChangeListener", Utils.asList("onAccuracyChanged", "onSensorChanged"));
        sIgnoreAnnotateMap.put("ScreenSensorAssist.OrientationSensorListener", Utils.asList("onAccuracyChanged", "onSensorChanged"));
        sIgnoreAnnotateMap.put("SpannableStringUtils.CustomBulletSpan", Utils.asList("getLeadingMargin", "drawLeadingMargin"));
        sIgnoreAnnotateMap.put("SpannableStringUtils.CustomDynamicDrawableSpan", Utils.asList("getDrawable", "getSize", "draw", "getCachedDrawable"));
        sIgnoreAnnotateMap.put("SpannableStringUtils.CustomImageSpan", Utils.asList("getDrawable"));
        sIgnoreAnnotateMap.put("SpannableStringUtils.CustomLineHeightSpan", Utils.asList("chooseHeight"));
        sIgnoreAnnotateMap.put("SpannableStringUtils.CustomQuoteSpan", Utils.asList("getLeadingMargin", "drawLeadingMargin"));
        sIgnoreAnnotateMap.put("SpannableStringUtils.CustomTypefaceSpan", Utils.asList("updateDrawState", "updateMeasureState", "apply"));
        sIgnoreAnnotateMap.put("SpannableStringUtils.ShaderSpan", Utils.asList("updateDrawState"));
        sIgnoreAnnotateMap.put("SpannableStringUtils.ShadowSpan", Utils.asList("updateDrawState"));
        sIgnoreAnnotateMap.put("SpannableStringUtils.SpaceSpan", Utils.asList("getSize", "draw"));
        sIgnoreAnnotateMap.put("SpannableStringUtils.VerticalAlignSpan", Utils.asList("getSize", "draw"));
        sIgnoreAnnotateMap.put("ToastFactory.BaseToast", Utils.asList("setView", "setText"));
        sIgnoreAnnotateMap.put("ToastFactory.NotificationToast", Utils.asList("show", "cancel"));
        sIgnoreAnnotateMap.put("ToastFactory.SafeToast.SafeHandler", Utils.asList("handleMessage", "dispatchMessage"));
        sIgnoreAnnotateMap.put("ToastFactory.ToastHelper", Utils.asList("handleMessage"));
        sIgnoreAnnotateMap.put("ToastTintUtils.SafeHandler", Utils.asList("handleMessage", "dispatchMessage"));
        sIgnoreAnnotateMap.put("ToastUtils.SafeHandler", Utils.asList("handleMessage", "dispatchMessage"));
        sIgnoreAnnotateMap.put("WifiVo", Utils.asList("describeContents", "writeToParcel"));

        // ==========
        // = Common =
        // ==========

        sIgnoreAnnotateMap.put("Base64.Coder", Utils.asList("maxOutputSize"));
        sIgnoreAnnotateMap.put("Base64.Decoder", Utils.asList("maxOutputSize"));
        sIgnoreAnnotateMap.put("Base64.Encoder", Utils.asList("maxOutputSize", "process"));
    }

    // =

    /**
     * 初始化 忽略指定方法参数 final 修饰符
     */
    private static void initIgnoreFinalMap() {

        // ====================
        // = 根目录三个工具类 =
        // ====================

        sIgnoreFinalMap.put("DevUtils.ActivityLifecycleImpl", Utils.asList("onActivityCreated", "onActivityStarted", "onActivityResumed", "onActivityPaused", "onActivityStopped", "onActivitySaveInstanceState", "onActivityDestroyed"));

        // =======
        // = APP =
        // =======

        sIgnoreFinalMap.put("AutoFocusAssist", Utils.asList("onAutoFocus"));
        sIgnoreFinalMap.put("AutoFocusAssist.AutoFocusTask", Utils.asList("doInBackground"));
        sIgnoreFinalMap.put("BitmapUtils", Utils.asList("combineToCenter", "combineToSameSize", "combineToSameSize"));
        sIgnoreFinalMap.put("CameraSizeAssist", Utils.asList("setPreviewSize", "setPictureSize", "calcPreviewSize", "calcPictureSize", "calcVideoSize"));
        sIgnoreFinalMap.put("CameraUtils", Utils.asList("initCamera", "open"));
        sIgnoreFinalMap.put("CrashUtils", Utils.asList("init", "uncaughtException", "handleException"));
        sIgnoreFinalMap.put("DevMediaManager", Utils.asList("onError", "onVideoSizeChanged", "onPrepared", "onCompletion", "onBufferingUpdate", "onSeekComplete"));
        sIgnoreFinalMap.put("DevVideoPlayerControl", Utils.asList("surfaceChanged", "surfaceCreated", "surfaceDestroyed", "onBufferingUpdate", "onError", "onVideoSizeChanged"));
        sIgnoreFinalMap.put("IToastImpl", Utils.asList("filter", "handlerContent"));
        sIgnoreFinalMap.put("InactivityTimerAssist.InactivityAsyncTask", Utils.asList("doInBackground"));
        sIgnoreFinalMap.put("InactivityTimerAssist.PowerStatusReceiver", Utils.asList("onReceive"));
        sIgnoreFinalMap.put("LocationUtils.CustomLocationListener", Utils.asList("onLocationChanged", "onStatusChanged", "onProviderEnabled", "onProviderDisabled"));
        sIgnoreFinalMap.put("LoggerPrinter", Utils.asList("logHeaderContent"));
        sIgnoreFinalMap.put("NetWorkUtils", Utils.asList("isAvailableByPing"));
        sIgnoreFinalMap.put("PermissionUtils.PermissionActivity", Utils.asList("onCreate", "onRequestPermissionsResult"));
        sIgnoreFinalMap.put("PreferenceImpl.ComparatorImpl", Utils.asList("compare"));
        sIgnoreFinalMap.put("ScreenSensorAssist.OrientationSensorChangeListener", Utils.asList("onAccuracyChanged", "onSensorChanged"));
        sIgnoreFinalMap.put("ScreenSensorAssist.OrientationSensorListener", Utils.asList("onAccuracyChanged", "onSensorChanged"));
        sIgnoreFinalMap.put("SnackbarUtils.StyleBuilder", Utils.asList("setRootGravity", "setRootCornerRadius", "setRootBackgroundTintColor", "setRootBackground", "setRootMargin", "setRootAlpha", "setTextGravity", "setTextColor", "setTextSize", "setTextMaxLines", "setTextEllipsize", "setTextTypeface", "setTextPadding", "setActionGravity", "setActionColor", "setActionSize", "setActionPadding", "setActionCornerRadius", "setActionBackgroundTintColor", "setActionBackground"));
        sIgnoreFinalMap.put("SpannableStringUtils.VerticalAlignSpan", Utils.asList("getSize", "draw"));
        sIgnoreFinalMap.put("ToastFactory.BaseToast", Utils.asList("setView", "setText"));
        sIgnoreFinalMap.put("ToastFactory.SafeToast.SafeHandler", Utils.asList("handleMessage", "dispatchMessage"));
        sIgnoreFinalMap.put("ToastFactory.ToastHelper", Utils.asList("handleMessage"));
        sIgnoreFinalMap.put("ToastTintUtils", Utils.asList("newToastView", "inflaterView"));
        sIgnoreFinalMap.put("ToastTintUtils.SafeHandler", Utils.asList("handleMessage", "dispatchMessage"));
        sIgnoreFinalMap.put("ToastUtils", Utils.asList("newToastText", "newToastView", "handlerToastRes", "handlerToastStr"));
        sIgnoreFinalMap.put("ToastUtils.SafeHandler", Utils.asList("handleMessage", "dispatchMessage"));

        // ==========
        // = Common =
        // ==========

        sIgnoreFinalMap.put("Base64", Utils.asList("decode", "decode", "decode", "encodeToString", "encodeToString", "encode", "encode"));
        sIgnoreFinalMap.put("Base64.Decoder", Utils.asList("maxOutputSize", "process"));
        sIgnoreFinalMap.put("Base64.Encoder", Utils.asList("maxOutputSize", "process"));
        sIgnoreFinalMap.put("Base64Cipher", Utils.asList("decrypt", "encrypt"));
    }

    // =

    /**
     * 初始化 忽略指定方法 static 修饰符
     */
    private static void initIgnoreStaticMap() {

        // ====================
        // = 根目录三个工具类 =
        // ====================

        sIgnoreStaticMap.put("DevUtils.ActivityLifecycleImpl", Utils.asList("onActivityCreated", "onActivityStarted", "onActivityResumed", "onActivityPaused", "onActivityStopped", "onActivitySaveInstanceState", "onActivityDestroyed", "setTopActivity", "getTopActivityByReflect", "getTopActivity", "isTopActivity", "isTopActivity", "isBackground", "getActivityCount", "addOnAppStatusChangedListener", "removeOnAppStatusChangedListener", "removeAllOnAppStatusChangedListener", "addOnActivityDestroyedListener", "removeOnActivityDestroyedListener", "removeAllOnActivityDestroyedListener", "postStatus", "consumeOnActivityDestroyedListener"));
        sIgnoreStaticMap.put("DevUtils.FileProviderDevApp", Utils.asList("onCreate"));

        // =======
        // = APP =
        // =======

        sIgnoreStaticMap.put("ActivityUtils", Utils.asList("getActivityStacks", "addActivity", "removeActivity", "removeActivity", "currentActivity", "finishActivity", "existActivitys", "finishActivity", "finishActivity", "finishAllActivityToIgnore", "finishAllActivityToIgnore", "finishAllActivity", "appExit", "restartApplication"));
        sIgnoreStaticMap.put("AnalysisRecordUtils.FileInfo", Utils.asList("getStoragePath", "getFileName", "getFileFunction", "getFileIntervalTime", "getFolderName", "isHandler", "setHandler", "getLogPath", "getIntervalTimeFolder"));
        sIgnoreStaticMap.put("ApkInfoItem", Utils.asList("getAppInfoBean", "getListKeyValues", "getAppMD5", "getAppSHA1", "getAppSHA256", "getMinSdkVersion", "getTargetSdkVersion", "getApkLength", "getX509Certificate", "getNotBefore", "getNotAfter", "isEffective", "getCertPrincipal", "getCertVersion", "getCertSigalgname", "getCertSigalgoid", "getCertSerialnumber", "getCertDercode"));
        sIgnoreStaticMap.put("AppInfoBean", Utils.asList("getAppPackName", "getAppName", "getAppIcon", "getAppType", "getVersionCode", "getVersionName", "getFirstInstallTime", "getLastUpdateTime", "getSourceDir", "getApkSize"));
        sIgnoreStaticMap.put("AppInfoItem", Utils.asList("getAppInfoBean", "getListKeyValues", "getAppMD5", "getAppSHA1", "getAppSHA256", "getMinSdkVersion", "getTargetSdkVersion", "getApkLength", "getX509Certificate", "getNotBefore", "getNotAfter", "isEffective", "getCertPrincipal", "getCertVersion", "getCertSigalgname", "getCertSigalgoid", "getCertSerialnumber", "getCertDercode"));
        sIgnoreStaticMap.put("AsyncExecutor", Utils.asList("shutdownNow", "execute", "postResult", "postCancel", "execute"));
        sIgnoreStaticMap.put("AutoFocusAssist", Utils.asList("isAutoFocus", "setAutoFocus", "onAutoFocus", "autoFocusAgainLater", "start", "stop", "cancelOutstandingTask"));
        sIgnoreStaticMap.put("AutoFocusAssist.AutoFocusTask", Utils.asList("doInBackground"));
        sIgnoreStaticMap.put("BeepVibrateAssist", Utils.asList("shouldBeep", "streamUpdate", "isPlayBeep", "isVibrate", "setVibrate", "setVibrate", "setMediaPlayer", "playBeepSoundAndVibrate", "close"));
        sIgnoreStaticMap.put("CameraAssist", Utils.asList("openDriver", "closeDriver", "startPreview", "stopPreview", "freeCameraResource", "getCameraResolution", "getPreviewSize", "getCameraSizeAssist", "getCamera", "setCamera", "setPreviewNotify", "setAutoFocus", "isPreviewing", "setAutoInterval", "setFlashlightOn", "setFlashlightOff", "isFlashlightOn"));
        sIgnoreStaticMap.put("CameraSizeAssist", Utils.asList("getCamera", "setPreviewSize", "setPreviewSize", "getPreviewSize", "getPreviewSize", "getPreviewSize", "getPreviewSize", "setPictureSize", "setPictureSize", "getPictureSize", "getPictureSize", "getPictureSize", "getPictureSize", "getPictureSize", "getPictureSize", "getVideoSize", "getVideoSize", "getVideoSize", "getVideoSize", "getVideoSize", "getVideoSize", "calcPreviewSize", "calcPictureSize", "calcVideoSize"));
        sIgnoreStaticMap.put("ClickUtils.ClickAssist", Utils.asList("isFastDoubleClick", "isFastDoubleClick", "isFastDoubleClick", "isFastDoubleClick", "isFastDoubleClick", "initConfig", "putConfig", "removeConfig", "getConfigTime", "removeRecord", "clearRecord", "setIntervalTime", "reset"));
        sIgnoreStaticMap.put("CrashUtils", Utils.asList("init", "uncaughtException", "handleException"));
        sIgnoreStaticMap.put("DefaultToastStyle", Utils.asList("getGravity", "getXOffset", "getYOffset", "getHorizontalMargin", "getVerticalMargin", "getZ", "getCornerRadius", "getBackgroundTintColor", "getBackground", "getTextColor", "getTextSize", "getMaxLines", "getEllipsize", "getTypeface", "getPadding"));
        sIgnoreStaticMap.put("DevCache", Utils.asList("put", "put", "getAsString", "put", "put", "getAsJSONObject", "put", "put", "getAsJSONArray", "put", "get", "getAsBinary", "getAsObject", "put", "put", "getAsBitmap", "put", "put", "getAsDrawable", "file", "remove", "clear"));
        sIgnoreStaticMap.put("DevCache.xFileOutputStream", Utils.asList("close"));
        sIgnoreStaticMap.put("DevCacheManager", Utils.asList("calculateCacheSizeAndCacheCount", "put", "get", "newFile", "remove", "clear", "removeNext", "calculateSize"));
        sIgnoreStaticMap.put("DevHelper", Utils.asList("viewHelper","devHelper","postRunnable","postRunnable","postRunnable","postRunnable","removeRunnable","startTimer","closeTimer","recycle","saveBitmapToSDCardJPEG","saveBitmapToSDCardJPEG","saveBitmapToSDCardJPEG","saveBitmapToSDCardJPEG","saveBitmapToSDCardPNG","saveBitmapToSDCardPNG","saveBitmapToSDCardPNG","saveBitmapToSDCardPNG","saveBitmapToSDCardWEBP","saveBitmapToSDCardWEBP","saveBitmapToSDCardWEBP","saveBitmapToSDCardWEBP","saveBitmapToSDCard","saveBitmapToSDCard","addTextChangedListener","removeTextChangedListener","setKeyListener","setKeyListener","setKeyListener","record","cleanAppCache","cleanAppFiles","cleanAppDbs","cleanAppDbByName","cleanAppSp","cleanAppSp","cleanCache","cleanCustomDir","cleanCustomDir","cleanApplicationData","copyText","copyUri","copyIntent","notifyMediaStore","insertImageIntoMediaStore","insertVideoIntoMediaStore","insertIntoMediaStore","showDialog","closeDialog","closeDialogs","closeDialog","closeDialogs","closePopupWindow","closePopupWindows","autoCloseDialog","autoCloseDialog","autoClosePopupWindow","openKeyboard","openKeyboard","openKeyboard","openKeyboard","openKeyboard","openKeyboard","closeKeyboard","closeKeyboard","closeKeyboard","closeKeyboard","closeKeyBoardSpecial","closeKeyBoardSpecial","closeKeyBoardSpecial","closeKeyboard","closeKeyboard","closeKeyboard","closeKeyboard","closeKeyboard","closeKeyboard","closeKeyboard","closeKeyboard","judgeView","registerSoftInputChangedListener","registerSoftInputChangedListener2","applyLanguage","applyLanguage","setOnClicks","setOnLongClicks","setOnTouchs","addTouchArea","addTouchArea","cancelAllNotification","cancelNotification","cancelNotification","notifyNotification","notifyNotification","saveAssetsFormFile","saveRawFormFile","setWindowSecure","setFullScreen","setLandscape","setPortrait","toggleScreenOrientation","forceGetViewSize","vibrate","vibrate","cancel","closeIO","closeIOQuietly","getNetTime","getNetTime","waitForEndAsyn","waitForEnd","setAnimationListener"));
        sIgnoreStaticMap.put("DevMediaManager", Utils.asList("createMedia", "destroyMedia", "bindListener", "setAudioStreamType", "playPrepareRaw", "playPrepareRaw", "playPrepareAssets", "playPrepareAssets", "playPrepare", "playPrepare", "playPrepare", "isPlaying", "pause", "stop", "onError", "onVideoSizeChanged", "onPrepared", "onCompletion", "onBufferingUpdate", "onSeekComplete", "setMeidaListener", "isNullMediaPlayer", "isNotNullMediaPlayer", "getMediaPlayer", "setMediaPlayer", "setTAG", "getVolume", "setVolume", "clearMediaPlayerData", "getPlayRawId", "getPlayUri", "getVideoWidth", "getVideoHeight", "getCurrentPosition", "getDuration", "getPlayPercent"));
        sIgnoreStaticMap.put("DevVideoPlayerControl", Utils.asList("resetOperate", "surfaceChanged", "surfaceCreated", "surfaceDestroyed", "onPrepared", "onCompletion", "onBufferingUpdate", "onSeekComplete", "onError", "onVideoSizeChanged", "setMediaListener", "pausePlayer", "stopPlayer", "startPlayer", "startPlayer", "startPlayer", "getSurfaceview", "isPlaying", "isPlaying", "isAutoPlay", "setAutoPlay", "getPlayUri", "getVideoWidth", "getVideoHeight", "getCurrentPosition", "getDuration", "getPlayPercent"));
        sIgnoreStaticMap.put("FlashlightUtils", Utils.asList("register", "unregister", "setFlashlightOn", "setFlashlightOn", "setFlashlightOff", "setFlashlightOff", "isFlashlightOn", "isFlashlightOn"));
        sIgnoreStaticMap.put("IToastImpl", Utils.asList("reset", "setIsHandler", "setNullText", "setTextLength", "init", "style", "defaultStyle", "getToastStyle", "initStyle", "initToastFilter", "setView", "show", "show", "show", "show", "cancel", "filter", "handlerContent", "getThreadToastStyle", "createView", "priShowToastText", "newToastText", "priShowToastView", "newToastView"));
        sIgnoreStaticMap.put("ImageUtils.ImageType", Utils.asList("getValue"));
        sIgnoreStaticMap.put("InactivityTimerAssist", Utils.asList("onPause", "onResume", "onDestroy", "start", "cancel"));
        sIgnoreStaticMap.put("InactivityTimerAssist.InactivityAsyncTask", Utils.asList("doInBackground"));
        sIgnoreStaticMap.put("InactivityTimerAssist.PowerStatusReceiver", Utils.asList("onReceive"));
        sIgnoreStaticMap.put("KeyValueBean", Utils.asList("getKey", "getValue", "toString"));
        sIgnoreStaticMap.put("KeyguardUtils", Utils.asList("isKeyguardLocked", "isKeyguardSecure", "inKeyguardRestrictedInputMode", "getKeyguardManager", "setKeyguardManager", "disableKeyguard", "reenableKeyguard", "release", "getKeyguardLock", "setKeyguardLock"));
        sIgnoreStaticMap.put("LocationUtils.CustomLocationListener", Utils.asList("onLocationChanged", "onStatusChanged", "onProviderEnabled", "onProviderDisabled"));
        sIgnoreStaticMap.put("LoggerPrinter", Utils.asList("other", "getLogConfig", "init", "init", "d", "e", "e", "e", "w", "i", "v", "wtf", "json", "xml", "dTag", "eTag", "eTag", "eTag", "wTag", "iTag", "vTag", "wtfTag", "jsonTag", "xmlTag", "isPrintLog", "checkLogLevel", "finalLogPrinter", "logHandle", "logHandle", "logHandle", "logHeaderContent", "logTopBorder", "logBottomBorder", "logDivider", "logContent", "createMessage", "getSimpleClassName", "getStackOffset", "getThreadLogConfig"));
        sIgnoreStaticMap.put("NotificationUtils.VibratePattern", Utils.asList("isEmpty"));
        sIgnoreStaticMap.put("OSUtils.ROM", Utils.asList("getVersion", "setVersion", "getBaseVersion", "setBaseVersion"));
        sIgnoreStaticMap.put("PathUtils.AppExternalPath", Utils.asList("getAppDataPath","getAppDataDir","getAppDataPath","getAppDataDir","getAppCachePath","getAppCacheDir","getAppCachePath","getAppCacheDir","getExternalFilesPath","getExternalFilesDir","getAppFilesPath","getAppFilesDir","getAppFilesPath","getAppFilesDir","getAppMusicPath","getAppMusicDir","getAppPodcastsPath","getAppPodcastsDir","getAppRingtonesPath","getAppRingtonesDir","getAppAlarmsPath","getAppAlarmsDir","getAppNotificationsPath","getAppNotificationsDir","getAppPicturesPath","getAppPicturesDir","getAppMoviesPath","getAppMoviesDir","getAppDownloadPath","getAppDownloadDir","getAppDCIMPath","getAppDCIMDir","getAppDocumentsPath","getAppDocumentsDir","getAppAudiobooksPath","getAppAudiobooksDir","getAppObbPath","getAppObbDir"));
        sIgnoreStaticMap.put("PathUtils.InternalPath", Utils.asList("getRootPath","getRootDirectory","getDataPath","getDataDirectory","getDownloadCachePath","getDownloadCacheDirectory","getAppDataPath","getAppDataDir","getAppDataPath","getAppDataDir","getAppCachePath","getAppCacheDir","getAppCachePath","getAppCacheDir","getAppCodeCachePath","getAppCodeCacheDir","getAppDbsPath","getAppDbsDir","getAppDbPath","getAppDbFile","getAppFilesPath","getAppFilesDir","getAppSpPath","getAppSpDir","getAppSpPath","getAppSpFile","getAppNoBackupFilesPath","getAppNoBackupFilesDir"));
        sIgnoreStaticMap.put("PathUtils.SDCardPath", Utils.asList("isSDCardEnable","getSDCardFile","getSDCardPath","getSDCardFile","getSDCardPath","getExternalStoragePublicPath","getExternalStoragePublicDir","getMusicPath","getMusicDir","getPodcastsPath","getPodcastsDir","getRingtonesPath","getRingtonesDir","getAlarmsPath","getAlarmsDir","getNotificationsPath","getNotificationsDir","getPicturesPath","getPicturesDir","getMoviesPath","getMoviesDir","getDownloadPath","getDownloadDir","getDCIMPath","getDCIMDir","getDocumentsPath","getDocumentsDir","getAudiobooksPath","getAudiobooksDir"));
        sIgnoreStaticMap.put("PermissionUtils", Utils.asList("callBack", "setRequestPermissionsResult", "request", "request", "onRequestPermissionsResultCommon", "checkPermissions", "requestCallback", "getPermissionsStatus"));
        sIgnoreStaticMap.put("PermissionUtils.PermissionActivity", Utils.asList("onCreate", "onRequestPermissionsResult"));
        sIgnoreStaticMap.put("PhoneUtils.TeleInfo", Utils.asList("printInfo"));
        sIgnoreStaticMap.put("PowerManagerUtils", Utils.asList("isScreenOn", "turnScreenOn", "turnScreenOff", "getWakeLock", "setWakeLock", "getPowerManager", "setPowerManager"));
        sIgnoreStaticMap.put("PreferenceImpl", Utils.asList("put", "getValue", "put", "putAll", "putAll", "putAll", "get", "getAll", "getAll", "remove", "removeAll", "removeAll", "contains", "clear", "getInt", "getFloat", "getLong", "getBoolean", "getString", "getSet"));
        sIgnoreStaticMap.put("PreferenceImpl.ComparatorImpl", Utils.asList("compare"));
        sIgnoreStaticMap.put("ScreenSensorAssist", Utils.asList("init", "start", "stop", "isPortrait", "isAllowChange"));
        sIgnoreStaticMap.put("ScreenSensorAssist.OrientationSensorChangeListener", Utils.asList("onAccuracyChanged", "onSensorChanged"));
        sIgnoreStaticMap.put("ScreenSensorAssist.OrientationSensorListener", Utils.asList("onAccuracyChanged", "onSensorChanged"));
        sIgnoreStaticMap.put("ShapeUtils", Utils.asList("getDrawable", "setDrawable"));
        sIgnoreStaticMap.put("ShapeUtils.Builder", Utils.asList("build", "setRadius", "setRadiusLeft", "setRadiusLeft", "setRadiusRight", "setRadiusRight", "setCornerRadii", "setColor", "setColor", "setStroke", "setStroke", "setStroke", "setSize", "setPadding", "getOrientation"));
        sIgnoreStaticMap.put("ShellUtils.CommandResult", Utils.asList("isSuccess", "isSuccess2", "isSuccess3", "isSuccess4"));
        sIgnoreStaticMap.put("SnackbarUtils", Utils.asList("getStyle", "setStyle", "getSnackbar", "getSnackbarView", "getTextView", "getActionButton", "addView", "addView", "setCallback", "setAction", "setAction", "setAction", "setAction", "dismiss", "dismiss", "showShort", "showLong", "showIndefinite", "showShort", "showLong", "showIndefinite", "priShow", "setSnackbarStyle", "setSnackbarStyle", "getShadowMargin", "setShadowMargin", "isAutoCalc", "setAutoCalc", "clearLocations", "above", "bellow", "setSnackbarLocation"));
        sIgnoreStaticMap.put("SnackbarUtils.StyleBuilder", Utils.asList("getRootGravity", "setRootGravity", "getRootCornerRadius", "setRootCornerRadius", "getRootBackgroundTintColor", "setRootBackgroundTintColor", "getRootBackground", "setRootBackground", "getRootMargin", "setRootMargin", "getRootAlpha", "setRootAlpha", "getTextGravity", "setTextGravity", "getTextColor", "setTextColor", "getTextSize", "setTextSize", "getTextMaxLines", "setTextMaxLines", "getTextEllipsize", "setTextEllipsize", "getTextTypeface", "setTextTypeface", "getTextPadding", "setTextPadding", "getActionGravity", "setActionGravity", "getActionColor", "setActionColor", "getActionSize", "setActionSize", "getActionPadding", "setActionPadding", "getActionCornerRadius", "setActionCornerRadius", "getActionBackgroundTintColor", "setActionBackgroundTintColor", "getActionBackground", "setActionBackground"));
        sIgnoreStaticMap.put("SpannableStringUtils", Utils.asList("setFlag", "setForegroundColor", "setBackgroundColor", "setLineHeight", "setLineHeight", "setQuoteColor", "setQuoteColor", "setLeadingMargin", "setBullet", "setBullet", "setFontSize", "setFontSize", "setFontProportion", "setFontXProportion", "setStrikethrough", "setUnderline", "setSuperscript", "setSubscript", "setBold", "setItalic", "setBoldItalic", "setFontFamily", "setTypeface", "setHorizontalAlign", "setVerticalAlign", "setClickSpan", "setUrl", "setBlur", "setShader", "setShadow", "setSpans", "append", "appendLine", "appendLine", "appendImage", "appendImage", "appendImage", "appendImage", "appendImage", "appendImage", "appendSpace", "appendSpace", "get", "create", "apply", "applyLast", "updateCharCharSequence", "updateImage", "updateSpace", "setDefault"));
        sIgnoreStaticMap.put("SpannableStringUtils.CustomBulletSpan", Utils.asList("getLeadingMargin", "drawLeadingMargin"));
        sIgnoreStaticMap.put("SpannableStringUtils.CustomImageSpan", Utils.asList("getDrawable"));
        sIgnoreStaticMap.put("SpannableStringUtils.CustomLineHeightSpan", Utils.asList("chooseHeight"));
        sIgnoreStaticMap.put("SpannableStringUtils.CustomQuoteSpan", Utils.asList("getLeadingMargin", "drawLeadingMargin"));
        sIgnoreStaticMap.put("SpannableStringUtils.CustomTypefaceSpan", Utils.asList("updateDrawState", "updateMeasureState", "apply"));
        sIgnoreStaticMap.put("SpannableStringUtils.ShaderSpan", Utils.asList("updateDrawState"));
        sIgnoreStaticMap.put("SpannableStringUtils.ShadowSpan", Utils.asList("updateDrawState"));
        sIgnoreStaticMap.put("SpannableStringUtils.SpaceSpan", Utils.asList("getSize", "draw"));
        sIgnoreStaticMap.put("SpannableStringUtils.VerticalAlignSpan", Utils.asList("getSize", "draw"));
        sIgnoreStaticMap.put("TimerManager.TimerTask", Utils.asList("start", "close", "startTimer", "closeTimer", "isRunTimer", "getTriggerNumber", "getTriggerLimit", "isTriggerEnd", "isInfinite", "setHandler", "setNotifyWhat", "setNotifyObject", "setTime", "setTriggerLimit"));
        sIgnoreStaticMap.put("ToastFactory.BaseToast", Utils.asList("setView", "setText", "findTextView", "isEmptyMessageView", "getMessageView"));
        sIgnoreStaticMap.put("ToastFactory.NotificationToast", Utils.asList("show", "cancel"));
        sIgnoreStaticMap.put("ToastFactory.SafeToast.SafeHandler", Utils.asList("handleMessage", "dispatchMessage"));
        sIgnoreStaticMap.put("ToastFactory.ToastHelper", Utils.asList("handleMessage", "show", "cancel"));
        sIgnoreStaticMap.put("ToastTintUtils.DefaultStyle", Utils.asList("getTextColor", "getTextSize", "getBackgroundTintColor", "getBackground", "getMaxLines", "getEllipsize", "getTypeface", "getTintIconColor", "isTintIcon"));
        sIgnoreStaticMap.put("ToastTintUtils.ErrorStyle", Utils.asList("getBackgroundTintColor", "isTintIcon"));
        sIgnoreStaticMap.put("ToastTintUtils.InfoStyle", Utils.asList("getBackgroundTintColor", "isTintIcon"));
        sIgnoreStaticMap.put("ToastTintUtils.NormalStyle", Utils.asList("getBackgroundTintColor", "isTintIcon"));
        sIgnoreStaticMap.put("ToastTintUtils.SafeHandler", Utils.asList("handleMessage", "dispatchMessage"));
        sIgnoreStaticMap.put("ToastTintUtils.SuccessStyle", Utils.asList("getBackgroundTintColor", "isTintIcon"));
        sIgnoreStaticMap.put("ToastTintUtils.WarningStyle", Utils.asList("getBackgroundTintColor", "isTintIcon"));
        sIgnoreStaticMap.put("ToastUtils.SafeHandler", Utils.asList("handleMessage", "dispatchMessage"));
        sIgnoreStaticMap.put("ViewHelper", Utils.asList("viewHelper","devHelper","postRunnable","postRunnable","postRunnable","postRunnable","removeRunnable","setHint","setText","setTexts","setHtmlText","setHtmlTexts","setHintTextColor","setHintTextColor","setHintTextColors","setHintTextColors","setTextColor","setTextColor","setTextColors","setTextColors","setTypeface","setTextSizeByPx","setTextSizeBySp","setTextSizeByDp","setTextSizeByIn","setTextSize","setTextSizes","clearFlags","setBold","setBold","setBold","setUnderlineText","setUnderlineText","setStrikeThruText","setStrikeThruText","setLetterSpacing","setLineSpacing","setLineSpacingAndMultiplier","setTextScaleX","setIncludeFontPadding","setInputType","setImeOptions","setLines","setMaxLines","setMinLines","setMaxEms","setMinEms","setEms","setEllipsize","setAutoLinkMask","setAllCaps","setTextGravity","setText","insert","insert","setMaxLength","setMaxLengthAndText","setCursorVisible","setSelectionToTop","setSelectionToBottom","setSelection","setTransformationMethod","setTransformationMethod","setTransformationMethod","addTextChangedListener","removeTextChangedListener","setKeyListener","setKeyListener","setKeyListener","setAdjustViewBounds","setMaxHeight","setMaxWidth","setBackground","setBackgroundColor","setBackgroundResource","setBackgroundTintList","setBackgroundTintMode","setForeground","setForegroundGravity","setForegroundTintList","setForegroundTintMode","setImageBitmap","setImageDrawable","setImageResource","setImageMatrix","setImageTintList","setImageTintMode","setScaleType","setColorFilter","setColorFilter","setColorFilter","setColorFilter","setBackgroundResources","setBackgroundResources","setImageResources","setImageResources","setImageBitmaps","setImageBitmaps","setImageDrawables","setImageDrawables","setScaleTypes","setScaleTypes","setWidthHeight","setWidthHeight","setWidth","setWidth","setHeight","setHeight","setMinimumHeight","setMinimumWidth","setAlpha","setTag","scrollTo","scrollBy","setDescendantFocusability","setOverScrollMode","setHorizontalScrollBarEnabled","setVerticalScrollBarEnabled","setScrollContainer","setNextFocusForwardId","setNextFocusDownId","setNextFocusLeftId","setNextFocusRightId","setNextFocusUpId","setRotation","setRotationX","setRotationY","setScaleX","setScaleY","setTextAlignment","setTextDirection","setPivotX","setPivotY","setTranslationX","setTranslationY","setLayerType","requestLayout","requestFocus","clearFocus","requestLayoutParent","setLayoutParams","setFocusableInTouchMode","setFocusable","toggleFocusable","setSelected","toggleSelected","setEnabled","toggleEnabled","setClickable","toggleClickable","setLongClickable","toggleLongClickable","setVisibility","setVisibility","setVisibilitys","setVisibilitys","toggleVisibilitys","toggleVisibilitys","toggleVisibilitys","reverseVisibilitys","reverseVisibilitys","reverseVisibilitys","reverseVisibilitys","removeSelfFromParent","setLayoutGravity","setMarginLeft","setMarginLeft","setMarginTop","setMarginTop","setMarginRight","setMarginRight","setMarginBottom","setMarginBottom","setMargin","setMargin","setMargin","setMargin","setMargin","setMargin","setPaddingLeft","setPaddingLeft","setPaddingTop","setPaddingTop","setPaddingRight","setPaddingRight","setPaddingBottom","setPaddingBottom","setPadding","setPadding","setPadding","setPadding","setPadding","setPadding","setCompoundDrawablePadding","setCompoundDrawablesByLeft","setCompoundDrawablesByTop","setCompoundDrawablesByRight","setCompoundDrawablesByBottom","setCompoundDrawables","setCompoundDrawablesWithIntrinsicBoundsByLeft","setCompoundDrawablesWithIntrinsicBoundsByTop","setCompoundDrawablesWithIntrinsicBoundsByRight","setCompoundDrawablesWithIntrinsicBoundsByBottom","setCompoundDrawablesWithIntrinsicBounds","addRule","addRule","removeRule","addRules","addRules","removeRules","setAnimation","clearAnimation","startAnimation","setOnClicks","setOnLongClicks","setOnTouchs","addTouchArea","addTouchArea","smoothScrollToPosition","scrollToPosition","smoothScrollToTop","scrollToTop","smoothScrollToBottom","scrollToBottom","smoothScrollTo","smoothScrollBy","fullScroll"));
        sIgnoreStaticMap.put("WifiHotUtils", Utils.asList("stratWifiAp", "closeWifiAp", "getWifiApState", "getWifiApConfiguration", "setWifiApConfiguration", "isOpenWifiAp", "closeWifiApCheck", "isConnectHot", "getHotspotServiceIp", "getHotspotAllotIp", "getConnectHotspotMsg", "getHotspotSplitIpMask", "intToString", "getApWifiSSID", "getApWifiPwd", "setOnWifiAPListener"));
        sIgnoreStaticMap.put("WifiUtils", Utils.asList("isOpenWifi", "openWifi", "closeWifi", "toggleWifiEnabled", "getWifiState", "startScan", "getConfiguration", "getWifiList", "getWifiInfo", "isExists", "isExists", "quickConnWifi", "quickConnWifi", "removeWifiConfig", "disconnectWifi", "setStaticWifiConfig", "setStaticWifiConfig", "inetAddressToInt", "setDNS", "setGateway", "setIpAddress", "setStaticIpConfig", "getField", "getDeclaredField", "setEnumField", "setValueField"));
        sIgnoreStaticMap.put("WifiVo", Utils.asList("describeContents", "writeToParcel"));

        // ==========
        // = Common =
        // ==========

        sIgnoreStaticMap.put("AliasMethod", Utils.asList("next"));
        sIgnoreStaticMap.put("Averager", Utils.asList("add", "clear", "size", "getAverage", "print"));
        sIgnoreStaticMap.put("Base64.Decoder", Utils.asList("maxOutputSize", "process"));
        sIgnoreStaticMap.put("Base64.Encoder", Utils.asList("maxOutputSize", "process"));
        sIgnoreStaticMap.put("Base64Cipher", Utils.asList("decrypt", "encrypt"));
        sIgnoreStaticMap.put("CollectionUtils.ArrayWithTypeToken", Utils.asList("put", "get", "create", "newInstance", "newInstance"));
        sIgnoreStaticMap.put("DevThreadPool", Utils.asList("getThreads", "getCalcThreads", "execute", "execute", "execute", "shutdown", "shutdownNow", "isShutdown", "isTerminated", "awaitTermination", "submit", "submit", "submit", "invokeAll", "invokeAll", "invokeAny", "invokeAny", "schedule", "schedule", "scheduleWithFixedRate", "scheduleWithFixedDelay"));
        sIgnoreStaticMap.put("FileBreadthFirstSearchUtils", Utils.asList("setSearchHandler", "getQueueSameTimeNumber", "setQueueSameTimeNumber", "isRunning", "stop", "isStop", "getStartTime", "getEndTime", "getDelayTime", "setDelayTime", "query", "queryFile", "whileQueue"));
        sIgnoreStaticMap.put("FileBreadthFirstSearchUtils.FileItem", Utils.asList("put"));
        sIgnoreStaticMap.put("FileDepthFirstSearchUtils", Utils.asList("setSearchHandler", "isRunning", "stop", "isStop", "getStartTime", "getEndTime", "query", "queryFile"));
        sIgnoreStaticMap.put("ReflectUtils", Utils.asList("newInstance", "newInstance", "getArgsType", "sortConstructors", "newInstance", "field", "field", "getField", "getAccessibleField", "unwrap", "setEnumVal", "method", "method", "method", "exactMethod", "similarMethod", "sortMethods", "isSimilarSignature", "match", "accessible", "proxy", "property", "type", "wrapper", "get", "hashCode", "equals", "toString"));
        sIgnoreStaticMap.put("TimeAverager", Utils.asList("start", "end", "endAndRestart", "average", "print", "clear"));
        sIgnoreStaticMap.put("TimeCounter", Utils.asList("start", "durationRestart", "duration", "getStartTime"));
        sIgnoreStaticMap.put("TimeKeeper", Utils.asList("waitForEndAsyn", "waitForEnd"));
    }

    /**
     * 初始化 忽略指定方法 @param 处理
     */
    private static void initIgnoreParamMap() {

        // ====================
        // = 根目录三个工具类 =
        // ====================

        sIgnoreParamMap.put("DevUtils.AbstractActivityLifecycle", Utils.asList("onActivityCreated", "onActivityStarted", "onActivityResumed", "onActivityPaused", "onActivityStopped", "onActivitySaveInstanceState", "onActivityDestroyed"));
        sIgnoreParamMap.put("DevUtils.ActivityLifecycleImpl", Utils.asList("onActivityCreated", "onActivityStarted", "onActivityResumed", "onActivityPaused", "onActivityStopped", "onActivitySaveInstanceState", "onActivityDestroyed"));
        sIgnoreParamMap.put("JCLogUtils", Utils.asList("d", "e", "e", "e", "i", "xml", "dTag", "eTag", "eTag", "eTag", "iTag", "xmlTag"));
        sIgnoreParamMap.put("LogPrintUtils", Utils.asList("d", "e", "e", "e", "w", "i", "v", "wtf", "json", "xml", "dTag", "eTag", "eTag", "eTag", "wTag", "iTag", "vTag", "wtfTag", "jsonTag", "xmlTag"));

        // =======
        // = APP =
        // =======

        sIgnoreParamMap.put("AutoFocusAssist.AutoFocusTask", Utils.asList("doInBackground"));
        sIgnoreParamMap.put("InactivityTimerAssist.InactivityAsyncTask", Utils.asList("doInBackground"));
        sIgnoreParamMap.put("InactivityTimerAssist.PowerStatusReceiver", Utils.asList("onReceive"));
        sIgnoreParamMap.put("PreferenceImpl.ComparatorImpl", Utils.asList("compare"));
        sIgnoreParamMap.put("ScreenSensorAssist.OrientationSensorChangeListener", Utils.asList("onAccuracyChanged", "onSensorChanged"));
        sIgnoreParamMap.put("ScreenSensorAssist.OrientationSensorListener", Utils.asList("onAccuracyChanged", "onSensorChanged"));
        sIgnoreParamMap.put("SpannableStringUtils.CustomBulletSpan", Utils.asList("getLeadingMargin", "drawLeadingMargin"));
        sIgnoreParamMap.put("SpannableStringUtils.CustomDynamicDrawableSpan", Utils.asList("getSize", "draw"));
        sIgnoreParamMap.put("SpannableStringUtils.CustomLineHeightSpan", Utils.asList("chooseHeight"));
        sIgnoreParamMap.put("SpannableStringUtils.CustomQuoteSpan", Utils.asList("getLeadingMargin", "drawLeadingMargin"));
        sIgnoreParamMap.put("SpannableStringUtils.CustomTypefaceSpan", Utils.asList("updateDrawState", "updateMeasureState", "apply"));
        sIgnoreParamMap.put("SpannableStringUtils.ShaderSpan", Utils.asList("updateDrawState"));
        sIgnoreParamMap.put("SpannableStringUtils.ShadowSpan", Utils.asList("updateDrawState"));
        sIgnoreParamMap.put("SpannableStringUtils.SpaceSpan", Utils.asList("getSize", "draw"));
        sIgnoreParamMap.put("SpannableStringUtils.VerticalAlignSpan", Utils.asList("getSize", "draw"));
        sIgnoreParamMap.put("ToastFactory.BaseToast", Utils.asList("setView", "setText"));
        sIgnoreParamMap.put("ToastFactory.SafeToast.SafeHandler", Utils.asList("handleMessage", "dispatchMessage"));
        sIgnoreParamMap.put("ToastFactory.ToastHelper", Utils.asList("handleMessage"));
        sIgnoreParamMap.put("ToastTintUtils.SafeHandler", Utils.asList("handleMessage", "dispatchMessage"));
        sIgnoreParamMap.put("ToastUtils.SafeHandler", Utils.asList("handleMessage", "dispatchMessage"));
        sIgnoreParamMap.put("WifiVo", Utils.asList("writeToParcel"));

        // ==========
        // = Common =
        // ==========

        sIgnoreParamMap.put("Base64.Coder", Utils.asList("process", "maxOutputSize"));
        sIgnoreParamMap.put("Base64.Decoder", Utils.asList("maxOutputSize", "process"));
        sIgnoreParamMap.put("Base64.Encoder", Utils.asList("maxOutputSize", "process"));
    }

    /**
     * 初始化 忽略指定方法 @return 处理
     */
    private static void initIgnoreReturnMap() {

        // =======
        // = APP =
        // =======

        // ==========
        // = Common =
        // ==========

        sIgnoreReturnMap.put("Base64", Utils.asList("decode", "decode", "decode", "encodeToString", "encodeToString", "encode", "encode"));
    }

    /**
     * 初始化 忽略指定方法非 public 处理
     */
    private static void initIgnoreUnPublicMap() {

        // ====================
        // = 根目录三个工具类 =
        // ====================

        sIgnoreUnPublicMap.put("DevUtils", Utils.asList("initContext", "initApplication", "getApplicationByReflect", "registerActivityLifecycleCallbacks", "unregisterActivityLifecycleCallbacks"));
        sIgnoreUnPublicMap.put("DevUtils.ActivityLifecycleFilter", Utils.asList("filter"));
        sIgnoreUnPublicMap.put("DevUtils.ActivityLifecycleGet", Utils.asList("getTopActivity", "isTopActivity", "isTopActivity", "isBackground", "getActivityCount"));
        sIgnoreUnPublicMap.put("DevUtils.ActivityLifecycleImpl", Utils.asList("setTopActivity", "getTopActivityByReflect", "postStatus", "consumeOnActivityDestroyedListener"));
        sIgnoreUnPublicMap.put("DevUtils.ActivityLifecycleNotify", Utils.asList("addOnAppStatusChangedListener", "removeOnAppStatusChangedListener", "removeAllOnAppStatusChangedListener", "addOnActivityDestroyedListener", "removeOnActivityDestroyedListener", "removeAllOnActivityDestroyedListener"));
        sIgnoreUnPublicMap.put("DevUtils.OnActivityDestroyedListener", Utils.asList("onActivityDestroyed"));
        sIgnoreUnPublicMap.put("DevUtils.OnAppStatusChangedListener", Utils.asList("onForeground", "onBackground"));
        sIgnoreUnPublicMap.put("JCLogUtils", Utils.asList("isEmpty", "printLog", "createMessage", "splitErrorMessage"));
        sIgnoreUnPublicMap.put("JCLogUtils.Print", Utils.asList("printLog"));
        sIgnoreUnPublicMap.put("LogPrintUtils", Utils.asList("isEmpty", "printLog", "createMessage", "splitErrorMessage"));

        // =======
        // = APP =
        // =======

        sIgnoreUnPublicMap.put("AnalysisRecordUtils", Utils.asList("saveLogRecord", "splitLog", "handlerDeviceInfo"));
        sIgnoreUnPublicMap.put("AnalysisRecordUtils.CallBack", Utils.asList("callback"));
        sIgnoreUnPublicMap.put("ApkInfoItem", Utils.asList("obtain"));
        sIgnoreUnPublicMap.put("AppInfoBean", Utils.asList("obtain"));
        sIgnoreUnPublicMap.put("AppInfoItem", Utils.asList("obtain"));
        sIgnoreUnPublicMap.put("AsyncExecutor", Utils.asList("postResult", "postCancel"));
        sIgnoreUnPublicMap.put("AsyncExecutor.Worker", Utils.asList("doInBackground", "onPostExecute", "onCanceled", "abort"));
        sIgnoreUnPublicMap.put("AutoFocusAssist", Utils.asList("autoFocusAgainLater", "cancelOutstandingTask"));
        sIgnoreUnPublicMap.put("AutoFocusAssist.AutoFocusTask", Utils.asList("doInBackground"));
        sIgnoreUnPublicMap.put("BarUtils", Utils.asList("addMarginTopEqualStatusBarHeight", "subtractMarginTopEqualStatusBarHeight", "addStatusBarColor", "addStatusBarAlpha", "hideColorView", "hideAlphaView", "hideColorView", "hideAlphaView", "showColorView", "showAlphaView", "getStatusBarColor", "createColorStatusBarView", "createAlphaStatusBarView", "transparentStatusBar", "invokePanels"));
        sIgnoreUnPublicMap.put("BeepVibrateAssist", Utils.asList("shouldBeep", "streamUpdate"));
        sIgnoreUnPublicMap.put("CameraAssist", Utils.asList("freeCameraResource"));
        sIgnoreUnPublicMap.put("CameraAssist.PreviewNotify", Utils.asList("stopPreviewNotify", "startPreviewNotify"));
        sIgnoreUnPublicMap.put("CameraSizeAssist", Utils.asList("calcPreviewSize", "calcPictureSize", "calcVideoSize"));
        sIgnoreUnPublicMap.put("CapturePictureUtils", Utils.asList("snapshotByRecyclerView_GridLayoutManager", "snapshotByRecyclerView_LinearLayoutManager", "snapshotByRecyclerView_StaggeredGridLayoutManager", "canvasBitmap"));
        sIgnoreUnPublicMap.put("CrashUtils", Utils.asList("handleException"));
        sIgnoreUnPublicMap.put("CrashUtils.CrashCatchListener", Utils.asList("handleException", "uncaughtException"));
        sIgnoreUnPublicMap.put("DevCache", Utils.asList("myPid", "getCachePath"));
        sIgnoreUnPublicMap.put("DevCacheManager", Utils.asList("calculateCacheSizeAndCacheCount", "put", "get", "newFile", "remove", "clear", "removeNext", "calculateSize"));
        sIgnoreUnPublicMap.put("DevCacheUtils", Utils.asList("isDue", "isDue", "newStringWithDateInfo", "newByteArrayWithDateInfo", "createDateInfo", "clearDateInfo", "clearDateInfo", "hasDateInfo", "getDateInfoFromDate", "indexOf", "copyOfRange", "bitmapToByte", "byteToBitmap", "drawableToBitmap", "bitmapToDrawable"));
        sIgnoreUnPublicMap.put("DevMediaManager", Utils.asList("createMedia", "destroyMedia", "bindListener", "clearMediaPlayerData"));
        sIgnoreUnPublicMap.put("DevMediaManager.MediaListener", Utils.asList("onPrepared", "onCompletion", "onBufferingUpdate", "onSeekComplete", "onError", "onVideoSizeChanged"));
        sIgnoreUnPublicMap.put("DevVideoPlayerControl", Utils.asList("resetOperate"));
        sIgnoreUnPublicMap.put("DeviceUtils", Utils.asList("getMacAddressByWifiInfo", "getMacAddressByNetworkInterface", "getMacAddressByInetAddress", "getInetAddress", "getMacAddressByFile"));
        sIgnoreUnPublicMap.put("HandlerUtils.OnEndListener", Utils.asList("onEnd"));
        sIgnoreUnPublicMap.put("IPreference", Utils.asList("put", "putAll", "putAll", "putAll", "get", "getAll", "getAll", "remove", "removeAll", "removeAll", "contains", "clear", "getInt", "getFloat", "getLong", "getBoolean", "getString", "getSet"));
        sIgnoreUnPublicMap.put("IPrinter", Utils.asList("other", "getLogConfig", "init", "init", "d", "e", "e", "e", "w", "i", "v", "wtf", "json", "xml", "dTag", "eTag", "eTag", "eTag", "wTag", "iTag", "vTag", "wtfTag", "jsonTag", "xmlTag"));
        sIgnoreUnPublicMap.put("IToast.Filter", Utils.asList("filter", "handlerContent"));
        sIgnoreUnPublicMap.put("IToast.Operate", Utils.asList("reset", "setIsHandler", "setNullText", "setTextLength", "init", "style", "defaultStyle", "getToastStyle", "initStyle", "initToastFilter", "setView", "show", "show", "show", "show", "cancel"));
        sIgnoreUnPublicMap.put("IToast.Style", Utils.asList("getGravity", "getXOffset", "getYOffset", "getHorizontalMargin", "getVerticalMargin", "getZ", "getCornerRadius", "getBackgroundTintColor", "getBackground", "getTextColor", "getTextSize", "getMaxLines", "getEllipsize", "getTypeface", "getPadding"));
        sIgnoreUnPublicMap.put("IToastImpl", Utils.asList("getThreadToastStyle", "createView", "priShowToastText", "newToastText", "priShowToastView", "newToastView"));
        sIgnoreUnPublicMap.put("ImageConvertUtils.BMP", Utils.asList("addBMPImageHeader", "addBMPImageInfosHeader", "addBMP_ARGB_8888"));
        sIgnoreUnPublicMap.put("ImageViewUtils", Utils.asList("getImageViewFieldValue"));
        sIgnoreUnPublicMap.put("InactivityTimerAssist", Utils.asList("start", "cancel"));
        sIgnoreUnPublicMap.put("InactivityTimerAssist.InactivityAsyncTask", Utils.asList("doInBackground"));
        sIgnoreUnPublicMap.put("KeyBoardUtils", Utils.asList("getContentViewInvisibleHeight"));
        sIgnoreUnPublicMap.put("KeyBoardUtils.OnSoftInputChangedListener", Utils.asList("onSoftInputChanged"));
        sIgnoreUnPublicMap.put("LocationUtils", Utils.asList("getCriteria"));
        sIgnoreUnPublicMap.put("LocationUtils.OnLocationChangeListener", Utils.asList("getLastKnownLocation", "onLocationChanged", "onStatusChanged"));
        sIgnoreUnPublicMap.put("LoggerPrinter", Utils.asList("isPrintLog", "checkLogLevel", "finalLogPrinter", "logHandle", "logHandle", "logHandle", "logHeaderContent", "logTopBorder", "logBottomBorder", "logDivider", "logContent", "createMessage", "getSimpleClassName", "getStackOffset", "getThreadLogConfig"));
        sIgnoreUnPublicMap.put("OSUtils", Utils.asList("initRomType"));
        sIgnoreUnPublicMap.put("OSUtils.ROM", Utils.asList("setVersion", "setBaseVersion"));
        sIgnoreUnPublicMap.put("PermissionUtils", Utils.asList("onRequestPermissionsResultCommon", "isGranted", "checkPermissions", "requestCallback", "getPermissionsStatus"));
        sIgnoreUnPublicMap.put("PermissionUtils.PermissionActivity", Utils.asList("start", "onCreate"));
        sIgnoreUnPublicMap.put("PermissionUtils.PermissionCallBack", Utils.asList("onGranted", "onDenied"));
        sIgnoreUnPublicMap.put("PreferenceImpl", Utils.asList("put", "getValue"));
        sIgnoreUnPublicMap.put("ScreenSensorAssist", Utils.asList("init"));
        sIgnoreUnPublicMap.put("ShellUtils", Utils.asList("consumeInputStream"));
        sIgnoreUnPublicMap.put("ShortCutUtils", Utils.asList("getAuthority", "getAuthorityFromPermission", "getAuthorityFromPermission"));
        sIgnoreUnPublicMap.put("SignaturesUtils", Utils.asList("loadCertificates"));
        sIgnoreUnPublicMap.put("SizeUtils.onGetSizeListener", Utils.asList("onGetSize"));
        sIgnoreUnPublicMap.put("SnackbarUtils", Utils.asList("priShow", "clearLocations", "setSnackbarLocation"));
        sIgnoreUnPublicMap.put("SpannableStringUtils", Utils.asList("apply", "applyLast", "updateCharCharSequence", "updateImage", "updateSpace", "setDefault", "getContext"));
        sIgnoreUnPublicMap.put("SpannableStringUtils.CustomDynamicDrawableSpan", Utils.asList("getCachedDrawable"));
        sIgnoreUnPublicMap.put("SpannableStringUtils.CustomTypefaceSpan", Utils.asList("apply"));
        sIgnoreUnPublicMap.put("TimerManager.TimerTask", Utils.asList("start", "close"));
        sIgnoreUnPublicMap.put("ToastFactory", Utils.asList("getWindowManager"));
        sIgnoreUnPublicMap.put("ToastFactory.BaseToast", Utils.asList("findTextView"));
        sIgnoreUnPublicMap.put("ToastFactory.ToastHelper", Utils.asList("show", "cancel"));
        sIgnoreUnPublicMap.put("ToastTintUtils", Utils.asList("showToastView", "newToastView", "inflaterView", "reflectToastHandler"));
        sIgnoreUnPublicMap.put("ToastTintUtils.Filter", Utils.asList("filter", "handlerContent"));
        sIgnoreUnPublicMap.put("ToastTintUtils.Style", Utils.asList("getTextColor", "getTextSize", "getBackgroundTintColor", "getBackground", "getMaxLines", "getEllipsize", "getTypeface", "getTintIconColor", "isTintIcon"));
        sIgnoreUnPublicMap.put("ToastUtils", Utils.asList("priShowToastText", "handlerToastRes", "handlerToastStr", "reflectToastHandler"));
        sIgnoreUnPublicMap.put("ToastUtils.Filter", Utils.asList("filter", "handlerContent"));
        sIgnoreUnPublicMap.put("UriUtils", Utils.asList("getFilePathByUri", "getDataColumn", "isExternalStorageDocument", "isDownloadsDocument", "isMediaDocument"));
        sIgnoreUnPublicMap.put("WifiHotUtils", Utils.asList("intToString"));
        sIgnoreUnPublicMap.put("WifiHotUtils.OnWifiAPListener", Utils.asList("onStarted", "onStopped", "onFailed"));
        sIgnoreUnPublicMap.put("WifiUtils", Utils.asList("setStaticWifiConfig", "setStaticWifiConfig", "inetAddressToInt", "setDNS", "setGateway", "setIpAddress", "setStaticIpConfig", "getField", "getDeclaredField", "setEnumField", "setValueField"));

        // ==========
        // = Common =
        // ==========

        sIgnoreUnPublicMap.put("CollectionUtils.ArrayWithTypeToken", Utils.asList("newInstance", "newInstance"));
        sIgnoreUnPublicMap.put("ColorUtils", Utils.asList("priParseColor"));
        sIgnoreUnPublicMap.put("ConvertUtils", Utils.asList("toDigit", "toHexChars", "toHexString"));
        sIgnoreUnPublicMap.put("CoordinateUtils", Utils.asList("transformLat", "transformLng"));
        sIgnoreUnPublicMap.put("Decrypt", Utils.asList("decrypt"));
        sIgnoreUnPublicMap.put("Encrypt", Utils.asList("encrypt"));
        sIgnoreUnPublicMap.put("EncryptUtils", Utils.asList("base64Encode", "base64Decode"));
        sIgnoreUnPublicMap.put("FileBreadthFirstSearchUtils", Utils.asList("queryFile", "whileQueue"));
        sIgnoreUnPublicMap.put("FileBreadthFirstSearchUtils.FileItem", Utils.asList("put"));
        sIgnoreUnPublicMap.put("FileBreadthFirstSearchUtils.SearchHandler", Utils.asList("isHandlerFile", "isAddToList", "OnEndListener"));
        sIgnoreUnPublicMap.put("FileDepthFirstSearchUtils", Utils.asList("queryFile"));
        sIgnoreUnPublicMap.put("FileDepthFirstSearchUtils.SearchHandler", Utils.asList("isHandlerFile", "isAddToList", "OnEndListener"));
        sIgnoreUnPublicMap.put("FileRecordUtils.CallBack", Utils.asList("callback"));
        sIgnoreUnPublicMap.put("FileUtils", Utils.asList("copyFolder"));
        sIgnoreUnPublicMap.put("FileUtils.OnReplaceListener", Utils.asList("onReplace"));
        sIgnoreUnPublicMap.put("HttpURLConnectionUtils", Utils.asList("reqNetTime"));
        sIgnoreUnPublicMap.put("HttpURLConnectionUtils.CallBack", Utils.asList("onResponse", "onFail"));
        sIgnoreUnPublicMap.put("HttpURLConnectionUtils.TimeCallBack", Utils.asList("onResponse", "onFail"));
        sIgnoreUnPublicMap.put("IDCardUtils", Utils.asList("converCharToInt", "validateDateSmllerThenNow", "isNumber"));
        sIgnoreUnPublicMap.put("NumberUtils", Utils.asList("numberToCHNNumber", "thousandConvertCHN"));
        sIgnoreUnPublicMap.put("ReflectUtils", Utils.asList("forName", "forName", "getArgsType", "sortConstructors", "newInstance", "getField", "getAccessibleField", "unwrap", "method", "exactMethod", "similarMethod", "sortMethods", "isSimilarSignature", "match", "accessible", "property", "wrapper"));
        sIgnoreUnPublicMap.put("TimeKeeper.OnEndCallback", Utils.asList("onEnd"));
        sIgnoreUnPublicMap.put("ZipUtils", Utils.asList("zipFile", "unzipChildFile"));
    }

    // =

    /**
     * 初始化 忽略无修饰符变量 处理
     */
    private static void initIgnoreModifierVariableMap() {

        // ====================
        // = 根目录三个工具类 =
        // ====================

        // =======
        // = APP =
        // =======

        // ==========
        // = Common =
        // ==========

        sIgnoreModifierVariableMap.put("Base64", Utils.asList("        int tailLen;"));
        sIgnoreModifierVariableMap.put("Base64.Encoder", Utils.asList("    int tailLen;"));
    }

    /**
     * 忽略注释间距异常文件
     * @param map {@link HashMap}
     */
    protected static void ignoreAnnotationSpaceMap(final HashMap<String, String> map) {
        // 以下类无需处理, 直接移除
        map.remove("AliasMethod.java");
        map.remove("Base64.java");
    }

    // =

    /**
     * 初始化 忽略指定方法 return void 处理
     */
    private static void initIgnoreReturnVoidMap() {
    }
}
