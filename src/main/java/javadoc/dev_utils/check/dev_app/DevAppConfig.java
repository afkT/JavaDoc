package javadoc.dev_utils.check.dev_app;

import javadoc.Utils;
import javadoc.dev_utils.check.dev.ICheckConfig;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * detail: DevAppConfig 代码检测分析配置
 * @author Ttt
 */
final class DevAppConfig implements ICheckConfig {

    /**
     * 获取忽略指定方法注释配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreAnnotateMap() {
        Map<String, List<String>> ignoreAnnotateMap = new HashMap<>();
        ignoreAnnotateMap.put("ActivityUtils.ResultActivity", Utils.asListArgs("onCreate","onActivityResult","onDestroy"));
        ignoreAnnotateMap.put("AutoFocusAssist.AutoFocusTask", Utils.asListArgs("doInBackground"));
        ignoreAnnotateMap.put("Base64.Coder", Utils.asListArgs("maxOutputSize"));
        ignoreAnnotateMap.put("Base64.Decoder", Utils.asListArgs("maxOutputSize"));
        ignoreAnnotateMap.put("Base64.Encoder", Utils.asListArgs("maxOutputSize","process"));
        ignoreAnnotateMap.put("CalendarUtils", Utils.asListArgs("getBitInt","solarToInt","solarFromInt"));
        ignoreAnnotateMap.put("CalendarUtils.Festival", Utils.asListArgs("compareTo","toString"));
        ignoreAnnotateMap.put("ClickUtils.OnCountClickListener", Utils.asListArgs("onClick"));
        ignoreAnnotateMap.put("ClickUtils.OnDebouncingClickListener", Utils.asListArgs("onClick"));
        ignoreAnnotateMap.put("ColorUtils.ColorInfo", Utils.asListArgs("toString"));
        ignoreAnnotateMap.put("ColorUtils.ColorInfo.ColorParser", Utils.asListArgs("handleColor"));
        ignoreAnnotateMap.put("ContentResolverUtils.MediaQueryInfo", Utils.asListArgs("getResult","getProjection","getSelection","getSelectionArgs"));
        ignoreAnnotateMap.put("ContentResolverUtils.MediaQueryInfoUri", Utils.asListArgs("getSelection","getSelectionArgs"));
        ignoreAnnotateMap.put("ContentResolverUtils.MediaQueryUri", Utils.asListArgs("getResult","getProjection","getSelection","getSelectionArgs"));
        ignoreAnnotateMap.put("DevCache.xFileOutputStream", Utils.asListArgs("close"));
        ignoreAnnotateMap.put("InactivityTimerAssist.InactivityAsyncTask", Utils.asListArgs("doInBackground"));
        ignoreAnnotateMap.put("InactivityTimerAssist.PowerStateReceiver", Utils.asListArgs("onReceive"));
        ignoreAnnotateMap.put("JCLogUtils", Utils.asListArgs("d","e","e","e","i","xml","dTag","eTag","eTag","eTag","iTag","xmlTag"));
        ignoreAnnotateMap.put("KeyValueBean", Utils.asListArgs("toString"));
        ignoreAnnotateMap.put("LogPrintUtils", Utils.asListArgs("d","e","e","e","w","i","v","wtf","json","xml","dTag","eTag","eTag","eTag","wTag","iTag","vTag","wtfTag","jsonTag","xmlTag"));
        ignoreAnnotateMap.put("PreferenceImpl.ComparatorImpl", Utils.asListArgs("compare"));
        ignoreAnnotateMap.put("ROMUtils.RomInfo", Utils.asListArgs("toString"));
        ignoreAnnotateMap.put("ScaleUtils.XY", Utils.asListArgs("getXYx","getXY","getXY","compareTo"));
        ignoreAnnotateMap.put("ScreenSensorAssist.OrientationSensorChangeListener", Utils.asListArgs("onAccuracyChanged","onSensorChanged"));
        ignoreAnnotateMap.put("ScreenSensorAssist.OrientationSensorListener", Utils.asListArgs("onAccuracyChanged","onSensorChanged"));
        ignoreAnnotateMap.put("ScreenshotUtils.MediaContentObserver", Utils.asListArgs("onChange"));
        ignoreAnnotateMap.put("SpanUtils.CustomBulletSpan", Utils.asListArgs("getLeadingMargin","drawLeadingMargin"));
        ignoreAnnotateMap.put("SpanUtils.CustomDynamicDrawableSpan", Utils.asListArgs("getDrawable","getSize","draw","getCachedDrawable"));
        ignoreAnnotateMap.put("SpanUtils.CustomImageSpan", Utils.asListArgs("getDrawable"));
        ignoreAnnotateMap.put("SpanUtils.CustomLineHeightSpan", Utils.asListArgs("chooseHeight"));
        ignoreAnnotateMap.put("SpanUtils.CustomQuoteSpan", Utils.asListArgs("getLeadingMargin","drawLeadingMargin"));
        ignoreAnnotateMap.put("SpanUtils.CustomTypefaceSpan", Utils.asListArgs("updateDrawState","updateMeasureState","apply"));
        ignoreAnnotateMap.put("SpanUtils.ShaderSpan", Utils.asListArgs("updateDrawState"));
        ignoreAnnotateMap.put("SpanUtils.ShadowSpan", Utils.asListArgs("updateDrawState"));
        ignoreAnnotateMap.put("SpanUtils.SpaceSpan", Utils.asListArgs("getSize","draw"));
        ignoreAnnotateMap.put("SpanUtils.VerticalAlignSpan", Utils.asListArgs("getSize","draw"));
        ignoreAnnotateMap.put("ToastFactory.BaseToast", Utils.asListArgs("setView","setText"));
        ignoreAnnotateMap.put("ToastFactory.NotificationToast", Utils.asListArgs("show","cancel"));
        ignoreAnnotateMap.put("ToastFactory.SafeToast.SafeHandler", Utils.asListArgs("handleMessage","dispatchMessage"));
        ignoreAnnotateMap.put("ToastFactory.ToastHelper", Utils.asListArgs("handleMessage"));
        ignoreAnnotateMap.put("ToastTintUtils.SafeHandler", Utils.asListArgs("handleMessage","dispatchMessage"));
        ignoreAnnotateMap.put("ToastUtils.SafeHandler", Utils.asListArgs("handleMessage","dispatchMessage"));
        ignoreAnnotateMap.put("TypeUtils.ParameterizedTypeImpl", Utils.asListArgs("getActualTypeArguments","getOwnerType","getRawType","equals","hashCode"));
        ignoreAnnotateMap.put("WifiVo", Utils.asListArgs("describeContents","writeToParcel"));

        return ignoreAnnotateMap;
    }

    /**
     * 获取忽略指定方法参数 final 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreFinalMap() {
        Map<String, List<String>> ignoreFinalMap = new HashMap<>();
        ignoreFinalMap.put("ActivityUtils.ResultActivity", Utils.asListArgs("onCreate","onActivityResult"));
        ignoreFinalMap.put("AutoFocusAssist", Utils.asListArgs("onAutoFocus"));
        ignoreFinalMap.put("AutoFocusAssist.AutoFocusTask", Utils.asListArgs("doInBackground"));
        ignoreFinalMap.put("Base64", Utils.asListArgs("decode","decode","decode","encodeToString","encodeToString","encode","encode"));
        ignoreFinalMap.put("Base64.Decoder", Utils.asListArgs("maxOutputSize","process"));
        ignoreFinalMap.put("Base64.Encoder", Utils.asListArgs("maxOutputSize","process"));
        ignoreFinalMap.put("Base64Cipher", Utils.asListArgs("decrypt","encrypt"));
        ignoreFinalMap.put("BitmapUtils", Utils.asListArgs("combineToCenter","combineToSameSize","combineToSameSize"));
        ignoreFinalMap.put("CalendarUtils", Utils.asListArgs("getBitInt","solarToInt","solarFromInt"));
        ignoreFinalMap.put("CalendarUtils.Festival", Utils.asListArgs("compareTo"));
        ignoreFinalMap.put("CameraSizeAssist", Utils.asListArgs("setPreviewSize","setPictureSize","calcPreviewSize","calcPictureSize","calcVideoSize"));
        ignoreFinalMap.put("CameraUtils", Utils.asListArgs("initCamera","open"));
        ignoreFinalMap.put("ColorUtils.ColorInfo", Utils.asListArgs("RGBtoHSB"));
        ignoreFinalMap.put("ColorUtils.ColorInfo.ColorParser", Utils.asListArgs("handleColor"));
        ignoreFinalMap.put("ContentResolverUtils.MediaQueryInfo", Utils.asListArgs("getResult","getProjection","getSelection","getSelectionArgs"));
        ignoreFinalMap.put("ContentResolverUtils.MediaQueryInfoUri", Utils.asListArgs("getSelection","getSelectionArgs"));
        ignoreFinalMap.put("ContentResolverUtils.MediaQueryUri", Utils.asListArgs("getResult","getProjection","getSelection","getSelectionArgs"));
        ignoreFinalMap.put("CrashUtils", Utils.asListArgs("init","uncaughtException","handleException"));
        ignoreFinalMap.put("DevMediaManager", Utils.asListArgs("onError","onVideoSizeChanged","onPrepared","onCompletion","onBufferingUpdate","onSeekComplete"));
        ignoreFinalMap.put("DevVideoPlayerControl", Utils.asListArgs("surfaceChanged","surfaceCreated","surfaceDestroyed","onBufferingUpdate","onError","onVideoSizeChanged"));
        ignoreFinalMap.put("IToastImpl", Utils.asListArgs("filter","handlerContent"));
        ignoreFinalMap.put("InactivityTimerAssist.InactivityAsyncTask", Utils.asListArgs("doInBackground"));
        ignoreFinalMap.put("InactivityTimerAssist.PowerStateReceiver", Utils.asListArgs("onReceive"));
        ignoreFinalMap.put("LocationUtils.CustomLocationListener", Utils.asListArgs("onLocationChanged","onStatusChanged","onProviderEnabled","onProviderDisabled"));
        ignoreFinalMap.put("LogConfig", Utils.asListArgs("methodCount","methodOffset","outputMethodAll","displayThreadInfo","sortLog","logLevel","tag"));
        ignoreFinalMap.put("LoggerPrinter", Utils.asListArgs("logHeaderContent"));
        ignoreFinalMap.put("NetWorkUtils", Utils.asListArgs("isAvailableByPing"));
        ignoreFinalMap.put("PermissionUtils.PermissionActivity", Utils.asListArgs("onCreate","onRequestPermissionsResult"));
        ignoreFinalMap.put("PreferenceImpl.ComparatorImpl", Utils.asListArgs("compare"));
        ignoreFinalMap.put("ScaleUtils.XY", Utils.asListArgs("getXY","compareTo"));
        ignoreFinalMap.put("ScreenSensorAssist.OrientationSensorChangeListener", Utils.asListArgs("onAccuracyChanged","onSensorChanged"));
        ignoreFinalMap.put("ScreenSensorAssist.OrientationSensorListener", Utils.asListArgs("onAccuracyChanged","onSensorChanged"));
        ignoreFinalMap.put("ScreenshotUtils.MediaContentObserver", Utils.asListArgs("onChange"));
        ignoreFinalMap.put("SnackbarUtils.StyleBuilder", Utils.asListArgs("setRootGravity","setRootCornerRadius","setRootBackgroundTintColor","setRootBackground","setRootMargin","setRootAlpha","setTextGravity","setTextColor","setTextSize","setTextMaxLines","setTextEllipsize","setTextTypeface","setTextPadding","setActionGravity","setActionColor","setActionSize","setActionPadding","setActionCornerRadius","setActionBackgroundTintColor","setActionBackground"));
        ignoreFinalMap.put("SpanUtils.VerticalAlignSpan", Utils.asListArgs("getSize","draw"));
        ignoreFinalMap.put("ToastFactory.BaseToast", Utils.asListArgs("setView","setText"));
        ignoreFinalMap.put("ToastFactory.SafeToast.SafeHandler", Utils.asListArgs("handleMessage","dispatchMessage"));
        ignoreFinalMap.put("ToastFactory.ToastHelper", Utils.asListArgs("handleMessage"));
        ignoreFinalMap.put("ToastTintUtils", Utils.asListArgs("newToastView","inflaterView"));
        ignoreFinalMap.put("ToastTintUtils.SafeHandler", Utils.asListArgs("handleMessage","dispatchMessage"));
        ignoreFinalMap.put("ToastUtils", Utils.asListArgs("newToastText","newToastView","handlerToastRes","handlerToastStr"));
        ignoreFinalMap.put("ToastUtils.SafeHandler", Utils.asListArgs("handleMessage","dispatchMessage"));
        ignoreFinalMap.put("TypeUtils.ParameterizedTypeImpl", Utils.asListArgs("equals"));

        return ignoreFinalMap;
    }

    /**
     * 获取忽略指定方法 static 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreStaticMap() {
        Map<String, List<String>> ignoreStaticMap = new HashMap<>();
        ignoreStaticMap.put("ActivityUtils", Utils.asListArgs("getActivityStacks","addActivity","removeActivity","removeActivity","currentActivity","finishActivity","existActivitys","finishActivity","finishActivity","finishAllActivityToIgnore","finishAllActivityToIgnore","finishAllActivity","exitApplication","restartApplication"));
        ignoreStaticMap.put("ActivityUtils.ResultActivity", Utils.asListArgs("onCreate","onActivityResult","onDestroy"));
        ignoreStaticMap.put("AliasMethod", Utils.asListArgs("next"));
        ignoreStaticMap.put("AnalysisRecordUtils.FileInfo", Utils.asListArgs("getStoragePath","getFileName","getFileFunction","getFileIntervalTime","getFolderName","isHandler","setHandler","getLogPath","getIntervalTimeFolder"));
        ignoreStaticMap.put("ApkInfoItem", Utils.asListArgs("getAppInfoBean","getListKeyValues","getAppMD5","getAppSHA1","getAppSHA256","getMinSdkVersion","getTargetSdkVersion","getApkLength","getX509Certificate","getNotBefore","getNotAfter","isEffective","getCertPrincipal","getCertVersion","getCertSigalgname","getCertSigalgoid","getCertSerialnumber","getCertDercode"));
        ignoreStaticMap.put("AppInfoBean", Utils.asListArgs("getAppPackName","getAppName","getAppIcon","getAppType","getVersionCode","getVersionName","getFirstInstallTime","getLastUpdateTime","getSourceDir","getApkSize"));
        ignoreStaticMap.put("AppInfoItem", Utils.asListArgs("getAppInfoBean","getListKeyValues","getAppMD5","getAppSHA1","getAppSHA256","getMinSdkVersion","getTargetSdkVersion","getApkLength","getX509Certificate","getNotBefore","getNotAfter","isEffective","getCertPrincipal","getCertVersion","getCertSigalgname","getCertSigalgoid","getCertSerialnumber","getCertDercode"));
        ignoreStaticMap.put("AutoFocusAssist", Utils.asListArgs("isAutoFocus","setAutoFocus","onAutoFocus","autoFocusAgainLater","start","stop","cancelOutstandingTask"));
        ignoreStaticMap.put("AutoFocusAssist.AutoFocusTask", Utils.asListArgs("doInBackground"));
        ignoreStaticMap.put("Averager", Utils.asListArgs("add","clear","size","getAverage","print"));
        ignoreStaticMap.put("Base64.Decoder", Utils.asListArgs("maxOutputSize","process"));
        ignoreStaticMap.put("Base64.Encoder", Utils.asListArgs("maxOutputSize","process"));
        ignoreStaticMap.put("Base64Cipher", Utils.asListArgs("decrypt","encrypt"));
        ignoreStaticMap.put("BeepVibrateAssist", Utils.asListArgs("shouldBeep","streamUpdate","isPlayBeep","isVibrate","setVibrate","setVibrate","setMediaPlayer","playBeepSoundAndVibrate","close"));
        ignoreStaticMap.put("CalendarUtils.Festival", Utils.asListArgs("isFestival","isFestival","isFestival","compareTo","toString"));
        ignoreStaticMap.put("CalendarUtils.SolarLunar", Utils.asListArgs("getLunarYearDays","getLunarLeapDays","getLunarLeapMonth","getLunarMonthDays","getLunarGanZhi","getLunarMonthChinese","getLunarDayChinese","getSolarTermsIndex","getSolarTerms","getSolarTermsDate"));
        ignoreStaticMap.put("CameraAssist", Utils.asListArgs("openDriver","closeDriver","startPreview","stopPreview","freeCameraResource","getCameraResolution","getPreviewSize","getCameraSizeAssist","getCamera","setCamera","setPreviewNotify","setAutoFocus","isPreviewing","setAutoInterval","setFlashlightOn","setFlashlightOff","isFlashlightOn"));
        ignoreStaticMap.put("CameraSizeAssist", Utils.asListArgs("getCamera","setPreviewSize","setPreviewSize","getPreviewSize","getPreviewSize","getPreviewSize","getPreviewSize","setPictureSize","setPictureSize","getPictureSize","getPictureSize","getPictureSize","getPictureSize","getPictureSize","getPictureSize","getVideoSize","getVideoSize","getVideoSize","getVideoSize","getVideoSize","getVideoSize","calcPreviewSize","calcPictureSize","calcVideoSize"));
        ignoreStaticMap.put("ClickUtils.ClickAssist", Utils.asListArgs("isFastDoubleClick","isFastDoubleClick","isFastDoubleClick","isFastDoubleClick","isFastDoubleClick","initConfig","putConfig","removeConfig","getConfigTime","removeRecord","clearRecord","setIntervalTime","reset"));
        ignoreStaticMap.put("CollectionUtils.ArrayWithTypeToken", Utils.asListArgs("put","get","create","newInstance","newInstance"));
        ignoreStaticMap.put("ColorUtils.ColorInfo", Utils.asListArgs("getKey","getValue","getValueParser","getValueColor","getAlpha","getRed","getGreen","getBlue","getGrayLevel","getHue","getSaturation","getBrightness","toString","priConvert"));
        ignoreStaticMap.put("ColorUtils.ColorInfo.ColorParser", Utils.asListArgs("handleColor"));
        ignoreStaticMap.put("ContentResolverUtils.MediaQueryInfo", Utils.asListArgs("getResult","getProjection","getSelection","getSelectionArgs"));
        ignoreStaticMap.put("ContentResolverUtils.MediaQueryInfoUri", Utils.asListArgs("getSelection","getSelectionArgs"));
        ignoreStaticMap.put("ContentResolverUtils.MediaQueryUri", Utils.asListArgs("getResult","getProjection","getSelection","getSelectionArgs"));
        ignoreStaticMap.put("CoordinateUtils.Direction", Utils.asListArgs("getValue"));
        ignoreStaticMap.put("CrashUtils", Utils.asListArgs("init","uncaughtException","handleException"));
        ignoreStaticMap.put("DefaultToastStyle", Utils.asListArgs("getGravity","getXOffset","getYOffset","getHorizontalMargin","getVerticalMargin","getZ","getCornerRadius","getBackgroundTintColor","getBackground","getTextColor","getTextSize","getMaxLines","getEllipsize","getTypeface","getPadding"));
        ignoreStaticMap.put("DevCache", Utils.asListArgs("put","put","getAsString","put","put","getAsJSONObject","put","put","getAsJSONArray","put","get","getAsBinary","getAsObject","put","put","getAsBitmap","put","put","getAsDrawable","file","remove","clear"));
        ignoreStaticMap.put("DevCache.xFileOutputStream", Utils.asListArgs("close"));
        ignoreStaticMap.put("DevCacheManager", Utils.asListArgs("calculateCacheSizeAndCacheCount","put","get","newFile","remove","clear","removeNext","calculateSize"));
        ignoreStaticMap.put("DevHelper", Utils.asListArgs("viewHelper","devHelper","quickHelper","postRunnable","postRunnable","postRunnable","postRunnable","removeRunnable","startTimer","closeTimer","recycle","saveBitmapToSDCardJPEG","saveBitmapToSDCardJPEG","saveBitmapToSDCardJPEG","saveBitmapToSDCardJPEG","saveBitmapToSDCardPNG","saveBitmapToSDCardPNG","saveBitmapToSDCardPNG","saveBitmapToSDCardPNG","saveBitmapToSDCardWEBP","saveBitmapToSDCardWEBP","saveBitmapToSDCardWEBP","saveBitmapToSDCardWEBP","saveBitmapToSDCard","saveBitmapToSDCard","addTextChangedListener","removeTextChangedListener","setKeyListener","setKeyListener","setKeyListener","record","cleanAppCache","cleanAppFiles","cleanAppDbs","cleanAppDbByName","cleanAppSp","cleanAppSp","cleanCache","cleanCustomDir","cleanCustomDir","cleanApplicationData","copyText","copyUri","copyIntent","notifyMediaStore","notifyMediaStore","showDialog","closeDialog","closeDialogs","closeDialog","closeDialogs","closePopupWindow","closePopupWindows","autoCloseDialog","autoCloseDialog","autoClosePopupWindow","openKeyboard","openKeyboard","openKeyboard","openKeyboard","openKeyboard","openKeyboard","closeKeyboard","closeKeyboard","closeKeyboard","closeKeyboard","closeKeyBoardSpecial","closeKeyBoardSpecial","closeKeyBoardSpecial","closeKeyboard","closeKeyboard","closeKeyboard","closeKeyboard","closeKeyboard","closeKeyboard","closeKeyboard","closeKeyboard","judgeView","registerSoftInputChangedListener","registerSoftInputChangedListener2","applyLanguage","applyLanguage","setOnClicks","setOnLongClicks","setOnTouchs","addTouchArea","addTouchArea","cancelAllNotification","cancelNotification","cancelNotification","notifyNotification","notifyNotification","saveAssetsFormFile","saveRawFormFile","setWindowSecure","setFullScreen","setFullScreenNoTitle","setLandscape","setPortrait","toggleScreenOrientation","forceGetViewSize","vibrate","vibrate","cancel","closeIO","closeIOQuietly","flush","flushQuietly","flushCloseIO","flushCloseIOQuietly","flushCloseIO","flushCloseIOQuietly","getNetTime","getNetTime","waitForEndAsync","waitForEnd","setAnimationListener"));
        ignoreStaticMap.put("DevMediaManager", Utils.asListArgs("createMedia","destroyMedia","bindListener","setAudioStreamType","playPrepareRaw","playPrepareRaw","playPrepareAssets","playPrepareAssets","playPrepare","playPrepare","playPrepare","isPlaying","pause","stop","onError","onVideoSizeChanged","onPrepared","onCompletion","onBufferingUpdate","onSeekComplete","setMeidaListener","isNullMediaPlayer","isNotNullMediaPlayer","getMediaPlayer","setMediaPlayer","setTAG","getVolume","setVolume","clearMediaPlayerData","getPlayRawId","getPlayUri","getVideoWidth","getVideoHeight","getCurrentPosition","getDuration","getPlayPercent"));
        ignoreStaticMap.put("DevThreadPool", Utils.asListArgs("getThreads","getCalcThreads","execute","execute","execute","shutdown","shutdownNow","isShutdown","isTerminated","awaitTermination","submit","submit","submit","invokeAll","invokeAll","invokeAny","invokeAny","schedule","schedule","scheduleWithFixedRate","scheduleWithFixedDelay"));
        ignoreStaticMap.put("DevVideoPlayerControl", Utils.asListArgs("resetOperate","surfaceChanged","surfaceCreated","surfaceDestroyed","onPrepared","onCompletion","onBufferingUpdate","onSeekComplete","onError","onVideoSizeChanged","setMediaListener","pausePlayer","stopPlayer","startPlayer","startPlayer","startPlayer","getSurfaceview","isPlaying","isPlaying","isAutoPlay","setAutoPlay","getPlayUri","getVideoWidth","getVideoHeight","getCurrentPosition","getDuration","getPlayPercent"));
        ignoreStaticMap.put("FileBreadthFirstSearchUtils", Utils.asListArgs("setSearchHandler","getQueueSameTimeNumber","setQueueSameTimeNumber","isRunning","stop","isStop","getStartTime","getEndTime","getDelayTime","setDelayTime","query","queryFile","whileQueue"));
        ignoreStaticMap.put("FileBreadthFirstSearchUtils.FileItem", Utils.asListArgs("put"));
        ignoreStaticMap.put("FileDepthFirstSearchUtils", Utils.asListArgs("setSearchHandler","isRunning","stop","isStop","getStartTime","getEndTime","query","queryFile"));
        ignoreStaticMap.put("FilePartAssist", Utils.asListArgs("getFile","getFileName","getFilePartItems","getFilePartItem","getPartCount","existsPart","isOnlyOne","getPartName"));
        ignoreStaticMap.put("FilePartItem", Utils.asListArgs("isFirstItem","isLastItem","existsPart","isOnlyOne","getPartName"));
        ignoreStaticMap.put("FileUtils.FileList", Utils.asListArgs("getFile","getSubFiles"));
        ignoreStaticMap.put("FlashlightUtils", Utils.asListArgs("register","unregister","setFlashlightOn","setFlashlightOn","setFlashlightOff","setFlashlightOff","isFlashlightOn","isFlashlightOn"));
        ignoreStaticMap.put("IToastImpl", Utils.asListArgs("reset","setIsHandler","setNullText","setTextLength","init","style","defaultStyle","getToastStyle","initStyle","initToastFilter","setView","show","show","show","show","cancel","filter","handlerContent","getThreadToastStyle","createView","priShowToastText","newToastText","priShowToastView","newToastView"));
        ignoreStaticMap.put("ImageUtils.ImageType", Utils.asListArgs("getValue"));
        ignoreStaticMap.put("InactivityTimerAssist", Utils.asListArgs("onPause","onResume","onDestroy","start","cancel"));
        ignoreStaticMap.put("InactivityTimerAssist.InactivityAsyncTask", Utils.asListArgs("doInBackground"));
        ignoreStaticMap.put("InactivityTimerAssist.PowerStateReceiver", Utils.asListArgs("onReceive"));
        ignoreStaticMap.put("KeyValueBean", Utils.asListArgs("getKey","getValue","toString"));
        ignoreStaticMap.put("KeyguardUtils", Utils.asListArgs("isKeyguardLocked","isKeyguardSecure","inKeyguardRestrictedInputMode","getKeyguardManager","setKeyguardManager","disableKeyguard","reenableKeyguard","release","getKeyguardLock","setKeyguardLock"));
        ignoreStaticMap.put("LocationUtils.CustomLocationListener", Utils.asListArgs("onLocationChanged","onStatusChanged","onProviderEnabled","onProviderDisabled"));
        ignoreStaticMap.put("LogConfig", Utils.asListArgs("methodCount","methodOffset","outputMethodAll","displayThreadInfo","sortLog","logLevel","tag"));
        ignoreStaticMap.put("LoggerPrinter", Utils.asListArgs("other","getLogConfig","init","init","d","e","e","e","w","i","v","wtf","json","xml","dTag","eTag","eTag","eTag","wTag","iTag","vTag","wtfTag","jsonTag","xmlTag","isPrintLog","checkLogLevel","finalLogPrinter","logHandle","logHandle","logHandle","logHeaderContent","logTopBorder","logBottomBorder","logDivider","logContent","createMessage","getSimpleClassName","getStackOffset","getThreadLogConfig"));
        ignoreStaticMap.put("NotificationUtils.VibratePattern", Utils.asListArgs("isEmpty"));
        ignoreStaticMap.put("PathUtils.AppExternalPath", Utils.asListArgs("getAppDataPath","getAppDataDir","getAppDataPath","getAppDataDir","getAppCachePath","getAppCacheDir","getAppCachePath","getAppCacheDir","getExternalFilesPath","getExternalFilesDir","getAppFilesPath","getAppFilesDir","getAppFilesPath","getAppFilesDir","getAppMusicPath","getAppMusicDir","getAppPodcastsPath","getAppPodcastsDir","getAppRingtonesPath","getAppRingtonesDir","getAppAlarmsPath","getAppAlarmsDir","getAppNotificationsPath","getAppNotificationsDir","getAppPicturesPath","getAppPicturesDir","getAppMoviesPath","getAppMoviesDir","getAppDownloadPath","getAppDownloadDir","getAppDCIMPath","getAppDCIMDir","getAppDocumentsPath","getAppDocumentsDir","getAppAudiobooksPath","getAppAudiobooksDir","getAppObbPath","getAppObbDir"));
        ignoreStaticMap.put("PathUtils.InternalPath", Utils.asListArgs("getRootPath","getRootDirectory","getDataPath","getDataDirectory","getDownloadCachePath","getDownloadCacheDirectory","getAppDataPath","getAppDataDir","getAppDataPath","getAppDataDir","getAppCachePath","getAppCacheDir","getAppCachePath","getAppCacheDir","getAppCodeCachePath","getAppCodeCacheDir","getAppDbsPath","getAppDbsDir","getAppDbPath","getAppDbFile","getAppFilesPath","getAppFilesDir","getAppFilesPath","getAppFilesDir","getAppSpPath","getAppSpDir","getAppSpPath","getAppSpFile","getAppNoBackupFilesPath","getAppNoBackupFilesDir","getAppMusicPath","getAppMusicDir","getAppPodcastsPath","getAppPodcastsDir","getAppRingtonesPath","getAppRingtonesDir","getAppAlarmsPath","getAppAlarmsDir","getAppNotificationsPath","getAppNotificationsDir","getAppPicturesPath","getAppPicturesDir","getAppMoviesPath","getAppMoviesDir","getAppDownloadPath","getAppDownloadDir","getAppDCIMPath","getAppDCIMDir","getAppDocumentsPath","getAppDocumentsDir","getAppAudiobooksPath","getAppAudiobooksDir"));
        ignoreStaticMap.put("PathUtils.SDCardPath", Utils.asListArgs("isSDCardEnable","getSDCardFile","getSDCardPath","getSDCardFile","getSDCardPath","getExternalStoragePublicPath","getExternalStoragePublicDir","getMusicPath","getMusicDir","getPodcastsPath","getPodcastsDir","getRingtonesPath","getRingtonesDir","getAlarmsPath","getAlarmsDir","getNotificationsPath","getNotificationsDir","getPicturesPath","getPicturesDir","getMoviesPath","getMoviesDir","getDownloadPath","getDownloadDir","getDCIMPath","getDCIMDir","getDocumentsPath","getDocumentsDir","getAudiobooksPath","getAudiobooksDir"));
        ignoreStaticMap.put("PermissionUtils", Utils.asListArgs("callBack","setRequestPermissionsResult","request","request","onRequestPermissionsResultCommon","checkPermissions","requestCallback","getPermissionsStatus"));
        ignoreStaticMap.put("PermissionUtils.PermissionActivity", Utils.asListArgs("onCreate","onRequestPermissionsResult"));
        ignoreStaticMap.put("PowerManagerUtils", Utils.asListArgs("isScreenOn","turnScreenOn","turnScreenOff","getWakeLock","setWakeLock","getPowerManager","setPowerManager"));
        ignoreStaticMap.put("PreferenceImpl", Utils.asListArgs("put","getValue","put","putAll","putAll","putAll","get","getAll","getAll","remove","removeAll","removeAll","contains","clear","getInt","getFloat","getLong","getBoolean","getString","getSet"));
        ignoreStaticMap.put("PreferenceImpl.ComparatorImpl", Utils.asListArgs("compare"));
        ignoreStaticMap.put("QuickHelper", Utils.asListArgs("getView","targetView","targetViewGroup","targetImageView","targetTextView","targetEditText","viewHelper","devHelper","quickHelper","postRunnable","postRunnable","postRunnable","postRunnable","removeRunnable","setHint","setText","setHtmlText","setHintTextColor","setHintTextColor","setTextColor","setTextColor","setTypeface","setTextSizeByPx","setTextSizeBySp","setTextSizeByDp","setTextSizeByIn","setTextSize","clearFlags","setPaintFlags","setAntiAliasFlag","setBold","setBold","setBold","setUnderlineText","setUnderlineText","setStrikeThruText","setStrikeThruText","setLetterSpacing","setLineSpacing","setLineSpacingAndMultiplier","setTextScaleX","setIncludeFontPadding","setInputType","setImeOptions","setLines","setMaxLines","setMinLines","setMaxEms","setMinEms","setEms","setEllipsize","setAutoLinkMask","setAllCaps","setTextGravity","setText","insert","insert","setMaxLength","setMaxLengthAndText","setCursorVisible","setSelectionToTop","setSelectionToBottom","setSelection","setTransformationMethod","setTransformationMethod","addTextChangedListener","removeTextChangedListener","setKeyListener","setAdjustViewBounds","setMaxHeight","setMaxWidth","setBackground","setBackgroundColor","setBackgroundResource","setBackgroundTintList","setBackgroundTintMode","setForeground","setForegroundGravity","setForegroundTintList","setForegroundTintMode","setImageBitmap","setImageDrawable","setImageResource","setImageMatrix","setImageTintList","setImageTintMode","setScaleType","setColorFilter","setColorFilter","setColorFilter","setColorFilter","setBackgroundResources","setBackgroundResources","setImageResources","setImageResources","setImageBitmaps","setImageBitmaps","setImageDrawables","setImageDrawables","setScaleTypes","setScaleTypes","setWidthHeight","setWidthHeight","setWidth","setWidth","setHeight","setHeight","setMinimumHeight","setMinimumWidth","setAlpha","setTag","scrollTo","scrollBy","setDescendantFocusability","setOverScrollMode","setHorizontalScrollBarEnabled","setVerticalScrollBarEnabled","setScrollContainer","setNextFocusForwardId","setNextFocusDownId","setNextFocusLeftId","setNextFocusRightId","setNextFocusUpId","setRotation","setRotationX","setRotationY","setScaleX","setScaleY","setTextAlignment","setTextDirection","setPivotX","setPivotY","setTranslationX","setTranslationY","setLayerType","requestLayout","requestFocus","clearFocus","requestLayoutParent","setClipChildren","setLayoutParams","setFocusableInTouchMode","setFocusable","toggleFocusable","setSelected","toggleSelected","setEnabled","toggleEnabled","setClickable","toggleClickable","setLongClickable","toggleLongClickable","setVisibility","setVisibility","toggleVisibilitys","reverseVisibilitys","reverseVisibilitys","removeSelfFromParent","setLayoutGravity","setLayoutGravity","setMarginLeft","setMarginLeft","setMarginTop","setMarginTop","setMarginRight","setMarginRight","setMarginBottom","setMarginBottom","setMargin","setMargin","setMargin","setPaddingLeft","setPaddingLeft","setPaddingTop","setPaddingTop","setPaddingRight","setPaddingRight","setPaddingBottom","setPaddingBottom","setPadding","setPadding","setPadding","setCompoundDrawablePadding","setCompoundDrawablesByLeft","setCompoundDrawablesByTop","setCompoundDrawablesByRight","setCompoundDrawablesByBottom","setCompoundDrawables","setCompoundDrawablesWithIntrinsicBoundsByLeft","setCompoundDrawablesWithIntrinsicBoundsByTop","setCompoundDrawablesWithIntrinsicBoundsByRight","setCompoundDrawablesWithIntrinsicBoundsByBottom","setCompoundDrawablesWithIntrinsicBounds","addRule","addRule","removeRule","setAnimation","clearAnimation","startAnimation","cancelAnimation","setOnClicks","setOnLongClicks","setOnTouchs","addTouchArea","addTouchArea","smoothScrollToPosition","scrollToPosition","smoothScrollToTop","scrollToTop","smoothScrollToBottom","scrollToBottom","smoothScrollTo","smoothScrollBy","fullScroll","openKeyboard","openKeyboard","openKeyboard","closeKeyboard","closeKeyBoardSpecial","closeKeyBoardSpecial","closeKeyBoardSpecial","forceGetViewSize"));
        ignoreStaticMap.put("ROMUtils.RomInfo", Utils.asListArgs("getName","getVersion","toString"));
        ignoreStaticMap.put("ReflectUtils", Utils.asListArgs("newInstance","newInstance","getArgsType","sortConstructors","newInstance","field","field","getField","getAccessibleField","unwrap","setEnumVal","method","method","method","exactMethod","similarMethod","sortMethods","isSimilarSignature","match","accessible","proxy","property","type","wrapper","get","hashCode","equals","toString"));
        ignoreStaticMap.put("ResourceAssist", Utils.asListArgs("reset","getPackageName","getResources","getDisplayMetrics","getConfiguration","getAssets","getIdentifier","getResourceName","getStringId","getString","getString","getString","getString","getDimenId","getDimension","getDimensionInt","getDimension","getDimensionInt","getColorId","getColor","getColor","getDrawableId","getDrawable","getNinePatchDrawable","getDrawable","getNinePatchDrawable","getBitmap","getBitmap","getBitmap","getBitmap","getMipmapId","getDrawableMipmap","getNinePatchDrawableMipmap","getBitmapMipmap","getBitmapMipmap","getAnimId","getAnimationXml","getAnimationXml","getAnimation","getAnimation","getAnimation","getAnimation","getBooleanId","getBoolean","getBoolean","getIntegerId","getInteger","getInteger","getArrayId","getIntArray","getStringArray","getTextArray","getIntArray","getStringArray","getTextArray","getId","getLayoutId","getMenuId","getRawId","getAttrId","getStyleId","getStyleableId","getAnimatorId","getXmlId","getInterpolatorId","getPluralsId","getColorStateList","getColorStateList","getColorDrawable","getColorDrawable","openInputStream","openInputStream","openOutputStream","openOutputStream","openOutputStream","openOutputStream","openFileDescriptor","openFileDescriptor","openAssetFileDescriptor","openAssetFileDescriptor","open","openFd","openNonAssetFd","openRawResource","openRawResourceFd","readBytesFromAssets","readStringFromAssets","readBytesFromRaw","readStringFromRaw","geFileToListFromAssets","geFileToListFromRaw","saveAssetsFormFile","saveRawFormFile"));
        ignoreStaticMap.put("ResourcePluginUtils", Utils.asListArgs("getResourceAssist","getResources","getPackageName","getAPKPath","getApkInfoItem","getDisplayMetrics","getConfiguration","getAssets","getIdentifier","getResourceName","getStringId","getString","getString","getString","getString","getDimenId","getDimension","getDimensionInt","getDimension","getDimensionInt","getColorId","getColor","getColor","getDrawableId","getDrawable","getNinePatchDrawable","getDrawable","getNinePatchDrawable","getBitmap","getBitmap","getBitmap","getBitmap","getMipmapId","getDrawableMipmap","getNinePatchDrawableMipmap","getBitmapMipmap","getBitmapMipmap","getAnimId","getAnimationXml","getAnimationXml","getAnimation","getAnimation","getAnimation","getAnimation","getBooleanId","getBoolean","getBoolean","getIntegerId","getInteger","getInteger","getArrayId","getIntArray","getStringArray","getTextArray","getIntArray","getStringArray","getTextArray","getId","getLayoutId","getMenuId","getRawId","getAttrId","getStyleId","getStyleableId","getAnimatorId","getXmlId","getInterpolatorId","getPluralsId","getColorStateList","getColorStateList","getColorDrawable","getColorDrawable","open","openFd","openNonAssetFd","openRawResource","openRawResourceFd","readBytesFromAssets","readStringFromAssets","readBytesFromRaw","readStringFromRaw","geFileToListFromAssets","geFileToListFromRaw","saveAssetsFormFile","saveRawFormFile"));
        ignoreStaticMap.put("ScaleUtils.XY", Utils.asListArgs("getXYx","getXY","getXY","compareTo"));
        ignoreStaticMap.put("ScreenSensorAssist", Utils.asListArgs("init","start","stop","isPortrait","isAllowChange"));
        ignoreStaticMap.put("ScreenSensorAssist.OrientationSensorChangeListener", Utils.asListArgs("onAccuracyChanged","onSensorChanged"));
        ignoreStaticMap.put("ScreenSensorAssist.OrientationSensorListener", Utils.asListArgs("onAccuracyChanged","onSensorChanged"));
        ignoreStaticMap.put("ScreenshotUtils", Utils.asListArgs("registerContentObserver","unregisterContentObserver","getStartListenTime","isCheckPrefix","setCheckPrefix","getScreenshotChecker","setScreenshotChecker","getListener","setListener","startListen","startListen","startListen","stopListen"));
        ignoreStaticMap.put("ScreenshotUtils.MediaContentObserver", Utils.asListArgs("onChange"));
        ignoreStaticMap.put("ShapeUtils", Utils.asListArgs("getDrawable","setDrawable","setAlpha","setShape","setInnerRadius","setInnerRadiusRatio","setThickness","setThicknessRatio","setColor","setColor","setStroke","setStroke","setStroke","setStroke","setCornerRadius","setCornerRadius","setCornerRadiusLeft","setCornerRadiusRight","setCornerRadiusTop","setCornerRadiusBottom","setColors","setGradientType","setOrientation","setGradientCenter","setGradientRadius","setUseLevel","setPadding","setPadding","setSize"));
        ignoreStaticMap.put("ShellUtils.CommandResult", Utils.asListArgs("isSuccess","isSuccess2","isSuccess3","isSuccess4"));
        ignoreStaticMap.put("SnackbarUtils", Utils.asListArgs("getStyle","setStyle","getSnackbar","getSnackbarView","getTextView","getActionButton","getSnackbarLayout","getSnackbarContentLayout","addView","addView","setCallback","setAction","setAction","setAction","setAction","dismiss","dismiss","showShort","showLong","showIndefinite","showShort","showLong","showIndefinite","priShow","setSnackbarStyle","setSnackbarStyle","getShadowMargin","setShadowMargin","isAutoCalc","setAutoCalc","clearLocations","above","bellow","setSnackbarLocation","setLayoutGravity","setMargin"));
        ignoreStaticMap.put("SnackbarUtils.StyleBuilder", Utils.asListArgs("getRootGravity","setRootGravity","getRootCornerRadius","setRootCornerRadius","getRootBackgroundTintColor","setRootBackgroundTintColor","getRootBackground","setRootBackground","getRootMargin","setRootMargin","getRootAlpha","setRootAlpha","getTextGravity","setTextGravity","getTextColor","setTextColor","getTextSize","setTextSize","getTextMaxLines","setTextMaxLines","getTextEllipsize","setTextEllipsize","getTextTypeface","setTextTypeface","getTextPadding","setTextPadding","getActionGravity","setActionGravity","getActionColor","setActionColor","getActionSize","setActionSize","getActionPadding","setActionPadding","getActionCornerRadius","setActionCornerRadius","getActionBackgroundTintColor","setActionBackgroundTintColor","getActionBackground","setActionBackground"));
        ignoreStaticMap.put("SpanUtils", Utils.asListArgs("setFlag","setForegroundColor","setBackgroundColor","setLineHeight","setLineHeight","setQuoteColor","setQuoteColor","setLeadingMargin","setBullet","setBullet","setFontSize","setFontSize","setFontProportion","setFontXProportion","setStrikethrough","setUnderline","setSuperscript","setSubscript","setBold","setItalic","setBoldItalic","setFontFamily","setTypeface","setHorizontalAlign","setVerticalAlign","setClickSpan","setUrl","setBlur","setShader","setShadow","setSpans","append","appendLine","appendLine","appendImage","appendImage","appendImage","appendImage","appendImage","appendImage","appendSpace","appendSpace","get","create","apply","applyLast","updateCharCharSequence","updateImage","updateSpace","setDefault"));
        ignoreStaticMap.put("SpanUtils.CustomBulletSpan", Utils.asListArgs("getLeadingMargin","drawLeadingMargin"));
        ignoreStaticMap.put("SpanUtils.CustomImageSpan", Utils.asListArgs("getDrawable"));
        ignoreStaticMap.put("SpanUtils.CustomLineHeightSpan", Utils.asListArgs("chooseHeight"));
        ignoreStaticMap.put("SpanUtils.CustomQuoteSpan", Utils.asListArgs("getLeadingMargin","drawLeadingMargin"));
        ignoreStaticMap.put("SpanUtils.CustomTypefaceSpan", Utils.asListArgs("updateDrawState","updateMeasureState","apply"));
        ignoreStaticMap.put("SpanUtils.ShaderSpan", Utils.asListArgs("updateDrawState"));
        ignoreStaticMap.put("SpanUtils.ShadowSpan", Utils.asListArgs("updateDrawState"));
        ignoreStaticMap.put("SpanUtils.SpaceSpan", Utils.asListArgs("getSize","draw"));
        ignoreStaticMap.put("SpanUtils.VerticalAlignSpan", Utils.asListArgs("getSize","draw"));
        ignoreStaticMap.put("TimeAverager", Utils.asListArgs("start","end","endAndRestart","average","print","clear"));
        ignoreStaticMap.put("TimeCounter", Utils.asListArgs("start","durationRestart","duration","getStartTime"));
        ignoreStaticMap.put("TimeKeeper", Utils.asListArgs("waitForEndAsync","waitForEnd"));
        ignoreStaticMap.put("TimerManager.TimerTask", Utils.asListArgs("start","close","startTimer","closeTimer","isRunTimer","getTriggerNumber","getTriggerLimit","isTriggerEnd","isInfinite","setHandler","setNotifyWhat","setNotifyObject","setTime","setTriggerLimit"));
        ignoreStaticMap.put("ToastFactory.BaseToast", Utils.asListArgs("setView","setText","findTextView","isEmptyMessageView","getMessageView"));
        ignoreStaticMap.put("ToastFactory.NotificationToast", Utils.asListArgs("show","cancel"));
        ignoreStaticMap.put("ToastFactory.SafeToast.SafeHandler", Utils.asListArgs("handleMessage","dispatchMessage"));
        ignoreStaticMap.put("ToastFactory.ToastHelper", Utils.asListArgs("handleMessage","show","cancel"));
        ignoreStaticMap.put("ToastTintUtils.DefaultStyle", Utils.asListArgs("getTextColor","getTextSize","getBackgroundTintColor","getBackground","getMaxLines","getEllipsize","getTypeface","getTintIconColor","isTintIcon"));
        ignoreStaticMap.put("ToastTintUtils.ErrorStyle", Utils.asListArgs("getBackgroundTintColor","isTintIcon"));
        ignoreStaticMap.put("ToastTintUtils.InfoStyle", Utils.asListArgs("getBackgroundTintColor","isTintIcon"));
        ignoreStaticMap.put("ToastTintUtils.NormalStyle", Utils.asListArgs("getBackgroundTintColor","isTintIcon"));
        ignoreStaticMap.put("ToastTintUtils.SafeHandler", Utils.asListArgs("handleMessage","dispatchMessage"));
        ignoreStaticMap.put("ToastTintUtils.SuccessStyle", Utils.asListArgs("getBackgroundTintColor","isTintIcon"));
        ignoreStaticMap.put("ToastTintUtils.WarningStyle", Utils.asListArgs("getBackgroundTintColor","isTintIcon"));
        ignoreStaticMap.put("ToastUtils.SafeHandler", Utils.asListArgs("handleMessage","dispatchMessage"));
        ignoreStaticMap.put("TypeUtils.ParameterizedTypeImpl", Utils.asListArgs("getActualTypeArguments","getOwnerType","getRawType","equals","hashCode"));
        ignoreStaticMap.put("ViewHelper", Utils.asListArgs("viewHelper","devHelper","quickHelper","postRunnable","postRunnable","postRunnable","postRunnable","removeRunnable","setHint","setText","setTexts","setHtmlText","setHtmlTexts","setHintTextColor","setHintTextColor","setHintTextColors","setHintTextColors","setTextColor","setTextColor","setTextColors","setTextColors","setTypeface","setTextSizeByPx","setTextSizeBySp","setTextSizeByDp","setTextSizeByIn","setTextSize","setTextSizes","clearFlags","setPaintFlags","setAntiAliasFlag","setBold","setBold","setBold","setUnderlineText","setUnderlineText","setStrikeThruText","setStrikeThruText","setLetterSpacing","setLineSpacing","setLineSpacingAndMultiplier","setTextScaleX","setIncludeFontPadding","setInputType","setImeOptions","setLines","setMaxLines","setMinLines","setMaxEms","setMinEms","setEms","setEllipsize","setAutoLinkMask","setAllCaps","setTextGravity","setText","insert","insert","setMaxLength","setMaxLengthAndText","setCursorVisible","setSelectionToTop","setSelectionToBottom","setSelection","setTransformationMethod","setTransformationMethod","setTransformationMethod","addTextChangedListener","removeTextChangedListener","setKeyListener","setKeyListener","setKeyListener","setAdjustViewBounds","setMaxHeight","setMaxWidth","setBackground","setBackgroundColor","setBackgroundResource","setBackgroundTintList","setBackgroundTintMode","setForeground","setForegroundGravity","setForegroundTintList","setForegroundTintMode","setImageBitmap","setImageDrawable","setImageResource","setImageMatrix","setImageTintList","setImageTintMode","setScaleType","setColorFilter","setColorFilter","setColorFilter","setColorFilter","setBackgroundResources","setBackgroundResources","setImageResources","setImageResources","setImageBitmaps","setImageBitmaps","setImageDrawables","setImageDrawables","setScaleTypes","setScaleTypes","setWidthHeight","setWidthHeight","setWidth","setWidth","setHeight","setHeight","setMinimumHeight","setMinimumWidth","setAlpha","setTag","scrollTo","scrollBy","setDescendantFocusability","setOverScrollMode","setHorizontalScrollBarEnabled","setVerticalScrollBarEnabled","setScrollContainer","setNextFocusForwardId","setNextFocusDownId","setNextFocusLeftId","setNextFocusRightId","setNextFocusUpId","setRotation","setRotationX","setRotationY","setScaleX","setScaleY","setTextAlignment","setTextDirection","setPivotX","setPivotY","setTranslationX","setTranslationY","setLayerType","requestLayout","requestFocus","clearFocus","requestLayoutParent","setClipChildren","setLayoutParams","setFocusableInTouchMode","setFocusable","toggleFocusable","setSelected","toggleSelected","setEnabled","toggleEnabled","setClickable","toggleClickable","setLongClickable","toggleLongClickable","setVisibility","setVisibility","setVisibilitys","setVisibilitys","toggleVisibilitys","toggleVisibilitys","toggleVisibilitys","reverseVisibilitys","reverseVisibilitys","reverseVisibilitys","reverseVisibilitys","removeSelfFromParent","setLayoutGravity","setLayoutGravity","setMarginLeft","setMarginLeft","setMarginTop","setMarginTop","setMarginRight","setMarginRight","setMarginBottom","setMarginBottom","setMargin","setMargin","setMargin","setMargin","setMargin","setMargin","setPaddingLeft","setPaddingLeft","setPaddingTop","setPaddingTop","setPaddingRight","setPaddingRight","setPaddingBottom","setPaddingBottom","setPadding","setPadding","setPadding","setPadding","setPadding","setPadding","setCompoundDrawablePadding","setCompoundDrawablesByLeft","setCompoundDrawablesByTop","setCompoundDrawablesByRight","setCompoundDrawablesByBottom","setCompoundDrawables","setCompoundDrawablesWithIntrinsicBoundsByLeft","setCompoundDrawablesWithIntrinsicBoundsByTop","setCompoundDrawablesWithIntrinsicBoundsByRight","setCompoundDrawablesWithIntrinsicBoundsByBottom","setCompoundDrawablesWithIntrinsicBounds","addRule","addRule","removeRule","addRules","addRules","removeRules","setAnimation","clearAnimation","startAnimation","cancelAnimation","setOnClicks","setOnLongClicks","setOnTouchs","addTouchArea","addTouchArea","smoothScrollToPosition","scrollToPosition","smoothScrollToTop","scrollToTop","smoothScrollToBottom","scrollToBottom","smoothScrollTo","smoothScrollBy","fullScroll"));
        ignoreStaticMap.put("WifiHotUtils", Utils.asListArgs("stratWifiAp","closeWifiAp","getWifiApState","getWifiApConfiguration","setWifiApConfiguration","isOpenWifiAp","closeWifiApCheck","isConnectHot","getHotspotServiceIp","getHotspotAllotIp","getConnectHotspotMsg","getHotspotSplitIpMask","intToString","getApWifiSSID","getApWifiPwd","setOnWifiAPListener"));
        ignoreStaticMap.put("WifiUtils", Utils.asListArgs("isOpenWifi","openWifi","closeWifi","toggleWifiEnabled","getWifiState","startScan","getConfiguration","getWifiList","getWifiInfo","isExists","isExists","quickConnWifi","quickConnWifi","removeWifiConfig","disconnectWifi","setStaticWifiConfig","setStaticWifiConfig","inetAddressToInt","setDNS","setGateway","setIpAddress","setStaticIpConfig","getField","getDeclaredField","setEnumField","setValueField"));
        ignoreStaticMap.put("WifiVo", Utils.asListArgs("describeContents","writeToParcel"));

        return ignoreStaticMap;
    }

    /**
     * 获取忽略指定方法 @param 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreParamMap() {
        Map<String, List<String>> ignoreParamMap = new HashMap<>();
        ignoreParamMap.put("ActivityUtils.ResultActivity", Utils.asListArgs("onCreate","onActivityResult"));
        ignoreParamMap.put("AutoFocusAssist.AutoFocusTask", Utils.asListArgs("doInBackground"));
        ignoreParamMap.put("Base64.Coder", Utils.asListArgs("process","maxOutputSize"));
        ignoreParamMap.put("Base64.Decoder", Utils.asListArgs("maxOutputSize","process"));
        ignoreParamMap.put("Base64.Encoder", Utils.asListArgs("maxOutputSize","process"));
        ignoreParamMap.put("CalendarUtils", Utils.asListArgs("getBitInt","solarToInt","solarFromInt"));
        ignoreParamMap.put("CalendarUtils.Festival", Utils.asListArgs("compareTo"));
        ignoreParamMap.put("ClassUtils", Utils.asListArgs("getClass","getClass"));
        ignoreParamMap.put("ClickUtils.OnCountClickListener", Utils.asListArgs("onClick"));
        ignoreParamMap.put("ClickUtils.OnDebouncingClickListener", Utils.asListArgs("onClick"));
        ignoreParamMap.put("ColorUtils.ColorInfo.ColorParser", Utils.asListArgs("handleColor"));
        ignoreParamMap.put("ContentResolverUtils.MediaQueryInfo", Utils.asListArgs("getResult","getProjection","getSelection","getSelectionArgs"));
        ignoreParamMap.put("ContentResolverUtils.MediaQueryInfoUri", Utils.asListArgs("getSelection","getSelectionArgs"));
        ignoreParamMap.put("ContentResolverUtils.MediaQueryUri", Utils.asListArgs("getResult","getProjection","getSelection","getSelectionArgs"));
        ignoreParamMap.put("InactivityTimerAssist.InactivityAsyncTask", Utils.asListArgs("doInBackground"));
        ignoreParamMap.put("InactivityTimerAssist.PowerStateReceiver", Utils.asListArgs("onReceive"));
        ignoreParamMap.put("JCLogUtils", Utils.asListArgs("d","e","e","e","i","xml","dTag","eTag","eTag","eTag","iTag","xmlTag"));
        ignoreParamMap.put("LogPrintUtils", Utils.asListArgs("d","e","e","e","w","i","v","wtf","json","xml","dTag","eTag","eTag","eTag","wTag","iTag","vTag","wtfTag","jsonTag","xmlTag"));
        ignoreParamMap.put("PreferenceImpl.ComparatorImpl", Utils.asListArgs("compare"));
        ignoreParamMap.put("ScaleUtils.XY", Utils.asListArgs("getXY","compareTo"));
        ignoreParamMap.put("ScreenSensorAssist.OrientationSensorChangeListener", Utils.asListArgs("onAccuracyChanged","onSensorChanged"));
        ignoreParamMap.put("ScreenSensorAssist.OrientationSensorListener", Utils.asListArgs("onAccuracyChanged","onSensorChanged"));
        ignoreParamMap.put("ScreenshotUtils.MediaContentObserver", Utils.asListArgs("onChange"));
        ignoreParamMap.put("SpanUtils.CustomBulletSpan", Utils.asListArgs("getLeadingMargin","drawLeadingMargin"));
        ignoreParamMap.put("SpanUtils.CustomDynamicDrawableSpan", Utils.asListArgs("getSize","draw"));
        ignoreParamMap.put("SpanUtils.CustomLineHeightSpan", Utils.asListArgs("chooseHeight"));
        ignoreParamMap.put("SpanUtils.CustomQuoteSpan", Utils.asListArgs("getLeadingMargin","drawLeadingMargin"));
        ignoreParamMap.put("SpanUtils.CustomTypefaceSpan", Utils.asListArgs("updateDrawState","updateMeasureState","apply"));
        ignoreParamMap.put("SpanUtils.ShaderSpan", Utils.asListArgs("updateDrawState"));
        ignoreParamMap.put("SpanUtils.ShadowSpan", Utils.asListArgs("updateDrawState"));
        ignoreParamMap.put("SpanUtils.SpaceSpan", Utils.asListArgs("getSize","draw"));
        ignoreParamMap.put("SpanUtils.VerticalAlignSpan", Utils.asListArgs("getSize","draw"));
        ignoreParamMap.put("ToastFactory.BaseToast", Utils.asListArgs("setView","setText"));
        ignoreParamMap.put("ToastFactory.SafeToast.SafeHandler", Utils.asListArgs("handleMessage","dispatchMessage"));
        ignoreParamMap.put("ToastFactory.ToastHelper", Utils.asListArgs("handleMessage"));
        ignoreParamMap.put("ToastTintUtils.SafeHandler", Utils.asListArgs("handleMessage","dispatchMessage"));
        ignoreParamMap.put("ToastUtils.SafeHandler", Utils.asListArgs("handleMessage","dispatchMessage"));
        ignoreParamMap.put("TypeUtils.ParameterizedTypeImpl", Utils.asListArgs("equals"));
        ignoreParamMap.put("WifiVo", Utils.asListArgs("writeToParcel"));

        return ignoreParamMap;
    }

    /**
     * 获取忽略指定方法 @return 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreReturnMap() {
        Map<String, List<String>> ignoreReturnMap = new HashMap<>();
        ignoreReturnMap.put("BarUtils", Utils.asListArgs("setStatusBarColor","setStatusBarColor","setStatusBarColor","setStatusBarColor"));
        ignoreReturnMap.put("Base64", Utils.asListArgs("decode","decode","decode","encodeToString","encodeToString","encode","encode"));

        return ignoreReturnMap;
    }

    /**
     * 获取忽略指定方法非 public 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreUnPublicMap() {
        Map<String, List<String>> ignoreUnPublicMap = new HashMap<>();
        ignoreUnPublicMap.put("ActivityUtils.ResultActivity", Utils.asListArgs("start","onCreate","onActivityResult","onDestroy"));
        ignoreUnPublicMap.put("ActivityUtils.ResultCallback", Utils.asListArgs("onStartActivityForResult","onActivityResult"));
        ignoreUnPublicMap.put("AnalysisRecordUtils", Utils.asListArgs("saveLogRecord","splitLog","handlerDeviceInfo"));
        ignoreUnPublicMap.put("AnalysisRecordUtils.CallBack", Utils.asListArgs("callback"));
        ignoreUnPublicMap.put("ApkInfoItem", Utils.asListArgs("get"));
        ignoreUnPublicMap.put("AppInfoBean", Utils.asListArgs("get"));
        ignoreUnPublicMap.put("AppInfoItem", Utils.asListArgs("get"));
        ignoreUnPublicMap.put("AutoFocusAssist", Utils.asListArgs("autoFocusAgainLater","cancelOutstandingTask"));
        ignoreUnPublicMap.put("AutoFocusAssist.AutoFocusTask", Utils.asListArgs("doInBackground"));
        ignoreUnPublicMap.put("BarUtils", Utils.asListArgs("addMarginTopEqualStatusBarHeight","subtractMarginTopEqualStatusBarHeight","applyStatusBarColor","applyStatusBarColor","hideStatusBarView","hideStatusBarView","showStatusBarView","createStatusBarView"));
        ignoreUnPublicMap.put("BeepVibrateAssist", Utils.asListArgs("shouldBeep","streamUpdate"));
        ignoreUnPublicMap.put("CalendarUtils", Utils.asListArgs("getBitInt","solarToInt","solarFromInt","solarTermsDateSplit"));
        ignoreUnPublicMap.put("CalendarUtils.FestivalHook", Utils.asListArgs("hook"));
        ignoreUnPublicMap.put("CameraAssist", Utils.asListArgs("freeCameraResource"));
        ignoreUnPublicMap.put("CameraAssist.PreviewNotify", Utils.asListArgs("stopPreviewNotify","startPreviewNotify"));
        ignoreUnPublicMap.put("CameraSizeAssist", Utils.asListArgs("calcPreviewSize","calcPictureSize","calcVideoSize"));
        ignoreUnPublicMap.put("CapturePictureUtils", Utils.asListArgs("snapshotByRecyclerView_GridLayoutManager","snapshotByRecyclerView_LinearLayoutManager","snapshotByRecyclerView_StaggeredGridLayoutManager","canvasBitmap"));
        ignoreUnPublicMap.put("ChineseUtils", Utils.asListArgs("numberToCHNNumber","thousandConvertCHN"));
        ignoreUnPublicMap.put("CollectionUtils.ArrayWithTypeToken", Utils.asListArgs("newInstance","newInstance"));
        ignoreUnPublicMap.put("ColorUtils", Utils.asListArgs("priParseColor"));
        ignoreUnPublicMap.put("ColorUtils.ColorInfo", Utils.asListArgs("priConvert","RGBtoHSB"));
        ignoreUnPublicMap.put("ColorUtils.ColorInfo.Parser", Utils.asListArgs("handleColor"));
        ignoreUnPublicMap.put("ConvertUtils", Utils.asListArgs("toDigit","toHexChars","toHexString"));
        ignoreUnPublicMap.put("CoordinateUtils", Utils.asListArgs("transformLat","transformLng","rad"));
        ignoreUnPublicMap.put("CrashUtils", Utils.asListArgs("handleException"));
        ignoreUnPublicMap.put("CrashUtils.CrashCatchListener", Utils.asListArgs("handleException","uncaughtException"));
        ignoreUnPublicMap.put("Decrypt", Utils.asListArgs("decrypt"));
        ignoreUnPublicMap.put("DevCache", Utils.asListArgs("myPid","getCachePath"));
        ignoreUnPublicMap.put("DevCacheManager", Utils.asListArgs("calculateCacheSizeAndCacheCount","put","get","newFile","remove","clear","removeNext","calculateSize"));
        ignoreUnPublicMap.put("DevCacheUtils", Utils.asListArgs("isDue","isDue","newStringWithDateInfo","newByteArrayWithDateInfo","createDateInfo","clearDateInfo","clearDateInfo","hasDateInfo","getDateInfoFromDate","indexOf","copyOfRange","bitmapToByte","byteToBitmap","drawableToBitmap","bitmapToDrawable"));
        ignoreUnPublicMap.put("DevLogger.Print", Utils.asListArgs("printLog"));
        ignoreUnPublicMap.put("DevMediaManager", Utils.asListArgs("createMedia","destroyMedia","bindListener","clearMediaPlayerData"));
        ignoreUnPublicMap.put("DevMediaManager.MediaListener", Utils.asListArgs("onPrepared","onCompletion","onBufferingUpdate","onSeekComplete","onError","onVideoSizeChanged"));
        ignoreUnPublicMap.put("DevVideoPlayerControl", Utils.asListArgs("resetOperate"));
        ignoreUnPublicMap.put("DeviceUtils", Utils.asListArgs("getMacAddressByWifiInfo","getMacAddressByNetworkInterface","getMacAddressByInetAddress","getInetAddress","getMacAddressByFile"));
        ignoreUnPublicMap.put("Encrypt", Utils.asListArgs("encrypt"));
        ignoreUnPublicMap.put("EncryptUtils", Utils.asListArgs("base64Encode","base64Decode"));
        ignoreUnPublicMap.put("FileBreadthFirstSearchUtils", Utils.asListArgs("queryFile","whileQueue"));
        ignoreUnPublicMap.put("FileBreadthFirstSearchUtils.FileItem", Utils.asListArgs("put"));
        ignoreUnPublicMap.put("FileBreadthFirstSearchUtils.SearchHandler", Utils.asListArgs("isHandlerFile","isAddToList","OnEndListener"));
        ignoreUnPublicMap.put("FileDepthFirstSearchUtils", Utils.asListArgs("queryFile"));
        ignoreUnPublicMap.put("FileDepthFirstSearchUtils.SearchHandler", Utils.asListArgs("isHandlerFile","isAddToList","OnEndListener"));
        ignoreUnPublicMap.put("FileRecordUtils.CallBack", Utils.asListArgs("callback"));
        ignoreUnPublicMap.put("FileUtils", Utils.asListArgs("copyFolder"));
        ignoreUnPublicMap.put("FileUtils.OnReplaceListener", Utils.asListArgs("onReplace"));
        ignoreUnPublicMap.put("HandlerUtils.OnEndListener", Utils.asListArgs("onEnd"));
        ignoreUnPublicMap.put("HttpURLConnectionUtils", Utils.asListArgs("reqNetTime"));
        ignoreUnPublicMap.put("HttpURLConnectionUtils.CallBack", Utils.asListArgs("onResponse","onFail"));
        ignoreUnPublicMap.put("HttpURLConnectionUtils.TimeCallBack", Utils.asListArgs("onResponse","onFail"));
        ignoreUnPublicMap.put("IDCardUtils", Utils.asListArgs("convertCharToInt","validateDateSmllerThenNow","isNumber"));
        ignoreUnPublicMap.put("IPreference", Utils.asListArgs("put","putAll","putAll","putAll","get","getAll","getAll","remove","removeAll","removeAll","contains","clear","getInt","getFloat","getLong","getBoolean","getString","getSet"));
        ignoreUnPublicMap.put("IPrinter", Utils.asListArgs("other","getLogConfig","init","init","d","e","e","e","w","i","v","wtf","json","xml","dTag","eTag","eTag","eTag","wTag","iTag","vTag","wtfTag","jsonTag","xmlTag"));
        ignoreUnPublicMap.put("IToast.Filter", Utils.asListArgs("filter","handlerContent"));
        ignoreUnPublicMap.put("IToast.Operate", Utils.asListArgs("reset","setIsHandler","setNullText","setTextLength","init","style","defaultStyle","getToastStyle","initStyle","initToastFilter","setView","show","show","show","show","cancel"));
        ignoreUnPublicMap.put("IToast.Style", Utils.asListArgs("getGravity","getXOffset","getYOffset","getHorizontalMargin","getVerticalMargin","getZ","getCornerRadius","getBackgroundTintColor","getBackground","getTextColor","getTextSize","getMaxLines","getEllipsize","getTypeface","getPadding"));
        ignoreUnPublicMap.put("IToastImpl", Utils.asListArgs("getThreadToastStyle","createView","priShowToastText","newToastText","priShowToastView","newToastView"));
        ignoreUnPublicMap.put("ImageConvertUtils.BMP", Utils.asListArgs("addBMPImageHeader","addBMPImageInfosHeader","addBMP_ARGB_8888"));
        ignoreUnPublicMap.put("ImageViewUtils", Utils.asListArgs("getImageViewFieldValue"));
        ignoreUnPublicMap.put("InactivityTimerAssist", Utils.asListArgs("start","cancel"));
        ignoreUnPublicMap.put("InactivityTimerAssist.InactivityAsyncTask", Utils.asListArgs("doInBackground"));
        ignoreUnPublicMap.put("JCLogUtils", Utils.asListArgs("isEmpty","printLog","createMessage","splitErrorMessage"));
        ignoreUnPublicMap.put("JCLogUtils.Print", Utils.asListArgs("printLog"));
        ignoreUnPublicMap.put("KeyBoardUtils", Utils.asListArgs("getContentViewInvisibleHeight"));
        ignoreUnPublicMap.put("KeyBoardUtils.OnSoftInputChangedListener", Utils.asListArgs("onSoftInputChanged"));
        ignoreUnPublicMap.put("LocationUtils", Utils.asListArgs("getCriteria"));
        ignoreUnPublicMap.put("LocationUtils.OnLocationChangeListener", Utils.asListArgs("getLastKnownLocation","onLocationChanged","onStatusChanged"));
        ignoreUnPublicMap.put("LogPrintUtils", Utils.asListArgs("isEmpty","printLog","createMessage","splitErrorMessage"));
        ignoreUnPublicMap.put("LogPrintUtils.Print", Utils.asListArgs("printLog"));
        ignoreUnPublicMap.put("LoggerPrinter", Utils.asListArgs("isPrintLog","checkLogLevel","finalLogPrinter","logHandle","logHandle","logHandle","logHeaderContent","logTopBorder","logBottomBorder","logDivider","logContent","createMessage","getSimpleClassName","getStackOffset","getThreadLogConfig"));
        ignoreUnPublicMap.put("PermissionUtils", Utils.asListArgs("onRequestPermissionsResultCommon","isGranted","checkPermissions","requestCallback","getPermissionsStatus"));
        ignoreUnPublicMap.put("PermissionUtils.PermissionActivity", Utils.asListArgs("start","onCreate"));
        ignoreUnPublicMap.put("PermissionUtils.PermissionCallBack", Utils.asListArgs("onGranted","onDenied"));
        ignoreUnPublicMap.put("PreferenceImpl", Utils.asListArgs("put","getValue"));
        ignoreUnPublicMap.put("QuickHelper", Utils.asListArgs("targetView","targetViewGroup","targetImageView","targetTextView","targetEditText"));
        ignoreUnPublicMap.put("ROMUtils", Utils.asListArgs("isRightRom","getManufacturer","getBrand","getRomVersion","getSystemProperty","getSystemPropertyByShell","getSystemPropertyByStream","getSystemPropertyByReflect","_getRomInfo"));
        ignoreUnPublicMap.put("ReflectUtils", Utils.asListArgs("forName","forName","getArgsType","sortConstructors","newInstance","getField","getAccessibleField","unwrap","method","exactMethod","similarMethod","sortMethods","isSimilarSignature","match","accessible","property","wrapper"));
        ignoreUnPublicMap.put("ScreenSensorAssist", Utils.asListArgs("init"));
        ignoreUnPublicMap.put("ScreenshotUtils", Utils.asListArgs("registerContentObserver","unregisterContentObserver"));
        ignoreUnPublicMap.put("ScreenshotUtils.OnScreenshotListener", Utils.asListArgs("onScreenshot"));
        ignoreUnPublicMap.put("ScreenshotUtils.ScreenshotChecker", Utils.asListArgs("onChange","onChecker"));
        ignoreUnPublicMap.put("ShellUtils", Utils.asListArgs("consumeInputStream"));
        ignoreUnPublicMap.put("ShortCutUtils", Utils.asListArgs("getAuthority","getAuthorityFromPermission","getAuthorityFromPermission"));
        ignoreUnPublicMap.put("SignaturesUtils", Utils.asListArgs("loadCertificates"));
        ignoreUnPublicMap.put("SizeUtils.onGetSizeListener", Utils.asListArgs("onGetSize"));
        ignoreUnPublicMap.put("SnackbarUtils", Utils.asListArgs("priShow","clearLocations","setSnackbarLocation","setLayoutGravity","setMargin"));
        ignoreUnPublicMap.put("SpanUtils", Utils.asListArgs("apply","applyLast","updateCharCharSequence","updateImage","updateSpace","setDefault","getContext"));
        ignoreUnPublicMap.put("SpanUtils.CustomDynamicDrawableSpan", Utils.asListArgs("getCachedDrawable"));
        ignoreUnPublicMap.put("SpanUtils.CustomTypefaceSpan", Utils.asListArgs("apply"));
        ignoreUnPublicMap.put("TimeKeeper.OnEndCallback", Utils.asListArgs("onEnd"));
        ignoreUnPublicMap.put("TimerManager.TimerTask", Utils.asListArgs("start","close"));
        ignoreUnPublicMap.put("ToastFactory", Utils.asListArgs("getWindowManager"));
        ignoreUnPublicMap.put("ToastFactory.BaseToast", Utils.asListArgs("findTextView"));
        ignoreUnPublicMap.put("ToastFactory.ToastHelper", Utils.asListArgs("show","cancel"));
        ignoreUnPublicMap.put("ToastTintUtils", Utils.asListArgs("showToastView","newToastView","inflaterView","reflectToastHandler"));
        ignoreUnPublicMap.put("ToastTintUtils.Filter", Utils.asListArgs("filter","handlerContent"));
        ignoreUnPublicMap.put("ToastTintUtils.Style", Utils.asListArgs("getTextColor","getTextSize","getBackgroundTintColor","getBackground","getMaxLines","getEllipsize","getTypeface","getTintIconColor","isTintIcon"));
        ignoreUnPublicMap.put("ToastUtils", Utils.asListArgs("priShowToastText","handlerToastRes","handlerToastStr","reflectToastHandler"));
        ignoreUnPublicMap.put("ToastUtils.Filter", Utils.asListArgs("filter","handlerContent"));
        ignoreUnPublicMap.put("UriUtils", Utils.asListArgs("getFilePathByUri"));
        ignoreUnPublicMap.put("WifiHotUtils", Utils.asListArgs("intToString"));
        ignoreUnPublicMap.put("WifiHotUtils.OnWifiAPListener", Utils.asListArgs("onStarted","onStopped","onFailed"));
        ignoreUnPublicMap.put("WifiUtils", Utils.asListArgs("setStaticWifiConfig","setStaticWifiConfig","inetAddressToInt","setDNS","setGateway","setIpAddress","setStaticIpConfig","getField","getDeclaredField","setEnumField","setValueField"));
        ignoreUnPublicMap.put("ZipUtils", Utils.asListArgs("zipFile","unzipChildFile"));

        return ignoreUnPublicMap;
    }

    /**
     * 获取忽略无修饰符变量处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreModifierVariableMap() {
        Map<String, List<String>> ignoreModifierVariableMap = new HashMap<>();
        ignoreModifierVariableMap.put("Base64", Utils.asListArgs("        int tailLen;"));
        ignoreModifierVariableMap.put("Base64.Encoder", Utils.asListArgs("    int tailLen;"));

        return ignoreModifierVariableMap;
    }

    /**
     * 获取忽略指定方法 return void 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreReturnVoidMap() {
        Map<String, List<String>> ignoreReturnVoidMap = new HashMap<>();
        ignoreReturnVoidMap.put("ADBUtils", Utils.asListArgs("sendEventSlide - void"));
        ignoreReturnVoidMap.put("AccessibilityUtils", Utils.asListArgs("setService - void","printAccessibilityEvent - void","printAccessibilityEvent - void"));
        ignoreReturnVoidMap.put("ActivityUtils.ResultCallback", Utils.asListArgs("onActivityResult - void"));
        ignoreReturnVoidMap.put("AnalysisRecordUtils", Utils.asListArgs("init - void","setCallBack - void","setHandler - void","setAppendSpace - void","setLogFolderName - void","setLogStoragePath - void"));
        ignoreReturnVoidMap.put("AnalysisRecordUtils.CallBack", Utils.asListArgs("callback - void"));
        ignoreReturnVoidMap.put("AppInfoUtils", Utils.asListArgs("printAppPermission - void"));
        ignoreReturnVoidMap.put("AutoFocusAssist", Utils.asListArgs("setFocusModes - void","setAutoFocus - void","onAutoFocus - void","autoFocusAgainLater - void","start - void","stop - void","cancelOutstandingTask - void"));
        ignoreReturnVoidMap.put("BarUtils", Utils.asListArgs("addMarginTopEqualStatusBarHeight - void","subtractMarginTopEqualStatusBarHeight - void","hideStatusBarView - void","hideStatusBarView - void","showStatusBarView - void"));
        ignoreReturnVoidMap.put("BeepVibrateAssist", Utils.asListArgs("streamUpdate - void","close - void"));
        ignoreReturnVoidMap.put("BigDecimalUtils", Utils.asListArgs("setScale - void","setRoundingMode - void"));
        ignoreReturnVoidMap.put("CalendarUtils", Utils.asListArgs("setFestivalHook - void"));
        ignoreReturnVoidMap.put("CameraAssist", Utils.asListArgs("closeDriver - void","startPreview - void","stopPreview - void","freeCameraResource - void"));
        ignoreReturnVoidMap.put("CameraAssist.PreviewNotify", Utils.asListArgs("stopPreviewNotify - void","startPreviewNotify - void"));
        ignoreReturnVoidMap.put("CameraUtils", Utils.asListArgs("freeCameraResource - void"));
        ignoreReturnVoidMap.put("CapturePictureUtils", Utils.asListArgs("setBitmapConfig - void","setBackgroundColor - void","setPaint - void","enableSlowWholeDocumentDraw - void"));
        ignoreReturnVoidMap.put("ClickUtils", Utils.asListArgs("setCheckViewId - void","setGlobalIntervalTime - void","remove - void"));
        ignoreReturnVoidMap.put("ClickUtils.OnCountClickListener", Utils.asListArgs("doClick - void","doInvalidClick - void"));
        ignoreReturnVoidMap.put("ClickUtils.OnDebouncingClickListener", Utils.asListArgs("doClick - void","doInvalidClick - void"));
        ignoreReturnVoidMap.put("CloseUtils", Utils.asListArgs("closeIO - void","closeIOQuietly - void","flush - void","flushQuietly - void","flushCloseIO - void","flushCloseIOQuietly - void","flushCloseIO - void","flushCloseIOQuietly - void"));
        ignoreReturnVoidMap.put("CollectionUtils.ArrayWithTypeToken", Utils.asListArgs("put - void","newInstance - void","newInstance - void"));
        ignoreReturnVoidMap.put("ColorUtils", Utils.asListArgs("setParser - void","sortGray - void","sortHSB - void"));
        ignoreReturnVoidMap.put("ColorUtils.ColorInfo", Utils.asListArgs("priConvert - void"));
        ignoreReturnVoidMap.put("ConvertUtils", Utils.asListArgs("bytesBitwiseAND - void"));
        ignoreReturnVoidMap.put("CrashUtils", Utils.asListArgs("init - void","uncaughtException - void"));
        ignoreReturnVoidMap.put("CrashUtils.CrashCatchListener", Utils.asListArgs("handleException - void","uncaughtException - void"));
        ignoreReturnVoidMap.put("DevCache", Utils.asListArgs("clear - void"));
        ignoreReturnVoidMap.put("DevCacheManager", Utils.asListArgs("calculateCacheSizeAndCacheCount - void","put - void","clear - void"));
        ignoreReturnVoidMap.put("DevCommonUtils", Utils.asListArgs("sleepOperate - void","sleepOperate - void"));
        ignoreReturnVoidMap.put("DevLogger", Utils.asListArgs("init - void","d - void","e - void","e - void","e - void","w - void","i - void","v - void","wtf - void","json - void","xml - void","dTag - void","eTag - void","eTag - void","eTag - void","wTag - void","iTag - void","vTag - void","wtfTag - void","jsonTag - void","xmlTag - void","setPrint - void"));
        ignoreReturnVoidMap.put("DevLogger.Print", Utils.asListArgs("printLog - void"));
        ignoreReturnVoidMap.put("DevMediaManager", Utils.asListArgs("createMedia - void","destroyMedia - void","pause - void","stop - void","onVideoSizeChanged - void","onPrepared - void","onCompletion - void","onBufferingUpdate - void","onSeekComplete - void","clearMediaPlayerData - void"));
        ignoreReturnVoidMap.put("DevMediaManager.MediaListener", Utils.asListArgs("onPrepared - void","onCompletion - void","onBufferingUpdate - void","onSeekComplete - void","onVideoSizeChanged - void"));
        ignoreReturnVoidMap.put("DevMediaManager.MediaSet", Utils.asListArgs("setMediaConfig - void"));
        ignoreReturnVoidMap.put("DevThreadManager", Utils.asListArgs("initConfig - void","putConfig - void","removeConfig - void"));
        ignoreReturnVoidMap.put("DevThreadPool", Utils.asListArgs("execute - void","execute - void","execute - void","shutdown - void"));
        ignoreReturnVoidMap.put("DevToast", Utils.asListArgs("reset - void","setIsHandler - void","setNullText - void","setTextLength - void","init - void","initStyle - void","initToastFilter - void","setView - void","show - void","show - void","show - void","show - void","cancel - void"));
        ignoreReturnVoidMap.put("DevVideoPlayerControl", Utils.asListArgs("resetOperate - void","surfaceChanged - void","surfaceCreated - void","surfaceDestroyed - void","onPrepared - void","onCompletion - void","onBufferingUpdate - void","onSeekComplete - void","onVideoSizeChanged - void","pausePlayer - void","stopPlayer - void","startPlayer - void","startPlayer - void","startPlayer - void"));
        ignoreReturnVoidMap.put("DialogUtils.DialogListener", Utils.asListArgs("onLeftButton - void","onRightButton - void","onDismiss - void"));
        ignoreReturnVoidMap.put("DialogUtils.MultiChoiceListener", Utils.asListArgs("onMultiChoiceItems - void","onPositiveButton - void","onCancel - void","onDismiss - void"));
        ignoreReturnVoidMap.put("DialogUtils.SingleChoiceListener", Utils.asListArgs("onSingleChoiceItems - void","onPositiveButton - void","onCancel - void","onDismiss - void"));
        ignoreReturnVoidMap.put("DialogUtils.ViewDialogListener", Utils.asListArgs("onPositiveButton - void","onCancel - void","onDismiss - void"));
        ignoreReturnVoidMap.put("EditTextUtils.DevTextWatcher", Utils.asListArgs("beforeTextChanged - void","onTextChanged - void","afterTextChanged - void"));
        ignoreReturnVoidMap.put("FileBreadthFirstSearchUtils", Utils.asListArgs("stop - void","query - void","queryFile - void","whileQueue - void"));
        ignoreReturnVoidMap.put("FileBreadthFirstSearchUtils.SearchHandler", Utils.asListArgs("OnEndListener - void"));
        ignoreReturnVoidMap.put("FileDepthFirstSearchUtils", Utils.asListArgs("stop - void","query - void","queryFile - void"));
        ignoreReturnVoidMap.put("FileDepthFirstSearchUtils.SearchHandler", Utils.asListArgs("OnEndListener - void"));
        ignoreReturnVoidMap.put("FileIOUtils", Utils.asListArgs("setBufferSize - void"));
        ignoreReturnVoidMap.put("FileRecordUtils", Utils.asListArgs("setInsertInfo - void","setCallBack - void"));
        ignoreReturnVoidMap.put("FileRecordUtils.CallBack", Utils.asListArgs("callback - void"));
        ignoreReturnVoidMap.put("HandlerUtils", Utils.asListArgs("postRunnable - void","postRunnable - void","postRunnable - void","postRunnable - void","removeRunnable - void","clearRunnableMaps - void","postRunnable - void","removeRunnable - void"));
        ignoreReturnVoidMap.put("HandlerUtils.OnEndListener", Utils.asListArgs("onEnd - void"));
        ignoreReturnVoidMap.put("HttpURLConnectionUtils", Utils.asListArgs("doGetAsync - void","doPostAsync - void","request - void","getNetTime - void","getNetTime - void","reqNetTime - void"));
        ignoreReturnVoidMap.put("HttpURLConnectionUtils.CallBack", Utils.asListArgs("onResponse - void","onFail - void"));
        ignoreReturnVoidMap.put("HttpURLConnectionUtils.TimeCallBack", Utils.asListArgs("onResponse - void","onFail - void"));
        ignoreReturnVoidMap.put("IPreference", Utils.asListArgs("put - void","putAll - void","putAll - void","putAll - void","remove - void","removeAll - void","removeAll - void","clear - void"));
        ignoreReturnVoidMap.put("IPrinter", Utils.asListArgs("init - void","d - void","e - void","e - void","e - void","w - void","i - void","v - void","wtf - void","json - void","xml - void","dTag - void","eTag - void","eTag - void","eTag - void","wTag - void","iTag - void","vTag - void","wtfTag - void","jsonTag - void","xmlTag - void"));
        ignoreReturnVoidMap.put("IToast.Operate", Utils.asListArgs("reset - void","setIsHandler - void","setNullText - void","setTextLength - void","init - void","initStyle - void","initToastFilter - void","setView - void","show - void","show - void","show - void","show - void","cancel - void"));
        ignoreReturnVoidMap.put("IToastImpl", Utils.asListArgs("reset - void","setIsHandler - void","setNullText - void","setTextLength - void","init - void","initStyle - void","initToastFilter - void","setView - void","show - void","show - void","show - void","show - void","cancel - void","priShowToastText - void","priShowToastView - void"));
        ignoreReturnVoidMap.put("InactivityTimerAssist", Utils.asListArgs("onPause - void","onResume - void","onDestroy - void","start - void","cancel - void"));
        ignoreReturnVoidMap.put("JCLogUtils", Utils.asListArgs("setPrintLog - void","setControlPrintLog - void","printLog - void","setPrint - void"));
        ignoreReturnVoidMap.put("JCLogUtils.Print", Utils.asListArgs("printLog - void"));
        ignoreReturnVoidMap.put("KeyBoardUtils", Utils.asListArgs("setDelayMillis - void","judgeView - void","fixSoftInputLeaks - void"));
        ignoreReturnVoidMap.put("KeyBoardUtils.OnSoftInputChangedListener", Utils.asListArgs("onSoftInputChanged - void"));
        ignoreReturnVoidMap.put("LanguageUtils", Utils.asListArgs("putSupportLanguage - void","removeSupportLanguage - void"));
        ignoreReturnVoidMap.put("LocationUtils.CustomLocationListener", Utils.asListArgs("onLocationChanged - void","onStatusChanged - void","onProviderEnabled - void","onProviderDisabled - void"));
        ignoreReturnVoidMap.put("LocationUtils.OnLocationChangeListener", Utils.asListArgs("getLastKnownLocation - void","onLocationChanged - void","onStatusChanged - void"));
        ignoreReturnVoidMap.put("LogPrintUtils", Utils.asListArgs("setPrintLog - void","printLog - void","setPrint - void"));
        ignoreReturnVoidMap.put("LogPrintUtils.Print", Utils.asListArgs("printLog - void"));
        ignoreReturnVoidMap.put("LoggerPrinter", Utils.asListArgs("init - void","d - void","e - void","e - void","e - void","w - void","i - void","v - void","wtf - void","json - void","xml - void","dTag - void","eTag - void","eTag - void","eTag - void","wTag - void","iTag - void","vTag - void","wtfTag - void","jsonTag - void","xmlTag - void","finalLogPrinter - void","logHandle - void","logHandle - void","logHandle - void","logHeaderContent - void","logTopBorder - void","logBottomBorder - void","logDivider - void","logContent - void"));
        ignoreReturnVoidMap.put("PermissionUtils", Utils.asListArgs("request - void","request - void","onRequestPermissionsResultCommon - void","onRequestPermissionsResult - void","notifyPermissionsChange - void","requestCallback - void","getPermissionsStatus - void"));
        ignoreReturnVoidMap.put("PermissionUtils.PermissionActivity", Utils.asListArgs("start - void","onCreate - void","onRequestPermissionsResult - void"));
        ignoreReturnVoidMap.put("PermissionUtils.PermissionCallBack", Utils.asListArgs("onGranted - void","onDenied - void"));
        ignoreReturnVoidMap.put("PreferenceImpl", Utils.asListArgs("put - void","put - void","putAll - void","putAll - void","putAll - void","remove - void","removeAll - void","removeAll - void","clear - void"));
        ignoreReturnVoidMap.put("ProcessUtils", Utils.asListArgs("kill - void","kill - void"));
        ignoreReturnVoidMap.put("ReflectUtils", Utils.asListArgs("sortConstructors - void","sortMethods - void"));
        ignoreReturnVoidMap.put("ScreenSensorAssist", Utils.asListArgs("init - void"));
        ignoreReturnVoidMap.put("ScreenshotUtils", Utils.asListArgs("handleMediaContentChange - void"));
        ignoreReturnVoidMap.put("ScreenshotUtils.OnScreenshotListener", Utils.asListArgs("onScreenshot - void"));
        ignoreReturnVoidMap.put("ScreenshotUtils.ScreenshotChecker", Utils.asListArgs("onChange - void","onChecker - void"));
        ignoreReturnVoidMap.put("SharedUtils", Utils.asListArgs("put - void","putAll - void","putAll - void","putAll - void","remove - void","removeAll - void","removeAll - void","clear - void"));
        ignoreReturnVoidMap.put("SizeUtils.onGetSizeListener", Utils.asListArgs("onGetSize - void"));
        ignoreReturnVoidMap.put("SnackbarUtils", Utils.asListArgs("dismiss - void","dismiss - void","showShort - void","showLong - void","showIndefinite - void","showShort - void","showLong - void","showIndefinite - void","priShow - void","clearLocations - void","setSnackbarLocation - void"));
        ignoreReturnVoidMap.put("SpanUtils", Utils.asListArgs("apply - void","applyLast - void","updateCharCharSequence - void","updateImage - void","updateSpace - void","setDefault - void"));
        ignoreReturnVoidMap.put("TimeKeeper", Utils.asListArgs("waitForEndAsync - void","waitForEnd - void"));
        ignoreReturnVoidMap.put("TimeKeeper.OnEndCallback", Utils.asListArgs("onEnd - void"));
        ignoreReturnVoidMap.put("TimerManager.TimerTask", Utils.asListArgs("start - void","close - void"));
        ignoreReturnVoidMap.put("ToastFactory.ToastHelper", Utils.asListArgs("show - void","cancel - void"));
        ignoreReturnVoidMap.put("ToastTintUtils", Utils.asListArgs("reset - void","setToastFilter - void","setIsHandler - void","setNullText - void","setUseConfig - void","setGravity - void","setMargin - void","setNormalStyle - void","setInfoStyle - void","setWarningStyle - void","setErrorStyle - void","setSuccessStyle - void","normal - void","normal - void","normal - void","normal - void","normal - void","normal - void","normal - void","normal - void","info - void","info - void","info - void","info - void","info - void","info - void","info - void","info - void","warning - void","warning - void","warning - void","warning - void","warning - void","warning - void","warning - void","warning - void","error - void","error - void","error - void","error - void","error - void","error - void","error - void","error - void","success - void","success - void","success - void","success - void","success - void","success - void","success - void","success - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","showToastView - void","reflectToastHandler - void"));
        ignoreReturnVoidMap.put("ToastUtils", Utils.asListArgs("reset - void","setToastFilter - void","setIsHandler - void","setNullText - void","setUseConfig - void","setGravity - void","setMargin - void","showShort - void","showShort - void","showShort - void","showShort - void","showLong - void","showLong - void","showLong - void","showLong - void","showToast - void","showToast - void","showToast - void","showToast - void","showShortNew - void","showShortNew - void","showShortNew - void","showShortNew - void","showLongNew - void","showLongNew - void","showLongNew - void","showLongNew - void","showToastNew - void","showToastNew - void","showToastNew - void","showToastNew - void","priShowToastText - void","showToastView - void","showToastView - void","showToastView - void","showToastView - void","showToastView - void","handlerToastRes - void","handlerToastStr - void","reflectToastHandler - void"));
        ignoreReturnVoidMap.put("WifiHotUtils.OnWifiAPListener", Utils.asListArgs("onStarted - void","onStopped - void","onFailed - void"));
        ignoreReturnVoidMap.put("WifiUtils", Utils.asListArgs("setDNS - void","setGateway - void","setIpAddress - void","setStaticIpConfig - void","setEnumField - void","setValueField - void"));

        return ignoreReturnVoidMap;
    }

    /**
     * 忽略注释间距异常文件
     * @param map {@link HashMap}
     */
    @Override
    public void ignoreAnnotationSpaceMap(Map<String, String> map) {
        map.remove("AliasMethod.java");
        map.remove("Base64.java");

    }
}