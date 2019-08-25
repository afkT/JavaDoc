package javadoc.dev_utils.check;

import javadoc.Utils;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * detail: 代码检测分析配置
 * @author Ttt
 */
final class CodeAnalyeConfig {

    private CodeAnalyeConfig() {
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
    }

    // =

    /**
     * 初始化 忽略指定方法注释处理
     */
    private static void initIgnoreAnnotateMap() {

        // ====================
        // = 根目录三个工具类 =
        // ====================

        sIgnoreAnnotateMap.put("DevUtils.AbstractActivityLifecycle",
                Utils.asList("onActivityCreated", "onActivityStarted",
                        "onActivityResumed", "onActivityPaused", "onActivityStopped",
                        "onActivitySaveInstanceState", "onActivityDestroyed"));
        sIgnoreAnnotateMap.put("DevUtils.ActivityLifecycleImpl",
                Utils.asList("onActivityCreated", "onActivityStarted",
                        "onActivityResumed", "onActivityPaused", "onActivityStopped",
                        "onActivitySaveInstanceState", "onActivityDestroyed"));
        sIgnoreAnnotateMap.put("JCLogUtils", Utils.asList("d", "e", "e", "e",
                "i", "xml", "dTag", "eTag", "eTag", "eTag", "iTag", "xmlTag"));
        sIgnoreAnnotateMap.put("LogPrintUtils", Utils.asList("d", "e", "e",
                "e", "w", "i", "v", "wtf", "json", "xml", "dTag", "eTag", "eTag", "eTag",
                "wTag", "iTag", "vTag", "wtfTag", "jsonTag", "xmlTag"));

        // =======
        // = APP =
        // =======

        sIgnoreAnnotateMap.put("AutoFocusAssist.AutoFocusTask", Utils.asList("doInBackground"));
        sIgnoreAnnotateMap.put("DevCache.xFileOutputStream", Utils.asList("close"));
        sIgnoreAnnotateMap.put("InactivityTimerAssist.InactivityAsyncTask", Utils.asList("doInBackground"));
        sIgnoreAnnotateMap.put("InactivityTimerAssist.PowerStatusReceiver", Utils.asList("onReceive"));
        sIgnoreAnnotateMap.put("KeyValueBean", Utils.asList("toString"));
        sIgnoreAnnotateMap.put("PreferenceImpl.ComparatorImpl", Utils.asList("compare"));
        sIgnoreAnnotateMap.put("ScreenSensorAssist.OrientationSensorChangeListener", Utils.asList(
                "onAccuracyChanged", "onSensorChanged"));
        sIgnoreAnnotateMap.put("ScreenSensorAssist.OrientationSensorListener", Utils.asList(
                "onAccuracyChanged", "onSensorChanged"));
        sIgnoreAnnotateMap.put("ToastFactory.BaseToast", Utils.asList("setView", "setText"));
        sIgnoreAnnotateMap.put("ToastFactory.NotificationToast", Utils.asList("show", "cancel"));
        sIgnoreAnnotateMap.put("ToastFactory.SafeToast.SafeHandler", Utils.asList(
                "handleMessage", "dispatchMessage"));
        sIgnoreAnnotateMap.put("ToastFactory.ToastHelper", Utils.asList("handleMessage"));
        sIgnoreAnnotateMap.put("ToastTintUtils.SafeHandler", Utils.asList(
                "handleMessage", "dispatchMessage"));
        sIgnoreAnnotateMap.put("ToastUtils.SafeHandler", Utils.asList(
                "handleMessage", "dispatchMessage"));
        sIgnoreAnnotateMap.put("SpannableStringUtils.CustomBulletSpan", Utils.asList(
                "getLeadingMargin", "drawLeadingMargin"));
        sIgnoreAnnotateMap.put("SpannableStringUtils.CustomDynamicDrawableSpan", Utils.asList(
                "getDrawable", "getSize", "draw", "getCachedDrawable"));
        sIgnoreAnnotateMap.put("SpannableStringUtils.CustomImageSpan", Utils.asList("getDrawable"));
        sIgnoreAnnotateMap.put("SpannableStringUtils.CustomLineHeightSpan", Utils.asList(
                "chooseHeight"));
        sIgnoreAnnotateMap.put("SpannableStringUtils.CustomQuoteSpan", Utils.asList(
                "getLeadingMargin", "drawLeadingMargin"));
        sIgnoreAnnotateMap.put("SpannableStringUtils.CustomTypefaceSpan", Utils.asList(
                "updateDrawState", "updateMeasureState", "apply"));
        sIgnoreAnnotateMap.put("SpannableStringUtils.ShaderSpan", Utils.asList("updateDrawState"));
        sIgnoreAnnotateMap.put("SpannableStringUtils.ShadowSpan", Utils.asList("updateDrawState"));
        sIgnoreAnnotateMap.put("SpannableStringUtils.SpaceSpan", Utils.asList("getSize", "draw"));
        sIgnoreAnnotateMap.put("SpannableStringUtils.VerticalAlignSpan", Utils.asList("getSize", "draw"));
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

        sIgnoreFinalMap.put("DevUtils.ActivityLifecycleImpl",
                Utils.asList("onActivityCreated", "onActivityStarted",
                        "onActivityResumed", "onActivityPaused", "onActivityStopped",
                        "onActivitySaveInstanceState", "onActivityDestroyed"));

        // =======
        // = APP =
        // =======

        sIgnoreFinalMap.put("AutoFocusAssist", Utils.asList("onAutoFocus"));
        sIgnoreFinalMap.put("AutoFocusAssist.AutoFocusTask", Utils.asList("doInBackground"));
        sIgnoreFinalMap.put("BitmapUtils", Utils.asList("combineToCenter",
                "combineToSameSize", "combineToSameSize"));
        sIgnoreFinalMap.put("CameraSizeAssist", Utils.asList("setPreviewSize",
                "setPictureSize", "calcPreviewSize", "calcPictureSize", "calcVideoSize"));
        sIgnoreFinalMap.put("CameraUtils", Utils.asList("initCamera", "open"));
        sIgnoreFinalMap.put("DevMediaManager", Utils.asList("onError",
                "onVideoSizeChanged", "onPrepared", "onCompletion", "onBufferingUpdate", "onSeekComplete"));
        sIgnoreFinalMap.put("DevVideoPlayerControl", Utils.asList(
                "surfaceChanged", "surfaceCreated", "surfaceDestroyed",
                "onBufferingUpdate", "onError", "onVideoSizeChanged"));
        sIgnoreFinalMap.put("IToastImpl", Utils.asList("filter", "handlerContent"));
        sIgnoreFinalMap.put("InactivityTimerAssist.InactivityAsyncTask", Utils.asList("doInBackground"));
        sIgnoreFinalMap.put("InactivityTimerAssist.PowerStatusReceiver", Utils.asList("onReceive"));
        sIgnoreFinalMap.put("LocationUtils.CustomLocationListener", Utils.asList(
                "onLocationChanged", "onStatusChanged", "onProviderEnabled", "onProviderDisabled"));
        sIgnoreFinalMap.put("LoggerPrinter", Utils.asList("logHeaderContent"));
        sIgnoreFinalMap.put("NetWorkUtils", Utils.asList("isAvailableByPing"));
        sIgnoreFinalMap.put("PermissionUtils.PermissionActivity", Utils.asList(
                "onCreate", "onRequestPermissionsResult"));
        sIgnoreFinalMap.put("PreferenceImpl.ComparatorImpl", Utils.asList("compare"));
        sIgnoreFinalMap.put("ScreenSensorAssist.OrientationSensorChangeListener", Utils.asList(
                "onAccuracyChanged", "onSensorChanged"));
        sIgnoreFinalMap.put("ScreenSensorAssist.OrientationSensorListener", Utils.asList(
                "onAccuracyChanged", "onSensorChanged"));
        sIgnoreFinalMap.put("SnackbarUtils.StyleBuilder", Utils.asList(
                "setRootGravity", "setRootCornerRadius", "setRootBackgroundTintColor",
                "setRootBackground", "setRootMargin", "setRootAlpha", "setTextGravity", "setTextColor",
                "setTextSize", "setTextMaxLines", "setTextEllipsize", "setTextTypeface", "setTextPadding",
                "setActionGravity", "setActionColor", "setActionSize", "setActionPadding",
                "setActionCornerRadius", "setActionBackgroundTintColor", "setActionBackground"));
        sIgnoreFinalMap.put("SpannableStringUtils.VerticalAlignSpan", Utils.asList("getSize", "draw"));
        sIgnoreFinalMap.put("ToastFactory.BaseToast", Utils.asList("setView", "setText"));
        sIgnoreFinalMap.put("ToastFactory.SafeToast.SafeHandler", Utils.asList(
                "handleMessage", "dispatchMessage"));
        sIgnoreFinalMap.put("ToastFactory.ToastHelper", Utils.asList("handleMessage"));
        sIgnoreFinalMap.put("ToastTintUtils", Utils.asList("newToastView", "inflaterView"));
        sIgnoreFinalMap.put("ToastTintUtils.SafeHandler", Utils.asList(
                "handleMessage", "dispatchMessage"));
        sIgnoreFinalMap.put("ToastUtils", Utils.asList("newToastText", "newToastView",
                "handlerToastRes", "handlerToastStr"));
        sIgnoreFinalMap.put("ToastUtils.SafeHandler", Utils.asList("handleMessage", "dispatchMessage"));

        // ==========
        // = Common =
        // ==========

        sIgnoreFinalMap.put("Base64", Utils.asList("decode", "decode", "decode", "encodeToString",
                "encodeToString", "encode", "encode"));
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

        sIgnoreStaticMap.put("DevUtils.ActivityLifecycleImpl", Utils.asList(
                "onActivityCreated", "onActivityStarted", "onActivityResumed",
                "onActivityPaused", "onActivityStopped", "onActivitySaveInstanceState",
                "onActivityDestroyed", "setTopActivity", "getTopActivityByReflect",
                "getTopActivity", "isTopActivity", "isTopActivity", "isBackground",
                "getActivityCount", "addOnAppStatusChangedListener", "removeOnAppStatusChangedListener",
                "removeAllOnAppStatusChangedListener", "addOnActivityDestroyedListener",
                "removeOnActivityDestroyedListener", "removeAllOnActivityDestroyedListener",
                "postStatus", "consumeOnActivityDestroyedListener"));

        // =======
        // = APP =
        // =======

        sIgnoreStaticMap.put("ActivityUtils", Utils.asList(
                "getActivityStacks", "addActivity", "removeActivity", "removeActivity",
                "currentActivity", "finishActivity", "existActivitys", "finishActivity", "finishActivity",
                "finishAllActivityToIgnore", "finishAllActivityToIgnore", "finishAllActivity", "appExit",
                "restartApplication"));
        sIgnoreStaticMap.put("AnalysisRecordUtils.FileInfo", Utils.asList("getStoragePath",
                "getFileName", "getFileFunction", "getFileIntervalTime", "getFolderName", "isHandler",
                "setHandler", "getLogPath", "getIntervalTimeFolder"));
        sIgnoreStaticMap.put("ApkInfoItem", Utils.asList("getAppInfoBean", "getListKeyValues",
                "getAppMD5", "getAppSHA1", "getAppSHA256", "getMinSdkVersion", "getTargetSdkVersion",
                "getApkLength", "getX509Certificate", "getNotBefore", "getNotAfter", "isEffective",
                "getCertPrincipal", "getCertVersion", "getCertSigalgname", "getCertSigalgoid",
                "getCertSerialnumber", "getCertDercode"));
        sIgnoreStaticMap.put("AppInfoBean", Utils.asList("getAppPackName", "getAppName",
                "getAppIcon", "getAppType", "getVersionCode", "getVersionName", "getFirstInstallTime",
                "getLastUpdateTime", "getSourceDir", "getApkSize"));
        sIgnoreStaticMap.put("AppInfoItem", Utils.asList("getAppInfoBean",
                "getListKeyValues", "getAppMD5", "getAppSHA1", "getAppSHA256", "getMinSdkVersion",
                "getTargetSdkVersion", "getApkLength", "getX509Certificate", "getNotBefore",
                "getNotAfter", "isEffective", "getCertPrincipal", "getCertVersion", "getCertSigalgname",
                "getCertSigalgoid", "getCertSerialnumber", "getCertDercode"));
        sIgnoreStaticMap.put("AsyncExecutor", Utils.asList("shutdownNow", "execute",
                "postResult", "postCancel", "execute"));
        sIgnoreStaticMap.put("AutoFocusAssist", Utils.asList("isAutoFocus", "setAutoFocus",
                "onAutoFocus", "autoFocusAgainLater", "start", "stop", "cancelOutstandingTask"));
        sIgnoreStaticMap.put("AutoFocusAssist.AutoFocusTask", Utils.asList("doInBackground"));
        sIgnoreStaticMap.put("BeepVibrateAssist", Utils.asList("shouldBeep", "streamUpdate",
                "isPlayBeep", "isVibrate", "setVibrate", "setVibrate", "setMediaPlayer",
                "playBeepSoundAndVibrate", "close"));
        sIgnoreStaticMap.put("CameraAssist", Utils.asList("openDriver", "closeDriver",
                "startPreview", "stopPreview", "freeCameraResource", "getCameraResolution",
                "getPreviewSize", "getCameraSizeAssist", "getCamera", "setCamera", "setPreviewNotify",
                "setAutoFocus", "isPreviewing", "setAutoInterval", "setFlashlightOn", "setFlashlightOff",
                "isFlashlightOn"));
        sIgnoreStaticMap.put("CameraSizeAssist", Utils.asList("getCamera", "setPreviewSize",
                "setPreviewSize", "getPreviewSize", "getPreviewSize", "getPreviewSize",
                "getPreviewSize", "setPictureSize", "setPictureSize", "getPictureSize",
                "getPictureSize", "getPictureSize", "getPictureSize", "getPictureSize",
                "getPictureSize", "getVideoSize", "getVideoSize", "getVideoSize", "getVideoSize",
                "getVideoSize", "getVideoSize", "calcPreviewSize", "calcPictureSize", "calcVideoSize"));
        sIgnoreStaticMap.put("ClickUtils.ClickAssist", Utils.asList("isFastDoubleClick",
                "isFastDoubleClick", "isFastDoubleClick", "isFastDoubleClick", "isFastDoubleClick",
                "initConfig", "putConfig", "removeConfig", "getConfigTime", "removeRecord",
                "clearRecord", "setIntervalTime", "reset"));
        sIgnoreStaticMap.put("DefaultToastStyle", Utils.asList("getGravity", "getXOffset",
                "getYOffset", "getHorizontalMargin", "getVerticalMargin", "getZ", "getCornerRadius",
                "getBackgroundTintColor", "getBackground", "getTextColor", "getTextSize", "getMaxLines",
                "getEllipsize", "getTypeface", "getPadding"));
        sIgnoreStaticMap.put("DevCache", Utils.asList("put", "put", "getAsString", "put",
                "put", "getAsJSONObject", "put", "put", "getAsJSONArray", "put", "getAsBinary",
                "getAsObject", "put", "put", "getAsBitmap", "put", "put", "getAsDrawable", "file",
                "remove", "clear"));
        sIgnoreStaticMap.put("DevCache.xFileOutputStream", Utils.asList("close"));
        sIgnoreStaticMap.put("DevCacheManager", Utils.asList("calculateCacheSizeAndCacheCount",
                "put", "get", "newFile", "remove", "clear", "removeNext", "calculateSize"));
        sIgnoreStaticMap.put("DevMediaManager", Utils.asList("createMedia", "destroyMedia",
                "bindListener", "setAudioStreamType", "playPrepareRaw", "playPrepareRaw",
                "playPrepareAssets", "playPrepareAssets", "playPrepare", "playPrepare",
                "playPrepare", "isPlaying", "pause", "stop", "onError", "onVideoSizeChanged",
                "onPrepared", "onCompletion", "onBufferingUpdate", "onSeekComplete", "setMeidaListener",
                "isNullMediaPlayer", "isNotNullMediaPlayer", "getMediaPlayer", "setMediaPlayer",
                "setTAG", "getVolume", "setVolume", "clearMediaPlayerData", "getPlayRawId", "getPlayUri",
                "getVideoWidth", "getVideoHeight", "getCurrentPosition", "getDuration", "getPlayPercent"));
        sIgnoreStaticMap.put("DevVideoPlayerControl", Utils.asList("resetOperate",
                "surfaceChanged", "surfaceCreated", "surfaceDestroyed", "onPrepared", "onCompletion",
                "onBufferingUpdate", "onSeekComplete", "onError", "onVideoSizeChanged",
                "setMediaListener", "pausePlayer", "stopPlayer", "startPlayer", "startPlayer",
                "startPlayer", "getSurfaceview", "isPlaying", "isPlaying", "isAutoPlay",
                "setAutoPlay", "getPlayUri", "getVideoWidth", "getVideoHeight", "getCurrentPosition",
                "getDuration", "getPlayPercent"));
        sIgnoreStaticMap.put("FlashlightUtils", Utils.asList("register", "unregister",
                "setFlashlightOn", "setFlashlightOff", "isFlashlightOn", "isFlashlightEnable",
                "setFlashlightOn", "setFlashlightOff", "isFlashlightOn"));
        sIgnoreStaticMap.put("IToastImpl", Utils.asList("reset", "setIsHandler",
                "setNullText", "setTextLength", "init", "style", "defaultStyle",
                "getToastStyle", "initStyle", "initToastFilter", "setView", "show",
                "show", "show", "show", "cancel", "filter", "handlerContent", "getThreadToastStyle",
                "createView", "priShowToastText", "newToastText", "priShowToastView", "newToastView"));
        sIgnoreStaticMap.put("InactivityTimerAssist", Utils.asList("onPause",
                "onResume", "onDestroy", "start", "cancel"));
        sIgnoreStaticMap.put("InactivityTimerAssist.InactivityAsyncTask", Utils.asList("doInBackground"));
        sIgnoreStaticMap.put("InactivityTimerAssist.PowerStatusReceiver", Utils.asList("onReceive"));
        sIgnoreStaticMap.put("KeyValueBean", Utils.asList("getKey", "getValue", "toString"));
        sIgnoreStaticMap.put("KeyguardUtils", Utils.asList("isKeyguardLocked",
                "isKeyguardSecure", "inKeyguardRestrictedInputMode", "getKeyguardManager",
                "setKeyguardManager", "disableKeyguard", "reenableKeyguard", "release",
                "getKeyguardLock", "setKeyguardLock"));
        sIgnoreStaticMap.put("LocationUtils.CustomLocationListener", Utils.asList(
                "onLocationChanged", "onStatusChanged", "onProviderEnabled", "onProviderDisabled"));
        sIgnoreStaticMap.put("LoggerPrinter", Utils.asList(
                "other", "getLogConfig", "init", "init", "d", "e", "e", "e", "w", "i", "v", "wtf", "json",
                "xml", "dTag", "eTag", "eTag", "eTag", "wTag", "iTag", "vTag", "wtfTag", "jsonTag", "xmlTag",
                "isPrintLog", "checkLogLevel", "finalLogPrinter", "logHandle", "logHandle", "logHandle",
                "logHeaderContent", "logTopBorder", "logBottomBorder", "logDivider", "logContent",
                "createMessage", "getSimpleClassName", "getStackOffset", "getThreadLogConfig"));
        sIgnoreStaticMap.put("NotificationUtils.VibratePattern", Utils.asList("isEmpty"));
        sIgnoreStaticMap.put("OSUtils.ROM", Utils.asList("getVersion", "setVersion",
                "getBaseVersion", "setBaseVersion"));
        sIgnoreStaticMap.put("PermissionUtils", Utils.asList("callBack",
                "setRequestPermissionsResult", "request", "request", "onRequestPermissionsResultCommon",
                "checkPermissions", "requestCallback", "getPermissionsStatus"));
        sIgnoreStaticMap.put("PermissionUtils.PermissionActivity", Utils.asList("onCreate",
                "onRequestPermissionsResult"));
        sIgnoreStaticMap.put("PhoneUtils.TeleInfo", Utils.asList("printInfo"));
        sIgnoreStaticMap.put("PowerManagerUtils", Utils.asList("isScreenOn", "turnScreenOn",
                "turnScreenOff", "getWakeLock", "setWakeLock", "getPowerManager", "setPowerManager"));
        sIgnoreStaticMap.put("PreferenceImpl", Utils.asList("put", "getValue", "put", "putAll",
                "putAll", "putAll", "get", "getAll", "getAll", "remove", "removeAll", "removeAll",
                "contains", "clear", "getInt", "getFloat", "getLong", "getBoolean", "getString", "getSet"));
        sIgnoreStaticMap.put("PreferenceImpl.ComparatorImpl", Utils.asList("compare"));
        sIgnoreStaticMap.put("ScreenSensorAssist", Utils.asList("init", "start",
                "stop", "isPortrait", "isAllowChange"));
        sIgnoreStaticMap.put("ScreenSensorAssist.OrientationSensorChangeListener", Utils.asList(
                "onAccuracyChanged", "onSensorChanged"));
        sIgnoreStaticMap.put("ScreenSensorAssist.OrientationSensorListener", Utils.asList(
                "onAccuracyChanged", "onSensorChanged"));
        sIgnoreStaticMap.put("ShapeUtils", Utils.asList("getDrawable", "setDrawable"));
        sIgnoreStaticMap.put("ShapeUtils.Builder", Utils.asList("build", "setRadius",
                "setRadiusLeft", "setRadiusLeft", "setRadiusRight", "setRadiusRight",
                "setCornerRadii", "setColor", "setColor", "setStroke", "setStroke", "setStroke",
                "setSize", "setPadding", "getOrientation"));
        sIgnoreStaticMap.put("ShellUtils.CommandResult", Utils.asList("isSuccess",
                "isSuccess2", "isSuccess3", "isSuccess4"));
        sIgnoreStaticMap.put("SnackbarUtils", Utils.asList("getStyle", "setStyle",
                "getSnackbar", "getSnackbarView", "getTextView", "getActionButton", "addView",
                "addView", "setCallback", "setAction", "setAction", "setAction", "setAction",
                "dismiss", "dismiss", "showShort", "showLong", "showIndefinite", "showShort",
                "showLong", "showIndefinite", "priShow", "setSnackbarStyle", "setSnackbarStyle",
                "getShadowMargin", "setShadowMargin", "isAutoCalc", "setAutoCalc", "clearLocations",
                "above", "bellow", "setSnackbarLocation", "getScreenHeight", "measureView",
                "getMeasuredHeight", "getFormatString", "getFormatRes", "setBackground"));
        sIgnoreStaticMap.put("SnackbarUtils.StyleBuilder", Utils.asList("getRootGravity",
                "setRootGravity", "getRootCornerRadius", "setRootCornerRadius", "getRootBackgroundTintColor",
                "setRootBackgroundTintColor", "getRootBackground", "setRootBackground",
                "getRootMargin", "setRootMargin", "getRootAlpha", "setRootAlpha", "getTextGravity",
                "setTextGravity", "getTextColor", "setTextColor", "getTextSize", "setTextSize",
                "getTextMaxLines", "setTextMaxLines", "getTextEllipsize", "setTextEllipsize",
                "getTextTypeface", "setTextTypeface", "getTextPadding", "setTextPadding",
                "getActionGravity", "setActionGravity", "getActionColor", "setActionColor",
                "getActionSize", "setActionSize", "getActionPadding", "setActionPadding",
                "getActionCornerRadius", "setActionCornerRadius", "getActionBackgroundTintColor",
                "setActionBackgroundTintColor", "getActionBackground", "setActionBackground"));
        sIgnoreStaticMap.put("SpannableStringUtils", Utils.asList("setFlag", "setForegroundColor",
                "setBackgroundColor", "setLineHeight", "setLineHeight", "setQuoteColor", "setQuoteColor",
                "setLeadingMargin", "setBullet", "setBullet", "setFontSize", "setFontSize", "setFontProportion",
                "setFontXProportion", "setStrikethrough", "setUnderline", "setSuperscript", "setSubscript",
                "setBold", "setItalic", "setBoldItalic", "setFontFamily", "setTypeface", "setHorizontalAlign",
                "setVerticalAlign", "setClickSpan", "setUrl", "setBlur", "setShader", "setShadow", "setSpans",
                "append", "appendLine", "appendLine", "appendImage", "appendImage", "appendImage", "appendImage",
                "appendImage", "appendImage", "appendSpace", "appendSpace", "get", "create", "apply", "applyLast",
                "updateCharCharSequence", "updateImage", "updateSpace", "setDefault"));
        sIgnoreStaticMap.put("SpannableStringUtils.CustomBulletSpan", Utils.asList(
                "getLeadingMargin", "drawLeadingMargin"));
        sIgnoreStaticMap.put("SpannableStringUtils.CustomImageSpan", Utils.asList("getDrawable"));
        sIgnoreStaticMap.put("SpannableStringUtils.CustomLineHeightSpan", Utils.asList("chooseHeight"));
        sIgnoreStaticMap.put("SpannableStringUtils.CustomQuoteSpan", Utils.asList(
                "getLeadingMargin", "drawLeadingMargin"));
        sIgnoreStaticMap.put("SpannableStringUtils.CustomTypefaceSpan", Utils.asList(
                "updateDrawState", "updateMeasureState", "apply"));
        sIgnoreStaticMap.put("SpannableStringUtils.ShaderSpan", Utils.asList("updateDrawState"));
        sIgnoreStaticMap.put("SpannableStringUtils.ShadowSpan", Utils.asList("updateDrawState"));
        sIgnoreStaticMap.put("SpannableStringUtils.SpaceSpan", Utils.asList("getSize", "draw"));
        sIgnoreStaticMap.put("SpannableStringUtils.VerticalAlignSpan", Utils.asList("getSize", "draw"));
        sIgnoreStaticMap.put("TimerManager.TimerTask", Utils.asList("start", "close",
                "startTimer", "closeTimer", "isRunTimer", "getTriggerNumber", "getTriggerLimit",
                "isTriggerEnd", "isInfinite", "setHandler", "setNotifyWhat", "setNotifyObject",
                "setTime", "setTriggerLimit"));
        sIgnoreStaticMap.put("ToastFactory.BaseToast", Utils.asList("setView", "setText",
                "findTextView", "isEmptyMessageView", "getMessageView"));
        sIgnoreStaticMap.put("ToastFactory.NotificationToast", Utils.asList("show", "cancel"));
        sIgnoreStaticMap.put("ToastFactory.SafeToast.SafeHandler", Utils.asList(
                "handleMessage", "dispatchMessage"));
        sIgnoreStaticMap.put("ToastFactory.ToastHelper", Utils.asList(
                "handleMessage", "show", "cancel"));
        sIgnoreStaticMap.put("ToastTintUtils.DefaultStyle", Utils.asList(
                "getTextColor", "getTextSize", "getBackgroundTintColor", "getBackground",
                "getMaxLines", "getEllipsize", "getTypeface", "getTintIconColor", "isTintIcon"));
        sIgnoreStaticMap.put("ToastTintUtils.ErrorStyle", Utils.asList(
                "getBackgroundTintColor", "isTintIcon"));
        sIgnoreStaticMap.put("ToastTintUtils.InfoStyle", Utils.asList(
                "getBackgroundTintColor", "isTintIcon"));
        sIgnoreStaticMap.put("ToastTintUtils.NormalStyle", Utils.asList(
                "getBackgroundTintColor", "isTintIcon"));
        sIgnoreStaticMap.put("ToastTintUtils.SafeHandler", Utils.asList(
                "handleMessage", "dispatchMessage"));
        sIgnoreStaticMap.put("ToastTintUtils.SuccessStyle", Utils.asList(
                "getBackgroundTintColor", "isTintIcon"));
        sIgnoreStaticMap.put("ToastTintUtils.WarningStyle", Utils.asList(
                "getBackgroundTintColor", "isTintIcon"));
        sIgnoreStaticMap.put("ToastUtils.SafeHandler", Utils.asList(
                "handleMessage", "dispatchMessage"));
        sIgnoreStaticMap.put("WifiHotUtils", Utils.asList("stratWifiAp", "closeWifiAp",
                "getWifiApState", "getWifiApConfiguration", "setWifiApConfiguration",
                "isOpenWifiAp", "closeWifiApCheck", "isConnectHot", "getHotspotServiceIp",
                "getHotspotAllotIp", "getConnectHotspotMsg", "getHotspotSplitIpMask",
                "intToString", "getApWifiSSID", "getApWifiPwd", "setOnWifiAPListener"));
        sIgnoreStaticMap.put("WifiUtils", Utils.asList("getWifiManager", "isOpenWifi",
                "openWifi", "closeWifi", "toggleWifiEnabled", "getWifiState", "startScan",
                "getConfiguration", "getWifiList", "getWifiInfo", "isExists", "isExists",
                "quickConnWifi", "quickConnWifi", "removeWifiConfig", "disconnectWifi",
                "setStaticWifiConfig", "setStaticWifiConfig", "inetAddressToInt", "setDNS",
                "setGateway", "setIpAddress", "setStaticIpConfig", "getField", "getDeclaredField",
                "setEnumField", "setValueField"));
        sIgnoreStaticMap.put("WifiVo", Utils.asList("describeContents", "writeToParcel"));

        // ==========
        // = Common =
        // ==========

        sIgnoreStaticMap.put("AliasMethod", Utils.asList("next"));
        sIgnoreStaticMap.put("Averager", Utils.asList("add", "clear", "size", "getAverage", "print"));
        sIgnoreStaticMap.put("Base64.Decoder", Utils.asList("maxOutputSize", "process"));
        sIgnoreStaticMap.put("Base64.Encoder", Utils.asList("maxOutputSize", "process"));
        sIgnoreStaticMap.put("Base64Cipher", Utils.asList("decrypt", "encrypt"));
        sIgnoreStaticMap.put("DevThreadPool", Utils.asList("getThreads",
                "getCalcThreads", "execute", "execute", "execute", "shutdown", "shutdownNow",
                "isShutdown", "isTerminated", "awaitTermination", "submit", "submit", "submit",
                "invokeAll", "invokeAll", "invokeAny", "invokeAny", "schedule", "schedule",
                "scheduleWithFixedRate", "scheduleWithFixedDelay"));
        sIgnoreStaticMap.put("FileBreadthFirstSearchUtils", Utils.asList("setSearchHandler",
                "getQueueSameTimeNumber", "setQueueSameTimeNumber", "isRunning", "stop",
                "isStop", "getStartTime", "getEndTime", "getDelayTime", "setDelayTime",
                "query", "queryFile", "whileQueue"));
        sIgnoreStaticMap.put("FileBreadthFirstSearchUtils.FileItem", Utils.asList("put"));
        sIgnoreStaticMap.put("FileDepthFirstSearchUtils", Utils.asList("setSearchHandler",
                "isRunning", "stop", "isStop", "getStartTime", "getEndTime", "query", "queryFile"));
        sIgnoreStaticMap.put("ReflectUtils", Utils.asList("newInstance", "newInstance",
                "getArgsType", "sortConstructors", "newInstance", "field", "field", "getField",
                "getAccessibleField", "unwrap", "setEnumVal", "method", "method", "method",
                "exactMethod", "similarMethod", "sortMethods", "isSimilarSignature", "match",
                "accessible", "proxy", "property", "type", "wrapper", "get", "hashCode", "equals", "toString"));
        sIgnoreStaticMap.put("TimeAverager", Utils.asList("start", "end",
                "endAndRestart", "average", "print", "clear"));
        sIgnoreStaticMap.put("TimeCounter", Utils.asList("start",
                "durationRestart", "duration", "getStartTime"));
        sIgnoreStaticMap.put("TimeKeeper", Utils.asList("waitForEndAsyn", "waitForEnd"));
    }

