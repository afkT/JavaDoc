package javadoc.dev_utils.check.dev_app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dev.utils.common.ArrayUtils;
import javadoc.dev_utils.check.dev.ICheckConfig;

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
        ignoreAnnotateMap.put("AbstractActivityLifecycle", ArrayUtils.asListArgs("onActivityCreated","onActivityStarted","onActivityResumed","onActivityPaused","onActivityStopped","onActivitySaveInstanceState","onActivityDestroyed"));
        ignoreAnnotateMap.put("ActivityLifecycleAssist.ActivityLifecycleImpl", ArrayUtils.asListArgs("onActivityCreated","onActivityStarted","onActivityResumed","onActivityPaused","onActivityStopped","onActivitySaveInstanceState","onActivityDestroyed"));
        ignoreAnnotateMap.put("ActivityUtils.ResultActivity", ArrayUtils.asListArgs("onCreate","onActivityResult","onDestroy"));
        ignoreAnnotateMap.put("AppRecordInsert", ArrayUtils.asListArgs("setFileInfo","getFileInfo","createFileInfo"));
        ignoreAnnotateMap.put("AutoFocusAssist.AutoFocusTask", ArrayUtils.asListArgs("doInBackground"));
        ignoreAnnotateMap.put("Base64.Coder", ArrayUtils.asListArgs("maxOutputSize"));
        ignoreAnnotateMap.put("Base64.Decoder", ArrayUtils.asListArgs("maxOutputSize"));
        ignoreAnnotateMap.put("Base64.Encoder", ArrayUtils.asListArgs("maxOutputSize","process"));
        ignoreAnnotateMap.put("CalendarUtils", ArrayUtils.asListArgs("getBitInt","solarToInt","solarFromInt"));
        ignoreAnnotateMap.put("CalendarUtils.Festival", ArrayUtils.asListArgs("compareTo","toString"));
        ignoreAnnotateMap.put("ClickUtils.OnCountClickListener", ArrayUtils.asListArgs("onClick"));
        ignoreAnnotateMap.put("ClickUtils.OnDebouncingClickListener", ArrayUtils.asListArgs("onClick"));
        ignoreAnnotateMap.put("ClickUtils.OnMultiClickListener", ArrayUtils.asListArgs("doClick","doInvalidClick"));
        ignoreAnnotateMap.put("ColorUtils.ColorInfo", ArrayUtils.asListArgs("toString"));
        ignoreAnnotateMap.put("ColorUtils.ColorInfo.ColorParser", ArrayUtils.asListArgs("handleColor"));
        ignoreAnnotateMap.put("ContentResolverUtils.MediaQueryInfo", ArrayUtils.asListArgs("getResult","getProjection","getSelection","getSelectionArgs"));
        ignoreAnnotateMap.put("ContentResolverUtils.MediaQueryInfoUri", ArrayUtils.asListArgs("getSelection","getSelectionArgs"));
        ignoreAnnotateMap.put("ContentResolverUtils.MediaQueryUri", ArrayUtils.asListArgs("getResult","getProjection","getSelection","getSelectionArgs"));
        ignoreAnnotateMap.put("DateSort", ArrayUtils.asListArgs("getDateSortValue"));
        ignoreAnnotateMap.put("DateSortAsc", ArrayUtils.asListArgs("compare"));
        ignoreAnnotateMap.put("DateSortDesc", ArrayUtils.asListArgs("compare"));
        ignoreAnnotateMap.put("DevCache.Data", ArrayUtils.asListArgs("setType","setSaveTime","setValidTime","isInt","isLong","isFloat","isDouble","isBoolean","isString","isBytes","isBitmap","isDrawable","isSerializable","isParcelable","isJSONObject","isJSONArray"));
        ignoreAnnotateMap.put("DevCacheManager", ArrayUtils.asListArgs("getCachePath","remove","removeForKeys","contains","isDue","clear","clearDue","clearType","getItemByKey","getKeys","getPermanentKeys","getCount","getSize","put","put","put","put","put","put","put","put","put","put","put","put","getInt","getLong","getFloat","getDouble","getBoolean","getString","getBytes","getBitmap","getDrawable","getSerializable","getParcelable","getJSONObject","getJSONArray","getInt","getLong","getFloat","getDouble","getBoolean","getString","getBytes","getBitmap","getDrawable","getSerializable","getParcelable","getJSONObject","getJSONArray","_mapGetData"));
        ignoreAnnotateMap.put("DevFloatingEdgeIMPL", ArrayUtils.asListArgs("calculateEdge"));
        ignoreAnnotateMap.put("DevFloatingTouchIMPL", ArrayUtils.asListArgs("onTouchEvent"));
        ignoreAnnotateMap.put("DevFloatingTouchIMPL2", ArrayUtils.asListArgs("onTouchEvent","updateViewLayout"));
        ignoreAnnotateMap.put("DevTimer.Builder", ArrayUtils.asListArgs("getTag","setTag","getDelay","setDelay","getPeriod","setPeriod","getLimit","setLimit","build"));
        ignoreAnnotateMap.put("DoubleSort", ArrayUtils.asListArgs("getDoubleSortValue"));
        ignoreAnnotateMap.put("DoubleSortAsc", ArrayUtils.asListArgs("compare"));
        ignoreAnnotateMap.put("DoubleSortDesc", ArrayUtils.asListArgs("compare"));
        ignoreAnnotateMap.put("FileLastModifiedSortAsc", ArrayUtils.asListArgs("compare"));
        ignoreAnnotateMap.put("FileLastModifiedSortDesc", ArrayUtils.asListArgs("compare"));
        ignoreAnnotateMap.put("FileLengthSortAsc", ArrayUtils.asListArgs("compare"));
        ignoreAnnotateMap.put("FileLengthSortDesc", ArrayUtils.asListArgs("compare"));
        ignoreAnnotateMap.put("FileNameSortAsc", ArrayUtils.asListArgs("compare"));
        ignoreAnnotateMap.put("FileNameSortDesc", ArrayUtils.asListArgs("compare"));
        ignoreAnnotateMap.put("FileSortAsc", ArrayUtils.asListArgs("compare"));
        ignoreAnnotateMap.put("FileSortDesc", ArrayUtils.asListArgs("compare"));
        ignoreAnnotateMap.put("FloatSort", ArrayUtils.asListArgs("getFloatSortValue"));
        ignoreAnnotateMap.put("FloatSortAsc", ArrayUtils.asListArgs("compare"));
        ignoreAnnotateMap.put("FloatSortDesc", ArrayUtils.asListArgs("compare"));
        ignoreAnnotateMap.put("FloatingWindowManagerAssist.DevAssistIMPL", ArrayUtils.asListArgs("getWindowManager","getLayoutParams"));
        ignoreAnnotateMap.put("InactivityTimerAssist.InactivityAsyncTask", ArrayUtils.asListArgs("doInBackground"));
        ignoreAnnotateMap.put("InactivityTimerAssist.PowerStateReceiver", ArrayUtils.asListArgs("onReceive"));
        ignoreAnnotateMap.put("IntSort", ArrayUtils.asListArgs("getIntSortValue"));
        ignoreAnnotateMap.put("IntSortAsc", ArrayUtils.asListArgs("compare"));
        ignoreAnnotateMap.put("IntSortDesc", ArrayUtils.asListArgs("compare"));
        ignoreAnnotateMap.put("JCLogUtils", ArrayUtils.asListArgs("d","e","e","e","i","xml","dTag","eTag","eTag","eTag","iTag","xmlTag"));
        ignoreAnnotateMap.put("KeyValue", ArrayUtils.asListArgs("toString"));
        ignoreAnnotateMap.put("LogPrintUtils", ArrayUtils.asListArgs("d","e","e","e","w","i","v","wtf","json","xml","dTag","eTag","eTag","eTag","wTag","iTag","vTag","wtfTag","jsonTag","xmlTag"));
        ignoreAnnotateMap.put("LongSort", ArrayUtils.asListArgs("getLongSortValue"));
        ignoreAnnotateMap.put("LongSortAsc", ArrayUtils.asListArgs("compare"));
        ignoreAnnotateMap.put("LongSortDesc", ArrayUtils.asListArgs("compare"));
        ignoreAnnotateMap.put("NotificationUtils.Callback", ArrayUtils.asListArgs("callback"));
        ignoreAnnotateMap.put("NotificationUtils.Params", ArrayUtils.asListArgs("getPendingIntent","setPendingIntent","getIcon","setIcon","getTicker","setTicker","getTitle","setTitle","getContent","setContent","isAutoCancel","setAutoCancel","getVibratePattern","setVibratePattern","getLightPattern","setLightPattern","getChannel","setChannel"));
        ignoreAnnotateMap.put("PreferenceImpl.ComparatorImpl", ArrayUtils.asListArgs("compare"));
        ignoreAnnotateMap.put("ROMUtils.RomInfo", ArrayUtils.asListArgs("toString"));
        ignoreAnnotateMap.put("RecordInsert", ArrayUtils.asListArgs("getFileInfo","setFileInfo","getLogHeader","setLogHeader","getLogTail","setLogTail"));
        ignoreAnnotateMap.put("RecyclerViewUtils.FixChildScrollBugLinearLayoutManager", ArrayUtils.asListArgs("requestChildRectangleOnScreen","requestChildRectangleOnScreen"));
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
        ignoreAnnotateMap.put("StringSort", ArrayUtils.asListArgs("getStringSortValue"));
        ignoreAnnotateMap.put("StringSortAsc", ArrayUtils.asListArgs("compare"));
        ignoreAnnotateMap.put("StringSortDesc", ArrayUtils.asListArgs("compare"));
        ignoreAnnotateMap.put("StringSortWindowsSimple", ArrayUtils.asListArgs("compare"));
        ignoreAnnotateMap.put("StringSortWindowsSimple2", ArrayUtils.asListArgs("compare"));
        ignoreAnnotateMap.put("ToastFactory.BaseToast", ArrayUtils.asListArgs("setView","setText"));
        ignoreAnnotateMap.put("ToastFactory.NotificationToast", ArrayUtils.asListArgs("show","cancel"));
        ignoreAnnotateMap.put("ToastFactory.SafeToast.SafeHandler", ArrayUtils.asListArgs("handleMessage","dispatchMessage"));
        ignoreAnnotateMap.put("ToastFactory.ToastHelper", ArrayUtils.asListArgs("handleMessage"));
        ignoreAnnotateMap.put("ToastTintUtils.SafeHandler", ArrayUtils.asListArgs("handleMessage","dispatchMessage"));
        ignoreAnnotateMap.put("ToastUtils.SafeHandler", ArrayUtils.asListArgs("handleMessage","dispatchMessage"));
        ignoreAnnotateMap.put("TypeUtils.ParameterizedTypeImpl", ArrayUtils.asListArgs("getActualTypeArguments","getOwnerType","getRawType","equals","hashCode"));
        ignoreAnnotateMap.put("WifiVo", ArrayUtils.asListArgs("describeContents","writeToParcel"));
        ignoreAnnotateMap.put("WindowsExplorerFileSimpleComparator", ArrayUtils.asListArgs("compare"));
        ignoreAnnotateMap.put("WindowsExplorerFileSimpleComparator2", ArrayUtils.asListArgs("compare"));
        ignoreAnnotateMap.put("WindowsExplorerStringSimpleComparator", ArrayUtils.asListArgs("compare","innerCompare","getSplitFileName"));
        ignoreAnnotateMap.put("WindowsExplorerStringSimpleComparator2", ArrayUtils.asListArgs("compare","innerCompare","splitStringPreserveDelimiter"));

        return ignoreAnnotateMap;
    }

    /**
     * 获取忽略指定方法参数 final 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreFinalMap() {
        Map<String, List<String>> ignoreFinalMap = new HashMap<>();
        ignoreFinalMap.put("ActivityLifecycleAssist.ActivityLifecycleImpl", ArrayUtils.asListArgs("onActivityCreated","onActivityStarted","onActivityResumed","onActivityPaused","onActivityStopped","onActivitySaveInstanceState","onActivityDestroyed"));
        ignoreFinalMap.put("ActivityUtils.ResultActivity", ArrayUtils.asListArgs("onCreate","onActivityResult"));
        ignoreFinalMap.put("AppRecordInsert", ArrayUtils.asListArgs("setFileInfo"));
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
        ignoreFinalMap.put("CrashUtils", ArrayUtils.asListArgs("uncaughtException"));
        ignoreFinalMap.put("DateSortAsc", ArrayUtils.asListArgs("compare"));
        ignoreFinalMap.put("DateSortDesc", ArrayUtils.asListArgs("compare"));
        ignoreFinalMap.put("DevCache", ArrayUtils.asListArgs("remove","removeForKeys","contains","isDue","clearType","getItemByKey","put","put","put","put","put","put","put","put","put","put","put","put","getInt","getLong","getFloat","getDouble","getBoolean","getString","getBytes","getBitmap","getDrawable","getSerializable","getParcelable","getJSONObject","getJSONArray","getInt","getLong","getFloat","getDouble","getBoolean","getString","getBytes","getBitmap","getDrawable","getSerializable","getParcelable","getJSONObject","getJSONArray"));
        ignoreFinalMap.put("DevCache.Data", ArrayUtils.asListArgs("setType","setSaveTime","setValidTime"));
        ignoreFinalMap.put("DevCacheManager", ArrayUtils.asListArgs("remove","removeForKeys","contains","isDue","clearType","getItemByKey","put","put","put","put","put","put","put","put","put","put","put","put","getInt","getLong","getFloat","getDouble","getBoolean","getString","getBytes","getBitmap","getDrawable","getSerializable","getParcelable","getJSONObject","getJSONArray","getInt","getLong","getFloat","getDouble","getBoolean","getString","getBytes","getBitmap","getDrawable","getSerializable","getParcelable","getJSONObject","getJSONArray","_put","_get"));
        ignoreFinalMap.put("DevFloatingEdgeIMPL", ArrayUtils.asListArgs("calculateEdge"));
        ignoreFinalMap.put("DevFloatingTouchIMPL2", ArrayUtils.asListArgs("onTouchEvent","updateViewLayout"));
        ignoreFinalMap.put("DevHelper", ArrayUtils.asListArgs("quickHelper","postRunnable","postRunnable","postRunnable","postRunnable","removeRunnable","setAnimationRepeat","setAnimationListener","startAnimation","cancelAnimation","recycle","startTimer","stopTimer","closeAllTagTimer","closeAllUUIDTimer","addTouchArea","addTouchArea","setOnClick","setOnLongClick","setOnTouch","copyText","copyUri","copyIntent","setDialogStatusBarColor","setDialogSemiTransparentStatusBarColor","setDialogStatusBarColorAndFlag","setDialogAttributes","setDialogWidth","setDialogHeight","setDialogWidthHeight","setDialogX","setDialogY","setDialogXY","setDialogGravity","setDialogDimAmount","setDialogCancelable","setDialogCanceledOnTouchOutside","setDialogCancelableAndTouchOutside","showDialog","closeDialogs","closeDialogs","closePopupWindows","autoCloseDialog","autoCloseDialog","autoClosePopupWindow","setSoftInputMode","setSoftInputMode","setSoftInputMode","setSoftInputMode","judgeView","registerSoftInputChangedListener","registerSoftInputChangedListener2","fixSoftInputLeaks","openKeyboardDelay","openKeyboard","openKeyboardDelay","openKeyboardDelay","openKeyboardByFocus","closeKeyboard","closeKeyboard","closeKeyboard","closeKeyBoardSpecial","closeKeyBoardSpecialDelay","closeKeyBoardSpecialDelay","closeKeyboardDelay","closeKeyboardDelay","closeKeyboardDelay","closeKeyboardDelay","closeKeyboardDelay","closeKeyboardDelay","closeKeyboardDelay","applyLanguage","applyLanguage","cancelNotification","cancelNotification","notifyNotification","notifyNotification","createNotificationChannel","dial","call","sendSms","sendSmsSilent","setBright","setBright","setWindowSecure","setFullScreen","setFullScreenNoTitle","setLandscape","setPortrait","toggleScreenOrientation","setSleepDuration","forceGetViewSize","vibrate","vibrate","getWidthHeightExact","getWidthHeightExact2","measureView","measureView","closeIO","closeIOQuietly","flush","flushQuietly","flushCloseIO","flushCloseIOQuietly","flushCloseIO","flushCloseIOQuietly","setSystemUiVisibility","setSystemUiVisibilityByAdd","setSystemUiVisibilityByClear","setAttributes","refreshSelfAttributes","clearFlags","addFlags","setFlags","requestFeature","setSoftInputMode","setStatusBarColor","setNavigationBarColor","setNavigationBarDividerColor","setWidthByParams","setHeightByParams","setWidthHeightByParams","setXByParams","setYByParams","setXYByParams","setGravityByParams","setDimAmountByParams","setWindowBrightness","setKeyBoardSoftInputMode","setFlagKeepScreenOn","clearFlagKeepScreenOn","setFlagSecure","clearFlagSecure","setFlagFullScreen","clearFlagFullScreen","setFlagTranslucentStatus","clearFlagTranslucentStatus","setFlagDrawsSystemBarBackgrounds","clearFlagDrawsSystemBarBackgrounds","setFeatureNoTitle","setFlagFullScreenAndNoTitle","setSemiTransparentStatusBarColor","setStatusBarColorAndFlag"));
        ignoreFinalMap.put("DevMediaManager", ArrayUtils.asListArgs("onError","onVideoSizeChanged","onPrepared","onCompletion","onBufferingUpdate","onSeekComplete"));
        ignoreFinalMap.put("DevVideoPlayerControl", ArrayUtils.asListArgs("surfaceChanged","surfaceCreated","surfaceDestroyed","onBufferingUpdate","onError","onVideoSizeChanged"));
        ignoreFinalMap.put("DoubleSortAsc", ArrayUtils.asListArgs("compare"));
        ignoreFinalMap.put("DoubleSortDesc", ArrayUtils.asListArgs("compare"));
        ignoreFinalMap.put("FileLastModifiedSortAsc", ArrayUtils.asListArgs("compare"));
        ignoreFinalMap.put("FileLastModifiedSortDesc", ArrayUtils.asListArgs("compare"));
        ignoreFinalMap.put("FileLengthSortAsc", ArrayUtils.asListArgs("compare"));
        ignoreFinalMap.put("FileLengthSortDesc", ArrayUtils.asListArgs("compare"));
        ignoreFinalMap.put("FileNameSortAsc", ArrayUtils.asListArgs("compare"));
        ignoreFinalMap.put("FileNameSortDesc", ArrayUtils.asListArgs("compare"));
        ignoreFinalMap.put("FileSortAsc", ArrayUtils.asListArgs("compare"));
        ignoreFinalMap.put("FileSortDesc", ArrayUtils.asListArgs("compare"));
        ignoreFinalMap.put("FloatSortAsc", ArrayUtils.asListArgs("compare"));
        ignoreFinalMap.put("FloatSortDesc", ArrayUtils.asListArgs("compare"));
        ignoreFinalMap.put("FloatingWindowManagerAssist2", ArrayUtils.asListArgs("updateViewLayout"));
        ignoreFinalMap.put("IToastImpl", ArrayUtils.asListArgs("filter","handlerContent"));
        ignoreFinalMap.put("InactivityTimerAssist.InactivityAsyncTask", ArrayUtils.asListArgs("doInBackground"));
        ignoreFinalMap.put("InactivityTimerAssist.PowerStateReceiver", ArrayUtils.asListArgs("onReceive"));
        ignoreFinalMap.put("IntSortAsc", ArrayUtils.asListArgs("compare"));
        ignoreFinalMap.put("IntSortDesc", ArrayUtils.asListArgs("compare"));
        ignoreFinalMap.put("LocationUtils.CustomLocationListener", ArrayUtils.asListArgs("onLocationChanged","onStatusChanged","onProviderEnabled","onProviderDisabled"));
        ignoreFinalMap.put("LogConfig", ArrayUtils.asListArgs("methodCount","methodOffset","outputMethodAll","displayThreadInfo","sortLog","logLevel","tag"));
        ignoreFinalMap.put("LoggerPrinter", ArrayUtils.asListArgs("logHeaderContent"));
        ignoreFinalMap.put("LongSortAsc", ArrayUtils.asListArgs("compare"));
        ignoreFinalMap.put("LongSortDesc", ArrayUtils.asListArgs("compare"));
        ignoreFinalMap.put("NetWorkUtils", ArrayUtils.asListArgs("isAvailableByPing"));
        ignoreFinalMap.put("PermissionUtils.PermissionActivity", ArrayUtils.asListArgs("onCreate","onRequestPermissionsResult"));
        ignoreFinalMap.put("PreferenceImpl.ComparatorImpl", ArrayUtils.asListArgs("compare"));
        ignoreFinalMap.put("QuickHelper", ArrayUtils.asListArgs("quickHelper","postRunnable","postRunnable","postRunnable","postRunnable","removeRunnable","addTouchArea","addTouchArea","setOnClick","setOnLongClick","setOnTouch","setId","setClipChildren","addView","addView","addView","addView","addView","setLayoutParams","setWidthHeight","setWidthHeight","setWeight","setWidth","setWidth","setHeight","setHeight","setMinimumWidth","setMinimumHeight","setAlpha","setTag","setScrollX","setScrollY","setDescendantFocusability","setOverScrollMode","setHorizontalScrollBarEnabled","setVerticalScrollBarEnabled","setScrollContainer","setNextFocusForwardId","setNextFocusDownId","setNextFocusLeftId","setNextFocusRightId","setNextFocusUpId","setRotation","setRotationX","setRotationY","setScaleX","setScaleY","setTextAlignment","setTextDirection","setPivotX","setPivotY","setTranslationX","setTranslationY","setX","setY","setLayerType","setFocusableInTouchMode","setFocusable","setSelected","setEnabled","setClickable","setLongClickable","setVisibilitys","setVisibilitys","setVisibilityINs","toggleVisibilitys","toggleVisibilitys","reverseVisibilitys","reverseVisibilitys","toggleViews","requestLayoutParent","measureView","measureView","setLayoutGravity","setLayoutGravity","setMarginLeft","setMarginLeft","setMarginTop","setMarginTop","setMarginRight","setMarginRight","setMarginBottom","setMarginBottom","setMargin","setMargin","setMargin","setPaddingLeft","setPaddingLeft","setPaddingTop","setPaddingTop","setPaddingRight","setPaddingRight","setPaddingBottom","setPaddingBottom","setPadding","setPadding","setPadding","addRules","addRules","removeRules","setAnimation","startAnimation","setBackground","setBackgroundColor","setBackgroundResource","setBackgroundTintList","setBackgroundTintMode","setForeground","setForegroundGravity","setForegroundTintList","setForegroundTintMode","setColorFilter","setColorFilter","setColorFilter","setColorFilter","setProgressDrawable","setBarProgress","setBarMax","setBarValue","smoothScrollToPosition","scrollToPosition","smoothScrollTo","smoothScrollBy","fullScroll","scrollTo","scrollBy","setAdjustViewBounds","setMaxHeight","setMaxWidth","setImageLevel","setImageBitmap","setImageDrawable","setImageResource","setImageMatrix","setImageTintList","setImageTintMode","setScaleType","setBackgroundResources","setBackgroundResources","setImageResources","setImageResources","setImageBitmaps","setImageBitmaps","setImageDrawables","setImageDrawables","setScaleTypes","setScaleTypes","setText","setMaxLength","setMaxLengthAndText","setInputType","setImeOptions","setTransformationMethod","setText","insert","insert","setCursorVisible","setTextCursorDrawable","setTextCursorDrawable","setSelection","setTransformationMethod","addTextChangedListener","removeTextChangedListener","setKeyListener","setHint","setHintTextColors","setHintTextColors","setTextColors","setTextColors","setHtmlTexts","setTypeface","setTypeface","setTextSizeByPx","setTextSizeBySp","setTextSizeByDp","setTextSizeByIn","setTextSize","setPaintFlags","setBold","setBold","setUnderlineText","setStrikeThruText","setLetterSpacing","setLineSpacing","setLineSpacingAndMultiplier","setTextScaleX","setIncludeFontPadding","setLines","setMaxLines","setMinLines","setMaxEms","setMinEms","setEms","setEllipsize","setAutoLinkMask","setAllCaps","setGravity","setCompoundDrawablePadding","setCompoundDrawablesByLeft","setCompoundDrawablesByTop","setCompoundDrawablesByRight","setCompoundDrawablesByBottom","setCompoundDrawables","setCompoundDrawablesWithIntrinsicBoundsByLeft","setCompoundDrawablesWithIntrinsicBoundsByTop","setCompoundDrawablesWithIntrinsicBoundsByRight","setCompoundDrawablesWithIntrinsicBoundsByBottom","setCompoundDrawablesWithIntrinsicBounds","setLayoutManager","setOrientation","setAdapter","notifyItemRemoved","notifyItemInserted","notifyItemMoved","addItemDecoration","addItemDecoration","removeItemDecoration","removeItemDecorationAt","setOnScrollListener","addOnScrollListener","removeOnScrollListener","setNestedScrollingEnabled","forceGetViewSize"));
        ignoreFinalMap.put("RecyclerViewUtils.FixChildScrollBugLinearLayoutManager", ArrayUtils.asListArgs("requestChildRectangleOnScreen","requestChildRectangleOnScreen"));
        ignoreFinalMap.put("ScaleUtils.XY", ArrayUtils.asListArgs("getXY","compareTo"));
        ignoreFinalMap.put("ScreenSensorAssist.OrientationSensorChangeListener", ArrayUtils.asListArgs("onAccuracyChanged","onSensorChanged"));
        ignoreFinalMap.put("ScreenSensorAssist.OrientationSensorListener", ArrayUtils.asListArgs("onAccuracyChanged","onSensorChanged"));
        ignoreFinalMap.put("ScreenshotUtils.MediaContentObserver", ArrayUtils.asListArgs("onChange"));
        ignoreFinalMap.put("SnackbarUtils.StyleBuilder", ArrayUtils.asListArgs("setRootGravity","setRootCornerRadius","setRootBackgroundTintColor","setRootBackground","setRootMargin","setRootAlpha","setTextGravity","setTextColor","setTextSize","setTextMaxLines","setTextEllipsize","setTextTypeface","setTextPadding","setActionGravity","setActionColor","setActionSize","setActionPadding","setActionCornerRadius","setActionBackgroundTintColor","setActionBackground"));
        ignoreFinalMap.put("SpanUtils.VerticalAlignSpan", ArrayUtils.asListArgs("getSize","draw"));
        ignoreFinalMap.put("StringSortAsc", ArrayUtils.asListArgs("compare"));
        ignoreFinalMap.put("StringSortDesc", ArrayUtils.asListArgs("compare"));
        ignoreFinalMap.put("StringSortWindowsSimple", ArrayUtils.asListArgs("compare"));
        ignoreFinalMap.put("StringSortWindowsSimple2", ArrayUtils.asListArgs("compare"));
        ignoreFinalMap.put("ToastFactory.BaseToast", ArrayUtils.asListArgs("setView","setText"));
        ignoreFinalMap.put("ToastFactory.SafeToast.SafeHandler", ArrayUtils.asListArgs("handleMessage","dispatchMessage"));
        ignoreFinalMap.put("ToastFactory.ToastHelper", ArrayUtils.asListArgs("handleMessage"));
        ignoreFinalMap.put("ToastTintUtils", ArrayUtils.asListArgs("newToastView","inflaterView"));
        ignoreFinalMap.put("ToastTintUtils.SafeHandler", ArrayUtils.asListArgs("handleMessage","dispatchMessage"));
        ignoreFinalMap.put("ToastUtils", ArrayUtils.asListArgs("newToastText","newToastView","handlerToastRes","handlerToastStr"));
        ignoreFinalMap.put("ToastUtils.SafeHandler", ArrayUtils.asListArgs("handleMessage","dispatchMessage"));
        ignoreFinalMap.put("TypeUtils.ParameterizedTypeImpl", ArrayUtils.asListArgs("equals"));
        ignoreFinalMap.put("VersionHelper", ArrayUtils.asListArgs("getUriForFile","getUriForPath","getUriForFileToName","getUriForFile","getUriForString","fromFile","fromFile","isUri","isUri","getUriScheme","getUriScheme","isUriExists","isUriExists","copyByUri","copyByUri","copyByUri","copyByUri","getFilePathByUri","getFilePathByUri","getMediaUri","getMediaUri","getMediaUri","getMediaUri","mediaQuery","mediaQuery","mediaQuery","mediaQuery","notifyMediaStore","notifyMediaStore","notifyMediaStore","createImageUri","createImageUri","createImageUri","createImageUri","createVideoUri","createVideoUri","createVideoUri","createVideoUri","createAudioUri","createAudioUri","createAudioUri","createAudioUri","createDownloadUri","createDownloadUri","createDownloadUri","createDownloadUri","createMediaUri","createMediaUri","createUriByPath","createUriByPath","createUriByFile","createUriByFile","insertImage","insertImage","insertImage","insertVideo","insertAudio","insertDownload","insertMedia","insertMedia","insertMedia","insertMedia","insertMedia","insertMedia","insertMedia","insertMedia","insertMedia","insertMedia","createWriteRequest","createFavoriteRequest","createTrashRequest","createDeleteRequest"));
        ignoreFinalMap.put("ViewHelper", ArrayUtils.asListArgs("quickHelper","postRunnable","postRunnable","postRunnable","postRunnable","removeRunnable","addTouchArea","addTouchArea","setOnClick","setOnLongClick","setOnTouch","setId","setClipChildren","removeAllViews","addView","addView","addView","addView","addView","setLayoutParams","setWidthHeight","setWidthHeight","setWeight","setWidth","setWidth","setHeight","setHeight","setMinimumWidth","setMinimumHeight","setAlpha","setTag","setScrollX","setScrollY","setDescendantFocusability","setOverScrollMode","setHorizontalScrollBarEnabled","setVerticalScrollBarEnabled","setScrollContainer","setNextFocusForwardId","setNextFocusDownId","setNextFocusLeftId","setNextFocusRightId","setNextFocusUpId","setRotation","setRotationX","setRotationY","setScaleX","setScaleY","setTextAlignment","setTextDirection","setPivotX","setPivotY","setTranslationX","setTranslationY","setX","setY","setLayerType","requestLayout","requestFocus","clearFocus","setFocusableInTouchMode","setFocusable","toggleFocusable","setSelected","toggleSelected","setEnabled","toggleEnabled","setClickable","toggleClickable","setLongClickable","toggleLongClickable","setVisibilitys","setVisibilitys","setVisibilityINs","toggleVisibilitys","toggleVisibilitys","toggleVisibilitys","reverseVisibilitys","reverseVisibilitys","reverseVisibilitys","reverseVisibilitys","toggleViews","removeSelfFromParent","requestLayoutParent","measureView","measureView","setLayoutGravity","setLayoutGravity","setMarginLeft","setMarginLeft","setMarginTop","setMarginTop","setMarginRight","setMarginRight","setMarginBottom","setMarginBottom","setMargin","setMargin","setMargin","setPaddingLeft","setPaddingLeft","setPaddingTop","setPaddingTop","setPaddingRight","setPaddingRight","setPaddingBottom","setPaddingBottom","setPadding","setPadding","setPadding","addRules","addRules","removeRules","setAnimation","clearAnimation","startAnimation","startAnimation","cancelAnimation","setBackground","setBackgroundColor","setBackgroundResource","setBackgroundTintList","setBackgroundTintMode","setForeground","setForegroundGravity","setForegroundTintList","setForegroundTintMode","setColorFilter","setColorFilter","setColorFilter","setColorFilter","setProgressDrawable","setBarProgress","setBarMax","setBarValue","smoothScrollToPosition","scrollToPosition","smoothScrollToTop","scrollToTop","smoothScrollToBottom","scrollToBottom","smoothScrollTo","smoothScrollBy","fullScroll","scrollTo","scrollBy","setAdjustViewBounds","setMaxHeight","setMaxWidth","setImageLevel","setImageBitmap","setImageDrawable","setImageResource","setImageMatrix","setImageTintList","setImageTintMode","setScaleType","setBackgroundResources","setBackgroundResources","setImageResources","setImageResources","setImageBitmaps","setImageBitmaps","setImageDrawables","setImageDrawables","setScaleTypes","setScaleTypes","setText","setMaxLength","setMaxLengthAndText","setInputType","setImeOptions","setTransformationMethod","setTransformationMethod","setText","insert","insert","setCursorVisible","setTextCursorDrawable","setTextCursorDrawable","setSelectionToTop","setSelectionToBottom","setSelection","setTransformationMethod","addTextChangedListener","removeTextChangedListener","setKeyListener","setKeyListener","setKeyListener","setHint","setHintTextColors","setHintTextColors","setTextColors","setTextColors","setHtmlTexts","setTypeface","setTypeface","setTextSizeByPx","setTextSizeBySp","setTextSizeByDp","setTextSizeByIn","setTextSize","clearFlags","setPaintFlags","setAntiAliasFlag","setBold","setBold","setBold","setUnderlineText","setUnderlineText","setStrikeThruText","setStrikeThruText","setLetterSpacing","setLineSpacing","setLineSpacingAndMultiplier","setTextScaleX","setIncludeFontPadding","setLines","setMaxLines","setMinLines","setMaxEms","setMinEms","setEms","setEllipsize","setAutoLinkMask","setAllCaps","setGravity","setCompoundDrawablePadding","setCompoundDrawablesByLeft","setCompoundDrawablesByTop","setCompoundDrawablesByRight","setCompoundDrawablesByBottom","setCompoundDrawables","setCompoundDrawablesWithIntrinsicBoundsByLeft","setCompoundDrawablesWithIntrinsicBoundsByTop","setCompoundDrawablesWithIntrinsicBoundsByRight","setCompoundDrawablesWithIntrinsicBoundsByBottom","setCompoundDrawablesWithIntrinsicBounds","setLayoutManager","setOrientation","setAdapter","notifyItemRemoved","notifyItemInserted","notifyItemMoved","notifyDataSetChanged","attachLinearSnapHelper","attachPagerSnapHelper","addItemDecoration","addItemDecoration","removeItemDecoration","removeItemDecorationAt","removeAllItemDecoration","setOnScrollListener","addOnScrollListener","removeOnScrollListener","clearOnScrollListeners","setNestedScrollingEnabled","forceGetViewSize"));
        ignoreFinalMap.put("WindowsExplorerFileSimpleComparator", ArrayUtils.asListArgs("compare"));
        ignoreFinalMap.put("WindowsExplorerFileSimpleComparator2", ArrayUtils.asListArgs("compare"));
        ignoreFinalMap.put("WindowsExplorerStringSimpleComparator", ArrayUtils.asListArgs("compare","innerCompare","getSplitFileName"));
        ignoreFinalMap.put("WindowsExplorerStringSimpleComparator2", ArrayUtils.asListArgs("compare","innerCompare","splitStringPreserveDelimiter"));

        return ignoreFinalMap;
    }

    /**
     * 获取忽略指定方法 static 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreStaticMap() {
        Map<String, List<String>> ignoreStaticMap = new HashMap<>();
        ignoreStaticMap.put("ActivityLifecycleAssist", ArrayUtils.asListArgs("getActivityLifecycleGet","getActivityLifecycleNotify","getTopActivity","setActivityLifecycleFilter","setAbstractActivityLifecycle","registerActivityLifecycleCallbacks","unregisterActivityLifecycleCallbacks"));
        ignoreStaticMap.put("ActivityLifecycleAssist.ActivityLifecycleImpl", ArrayUtils.asListArgs("onActivityCreated","onActivityStarted","onActivityResumed","onActivityPaused","onActivityStopped","onActivitySaveInstanceState","onActivityDestroyed","setTopActivity","getTopActivityByReflect","getTopActivity","isTopActivity","isTopActivity","isBackground","getActivityCount","addOnAppStatusChangedListener","removeOnAppStatusChangedListener","removeAllOnAppStatusChangedListener","addOnActivityDestroyedListener","removeOnActivityDestroyedListener","removeAllOnActivityDestroyedListener","postStatus","consumeOnActivityDestroyedListener"));
        ignoreStaticMap.put("ActivityManagerAssist", ArrayUtils.asListArgs("getActivityStacks","addActivity","removeActivity","removeActivity","currentActivity","finishActivity","existActivitys","finishActivity","finishActivity","finishAllActivityToIgnore","finishAllActivityToIgnore","finishAllActivity","exitApplication","restartApplication"));
        ignoreStaticMap.put("ActivityUtils.ResultActivity", ArrayUtils.asListArgs("onCreate","onActivityResult","onDestroy"));
        ignoreStaticMap.put("AliasMethod", ArrayUtils.asListArgs("next"));
        ignoreStaticMap.put("ApkInfoItem", ArrayUtils.asListArgs("getAppInfoBean","getListKeyValues","getAppMD5","getAppSHA1","getAppSHA256","getMinSdkVersion","getTargetSdkVersion","getApkLength","getX509Certificate","getNotBefore","getNotAfter","isEffective","getCertPrincipal","getCertVersion","getCertSigAlgName","getCertSigAlgOID","getCertSerialnumber","getCertDERCode"));
        ignoreStaticMap.put("AppInfoBean", ArrayUtils.asListArgs("getAppPackName","getAppName","getAppIcon","getAppType","getVersionCode","getVersionName","getFirstInstallTime","getLastUpdateTime","getSourceDir","getApkSize"));
        ignoreStaticMap.put("AppInfoItem", ArrayUtils.asListArgs("getAppInfoBean","getListKeyValues","getAppMD5","getAppSHA1","getAppSHA256","getMinSdkVersion","getTargetSdkVersion","getApkLength","getX509Certificate","getNotBefore","getNotAfter","isEffective","getCertPrincipal","getCertVersion","getCertSigAlgName","getCertSigAlgOID","getCertSerialnumber","getCertDERCode"));
        ignoreStaticMap.put("AppRecordInsert", ArrayUtils.asListArgs("setFileInfo","getFileInfo","createFileInfo"));
        ignoreStaticMap.put("AutoFocusAssist", ArrayUtils.asListArgs("isAutoFocus","setAutoFocus","onAutoFocus","autoFocusAgainLater","start","stop","cancelOutstandingTask"));
        ignoreStaticMap.put("AutoFocusAssist.AutoFocusTask", ArrayUtils.asListArgs("doInBackground"));
        ignoreStaticMap.put("Averager", ArrayUtils.asListArgs("add","clear","size","getAverage","print"));
        ignoreStaticMap.put("Base64.Decoder", ArrayUtils.asListArgs("maxOutputSize","process"));
        ignoreStaticMap.put("Base64.Encoder", ArrayUtils.asListArgs("maxOutputSize","process"));
        ignoreStaticMap.put("Base64Cipher", ArrayUtils.asListArgs("decrypt","encrypt"));
        ignoreStaticMap.put("BeepVibrateAssist", ArrayUtils.asListArgs("shouldBeep","streamUpdate","isPlayBeep","isVibrate","setVibrate","setVibrate","setMediaPlayer","playBeepSoundAndVibrate","close"));
        ignoreStaticMap.put("BigDecimalUtils.Config", ArrayUtils.asListArgs("getScale","getRoundingMode"));
        ignoreStaticMap.put("BigDecimalUtils.Operation", ArrayUtils.asListArgs("requireNonNull","throwException","getBigDecimal","setBigDecimal","getConfig","setConfig","setConfig","removeConfig","setScale","setScale","setScaleByConfig","isThrowError","setThrowError","clone","toString","toPlainString","toEngineeringString","intValue","floatValue","longValue","doubleValue","add","subtract","multiply","divide","divide","divide","remainder","round","round","round","compareTo","formatMoney","formatMoney","formatMoney","formatMoney","formatMoney"));
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
        ignoreStaticMap.put("CrashUtils", ArrayUtils.asListArgs("initialize","uncaughtException","handleException"));
        ignoreStaticMap.put("DateSortAsc", ArrayUtils.asListArgs("compare"));
        ignoreStaticMap.put("DateSortDesc", ArrayUtils.asListArgs("compare"));
        ignoreStaticMap.put("DefaultToastStyle", ArrayUtils.asListArgs("getGravity","getXOffset","getYOffset","getHorizontalMargin","getVerticalMargin","getZ","getCornerRadius","getBackgroundTintColor","getBackground","getTextColor","getTextSize","getMaxLines","getEllipsize","getTypeface","getPadding"));
        ignoreStaticMap.put("DelayAssist", ArrayUtils.asListArgs("remove","post","post","setDelayMillis","setCallback"));
        ignoreStaticMap.put("DevCache", ArrayUtils.asListArgs("getCachePath","remove","removeForKeys","contains","isDue","clear","clearDue","clearType","getItemByKey","getKeys","getPermanentKeys","getCount","getSize","put","put","put","put","put","put","put","put","put","put","put","put","getInt","getLong","getFloat","getDouble","getBoolean","getString","getBytes","getBitmap","getDrawable","getSerializable","getParcelable","getJSONObject","getJSONArray","getInt","getLong","getFloat","getDouble","getBoolean","getString","getBytes","getBitmap","getDrawable","getSerializable","getParcelable","getJSONObject","getJSONArray"));
        ignoreStaticMap.put("DevCache.Data", ArrayUtils.asListArgs("getKey","isPermanent","isDue","getSize","getType","getSaveTime","getValidTime","setType","setSaveTime","setValidTime","isInt","isLong","isFloat","isDouble","isBoolean","isString","isBytes","isBitmap","isDrawable","isSerializable","isParcelable","isJSONObject","isJSONArray"));
        ignoreStaticMap.put("DevCacheManager", ArrayUtils.asListArgs("calculateCacheSizeAndCacheCount","getCachePath","remove","removeForKeys","contains","isDue","clear","clearDue","clearType","getItemByKey","getKeys","getPermanentKeys","getCount","getSize","put","put","put","put","put","put","put","put","put","put","put","put","getInt","getLong","getFloat","getDouble","getBoolean","getString","getBytes","getBitmap","getDrawable","getSerializable","getParcelable","getJSONObject","getJSONArray","getInt","getLong","getFloat","getDouble","getBoolean","getString","getBytes","getBitmap","getDrawable","getSerializable","getParcelable","getJSONObject","getJSONArray","_getKeyDataFile","_getKeyConfigFile","_isExistKeyFile","_mapGetData","_toDataString","_getData","_put","_get"));
        ignoreStaticMap.put("DevFloatingEdgeIMPL", ArrayUtils.asListArgs("calculateEdge"));
        ignoreStaticMap.put("DevFloatingTouchIMPL2", ArrayUtils.asListArgs("onTouchEvent","updateViewLayout","getX","setX","getY","setY","getFloatingEdge","setFloatingEdge"));
        ignoreStaticMap.put("DevHelper", ArrayUtils.asListArgs("devHelper","quickHelper","viewHelper","postRunnable","postRunnable","postRunnable","postRunnable","removeRunnable","setAnimationRepeat","setAnimationListener","startAnimation","cancelAnimation","recycle","startTimer","stopTimer","recycleTimer","closeAllTimer","closeAllNotRunningTimer","closeAllInfiniteTimer","closeAllTagTimer","closeAllUUIDTimer","addTouchArea","addTouchArea","setOnClick","setOnLongClick","setOnTouch","copyText","copyUri","copyIntent","setDialogStatusBarColor","setDialogSemiTransparentStatusBarColor","setDialogStatusBarColorAndFlag","setDialogAttributes","setDialogWidth","setDialogHeight","setDialogWidthHeight","setDialogX","setDialogY","setDialogXY","setDialogGravity","setDialogDimAmount","setDialogCancelable","setDialogCanceledOnTouchOutside","setDialogCancelableAndTouchOutside","showDialog","closeDialogs","closeDialogs","closePopupWindows","autoCloseDialog","autoCloseDialog","autoClosePopupWindow","setSoftInputMode","setSoftInputMode","setSoftInputMode","setSoftInputMode","judgeView","registerSoftInputChangedListener","registerSoftInputChangedListener2","fixSoftInputLeaks","toggleKeyboard","openKeyboard","openKeyboardDelay","openKeyboardDelay","openKeyboard","openKeyboardDelay","openKeyboardDelay","openKeyboardByFocus","closeKeyboard","closeKeyboard","closeKeyboard","closeKeyboard","closeKeyBoardSpecial","closeKeyBoardSpecialDelay","closeKeyBoardSpecialDelay","closeKeyboardDelay","closeKeyboardDelay","closeKeyboardDelay","closeKeyboardDelay","closeKeyboardDelay","closeKeyboardDelay","closeKeyboardDelay","closeKeyboardDelay","applyLanguage","applyLanguage","cancelAllNotification","cancelNotification","cancelNotification","notifyNotification","notifyNotification","createNotificationChannel","dial","call","sendSms","sendSmsSilent","setBright","setBright","setWindowSecure","setFullScreen","setFullScreenNoTitle","setLandscape","setPortrait","toggleScreenOrientation","setSleepDuration","forceGetViewSize","vibrate","vibrate","cancelVibrate","getWidthHeightExact","getWidthHeightExact2","measureView","measureView","closeIO","closeIOQuietly","flush","flushQuietly","flushCloseIO","flushCloseIOQuietly","flushCloseIO","flushCloseIOQuietly","setSystemUiVisibility","setSystemUiVisibilityByAdd","setSystemUiVisibilityByClear","setAttributes","refreshSelfAttributes","clearFlags","addFlags","setFlags","requestFeature","setSoftInputMode","setStatusBarColor","setNavigationBarColor","setNavigationBarDividerColor","setWidthByParams","setHeightByParams","setWidthHeightByParams","setXByParams","setYByParams","setXYByParams","setGravityByParams","setDimAmountByParams","setWindowBrightness","setKeyBoardSoftInputMode","setFlagKeepScreenOn","clearFlagKeepScreenOn","setFlagSecure","clearFlagSecure","setFlagFullScreen","clearFlagFullScreen","setFlagTranslucentStatus","clearFlagTranslucentStatus","setFlagDrawsSystemBarBackgrounds","clearFlagDrawsSystemBarBackgrounds","setFeatureNoTitle","setFlagFullScreenAndNoTitle","setSemiTransparentStatusBarColor","setStatusBarColorAndFlag"));
        ignoreStaticMap.put("DevMediaManager", ArrayUtils.asListArgs("createMedia","destroyMedia","bindListener","setAudioStreamType","playPrepareRaw","playPrepareRaw","playPrepareAssets","playPrepareAssets","playPrepare","playPrepare","playPrepare","isPlaying","pause","stop","onError","onVideoSizeChanged","onPrepared","onCompletion","onBufferingUpdate","onSeekComplete","setMediaListener","isNullMediaPlayer","isNotNullMediaPlayer","getMediaPlayer","setMediaPlayer","setTAG","getVolume","setVolume","clearMediaPlayerData","getPlayRawId","getPlayUri","getVideoWidth","getVideoHeight","getCurrentPosition","getDuration","getPlayPercent"));
        ignoreStaticMap.put("DevThreadPool", ArrayUtils.asListArgs("execute","execute","execute","shutdown","shutdownNow","isShutdown","isTerminated","awaitTermination","submit","submit","submit","invokeAll","invokeAll","invokeAny","invokeAny","schedule","schedule","scheduleWithFixedRate","scheduleWithFixedDelay"));
        ignoreStaticMap.put("DevTimer", ArrayUtils.asListArgs("getTag","getUUID","getDelay","getPeriod","isRunning","isMarkSweep","getTriggerNumber","getTriggerLimit","isTriggerEnd","isInfinite","setHandler","setCallback","start","stop","startTimer","cancelTimer"));
        ignoreStaticMap.put("DevTimer.Builder", ArrayUtils.asListArgs("getTag","setTag","getDelay","setDelay","getPeriod","setPeriod","getLimit","setLimit","build"));
        ignoreStaticMap.put("DevVideoPlayerControl", ArrayUtils.asListArgs("resetOperate","surfaceChanged","surfaceCreated","surfaceDestroyed","onPrepared","onCompletion","onBufferingUpdate","onSeekComplete","onError","onVideoSizeChanged","setMediaListener","pausePlayer","stopPlayer","startPlayer","startPlayer","startPlayer","getSurfaceView","isPlaying","isPlaying","isAutoPlay","setAutoPlay","getPlayUri","getVideoWidth","getVideoHeight","getCurrentPosition","getDuration","getPlayPercent"));
        ignoreStaticMap.put("DevicePolicyUtils", ArrayUtils.asListArgs("getDevicePolicyManager","isAdminActive","getActiveIntent","activeAdmin","removeActiveAdmin","startLockPassword","setLockPassword","lockNow","lockByTime","wipeData","resetPassword","setStorageEncryption","setCameraDisabled","getComponentName","setComponentName","isAdminActive","getActiveIntent","activeAdmin","removeActiveAdmin","setLockPassword","lockNow","lockByTime","wipeData","resetPassword","setStorageEncryption","setCameraDisabled"));
        ignoreStaticMap.put("DoubleSortAsc", ArrayUtils.asListArgs("compare"));
        ignoreStaticMap.put("DoubleSortDesc", ArrayUtils.asListArgs("compare"));
        ignoreStaticMap.put("FileBreadthFirstSearchUtils", ArrayUtils.asListArgs("setSearchHandler","getQueueSameTimeNumber","setQueueSameTimeNumber","isRunning","stop","isStop","getStartTime","getEndTime","getDelayTime","setDelayTime","query","queryFile","whileQueue"));
        ignoreStaticMap.put("FileBreadthFirstSearchUtils.FileItem", ArrayUtils.asListArgs("put"));
        ignoreStaticMap.put("FileDepthFirstSearchUtils", ArrayUtils.asListArgs("setSearchHandler","isRunning","stop","isStop","getStartTime","getEndTime","query","queryFile"));
        ignoreStaticMap.put("FileLastModifiedSortAsc", ArrayUtils.asListArgs("compare"));
        ignoreStaticMap.put("FileLastModifiedSortDesc", ArrayUtils.asListArgs("compare"));
        ignoreStaticMap.put("FileLengthSortAsc", ArrayUtils.asListArgs("compare"));
        ignoreStaticMap.put("FileLengthSortDesc", ArrayUtils.asListArgs("compare"));
        ignoreStaticMap.put("FileNameSortAsc", ArrayUtils.asListArgs("compare"));
        ignoreStaticMap.put("FileNameSortDesc", ArrayUtils.asListArgs("compare"));
        ignoreStaticMap.put("FilePartAssist", ArrayUtils.asListArgs("getFile","getFileName","getFilePartItems","getFilePartItem","getPartCount","existsPart","isOnlyOne","getPartName"));
        ignoreStaticMap.put("FilePartItem", ArrayUtils.asListArgs("isFirstItem","isLastItem","existsPart","isOnlyOne","getPartName"));
        ignoreStaticMap.put("FileSortAsc", ArrayUtils.asListArgs("compare"));
        ignoreStaticMap.put("FileSortDesc", ArrayUtils.asListArgs("compare"));
        ignoreStaticMap.put("FileUtils.FileList", ArrayUtils.asListArgs("getFile","getSubFiles"));
        ignoreStaticMap.put("FlagsValue", ArrayUtils.asListArgs("getFlags","setFlags","addFlags","clearFlags","hasFlags","notHasFlags"));
        ignoreStaticMap.put("FlashlightUtils", ArrayUtils.asListArgs("register","unregister","setFlashlightOn","setFlashlightOn","setFlashlightOff","setFlashlightOff","isFlashlightOn","isFlashlightOn"));
        ignoreStaticMap.put("FloatSortAsc", ArrayUtils.asListArgs("compare"));
        ignoreStaticMap.put("FloatSortDesc", ArrayUtils.asListArgs("compare"));
        ignoreStaticMap.put("FloatingWindowManagerAssist", ArrayUtils.asListArgs("getIMPL","getWindowManager","getLayoutParams","addView","addView","removeView","updateViewLayout","updateViewLayout"));
        ignoreStaticMap.put("FloatingWindowManagerAssist.DevAssistIMPL", ArrayUtils.asListArgs("getWindowManager","getLayoutParams"));
        ignoreStaticMap.put("FloatingWindowManagerAssist2", ArrayUtils.asListArgs("removeFloatingView","addFloatingView","removeAllFloatingView","updateViewLayout","isNeedsAdd","setNeedsAdd","getAttachActivity","getMapFloatingKey","getMapFloatingView","getMapFloatingViewLayoutParams"));
        ignoreStaticMap.put("IToastImpl", ArrayUtils.asListArgs("reset","setIsHandler","setNullText","setTextLength","initialize","style","defaultStyle","getToastStyle","initStyle","initToastFilter","setView","show","show","show","show","cancel","filter","handlerContent","getThreadToastStyle","createView","priShowToastText","newToastText","priShowToastView","newToastView"));
        ignoreStaticMap.put("ImageUtils.ImageType", ArrayUtils.asListArgs("getValue"));
        ignoreStaticMap.put("InactivityTimerAssist", ArrayUtils.asListArgs("onPause","onResume","onDestroy","start","cancel"));
        ignoreStaticMap.put("InactivityTimerAssist.InactivityAsyncTask", ArrayUtils.asListArgs("doInBackground"));
        ignoreStaticMap.put("InactivityTimerAssist.PowerStateReceiver", ArrayUtils.asListArgs("onReceive"));
        ignoreStaticMap.put("IntSortAsc", ArrayUtils.asListArgs("compare"));
        ignoreStaticMap.put("IntSortDesc", ArrayUtils.asListArgs("compare"));
        ignoreStaticMap.put("KeyValue", ArrayUtils.asListArgs("getKey","getValue","toString"));
        ignoreStaticMap.put("KeyguardUtils", ArrayUtils.asListArgs("isKeyguardLocked","isKeyguardSecure","inKeyguardRestrictedInputMode","getKeyguardManager","setKeyguardManager","disableKeyguard","reenableKeyguard","release","getKeyguardLock","setKeyguardLock"));
        ignoreStaticMap.put("LocationUtils.CustomLocationListener", ArrayUtils.asListArgs("onLocationChanged","onStatusChanged","onProviderEnabled","onProviderDisabled"));
        ignoreStaticMap.put("LogConfig", ArrayUtils.asListArgs("methodCount","methodOffset","outputMethodAll","displayThreadInfo","sortLog","logLevel","tag"));
        ignoreStaticMap.put("LoggerPrinter", ArrayUtils.asListArgs("other","getLogConfig","initialize","initialize","d","e","e","e","w","i","v","wtf","json","xml","dTag","eTag","eTag","eTag","wTag","iTag","vTag","wtfTag","jsonTag","xmlTag","isPrintLog","checkLogLevel","finalLogPrinter","logHandle","logHandle","logHandle","logHeaderContent","logTopBorder","logBottomBorder","logDivider","logContent","createMessage","getSimpleClassName","getStackOffset","getThreadLogConfig"));
        ignoreStaticMap.put("LongSortAsc", ArrayUtils.asListArgs("compare"));
        ignoreStaticMap.put("LongSortDesc", ArrayUtils.asListArgs("compare"));
        ignoreStaticMap.put("NotificationUtils.Params", ArrayUtils.asListArgs("getPendingIntent","setPendingIntent","getIcon","setIcon","getTicker","setTicker","getTitle","setTitle","getContent","setContent","isAutoCancel","setAutoCancel","getVibratePattern","setVibratePattern","getLightPattern","setLightPattern","getChannel","setChannel"));
        ignoreStaticMap.put("NotificationUtils.VibratePattern", ArrayUtils.asListArgs("isEmpty"));
        ignoreStaticMap.put("PathUtils.AppExternalPath", ArrayUtils.asListArgs("getAppDataPath","getAppDataDir","getAppDataPath","getAppDataDir","getAppCachePath","getAppCacheDir","getAppCachePath","getAppCacheDir","getExternalFilesPath","getExternalFilesDir","getAppFilesPath","getAppFilesDir","getAppFilesPath","getAppFilesDir","getAppMusicPath","getAppMusicDir","getAppPodcastsPath","getAppPodcastsDir","getAppRingtonesPath","getAppRingtonesDir","getAppAlarmsPath","getAppAlarmsDir","getAppNotificationsPath","getAppNotificationsDir","getAppPicturesPath","getAppPicturesDir","getAppMoviesPath","getAppMoviesDir","getAppDownloadPath","getAppDownloadDir","getAppDCIMPath","getAppDCIMDir","getAppDocumentsPath","getAppDocumentsDir","getAppAudiobooksPath","getAppAudiobooksDir","getAppObbPath","getAppObbDir"));
        ignoreStaticMap.put("PathUtils.InternalPath", ArrayUtils.asListArgs("getRootPath","getRootDirectory","getDataPath","getDataDirectory","getDownloadCachePath","getDownloadCacheDirectory","getAppDataPath","getAppDataDir","getAppDataPath","getAppDataDir","getAppCachePath","getAppCacheDir","getAppCachePath","getAppCacheDir","getAppCodeCachePath","getAppCodeCacheDir","getAppDbsPath","getAppDbsDir","getAppDbPath","getAppDbFile","getAppFilesPath","getAppFilesDir","getAppFilesPath","getAppFilesDir","getAppSpPath","getAppSpDir","getAppSpPath","getAppSpFile","getAppNoBackupFilesPath","getAppNoBackupFilesDir","getAppMusicPath","getAppMusicDir","getAppPodcastsPath","getAppPodcastsDir","getAppRingtonesPath","getAppRingtonesDir","getAppAlarmsPath","getAppAlarmsDir","getAppNotificationsPath","getAppNotificationsDir","getAppPicturesPath","getAppPicturesDir","getAppMoviesPath","getAppMoviesDir","getAppDownloadPath","getAppDownloadDir","getAppDCIMPath","getAppDCIMDir","getAppDocumentsPath","getAppDocumentsDir","getAppAudiobooksPath","getAppAudiobooksDir"));
        ignoreStaticMap.put("PathUtils.SDCardPath", ArrayUtils.asListArgs("isSDCardEnable","getSDCardFile","getSDCardPath","getSDCardFile","getSDCardPath","getExternalStoragePublicPath","getExternalStoragePublicDir","getMusicPath","getMusicDir","getPodcastsPath","getPodcastsDir","getRingtonesPath","getRingtonesDir","getAlarmsPath","getAlarmsDir","getNotificationsPath","getNotificationsDir","getPicturesPath","getPicturesDir","getMoviesPath","getMoviesDir","getDownloadPath","getDownloadDir","getDCIMPath","getDCIMDir","getDocumentsPath","getDocumentsDir","getAudiobooksPath","getAudiobooksDir"));
        ignoreStaticMap.put("PermissionUtils", ArrayUtils.asListArgs("callback","setRequestPermissionsResult","request","request","onRequestPermissionsResultCommon","checkPermissions","requestCallback","getPermissionsStatus"));
        ignoreStaticMap.put("PermissionUtils.PermissionActivity", ArrayUtils.asListArgs("onCreate","onRequestPermissionsResult"));
        ignoreStaticMap.put("PowerManagerUtils", ArrayUtils.asListArgs("isScreenOn","turnScreenOn","turnScreenOff","getWakeLock","setWakeLock","getPowerManager","setPowerManager"));
        ignoreStaticMap.put("PreferenceImpl", ArrayUtils.asListArgs("put","getValue","registerListener","unregisterListener","put","putAll","putAll","putAll","get","getAll","getAll","remove","removeAll","removeAll","contains","clear","getInt","getLong","getFloat","getDouble","getBoolean","getString","getSet","getInt","getLong","getFloat","getDouble","getBoolean","getString","getSet"));
        ignoreStaticMap.put("PreferenceImpl.ComparatorImpl", ArrayUtils.asListArgs("compare"));
        ignoreStaticMap.put("QuickHelper", ArrayUtils.asListArgs("getView","targetView","targetViewGroup","targetImageView","targetTextView","targetEditText","targetRecyclerView","devHelper","quickHelper","viewHelper","postRunnable","postRunnable","postRunnable","postRunnable","removeRunnable","addTouchArea","addTouchArea","setOnClick","setOnLongClick","setOnTouch","setId","setClipChildren","removeAllViews","addView","addView","addView","addView","addView","setLayoutParams","setWidthHeight","setWidthHeight","setWeight","setWidth","setWidth","setHeight","setHeight","setMinimumWidth","setMinimumHeight","setAlpha","setTag","setScrollX","setScrollY","setDescendantFocusability","setOverScrollMode","setHorizontalScrollBarEnabled","setVerticalScrollBarEnabled","setScrollContainer","setNextFocusForwardId","setNextFocusDownId","setNextFocusLeftId","setNextFocusRightId","setNextFocusUpId","setRotation","setRotationX","setRotationY","setScaleX","setScaleY","setTextAlignment","setTextDirection","setPivotX","setPivotY","setTranslationX","setTranslationY","setX","setY","setLayerType","requestLayout","requestFocus","clearFocus","setFocusableInTouchMode","setFocusable","toggleFocusable","setSelected","toggleSelected","setEnabled","toggleEnabled","setClickable","toggleClickable","setLongClickable","toggleLongClickable","setVisibilitys","setVisibilitys","setVisibilityINs","toggleVisibilitys","toggleVisibilitys","reverseVisibilitys","reverseVisibilitys","toggleViews","removeSelfFromParent","requestLayoutParent","measureView","measureView","setLayoutGravity","setLayoutGravity","setMarginLeft","setMarginLeft","setMarginTop","setMarginTop","setMarginRight","setMarginRight","setMarginBottom","setMarginBottom","setMargin","setMargin","setMargin","setPaddingLeft","setPaddingLeft","setPaddingTop","setPaddingTop","setPaddingRight","setPaddingRight","setPaddingBottom","setPaddingBottom","setPadding","setPadding","setPadding","addRules","addRules","removeRules","setAnimation","clearAnimation","startAnimation","startAnimation","cancelAnimation","setBackground","setBackgroundColor","setBackgroundResource","setBackgroundTintList","setBackgroundTintMode","setForeground","setForegroundGravity","setForegroundTintList","setForegroundTintMode","setColorFilter","setColorFilter","setColorFilter","setColorFilter","setProgressDrawable","setBarProgress","setBarMax","setBarValue","smoothScrollToPosition","scrollToPosition","smoothScrollToTop","scrollToTop","smoothScrollToBottom","scrollToBottom","smoothScrollTo","smoothScrollBy","fullScroll","scrollTo","scrollBy","setAdjustViewBounds","setMaxHeight","setMaxWidth","setImageLevel","setImageBitmap","setImageDrawable","setImageResource","setImageMatrix","setImageTintList","setImageTintMode","setScaleType","setBackgroundResources","setBackgroundResources","setImageResources","setImageResources","setImageBitmaps","setImageBitmaps","setImageDrawables","setImageDrawables","setScaleTypes","setScaleTypes","setText","setMaxLength","setMaxLengthAndText","setInputType","setImeOptions","setTransformationMethod","setText","insert","insert","setCursorVisible","setTextCursorDrawable","setTextCursorDrawable","setSelectionToTop","setSelectionToBottom","setSelection","setTransformationMethod","addTextChangedListener","removeTextChangedListener","setKeyListener","setHint","setHintTextColors","setHintTextColors","setTextColors","setTextColors","setHtmlTexts","setTypeface","setTypeface","setTextSizeByPx","setTextSizeBySp","setTextSizeByDp","setTextSizeByIn","setTextSize","clearFlags","setPaintFlags","setAntiAliasFlag","setBold","setBold","setBold","setUnderlineText","setUnderlineText","setStrikeThruText","setStrikeThruText","setLetterSpacing","setLineSpacing","setLineSpacingAndMultiplier","setTextScaleX","setIncludeFontPadding","setLines","setMaxLines","setMinLines","setMaxEms","setMinEms","setEms","setEllipsize","setAutoLinkMask","setAllCaps","setGravity","setCompoundDrawablePadding","setCompoundDrawablesByLeft","setCompoundDrawablesByTop","setCompoundDrawablesByRight","setCompoundDrawablesByBottom","setCompoundDrawables","setCompoundDrawablesWithIntrinsicBoundsByLeft","setCompoundDrawablesWithIntrinsicBoundsByTop","setCompoundDrawablesWithIntrinsicBoundsByRight","setCompoundDrawablesWithIntrinsicBoundsByBottom","setCompoundDrawablesWithIntrinsicBounds","setLayoutManager","setOrientation","setAdapter","notifyItemRemoved","notifyItemInserted","notifyItemMoved","notifyDataSetChanged","attachLinearSnapHelper","attachPagerSnapHelper","addItemDecoration","addItemDecoration","removeItemDecoration","removeItemDecorationAt","removeAllItemDecoration","setOnScrollListener","addOnScrollListener","removeOnScrollListener","clearOnScrollListeners","setNestedScrollingEnabled","forceGetViewSize"));
        ignoreStaticMap.put("ROMUtils.RomInfo", ArrayUtils.asListArgs("getName","getVersion","toString"));
        ignoreStaticMap.put("RecordConfig", ArrayUtils.asListArgs("getStoragePath","getFileName","getFolderName","getFileIntervalTime","isHandler","setHandler","isInsertHeaderData","setInsertHeaderData","getRecordInsert","getRecordInsert","setRecordInsert","getFinalPath","getIntervalTimeFolder"));
        ignoreStaticMap.put("RecordInsert", ArrayUtils.asListArgs("getFileInfo","setFileInfo","getLogHeader","setLogHeader","getLogTail","setLogTail"));
        ignoreStaticMap.put("RecyclerViewUtils.FixChildScrollBugLinearLayoutManager", ArrayUtils.asListArgs("requestChildRectangleOnScreen","requestChildRectangleOnScreen"));
        ignoreStaticMap.put("ReflectUtils", ArrayUtils.asListArgs("newInstance","newInstance","getArgsType","sortConstructors","newInstance","field","field","getField","getAccessibleField","unwrap","setEnumVal","method","method","method","exactMethod","similarMethod","sortMethods","isSimilarSignature","match","accessible","proxy","property","type","wrapper","get","hashCode","equals","toString"));
        ignoreStaticMap.put("ResourceAssist", ArrayUtils.asListArgs("reset","getPackageName","getResources","getTheme","getContentResolver","getDisplayMetrics","getConfiguration","getAssets","getIdentifier","getResourceName","getStringId","getString","getString","getString","getString","getDimenId","getDimension","getDimensionInt","getDimension","getDimensionInt","getColorId","getColor","getColor","getDrawableId","getDrawable","getNinePatchDrawable","getDrawable","getNinePatchDrawable","getBitmap","getBitmap","getBitmap","getBitmap","getMipmapId","getDrawableMipmap","getNinePatchDrawableMipmap","getBitmapMipmap","getBitmapMipmap","getAnimId","getAnimationXml","getAnimationXml","getAnimation","getAnimation","getAnimation","getAnimation","getBooleanId","getBoolean","getBoolean","getIntegerId","getInteger","getInteger","getArrayId","getIntArray","getStringArray","getTextArray","getIntArray","getStringArray","getTextArray","getId","getLayoutId","getMenuId","getRawId","getAttrId","getStyleId","getStyleableId","getAnimatorId","getXmlId","getInterpolatorId","getPluralsId","getColorStateList","getColorStateList","getColorDrawable","getColorDrawable","openInputStream","openInputStream","openInputStream","openOutputStream","openOutputStream","openOutputStream","openOutputStream","openOutputStream","openOutputStream","openFileDescriptor","openFileDescriptor","openFileDescriptor","openAssetFileDescriptor","openAssetFileDescriptor","openAssetFileDescriptor","open","openFd","openNonAssetFd","openRawResource","openRawResourceFd","readBytesFromAssets","readStringFromAssets","readBytesFromRaw","readStringFromRaw","geFileToListFromAssets","geFileToListFromRaw","saveAssetsFormFile","saveRawFormFile"));
        ignoreStaticMap.put("ResourcePluginUtils", ArrayUtils.asListArgs("getResourceAssist","getResources","getPackageName","getAPKPath","getApkInfoItem","getDisplayMetrics","getConfiguration","getAssets","getIdentifier","getResourceName","getStringId","getString","getString","getString","getString","getDimenId","getDimension","getDimensionInt","getDimension","getDimensionInt","getColorId","getColor","getColor","getDrawableId","getDrawable","getNinePatchDrawable","getDrawable","getNinePatchDrawable","getBitmap","getBitmap","getBitmap","getBitmap","getMipmapId","getDrawableMipmap","getNinePatchDrawableMipmap","getBitmapMipmap","getBitmapMipmap","getAnimId","getAnimationXml","getAnimationXml","getAnimation","getAnimation","getAnimation","getAnimation","getBooleanId","getBoolean","getBoolean","getIntegerId","getInteger","getInteger","getArrayId","getIntArray","getStringArray","getTextArray","getIntArray","getStringArray","getTextArray","getId","getLayoutId","getMenuId","getRawId","getAttrId","getStyleId","getStyleableId","getAnimatorId","getXmlId","getInterpolatorId","getPluralsId","getColorStateList","getColorStateList","getColorDrawable","getColorDrawable","open","openFd","openNonAssetFd","openRawResource","openRawResourceFd","readBytesFromAssets","readStringFromAssets","readBytesFromRaw","readStringFromRaw","geFileToListFromAssets","geFileToListFromRaw","saveAssetsFormFile","saveRawFormFile"));
        ignoreStaticMap.put("ScaleUtils.XY", ArrayUtils.asListArgs("getXYx","getXY","getXY","compareTo"));
        ignoreStaticMap.put("ScreenSensorAssist", ArrayUtils.asListArgs("initialize","start","stop","isPortrait","isAllowChange"));
        ignoreStaticMap.put("ScreenSensorAssist.OrientationSensorChangeListener", ArrayUtils.asListArgs("onAccuracyChanged","onSensorChanged"));
        ignoreStaticMap.put("ScreenSensorAssist.OrientationSensorListener", ArrayUtils.asListArgs("onAccuracyChanged","onSensorChanged"));
        ignoreStaticMap.put("ScreenshotUtils", ArrayUtils.asListArgs("registerContentObserver","unregisterContentObserver","getStartListenTime","isCheckPrefix","setCheckPrefix","getScreenshotChecker","setScreenshotChecker","getListener","setListener","startListener","startListener","startListener","stopListener"));
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
        ignoreStaticMap.put("StringSortAsc", ArrayUtils.asListArgs("compare"));
        ignoreStaticMap.put("StringSortDesc", ArrayUtils.asListArgs("compare"));
        ignoreStaticMap.put("StringSortWindowsSimple", ArrayUtils.asListArgs("compare"));
        ignoreStaticMap.put("StringSortWindowsSimple2", ArrayUtils.asListArgs("compare"));
        ignoreStaticMap.put("TimeAverager", ArrayUtils.asListArgs("start","end","endAndRestart","average","print","clear"));
        ignoreStaticMap.put("TimeCounter", ArrayUtils.asListArgs("start","durationRestart","duration","getStartTime"));
        ignoreStaticMap.put("TimeKeeper", ArrayUtils.asListArgs("waitForEndAsync","waitForEnd"));
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
        ignoreStaticMap.put("VersionHelper", ArrayUtils.asListArgs("getUriForFile","getUriForPath","getUriForFileToName","getUriForFile","getUriForString","fromFile","fromFile","isUri","isUri","getUriScheme","getUriScheme","isUriExists","isUriExists","copyByUri","copyByUri","copyByUri","copyByUri","getFilePathByUri","getFilePathByUri","getMediaUri","getMediaUri","getMediaUri","getMediaUri","mediaQuery","mediaQuery","mediaQuery","mediaQuery","notifyMediaStore","notifyMediaStore","notifyMediaStore","createImageUri","createImageUri","createImageUri","createImageUri","createImageUri","createVideoUri","createVideoUri","createVideoUri","createVideoUri","createVideoUri","createAudioUri","createAudioUri","createAudioUri","createAudioUri","createAudioUri","createDownloadUri","createDownloadUri","createDownloadUri","createDownloadUri","createMediaUri","createMediaUri","createUriByPath","createUriByPath","createUriByFile","createUriByFile","insertImage","insertImage","insertImage","insertVideo","insertAudio","insertDownload","insertMedia","insertMedia","insertMedia","insertMedia","insertMedia","insertMedia","insertMedia","insertMedia","insertMedia","insertMedia","createWriteRequest","createFavoriteRequest","createTrashRequest","createDeleteRequest","isExternalStorageManager","checkExternalStorageAndIntentSetting"));
        ignoreStaticMap.put("ViewHelper", ArrayUtils.asListArgs("devHelper","quickHelper","viewHelper","postRunnable","postRunnable","postRunnable","postRunnable","removeRunnable","addTouchArea","addTouchArea","setOnClick","setOnLongClick","setOnTouch","setId","setClipChildren","removeAllViews","addView","addView","addView","addView","addView","setLayoutParams","setWidthHeight","setWidthHeight","setWeight","setWidth","setWidth","setHeight","setHeight","setMinimumWidth","setMinimumHeight","setAlpha","setTag","setScrollX","setScrollY","setDescendantFocusability","setOverScrollMode","setHorizontalScrollBarEnabled","setVerticalScrollBarEnabled","setScrollContainer","setNextFocusForwardId","setNextFocusDownId","setNextFocusLeftId","setNextFocusRightId","setNextFocusUpId","setRotation","setRotationX","setRotationY","setScaleX","setScaleY","setTextAlignment","setTextDirection","setPivotX","setPivotY","setTranslationX","setTranslationY","setX","setY","setLayerType","requestLayout","requestFocus","clearFocus","setFocusableInTouchMode","setFocusable","toggleFocusable","setSelected","toggleSelected","setEnabled","toggleEnabled","setClickable","toggleClickable","setLongClickable","toggleLongClickable","setVisibilitys","setVisibilitys","setVisibilityINs","toggleVisibilitys","toggleVisibilitys","toggleVisibilitys","reverseVisibilitys","reverseVisibilitys","reverseVisibilitys","reverseVisibilitys","toggleViews","removeSelfFromParent","requestLayoutParent","measureView","measureView","setLayoutGravity","setLayoutGravity","setMarginLeft","setMarginLeft","setMarginTop","setMarginTop","setMarginRight","setMarginRight","setMarginBottom","setMarginBottom","setMargin","setMargin","setMargin","setPaddingLeft","setPaddingLeft","setPaddingTop","setPaddingTop","setPaddingRight","setPaddingRight","setPaddingBottom","setPaddingBottom","setPadding","setPadding","setPadding","addRules","addRules","removeRules","setAnimation","clearAnimation","startAnimation","startAnimation","cancelAnimation","setBackground","setBackgroundColor","setBackgroundResource","setBackgroundTintList","setBackgroundTintMode","setForeground","setForegroundGravity","setForegroundTintList","setForegroundTintMode","setColorFilter","setColorFilter","setColorFilter","setColorFilter","setProgressDrawable","setBarProgress","setBarMax","setBarValue","smoothScrollToPosition","scrollToPosition","smoothScrollToTop","scrollToTop","smoothScrollToBottom","scrollToBottom","smoothScrollTo","smoothScrollBy","fullScroll","scrollTo","scrollBy","setAdjustViewBounds","setMaxHeight","setMaxWidth","setImageLevel","setImageBitmap","setImageDrawable","setImageResource","setImageMatrix","setImageTintList","setImageTintMode","setScaleType","setBackgroundResources","setBackgroundResources","setImageResources","setImageResources","setImageBitmaps","setImageBitmaps","setImageDrawables","setImageDrawables","setScaleTypes","setScaleTypes","setText","setMaxLength","setMaxLengthAndText","setInputType","setImeOptions","setTransformationMethod","setTransformationMethod","setText","insert","insert","setCursorVisible","setTextCursorDrawable","setTextCursorDrawable","setSelectionToTop","setSelectionToBottom","setSelection","setTransformationMethod","addTextChangedListener","removeTextChangedListener","setKeyListener","setKeyListener","setKeyListener","setHint","setHintTextColors","setHintTextColors","setTextColors","setTextColors","setHtmlTexts","setTypeface","setTypeface","setTextSizeByPx","setTextSizeBySp","setTextSizeByDp","setTextSizeByIn","setTextSize","clearFlags","setPaintFlags","setAntiAliasFlag","setBold","setBold","setBold","setUnderlineText","setUnderlineText","setStrikeThruText","setStrikeThruText","setLetterSpacing","setLineSpacing","setLineSpacingAndMultiplier","setTextScaleX","setIncludeFontPadding","setLines","setMaxLines","setMinLines","setMaxEms","setMinEms","setEms","setEllipsize","setAutoLinkMask","setAllCaps","setGravity","setCompoundDrawablePadding","setCompoundDrawablesByLeft","setCompoundDrawablesByTop","setCompoundDrawablesByRight","setCompoundDrawablesByBottom","setCompoundDrawables","setCompoundDrawablesWithIntrinsicBoundsByLeft","setCompoundDrawablesWithIntrinsicBoundsByTop","setCompoundDrawablesWithIntrinsicBoundsByRight","setCompoundDrawablesWithIntrinsicBoundsByBottom","setCompoundDrawablesWithIntrinsicBounds","setLayoutManager","setOrientation","setAdapter","notifyItemRemoved","notifyItemInserted","notifyItemMoved","notifyDataSetChanged","attachLinearSnapHelper","attachPagerSnapHelper","addItemDecoration","addItemDecoration","removeItemDecoration","removeItemDecorationAt","removeAllItemDecoration","setOnScrollListener","addOnScrollListener","removeOnScrollListener","clearOnScrollListeners","setNestedScrollingEnabled","forceGetViewSize"));
        ignoreStaticMap.put("WeakReferenceAssist", ArrayUtils.asListArgs("getSingleWeak","getSingleWeakValue","getSingleWeakValue","setSingleWeakValue","removeSingleWeak","getWeak","getWeakValue","getWeakValue","setWeakValue","removeWeak","clear"));
        ignoreStaticMap.put("WifiHotUtils", ArrayUtils.asListArgs("startWifiAp","closeWifiAp","getWifiApState","getWifiApConfiguration","setWifiApConfiguration","isOpenWifiAp","closeWifiApCheck","isConnectHot","getHotspotServiceIp","getHotspotAllotIp","getConnectHotspotMsg","getHotspotSplitIpMask","intToString","getApWifiSSID","getApWifiPwd","setOnWifiAPListener"));
        ignoreStaticMap.put("WifiUtils", ArrayUtils.asListArgs("isOpenWifi","openWifi","closeWifi","toggleWifiEnabled","getWifiState","startScan","getConfiguration","getWifiList","getWifiInfo","isExists","isExists","quickConnWifi","quickConnWifi","removeWifiConfig","disconnectWifi","setStaticWifiConfig","setStaticWifiConfig","inetAddressToInt","setDNS","setGateway","setIpAddress","setStaticIpConfig","getField","getDeclaredField","setEnumField","setValueField"));
        ignoreStaticMap.put("WifiVo", ArrayUtils.asListArgs("describeContents","writeToParcel"));
        ignoreStaticMap.put("WindowAssist", ArrayUtils.asListArgs("getWindow","getDecorView","peekDecorView","getCurrentFocus","setSystemUiVisibility","getSystemUiVisibility","setSystemUiVisibilityByAdd","setSystemUiVisibilityByClear","getAttributes","setAttributes","refreshSelfAttributes","clearFlags","addFlags","setFlags","hasFlags","notHasFlags","requestFeature","hasFeature","notHasFeature","setSoftInputMode","setStatusBarColor","getStatusBarColor","setNavigationBarColor","getNavigationBarColor","setNavigationBarDividerColor","getNavigationBarDividerColor","setWidthByParams","setHeightByParams","setWidthHeightByParams","setXByParams","setYByParams","setXYByParams","setGravityByParams","setDimAmountByParams","setWindowBrightness","getWindowBrightness","setKeyBoardSoftInputMode","isKeepScreenOnFlag","setFlagKeepScreenOn","clearFlagKeepScreenOn","isSecureFlag","setFlagSecure","clearFlagSecure","isFullScreenFlag","setFlagFullScreen","clearFlagFullScreen","isTranslucentStatusFlag","setFlagTranslucentStatus","clearFlagTranslucentStatus","isDrawsSystemBarBackgroundsFlag","setFlagDrawsSystemBarBackgrounds","clearFlagDrawsSystemBarBackgrounds","isNoTitleFeature","setFeatureNoTitle","setFlagFullScreenAndNoTitle","setSemiTransparentStatusBarColor","setStatusBarColorAndFlag","getDecorView","peekDecorView","getCurrentFocus","setSystemUiVisibility","getSystemUiVisibility","setSystemUiVisibilityByAdd","setSystemUiVisibilityByClear","getAttributes","setAttributes","refreshSelfAttributes","clearFlags","addFlags","setFlags","hasFlags","notHasFlags","requestFeature","hasFeature","notHasFeature","setSoftInputMode","setStatusBarColor","getStatusBarColor","setNavigationBarColor","getNavigationBarColor","setNavigationBarDividerColor","getNavigationBarDividerColor","setWidthByParams","setHeightByParams","setWidthHeightByParams","setXByParams","setYByParams","setXYByParams","setGravityByParams","setDimAmountByParams","setWindowBrightness","getWindowBrightness","setKeyBoardSoftInputMode","isKeepScreenOnFlag","setFlagKeepScreenOn","clearFlagKeepScreenOn","isSecureFlag","setFlagSecure","clearFlagSecure","isFullScreenFlag","setFlagFullScreen","clearFlagFullScreen","isTranslucentStatusFlag","setFlagTranslucentStatus","clearFlagTranslucentStatus","isDrawsSystemBarBackgroundsFlag","setFlagDrawsSystemBarBackgrounds","clearFlagDrawsSystemBarBackgrounds","isNoTitleFeature","setFeatureNoTitle","setFlagFullScreenAndNoTitle","setSemiTransparentStatusBarColor","setStatusBarColorAndFlag"));
        ignoreStaticMap.put("WindowsExplorerFileSimpleComparator", ArrayUtils.asListArgs("compare"));
        ignoreStaticMap.put("WindowsExplorerFileSimpleComparator2", ArrayUtils.asListArgs("compare"));
        ignoreStaticMap.put("WindowsExplorerStringSimpleComparator", ArrayUtils.asListArgs("compare","innerCompare","getSplitFileName"));
        ignoreStaticMap.put("WindowsExplorerStringSimpleComparator2", ArrayUtils.asListArgs("compare","innerCompare","splitStringPreserveDelimiter"));

        return ignoreStaticMap;
    }

    /**
     * 获取忽略指定方法 @param 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreParamMap() {
        Map<String, List<String>> ignoreParamMap = new HashMap<>();
        ignoreParamMap.put("AbstractActivityLifecycle", ArrayUtils.asListArgs("onActivityCreated","onActivityStarted","onActivityResumed","onActivityPaused","onActivityStopped","onActivitySaveInstanceState","onActivityDestroyed"));
        ignoreParamMap.put("ActivityLifecycleAssist.ActivityLifecycleImpl", ArrayUtils.asListArgs("onActivityCreated","onActivityStarted","onActivityResumed","onActivityPaused","onActivityStopped","onActivitySaveInstanceState","onActivityDestroyed"));
        ignoreParamMap.put("ActivityUtils.ResultActivity", ArrayUtils.asListArgs("onCreate","onActivityResult"));
        ignoreParamMap.put("AppRecordInsert", ArrayUtils.asListArgs("setFileInfo"));
        ignoreParamMap.put("AutoFocusAssist.AutoFocusTask", ArrayUtils.asListArgs("doInBackground"));
        ignoreParamMap.put("Base64.Coder", ArrayUtils.asListArgs("process","maxOutputSize"));
        ignoreParamMap.put("Base64.Decoder", ArrayUtils.asListArgs("maxOutputSize","process"));
        ignoreParamMap.put("Base64.Encoder", ArrayUtils.asListArgs("maxOutputSize","process"));
        ignoreParamMap.put("CalendarUtils", ArrayUtils.asListArgs("getBitInt","solarToInt","solarFromInt"));
        ignoreParamMap.put("CalendarUtils.Festival", ArrayUtils.asListArgs("compareTo"));
        ignoreParamMap.put("ClassUtils", ArrayUtils.asListArgs("getClass","getClass"));
        ignoreParamMap.put("ClickUtils.OnCountClickListener", ArrayUtils.asListArgs("onClick"));
        ignoreParamMap.put("ClickUtils.OnDebouncingClickListener", ArrayUtils.asListArgs("onClick"));
        ignoreParamMap.put("ClickUtils.OnMultiClickListener", ArrayUtils.asListArgs("doClick","doInvalidClick"));
        ignoreParamMap.put("ColorUtils.ColorInfo.ColorParser", ArrayUtils.asListArgs("handleColor"));
        ignoreParamMap.put("ContentResolverUtils.MediaQueryInfo", ArrayUtils.asListArgs("getResult","getProjection","getSelection","getSelectionArgs"));
        ignoreParamMap.put("ContentResolverUtils.MediaQueryInfoUri", ArrayUtils.asListArgs("getSelection","getSelectionArgs"));
        ignoreParamMap.put("ContentResolverUtils.MediaQueryUri", ArrayUtils.asListArgs("getResult","getProjection","getSelection","getSelectionArgs"));
        ignoreParamMap.put("DateSortAsc", ArrayUtils.asListArgs("compare"));
        ignoreParamMap.put("DateSortDesc", ArrayUtils.asListArgs("compare"));
        ignoreParamMap.put("DevCache", ArrayUtils.asListArgs("getParcelable","getParcelable"));
        ignoreParamMap.put("DevCache.Data", ArrayUtils.asListArgs("setType","setSaveTime","setValidTime"));
        ignoreParamMap.put("DevCacheManager", ArrayUtils.asListArgs("remove","removeForKeys","contains","isDue","clearType","getItemByKey","put","put","put","put","put","put","put","put","put","put","put","put","getInt","getLong","getFloat","getDouble","getBoolean","getString","getBytes","getBitmap","getDrawable","getSerializable","getParcelable","getJSONObject","getJSONArray","getInt","getLong","getFloat","getDouble","getBoolean","getString","getBytes","getBitmap","getDrawable","getSerializable","getParcelable","getJSONObject","getJSONArray","_mapGetData"));
        ignoreParamMap.put("DevFloatingEdgeIMPL", ArrayUtils.asListArgs("calculateEdge"));
        ignoreParamMap.put("DevFloatingTouchIMPL", ArrayUtils.asListArgs("onTouchEvent"));
        ignoreParamMap.put("DevFloatingTouchIMPL2", ArrayUtils.asListArgs("onTouchEvent","updateViewLayout"));
        ignoreParamMap.put("DevTimer.Builder", ArrayUtils.asListArgs("setTag","setDelay","setPeriod","setLimit"));
        ignoreParamMap.put("DoubleSortAsc", ArrayUtils.asListArgs("compare"));
        ignoreParamMap.put("DoubleSortDesc", ArrayUtils.asListArgs("compare"));
        ignoreParamMap.put("FileLastModifiedSortAsc", ArrayUtils.asListArgs("compare"));
        ignoreParamMap.put("FileLastModifiedSortDesc", ArrayUtils.asListArgs("compare"));
        ignoreParamMap.put("FileLengthSortAsc", ArrayUtils.asListArgs("compare"));
        ignoreParamMap.put("FileLengthSortDesc", ArrayUtils.asListArgs("compare"));
        ignoreParamMap.put("FileNameSortAsc", ArrayUtils.asListArgs("compare"));
        ignoreParamMap.put("FileNameSortDesc", ArrayUtils.asListArgs("compare"));
        ignoreParamMap.put("FileSortAsc", ArrayUtils.asListArgs("compare"));
        ignoreParamMap.put("FileSortDesc", ArrayUtils.asListArgs("compare"));
        ignoreParamMap.put("FloatSortAsc", ArrayUtils.asListArgs("compare"));
        ignoreParamMap.put("FloatSortDesc", ArrayUtils.asListArgs("compare"));
        ignoreParamMap.put("InactivityTimerAssist.InactivityAsyncTask", ArrayUtils.asListArgs("doInBackground"));
        ignoreParamMap.put("InactivityTimerAssist.PowerStateReceiver", ArrayUtils.asListArgs("onReceive"));
        ignoreParamMap.put("IntSortAsc", ArrayUtils.asListArgs("compare"));
        ignoreParamMap.put("IntSortDesc", ArrayUtils.asListArgs("compare"));
        ignoreParamMap.put("JCLogUtils", ArrayUtils.asListArgs("d","e","e","e","i","xml","dTag","eTag","eTag","eTag","iTag","xmlTag"));
        ignoreParamMap.put("LogPrintUtils", ArrayUtils.asListArgs("d","e","e","e","w","i","v","wtf","json","xml","dTag","eTag","eTag","eTag","wTag","iTag","vTag","wtfTag","jsonTag","xmlTag"));
        ignoreParamMap.put("LongSortAsc", ArrayUtils.asListArgs("compare"));
        ignoreParamMap.put("LongSortDesc", ArrayUtils.asListArgs("compare"));
        ignoreParamMap.put("NotificationUtils.Callback", ArrayUtils.asListArgs("callback"));
        ignoreParamMap.put("NotificationUtils.Params", ArrayUtils.asListArgs("setPendingIntent","setIcon","setTicker","setTitle","setContent","setAutoCancel","setVibratePattern","setLightPattern","setChannel"));
        ignoreParamMap.put("PreferenceImpl.ComparatorImpl", ArrayUtils.asListArgs("compare"));
        ignoreParamMap.put("RecordInsert", ArrayUtils.asListArgs("setFileInfo","setLogHeader","setLogTail"));
        ignoreParamMap.put("RecyclerViewUtils.FixChildScrollBugLinearLayoutManager", ArrayUtils.asListArgs("requestChildRectangleOnScreen","requestChildRectangleOnScreen"));
        ignoreParamMap.put("Reflect2Utils", ArrayUtils.asListArgs("getArgsClass"));
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
        ignoreParamMap.put("StringSortAsc", ArrayUtils.asListArgs("compare"));
        ignoreParamMap.put("StringSortDesc", ArrayUtils.asListArgs("compare"));
        ignoreParamMap.put("StringSortWindowsSimple", ArrayUtils.asListArgs("compare"));
        ignoreParamMap.put("StringSortWindowsSimple2", ArrayUtils.asListArgs("compare"));
        ignoreParamMap.put("ToastFactory.BaseToast", ArrayUtils.asListArgs("setView","setText"));
        ignoreParamMap.put("ToastFactory.SafeToast.SafeHandler", ArrayUtils.asListArgs("handleMessage","dispatchMessage"));
        ignoreParamMap.put("ToastFactory.ToastHelper", ArrayUtils.asListArgs("handleMessage"));
        ignoreParamMap.put("ToastTintUtils.SafeHandler", ArrayUtils.asListArgs("handleMessage","dispatchMessage"));
        ignoreParamMap.put("ToastUtils.SafeHandler", ArrayUtils.asListArgs("handleMessage","dispatchMessage"));
        ignoreParamMap.put("TypeUtils.ParameterizedTypeImpl", ArrayUtils.asListArgs("equals"));
        ignoreParamMap.put("WeakReferenceAssist", ArrayUtils.asListArgs("getWeak"));
        ignoreParamMap.put("WifiVo", ArrayUtils.asListArgs("writeToParcel"));
        ignoreParamMap.put("WindowsExplorerFileSimpleComparator", ArrayUtils.asListArgs("compare"));
        ignoreParamMap.put("WindowsExplorerFileSimpleComparator2", ArrayUtils.asListArgs("compare"));
        ignoreParamMap.put("WindowsExplorerStringSimpleComparator", ArrayUtils.asListArgs("compare","innerCompare","getSplitFileName"));
        ignoreParamMap.put("WindowsExplorerStringSimpleComparator2", ArrayUtils.asListArgs("compare","innerCompare","splitStringPreserveDelimiter"));

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
        ignoreUnPublicMap.put("ActivityLifecycleAssist", ArrayUtils.asListArgs("getApplication"));
        ignoreUnPublicMap.put("ActivityLifecycleAssist.ActivityLifecycleImpl", ArrayUtils.asListArgs("setTopActivity","getTopActivityByReflect","postStatus","consumeOnActivityDestroyedListener"));
        ignoreUnPublicMap.put("ActivityLifecycleFilter", ArrayUtils.asListArgs("filter"));
        ignoreUnPublicMap.put("ActivityLifecycleGet", ArrayUtils.asListArgs("getTopActivity","isTopActivity","isTopActivity","isBackground","getActivityCount"));
        ignoreUnPublicMap.put("ActivityLifecycleNotify", ArrayUtils.asListArgs("addOnAppStatusChangedListener","removeOnAppStatusChangedListener","removeAllOnAppStatusChangedListener","addOnActivityDestroyedListener","removeOnActivityDestroyedListener","removeAllOnActivityDestroyedListener"));
        ignoreUnPublicMap.put("ActivityUtils.ResultActivity", ArrayUtils.asListArgs("start","onCreate","onActivityResult","onDestroy"));
        ignoreUnPublicMap.put("ActivityUtils.ResultCallback", ArrayUtils.asListArgs("onStartActivityForResult","onActivityResult"));
        ignoreUnPublicMap.put("ApkInfoItem", ArrayUtils.asListArgs("get"));
        ignoreUnPublicMap.put("AppInfoBean", ArrayUtils.asListArgs("get"));
        ignoreUnPublicMap.put("AppInfoItem", ArrayUtils.asListArgs("get"));
        ignoreUnPublicMap.put("AppRecordInsert", ArrayUtils.asListArgs("createFileInfo"));
        ignoreUnPublicMap.put("AutoFocusAssist", ArrayUtils.asListArgs("autoFocusAgainLater","cancelOutstandingTask"));
        ignoreUnPublicMap.put("AutoFocusAssist.AutoFocusTask", ArrayUtils.asListArgs("doInBackground"));
        ignoreUnPublicMap.put("BarUtils", ArrayUtils.asListArgs("addMarginTopEqualStatusBarHeight","subtractMarginTopEqualStatusBarHeight","applyStatusBarColor","applyStatusBarColor","hideStatusBarView","hideStatusBarView","showStatusBarView","createStatusBarView"));
        ignoreUnPublicMap.put("BeepVibrateAssist", ArrayUtils.asListArgs("shouldBeep","streamUpdate"));
        ignoreUnPublicMap.put("BigDecimalUtils.Operation", ArrayUtils.asListArgs("throwException"));
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
        ignoreUnPublicMap.put("DateSort", ArrayUtils.asListArgs("getDateSortValue"));
        ignoreUnPublicMap.put("Decrypt", ArrayUtils.asListArgs("decrypt"));
        ignoreUnPublicMap.put("DelayAssist.Callback", ArrayUtils.asListArgs("callback"));
        ignoreUnPublicMap.put("DevCache.Data", ArrayUtils.asListArgs("setType","setSaveTime","setValidTime"));
        ignoreUnPublicMap.put("DevCacheManager", ArrayUtils.asListArgs("calculateCacheSizeAndCacheCount","_getKeyDataFile","_getKeyConfigFile","_isExistKeyFile","_mapGetData","_toDataString","_getData","_put","_get"));
        ignoreUnPublicMap.put("DevLogger.Print", ArrayUtils.asListArgs("printLog"));
        ignoreUnPublicMap.put("DevMediaManager", ArrayUtils.asListArgs("createMedia","destroyMedia","bindListener","clearMediaPlayerData"));
        ignoreUnPublicMap.put("DevMediaManager.MediaListener", ArrayUtils.asListArgs("onPrepared","onCompletion","onBufferingUpdate","onSeekComplete","onError","onVideoSizeChanged"));
        ignoreUnPublicMap.put("DevTimer", ArrayUtils.asListArgs("startTimer","cancelTimer"));
        ignoreUnPublicMap.put("DevTimer.Callback", ArrayUtils.asListArgs("callback"));
        ignoreUnPublicMap.put("DevVideoPlayerControl", ArrayUtils.asListArgs("resetOperate"));
        ignoreUnPublicMap.put("DeviceUtils", ArrayUtils.asListArgs("getMacAddressByWifiInfo","getMacAddressByNetworkInterface","getMacAddressByInetAddress","getInetAddress","getMacAddressByFile"));
        ignoreUnPublicMap.put("DoubleSort", ArrayUtils.asListArgs("getDoubleSortValue"));
        ignoreUnPublicMap.put("Encrypt", ArrayUtils.asListArgs("encrypt"));
        ignoreUnPublicMap.put("EncryptUtils", ArrayUtils.asListArgs("base64Encode","base64Decode"));
        ignoreUnPublicMap.put("FileBreadthFirstSearchUtils", ArrayUtils.asListArgs("queryFile","whileQueue"));
        ignoreUnPublicMap.put("FileBreadthFirstSearchUtils.FileItem", ArrayUtils.asListArgs("put"));
        ignoreUnPublicMap.put("FileBreadthFirstSearchUtils.SearchHandler", ArrayUtils.asListArgs("isHandlerFile","isAddToList","onEndListener"));
        ignoreUnPublicMap.put("FileDepthFirstSearchUtils", ArrayUtils.asListArgs("queryFile"));
        ignoreUnPublicMap.put("FileDepthFirstSearchUtils.SearchHandler", ArrayUtils.asListArgs("isHandlerFile","isAddToList","onEndListener"));
        ignoreUnPublicMap.put("FileRecordUtils", ArrayUtils.asListArgs("concatInsertLog","concatLog","finalRecord"));
        ignoreUnPublicMap.put("FileRecordUtils.Callback", ArrayUtils.asListArgs("callback"));
        ignoreUnPublicMap.put("FileUtils", ArrayUtils.asListArgs("copyFolder"));
        ignoreUnPublicMap.put("FileUtils.OnReplaceListener", ArrayUtils.asListArgs("onReplace"));
        ignoreUnPublicMap.put("FloatSort", ArrayUtils.asListArgs("getFloatSortValue"));
        ignoreUnPublicMap.put("FloatingWindowManagerAssist.AssistIMPL", ArrayUtils.asListArgs("getWindowManager","getLayoutParams"));
        ignoreUnPublicMap.put("FloatingWindowManagerAssist2", ArrayUtils.asListArgs("getAttachActivity","getMapFloatingKey","getMapFloatingView","getMapFloatingViewLayoutParams"));
        ignoreUnPublicMap.put("ForUtils.BooleanConsumer", ArrayUtils.asListArgs("accept"));
        ignoreUnPublicMap.put("ForUtils.ByteConsumer", ArrayUtils.asListArgs("accept"));
        ignoreUnPublicMap.put("ForUtils.CharConsumer", ArrayUtils.asListArgs("accept"));
        ignoreUnPublicMap.put("ForUtils.Consumer", ArrayUtils.asListArgs("accept"));
        ignoreUnPublicMap.put("ForUtils.ConsumerSimple", ArrayUtils.asListArgs("accept"));
        ignoreUnPublicMap.put("ForUtils.DoubleConsumer", ArrayUtils.asListArgs("accept"));
        ignoreUnPublicMap.put("ForUtils.FloatConsumer", ArrayUtils.asListArgs("accept"));
        ignoreUnPublicMap.put("ForUtils.IntConsumer", ArrayUtils.asListArgs("accept"));
        ignoreUnPublicMap.put("ForUtils.LongConsumer", ArrayUtils.asListArgs("accept"));
        ignoreUnPublicMap.put("ForUtils.ShortConsumer", ArrayUtils.asListArgs("accept"));
        ignoreUnPublicMap.put("HandlerUtils.OnEndListener", ArrayUtils.asListArgs("onEnd"));
        ignoreUnPublicMap.put("HttpURLConnectionUtils", ArrayUtils.asListArgs("reqNetTime"));
        ignoreUnPublicMap.put("HttpURLConnectionUtils.Callback", ArrayUtils.asListArgs("onResponse","onFail"));
        ignoreUnPublicMap.put("HttpURLConnectionUtils.TimeCallback", ArrayUtils.asListArgs("onResponse","onFail"));
        ignoreUnPublicMap.put("IDCardUtils", ArrayUtils.asListArgs("convertCharToInt","validateDateSmallerThenNow","isNumber"));
        ignoreUnPublicMap.put("IFloatingActivity", ArrayUtils.asListArgs("getAttachActivity","getMapFloatingKey","getMapFloatingView","getMapFloatingViewLayoutParams"));
        ignoreUnPublicMap.put("IFloatingEdge", ArrayUtils.asListArgs("calculateEdge"));
        ignoreUnPublicMap.put("IFloatingOperate", ArrayUtils.asListArgs("removeFloatingView","addFloatingView","removeAllFloatingView","updateViewLayout","isNeedsAdd","setNeedsAdd"));
        ignoreUnPublicMap.put("IFloatingTouch", ArrayUtils.asListArgs("onTouchEvent","updateViewLayout"));
        ignoreUnPublicMap.put("IHelper", ArrayUtils.asListArgs("devHelper","quickHelper","viewHelper","postRunnable","postRunnable","postRunnable","postRunnable","removeRunnable"));
        ignoreUnPublicMap.put("IHelperByDev", ArrayUtils.asListArgs("setAnimationRepeat","setAnimationListener","startAnimation","cancelAnimation","recycle","startTimer","stopTimer","recycleTimer","closeAllTimer","closeAllNotRunningTimer","closeAllInfiniteTimer","closeAllTagTimer","closeAllUUIDTimer","addTouchArea","addTouchArea","setOnClick","setOnLongClick","setOnTouch","copyText","copyUri","copyIntent","setDialogStatusBarColor","setDialogSemiTransparentStatusBarColor","setDialogStatusBarColorAndFlag","setDialogAttributes","setDialogWidth","setDialogHeight","setDialogWidthHeight","setDialogX","setDialogY","setDialogXY","setDialogGravity","setDialogDimAmount","setDialogCancelable","setDialogCanceledOnTouchOutside","setDialogCancelableAndTouchOutside","showDialog","closeDialogs","closeDialogs","closePopupWindows","autoCloseDialog","autoCloseDialog","autoClosePopupWindow","setSoftInputMode","setSoftInputMode","setSoftInputMode","setSoftInputMode","judgeView","registerSoftInputChangedListener","registerSoftInputChangedListener2","fixSoftInputLeaks","toggleKeyboard","openKeyboard","openKeyboardDelay","openKeyboardDelay","openKeyboard","openKeyboardDelay","openKeyboardDelay","openKeyboardByFocus","closeKeyboard","closeKeyboard","closeKeyboard","closeKeyboard","closeKeyBoardSpecial","closeKeyBoardSpecialDelay","closeKeyBoardSpecialDelay","closeKeyboardDelay","closeKeyboardDelay","closeKeyboardDelay","closeKeyboardDelay","closeKeyboardDelay","closeKeyboardDelay","closeKeyboardDelay","closeKeyboardDelay","applyLanguage","applyLanguage","cancelAllNotification","cancelNotification","cancelNotification","notifyNotification","notifyNotification","createNotificationChannel","dial","call","sendSms","sendSmsSilent","setBright","setBright","setWindowSecure","setFullScreen","setFullScreenNoTitle","setLandscape","setPortrait","toggleScreenOrientation","setSleepDuration","forceGetViewSize","vibrate","vibrate","cancelVibrate","getWidthHeightExact","getWidthHeightExact2","measureView","measureView","closeIO","closeIOQuietly","flush","flushQuietly","flushCloseIO","flushCloseIOQuietly","flushCloseIO","flushCloseIOQuietly","setSystemUiVisibility","setSystemUiVisibilityByAdd","setSystemUiVisibilityByClear","setAttributes","refreshSelfAttributes","clearFlags","addFlags","setFlags","requestFeature","setSoftInputMode","setStatusBarColor","setNavigationBarColor","setNavigationBarDividerColor","setWidthByParams","setHeightByParams","setWidthHeightByParams","setXByParams","setYByParams","setXYByParams","setGravityByParams","setDimAmountByParams","setWindowBrightness","setKeyBoardSoftInputMode","setFlagKeepScreenOn","clearFlagKeepScreenOn","setFlagSecure","clearFlagSecure","setFlagFullScreen","clearFlagFullScreen","setFlagTranslucentStatus","clearFlagTranslucentStatus","setFlagDrawsSystemBarBackgrounds","clearFlagDrawsSystemBarBackgrounds","setFeatureNoTitle","setFlagFullScreenAndNoTitle","setSemiTransparentStatusBarColor","setStatusBarColorAndFlag"));
        ignoreUnPublicMap.put("IHelperByQuick", ArrayUtils.asListArgs("addTouchArea","addTouchArea","setOnClick","setOnLongClick","setOnTouch","setId","setClipChildren","removeAllViews","addView","addView","addView","addView","addView","setLayoutParams","setWidthHeight","setWidthHeight","setWeight","setWidth","setWidth","setHeight","setHeight","setMinimumWidth","setMinimumHeight","setAlpha","setTag","setScrollX","setScrollY","setDescendantFocusability","setOverScrollMode","setHorizontalScrollBarEnabled","setVerticalScrollBarEnabled","setScrollContainer","setNextFocusForwardId","setNextFocusDownId","setNextFocusLeftId","setNextFocusRightId","setNextFocusUpId","setRotation","setRotationX","setRotationY","setScaleX","setScaleY","setTextAlignment","setTextDirection","setPivotX","setPivotY","setTranslationX","setTranslationY","setX","setY","setLayerType","requestLayout","requestFocus","clearFocus","setFocusableInTouchMode","setFocusable","toggleFocusable","setSelected","toggleSelected","setEnabled","toggleEnabled","setClickable","toggleClickable","setLongClickable","toggleLongClickable","setVisibilitys","setVisibilitys","setVisibilityINs","toggleVisibilitys","toggleVisibilitys","reverseVisibilitys","reverseVisibilitys","toggleViews","removeSelfFromParent","requestLayoutParent","measureView","measureView","setLayoutGravity","setLayoutGravity","setMarginLeft","setMarginLeft","setMarginTop","setMarginTop","setMarginRight","setMarginRight","setMarginBottom","setMarginBottom","setMargin","setMargin","setMargin","setPaddingLeft","setPaddingLeft","setPaddingTop","setPaddingTop","setPaddingRight","setPaddingRight","setPaddingBottom","setPaddingBottom","setPadding","setPadding","setPadding","addRules","addRules","removeRules","setAnimation","clearAnimation","startAnimation","startAnimation","cancelAnimation","setBackground","setBackgroundColor","setBackgroundResource","setBackgroundTintList","setBackgroundTintMode","setForeground","setForegroundGravity","setForegroundTintList","setForegroundTintMode","setColorFilter","setColorFilter","setColorFilter","setColorFilter","setProgressDrawable","setBarProgress","setBarMax","setBarValue","smoothScrollToPosition","scrollToPosition","smoothScrollToTop","scrollToTop","smoothScrollToBottom","scrollToBottom","smoothScrollTo","smoothScrollBy","fullScroll","scrollTo","scrollBy","setAdjustViewBounds","setMaxHeight","setMaxWidth","setImageLevel","setImageBitmap","setImageDrawable","setImageResource","setImageMatrix","setImageTintList","setImageTintMode","setScaleType","setBackgroundResources","setBackgroundResources","setImageResources","setImageResources","setImageBitmaps","setImageBitmaps","setImageDrawables","setImageDrawables","setScaleTypes","setScaleTypes","setText","setMaxLength","setMaxLengthAndText","setInputType","setImeOptions","setTransformationMethod","setText","insert","insert","setCursorVisible","setTextCursorDrawable","setTextCursorDrawable","setSelectionToTop","setSelectionToBottom","setSelection","setTransformationMethod","addTextChangedListener","removeTextChangedListener","setKeyListener","setHint","setHintTextColors","setHintTextColors","setTextColors","setTextColors","setHtmlTexts","setTypeface","setTypeface","setTextSizeByPx","setTextSizeBySp","setTextSizeByDp","setTextSizeByIn","setTextSize","clearFlags","setPaintFlags","setAntiAliasFlag","setBold","setBold","setBold","setUnderlineText","setUnderlineText","setStrikeThruText","setStrikeThruText","setLetterSpacing","setLineSpacing","setLineSpacingAndMultiplier","setTextScaleX","setIncludeFontPadding","setLines","setMaxLines","setMinLines","setMaxEms","setMinEms","setEms","setEllipsize","setAutoLinkMask","setAllCaps","setGravity","setCompoundDrawablePadding","setCompoundDrawablesByLeft","setCompoundDrawablesByTop","setCompoundDrawablesByRight","setCompoundDrawablesByBottom","setCompoundDrawables","setCompoundDrawablesWithIntrinsicBoundsByLeft","setCompoundDrawablesWithIntrinsicBoundsByTop","setCompoundDrawablesWithIntrinsicBoundsByRight","setCompoundDrawablesWithIntrinsicBoundsByBottom","setCompoundDrawablesWithIntrinsicBounds","setLayoutManager","setOrientation","setAdapter","notifyItemRemoved","notifyItemInserted","notifyItemMoved","notifyDataSetChanged","attachLinearSnapHelper","attachPagerSnapHelper","addItemDecoration","addItemDecoration","removeItemDecoration","removeItemDecorationAt","removeAllItemDecoration","setOnScrollListener","addOnScrollListener","removeOnScrollListener","clearOnScrollListeners","setNestedScrollingEnabled","forceGetViewSize"));
        ignoreUnPublicMap.put("IHelperByVersion", ArrayUtils.asListArgs("getUriForFile","getUriForPath","getUriForFileToName","getUriForFile","getUriForString","fromFile","fromFile","isUri","isUri","getUriScheme","getUriScheme","isUriExists","isUriExists","copyByUri","copyByUri","copyByUri","copyByUri","getFilePathByUri","getFilePathByUri","getMediaUri","getMediaUri","getMediaUri","getMediaUri","mediaQuery","mediaQuery","mediaQuery","mediaQuery","notifyMediaStore","notifyMediaStore","notifyMediaStore","createImageUri","createImageUri","createImageUri","createImageUri","createImageUri","createVideoUri","createVideoUri","createVideoUri","createVideoUri","createVideoUri","createAudioUri","createAudioUri","createAudioUri","createAudioUri","createAudioUri","createDownloadUri","createDownloadUri","createDownloadUri","createDownloadUri","createMediaUri","createMediaUri","createUriByPath","createUriByPath","createUriByFile","createUriByFile","insertImage","insertImage","insertImage","insertVideo","insertAudio","insertDownload","insertMedia","insertMedia","insertMedia","insertMedia","insertMedia","insertMedia","insertMedia","insertMedia","insertMedia","insertMedia","createWriteRequest","createFavoriteRequest","createTrashRequest","createDeleteRequest","isExternalStorageManager","checkExternalStorageAndIntentSetting"));
        ignoreUnPublicMap.put("IHelperByView", ArrayUtils.asListArgs("addTouchArea","addTouchArea","setOnClick","setOnLongClick","setOnTouch","setId","setClipChildren","removeAllViews","addView","addView","addView","addView","addView","setLayoutParams","setWidthHeight","setWidthHeight","setWeight","setWidth","setWidth","setHeight","setHeight","setMinimumWidth","setMinimumHeight","setAlpha","setTag","setScrollX","setScrollY","setDescendantFocusability","setOverScrollMode","setHorizontalScrollBarEnabled","setVerticalScrollBarEnabled","setScrollContainer","setNextFocusForwardId","setNextFocusDownId","setNextFocusLeftId","setNextFocusRightId","setNextFocusUpId","setRotation","setRotationX","setRotationY","setScaleX","setScaleY","setTextAlignment","setTextDirection","setPivotX","setPivotY","setTranslationX","setTranslationY","setX","setY","setLayerType","requestLayout","requestFocus","clearFocus","setFocusableInTouchMode","setFocusable","toggleFocusable","setSelected","toggleSelected","setEnabled","toggleEnabled","setClickable","toggleClickable","setLongClickable","toggleLongClickable","setVisibilitys","setVisibilitys","setVisibilityINs","toggleVisibilitys","toggleVisibilitys","toggleVisibilitys","reverseVisibilitys","reverseVisibilitys","reverseVisibilitys","reverseVisibilitys","toggleViews","removeSelfFromParent","requestLayoutParent","measureView","measureView","setLayoutGravity","setLayoutGravity","setMarginLeft","setMarginLeft","setMarginTop","setMarginTop","setMarginRight","setMarginRight","setMarginBottom","setMarginBottom","setMargin","setMargin","setMargin","setPaddingLeft","setPaddingLeft","setPaddingTop","setPaddingTop","setPaddingRight","setPaddingRight","setPaddingBottom","setPaddingBottom","setPadding","setPadding","setPadding","addRules","addRules","removeRules","setAnimation","clearAnimation","startAnimation","startAnimation","cancelAnimation","setBackground","setBackgroundColor","setBackgroundResource","setBackgroundTintList","setBackgroundTintMode","setForeground","setForegroundGravity","setForegroundTintList","setForegroundTintMode","setColorFilter","setColorFilter","setColorFilter","setColorFilter","setProgressDrawable","setBarProgress","setBarMax","setBarValue","smoothScrollToPosition","scrollToPosition","smoothScrollToTop","scrollToTop","smoothScrollToBottom","scrollToBottom","smoothScrollTo","smoothScrollBy","fullScroll","scrollTo","scrollBy","setAdjustViewBounds","setMaxHeight","setMaxWidth","setImageLevel","setImageBitmap","setImageDrawable","setImageResource","setImageMatrix","setImageTintList","setImageTintMode","setScaleType","setBackgroundResources","setBackgroundResources","setImageResources","setImageResources","setImageBitmaps","setImageBitmaps","setImageDrawables","setImageDrawables","setScaleTypes","setScaleTypes","setText","setMaxLength","setMaxLengthAndText","setInputType","setImeOptions","setTransformationMethod","setTransformationMethod","setText","insert","insert","setCursorVisible","setTextCursorDrawable","setTextCursorDrawable","setSelectionToTop","setSelectionToBottom","setSelection","setTransformationMethod","addTextChangedListener","removeTextChangedListener","setKeyListener","setKeyListener","setKeyListener","setHint","setHintTextColors","setHintTextColors","setTextColors","setTextColors","setHtmlTexts","setTypeface","setTypeface","setTextSizeByPx","setTextSizeBySp","setTextSizeByDp","setTextSizeByIn","setTextSize","clearFlags","setPaintFlags","setAntiAliasFlag","setBold","setBold","setBold","setUnderlineText","setUnderlineText","setStrikeThruText","setStrikeThruText","setLetterSpacing","setLineSpacing","setLineSpacingAndMultiplier","setTextScaleX","setIncludeFontPadding","setLines","setMaxLines","setMinLines","setMaxEms","setMinEms","setEms","setEllipsize","setAutoLinkMask","setAllCaps","setGravity","setCompoundDrawablePadding","setCompoundDrawablesByLeft","setCompoundDrawablesByTop","setCompoundDrawablesByRight","setCompoundDrawablesByBottom","setCompoundDrawables","setCompoundDrawablesWithIntrinsicBoundsByLeft","setCompoundDrawablesWithIntrinsicBoundsByTop","setCompoundDrawablesWithIntrinsicBoundsByRight","setCompoundDrawablesWithIntrinsicBoundsByBottom","setCompoundDrawablesWithIntrinsicBounds","setLayoutManager","setOrientation","setAdapter","notifyItemRemoved","notifyItemInserted","notifyItemMoved","notifyDataSetChanged","attachLinearSnapHelper","attachPagerSnapHelper","addItemDecoration","addItemDecoration","removeItemDecoration","removeItemDecorationAt","removeAllItemDecoration","setOnScrollListener","addOnScrollListener","removeOnScrollListener","clearOnScrollListeners","setNestedScrollingEnabled","forceGetViewSize"));
        ignoreUnPublicMap.put("IPreference", ArrayUtils.asListArgs("registerListener","unregisterListener","put","putAll","putAll","putAll","get","getAll","getAll","remove","removeAll","removeAll","contains","clear","getInt","getLong","getFloat","getDouble","getBoolean","getString","getSet","getInt","getLong","getFloat","getDouble","getBoolean","getString","getSet"));
        ignoreUnPublicMap.put("IPrinter", ArrayUtils.asListArgs("other","getLogConfig","initialize","initialize","d","e","e","e","w","i","v","wtf","json","xml","dTag","eTag","eTag","eTag","wTag","iTag","vTag","wtfTag","jsonTag","xmlTag"));
        ignoreUnPublicMap.put("IToast.Filter", ArrayUtils.asListArgs("filter","handlerContent"));
        ignoreUnPublicMap.put("IToast.Operate", ArrayUtils.asListArgs("reset","setIsHandler","setNullText","setTextLength","initialize","style","defaultStyle","getToastStyle","initStyle","initToastFilter","setView","show","show","show","show","cancel"));
        ignoreUnPublicMap.put("IToast.Style", ArrayUtils.asListArgs("getGravity","getXOffset","getYOffset","getHorizontalMargin","getVerticalMargin","getZ","getCornerRadius","getBackgroundTintColor","getBackground","getTextColor","getTextSize","getMaxLines","getEllipsize","getTypeface","getPadding"));
        ignoreUnPublicMap.put("IToastImpl", ArrayUtils.asListArgs("getThreadToastStyle","createView","priShowToastText","newToastText","priShowToastView","newToastView"));
        ignoreUnPublicMap.put("ImageConvertUtils.BMP", ArrayUtils.asListArgs("addBMPImageHeader","addBMPImageInfosHeader","addBMP_ARGB8888"));
        ignoreUnPublicMap.put("ImageViewUtils", ArrayUtils.asListArgs("getImageViewFieldValue"));
        ignoreUnPublicMap.put("InactivityTimerAssist", ArrayUtils.asListArgs("start","cancel"));
        ignoreUnPublicMap.put("InactivityTimerAssist.InactivityAsyncTask", ArrayUtils.asListArgs("doInBackground"));
        ignoreUnPublicMap.put("IntSort", ArrayUtils.asListArgs("getIntSortValue"));
        ignoreUnPublicMap.put("JCLogUtils", ArrayUtils.asListArgs("isEmpty","printLog","createMessage","concatErrorMessage"));
        ignoreUnPublicMap.put("JCLogUtils.Print", ArrayUtils.asListArgs("printLog"));
        ignoreUnPublicMap.put("KeyBoardUtils", ArrayUtils.asListArgs("getContentViewInvisibleHeight"));
        ignoreUnPublicMap.put("KeyBoardUtils.OnSoftInputChangedListener", ArrayUtils.asListArgs("onSoftInputChanged"));
        ignoreUnPublicMap.put("LocationUtils", ArrayUtils.asListArgs("getCriteria"));
        ignoreUnPublicMap.put("LocationUtils.OnLocationChangeListener", ArrayUtils.asListArgs("getLastKnownLocation","onLocationChanged","onStatusChanged"));
        ignoreUnPublicMap.put("LogPrintUtils", ArrayUtils.asListArgs("isEmpty","printLog","createMessage","concatErrorMessage"));
        ignoreUnPublicMap.put("LogPrintUtils.Print", ArrayUtils.asListArgs("printLog"));
        ignoreUnPublicMap.put("LoggerPrinter", ArrayUtils.asListArgs("isPrintLog","checkLogLevel","finalLogPrinter","logHandle","logHandle","logHandle","logHeaderContent","logTopBorder","logBottomBorder","logDivider","logContent","createMessage","getSimpleClassName","getStackOffset","getThreadLogConfig"));
        ignoreUnPublicMap.put("LongSort", ArrayUtils.asListArgs("getLongSortValue"));
        ignoreUnPublicMap.put("NotificationUtils.Callback", ArrayUtils.asListArgs("callback"));
        ignoreUnPublicMap.put("OnActivityDestroyedListener", ArrayUtils.asListArgs("onActivityDestroyed"));
        ignoreUnPublicMap.put("OnAppStatusChangedListener", ArrayUtils.asListArgs("onForeground","onBackground"));
        ignoreUnPublicMap.put("OnSPOperateListener", ArrayUtils.asListArgs("onPut","onPutByMap","onRemove","onRemoveByList","clear","onGet"));
        ignoreUnPublicMap.put("PermissionUtils", ArrayUtils.asListArgs("isGranted","onRequestPermissionsResultCommon","checkPermissions","requestCallback","getPermissionsStatus"));
        ignoreUnPublicMap.put("PermissionUtils.PermissionActivity", ArrayUtils.asListArgs("start","onCreate"));
        ignoreUnPublicMap.put("PermissionUtils.PermissionCallback", ArrayUtils.asListArgs("onGranted","onDenied"));
        ignoreUnPublicMap.put("PreferenceImpl", ArrayUtils.asListArgs("put","getValue"));
        ignoreUnPublicMap.put("ROMUtils", ArrayUtils.asListArgs("isRightRom","getManufacturer","getBrand","getRomVersion","getSystemProperty","getSystemPropertyByShell","getSystemPropertyByStream","getSystemPropertyByReflect","_getRomInfo"));
        ignoreUnPublicMap.put("RecordConfig", ArrayUtils.asListArgs("getIntervalTimeFolder"));
        ignoreUnPublicMap.put("ReflectUtils", ArrayUtils.asListArgs("forName","forName","getArgsType","sortConstructors","newInstance","getField","getAccessibleField","unwrap","method","exactMethod","similarMethod","sortMethods","isSimilarSignature","match","accessible","property","wrapper"));
        ignoreUnPublicMap.put("ResourceAssist", ArrayUtils.asListArgs("getInstance"));
        ignoreUnPublicMap.put("ScreenSensorAssist", ArrayUtils.asListArgs("initialize"));
        ignoreUnPublicMap.put("ScreenshotUtils", ArrayUtils.asListArgs("registerContentObserver","unregisterContentObserver"));
        ignoreUnPublicMap.put("ScreenshotUtils.OnScreenshotListener", ArrayUtils.asListArgs("onScreenshot"));
        ignoreUnPublicMap.put("ScreenshotUtils.ScreenshotChecker", ArrayUtils.asListArgs("onChange","onChecker"));
        ignoreUnPublicMap.put("ShellUtils", ArrayUtils.asListArgs("consumeInputStream"));
        ignoreUnPublicMap.put("ShortCutUtils", ArrayUtils.asListArgs("getAuthority","getAuthorityFromPermission","getAuthorityFromPermission"));
        ignoreUnPublicMap.put("SignaturesUtils", ArrayUtils.asListArgs("loadCertificates"));
        ignoreUnPublicMap.put("SizeUtils.OnGetSizeListener", ArrayUtils.asListArgs("onGetSize"));
        ignoreUnPublicMap.put("SnackbarUtils", ArrayUtils.asListArgs("priShow","clearLocations","setSnackbarLocation","setLayoutGravity","setMargin"));
        ignoreUnPublicMap.put("SpanUtils", ArrayUtils.asListArgs("apply","applyLast","updateCharCharSequence","updateImage","updateSpace","setDefault","getContext"));
        ignoreUnPublicMap.put("SpanUtils.CustomDynamicDrawableSpan", ArrayUtils.asListArgs("getCachedDrawable"));
        ignoreUnPublicMap.put("SpanUtils.CustomTypefaceSpan", ArrayUtils.asListArgs("apply"));
        ignoreUnPublicMap.put("StringSort", ArrayUtils.asListArgs("getStringSortValue"));
        ignoreUnPublicMap.put("TimeKeeper.OnEndCallback", ArrayUtils.asListArgs("onEnd"));
        ignoreUnPublicMap.put("TimerManager", ArrayUtils.asListArgs("addContainsChecker"));
        ignoreUnPublicMap.put("ToastFactory", ArrayUtils.asListArgs("getWindowManager"));
        ignoreUnPublicMap.put("ToastFactory.BaseToast", ArrayUtils.asListArgs("findTextView"));
        ignoreUnPublicMap.put("ToastFactory.ToastHelper", ArrayUtils.asListArgs("show","cancel"));
        ignoreUnPublicMap.put("ToastTintUtils", ArrayUtils.asListArgs("showToastView","newToastView","inflaterView","reflectToastHandler"));
        ignoreUnPublicMap.put("ToastTintUtils.Filter", ArrayUtils.asListArgs("filter","handlerContent"));
        ignoreUnPublicMap.put("ToastTintUtils.Style", ArrayUtils.asListArgs("getTextColor","getTextSize","getBackgroundTintColor","getBackground","getMaxLines","getEllipsize","getTypeface","getTintIconColor","isTintIcon"));
        ignoreUnPublicMap.put("ToastUtils", ArrayUtils.asListArgs("priShowToastText","handlerToastRes","handlerToastStr","reflectToastHandler"));
        ignoreUnPublicMap.put("ToastUtils.Filter", ArrayUtils.asListArgs("filter","handlerContent"));
        ignoreUnPublicMap.put("UriUtils", ArrayUtils.asListArgs("getFilePathByUri"));
        ignoreUnPublicMap.put("ViewUtils.OnWHListener", ArrayUtils.asListArgs("onWidthHeight"));
        ignoreUnPublicMap.put("WallpaperUtils.OnOtherCallback", ArrayUtils.asListArgs("callback"));
        ignoreUnPublicMap.put("WifiHotUtils", ArrayUtils.asListArgs("intToString"));
        ignoreUnPublicMap.put("WifiHotUtils.OnWifiAPListener", ArrayUtils.asListArgs("onStarted","onStopped","onFailed"));
        ignoreUnPublicMap.put("WifiUtils", ArrayUtils.asListArgs("setStaticWifiConfig","setStaticWifiConfig","inetAddressToInt","setDNS","setGateway","setIpAddress","setStaticIpConfig","getField","getDeclaredField","setEnumField","setValueField"));
        ignoreUnPublicMap.put("WindowAssist", ArrayUtils.asListArgs("getInstance"));
        ignoreUnPublicMap.put("WindowsExplorerStringSimpleComparator", ArrayUtils.asListArgs("innerCompare","getSplitFileName"));
        ignoreUnPublicMap.put("WindowsExplorerStringSimpleComparator2", ArrayUtils.asListArgs("innerCompare","splitStringPreserveDelimiter"));
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
        ignoreModifierVariableMap.put("WindowsExplorerStringSimpleComparator", ArrayUtils.asListArgs("        String name;","        Long number;","        String numberText;","        String ext;"));
        ignoreModifierVariableMap.put("WindowsExplorerStringSimpleComparator.SplitFileName", ArrayUtils.asListArgs("    String name;","    Long number;","    String numberText;","    String ext;"));

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
        ignoreReturnVoidMap.put("ActivityLifecycleAssist.ActivityLifecycleImpl", ArrayUtils.asListArgs("setTopActivity - void","addOnAppStatusChangedListener - void","removeOnAppStatusChangedListener - void","removeAllOnAppStatusChangedListener - void","addOnActivityDestroyedListener - void","removeOnActivityDestroyedListener - void","removeAllOnActivityDestroyedListener - void","postStatus - void","consumeOnActivityDestroyedListener - void"));
        ignoreReturnVoidMap.put("ActivityLifecycleNotify", ArrayUtils.asListArgs("addOnAppStatusChangedListener - void","removeOnAppStatusChangedListener - void","removeAllOnAppStatusChangedListener - void","addOnActivityDestroyedListener - void","removeOnActivityDestroyedListener - void","removeAllOnActivityDestroyedListener - void"));
        ignoreReturnVoidMap.put("ActivityUtils.ResultCallback", ArrayUtils.asListArgs("onActivityResult - void"));
        ignoreReturnVoidMap.put("AppInfoUtils", ArrayUtils.asListArgs("printAppPermission - void"));
        ignoreReturnVoidMap.put("AutoFocusAssist", ArrayUtils.asListArgs("setFocusModes - void","setAutoFocus - void","onAutoFocus - void","autoFocusAgainLater - void","start - void","stop - void","cancelOutstandingTask - void"));
        ignoreReturnVoidMap.put("BarUtils", ArrayUtils.asListArgs("addMarginTopEqualStatusBarHeight - void","subtractMarginTopEqualStatusBarHeight - void","hideStatusBarView - void","hideStatusBarView - void","showStatusBarView - void"));
        ignoreReturnVoidMap.put("BeepVibrateAssist", ArrayUtils.asListArgs("streamUpdate - void","close - void"));
        ignoreReturnVoidMap.put("BigDecimalUtils", ArrayUtils.asListArgs("setScale - void"));
        ignoreReturnVoidMap.put("BigDecimalUtils.Operation", ArrayUtils.asListArgs("throwException - void"));
        ignoreReturnVoidMap.put("CalendarUtils", ArrayUtils.asListArgs("setFestivalHook - void"));
        ignoreReturnVoidMap.put("CameraAssist", ArrayUtils.asListArgs("closeDriver - void","startPreview - void","stopPreview - void","freeCameraResource - void"));
        ignoreReturnVoidMap.put("CameraAssist.PreviewNotify", ArrayUtils.asListArgs("stopPreviewNotify - void","startPreviewNotify - void"));
        ignoreReturnVoidMap.put("CameraUtils", ArrayUtils.asListArgs("freeCameraResource - void"));
        ignoreReturnVoidMap.put("CapturePictureUtils", ArrayUtils.asListArgs("setBitmapConfig - void","setBackgroundColor - void","setPaint - void","enableSlowWholeDocumentDraw - void"));
        ignoreReturnVoidMap.put("ClickUtils", ArrayUtils.asListArgs("setCheckViewId - void","setGlobalIntervalTime - void","remove - void"));
        ignoreReturnVoidMap.put("ClickUtils.OnCountClickListener", ArrayUtils.asListArgs("doClick - void","doInvalidClick - void"));
        ignoreReturnVoidMap.put("ClickUtils.OnDebouncingClickListener", ArrayUtils.asListArgs("doClick - void","doInvalidClick - void"));
        ignoreReturnVoidMap.put("ClickUtils.OnMultiClickListener", ArrayUtils.asListArgs("doMultiClick - void"));
        ignoreReturnVoidMap.put("CloseUtils", ArrayUtils.asListArgs("closeIO - void","closeIOQuietly - void","flush - void","flushQuietly - void","flushCloseIO - void","flushCloseIOQuietly - void","flushCloseIO - void","flushCloseIOQuietly - void"));
        ignoreReturnVoidMap.put("CollectionUtils.ArrayWithTypeToken", ArrayUtils.asListArgs("put - void","newInstance - void","newInstance - void"));
        ignoreReturnVoidMap.put("ColorUtils", ArrayUtils.asListArgs("setParser - void","sortGray - void","sortHUE - void","sortSaturation - void","sortBrightness - void"));
        ignoreReturnVoidMap.put("ColorUtils.ColorInfo", ArrayUtils.asListArgs("priConvert - void"));
        ignoreReturnVoidMap.put("ConvertUtils", ArrayUtils.asListArgs("bytesBitwiseAND - void"));
        ignoreReturnVoidMap.put("CrashUtils", ArrayUtils.asListArgs("initialize - void","uncaughtException - void"));
        ignoreReturnVoidMap.put("CrashUtils.CrashCatchListener", ArrayUtils.asListArgs("handleException - void","uncaughtException - void"));
        ignoreReturnVoidMap.put("DelayAssist", ArrayUtils.asListArgs("remove - void","post - void","post - void"));
        ignoreReturnVoidMap.put("DelayAssist.Callback", ArrayUtils.asListArgs("callback - void"));
        ignoreReturnVoidMap.put("DevCache", ArrayUtils.asListArgs("remove - void","removeForKeys - void","clear - void","clearDue - void","clearType - void"));
        ignoreReturnVoidMap.put("DevCacheManager", ArrayUtils.asListArgs("calculateCacheSizeAndCacheCount - void"));
        ignoreReturnVoidMap.put("DevCommonUtils", ArrayUtils.asListArgs("sleepOperate - void","sleepOperate - void"));
        ignoreReturnVoidMap.put("DevLogger", ArrayUtils.asListArgs("initialize - void","d - void","e - void","e - void","e - void","w - void","i - void","v - void","wtf - void","json - void","xml - void","dTag - void","eTag - void","eTag - void","eTag - void","wTag - void","iTag - void","vTag - void","wtfTag - void","jsonTag - void","xmlTag - void","setPrint - void"));
        ignoreReturnVoidMap.put("DevLogger.Print", ArrayUtils.asListArgs("printLog - void"));
        ignoreReturnVoidMap.put("DevMediaManager", ArrayUtils.asListArgs("createMedia - void","destroyMedia - void","bindListener - void","pause - void","stop - void","onVideoSizeChanged - void","onPrepared - void","onCompletion - void","onBufferingUpdate - void","onSeekComplete - void","clearMediaPlayerData - void"));
        ignoreReturnVoidMap.put("DevMediaManager.MediaListener", ArrayUtils.asListArgs("onPrepared - void","onCompletion - void","onBufferingUpdate - void","onSeekComplete - void","onVideoSizeChanged - void"));
        ignoreReturnVoidMap.put("DevMediaManager.MediaSet", ArrayUtils.asListArgs("setMediaConfig - void"));
        ignoreReturnVoidMap.put("DevThreadManager", ArrayUtils.asListArgs("initConfig - void","putConfig - void","removeConfig - void"));
        ignoreReturnVoidMap.put("DevThreadPool", ArrayUtils.asListArgs("execute - void","execute - void","execute - void","shutdown - void"));
        ignoreReturnVoidMap.put("DevTimer.Callback", ArrayUtils.asListArgs("callback - void"));
        ignoreReturnVoidMap.put("DevToast", ArrayUtils.asListArgs("reset - void","setIsHandler - void","setNullText - void","setTextLength - void","initialize - void","initStyle - void","initToastFilter - void","setView - void","show - void","show - void","show - void","show - void","cancel - void"));
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
        ignoreReturnVoidMap.put("FileRecordUtils", ArrayUtils.asListArgs("setHandler - void","setRecordInsert - void","setCallback - void"));
        ignoreReturnVoidMap.put("FileRecordUtils.Callback", ArrayUtils.asListArgs("callback - void"));
        ignoreReturnVoidMap.put("FloatingWindowManagerAssist2", ArrayUtils.asListArgs("removeAllFloatingView - void","updateViewLayout - void","setNeedsAdd - void"));
        ignoreReturnVoidMap.put("ForUtils.BooleanConsumer", ArrayUtils.asListArgs("accept - void"));
        ignoreReturnVoidMap.put("ForUtils.ByteConsumer", ArrayUtils.asListArgs("accept - void"));
        ignoreReturnVoidMap.put("ForUtils.CharConsumer", ArrayUtils.asListArgs("accept - void"));
        ignoreReturnVoidMap.put("ForUtils.Consumer", ArrayUtils.asListArgs("accept - void"));
        ignoreReturnVoidMap.put("ForUtils.ConsumerSimple", ArrayUtils.asListArgs("accept - void"));
        ignoreReturnVoidMap.put("ForUtils.DoubleConsumer", ArrayUtils.asListArgs("accept - void"));
        ignoreReturnVoidMap.put("ForUtils.FloatConsumer", ArrayUtils.asListArgs("accept - void"));
        ignoreReturnVoidMap.put("ForUtils.IntConsumer", ArrayUtils.asListArgs("accept - void"));
        ignoreReturnVoidMap.put("ForUtils.LongConsumer", ArrayUtils.asListArgs("accept - void"));
        ignoreReturnVoidMap.put("ForUtils.ShortConsumer", ArrayUtils.asListArgs("accept - void"));
        ignoreReturnVoidMap.put("HandlerUtils", ArrayUtils.asListArgs("postRunnable - void","postRunnable - void","postRunnable - void","postRunnable - void","removeRunnable - void","clearRunnableMaps - void","postRunnable - void","removeRunnable - void"));
        ignoreReturnVoidMap.put("HandlerUtils.OnEndListener", ArrayUtils.asListArgs("onEnd - void"));
        ignoreReturnVoidMap.put("HttpURLConnectionUtils", ArrayUtils.asListArgs("doGetAsync - void","doPostAsync - void","request - void","getNetTime - void","getNetTime - void","reqNetTime - void"));
        ignoreReturnVoidMap.put("HttpURLConnectionUtils.Callback", ArrayUtils.asListArgs("onResponse - void","onFail - void"));
        ignoreReturnVoidMap.put("HttpURLConnectionUtils.TimeCallback", ArrayUtils.asListArgs("onResponse - void","onFail - void"));
        ignoreReturnVoidMap.put("IFloatingOperate", ArrayUtils.asListArgs("removeAllFloatingView - void","updateViewLayout - void","setNeedsAdd - void"));
        ignoreReturnVoidMap.put("IFloatingTouch", ArrayUtils.asListArgs("updateViewLayout - void"));
        ignoreReturnVoidMap.put("IPreference", ArrayUtils.asListArgs("registerListener - void","unregisterListener - void","put - void","putAll - void","putAll - void","putAll - void","remove - void","removeAll - void","removeAll - void","clear - void"));
        ignoreReturnVoidMap.put("IPrinter", ArrayUtils.asListArgs("initialize - void","d - void","e - void","e - void","e - void","w - void","i - void","v - void","wtf - void","json - void","xml - void","dTag - void","eTag - void","eTag - void","eTag - void","wTag - void","iTag - void","vTag - void","wtfTag - void","jsonTag - void","xmlTag - void"));
        ignoreReturnVoidMap.put("IToast.Operate", ArrayUtils.asListArgs("reset - void","setIsHandler - void","setNullText - void","setTextLength - void","initialize - void","initStyle - void","initToastFilter - void","setView - void","show - void","show - void","show - void","show - void","cancel - void"));
        ignoreReturnVoidMap.put("IToastImpl", ArrayUtils.asListArgs("reset - void","setIsHandler - void","setNullText - void","setTextLength - void","initialize - void","initStyle - void","initToastFilter - void","setView - void","show - void","show - void","show - void","show - void","cancel - void","priShowToastText - void","priShowToastView - void"));
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
        ignoreReturnVoidMap.put("LoggerPrinter", ArrayUtils.asListArgs("initialize - void","d - void","e - void","e - void","e - void","w - void","i - void","v - void","wtf - void","json - void","xml - void","dTag - void","eTag - void","eTag - void","eTag - void","wTag - void","iTag - void","vTag - void","wtfTag - void","jsonTag - void","xmlTag - void","finalLogPrinter - void","logHandle - void","logHandle - void","logHandle - void","logHeaderContent - void","logTopBorder - void","logBottomBorder - void","logDivider - void","logContent - void"));
        ignoreReturnVoidMap.put("OnActivityDestroyedListener", ArrayUtils.asListArgs("onActivityDestroyed - void"));
        ignoreReturnVoidMap.put("OnAppStatusChangedListener", ArrayUtils.asListArgs("onForeground - void","onBackground - void"));
        ignoreReturnVoidMap.put("OnSPOperateListener", ArrayUtils.asListArgs("onPut - void","onPutByMap - void","onRemove - void","onRemoveByList - void","clear - void","onGet - void"));
        ignoreReturnVoidMap.put("PermissionUtils", ArrayUtils.asListArgs("request - void","request - void","onRequestPermissionsResultCommon - void","onRequestPermissionsResult - void","notifyPermissionsChange - void","requestCallback - void","getPermissionsStatus - void"));
        ignoreReturnVoidMap.put("PermissionUtils.PermissionActivity", ArrayUtils.asListArgs("start - void","onCreate - void","onRequestPermissionsResult - void"));
        ignoreReturnVoidMap.put("PermissionUtils.PermissionCallback", ArrayUtils.asListArgs("onGranted - void","onDenied - void"));
        ignoreReturnVoidMap.put("PreferenceImpl", ArrayUtils.asListArgs("registerListener - void","unregisterListener - void","put - void","putAll - void","putAll - void","putAll - void","remove - void","removeAll - void","removeAll - void","clear - void"));
        ignoreReturnVoidMap.put("ProcessUtils", ArrayUtils.asListArgs("kill - void","kill - void"));
        ignoreReturnVoidMap.put("ReflectUtils", ArrayUtils.asListArgs("sortConstructors - void","sortMethods - void"));
        ignoreReturnVoidMap.put("ScreenSensorAssist", ArrayUtils.asListArgs("initialize - void"));
        ignoreReturnVoidMap.put("ScreenshotUtils", ArrayUtils.asListArgs("handleMediaContentChange - void"));
        ignoreReturnVoidMap.put("ScreenshotUtils.OnScreenshotListener", ArrayUtils.asListArgs("onScreenshot - void"));
        ignoreReturnVoidMap.put("ScreenshotUtils.ScreenshotChecker", ArrayUtils.asListArgs("onChange - void","onChecker - void"));
        ignoreReturnVoidMap.put("SharedUtils", ArrayUtils.asListArgs("registerListener - void","unregisterListener - void","put - void","putAll - void","putAll - void","putAll - void","remove - void","removeAll - void","removeAll - void","clear - void"));
        ignoreReturnVoidMap.put("SizeUtils.OnGetSizeListener", ArrayUtils.asListArgs("onGetSize - void"));
        ignoreReturnVoidMap.put("SnackbarUtils", ArrayUtils.asListArgs("dismiss - void","dismiss - void","showShort - void","showLong - void","showIndefinite - void","showShort - void","showLong - void","showIndefinite - void","priShow - void","clearLocations - void","setSnackbarLocation - void"));
        ignoreReturnVoidMap.put("SpanUtils", ArrayUtils.asListArgs("apply - void","applyLast - void","updateCharCharSequence - void","updateImage - void","updateSpace - void","setDefault - void"));
        ignoreReturnVoidMap.put("TimeKeeper", ArrayUtils.asListArgs("waitForEndAsync - void","waitForEnd - void"));
        ignoreReturnVoidMap.put("TimeKeeper.OnEndCallback", ArrayUtils.asListArgs("onEnd - void"));
        ignoreReturnVoidMap.put("TimerManager", ArrayUtils.asListArgs("addContainsChecker - void","recycle - void","closeAll - void","closeAllNotRunning - void","closeAllInfinite - void","closeAllTag - void","closeAllUUID - void","startTimer - void","stopTimer - void"));
        ignoreReturnVoidMap.put("ToastFactory.ToastHelper", ArrayUtils.asListArgs("show - void","cancel - void"));
        ignoreReturnVoidMap.put("ToastTintUtils", ArrayUtils.asListArgs("reset - void","setToastFilter - void","setIsHandler - void","setNullText - void","setUseConfig - void","setGravity - void","setMargin - void","setNormalStyle - void","setInfoStyle - void","setWarningStyle - void","setErrorStyle - void","setSuccessStyle - void","normal - void","normal - void","normal - void","normal - void","normal - void","normal - void","normal - void","normal - void","info - void","info - void","info - void","info - void","info - void","info - void","info - void","info - void","warning - void","warning - void","warning - void","warning - void","warning - void","warning - void","warning - void","warning - void","error - void","error - void","error - void","error - void","error - void","error - void","error - void","error - void","success - void","success - void","success - void","success - void","success - void","success - void","success - void","success - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","showToastView - void","reflectToastHandler - void"));
        ignoreReturnVoidMap.put("ToastUtils", ArrayUtils.asListArgs("reset - void","setToastFilter - void","setIsHandler - void","setNullText - void","setUseConfig - void","setGravity - void","setMargin - void","showShort - void","showShort - void","showShort - void","showShort - void","showLong - void","showLong - void","showLong - void","showLong - void","showToast - void","showToast - void","showToast - void","showToast - void","showShortNew - void","showShortNew - void","showShortNew - void","showShortNew - void","showLongNew - void","showLongNew - void","showLongNew - void","showLongNew - void","showToastNew - void","showToastNew - void","showToastNew - void","showToastNew - void","priShowToastText - void","showToastView - void","showToastView - void","showToastView - void","showToastView - void","showToastView - void","handlerToastRes - void","handlerToastStr - void","reflectToastHandler - void"));
        ignoreReturnVoidMap.put("ViewUtils.OnWHListener", ArrayUtils.asListArgs("onWidthHeight - void"));
        ignoreReturnVoidMap.put("WallpaperUtils", ArrayUtils.asListArgs("forgetLoadedWallpaper - void"));
        ignoreReturnVoidMap.put("WeakReferenceAssist", ArrayUtils.asListArgs("clear - void"));
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