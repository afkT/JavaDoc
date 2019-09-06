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
    }

    // =

    /**
     * 初始化 忽略指定方法参数 final 修饰符
     */
    private static void initIgnoreFinalMap() {
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
    }

    // =

    /**
     * 初始化 忽略指定方法 static 修饰符
     */
    private static void initIgnoreStaticMap() {
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
        sIgnoreParamMap.put("GlideUtils", Utils.asList("with", "with", "with", "with", "with", "with"));
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
        sIgnoreUnPublicMap.put("GlideTransformUtils.GlideBlurformation", Utils.asList(
                "transform"));
        sIgnoreUnPublicMap.put("GlideTransformUtils.GlideCircleTransform", Utils.asList(
                "transform", "circleCrop"));
        sIgnoreUnPublicMap.put("GlideTransformUtils.GlideRoundTransform", Utils.asList(
                "transform", "roundCrop"));
        sIgnoreUnPublicMap.put("GlideTransformUtils.RotateTransformation", Utils.asList(
                "transform"));
    }

    // =

    /**
     * 初始化 忽略无修饰符变量 处理
     */
    private static void initIgnoreModifierVariableMap() {
    }
}
