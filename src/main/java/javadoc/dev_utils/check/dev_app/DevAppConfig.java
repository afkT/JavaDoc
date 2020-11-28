package javadoc.dev_utils.check.dev_app;

import dev.utils.common.ArrayUtils;
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
        ignoreAnnotateMap.put("ActivityUtils.ResultActivity", ArrayUtils.asListArgs("onCreate","onActivityResult","onDestroy"));
        ignoreAnnotateMap.put("AutoFocusAssist.AutoFocusTask", ArrayUtils.asListArgs("doInBackground"));
        ignoreAnnotateMap.put("Base64.Coder", ArrayUtils.asListArgs("maxOutputSize"));
        ignoreAnnotateMap.put("Base64.Decoder", ArrayUtils.asListArgs("maxOutputSize"));
        ignoreAnnotateMap.put("Base64.Encoder", ArrayUtils.asListArgs("maxOutputSize","process"));
        ignoreAnnotateMap.put("CalendarUtils", ArrayUtils.asListArgs("getBitInt","solarToInt","solarFromInt"));
        ignoreAnnotateMap.put("CalendarUtils.Festival", ArrayUtils.asListArgs("compareTo","toString"));
        ignoreAnnotateMap.put("ClickUtils.OnCountClickListener", ArrayUtils.asListArgs("onClick"));
        ignoreAnnotateMap.put("ClickUtils.OnDebouncingClickListener", ArrayUtils.asListArgs("onClick"));
        ignoreAnnotateMap.put("ColorUtils.ColorInfo", ArrayUtils.asListArgs("toString"));
        ignoreAnnotateMap.put("ColorUtils.ColorInfo.ColorParser", ArrayUtils.asListArgs("handleColor"));
        ignoreAnnotateMap.put("ContentResolverUtils.MediaQueryInfo", ArrayUtils.asListArgs("getResult","getProjection","getSelection","getSelectionArgs"));
        ignoreAnnotateMap.put("ContentResolverUtils.MediaQueryInfoUri", ArrayUtils.asListArgs("getSelection","getSelectionArgs"));
        ignoreAnnotateMap.put("ContentResolverUtils.MediaQueryUri", ArrayUtils.asListArgs("getResult","getProjection","getSelection","getSelectionArgs"));
        ignoreAnnotateMap.put("DevCache.xFileOutputStream", ArrayUtils.asListArgs("close"));
        ignoreAnnotateMap.put("InactivityTimerAssist.InactivityAsyncTask", ArrayUtils.asListArgs("doInBackground"));
        ignoreAnnotateMap.put("InactivityTimerAssist.PowerStateReceiver", ArrayUtils.asListArgs("onReceive"));
        ignoreAnnotateMap.put("JCLogUtils", ArrayUtils.asListArgs("d","e","e","e","i","xml","dTag","eTag","eTag","eTag","iTag","xmlTag"));
        ignoreAnnotateMap.put("KeyValueBean", ArrayUtils.asListArgs("toString"));
        ignoreAnnotateMap.put("LogPrintUtils", ArrayUtils.asListArgs("d","e","e","e","w","i","v","wtf","json","xml","dTag","eTag","eTag","eTag","wTag","iTag","vTag","wtfTag","jsonTag","xmlTag"));
        ignoreAnnotateMap.put("PreferenceImpl.ComparatorImpl", ArrayUtils.asListArgs("compare"));
        ignoreAnnotateMap.put("ROMUtils.RomInfo", ArrayUtils.asListArgs("toString"));
        ignoreAnnotateMap.put("ScaleUtils.XY", ArrayUtils.asListArgs("getXYx","getXY","getXY","compareTo"));
        ignoreAnnotateMap.put("ScreenSensorAssist.OrientationSensorChangeListener", ArrayUtils.asListArgs("onAccuracyChanged","onSensorChanged"));
        ignoreAnnotateMap.put("ScreenSensorAssist.OrientationSensorListener", ArrayUtils.asListArgs("onAccuracyChanged","onSensorChanged"));
        ignoreAnnotateMap.put("ScreenshotUtils.MediaContentObserver", ArrayUtils.asListArgs("onChange"));
        ignoreAnnotateMap.put("SpanUtils.CustomBulletSpan", ArrayUtils.asListArgs("getLeadingMargin","drawLeadingMargin"));
        ignoreAnnotateMap.put("SpanUtils.CustomDynamicDrawableSpan", ArrayUtils.asListArgs("getDrawable","getSize","draw","getCachedDrawable"));
        ignoreAnnotateMap.put("SpanUtils.CustomImageSpan", ArrayUtils.asListArgs("getDrawable"));
        ignoreAnnotateMap.put("SpanUtils.CustomLineHeightSpan", ArrayUtils.asListArgs("chooseHeight"));
        ignoreAnnotateMap.put("SpanUtils.CustomQuoteSpan", ArrayUtils.asListArgs("getLeadingMargin","drawLeadingMargin"));
        ignoreAnnotateMap.put("SpanUtils.CustomTypefaceSpan", ArrayUtils.asListArgs("updateDrawState","updateMeasureState","apply"));
        ignoreAnnotateMap.put("SpanUtils.ShaderSpan", ArrayUtils.asListArgs("updateDrawState"));
        ignoreAnnotateMap.put("SpanUtils.ShadowSpan", ArrayUtils.asListArgs("updateDrawState"));
        ignoreAnnotateMap.put("SpanUtils.SpaceSpan", ArrayUtils.asListArgs("getSize","draw"));
        ignoreAnnotateMap.put("SpanUtils.VerticalAlignSpan", ArrayUtils.asListArgs("getSize","draw"));
        ignoreAnnotateMap.put("ToastFactory.BaseToast", ArrayUtils.asListArgs("setView","setText"));
        ignoreAnnotateMap.put("ToastFactory.NotificationToast", ArrayUtils.asListArgs("show","cancel"));
        ignoreAnnotateMap.put("ToastFactory.SafeToast.SafeHandler", ArrayUtils.asListArgs("handleMessage","dispatchMessage"));
        ignoreAnnotateMap.put("ToastFactory.ToastHelper", ArrayUtils.asListArgs("handleMessage"));
        ignoreAnnotateMap.put("ToastTintUtils.SafeHandler", ArrayUtils.asListArgs("handleMessage","dispatchMessage"));
        ignoreAnnotateMap.put("ToastUtils.SafeHandler", ArrayUtils.asListArgs("handleMessage","dispatchMessage"));
        ignoreAnnotateMap.put("TypeUtils.ParameterizedTypeImpl", ArrayUtils.asListArgs("getActualTypeArguments","getOwnerType","getRawType","equals","hashCode"));
        ignoreAnnotateMap.put("WifiVo", ArrayUtils.asListArgs("describeContents","writeToParcel"));

        return ignoreAnnotateMap;
    }

    /**
     * 获取忽略指定方法参数 final 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreFinalMap() {
        Map<String, List<String>> ignoreFinalMap = new HashMap<>();
        ignoreFinalMap.put("ActivityUtils.ResultActivity", ArrayUtils.asListArgs("onCreate","onActivityResult"));
        ignoreFinalMap.put("AutoFocusAssist", ArrayUtils.asListArgs("onAutoFocus"));
        ignoreFinalMap.put("AutoFocusAssist.AutoFocusTask", ArrayUtils.asListArgs("doInBackground"));
        ignoreFinalMap.put("Base64", ArrayUtils.asListArgs("decode","decode","decode","encodeToString","encodeToString","encode","encode"));
        ignoreFinalMap.put("Base64.Decoder", ArrayUtils.asListArgs("maxOutputSize","process"));
        ignoreFinalMap.put("Base64.Encoder", ArrayUtils.asListArgs("maxOutputSize","process"));
        ignoreFinalMap.put("Base64Cipher", ArrayUtils.asListArgs("decrypt","encrypt"));
        ignoreFinalMap.put("BitmapUtils", ArrayUtils.asListArgs("combineToCenter","combineToSameSize","combineToSameSize"));
        ignoreFinalMap.put("CalendarUtils", ArrayUtils.asListArgs("getBitInt","solarToInt","solarFromInt"));
        ignoreFinalMap.put("CalendarUtils.Festival", ArrayUtils.asListArgs("compareTo"));
        ignoreFinalMap.put("CameraSizeAssist", ArrayUtils.asListArgs("setPreviewSize","setPictureSize","calcPreviewSize","calcPictureSize","calcVideoSize"));
        ignoreFinalMap.put("CameraUtils", ArrayUtils.asListArgs("initCamera","open"));
        ignoreFinalMap.put("ColorUtils.ColorInfo", ArrayUtils.asListArgs("RGBtoHSB"));
        ignoreFinalMap.put("ColorUtils.ColorInfo.ColorParser", ArrayUtils.asListArgs("handleColor"));
        ignoreFinalMap.put("ContentResolverUtils.MediaQueryInfo", ArrayUtils.asListArgs("getResult","getProjection","getSelection","getSelectionArgs"));
        ignoreFinalMap.put("ContentResolverUtils.MediaQueryInfoUri", ArrayUtils.asListArgs("getSelection","getSelectionArgs"));
        ignoreFinalMap.put("ContentResolverUtils.MediaQueryUri", ArrayUtils.asListArgs("getResult","getProjection","getSelection","getSelectionArgs"));
        ignoreFinalMap.put("CrashUtils", ArrayUtils.asListArgs("init","uncaughtException","handleException"));
        ignoreFinalMap.put("DevMediaManager", ArrayUtils.asListArgs("onError","onVideoSizeChanged","onPrepared","onCompletion","onBufferingUpdate","onSeekComplete"));
        ignoreFinalMap.put("DevVideoPlayerControl", ArrayUtils.asListArgs("surfaceChanged","surfaceCreated","surfaceDestroyed","onBufferingUpdate","onError","onVideoSizeChanged"));
        ignoreFinalMap.put("IToastImpl", ArrayUtils.asListArgs("filter","handlerContent"));
        ignoreFinalMap.put("InactivityTimerAssist.InactivityAsyncTask", ArrayUtils.asListArgs("doInBackground"));
        ignoreFinalMap.put("InactivityTimerAssist.PowerStateReceiver", ArrayUtils.asListArgs("onReceive"));
        ignoreFinalMap.put("LocationUtils.CustomLocationListener", ArrayUtils.asListArgs("onLocationChanged","onStatusChanged","onProviderEnabled","onProviderDisabled"));
        ignoreFinalMap.put("LogConfig", ArrayUtils.asListArgs("methodCount","methodOffset","outputMethodAll","displayThreadInfo","sortLog","logLevel","tag"));
        ignoreFinalMap.put("LoggerPrinter", ArrayUtils.asListArgs("logHeaderContent"));
        ignoreFinalMap.put("NetWorkUtils", ArrayUtils.asListArgs("isAvailableByPing"));
        ignoreFinalMap.put("PermissionUtils.PermissionActivity", ArrayUtils.asListArgs("onCreate","onRequestPermissionsResult"));
        ignoreFinalMap.put("PreferenceImpl.ComparatorImpl", ArrayUtils.asListArgs("compare"));
        ignoreFinalMap.put("ScaleUtils.XY", ArrayUtils.asListArgs("getXY","compareTo"));
        ignoreFinalMap.put("ScreenSensorAssist.OrientationSensorChangeListener", ArrayUtils.asListArgs("onAccuracyChanged","onSensorChanged"));
        ignoreFinalMap.put("ScreenSensorAssist.OrientationSensorListener", ArrayUtils.asListArgs("onAccuracyChanged","onSensorChanged"));
        ignoreFinalMap.put("ScreenshotUtils.MediaContentObserver", ArrayUtils.asListArgs("onChange"));
        ignoreFinalMap.put("SnackbarUtils.StyleBuilder", ArrayUtils.asListArgs("setRootGravity","setRootCornerRadius","setRootBackgroundTintColor","setRootBackground","setRootMargin","setRootAlpha","setTextGravity","setTextColor","setTextSize","setTextMaxLines","setTextEllipsize","setTextTypeface","setTextPadding","setActionGravity","setActionColor","setActionSize","setActionPadding","setActionCornerRadius","setActionBackgroundTintColor","setActionBackground"));
        ignoreFinalMap.put("SpanUtils.VerticalAlignSpan", ArrayUtils.asListArgs("getSize","draw"));
        ignoreFinalMap.put("ToastFactory.BaseToast", ArrayUtils.asListArgs("setView","setText"));
        ignoreFinalMap.put("ToastFactory.SafeToast.SafeHandler", ArrayUtils.asListArgs("handleMessage","dispatchMessage"));
        ignoreFinalMap.put("ToastFactory.ToastHelper", ArrayUtils.asListArgs("handleMessage"));
        ignoreFinalMap.put("ToastTintUtils", ArrayUtils.asListArgs("newToastView","inflaterView"));
        ignoreFinalMap.put("ToastTintUtils.SafeHandler", ArrayUtils.asListArgs("handleMessage","dispatchMessage"));
        ignoreFinalMap.put("ToastUtils", ArrayUtils.asListArgs("newToastText","newToastView","handlerToastRes","handlerToastStr"));
        ignoreFinalMap.put("ToastUtils.SafeHandler", ArrayUtils.asListArgs("handleMessage","dispatchMessage"));
        ignoreFinalMap.put("TypeUtils.ParameterizedTypeImpl", ArrayUtils.asListArgs("equals"));

        return ignoreFinalMap;
    }

    /**
     * 获取忽略指定方法 static 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreStaticMap() {
        Map<String, List<String>> ignoreStaticMap = new HashMap<>();
        ignoreStaticMap.put("ActivityUtils", ArrayUtils.asListArgs("getActivityStacks","addActivity","removeActivity","removeActivity","currentActivity","finishActivity","existActivitys","finishActivity","finishActivity","finishAllActivityToIgnore","finishAllActivityToIgnore","finishAllActivity","exitApplication","restartApplication"));
        ignoreStaticMap.put("ActivityUtils.ResultActivity", ArrayUtils.asListArgs("onCreate","onActivityResult","onDestroy"));
        ignoreStaticMap.put("AliasMethod", ArrayUtils.asListArgs("next"));
        ignoreStaticMap.put("AnalysisRecordUtils.FileInfo", ArrayUtils.asListArgs("getStoragePath","getFileName","getFileFunction","getFileIntervalTime","getFolderName","isHandler","setHandler","getLogPath","getIntervalTimeFolder"));
        ignoreStaticMap.put("ApkInfoItem", ArrayUtils.asListArgs("getAppInfoBean","getListKeyValues","getAppMD5","getAppSHA1","getAppSHA256","getMinSdkVersion","getTargetSdkVersion","getApkLength","getX509Certificate","getNotBefore","getNotAfter","isEffective","getCertPrincipal","getCertVersion","getCertSigAlgName","getCertSigAlgOID","getCertSerialnumber","getCertDERCode"));
        ignoreStaticMap.put("AppInfoBean", ArrayUtils.asListArgs("getAppPackName","getAppName","getAppIcon","getAppType","getVersionCode","getVersionName","getFirstInstallTime","getLastUpdateTime","getSourceDir","getApkSize"));
        ignoreStaticMap.put("AppInfoItem", ArrayUtils.asListArgs("getAppInfoBean","getListKeyValues","getAppMD5","getAppSHA1","getAppSHA256","getMinSdkVersion","getTargetSdkVersion","getApkLength","getX509Certificate","getNotBefore","getNotAfter","isEffective","getCertPrincipal","getCertVersion","getCertSigAlgName","getCertSigAlgOID","getCertSerialnumber","getCertDERCode"));
        ignoreStaticMap.put("AutoFocusAssist", ArrayUtils.asListArgs("isAutoFocus","setAutoFocus","onAutoFocus","autoFocusAgainLater","start","stop","cancelOutstandingTask"));
        ignoreStaticMap.put("AutoFocusAssist.AutoFocusTask", ArrayUtils.asListArgs("doInBackground"));
        ignoreStaticMap.put("Averager", ArrayUtils.asListArgs("add","clear","size","getAverage","print"));
        ignoreStaticMap.put("Base64.Decoder", ArrayUtils.asListArgs("maxOutputSize","process"));
        ignoreStaticMap.put("Base64.Encoder", ArrayUtils.asListArgs("maxOutputSize","process"));
        ignoreStaticMap.put("Base64Cipher", ArrayUtils.asListArgs("decrypt","encrypt"));
        ignoreStaticMap.put("BeepVibrateAssist", ArrayUtils.asListArgs("shouldBeep","streamUpdate","isPlayBeep","isVibrate","setVibrate","setVibrate","setMediaPlayer","playBeepSoundAndVibrate","close"));
        ignoreStaticMap.put("CalendarUtils.Festival", ArrayUtils.asListArgs("isFestival","isFestival","isFestival","compareTo","toString"));
        ignoreStaticMap.put("CalendarUtils.SolarLunar", ArrayUtils.asListArgs("getLunarYearDays","getLunarLeapDays","getLunarLeapMonth","getLunarMonthDays","getLunarGanZhi","getLunarMonthChinese","getLunarDayChinese","getSolarTermsIndex","getSolarTerms","getSolarTermsDate"));
        ignoreStaticMap.put("CameraAssist", ArrayUtils.asListArgs("openDriver","closeDriver","startPreview","stopPreview","freeCameraResource","getCameraResolution","getPreviewSize","getCameraSizeAssist","getCamera","setCamera","setPreviewNotify","setAutoFocus","isPreviewing","setAutoInterval","setFlashlightOn","setFlashlightOff","isFlashlightOn"));
        ignoreStaticMap.put("CameraSizeAssist", ArrayUtils.asListArgs("getCamera","setPreviewSize","setPreviewSize","getPreviewSize","getPreviewSize","getPreviewSize","getPreviewSize","setPictureSize","setPictureSize","getPictureSize","getPictureSize","getPictureSize","getPictureSize","getPictureSize","getPictureSize","getVideoSize","getVideoSize","getVideoSize","getVideoSize","getVideoSize","getVideoSize","calcPreviewSize","calcPictureSize","calcVideoSize"));
        ignoreStaticMap.put("ClickUtils.ClickAssist", ArrayUtils.asListArgs("isFastDoubleClick","isFastDoubleClick","isFastDoubleClick","isFastDoubleClick","isFastDoubleClick","initConfig","putConfig","removeConfig","getConfigTime","removeRecord","clearRecord","setIntervalTime","reset"));
        ignoreStaticMap.put("CollectionUtils.ArrayWithTypeToken", ArrayUtils.asListArgs("put","get","create","newInstance","newInstance"));
        ignoreStaticMap.put("ColorUtils.ColorInfo", ArrayUtils.asListArgs("getKey","getValue","getValueParser","getValueColor","getAlpha","getRed","getGreen","getBlue","getGrayLevel","getHue","getSaturation","getBrightness","toString","priConvert"));
        ignoreStaticMap.put("ColorUtils.ColorInfo.ColorParser", ArrayUtils.asListArgs("handleColor"));
        ignoreStaticMap.put("ContentResolverUtils.MediaQueryInfo", ArrayUtils.asListArgs("getResult","getProjection","getSelection","getSelectionArgs"));
        ignoreStaticMap.put("ContentResolverUtils.MediaQueryInfoUri", ArrayUtils.asListArgs("getSelection","getSelectionArgs"));
        ignoreStaticMap.put("ContentResolverUtils.MediaQueryUri", ArrayUtils.asListArgs("getResult","getProjection","getSelection","getSelectionArgs"));
        ignoreStaticMap.put("CoordinateUtils.Direction", ArrayUtils.asListArgs("getValue"));
        ignoreStaticMap.put("CrashUtils", ArrayUtils.asListArgs("init","uncaughtException","handleException"));
        ignoreStaticMap.put("DefaultToastStyle", ArrayUtils.asListArgs("getGravity","getXOffset","getYOffset","getHorizontalMargin","getVerticalMargin","getZ","getCornerRadius","getBackgroundTintColor","getBackground","getTextColor","getTextSize","getMaxLines","getEllipsize","getTypeface","getPadding"));
        ignoreStaticMap.put("DevCache", ArrayUtils.asListArgs("put","put","getAsString","put","put","getAsJSONObject","put","put","getAsJSONArray","put","get","getAsBinary","getAsObject","put","put","getAsBitmap","put","put","getAsDrawable","file","remove","clear"));
        ignoreStaticMap.put("DevCache.xFileOutputStream", ArrayUtils.asListArgs("close"));
        ignoreStaticMap.put("DevCacheManager", ArrayUtils.asListArgs("calculateCacheSizeAndCacheCount","put","get","newFile","remove","clear","removeNext","calculateSize"));
        ignoreStaticMap.put("DevHelper", ArrayUtils.asListArgs("viewHelper","devHelper","quickHelper","postRunnable","postRunnable","postRunnable","postRunnable","removeRunnable","startTimer","closeTimer","recycle","saveBitmapToSDCardJPEG","saveBitmapToSDCardJPEG","saveBitmapToSDCardJPEG","saveBitmapToSDCardJPEG","saveBitmapToSDCardPNG","saveBitmapToSDCardPNG","saveBitmapToSDCardPNG","saveBitmapToSDCardPNG","saveBitmapToSDCardWEBP","saveBitmapToSDCardWEBP","saveBitmapToSDCardWEBP","saveBitmapToSDCardWEBP","saveBitmapToSDCard","saveBitmapToSDCard","addTextChangedListener","removeTextChangedListener","setKeyListener","setKeyListener","setKeyListener","record","cleanAppCache","cleanAppFiles","cleanAppDbs","cleanAppDbByName","cleanAppSp","cleanAppSp","cleanCache","cleanCustomDir","cleanCustomDir","cleanApplicationData","copyText","copyUri","copyIntent","notifyMediaStore","notifyMediaStore","showDialog","closeDialog","closeDialogs","closeDialog","closeDialogs","closePopupWindow","closePopupWindows","autoCloseDialog","autoCloseDialog","autoClosePopupWindow","openKeyboard","openKeyboard","openKeyboard","openKeyboard","openKeyboard","openKeyboard","closeKeyboard","closeKeyboard","closeKeyboard","closeKeyboard","closeKeyBoardSpecial","closeKeyBoardSpecial","closeKeyBoardSpecial","closeKeyboard","closeKeyboard","closeKeyboard","closeKeyboard","closeKeyboard","closeKeyboard","closeKeyboard","closeKeyboard","judgeView","registerSoftInputChangedListener","registerSoftInputChangedListener2","applyLanguage","applyLanguage","setOnClicks","setOnLongClicks","setOnTouchs","addTouchArea","addTouchArea","cancelAllNotification","cancelNotification","cancelNotification","notifyNotification","notifyNotification","saveAssetsFormFile","saveRawFormFile","setWindowSecure","setFullScreen","setFullScreenNoTitle","setLandscape","setPortrait","toggleScreenOrientation","forceGetViewSize","vibrate","vibrate","cancel","closeIO","closeIOQuietly","flush","flushQuietly","flushCloseIO","flushCloseIOQuietly","flushCloseIO","flushCloseIOQuietly","getNetTime","getNetTime","waitForEndAsync","waitForEnd","setAnimationListener"));
        ignoreStaticMap.put("DevMediaManager", ArrayUtils.asListArgs("createMedia","destroyMedia","bindListener","setAudioStreamType","playPrepareRaw","playPrepareRaw","playPrepareAssets","playPrepareAssets","playPrepare","playPrepare","playPrepare","isPlaying","pause","stop","onError","onVideoSizeChanged","onPrepared","onCompletion","onBufferingUpdate","onSeekComplete","setMediaListener","isNullMediaPlayer","isNotNullMediaPlayer","getMediaPlayer","setMediaPlayer","setTAG","getVolume","setVolume","clearMediaPlayerData","getPlayRawId","getPlayUri","getVideoWidth","getVideoHeight","getCurrentPosition","getDuration","getPlayPercent"));
        ignoreStaticMap.put("DevThreadPool", ArrayUtils.asListArgs("getThreads","getCalcThreads","execute","execute","execute","shutdown","shutdownNow","isShutdown","isTerminated","awaitTermination","submit","submit","submit","invokeAll","invokeAll","invokeAny","invokeAny","schedule","schedule","scheduleWithFixedRate","scheduleWithFixedDelay"));
        ignoreStaticMap.put("DevVideoPlayerControl", ArrayUtils.asListArgs("resetOperate","surfaceChanged","surfaceCreated","surfaceDestroyed","onPrepared","onCompletion","onBufferingUpdate","onSeekComplete","onError","onVideoSizeChanged","setMediaListener","pausePlayer","stopPlayer","startPlayer","startPlayer","startPlayer","getSurfaceView","isPlaying","isPlaying","isAutoPlay","setAutoPlay","getPlayUri","getVideoWidth","getVideoHeight","getCurrentPosition","getDuration","getPlayPercent"));
        ignoreStaticMap.put("FileBreadthFirstSearchUtils", ArrayUtils.asListArgs("setSearchHandler","getQueueSameTimeNumber","setQueueSameTimeNumber","isRunning","stop","isStop","getStartTime","getEndTime","getDelayTime","setDelayTime","query","queryFile","whileQueue"));
        ignoreStaticMap.put("FileBreadthFirstSearchUtils.FileItem", ArrayUtils.asListArgs("put"));
        ignoreStaticMap.put("FileDepthFirstSearchUtils", ArrayUtils.asListArgs("setSearchHandler","isRunning","stop","isStop","getStartTime","getEndTime","query","queryFile"));
        ignoreStaticMap.put("FilePartAssist", ArrayUtils.asListArgs("getFile","getFileName","getFilePartItems","getFilePartItem","getPartCount","existsPart","isOnlyOne","getPartName"));
        ignoreStaticMap.put("FilePartItem", ArrayUtils.asListArgs("isFirstItem","isLastItem","existsPart","isOnlyOne","getPartName"));
        ignoreStaticMap.put("FileUtils.FileList", ArrayUtils.asListArgs("getFile","getSubFiles"));
        ignoreStaticMap.put("FlashlightUtils", ArrayUtils.asListArgs("register","unregister","setFlashlightOn","setFlashlightOn","setFlashlightOff","setFlashlightOff","isFlashlightOn","isFlashlightOn"));
        ignoreStaticMap.put("IToastImpl", ArrayUtils.asListArgs("reset","setIsHandler","setNullText","setTextLength","init","style","defaultStyle","getToastStyle","initStyle","initToastFilter","setView","show","show","show","show","cancel","filter","handlerContent","getThreadToastStyle","createView","priShowToastText","newToastText","priShowToastView","newToastView"));
        ignoreStaticMap.put("ImageUtils.ImageType", ArrayUtils.asListArgs("getValue"));
        ignoreStaticMap.put("InactivityTimerAssist", ArrayUtils.asListArgs("onPause","onResume","onDestroy","start","cancel"));
        ignoreStaticMap.put("InactivityTimerAssist.InactivityAsyncTask", ArrayUtils.asListArgs("doInBackground"));
        ignoreStaticMap.put("InactivityTimerAssist.PowerStateReceiver", ArrayUtils.asListArgs("onReceive"));
        ignoreStaticMap.put("KeyValueBean", ArrayUtils.asListArgs("getKey","getValue","toString"));
        ignoreStaticMap.put("KeyguardUtils", ArrayUtils.asListArgs("isKeyguardLocked","isKeyguardSecure","inKeyguardRestrictedInputMode","getKeyguardManager","setKeyguardManager","disableKeyguard","reenableKeyguard","release","getKeyguardLock","setKeyguardLock"));
        ignoreStaticMap.put("LocationUtils.CustomLocationListener", ArrayUtils.asListArgs("onLocationChanged","onStatusChanged","onProviderEnabled","onProviderDisabled"));
        ignoreStaticMap.put("LogConfig", ArrayUtils.asListArgs("methodCount","methodOffset","outputMethodAll","displayThreadInfo","sortLog","logLevel","tag"));
        ignoreStaticMap.put("LoggerPrinter", ArrayUtils.asListArgs("other","getLogConfig","init","init","d","e","e","e","w","i","v","wtf","json","xml","dTag","eTag","eTag","eTag","wTag","iTag","vTag","wtfTag","jsonTag","xmlTag","isPrintLog","checkLogLevel","finalLogPrinter","logHandle","logHandle","logHandle","logHeaderContent","logTopBorder","logBottomBorder","logDivider","logContent","createMessage","getSimpleClassName","getStackOffset","getThreadLogConfig"));
        ignoreStaticMap.put("NotificationUtils.VibratePattern", ArrayUtils.asListArgs("isEmpty"));
        ignoreStaticMap.put("PathUtils.AppExternalPath", ArrayUtils.asListArgs("getAppDataPath","getAppDataDir","getAppDataPath","getAppDataDir","getAppCachePath","getAppCacheDir","getAppCachePath","getAppCacheDir","getExternalFilesPath","getExternalFilesDir","getAppFilesPath","getAppFilesDir","getAppFilesPath","getAppFilesDir","getAppMusicPath","getAppMusicDir","getAppPodcastsPath","getAppPodcastsDir","getAppRingtonesPath","getAppRingtonesDir","getAppAlarmsPath","getAppAlarmsDir","getAppNotificationsPath","getAppNotificationsDir","getAppPicturesPath","getAppPicturesDir","getAppMoviesPath","getAppMoviesDir","getAppDownloadPath","getAppDownloadDir","getAppDCIMPath","getAppDCIMDir","getAppDocumentsPath","getAppDocumentsDir","getAppAudiobooksPath","getAppAudiobooksDir","getAppObbPath","getAppObbDir"));
        ignoreStaticMap.put("PathUtils.InternalPath", ArrayUtils.asListArgs("getRootPath","getRootDirectory","getDataPath","getDataDirectory","getDownloadCachePath","getDownloadCacheDirectory","getAppDataPath","getAppDataDir","getAppDataPath","getAppDataDir","getAppCachePath","getAppCacheDir","getAppCachePath","getAppCacheDir","getAppCodeCachePath","getAppCodeCacheDir","getAppDbsPath","getAppDbsDir","getAppDbPath","getAppDbFile","getAppFilesPath","getAppFilesDir","getAppFilesPath","getAppFilesDir","getAppSpPath","getAppSpDir","getAppSpPath","getAppSpFile","getAppNoBackupFilesPath","getAppNoBackupFilesDir","getAppMusicPath","getAppMusicDir","getAppPodcastsPath","getAppPodcastsDir","getAppRingtonesPath","getAppRingtonesDir","getAppAlarmsPath","getAppAlarmsDir","getAppNotificationsPath","getAppNotificationsDir","getAppPicturesPath","getAppPicturesDir","getAppMoviesPath","getAppMoviesDir","getAppDownloadPath","getAppDownloadDir","getAppDCIMPath","getAppDCIMDir","getAppDocumentsPath","getAppDocumentsDir","getAppAudiobooksPath","getAppAudiobooksDir"));
        ignoreStaticMap.put("PathUtils.SDCardPath", ArrayUtils.asListArgs("isSDCardEnable","getSDCardFile","getSDCardPath","getSDCardFile","getSDCardPath","getExternalStoragePublicPath","getExternalStoragePublicDir","getMusicPath","getMusicDir","getPodcastsPath","getPodcastsDir","getRingtonesPath","getRingtonesDir","getAlarmsPath","getAlarmsDir","getNotificationsPath","getNotificationsDir","getPicturesPath","getPicturesDir","getMoviesPath","getMoviesDir","getDownloadPath","getDownloadDir","getDCIMPath","getDCIMDir","getDocumentsPath","getDocumentsDir","getAudiobooksPath","getAudiobooksDir"));
        ignoreStaticMap.put("PermissionUtils", ArrayUtils.asListArgs("callBack","setRequestPermissionsResult","request","request","onRequestPermissionsResultCommon","checkPermissions","requestCallback","getPermissionsStatus"));
        ignoreStaticMap.put("PermissionUtils.PermissionActivity", ArrayUtils.asListArgs("onCreate","onRequestPermissionsResult"));
        ignoreStaticMap.put("PowerManagerUtils", ArrayUtils.asListArgs("isScreenOn","turnScreenOn","turnScreenOff","getWakeLock","setWakeLock","getPowerManager","setPowerManager"));
        ignoreStaticMap.put("PreferenceImpl", ArrayUtils.asListArgs("put","getValue","put","putAll","putAll","putAll","get","getAll","getAll","remove","removeAll","removeAll","contains","clear","getInt","getFloat","getLong","getBoolean","getString","getSet"));
        ignoreStaticMap.put("PreferenceImpl.ComparatorImpl", ArrayUtils.asListArgs("compare"));
        ignoreStaticMap.put("QuickHelper", ArrayUtils.asListArgs("getView","targetView","targetViewGroup","targetImageView","targetTextView","targetEditText","viewHelper","devHelper","quickHelper","postRunnable","postRunnable","postRunnable","postRunnable","removeRunnable","setHint","setText","setHtmlText","setHintTextColor","setHintTextColor","setTextColor","setTextColor","setTypeface","setTextSizeByPx","setTextSizeBySp","setTextSizeByDp","setTextSizeByIn","setTextSize","clearFlags","setPaintFlags","setAntiAliasFlag","setBold","setBold","setBold","setUnderlineText","setUnderlineText","setStrikeThruText","setStrikeThruText","setLetterSpacing","setLineSpacing","setLineSpacingAndMultiplier","setTextScaleX","setIncludeFontPadding","setInputType","setImeOptions","setLines","setMaxLines","setMinLines","setMaxEms","setMinEms","setEms","setEllipsize","setAutoLinkMask","setAllCaps","setTextGravity","setText","insert","insert","setMaxLength","setMaxLengthAndText","setCursorVisible","setSelectionToTop","setSelectionToBottom","setSelection","setTransformationMethod","setTransformationMethod","addTextChangedListener","removeTextChangedListener","setKeyListener","setAdjustViewBounds","setMaxHeight","setMaxWidth","setBackground","setBackgroundColor","setBackgroundResource","setBackgroundTintList","setBackgroundTintMode","setForeground","setForegroundGravity","setForegroundTintList","setForegroundTintMode","setImageBitmap","setImageDrawable","setImageResource","setImageMatrix","setImageTintList","setImageTintMode","setScaleType","setColorFilter","setColorFilter","setColorFilter","setColorFilter","setBackgroundResources","setBackgroundResources","setImageResources","setImageResources","setImageBitmaps","setImageBitmaps","setImageDrawables","setImageDrawables","setScaleTypes","setScaleTypes","setWidthHeight","setWidthHeight","setWidth","setWidth","setHeight","setHeight","setMinimumHeight","setMinimumWidth","setAlpha","setTag","scrollTo","scrollBy","setDescendantFocusability","setOverScrollMode","setHorizontalScrollBarEnabled","setVerticalScrollBarEnabled","setScrollContainer","setNextFocusForwardId","setNextFocusDownId","setNextFocusLeftId","setNextFocusRightId","setNextFocusUpId","setRotation","setRotationX","setRotationY","setScaleX","setScaleY","setTextAlignment","setTextDirection","setPivotX","setPivotY","setTranslationX","setTranslationY","setLayerType","requestLayout","requestFocus","clearFocus","requestLayoutParent","setClipChildren","setLayoutParams","setFocusableInTouchMode","setFocusable","toggleFocusable","setSelected","toggleSelected","setEnabled","toggleEnabled","setClickable","toggleClickable","setLongClickable","toggleLongClickable","setVisibility","setVisibility","toggleVisibilitys","reverseVisibilitys","reverseVisibilitys","removeSelfFromParent","setLayoutGravity","setLayoutGravity","setMarginLeft","setMarginLeft","setMarginTop","setMarginTop","setMarginRight","setMarginRight","setMarginBottom","setMarginBottom","setMargin","setMargin","setMargin","setPaddingLeft","setPaddingLeft","setPaddingTop","setPaddingTop","setPaddingRight","setPaddingRight","setPaddingBottom","setPaddingBottom","setPadding","setPadding","setPadding","setCompoundDrawablePadding","setCompoundDrawablesByLeft","setCompoundDrawablesByTop","setCompoundDrawablesByRight","setCompoundDrawablesByBottom","setCompoundDrawables","setCompoundDrawablesWithIntrinsicBoundsByLeft","setCompoundDrawablesWithIntrinsicBoundsByTop","setCompoundDrawablesWithIntrinsicBoundsByRight","setCompoundDrawablesWithIntrinsicBoundsByBottom","setCompoundDrawablesWithIntrinsicBounds","addRule","addRule","removeRule","setAnimation","clearAnimation","startAnimation","cancelAnimation","setOnClicks","setOnLongClicks","setOnTouchs","addTouchArea","addTouchArea","smoothScrollToPosition","scrollToPosition","smoothScrollToTop","scrollToTop","smoothScrollToBottom","scrollToBottom","smoothScrollTo","smoothScrollBy","fullScroll","openKeyboard","openKeyboard","openKeyboard","closeKeyboard","closeKeyBoardSpecial","closeKeyBoardSpecial","closeKeyBoardSpecial","forceGetViewSize"));
        ignoreStaticMap.put("ROMUtils.RomInfo", ArrayUtils.asListArgs("getName","getVersion","toString"));
        ignoreStaticMap.put("ReflectUtils", ArrayUtils.asListArgs("newInstance","newInstance","getArgsType","sortConstructors","newInstance","field","field","getField","getAccessibleField","unwrap","setEnumVal","method","method","method","exactMethod","similarMethod","sortMethods","isSimilarSignature","match","accessible","proxy","property","type","wrapper","get","hashCode","equals","toString"));
        ignoreStaticMap.put("ResourceAssist", ArrayUtils.asListArgs("reset","getPackageName","getResources","getDisplayMetrics","getConfiguration","getAssets","getIdentifier","getResourceName","getStringId","getString","getString","getString","getString","getDimenId","getDimension","getDimensionInt","getDimension","getDimensionInt","getColorId","getColor","getColor","getDrawableId","getDrawable","getNinePatchDrawable","getDrawable","getNinePatchDrawable","getBitmap","getBitmap","getBitmap","getBitmap","getMipmapId","getDrawableMipmap","getNinePatchDrawableMipmap","getBitmapMipmap","getBitmapMipmap","getAnimId","getAnimationXml","getAnimationXml","getAnimation","getAnimation","getAnimation","getAnimation","getBooleanId","getBoolean","getBoolean","getIntegerId","getInteger","getInteger","getArrayId","getIntArray","getStringArray","getTextArray","getIntArray","getStringArray","getTextArray","getId","getLayoutId","getMenuId","getRawId","getAttrId","getStyleId","getStyleableId","getAnimatorId","getXmlId","getInterpolatorId","getPluralsId","getColorStateList","getColorStateList","getColorDrawable","getColorDrawable","openInputStream","openInputStream","openOutputStream","openOutputStream","openOutputStream","openOutputStream","openFileDescriptor","openFileDescriptor","openAssetFileDescriptor","openAssetFileDescriptor","open","openFd","openNonAssetFd","openRawResource","openRawResourceFd","readBytesFromAssets","readStringFromAssets","readBytesFromRaw","readStringFromRaw","geFileToListFromAssets","geFileToListFromRaw","saveAssetsFormFile","saveRawFormFile"));
        ignoreStaticMap.put("ResourcePluginUtils", ArrayUtils.asListArgs("getResourceAssist","getResources","getPackageName","getAPKPath","getApkInfoItem","getDisplayMetrics","getConfiguration","getAssets","getIdentifier","getResourceName","getStringId","getString","getString","getString","getString","getDimenId","getDimension","getDimensionInt","getDimension","getDimensionInt","getColorId","getColor","getColor","getDrawableId","getDrawable","getNinePatchDrawable","getDrawable","getNinePatchDrawable","getBitmap","getBitmap","getBitmap","getBitmap","getMipmapId","getDrawableMipmap","getNinePatchDrawableMipmap","getBitmapMipmap","getBitmapMipmap","getAnimId","getAnimationXml","getAnimationXml","getAnimation","getAnimation","getAnimation","getAnimation","getBooleanId","getBoolean","getBoolean","getIntegerId","getInteger","getInteger","getArrayId","getIntArray","getStringArray","getTextArray","getIntArray","getStringArray","getTextArray","getId","getLayoutId","getMenuId","getRawId","getAttrId","getStyleId","getStyleableId","getAnimatorId","getXmlId","getInterpolatorId","getPluralsId","getColorStateList","getColorStateList","getColorDrawable","getColorDrawable","open","openFd","openNonAssetFd","openRawResource","openRawResourceFd","readBytesFromAssets","readStringFromAssets","readBytesFromRaw","readStringFromRaw","geFileToListFromAssets","geFileToListFromRaw","saveAssetsFormFile","saveRawFormFile"));
        ignoreStaticMap.put("ScaleUtils.XY", ArrayUtils.asListArgs("getXYx","getXY","getXY","compareTo"));
        ignoreStaticMap.put("ScreenSensorAssist", ArrayUtils.asListArgs("init","start","stop","isPortrait","isAllowChange"));
        ignoreStaticMap.put("ScreenSensorAssist.OrientationSensorChangeListener", ArrayUtils.asListArgs("onAccuracyChanged","onSensorChanged"));
        ignoreStaticMap.put("ScreenSensorAssist.OrientationSensorListener", ArrayUtils.asListArgs("onAccuracyChanged","onSensorChanged"));
        ignoreStaticMap.put("ScreenshotUtils", ArrayUtils.asListArgs("registerContentObserver","unregisterContentObserver","getStartListenTime","isCheckPrefix","setCheckPrefix","getScreenshotChecker","setScreenshotChecker","getListener","setListener","startListen","startListen","startListen","stopListen"));
        ignoreStaticMap.put("ScreenshotUtils.MediaContentObserver", ArrayUtils.asListArgs("onChange"));
        ignoreStaticMap.put("ShapeUtils", ArrayUtils.asListArgs("getDrawable","setDrawable","setAlpha","setShape","setInnerRadius","setInnerRadiusRatio","setThickness","setThicknessRatio","setColor","setColor","setStroke","setStroke","setStroke","setStroke","setCornerRadius","setCornerRadius","setCornerRadiusLeft","setCornerRadiusRight","setCornerRadiusTop","setCornerRadiusBottom","setColors","setGradientType","setOrientation","setGradientCenter","setGradientRadius","setUseLevel","setPadding","setPadding","setSize"));
        ignoreStaticMap.put("ShellUtils.CommandResult", ArrayUtils.asListArgs("isSuccess","isSuccess2","isSuccess3","isSuccess4"));
        ignoreStaticMap.put("SnackbarUtils", ArrayUtils.asListArgs("getStyle","setStyle","getSnackbar","getSnackbarView","getTextView","getActionButton","getSnackbarLayout","getSnackbarContentLayout","addView","addView","setCallback","setAction","setAction","setAction","setAction","dismiss","dismiss","showShort","showLong","showIndefinite","showShort","showLong","showIndefinite","priShow","setSnackbarStyle","setSnackbarStyle","getShadowMargin","setShadowMargin","isAutoCalc","setAutoCalc","clearLocations","above","bellow","setSnackbarLocation","setLayoutGravity","setMargin"));
        ignoreStaticMap.put("SnackbarUtils.StyleBuilder", ArrayUtils.asListArgs("getRootGravity","setRootGravity","getRootCornerRadius","setRootCornerRadius","getRootBackgroundTintColor","setRootBackgroundTintColor","getRootBackground","setRootBackground","getRootMargin","setRootMargin","getRootAlpha","setRootAlpha","getTextGravity","setTextGravity","getTextColor","setTextColor","getTextSize","setTextSize","getTextMaxLines","setTextMaxLines","getTextEllipsize","setTextEllipsize","getTextTypeface","setTextTypeface","getTextPadding","setTextPadding","getActionGravity","setActionGravity","getActionColor","setActionColor","getActionSize","setActionSize","getActionPadding","setActionPadding","getActionCornerRadius","setActionCornerRadius","getActionBackgroundTintColor","setActionBackgroundTintColor","getActionBackground","setActionBackground"));
        ignoreStaticMap.put("SpanUtils", ArrayUtils.asListArgs("setFlag","setForegroundColor","setBackgroundColor","setLineHeight","setLineHeight","setQuoteColor","setQuoteColor","setLeadingMargin","setBullet","setBullet","setFontSize","setFontSize","setFontProportion","setFontXProportion","setStrikethrough","setUnderline","setSuperscript","setSubscript","setBold","setItalic","setBoldItalic","setFontFamily","setTypeface","setHorizontalAlign","setVerticalAlign","setClickSpan","setUrl","setBlur","setShader","setShadow","setSpans","append","appendLine","appendLine","appendImage","appendImage","appendImage","appendImage","appendImage","appendImage","appendSpace","appendSpace","get","create","apply","applyLast","updateCharCharSequence","updateImage","updateSpace","setDefault"));
        ignoreStaticMap.put("SpanUtils.CustomBulletSpan", ArrayUtils.asListArgs("getLeadingMargin","drawLeadingMargin"));
        ignoreStaticMap.put("SpanUtils.CustomImageSpan", ArrayUtils.asListArgs("getDrawable"));
        ignoreStaticMap.put("SpanUtils.CustomLineHeightSpan", ArrayUtils.asListArgs("chooseHeight"));
        ignoreStaticMap.put("SpanUtils.CustomQuoteSpan", ArrayUtils.asListArgs("getLeadingMargin","drawLeadingMargin"));
        ignoreStaticMap.put("SpanUtils.CustomTypefaceSpan", ArrayUtils.asListArgs("updateDrawState","updateMeasureState","apply"));
        ignoreStaticMap.put("SpanUtils.ShaderSpan", ArrayUtils.asListArgs("updateDrawState"));
        ignoreStaticMap.put("SpanUtils.ShadowSpan", ArrayUtils.asListArgs("updateDrawState"));
        ignoreStaticMap.put("SpanUtils.SpaceSpan", ArrayUtils.asListArgs("getSize","draw"));
        ignoreStaticMap.put("SpanUtils.VerticalAlignSpan", ArrayUtils.asListArgs("getSize","draw"));
        ignoreStaticMap.put("TimeAverager", ArrayUtils.asListArgs("start","end","endAndRestart","average","print","clear"));
        ignoreStaticMap.put("TimeCounter", ArrayUtils.asListArgs("start","durationRestart","duration","getStartTime"));
        ignoreStaticMap.put("TimeKeeper", ArrayUtils.asListArgs("waitForEndAsync","waitForEnd"));
        ignoreStaticMap.put("TimerManager.TimerTask", ArrayUtils.asListArgs("start","close","startTimer","closeTimer","isRunTimer","getTriggerNumber","getTriggerLimit","isTriggerEnd","isInfinite","setHandler","setNotifyWhat","setNotifyObject","setTime","setTriggerLimit"));
        ignoreStaticMap.put("ToastFactory.BaseToast", ArrayUtils.asListArgs("setView","setText","findTextView","isEmptyMessageView","getMessageView"));
        ignoreStaticMap.put("ToastFactory.NotificationToast", ArrayUtils.asListArgs("show","cancel"));
        ignoreStaticMap.put("ToastFactory.SafeToast.SafeHandler", ArrayUtils.asListArgs("handleMessage","dispatchMessage"));
        ignoreStaticMap.put("ToastFactory.ToastHelper", ArrayUtils.asListArgs("handleMessage","show","cancel"));
        ignoreStaticMap.put("ToastTintUtils.DefaultStyle", ArrayUtils.asListArgs("getTextColor","getTextSize","getBackgroundTintColor","getBackground","getMaxLines","getEllipsize","getTypeface","getTintIconColor","isTintIcon"));
        ignoreStaticMap.put("ToastTintUtils.ErrorStyle", ArrayUtils.asListArgs("getBackgroundTintColor","isTintIcon"));
        ignoreStaticMap.put("ToastTintUtils.InfoStyle", ArrayUtils.asListArgs("getBackgroundTintColor","isTintIcon"));
        ignoreStaticMap.put("ToastTintUtils.NormalStyle", ArrayUtils.asListArgs("getBackgroundTintColor","isTintIcon"));
        ignoreStaticMap.put("ToastTintUtils.SafeHandler", ArrayUtils.asListArgs("handleMessage","dispatchMessage"));
        ignoreStaticMap.put("ToastTintUtils.SuccessStyle", ArrayUtils.asListArgs("getBackgroundTintColor","isTintIcon"));
        ignoreStaticMap.put("ToastTintUtils.WarningStyle", ArrayUtils.asListArgs("getBackgroundTintColor","isTintIcon"));
        ignoreStaticMap.put("ToastUtils.SafeHandler", ArrayUtils.asListArgs("handleMessage","dispatchMessage"));
        ignoreStaticMap.put("TypeUtils.ParameterizedTypeImpl", ArrayUtils.asListArgs("getActualTypeArguments","getOwnerType","getRawType","equals","hashCode"));
        ignoreStaticMap.put("ViewHelper", ArrayUtils.asListArgs("viewHelper","devHelper","quickHelper","postRunnable","postRunnable","postRunnable","postRunnable","removeRunnable","setHint","setText","setTexts","setHtmlText","setHtmlTexts","setHintTextColor","setHintTextColor","setHintTextColors","setHintTextColors","setTextColor","setTextColor","setTextColors","setTextColors","setTypeface","setTextSizeByPx","setTextSizeBySp","setTextSizeByDp","setTextSizeByIn","setTextSize","setTextSizes","clearFlags","setPaintFlags","setAntiAliasFlag","setBold","setBold","setBold","setUnderlineText","setUnderlineText","setStrikeThruText","setStrikeThruText","setLetterSpacing","setLineSpacing","setLineSpacingAndMultiplier","setTextScaleX","setIncludeFontPadding","setInputType","setImeOptions","setLines","setMaxLines","setMinLines","setMaxEms","setMinEms","setEms","setEllipsize","setAutoLinkMask","setAllCaps","setTextGravity","setText","insert","insert","setMaxLength","setMaxLengthAndText","setCursorVisible","setSelectionToTop","setSelectionToBottom","setSelection","setTransformationMethod","setTransformationMethod","setTransformationMethod","addTextChangedListener","removeTextChangedListener","setKeyListener","setKeyListener","setKeyListener","setAdjustViewBounds","setMaxHeight","setMaxWidth","setBackground","setBackgroundColor","setBackgroundResource","setBackgroundTintList","setBackgroundTintMode","setForeground","setForegroundGravity","setForegroundTintList","setForegroundTintMode","setImageBitmap","setImageDrawable","setImageResource","setImageMatrix","setImageTintList","setImageTintMode","setScaleType","setColorFilter","setColorFilter","setColorFilter","setColorFilter","setBackgroundResources","setBackgroundResources","setImageResources","setImageResources","setImageBitmaps","setImageBitmaps","setImageDrawables","setImageDrawables","setScaleTypes","setScaleTypes","setWidthHeight","setWidthHeight","setWidth","setWidth","setHeight","setHeight","setMinimumHeight","setMinimumWidth","setAlpha","setTag","scrollTo","scrollBy","setDescendantFocusability","setOverScrollMode","setHorizontalScrollBarEnabled","setVerticalScrollBarEnabled","setScrollContainer","setNextFocusForwardId","setNextFocusDownId","setNextFocusLeftId","setNextFocusRightId","setNextFocusUpId","setRotation","setRotationX","setRotationY","setScaleX","setScaleY","setTextAlignment","setTextDirection","setPivotX","setPivotY","setTranslationX","setTranslationY","setLayerType","requestLayout","requestFocus","clearFocus","requestLayoutParent","setId","setClipChildren","setLayoutParams","setFocusableInTouchMode","setFocusable","toggleFocusable","setSelected","toggleSelected","setEnabled","toggleEnabled","setClickable","toggleClickable","setLongClickable","toggleLongClickable","setVisibility","setVisibility","setVisibilitys","setVisibilitys","toggleVisibilitys","toggleVisibilitys","toggleVisibilitys","reverseVisibilitys","reverseVisibilitys","reverseVisibilitys","reverseVisibilitys","removeSelfFromParent","setLayoutGravity","setLayoutGravity","setMarginLeft","setMarginLeft","setMarginTop","setMarginTop","setMarginRight","setMarginRight","setMarginBottom","setMarginBottom","setMargin","setMargin","setMargin","setMargin","setMargin","setMargin","setPaddingLeft","setPaddingLeft","setPaddingTop","setPaddingTop","setPaddingRight","setPaddingRight","setPaddingBottom","setPaddingBottom","setPadding","setPadding","setPadding","setPadding","setPadding","setPadding","setCompoundDrawablePadding","setCompoundDrawablesByLeft","setCompoundDrawablesByTop","setCompoundDrawablesByRight","setCompoundDrawablesByBottom","setCompoundDrawables","setCompoundDrawablesWithIntrinsicBoundsByLeft","setCompoundDrawablesWithIntrinsicBoundsByTop","setCompoundDrawablesWithIntrinsicBoundsByRight","setCompoundDrawablesWithIntrinsicBoundsByBottom","setCompoundDrawablesWithIntrinsicBounds","addRule","addRule","removeRule","addRules","addRules","removeRules","setAnimation","clearAnimation","startAnimation","cancelAnimation","setOnClicks","setOnLongClicks","setOnTouchs","addTouchArea","addTouchArea","smoothScrollToPosition","scrollToPosition","smoothScrollToTop","scrollToTop","smoothScrollToBottom","scrollToBottom","smoothScrollTo","smoothScrollBy","fullScroll"));
        ignoreStaticMap.put("WifiHotUtils", ArrayUtils.asListArgs("startWifiAp","closeWifiAp","getWifiApState","getWifiApConfiguration","setWifiApConfiguration","isOpenWifiAp","closeWifiApCheck","isConnectHot","getHotspotServiceIp","getHotspotAllotIp","getConnectHotspotMsg","getHotspotSplitIpMask","intToString","getApWifiSSID","getApWifiPwd","setOnWifiAPListener"));
        ignoreStaticMap.put("WifiUtils", ArrayUtils.asListArgs("isOpenWifi","openWifi","closeWifi","toggleWifiEnabled","getWifiState","startScan","getConfiguration","getWifiList","getWifiInfo","isExists","isExists","quickConnWifi","quickConnWifi","removeWifiConfig","disconnectWifi","setStaticWifiConfig","setStaticWifiConfig","inetAddressToInt","setDNS","setGateway","setIpAddress","setStaticIpConfig","getField","getDeclaredField","setEnumField","setValueField"));
        ignoreStaticMap.put("WifiVo", ArrayUtils.asListArgs("describeContents","writeToParcel"));

        return ignoreStaticMap;
    }

    /**
     * 获取忽略指定方法 @param 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreParamMap() {
        Map<String, List<String>> ignoreParamMap = new HashMap<>();
        ignoreParamMap.put("ActivityUtils.ResultActivity", ArrayUtils.asListArgs("onCreate","onActivityResult"));
        ignoreParamMap.put("AutoFocusAssist.AutoFocusTask", ArrayUtils.asListArgs("doInBackground"));
        ignoreParamMap.put("Base64.Coder", ArrayUtils.asListArgs("process","maxOutputSize"));
        ignoreParamMap.put("Base64.Decoder", ArrayUtils.asListArgs("maxOutputSize","process"));
        ignoreParamMap.put("Base64.Encoder", ArrayUtils.asListArgs("maxOutputSize","process"));
        ignoreParamMap.put("CalendarUtils", ArrayUtils.asListArgs("getBitInt","solarToInt","solarFromInt"));
        ignoreParamMap.put("CalendarUtils.Festival", ArrayUtils.asListArgs("compareTo"));
        ignoreParamMap.put("ClassUtils", ArrayUtils.asListArgs("getClass","getClass"));
        ignoreParamMap.put("ClickUtils.OnCountClickListener", ArrayUtils.asListArgs("onClick"));
        ignoreParamMap.put("ClickUtils.OnDebouncingClickListener", ArrayUtils.asListArgs("onClick"));
        ignoreParamMap.put("ColorUtils.ColorInfo.ColorParser", ArrayUtils.asListArgs("handleColor"));
        ignoreParamMap.put("ContentResolverUtils.MediaQueryInfo", ArrayUtils.asListArgs("getResult","getProjection","getSelection","getSelectionArgs"));
        ignoreParamMap.put("ContentResolverUtils.MediaQueryInfoUri", ArrayUtils.asListArgs("getSelection","getSelectionArgs"));
        ignoreParamMap.put("ContentResolverUtils.MediaQueryUri", ArrayUtils.asListArgs("getResult","getProjection","getSelection","getSelectionArgs"));
        ignoreParamMap.put("InactivityTimerAssist.InactivityAsyncTask", ArrayUtils.asListArgs("doInBackground"));
        ignoreParamMap.put("InactivityTimerAssist.PowerStateReceiver", ArrayUtils.asListArgs("onReceive"));
        ignoreParamMap.put("JCLogUtils", ArrayUtils.asListArgs("d","e","e","e","i","xml","dTag","eTag","eTag","eTag","iTag","xmlTag"));
        ignoreParamMap.put("LogPrintUtils", ArrayUtils.asListArgs("d","e","e","e","w","i","v","wtf","json","xml","dTag","eTag","eTag","eTag","wTag","iTag","vTag","wtfTag","jsonTag","xmlTag"));
        ignoreParamMap.put("PreferenceImpl.ComparatorImpl", ArrayUtils.asListArgs("compare"));
        ignoreParamMap.put("ScaleUtils.XY", ArrayUtils.asListArgs("getXY","compareTo"));
        ignoreParamMap.put("ScreenSensorAssist.OrientationSensorChangeListener", ArrayUtils.asListArgs("onAccuracyChanged","onSensorChanged"));
        ignoreParamMap.put("ScreenSensorAssist.OrientationSensorListener", ArrayUtils.asListArgs("onAccuracyChanged","onSensorChanged"));
        ignoreParamMap.put("ScreenshotUtils.MediaContentObserver", ArrayUtils.asListArgs("onChange"));
        ignoreParamMap.put("SpanUtils.CustomBulletSpan", ArrayUtils.asListArgs("getLeadingMargin","drawLeadingMargin"));
        ignoreParamMap.put("SpanUtils.CustomDynamicDrawableSpan", ArrayUtils.asListArgs("getSize","draw"));
        ignoreParamMap.put("SpanUtils.CustomLineHeightSpan", ArrayUtils.asListArgs("chooseHeight"));
        ignoreParamMap.put("SpanUtils.CustomQuoteSpan", ArrayUtils.asListArgs("getLeadingMargin","drawLeadingMargin"));
        ignoreParamMap.put("SpanUtils.CustomTypefaceSpan", ArrayUtils.asListArgs("updateDrawState","updateMeasureState","apply"));
        ignoreParamMap.put("SpanUtils.ShaderSpan", ArrayUtils.asListArgs("updateDrawState"));
        ignoreParamMap.put("SpanUtils.ShadowSpan", ArrayUtils.asListArgs("updateDrawState"));
        ignoreParamMap.put("SpanUtils.SpaceSpan", ArrayUtils.asListArgs("getSize","draw"));
        ignoreParamMap.put("SpanUtils.VerticalAlignSpan", ArrayUtils.asListArgs("getSize","draw"));
        ignoreParamMap.put("ToastFactory.BaseToast", ArrayUtils.asListArgs("setView","setText"));
        ignoreParamMap.put("ToastFactory.SafeToast.SafeHandler", ArrayUtils.asListArgs("handleMessage","dispatchMessage"));
        ignoreParamMap.put("ToastFactory.ToastHelper", ArrayUtils.asListArgs("handleMessage"));
        ignoreParamMap.put("ToastTintUtils.SafeHandler", ArrayUtils.asListArgs("handleMessage","dispatchMessage"));
        ignoreParamMap.put("ToastUtils.SafeHandler", ArrayUtils.asListArgs("handleMessage","dispatchMessage"));
        ignoreParamMap.put("TypeUtils.ParameterizedTypeImpl", ArrayUtils.asListArgs("equals"));
        ignoreParamMap.put("WifiVo", ArrayUtils.asListArgs("writeToParcel"));

        return ignoreParamMap;
    }

    /**
     * 获取忽略指定方法 @return 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreReturnMap() {
        Map<String, List<String>> ignoreReturnMap = new HashMap<>();
        ignoreReturnMap.put("BarUtils", ArrayUtils.asListArgs("setStatusBarColor","setStatusBarColor","setStatusBarColor","setStatusBarColor"));
        ignoreReturnMap.put("Base64", ArrayUtils.asListArgs("decode","decode","decode","encodeToString","encodeToString","encode","encode"));

        return ignoreReturnMap;
    }

    /**
     * 获取忽略指定方法非 public 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreUnPublicMap() {
        Map<String, List<String>> ignoreUnPublicMap = new HashMap<>();
        ignoreUnPublicMap.put("ActivityUtils.ResultActivity", ArrayUtils.asListArgs("start","onCreate","onActivityResult","onDestroy"));
        ignoreUnPublicMap.put("ActivityUtils.ResultCallback", ArrayUtils.asListArgs("onStartActivityForResult","onActivityResult"));
        ignoreUnPublicMap.put("AnalysisRecordUtils", ArrayUtils.asListArgs("saveLogRecord","splitLog","handlerDeviceInfo"));
        ignoreUnPublicMap.put("AnalysisRecordUtils.CallBack", ArrayUtils.asListArgs("callback"));
        ignoreUnPublicMap.put("ApkInfoItem", ArrayUtils.asListArgs("get"));
        ignoreUnPublicMap.put("AppInfoBean", ArrayUtils.asListArgs("get"));
        ignoreUnPublicMap.put("AppInfoItem", ArrayUtils.asListArgs("get"));
        ignoreUnPublicMap.put("AutoFocusAssist", ArrayUtils.asListArgs("autoFocusAgainLater","cancelOutstandingTask"));
        ignoreUnPublicMap.put("AutoFocusAssist.AutoFocusTask", ArrayUtils.asListArgs("doInBackground"));
        ignoreUnPublicMap.put("BarUtils", ArrayUtils.asListArgs("addMarginTopEqualStatusBarHeight","subtractMarginTopEqualStatusBarHeight","applyStatusBarColor","applyStatusBarColor","hideStatusBarView","hideStatusBarView","showStatusBarView","createStatusBarView"));
        ignoreUnPublicMap.put("BeepVibrateAssist", ArrayUtils.asListArgs("shouldBeep","streamUpdate"));
        ignoreUnPublicMap.put("CalendarUtils", ArrayUtils.asListArgs("getBitInt","solarToInt","solarFromInt","solarTermsDateSplit"));
        ignoreUnPublicMap.put("CalendarUtils.FestivalHook", ArrayUtils.asListArgs("hook"));
        ignoreUnPublicMap.put("CameraAssist", ArrayUtils.asListArgs("freeCameraResource"));
        ignoreUnPublicMap.put("CameraAssist.PreviewNotify", ArrayUtils.asListArgs("stopPreviewNotify","startPreviewNotify"));
        ignoreUnPublicMap.put("CameraSizeAssist", ArrayUtils.asListArgs("calcPreviewSize","calcPictureSize","calcVideoSize"));
        ignoreUnPublicMap.put("CapturePictureUtils", ArrayUtils.asListArgs("snapshotByRecyclerView_GridLayoutManager","snapshotByRecyclerView_LinearLayoutManager","snapshotByRecyclerView_StaggeredGridLayoutManager","canvasBitmap"));
        ignoreUnPublicMap.put("ChineseUtils", ArrayUtils.asListArgs("numberToCHNNumber","thousandConvertCHN"));
        ignoreUnPublicMap.put("CollectionUtils.ArrayWithTypeToken", ArrayUtils.asListArgs("newInstance","newInstance"));
        ignoreUnPublicMap.put("ColorUtils", ArrayUtils.asListArgs("priParseColor"));
        ignoreUnPublicMap.put("ColorUtils.ColorInfo", ArrayUtils.asListArgs("priConvert","RGBtoHSB"));
        ignoreUnPublicMap.put("ColorUtils.ColorInfo.Parser", ArrayUtils.asListArgs("handleColor"));
        ignoreUnPublicMap.put("ConvertUtils", ArrayUtils.asListArgs("toDigit","toHexChars","toHexString"));
        ignoreUnPublicMap.put("CoordinateUtils", ArrayUtils.asListArgs("transformLat","transformLng","rad"));
        ignoreUnPublicMap.put("CrashUtils", ArrayUtils.asListArgs("handleException"));
        ignoreUnPublicMap.put("CrashUtils.CrashCatchListener", ArrayUtils.asListArgs("handleException","uncaughtException"));
        ignoreUnPublicMap.put("Decrypt", ArrayUtils.asListArgs("decrypt"));
        ignoreUnPublicMap.put("DevCache", ArrayUtils.asListArgs("myPid","getCachePath"));
        ignoreUnPublicMap.put("DevCacheManager", ArrayUtils.asListArgs("calculateCacheSizeAndCacheCount","put","get","newFile","remove","clear","removeNext","calculateSize"));
        ignoreUnPublicMap.put("DevCacheUtils", ArrayUtils.asListArgs("isDue","isDue","newStringWithDateInfo","newByteArrayWithDateInfo","createDateInfo","clearDateInfo","clearDateInfo","hasDateInfo","getDateInfoFromDate","indexOf","copyOfRange","bitmapToByte","byteToBitmap","drawableToBitmap","bitmapToDrawable"));
        ignoreUnPublicMap.put("DevLogger.Print", ArrayUtils.asListArgs("printLog"));
        ignoreUnPublicMap.put("DevMediaManager", ArrayUtils.asListArgs("createMedia","destroyMedia","bindListener","clearMediaPlayerData"));
        ignoreUnPublicMap.put("DevMediaManager.MediaListener", ArrayUtils.asListArgs("onPrepared","onCompletion","onBufferingUpdate","onSeekComplete","onError","onVideoSizeChanged"));
        ignoreUnPublicMap.put("DevVideoPlayerControl", ArrayUtils.asListArgs("resetOperate"));
        ignoreUnPublicMap.put("DeviceUtils", ArrayUtils.asListArgs("getMacAddressByWifiInfo","getMacAddressByNetworkInterface","getMacAddressByInetAddress","getInetAddress","getMacAddressByFile"));
        ignoreUnPublicMap.put("Encrypt", ArrayUtils.asListArgs("encrypt"));
        ignoreUnPublicMap.put("EncryptUtils", ArrayUtils.asListArgs("base64Encode","base64Decode"));
        ignoreUnPublicMap.put("FileBreadthFirstSearchUtils", ArrayUtils.asListArgs("queryFile","whileQueue"));
        ignoreUnPublicMap.put("FileBreadthFirstSearchUtils.FileItem", ArrayUtils.asListArgs("put"));
        ignoreUnPublicMap.put("FileBreadthFirstSearchUtils.SearchHandler", ArrayUtils.asListArgs("isHandlerFile","isAddToList","onEndListener"));
        ignoreUnPublicMap.put("FileDepthFirstSearchUtils", ArrayUtils.asListArgs("queryFile"));
        ignoreUnPublicMap.put("FileDepthFirstSearchUtils.SearchHandler", ArrayUtils.asListArgs("isHandlerFile","isAddToList","onEndListener"));
        ignoreUnPublicMap.put("FileRecordUtils.CallBack", ArrayUtils.asListArgs("callback"));
        ignoreUnPublicMap.put("FileUtils", ArrayUtils.asListArgs("copyFolder"));
        ignoreUnPublicMap.put("FileUtils.OnReplaceListener", ArrayUtils.asListArgs("onReplace"));
        ignoreUnPublicMap.put("HandlerUtils.OnEndListener", ArrayUtils.asListArgs("onEnd"));
        ignoreUnPublicMap.put("HttpURLConnectionUtils", ArrayUtils.asListArgs("reqNetTime"));
        ignoreUnPublicMap.put("HttpURLConnectionUtils.CallBack", ArrayUtils.asListArgs("onResponse","onFail"));
        ignoreUnPublicMap.put("HttpURLConnectionUtils.TimeCallBack", ArrayUtils.asListArgs("onResponse","onFail"));
        ignoreUnPublicMap.put("IDCardUtils", ArrayUtils.asListArgs("convertCharToInt","validateDateSmallerThenNow","isNumber"));
        ignoreUnPublicMap.put("IPreference", ArrayUtils.asListArgs("put","putAll","putAll","putAll","get","getAll","getAll","remove","removeAll","removeAll","contains","clear","getInt","getFloat","getLong","getBoolean","getString","getSet"));
        ignoreUnPublicMap.put("IPrinter", ArrayUtils.asListArgs("other","getLogConfig","init","init","d","e","e","e","w","i","v","wtf","json","xml","dTag","eTag","eTag","eTag","wTag","iTag","vTag","wtfTag","jsonTag","xmlTag"));
        ignoreUnPublicMap.put("IToast.Filter", ArrayUtils.asListArgs("filter","handlerContent"));
        ignoreUnPublicMap.put("IToast.Operate", ArrayUtils.asListArgs("reset","setIsHandler","setNullText","setTextLength","init","style","defaultStyle","getToastStyle","initStyle","initToastFilter","setView","show","show","show","show","cancel"));
        ignoreUnPublicMap.put("IToast.Style", ArrayUtils.asListArgs("getGravity","getXOffset","getYOffset","getHorizontalMargin","getVerticalMargin","getZ","getCornerRadius","getBackgroundTintColor","getBackground","getTextColor","getTextSize","getMaxLines","getEllipsize","getTypeface","getPadding"));
        ignoreUnPublicMap.put("IToastImpl", ArrayUtils.asListArgs("getThreadToastStyle","createView","priShowToastText","newToastText","priShowToastView","newToastView"));
        ignoreUnPublicMap.put("ImageConvertUtils.BMP", ArrayUtils.asListArgs("addBMPImageHeader","addBMPImageInfosHeader","addBMP_ARGB8888"));
        ignoreUnPublicMap.put("ImageViewUtils", ArrayUtils.asListArgs("getImageViewFieldValue"));
        ignoreUnPublicMap.put("InactivityTimerAssist", ArrayUtils.asListArgs("start","cancel"));
        ignoreUnPublicMap.put("InactivityTimerAssist.InactivityAsyncTask", ArrayUtils.asListArgs("doInBackground"));
        ignoreUnPublicMap.put("JCLogUtils", ArrayUtils.asListArgs("isEmpty","printLog","createMessage","splitErrorMessage"));
        ignoreUnPublicMap.put("JCLogUtils.Print", ArrayUtils.asListArgs("printLog"));
        ignoreUnPublicMap.put("KeyBoardUtils", ArrayUtils.asListArgs("getContentViewInvisibleHeight"));
        ignoreUnPublicMap.put("KeyBoardUtils.OnSoftInputChangedListener", ArrayUtils.asListArgs("onSoftInputChanged"));
        ignoreUnPublicMap.put("LocationUtils", ArrayUtils.asListArgs("getCriteria"));
        ignoreUnPublicMap.put("LocationUtils.OnLocationChangeListener", ArrayUtils.asListArgs("getLastKnownLocation","onLocationChanged","onStatusChanged"));
        ignoreUnPublicMap.put("LogPrintUtils", ArrayUtils.asListArgs("isEmpty","printLog","createMessage","splitErrorMessage"));
        ignoreUnPublicMap.put("LogPrintUtils.Print", ArrayUtils.asListArgs("printLog"));
        ignoreUnPublicMap.put("LoggerPrinter", ArrayUtils.asListArgs("isPrintLog","checkLogLevel","finalLogPrinter","logHandle","logHandle","logHandle","logHeaderContent","logTopBorder","logBottomBorder","logDivider","logContent","createMessage","getSimpleClassName","getStackOffset","getThreadLogConfig"));
        ignoreUnPublicMap.put("PermissionUtils", ArrayUtils.asListArgs("isGranted","onRequestPermissionsResultCommon","checkPermissions","requestCallback","getPermissionsStatus"));
        ignoreUnPublicMap.put("PermissionUtils.PermissionActivity", ArrayUtils.asListArgs("start","onCreate"));
        ignoreUnPublicMap.put("PermissionUtils.PermissionCallBack", ArrayUtils.asListArgs("onGranted","onDenied"));
        ignoreUnPublicMap.put("PreferenceImpl", ArrayUtils.asListArgs("put","getValue"));
        ignoreUnPublicMap.put("QuickHelper", ArrayUtils.asListArgs("targetView","targetViewGroup","targetImageView","targetTextView","targetEditText"));
        ignoreUnPublicMap.put("ROMUtils", ArrayUtils.asListArgs("isRightRom","getManufacturer","getBrand","getRomVersion","getSystemProperty","getSystemPropertyByShell","getSystemPropertyByStream","getSystemPropertyByReflect","_getRomInfo"));
        ignoreUnPublicMap.put("ReflectUtils", ArrayUtils.asListArgs("forName","forName","getArgsType","sortConstructors","newInstance","getField","getAccessibleField","unwrap","method","exactMethod","similarMethod","sortMethods","isSimilarSignature","match","accessible","property","wrapper"));
        ignoreUnPublicMap.put("ScreenSensorAssist", ArrayUtils.asListArgs("init"));
        ignoreUnPublicMap.put("ScreenshotUtils", ArrayUtils.asListArgs("registerContentObserver","unregisterContentObserver"));
        ignoreUnPublicMap.put("ScreenshotUtils.OnScreenshotListener", ArrayUtils.asListArgs("onScreenshot"));
        ignoreUnPublicMap.put("ScreenshotUtils.ScreenshotChecker", ArrayUtils.asListArgs("onChange","onChecker"));
        ignoreUnPublicMap.put("ShellUtils", ArrayUtils.asListArgs("consumeInputStream"));
        ignoreUnPublicMap.put("ShortCutUtils", ArrayUtils.asListArgs("getAuthority","getAuthorityFromPermission","getAuthorityFromPermission"));
        ignoreUnPublicMap.put("SignaturesUtils", ArrayUtils.asListArgs("loadCertificates"));
        ignoreUnPublicMap.put("SizeUtils.onGetSizeListener", ArrayUtils.asListArgs("onGetSize"));
        ignoreUnPublicMap.put("SnackbarUtils", ArrayUtils.asListArgs("priShow","clearLocations","setSnackbarLocation","setLayoutGravity","setMargin"));
        ignoreUnPublicMap.put("SpanUtils", ArrayUtils.asListArgs("apply","applyLast","updateCharCharSequence","updateImage","updateSpace","setDefault","getContext"));
        ignoreUnPublicMap.put("SpanUtils.CustomDynamicDrawableSpan", ArrayUtils.asListArgs("getCachedDrawable"));
        ignoreUnPublicMap.put("SpanUtils.CustomTypefaceSpan", ArrayUtils.asListArgs("apply"));
        ignoreUnPublicMap.put("TimeKeeper.OnEndCallback", ArrayUtils.asListArgs("onEnd"));
        ignoreUnPublicMap.put("TimerManager.TimerTask", ArrayUtils.asListArgs("start","close"));
        ignoreUnPublicMap.put("ToastFactory", ArrayUtils.asListArgs("getWindowManager"));
        ignoreUnPublicMap.put("ToastFactory.BaseToast", ArrayUtils.asListArgs("findTextView"));
        ignoreUnPublicMap.put("ToastFactory.ToastHelper", ArrayUtils.asListArgs("show","cancel"));
        ignoreUnPublicMap.put("ToastTintUtils", ArrayUtils.asListArgs("showToastView","newToastView","inflaterView","reflectToastHandler"));
        ignoreUnPublicMap.put("ToastTintUtils.Filter", ArrayUtils.asListArgs("filter","handlerContent"));
        ignoreUnPublicMap.put("ToastTintUtils.Style", ArrayUtils.asListArgs("getTextColor","getTextSize","getBackgroundTintColor","getBackground","getMaxLines","getEllipsize","getTypeface","getTintIconColor","isTintIcon"));
        ignoreUnPublicMap.put("ToastUtils", ArrayUtils.asListArgs("priShowToastText","handlerToastRes","handlerToastStr","reflectToastHandler"));
        ignoreUnPublicMap.put("ToastUtils.Filter", ArrayUtils.asListArgs("filter","handlerContent"));
        ignoreUnPublicMap.put("UriUtils", ArrayUtils.asListArgs("getFilePathByUri"));
        ignoreUnPublicMap.put("WifiHotUtils", ArrayUtils.asListArgs("intToString"));
        ignoreUnPublicMap.put("WifiHotUtils.OnWifiAPListener", ArrayUtils.asListArgs("onStarted","onStopped","onFailed"));
        ignoreUnPublicMap.put("WifiUtils", ArrayUtils.asListArgs("setStaticWifiConfig","setStaticWifiConfig","inetAddressToInt","setDNS","setGateway","setIpAddress","setStaticIpConfig","getField","getDeclaredField","setEnumField","setValueField"));
        ignoreUnPublicMap.put("ZipUtils", ArrayUtils.asListArgs("zipFile","unzipChildFile"));

        return ignoreUnPublicMap;
    }

    /**
     * 获取忽略无修饰符变量处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreModifierVariableMap() {
        Map<String, List<String>> ignoreModifierVariableMap = new HashMap<>();
        ignoreModifierVariableMap.put("Base64", ArrayUtils.asListArgs("        int tailLen;"));
        ignoreModifierVariableMap.put("Base64.Encoder", ArrayUtils.asListArgs("    int tailLen;"));

        return ignoreModifierVariableMap;
    }

    /**
     * 获取忽略指定方法 return void 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreReturnVoidMap() {
        Map<String, List<String>> ignoreReturnVoidMap = new HashMap<>();
        ignoreReturnVoidMap.put("ADBUtils", ArrayUtils.asListArgs("sendEventSlide - void"));
        ignoreReturnVoidMap.put("AccessibilityUtils", ArrayUtils.asListArgs("setService - void","printAccessibilityEvent - void","printAccessibilityEvent - void"));
        ignoreReturnVoidMap.put("ActivityUtils.ResultCallback", ArrayUtils.asListArgs("onActivityResult - void"));
        ignoreReturnVoidMap.put("AnalysisRecordUtils", ArrayUtils.asListArgs("init - void","setCallBack - void","setHandler - void","setAppendSpace - void","setLogFolderName - void","setLogStoragePath - void"));
        ignoreReturnVoidMap.put("AnalysisRecordUtils.CallBack", ArrayUtils.asListArgs("callback - void"));
        ignoreReturnVoidMap.put("AppInfoUtils", ArrayUtils.asListArgs("printAppPermission - void"));
        ignoreReturnVoidMap.put("AutoFocusAssist", ArrayUtils.asListArgs("setFocusModes - void","setAutoFocus - void","onAutoFocus - void","autoFocusAgainLater - void","start - void","stop - void","cancelOutstandingTask - void"));
        ignoreReturnVoidMap.put("BarUtils", ArrayUtils.asListArgs("addMarginTopEqualStatusBarHeight - void","subtractMarginTopEqualStatusBarHeight - void","hideStatusBarView - void","hideStatusBarView - void","showStatusBarView - void"));
        ignoreReturnVoidMap.put("BeepVibrateAssist", ArrayUtils.asListArgs("streamUpdate - void","close - void"));
        ignoreReturnVoidMap.put("BigDecimalUtils", ArrayUtils.asListArgs("setScale - void","setRoundingMode - void"));
        ignoreReturnVoidMap.put("CalendarUtils", ArrayUtils.asListArgs("setFestivalHook - void"));
        ignoreReturnVoidMap.put("CameraAssist", ArrayUtils.asListArgs("closeDriver - void","startPreview - void","stopPreview - void","freeCameraResource - void"));
        ignoreReturnVoidMap.put("CameraAssist.PreviewNotify", ArrayUtils.asListArgs("stopPreviewNotify - void","startPreviewNotify - void"));
        ignoreReturnVoidMap.put("CameraUtils", ArrayUtils.asListArgs("freeCameraResource - void"));
        ignoreReturnVoidMap.put("CapturePictureUtils", ArrayUtils.asListArgs("setBitmapConfig - void","setBackgroundColor - void","setPaint - void","enableSlowWholeDocumentDraw - void"));
        ignoreReturnVoidMap.put("ClickUtils", ArrayUtils.asListArgs("setCheckViewId - void","setGlobalIntervalTime - void","remove - void"));
        ignoreReturnVoidMap.put("ClickUtils.OnCountClickListener", ArrayUtils.asListArgs("doClick - void","doInvalidClick - void"));
        ignoreReturnVoidMap.put("ClickUtils.OnDebouncingClickListener", ArrayUtils.asListArgs("doClick - void","doInvalidClick - void"));
        ignoreReturnVoidMap.put("CloseUtils", ArrayUtils.asListArgs("closeIO - void","closeIOQuietly - void","flush - void","flushQuietly - void","flushCloseIO - void","flushCloseIOQuietly - void","flushCloseIO - void","flushCloseIOQuietly - void"));
        ignoreReturnVoidMap.put("CollectionUtils.ArrayWithTypeToken", ArrayUtils.asListArgs("put - void","newInstance - void","newInstance - void"));
        ignoreReturnVoidMap.put("ColorUtils", ArrayUtils.asListArgs("setParser - void","sortGray - void","sortHSB - void"));
        ignoreReturnVoidMap.put("ColorUtils.ColorInfo", ArrayUtils.asListArgs("priConvert - void"));
        ignoreReturnVoidMap.put("ConvertUtils", ArrayUtils.asListArgs("bytesBitwiseAND - void"));
        ignoreReturnVoidMap.put("CrashUtils", ArrayUtils.asListArgs("init - void","uncaughtException - void"));
        ignoreReturnVoidMap.put("CrashUtils.CrashCatchListener", ArrayUtils.asListArgs("handleException - void","uncaughtException - void"));
        ignoreReturnVoidMap.put("DevCache", ArrayUtils.asListArgs("clear - void"));
        ignoreReturnVoidMap.put("DevCacheManager", ArrayUtils.asListArgs("calculateCacheSizeAndCacheCount - void","put - void","clear - void"));
        ignoreReturnVoidMap.put("DevCommonUtils", ArrayUtils.asListArgs("sleepOperate - void","sleepOperate - void"));
        ignoreReturnVoidMap.put("DevLogger", ArrayUtils.asListArgs("init - void","d - void","e - void","e - void","e - void","w - void","i - void","v - void","wtf - void","json - void","xml - void","dTag - void","eTag - void","eTag - void","eTag - void","wTag - void","iTag - void","vTag - void","wtfTag - void","jsonTag - void","xmlTag - void","setPrint - void"));
        ignoreReturnVoidMap.put("DevLogger.Print", ArrayUtils.asListArgs("printLog - void"));
        ignoreReturnVoidMap.put("DevMediaManager", ArrayUtils.asListArgs("createMedia - void","destroyMedia - void","pause - void","stop - void","onVideoSizeChanged - void","onPrepared - void","onCompletion - void","onBufferingUpdate - void","onSeekComplete - void","clearMediaPlayerData - void"));
        ignoreReturnVoidMap.put("DevMediaManager.MediaListener", ArrayUtils.asListArgs("onPrepared - void","onCompletion - void","onBufferingUpdate - void","onSeekComplete - void","onVideoSizeChanged - void"));
        ignoreReturnVoidMap.put("DevMediaManager.MediaSet", ArrayUtils.asListArgs("setMediaConfig - void"));
        ignoreReturnVoidMap.put("DevThreadManager", ArrayUtils.asListArgs("initConfig - void","putConfig - void","removeConfig - void"));
        ignoreReturnVoidMap.put("DevThreadPool", ArrayUtils.asListArgs("execute - void","execute - void","execute - void","shutdown - void"));
        ignoreReturnVoidMap.put("DevToast", ArrayUtils.asListArgs("reset - void","setIsHandler - void","setNullText - void","setTextLength - void","init - void","initStyle - void","initToastFilter - void","setView - void","show - void","show - void","show - void","show - void","cancel - void"));
        ignoreReturnVoidMap.put("DevVideoPlayerControl", ArrayUtils.asListArgs("resetOperate - void","surfaceChanged - void","surfaceCreated - void","surfaceDestroyed - void","onPrepared - void","onCompletion - void","onBufferingUpdate - void","onSeekComplete - void","onVideoSizeChanged - void","pausePlayer - void","stopPlayer - void","startPlayer - void","startPlayer - void","startPlayer - void"));
        ignoreReturnVoidMap.put("DialogUtils.DialogListener", ArrayUtils.asListArgs("onLeftButton - void","onRightButton - void","onDismiss - void"));
        ignoreReturnVoidMap.put("DialogUtils.MultiChoiceListener", ArrayUtils.asListArgs("onMultiChoiceItems - void","onPositiveButton - void","onCancel - void","onDismiss - void"));
        ignoreReturnVoidMap.put("DialogUtils.SingleChoiceListener", ArrayUtils.asListArgs("onSingleChoiceItems - void","onPositiveButton - void","onCancel - void","onDismiss - void"));
        ignoreReturnVoidMap.put("DialogUtils.ViewDialogListener", ArrayUtils.asListArgs("onPositiveButton - void","onCancel - void","onDismiss - void"));
        ignoreReturnVoidMap.put("EditTextUtils.DevTextWatcher", ArrayUtils.asListArgs("beforeTextChanged - void","onTextChanged - void","afterTextChanged - void"));
        ignoreReturnVoidMap.put("FileBreadthFirstSearchUtils", ArrayUtils.asListArgs("stop - void","query - void","queryFile - void","whileQueue - void"));
        ignoreReturnVoidMap.put("FileBreadthFirstSearchUtils.SearchHandler", ArrayUtils.asListArgs("onEndListener - void"));
        ignoreReturnVoidMap.put("FileDepthFirstSearchUtils", ArrayUtils.asListArgs("stop - void","query - void","queryFile - void"));
        ignoreReturnVoidMap.put("FileDepthFirstSearchUtils.SearchHandler", ArrayUtils.asListArgs("onEndListener - void"));
        ignoreReturnVoidMap.put("FileIOUtils", ArrayUtils.asListArgs("setBufferSize - void"));
        ignoreReturnVoidMap.put("FileRecordUtils", ArrayUtils.asListArgs("setInsertInfo - void","setCallBack - void"));
        ignoreReturnVoidMap.put("FileRecordUtils.CallBack", ArrayUtils.asListArgs("callback - void"));
        ignoreReturnVoidMap.put("HandlerUtils", ArrayUtils.asListArgs("postRunnable - void","postRunnable - void","postRunnable - void","postRunnable - void","removeRunnable - void","clearRunnableMaps - void","postRunnable - void","removeRunnable - void"));
        ignoreReturnVoidMap.put("HandlerUtils.OnEndListener", ArrayUtils.asListArgs("onEnd - void"));
        ignoreReturnVoidMap.put("HttpURLConnectionUtils", ArrayUtils.asListArgs("doGetAsync - void","doPostAsync - void","request - void","getNetTime - void","getNetTime - void","reqNetTime - void"));
        ignoreReturnVoidMap.put("HttpURLConnectionUtils.CallBack", ArrayUtils.asListArgs("onResponse - void","onFail - void"));
        ignoreReturnVoidMap.put("HttpURLConnectionUtils.TimeCallBack", ArrayUtils.asListArgs("onResponse - void","onFail - void"));
        ignoreReturnVoidMap.put("IPreference", ArrayUtils.asListArgs("put - void","putAll - void","putAll - void","putAll - void","remove - void","removeAll - void","removeAll - void","clear - void"));
        ignoreReturnVoidMap.put("IPrinter", ArrayUtils.asListArgs("init - void","d - void","e - void","e - void","e - void","w - void","i - void","v - void","wtf - void","json - void","xml - void","dTag - void","eTag - void","eTag - void","eTag - void","wTag - void","iTag - void","vTag - void","wtfTag - void","jsonTag - void","xmlTag - void"));
        ignoreReturnVoidMap.put("IToast.Operate", ArrayUtils.asListArgs("reset - void","setIsHandler - void","setNullText - void","setTextLength - void","init - void","initStyle - void","initToastFilter - void","setView - void","show - void","show - void","show - void","show - void","cancel - void"));
        ignoreReturnVoidMap.put("IToastImpl", ArrayUtils.asListArgs("reset - void","setIsHandler - void","setNullText - void","setTextLength - void","init - void","initStyle - void","initToastFilter - void","setView - void","show - void","show - void","show - void","show - void","cancel - void","priShowToastText - void","priShowToastView - void"));
        ignoreReturnVoidMap.put("InactivityTimerAssist", ArrayUtils.asListArgs("onPause - void","onResume - void","onDestroy - void","start - void","cancel - void"));
        ignoreReturnVoidMap.put("JCLogUtils", ArrayUtils.asListArgs("setPrintLog - void","setControlPrintLog - void","printLog - void","setPrint - void"));
        ignoreReturnVoidMap.put("JCLogUtils.Print", ArrayUtils.asListArgs("printLog - void"));
        ignoreReturnVoidMap.put("KeyBoardUtils", ArrayUtils.asListArgs("setDelayMillis - void","judgeView - void","fixSoftInputLeaks - void"));
        ignoreReturnVoidMap.put("KeyBoardUtils.OnSoftInputChangedListener", ArrayUtils.asListArgs("onSoftInputChanged - void"));
        ignoreReturnVoidMap.put("LanguageUtils", ArrayUtils.asListArgs("putSupportLanguage - void","removeSupportLanguage - void"));
        ignoreReturnVoidMap.put("LocationUtils.CustomLocationListener", ArrayUtils.asListArgs("onLocationChanged - void","onStatusChanged - void","onProviderEnabled - void","onProviderDisabled - void"));
        ignoreReturnVoidMap.put("LocationUtils.OnLocationChangeListener", ArrayUtils.asListArgs("getLastKnownLocation - void","onLocationChanged - void","onStatusChanged - void"));
        ignoreReturnVoidMap.put("LogPrintUtils", ArrayUtils.asListArgs("setPrintLog - void","printLog - void","setPrint - void"));
        ignoreReturnVoidMap.put("LogPrintUtils.Print", ArrayUtils.asListArgs("printLog - void"));
        ignoreReturnVoidMap.put("LoggerPrinter", ArrayUtils.asListArgs("init - void","d - void","e - void","e - void","e - void","w - void","i - void","v - void","wtf - void","json - void","xml - void","dTag - void","eTag - void","eTag - void","eTag - void","wTag - void","iTag - void","vTag - void","wtfTag - void","jsonTag - void","xmlTag - void","finalLogPrinter - void","logHandle - void","logHandle - void","logHandle - void","logHeaderContent - void","logTopBorder - void","logBottomBorder - void","logDivider - void","logContent - void"));
        ignoreReturnVoidMap.put("PermissionUtils", ArrayUtils.asListArgs("request - void","request - void","onRequestPermissionsResultCommon - void","onRequestPermissionsResult - void","notifyPermissionsChange - void","requestCallback - void","getPermissionsStatus - void"));
        ignoreReturnVoidMap.put("PermissionUtils.PermissionActivity", ArrayUtils.asListArgs("start - void","onCreate - void","onRequestPermissionsResult - void"));
        ignoreReturnVoidMap.put("PermissionUtils.PermissionCallBack", ArrayUtils.asListArgs("onGranted - void","onDenied - void"));
        ignoreReturnVoidMap.put("PreferenceImpl", ArrayUtils.asListArgs("put - void","put - void","putAll - void","putAll - void","putAll - void","remove - void","removeAll - void","removeAll - void","clear - void"));
        ignoreReturnVoidMap.put("ProcessUtils", ArrayUtils.asListArgs("kill - void","kill - void"));
        ignoreReturnVoidMap.put("ReflectUtils", ArrayUtils.asListArgs("sortConstructors - void","sortMethods - void"));
        ignoreReturnVoidMap.put("ScreenSensorAssist", ArrayUtils.asListArgs("init - void"));
        ignoreReturnVoidMap.put("ScreenshotUtils", ArrayUtils.asListArgs("handleMediaContentChange - void"));
        ignoreReturnVoidMap.put("ScreenshotUtils.OnScreenshotListener", ArrayUtils.asListArgs("onScreenshot - void"));
        ignoreReturnVoidMap.put("ScreenshotUtils.ScreenshotChecker", ArrayUtils.asListArgs("onChange - void","onChecker - void"));
        ignoreReturnVoidMap.put("SharedUtils", ArrayUtils.asListArgs("put - void","putAll - void","putAll - void","putAll - void","remove - void","removeAll - void","removeAll - void","clear - void"));
        ignoreReturnVoidMap.put("SizeUtils.onGetSizeListener", ArrayUtils.asListArgs("onGetSize - void"));
        ignoreReturnVoidMap.put("SnackbarUtils", ArrayUtils.asListArgs("dismiss - void","dismiss - void","showShort - void","showLong - void","showIndefinite - void","showShort - void","showLong - void","showIndefinite - void","priShow - void","clearLocations - void","setSnackbarLocation - void"));
        ignoreReturnVoidMap.put("SpanUtils", ArrayUtils.asListArgs("apply - void","applyLast - void","updateCharCharSequence - void","updateImage - void","updateSpace - void","setDefault - void"));
        ignoreReturnVoidMap.put("TimeKeeper", ArrayUtils.asListArgs("waitForEndAsync - void","waitForEnd - void"));
        ignoreReturnVoidMap.put("TimeKeeper.OnEndCallback", ArrayUtils.asListArgs("onEnd - void"));
        ignoreReturnVoidMap.put("TimerManager.TimerTask", ArrayUtils.asListArgs("start - void","close - void"));
        ignoreReturnVoidMap.put("ToastFactory.ToastHelper", ArrayUtils.asListArgs("show - void","cancel - void"));
        ignoreReturnVoidMap.put("ToastTintUtils", ArrayUtils.asListArgs("reset - void","setToastFilter - void","setIsHandler - void","setNullText - void","setUseConfig - void","setGravity - void","setMargin - void","setNormalStyle - void","setInfoStyle - void","setWarningStyle - void","setErrorStyle - void","setSuccessStyle - void","normal - void","normal - void","normal - void","normal - void","normal - void","normal - void","normal - void","normal - void","info - void","info - void","info - void","info - void","info - void","info - void","info - void","info - void","warning - void","warning - void","warning - void","warning - void","warning - void","warning - void","warning - void","warning - void","error - void","error - void","error - void","error - void","error - void","error - void","error - void","error - void","success - void","success - void","success - void","success - void","success - void","success - void","success - void","success - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","showToastView - void","reflectToastHandler - void"));
        ignoreReturnVoidMap.put("ToastUtils", ArrayUtils.asListArgs("reset - void","setToastFilter - void","setIsHandler - void","setNullText - void","setUseConfig - void","setGravity - void","setMargin - void","showShort - void","showShort - void","showShort - void","showShort - void","showLong - void","showLong - void","showLong - void","showLong - void","showToast - void","showToast - void","showToast - void","showToast - void","showShortNew - void","showShortNew - void","showShortNew - void","showShortNew - void","showLongNew - void","showLongNew - void","showLongNew - void","showLongNew - void","showToastNew - void","showToastNew - void","showToastNew - void","showToastNew - void","priShowToastText - void","showToastView - void","showToastView - void","showToastView - void","showToastView - void","showToastView - void","handlerToastRes - void","handlerToastStr - void","reflectToastHandler - void"));
        ignoreReturnVoidMap.put("WifiHotUtils.OnWifiAPListener", ArrayUtils.asListArgs("onStarted - void","onStopped - void","onFailed - void"));
        ignoreReturnVoidMap.put("WifiUtils", ArrayUtils.asListArgs("setDNS - void","setGateway - void","setIpAddress - void","setStaticIpConfig - void","setEnumField - void","setValueField - void"));

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