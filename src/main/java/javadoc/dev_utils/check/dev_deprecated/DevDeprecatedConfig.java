package javadoc.dev_utils.check.dev_deprecated;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dev.utils.common.ArrayUtils;
import javadoc.dev_utils.check.dev.ICheckConfig;

/**
 * detail: DevDeprecatedConfig 代码检测分析配置
 * @author Ttt
 */
final class DevDeprecatedConfig implements ICheckConfig {

    /**
     * 获取忽略指定方法注释配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreAnnotateMap() {
        Map<String, List<String>> ignoreAnnotateMap = new HashMap<>();
        ignoreAnnotateMap.put("AutoFocusAssist.AutoFocusTask", ArrayUtils.asListArgs("doInBackground"));
        ignoreAnnotateMap.put("DefaultActivityResult.ResultActivity", ArrayUtils.asListArgs("onCreate","onActivityResult","onDestroy","onCreate","onActivityResult","onDestroy"));
        ignoreAnnotateMap.put("ToastFactory.BaseToast", ArrayUtils.asListArgs("setView","setText"));
        ignoreAnnotateMap.put("ToastFactory.NotificationToast", ArrayUtils.asListArgs("show","cancel"));
        ignoreAnnotateMap.put("ToastFactory.SafeToast.SafeHandler", ArrayUtils.asListArgs("handleMessage","dispatchMessage"));
        ignoreAnnotateMap.put("ToastFactory.ToastHelper", ArrayUtils.asListArgs("handleMessage"));
        ignoreAnnotateMap.put("ToastTintUtils.SafeHandler", ArrayUtils.asListArgs("handleMessage","dispatchMessage"));
        ignoreAnnotateMap.put("ToastUtils.SafeHandler", ArrayUtils.asListArgs("handleMessage","dispatchMessage"));
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
        ignoreFinalMap.put("AutoFocusAssist", ArrayUtils.asListArgs("onAutoFocus"));
        ignoreFinalMap.put("AutoFocusAssist.AutoFocusTask", ArrayUtils.asListArgs("doInBackground"));
        ignoreFinalMap.put("CameraSizeAssist", ArrayUtils.asListArgs("setPreviewSize","setPictureSize","calcPreviewSize","calcPictureSize","calcVideoSize"));
        ignoreFinalMap.put("CameraUtils", ArrayUtils.asListArgs("initCamera","open"));
        ignoreFinalMap.put("DefaultActivityResult.ResultActivity", ArrayUtils.asListArgs("onCreate","onActivityResult","onCreate","onActivityResult"));
        ignoreFinalMap.put("IToastImpl", ArrayUtils.asListArgs("filter","handlerContent"));
        ignoreFinalMap.put("PermissionUtils.PermissionActivity", ArrayUtils.asListArgs("onCreate","onRequestPermissionsResult"));
        ignoreFinalMap.put("ToastFactory.BaseToast", ArrayUtils.asListArgs("setView","setText"));
        ignoreFinalMap.put("ToastFactory.SafeToast.SafeHandler", ArrayUtils.asListArgs("handleMessage","dispatchMessage"));
        ignoreFinalMap.put("ToastFactory.ToastHelper", ArrayUtils.asListArgs("handleMessage"));
        ignoreFinalMap.put("ToastTintUtils", ArrayUtils.asListArgs("newToastView","inflaterView"));
        ignoreFinalMap.put("ToastTintUtils.SafeHandler", ArrayUtils.asListArgs("handleMessage","dispatchMessage"));
        ignoreFinalMap.put("ToastUtils", ArrayUtils.asListArgs("newToastText","newToastView","handlerToastRes","handlerToastStr"));
        ignoreFinalMap.put("ToastUtils.SafeHandler", ArrayUtils.asListArgs("handleMessage","dispatchMessage"));

        return ignoreFinalMap;
    }

    /**
     * 获取忽略指定方法 static 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreStaticMap() {
        Map<String, List<String>> ignoreStaticMap = new HashMap<>();
        ignoreStaticMap.put("AutoFocusAssist", ArrayUtils.asListArgs("isAutoFocus","setAutoFocus","onAutoFocus","autoFocusAgainLater","start","stop","cancelOutstandingTask"));
        ignoreStaticMap.put("AutoFocusAssist.AutoFocusTask", ArrayUtils.asListArgs("doInBackground"));
        ignoreStaticMap.put("CameraAssist", ArrayUtils.asListArgs("openDriver","closeDriver","startPreview","stopPreview","freeCameraResource","getCameraResolution","getPreviewSize","getCameraSizeAssist","getCamera","setCamera","setPreviewNotify","setAutoFocus","isPreviewing","setAutoInterval","setFlashlightOn","setFlashlightOff","isFlashlightOn"));
        ignoreStaticMap.put("CameraSizeAssist", ArrayUtils.asListArgs("getCamera","setPreviewSize","setPreviewSize","getPreviewSize","getPreviewSize","getPreviewSize","getPreviewSize","setPictureSize","setPictureSize","getPictureSize","getPictureSize","getPictureSize","getPictureSize","getPictureSize","getPictureSize","getVideoSize","getVideoSize","getVideoSize","getVideoSize","getVideoSize","getVideoSize","calcPreviewSize","calcPictureSize","calcVideoSize"));
        ignoreStaticMap.put("DefaultActivityResult", ArrayUtils.asListArgs("startActivityForResult","startActivityForResult"));
        ignoreStaticMap.put("DefaultActivityResult.ResultActivity", ArrayUtils.asListArgs("onCreate","onActivityResult","onDestroy","onCreate","onActivityResult","onDestroy"));
        ignoreStaticMap.put("DefaultToastStyle", ArrayUtils.asListArgs("getGravity","getXOffset","getYOffset","getHorizontalMargin","getVerticalMargin","getZ","getCornerRadius","getBackgroundTintColor","getBackground","getTextColor","getTextSize","getMaxLines","getEllipsize","getTypeface","getPadding"));
        ignoreStaticMap.put("IToastImpl", ArrayUtils.asListArgs("reset","setUseHandler","setNullText","setTextLength","initialize","style","defaultStyle","getToastStyle","initStyle","initToastFilter","setView","show","show","show","show","cancel","filter","handlerContent","getThreadToastStyle","createView","innerShowToastText","newToastText","innerShowToastView","newToastView"));
        ignoreStaticMap.put("PermissionUtils", ArrayUtils.asListArgs("callback","setRequestPermissionsResult","request","request","onRequestPermissionsResultCommon","checkPermissions","requestCallback","getPermissionsStatus"));
        ignoreStaticMap.put("PermissionUtils.PermissionActivity", ArrayUtils.asListArgs("onCreate","onRequestPermissionsResult"));
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
        ignoreStaticMap.put("WidgetAttrs", ArrayUtils.asListArgs("getMaxWidth","setMaxWidth","getMaxHeight","setMaxHeight","isSlide","setSlide","toggleSlide","getMaxWidth","setMaxWidth","getMaxHeight","setMaxHeight","isSlide","setSlide","toggleSlide"));
        ignoreStaticMap.put("WifiHotUtils", ArrayUtils.asListArgs("startWifiAp","closeWifiAp","getWifiApState","getWifiApConfiguration","setWifiApConfiguration","isOpenWifiAp","closeWifiApCheck","isConnectHot","getHotspotServiceIp","getHotspotAllotIp","getConnectHotspotMsg","getHotspotSplitIpMask","intToString","getApWifiSSID","getApWifiPwd","setOnWifiAPListener"));
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
        ignoreParamMap.put("AutoFocusAssist.AutoFocusTask", ArrayUtils.asListArgs("doInBackground"));
        ignoreParamMap.put("DefaultActivityResult.ResultActivity", ArrayUtils.asListArgs("onCreate","onActivityResult","onCreate","onActivityResult"));
        ignoreParamMap.put("ToastFactory.BaseToast", ArrayUtils.asListArgs("setView","setText"));
        ignoreParamMap.put("ToastFactory.SafeToast.SafeHandler", ArrayUtils.asListArgs("handleMessage","dispatchMessage"));
        ignoreParamMap.put("ToastFactory.ToastHelper", ArrayUtils.asListArgs("handleMessage"));
        ignoreParamMap.put("ToastTintUtils.SafeHandler", ArrayUtils.asListArgs("handleMessage","dispatchMessage"));
        ignoreParamMap.put("ToastUtils.SafeHandler", ArrayUtils.asListArgs("handleMessage","dispatchMessage"));
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
        
        return ignoreReturnMap;
    }

    /**
     * 获取忽略指定方法非 public 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreUnPublicMap() {
        Map<String, List<String>> ignoreUnPublicMap = new HashMap<>();
        ignoreUnPublicMap.put("AutoFocusAssist", ArrayUtils.asListArgs("autoFocusAgainLater","cancelOutstandingTask"));
        ignoreUnPublicMap.put("AutoFocusAssist.AutoFocusTask", ArrayUtils.asListArgs("doInBackground"));
        ignoreUnPublicMap.put("CameraAssist", ArrayUtils.asListArgs("freeCameraResource"));
        ignoreUnPublicMap.put("CameraAssist.PreviewNotify", ArrayUtils.asListArgs("stopPreviewNotify","startPreviewNotify"));
        ignoreUnPublicMap.put("CameraSizeAssist", ArrayUtils.asListArgs("calcPreviewSize","calcPictureSize","calcVideoSize"));
        ignoreUnPublicMap.put("DefaultActivityResult.ResultActivity", ArrayUtils.asListArgs("start","onCreate","onActivityResult","onDestroy","start","onCreate","onActivityResult","onDestroy"));
        ignoreUnPublicMap.put("DefaultActivityResult.ResultCallback", ArrayUtils.asListArgs("onStartActivityForResult","onActivityResult","onStartActivityForResult","onActivityResult"));
        ignoreUnPublicMap.put("IToast.Filter", ArrayUtils.asListArgs("filter","handlerContent"));
        ignoreUnPublicMap.put("IToast.Operate", ArrayUtils.asListArgs("reset","setUseHandler","setNullText","setTextLength","initialize","style","defaultStyle","getToastStyle","initStyle","initToastFilter","setView","show","show","show","show","cancel"));
        ignoreUnPublicMap.put("IToast.Style", ArrayUtils.asListArgs("getGravity","getXOffset","getYOffset","getHorizontalMargin","getVerticalMargin","getZ","getCornerRadius","getBackgroundTintColor","getBackground","getTextColor","getTextSize","getMaxLines","getEllipsize","getTypeface","getPadding"));
        ignoreUnPublicMap.put("IToastImpl", ArrayUtils.asListArgs("getThreadToastStyle","createView","innerShowToastText","newToastText","innerShowToastView","newToastView"));
        ignoreUnPublicMap.put("ImageConvertUtils.BMP", ArrayUtils.asListArgs("addBMPImageHeader","addBMPImageInfosHeader","addBMP_ARGB8888"));
        ignoreUnPublicMap.put("PermissionUtils", ArrayUtils.asListArgs("isGranted","onRequestPermissionsResultCommon","checkPermissions","requestCallback","getPermissionsStatus"));
        ignoreUnPublicMap.put("PermissionUtils.PermissionActivity", ArrayUtils.asListArgs("start","onCreate"));
        ignoreUnPublicMap.put("PermissionUtils.PermissionCallback", ArrayUtils.asListArgs("onGranted","onDenied"));
        ignoreUnPublicMap.put("ToastFactory", ArrayUtils.asListArgs("getWindowManager"));
        ignoreUnPublicMap.put("ToastFactory.BaseToast", ArrayUtils.asListArgs("findTextView"));
        ignoreUnPublicMap.put("ToastFactory.ToastHelper", ArrayUtils.asListArgs("show","cancel"));
        ignoreUnPublicMap.put("ToastTintUtils", ArrayUtils.asListArgs("showToastView","newToastView","inflaterView","reflectToastHandler"));
        ignoreUnPublicMap.put("ToastTintUtils.Filter", ArrayUtils.asListArgs("filter","handlerContent"));
        ignoreUnPublicMap.put("ToastTintUtils.Style", ArrayUtils.asListArgs("getTextColor","getTextSize","getBackgroundTintColor","getBackground","getMaxLines","getEllipsize","getTypeface","getTintIconColor","isTintIcon"));
        ignoreUnPublicMap.put("ToastUtils", ArrayUtils.asListArgs("innerShowToastText","handlerToastRes","handlerToastStr","reflectToastHandler"));
        ignoreUnPublicMap.put("ToastUtils.Filter", ArrayUtils.asListArgs("filter","handlerContent"));
        ignoreUnPublicMap.put("WifiHotUtils", ArrayUtils.asListArgs("intToString"));
        ignoreUnPublicMap.put("WifiHotUtils.OnWifiAPListener", ArrayUtils.asListArgs("onStarted","onStopped","onFailed"));
        ignoreUnPublicMap.put("WifiUtils", ArrayUtils.asListArgs("setStaticWifiConfig","setStaticWifiConfig","inetAddressToInt","setDNS","setGateway","setIpAddress","setStaticIpConfig","getField","getDeclaredField","setEnumField","setValueField"));

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
        ignoreReturnVoidMap.put("AutoFocusAssist", ArrayUtils.asListArgs("setFocusModes - void","setAutoFocus - void","onAutoFocus - void","autoFocusAgainLater - void","start - void","stop - void","cancelOutstandingTask - void"));
        ignoreReturnVoidMap.put("CameraAssist", ArrayUtils.asListArgs("closeDriver - void","startPreview - void","stopPreview - void","freeCameraResource - void"));
        ignoreReturnVoidMap.put("CameraAssist.PreviewNotify", ArrayUtils.asListArgs("stopPreviewNotify - void","startPreviewNotify - void"));
        ignoreReturnVoidMap.put("CameraUtils", ArrayUtils.asListArgs("freeCameraResource - void"));
        ignoreReturnVoidMap.put("DefaultActivityResult.ResultCallback", ArrayUtils.asListArgs("onActivityResult - void","onActivityResult - void"));
        ignoreReturnVoidMap.put("DevToast", ArrayUtils.asListArgs("reset - void","setUseHandler - void","setNullText - void","setTextLength - void","initialize - void","initStyle - void","initToastFilter - void","setView - void","show - void","show - void","show - void","show - void","cancel - void"));
        ignoreReturnVoidMap.put("IToast.Operate", ArrayUtils.asListArgs("reset - void","setUseHandler - void","setNullText - void","setTextLength - void","initialize - void","initStyle - void","initToastFilter - void","setView - void","show - void","show - void","show - void","show - void","cancel - void"));
        ignoreReturnVoidMap.put("IToastImpl", ArrayUtils.asListArgs("reset - void","setUseHandler - void","setNullText - void","setTextLength - void","initialize - void","initStyle - void","initToastFilter - void","setView - void","show - void","show - void","show - void","show - void","cancel - void","innerShowToastText - void","innerShowToastView - void"));
        ignoreReturnVoidMap.put("PermissionUtils", ArrayUtils.asListArgs("request - void","request - void","onRequestPermissionsResultCommon - void","onRequestPermissionsResult - void","notifyPermissionsChange - void","requestCallback - void","getPermissionsStatus - void"));
        ignoreReturnVoidMap.put("PermissionUtils.PermissionActivity", ArrayUtils.asListArgs("start - void","onCreate - void","onRequestPermissionsResult - void"));
        ignoreReturnVoidMap.put("PermissionUtils.PermissionCallback", ArrayUtils.asListArgs("onGranted - void","onDenied - void"));
        ignoreReturnVoidMap.put("ToastFactory.ToastHelper", ArrayUtils.asListArgs("show - void","cancel - void"));
        ignoreReturnVoidMap.put("ToastTintUtils", ArrayUtils.asListArgs("reset - void","setToastFilter - void","setUseHandler - void","setNullText - void","setUseConfig - void","setGravity - void","setMargin - void","setNormalStyle - void","setInfoStyle - void","setWarningStyle - void","setErrorStyle - void","setSuccessStyle - void","normal - void","normal - void","normal - void","normal - void","normal - void","normal - void","normal - void","normal - void","info - void","info - void","info - void","info - void","info - void","info - void","info - void","info - void","warning - void","warning - void","warning - void","warning - void","warning - void","warning - void","warning - void","warning - void","error - void","error - void","error - void","error - void","error - void","error - void","error - void","error - void","success - void","success - void","success - void","success - void","success - void","success - void","success - void","success - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","custom - void","showToastView - void","reflectToastHandler - void"));
        ignoreReturnVoidMap.put("ToastUtils", ArrayUtils.asListArgs("reset - void","setToastFilter - void","setUseHandler - void","setNullText - void","setUseConfig - void","setGravity - void","setMargin - void","showShort - void","showShort - void","showShort - void","showShort - void","showLong - void","showLong - void","showLong - void","showLong - void","showToast - void","showToast - void","showToast - void","showToast - void","showShortNew - void","showShortNew - void","showShortNew - void","showShortNew - void","showLongNew - void","showLongNew - void","showLongNew - void","showLongNew - void","showToastNew - void","showToastNew - void","showToastNew - void","showToastNew - void","innerShowToastText - void","showToastView - void","showToastView - void","showToastView - void","showToastView - void","showToastView - void","handlerToastRes - void","handlerToastStr - void","reflectToastHandler - void"));
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
        
    }
}