    /**
     * 初始化 忽略指定方法 @param 处理
     */
    private static void initIgnoreParamMap() {

        // ====================
        // = 根目录三个工具类 =
        // ====================

        sIgnoreParamMap.put("DevUtils.AbstractActivityLifecycle", Utils.asList(
                "onActivityCreated", "onActivityStarted", "onActivityResumed",
                "onActivityPaused", "onActivityStopped", "onActivitySaveInstanceState",
                "onActivityDestroyed"));
        sIgnoreParamMap.put("DevUtils.ActivityLifecycleImpl", Utils.asList(
                "onActivityCreated", "onActivityStarted", "onActivityResumed",
                "onActivityPaused", "onActivityStopped", "onActivitySaveInstanceState",
                "onActivityDestroyed"));
        sIgnoreParamMap.put("JCLogUtils", Utils.asList("d", "e", "e", "e", "i",
                "xml", "dTag", "eTag", "eTag", "eTag", "iTag", "xmlTag"));
        sIgnoreParamMap.put("LogPrintUtils", Utils.asList("d", "e", "e", "e",
                "w", "i", "v", "wtf", "json", "xml", "dTag", "eTag", "eTag", "eTag", "wTag",
                "iTag", "vTag", "wtfTag", "jsonTag", "xmlTag"));

        // =======
        // = APP =
        // =======

        sIgnoreParamMap.put("AutoFocusAssist.AutoFocusTask", Utils.asList("doInBackground"));
        sIgnoreParamMap.put("InactivityTimerAssist.InactivityAsyncTask", Utils.asList(
                "doInBackground"));
        sIgnoreParamMap.put("InactivityTimerAssist.PowerStatusReceiver", Utils.asList("onReceive"));
        sIgnoreParamMap.put("PreferenceImpl.ComparatorImpl", Utils.asList("compare"));
        sIgnoreParamMap.put("ScreenSensorAssist.OrientationSensorChangeListener", Utils.asList(
                "onAccuracyChanged", "onSensorChanged"));
        sIgnoreParamMap.put("ScreenSensorAssist.OrientationSensorListener", Utils.asList(
                "onAccuracyChanged", "onSensorChanged"));
        sIgnoreParamMap.put("ToastFactory.BaseToast", Utils.asList("setView", "setText"));
        sIgnoreParamMap.put("ToastFactory.SafeToast.SafeHandler", Utils.asList(
                "handleMessage", "dispatchMessage"));
        sIgnoreParamMap.put("ToastFactory.ToastHelper", Utils.asList("handleMessage"));
        sIgnoreParamMap.put("ToastTintUtils.SafeHandler", Utils.asList(
                "handleMessage", "dispatchMessage"));
        sIgnoreParamMap.put("ToastUtils.SafeHandler", Utils.asList(
                "handleMessage", "dispatchMessage"));
        sIgnoreParamMap.put("SpannableStringUtils.CustomBulletSpan", Utils.asList(
                "getLeadingMargin", "drawLeadingMargin"));
        sIgnoreParamMap.put("SpannableStringUtils.CustomDynamicDrawableSpan", Utils.asList("getSize", "draw"));
        sIgnoreParamMap.put("SpannableStringUtils.CustomLineHeightSpan", Utils.asList("chooseHeight"));
        sIgnoreParamMap.put("SpannableStringUtils.CustomQuoteSpan", Utils.asList(
                "getLeadingMargin", "drawLeadingMargin"));
        sIgnoreParamMap.put("SpannableStringUtils.CustomTypefaceSpan", Utils.asList(
                "updateDrawState", "updateMeasureState", "apply"));
        sIgnoreParamMap.put("SpannableStringUtils.ShaderSpan", Utils.asList("updateDrawState"));
        sIgnoreParamMap.put("SpannableStringUtils.ShadowSpan", Utils.asList("updateDrawState"));
        sIgnoreParamMap.put("SpannableStringUtils.SpaceSpan", Utils.asList("getSize", "draw"));
        sIgnoreParamMap.put("SpannableStringUtils.VerticalAlignSpan", Utils.asList("getSize", "draw"));
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

        sIgnoreReturnMap.put("Base64", Utils.asList("decode", "decode", "decode",
                "encodeToString", "encodeToString", "encode", "encode"));

    }

