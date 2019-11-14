package javadoc.dev_utils.check.dev_other;

import javadoc.Utils;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * detail: 代码检测分析配置
 * @author Ttt
 */
final class DevOtherConfig {

    private DevOtherConfig() {
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
        sIgnoreAnnotateMap.put("AccessibilityListenerService", Utils.asList(
                "onCreate", "onDestroy"));
        sIgnoreAnnotateMap.put("GlideTransformUtils.GlideBlurformation", Utils.asList(
                "transform", "updateDiskCacheKey"));
        sIgnoreAnnotateMap.put("GlideTransformUtils.GlideCircleTransform", Utils.asList(
                "transform", "circleCrop", "updateDiskCacheKey"));
        sIgnoreAnnotateMap.put("GlideTransformUtils.GlideRoundTransform", Utils.asList(
                "transform", "roundCrop", "updateDiskCacheKey"));
        sIgnoreAnnotateMap.put("GlideTransformUtils.RotateTransformation", Utils.asList(
                "transform", "updateDiskCacheKey"));
        sIgnoreAnnotateMap.put("GlideUtils", Utils.asList(
                "with", "with", "with", "with", "with", "with"));
        sIgnoreAnnotateMap.put("NetWorkReceiver", Utils.asList("onReceive"));
        sIgnoreAnnotateMap.put("NotificationService", Utils.asList(
                "onCreate", "onDestroy", "onStartCommand"));
        sIgnoreAnnotateMap.put("PhoneReceiver", Utils.asList("onReceive"));
        sIgnoreAnnotateMap.put("ScreenReceiver", Utils.asList("onReceive"));
        sIgnoreAnnotateMap.put("SmsReceiver", Utils.asList("onReceive"));
        sIgnoreAnnotateMap.put("TimeReceiver", Utils.asList("onReceive"));
        sIgnoreAnnotateMap.put("WifiReceiver", Utils.asList("onReceive"));
    }

    // =

    /**
     * 初始化 忽略指定方法参数 final 修饰符
     */
    private static void initIgnoreFinalMap() {
        sIgnoreFinalMap.put("AccessibilityListenerService", Utils.asList(
                "onAccessibilityEvent"));
        sIgnoreFinalMap.put("GlideTransformUtils.GlideBlurformation", Utils.asList(
                "transform", "updateDiskCacheKey", "blurBitmap"));
        sIgnoreFinalMap.put("GlideTransformUtils.GlideCircleTransform", Utils.asList(
                "transform", "circleCrop", "updateDiskCacheKey"));
        sIgnoreFinalMap.put("GlideTransformUtils.GlideRoundTransform", Utils.asList(
                "transform", "roundCrop", "updateDiskCacheKey"));
        sIgnoreFinalMap.put("GlideTransformUtils.RotateTransformation", Utils.asList(
                "transform", "updateDiskCacheKey"));
        sIgnoreFinalMap.put("GlideUtils", Utils.asList(
                "with", "with", "with", "with", "with", "with"));
        sIgnoreFinalMap.put("NetWorkReceiver", Utils.asList("onReceive"));
        sIgnoreFinalMap.put("NotificationService", Utils.asList(
                "onNotificationPosted", "onNotificationRemoved", "onStartCommand"));
        sIgnoreFinalMap.put("PhoneReceiver", Utils.asList("onReceive"));
        sIgnoreFinalMap.put("ScreenReceiver", Utils.asList("onReceive"));
        sIgnoreFinalMap.put("SmsReceiver", Utils.asList("onReceive"));
        sIgnoreFinalMap.put("TimeReceiver", Utils.asList("onReceive"));
        sIgnoreFinalMap.put("WifiReceiver", Utils.asList("onReceive"));
    }

    // =