    /**
     * 初始化 忽略指定方法非 public 处理
     */
    private static void initIgnoreUnPublicMap() {

        // ====================
        // = 根目录三个工具类 =
        // ====================

        sIgnoreUnPublicMap.put("DevUtils", Utils.asList("initContext",
                "initApplication", "getApplicationByReflect", "registerActivityLifecycleCallbacks",
                "unregisterActivityLifecycleCallbacks"));
        sIgnoreUnPublicMap.put("DevUtils.ActivityLifecycleFilter", Utils.asList("filter"));
        sIgnoreUnPublicMap.put("DevUtils.ActivityLifecycleGet", Utils.asList(
                "getTopActivity", "isTopActivity", "isTopActivity", "isBackground", "getActivityCount"));
        sIgnoreUnPublicMap.put("DevUtils.ActivityLifecycleImpl", Utils.asList(
                "setTopActivity", "getTopActivityByReflect", "postStatus", "consumeOnActivityDestroyedListener"));
        sIgnoreUnPublicMap.put("DevUtils.ActivityLifecycleNotify", Utils.asList(
                "addOnAppStatusChangedListener", "removeOnAppStatusChangedListener",
                "removeAllOnAppStatusChangedListener", "addOnActivityDestroyedListener",
                "removeOnActivityDestroyedListener", "removeAllOnActivityDestroyedListener"));
        sIgnoreUnPublicMap.put("DevUtils.OnActivityDestroyedListener", Utils.asList(
                "onActivityDestroyed"));
        sIgnoreUnPublicMap.put("DevUtils.OnAppStatusChangedListener", Utils.asList(
                "onForeground", "onBackground"));
        sIgnoreUnPublicMap.put("JCLogUtils", Utils.asList("isEmpty",
                "printLog", "createMessage", "splitErrorMessage"));
        sIgnoreUnPublicMap.put("JCLogUtils.Print", Utils.asList("printLog"));
        sIgnoreUnPublicMap.put("LogPrintUtils", Utils.asList("isEmpty",
                "printLog", "createMessage", "splitErrorMessage"));

        // =======
        // = APP =
        // =======

        sIgnoreUnPublicMap.put("ADBUtils", Utils.asList(
                "isFileExists", "getFileByPath", "isSpace"));
        sIgnoreUnPublicMap.put("AnalysisRecordUtils", Utils.asList(
                "saveLogRecord", "splitLog", "handlerDeviceInfo", "isSDCardEnable",
                "getDiskCacheDir", "appendFile", "saveFile", "getAbsolutePath", "getFile",
                "getFileByPath", "getFilePathCreateFolder", "createFolder", "createFolder",
                "getThrowableStackTrace", "getDateNow", "getDeviceInfo", "handlerDeviceInfo",
                "getAppVersion"));
        sIgnoreUnPublicMap.put("ApkInfoItem", Utils.asList("obtain"));
        sIgnoreUnPublicMap.put("AppInfoBean", Utils.asList("obtain"));
        sIgnoreUnPublicMap.put("AppInfoItem", Utils.asList("obtain"));
        sIgnoreUnPublicMap.put("AppInfoUtils", Utils.asList("isFileExists"));
        sIgnoreUnPublicMap.put("AppUtils", Utils.asList("getAppSignatureHash",
                "isFileExists", "getFileByPath", "isEmpty", "isSpace", "colonSplit", "isDeviceRooted",
                "toHexString", "hashTemplate", "getUriForFile"));
        sIgnoreUnPublicMap.put("AsyncExecutor", Utils.asList("postResult", "postCancel"));
        sIgnoreUnPublicMap.put("AsyncExecutor.Worker", Utils.asList(
                "doInBackground", "onPostExecute", "onCanceled", "abort"));
        sIgnoreUnPublicMap.put("AutoFocusAssist", Utils.asList(
                "autoFocusAgainLater", "cancelOutstandingTask"));
        sIgnoreUnPublicMap.put("AutoFocusAssist.AutoFocusTask", Utils.asList("doInBackground"));
        sIgnoreUnPublicMap.put("BarUtils", Utils.asList(
                "addMarginTopEqualStatusBarHeight", "subtractMarginTopEqualStatusBarHeight",
                "addStatusBarColor", "addStatusBarAlpha", "hideColorView", "hideAlphaView", "hideColorView",
                "hideAlphaView", "showColorView", "showAlphaView", "getStatusBarColor", "createColorStatusBarView",
                "createAlphaStatusBarView", "transparentStatusBar", "invokePanels"));
        sIgnoreUnPublicMap.put("BeepVibrateAssist", Utils.asList("shouldBeep", "streamUpdate"));
        sIgnoreUnPublicMap.put("BitmapUtils", Utils.asList("addBorder", "getFileByPath",
                "getAbsolutePath", "isFileExists", "isFileExists", "getResources"));
        sIgnoreUnPublicMap.put("CameraAssist", Utils.asList("freeCameraResource"));
        sIgnoreUnPublicMap.put("CameraAssist.PreviewNotify", Utils.asList(
                "stopPreviewNotify", "startPreviewNotify"));
        sIgnoreUnPublicMap.put("CameraSizeAssist", Utils.asList(
                "calcPreviewSize", "calcPictureSize", "calcVideoSize"));
        sIgnoreUnPublicMap.put("CleanUtils", Utils.asList(
                "deleteFilesInDir", "deleteDir", "getFileByPath", "isSDCardEnable"));
        sIgnoreUnPublicMap.put("DBUtils", Utils.asList("isSDCardEnable"));
        sIgnoreUnPublicMap.put("DevCache", Utils.asList("getContext", "myPid"));
        sIgnoreUnPublicMap.put("DevCacheManager", Utils.asList(
                "calculateCacheSizeAndCacheCount", "put", "get", "newFile", "remove",
                "clear", "removeNext", "calculateSize"));
        sIgnoreUnPublicMap.put("DevCacheUtils", Utils.asList("createDateInfo",
                "hasDateInfo", "getDateInfoFromDate", "indexOf", "copyOfRange", "arraycopy"));
        sIgnoreUnPublicMap.put("DevMediaManager", Utils.asList("createMedia",
                "destroyMedia", "bindListener", "clearMediaPlayerData"));
        sIgnoreUnPublicMap.put("DevMediaManager.MediaListener", Utils.asList(
                "onPrepared", "onCompletion", "onBufferingUpdate", "onSeekComplete",
                "onError", "onVideoSizeChanged"));
        sIgnoreUnPublicMap.put("DevVideoPlayerControl", Utils.asList("resetOperate"));
        sIgnoreUnPublicMap.put("DeviceUtils", Utils.asList("getMacAddressByWifiInfo",
                "getMacAddressByNetworkInterface", "getMacAddressByInetAddress",
                "getInetAddress", "getMacAddressByFile"));
        sIgnoreUnPublicMap.put("DialogUtils", Utils.asList("isEmpty"));
        sIgnoreUnPublicMap.put("FileRecordUtils", Utils.asList("handlerDeviceInfo",
                "saveFile", "getFileByPath", "createFolder", "createFolder",
                "getThrowableStackTrace", "getDateNow", "getDeviceInfo",
                "handlerDeviceInfo", "getAppVersion"));
        sIgnoreUnPublicMap.put("HandlerUtils.OnEndListener", Utils.asList("onEnd"));
        sIgnoreUnPublicMap.put("HtmlUtils", Utils.asList("isEmpty", "replaceStr"));
        sIgnoreUnPublicMap.put("IPreference", Utils.asList("put",
                "putAll", "putAll", "putAll", "get", "getAll", "getAll", "remove",
                "removeAll", "removeAll", "contains", "clear", "getInt", "getFloat",
                "getLong", "getBoolean", "getString", "getSet"));
        sIgnoreUnPublicMap.put("IPrinter", Utils.asList("other",
                "getLogConfig", "init", "init", "d", "e", "e", "e", "w", "i", "v",
                "wtf", "json", "xml", "dTag", "eTag", "eTag", "eTag", "wTag", "iTag",
                "vTag", "wtfTag", "jsonTag", "xmlTag"));
        sIgnoreUnPublicMap.put("IToast.Filter", Utils.asList("filter", "handlerContent"));
        sIgnoreUnPublicMap.put("IToast.Operate", Utils.asList("reset",
                "setIsHandler", "setNullText", "setTextLength", "init", "style",
                "defaultStyle", "getToastStyle", "initStyle", "initToastFilter",
                "setView", "show", "show", "show", "show", "cancel"));
        sIgnoreUnPublicMap.put("IToast.Style", Utils.asList("getGravity",
                "getXOffset", "getYOffset", "getHorizontalMargin", "getVerticalMargin",
                "getZ", "getCornerRadius", "getBackgroundTintColor", "getBackground",
                "getTextColor", "getTextSize", "getMaxLines", "getEllipsize",
                "getTypeface", "getPadding"));
        sIgnoreUnPublicMap.put("IToastImpl", Utils.asList("getThreadToastStyle",
                "createView", "priShowToastText", "newToastText", "priShowToastView", "newToastView"));
        sIgnoreUnPublicMap.put("ImageConvertUtils.BMP", Utils.asList("addBMPImageHeader",
                "addBMPImageInfosHeader", "addBMP_ARGB_8888"));
        sIgnoreUnPublicMap.put("ImageUtils", Utils.asList("getFileByPath",
                "getAbsolutePath", "createFileByDeleteOldFile", "createOrExistsDir",
                "closeIOQuietly", "getResources", "calculateInSampleSize"));
        sIgnoreUnPublicMap.put("ImageViewUtils", Utils.asList("getImageViewFieldValue",
                "setColorFilter", "setColorFilter", "setColorFilter"));
        sIgnoreUnPublicMap.put("InactivityTimerAssist", Utils.asList("start", "cancel"));
        sIgnoreUnPublicMap.put("InactivityTimerAssist.InactivityAsyncTask", Utils.asList(
                "doInBackground"));
        sIgnoreUnPublicMap.put("IntentUtils", Utils.asList("getFileByPath", "getUriForFile"));
        sIgnoreUnPublicMap.put("KeyBoardUtils", Utils.asList("getContentViewInvisibleHeight"));
        sIgnoreUnPublicMap.put("KeyBoardUtils.OnSoftInputChangedListener", Utils.asList(
                "onSoftInputChanged"));
        sIgnoreUnPublicMap.put("ListenerUtils", Utils.asList("findViewById", "findViewById"));
        sIgnoreUnPublicMap.put("LocationUtils", Utils.asList("getCriteria"));
        sIgnoreUnPublicMap.put("LocationUtils.OnLocationChangeListener", Utils.asList(
                "getLastKnownLocation", "onLocationChanged", "onStatusChanged"));
        sIgnoreUnPublicMap.put("LoggerPrinter", Utils.asList("isPrintLog",
                "checkLogLevel", "finalLogPrinter", "logHandle", "logHandle", "logHandle",
                "logHeaderContent", "logTopBorder", "logBottomBorder", "logDivider",
                "logContent", "createMessage", "getSimpleClassName", "getStackOffset",
                "getThreadLogConfig"));
        sIgnoreUnPublicMap.put("ManifestUtils", Utils.asList("isSpace"));
        sIgnoreUnPublicMap.put("OSUtils", Utils.asList("initRomType"));
        sIgnoreUnPublicMap.put("OSUtils.ROM", Utils.asList("setVersion", "setBaseVersion"));
        sIgnoreUnPublicMap.put("PathUtils", Utils.asList("isSDCardEnable", "getAbsolutePath"));
        sIgnoreUnPublicMap.put("PermissionUtils", Utils.asList(
                "onRequestPermissionsResultCommon", "isGranted", "checkPermissions",
                "requestCallback", "getPermissionsStatus"));
        sIgnoreUnPublicMap.put("PermissionUtils.PermissionActivity", Utils.asList(
                "start", "onCreate"));
        sIgnoreUnPublicMap.put("PermissionUtils.PermissionCallBack", Utils.asList(
                "onGranted", "onDenied"));
        sIgnoreUnPublicMap.put("PhoneUtils", Utils.asList("isIntentAvailable"));
        sIgnoreUnPublicMap.put("PreferenceImpl", Utils.asList("put", "getValue"));
        sIgnoreUnPublicMap.put("SDCardUtils", Utils.asList("getFile", "getFileByPath",
                "createFolder", "createFolder"));
        sIgnoreUnPublicMap.put("ScreenSensorAssist", Utils.asList("init"));
        sIgnoreUnPublicMap.put("ShellUtils", Utils.asList("consumeInputStream"));
        sIgnoreUnPublicMap.put("ShortCutUtils", Utils.asList("getAuthority",
                "getAuthorityFromPermission", "getAuthorityFromPermission"));
        sIgnoreUnPublicMap.put("SignaturesUtils", Utils.asList("loadCertificates",
                "toHexString", "toHexString"));
        sIgnoreUnPublicMap.put("SizeUtils.onGetSizeListener", Utils.asList("onGetSize"));
        sIgnoreUnPublicMap.put("SnackbarUtils", Utils.asList("priShow",
                "clearLocations", "setSnackbarLocation", "getScreenHeight", "measureView",
                "getMeasuredHeight", "getFormatString", "getFormatRes", "setBackground"));
        sIgnoreUnPublicMap.put("SpannableStringUtils", Utils.asList("apply", "applyLast",
                "updateCharCharSequence", "updateImage", "updateSpace", "setDefault", "getContext"));
        sIgnoreUnPublicMap.put("SpannableStringUtils.CustomDynamicDrawableSpan", Utils.asList("getCachedDrawable"));
        sIgnoreUnPublicMap.put("SpannableStringUtils.CustomTypefaceSpan", Utils.asList("apply"));
        sIgnoreUnPublicMap.put("TimerManager.TimerTask", Utils.asList("start", "close"));
        sIgnoreUnPublicMap.put("ToastFactory.BaseToast", Utils.asList("findTextView"));
        sIgnoreUnPublicMap.put("ToastFactory.ToastHelper", Utils.asList("show", "cancel"));
        sIgnoreUnPublicMap.put("ToastTintUtils", Utils.asList("showToastView",
                "newToastView", "inflaterView", "setBackground", "getDrawable", "tintIcon",
                "tint9PatchDrawableFrame", "reflectToastHandler"));
        sIgnoreUnPublicMap.put("ToastTintUtils.Filter", Utils.asList("filter",
                "handlerContent"));
        sIgnoreUnPublicMap.put("ToastTintUtils.Style", Utils.asList("getTextColor",
                "getTextSize", "getBackgroundTintColor", "getBackground", "getMaxLines",
                "getEllipsize", "getTypeface", "getTintIconColor", "isTintIcon"));
        sIgnoreUnPublicMap.put("ToastUtils", Utils.asList("priShowToastText",
                "handlerToastRes", "handlerToastStr", "reflectToastHandler"));
        sIgnoreUnPublicMap.put("ToastUtils.Filter", Utils.asList("filter", "handlerContent"));
        sIgnoreUnPublicMap.put("UriUtils", Utils.asList("getFilePathByUri",
                "getDataColumn", "isExternalStorageDocument", "isDownloadsDocument", "isMediaDocument"));
        sIgnoreUnPublicMap.put("Utils", Utils.asList("handlerDeviceInfo",
                "saveFile", "getFileByPath", "createFolder", "createFolder", "getThrowableStackTrace",
                "getDateNow", "getDeviceInfo", "handlerDeviceInfo", "getAppVersion"));
        sIgnoreUnPublicMap.put("WifiHotUtils", Utils.asList("intToString"));
        sIgnoreUnPublicMap.put("WifiHotUtils.OnWifiAPListener", Utils.asList("onStarted",
                "onStopped", "onFailed"));
        sIgnoreUnPublicMap.put("WifiUtils", Utils.asList("isHex",
                "setStaticWifiConfig", "setStaticWifiConfig", "inetAddressToInt", "setDNS",
                "setGateway", "setIpAddress", "setStaticIpConfig", "getField", "getDeclaredField",
                "setEnumField", "setValueField"));

        // ==========
        // = Common =
        // ==========

        sIgnoreUnPublicMap.put("CipherUtils", Utils.asList("toHexString",
                "toHexString", "decodeHex", "toDigit", "bytesToObject", "objectToBytes"));
        sIgnoreUnPublicMap.put("CloneUtils", Utils.asList("bytesToObject"));
        sIgnoreUnPublicMap.put("ColorUtils", Utils.asList("priParseColor", "percentF", "clamp"));
        sIgnoreUnPublicMap.put("ConvertUtils", Utils.asList("toDigit",
                "toHexChars", "toHexString", "isEmpty", "length"));
        sIgnoreUnPublicMap.put("CoordinateUtils", Utils.asList("transformLat", "transformLng"));
        sIgnoreUnPublicMap.put("DateUtils", Utils.asList("toInt"));
        sIgnoreUnPublicMap.put("Decrypt", Utils.asList("decrypt"));
        sIgnoreUnPublicMap.put("DevCommonUtils", Utils.asList("getRandom",
                "getRandom", "formatTime", "md5", "md5", "md5Upper", "md5Upper", "toHexString"));
        sIgnoreUnPublicMap.put("EncodeUtils", Utils.asList("toString", "toString", "toBytes"));
        sIgnoreUnPublicMap.put("Encrypt", Utils.asList("encrypt"));
        sIgnoreUnPublicMap.put("EncryptUtils", Utils.asList("hashTemplate",
                "hmacTemplate", "symmetricTemplate", "rsaTemplate", "base64Encode",
                "base64Decode", "toHexString", "toHexString", "decodeHex", "decodeHex",
                "toDigit", "arraycopy", "isEmpty", "isSpace"));
        sIgnoreUnPublicMap.put("FileBreadthFirstSearchUtils", Utils.asList("queryFile", "whileQueue"));
        sIgnoreUnPublicMap.put("FileBreadthFirstSearchUtils.FileItem", Utils.asList("put"));
        sIgnoreUnPublicMap.put("FileBreadthFirstSearchUtils.SearchHandler", Utils.asList(
                "isHandlerFile", "isAddToList", "OnEndListener"));
        sIgnoreUnPublicMap.put("FileDepthFirstSearchUtils", Utils.asList("queryFile"));
        sIgnoreUnPublicMap.put("FileDepthFirstSearchUtils.SearchHandler", Utils.asList(
                "isHandlerFile", "isAddToList", "OnEndListener"));
        sIgnoreUnPublicMap.put("FileIOUtils", Utils.asList("closeIOQuietly",
                "getFileByPath", "createOrExistsFile", "createOrExistsFile", "createOrExistsDir",
                "isFileExists", "isSpace"));
        sIgnoreUnPublicMap.put("FileUtils", Utils.asList("copyFolder", "toHexString",
                "toHexString", "closeIOQuietly", "writeFileFromIS", "isEmpty", "isSpace"));
        sIgnoreUnPublicMap.put("FileUtils.OnReplaceListener", Utils.asList("onReplace"));
        sIgnoreUnPublicMap.put("HttpURLConnectionUtils", Utils.asList("reqNetTime"));
        sIgnoreUnPublicMap.put("HttpURLConnectionUtils.CallBack", Utils.asList("onResponse", "onFail"));
        sIgnoreUnPublicMap.put("HttpURLConnectionUtils.TimeCallBack", Utils.asList("onResponse", "onFail"));
        sIgnoreUnPublicMap.put("IDCardUtils", Utils.asList("converCharToInt",
                "validateDateSmllerThenNow", "isNumber", "isEmpty"));
        sIgnoreUnPublicMap.put("MD5Utils", Utils.asList("toHexString", "toHexString", "isSpace"));
        sIgnoreUnPublicMap.put("NumberUtils", Utils.asList("numberToCHNNumber",
                "thousandConvertCHN", "isEmpty", "match"));
        sIgnoreUnPublicMap.put("ReflectUtils", Utils.asList("forName",
                "forName", "getArgsType", "sortConstructors", "newInstance", "getField",
                "getAccessibleField", "unwrap", "method", "exactMethod", "similarMethod",
                "sortMethods", "isSimilarSignature", "match", "accessible", "property", "wrapper"));
        sIgnoreUnPublicMap.put("SHAUtils", Utils.asList("toHexString", "isSpace"));
        sIgnoreUnPublicMap.put("StreamUtils", Utils.asList("isSpace"));
        sIgnoreUnPublicMap.put("TimeKeeper.OnEndCallback", Utils.asList("onEnd"));
        sIgnoreUnPublicMap.put("ValiToPhoneUtils", Utils.asList("isEmpty", "match"));
        sIgnoreUnPublicMap.put("ValidatorUtils", Utils.asList("isEmpty"));
        sIgnoreUnPublicMap.put("ZipUtils", Utils.asList("zipFile", "unzipChildFile",
                "closeIOQuietly", "getFileByPath", "createOrExistsDir", "createOrExistsFile", "isSpace"));

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
}