    /**
     * 初始化 忽略指定方法 static 修饰符
     */
    private static void initIgnoreStaticMap() {
        sIgnoreStaticMap.put("AccessibilityListenerService", Utils.asList(
                "onAccessibilityEvent", "onInterrupt", "onServiceConnected", "onCreate", "onDestroy"));
        sIgnoreStaticMap.put("GlideTransformUtils.GlideBlurformation", Utils.asList(
                "transform", "updateDiskCacheKey", "blurBitmap"));
        sIgnoreStaticMap.put("GlideTransformUtils.GlideCircleTransform", Utils.asList(
                "transform", "circleCrop", "updateDiskCacheKey"));
        sIgnoreStaticMap.put("GlideTransformUtils.GlideRoundTransform", Utils.asList(
                "transform", "roundCrop", "updateDiskCacheKey"));
        sIgnoreStaticMap.put("GlideTransformUtils.RotateTransformation", Utils.asList(
                "transform", "updateDiskCacheKey"));
        sIgnoreStaticMap.put("GlideUtils.GlideLoader", Utils.asList(
                "preload", "preload", "displayImage", "displayImage", "displayImageToGif",
                "displayImageToGif", "loadImageBitmap", "loadImageBitmap", "loadImageDrawable",
                "loadImageDrawable", "loadImageFile", "loadImageFile", "loadImageGif", "loadImageGif",
                "cancelDisplayTask", "cancelDisplayTask", "destroy", "pause", "resume", "stop", "start"));
        sIgnoreStaticMap.put("NetWorkReceiver", Utils.asList("onReceive"));
        sIgnoreStaticMap.put("NotificationService", Utils.asList(
                "onNotificationPosted", "onNotificationRemoved", "onCreate", "onDestroy",
                "onStartCommand", "cancelNotification"));
        sIgnoreStaticMap.put("PhoneReceiver", Utils.asList("onReceive"));
        sIgnoreStaticMap.put("ScreenReceiver", Utils.asList("onReceive"));
        sIgnoreStaticMap.put("SmsReceiver", Utils.asList("onReceive"));
        sIgnoreStaticMap.put("TimeReceiver", Utils.asList("onReceive"));
        sIgnoreStaticMap.put("WifiReceiver", Utils.asList("onReceive"));
        sIgnoreStaticMap.put("PictureSelectorUtils", Utils.asList("openGallery", "openGallery"));
        sIgnoreStaticMap.put("PictureSelectorUtils.PicConfig", Utils.asList(
                "getMimeType", "setMimeType", "getSelectionMode", "setSelectionMode",
                "isCamera", "setCamera", "isCrop", "setCrop", "isCircleCrop", "setCircleCrop",
                "isCompress", "setCompress", "getMinimumCompressSize", "setMinimumCompressSize",
                "getWithAspectRatio", "setWithAspectRatio", "isGif", "setGif", "getImageSpanCount",
                "setImageSpanCount", "getMinSelectNum", "setMinSelectNum", "getMaxSelectNum",
                "setMaxSelectNum", "getLocalMedia", "setLocalMedia", "getCameraSavePath",
                "setCameraSavePath", "getCompressSavePath", "setCompressSavePath", "clone", "set"));
    }

    /**
     * 初始化 忽略指定方法 @param 处理
     */
    private static void initIgnoreParamMap() {
        sIgnoreParamMap.put("GlideTransformUtils.GlideBlurformation", Utils.asList(
                "transform", "updateDiskCacheKey", "blurBitmap"));
        sIgnoreParamMap.put("GlideTransformUtils.GlideCircleTransform", Utils.asList(
                "transform", "circleCrop", "updateDiskCacheKey"));
        sIgnoreParamMap.put("GlideTransformUtils.GlideRoundTransform", Utils.asList(
                "transform", "roundCrop", "updateDiskCacheKey"));
        sIgnoreParamMap.put("GlideTransformUtils.RotateTransformation", Utils.asList(
                "transform", "updateDiskCacheKey"));
        sIgnoreParamMap.put("GlideUtils", Utils.asList(
                "with", "with", "with", "with", "with", "with"));
        sIgnoreParamMap.put("NetWorkReceiver", Utils.asList("onReceive"));
        sIgnoreParamMap.put("NotificationService", Utils.asList("onStartCommand"));
        sIgnoreParamMap.put("PhoneReceiver", Utils.asList("onReceive"));
        sIgnoreParamMap.put("ScreenReceiver", Utils.asList("onReceive"));
        sIgnoreParamMap.put("SmsReceiver", Utils.asList("onReceive"));
        sIgnoreParamMap.put("TimeReceiver", Utils.asList("onReceive"));
        sIgnoreParamMap.put("WifiReceiver", Utils.asList("onReceive"));
    }

    /**
     * 初始化 忽略指定方法 @return 处理
     */
    private static void initIgnoreReturnMap() {
    }

    /**
     * 初始化 忽略指定方法非 public 处理
     */
    private static void initIgnoreUnPublicMap() {
        sIgnoreUnPublicMap.put("AccessibilityListenerService", Utils.asList(
                "onServiceConnected"));
        sIgnoreUnPublicMap.put("GlideTransformUtils.GlideBlurformation", Utils.asList(
                "transform"));
        sIgnoreUnPublicMap.put("GlideTransformUtils.GlideCircleTransform", Utils.asList(
                "transform", "circleCrop"));
        sIgnoreUnPublicMap.put("GlideTransformUtils.GlideRoundTransform", Utils.asList(
                "transform", "roundCrop"));
        sIgnoreUnPublicMap.put("GlideTransformUtils.RotateTransformation", Utils.asList(
                "transform"));
        sIgnoreUnPublicMap.put("NetWorkReceiver.NetwordStateListener", Utils.asList(
                "onNetworkState"));
        sIgnoreUnPublicMap.put("NotificationService.NotificationListener", Utils.asList(
                "onServiceCreated", "onServiceDestroy", "onStartCommand",
                "onNotificationPosted", "onNotificationRemoved"));
        sIgnoreUnPublicMap.put("PhoneReceiver.PhoneListener", Utils.asList(
                "onPhoneStateChanged"));
        sIgnoreUnPublicMap.put("ScreenReceiver.ScreenListener", Utils.asList(
                "screenOn", "screenOff", "userPresent"));
        sIgnoreUnPublicMap.put("TimeReceiver.TimeListener", Utils.asList(
                "onTimeZoneChanged", "onTimeChanged", "onTimeTick"));
    }

    // =

    /**
     * 初始化 忽略无修饰符变量 处理
     */
    private static void initIgnoreModifierVariableMap() {
    }

    // =

    /**
     * 初始化 忽略指定方法 return void 处理
     */
    private static void initIgnoreReturnVoidMap() {
    }
}
