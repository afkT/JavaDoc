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
        ignoreAnnotateMap.put("ACache.XFileOutputStream", ArrayUtils.asListArgs("close"));
        ignoreAnnotateMap.put("BaseBeanSubscriber", ArrayUtils.asListArgs("onNext","onError","onStart","onComplete"));
        ignoreAnnotateMap.put("BaseResponseSubscriber", ArrayUtils.asListArgs("onNext","onError","onStart","onComplete"));
        ignoreAnnotateMap.put("ChainWorker", ArrayUtils.asListArgs("builder"));
        ignoreAnnotateMap.put("ChainWorker.AWorker", ArrayUtils.asListArgs("doWork"));
        ignoreAnnotateMap.put("ChainWorker.BWorker", ArrayUtils.asListArgs("doWork"));
        ignoreAnnotateMap.put("ChainWorker.CWorker", ArrayUtils.asListArgs("doWork"));
        ignoreAnnotateMap.put("ChainWorker.DWorker", ArrayUtils.asListArgs("doWork"));
        ignoreAnnotateMap.put("CompressConfig", ArrayUtils.asListArgs("isFailFinish","setFailFinish"));
        ignoreAnnotateMap.put("DevCacheEngineImpl", ArrayUtils.asListArgs("getConfig","remove","removeForKeys","contains","isDue","clear","clearDue","clearType","getItemByKey","getKeys","getPermanentKeys","getCount","getSize","put","put","put","put","put","put","put","put","put","put","put","put","getInt","getLong","getFloat","getDouble","getBoolean","getString","getBytes","getBitmap","getDrawable","getSerializable","getParcelable","getJSONObject","getJSONArray","getEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getBytes","getBitmap","getDrawable","getSerializable","getParcelable","getJSONObject","getJSONArray","getEntity"));
        ignoreAnnotateMap.put("DevLoggerEngineImpl", ArrayUtils.asListArgs("d","e","e","e","w","i","v","wtf","json","xml","dTag","eTag","eTag","eTag","wTag","iTag","vTag","wtfTag","jsonTag","xmlTag"));
        ignoreAnnotateMap.put("DevPermissionEngineImpl", ArrayUtils.asListArgs("isGranted","shouldShowRequestPermissionRationale","getDeniedPermissionStatus","againRequest","request","request"));
        ignoreAnnotateMap.put("FastjsonEngineImpl", ArrayUtils.asListArgs("toJson","toJson","fromJson","fromJson","fromJson","fromJson","isJSON","isJSONObject","isJSONArray","toJsonIndent","toJsonIndent","toJsonIndent","toJsonIndent"));
        ignoreAnnotateMap.put("GlideEngine", ArrayUtils.asListArgs("createGlideEngine"));
        ignoreAnnotateMap.put("GlideEngineImpl", ArrayUtils.asListArgs("pause","resume","pause","resume","preload","preload","clear","clear","clearDiskCache","clearMemoryCache","clearAllCache","lowMemory","display","display","display","display","display","display","display","display","display","display","display","display","display","display","display","display","loadImage","loadImage","loadImage","loadImageThrows","loadBitmap","loadBitmap","loadBitmap","loadBitmapThrows","loadDrawable","loadDrawable","loadDrawable","loadDrawableThrows","convertImageFormat","convertImageFormat"));
        ignoreAnnotateMap.put("GlideEngineImpl.InnerBitmapTarget", ArrayUtils.asListArgs("onResourceReady","onLoadStarted","onLoadFailed","onLoadCleared"));
        ignoreAnnotateMap.put("GlideEngineImpl.InnerBitmapViewTarget", ArrayUtils.asListArgs("setResource","onResourceReady","onLoadStarted","onLoadFailed"));
        ignoreAnnotateMap.put("GlideEngineImpl.InnerConvertStorage", ArrayUtils.asListArgs("convert"));
        ignoreAnnotateMap.put("GlideEngineImpl.InnerDrawableTarget", ArrayUtils.asListArgs("onResourceReady","onLoadStarted","onLoadFailed","onLoadCleared"));
        ignoreAnnotateMap.put("GlideEngineImpl.InnerDrawableViewTarget", ArrayUtils.asListArgs("setResource","onResourceReady","onLoadStarted","onLoadFailed"));
        ignoreAnnotateMap.put("GlideTransformUtils.GlideBlurformation", ArrayUtils.asListArgs("transform","updateDiskCacheKey"));
        ignoreAnnotateMap.put("GlideTransformUtils.GlideCircleTransform", ArrayUtils.asListArgs("transform","updateDiskCacheKey"));
        ignoreAnnotateMap.put("GlideTransformUtils.GlideRoundTransform", ArrayUtils.asListArgs("transform","updateDiskCacheKey"));
        ignoreAnnotateMap.put("GlideTransformUtils.RotateTransformation", ArrayUtils.asListArgs("transform","updateDiskCacheKey"));
        ignoreAnnotateMap.put("GlideUtils", ArrayUtils.asListArgs("pause","resume","pause","resume","preload","preload","clear","clear","clearDiskCache","clearMemoryCache","clearAllCache","lowMemory","display","display","display","display","display","display","display","display","display","display","display","display","display","display","display","display","loadImage","loadImage","loadImage","loadImageThrows","loadBitmap","loadBitmap","loadBitmap","loadBitmapThrows","loadDrawable","loadDrawable","loadDrawable","loadDrawableThrows","convertImageFormat","convertImageFormat"));
        ignoreAnnotateMap.put("GlideUtils.InnerBitmapTarget", ArrayUtils.asListArgs("onResourceReady","onLoadStarted","onLoadFailed","onLoadCleared"));
        ignoreAnnotateMap.put("GlideUtils.InnerBitmapViewTarget", ArrayUtils.asListArgs("setResource","onResourceReady","onLoadStarted","onLoadFailed"));
        ignoreAnnotateMap.put("GlideUtils.InnerConvertStorage", ArrayUtils.asListArgs("convert"));
        ignoreAnnotateMap.put("GlideUtils.InnerDrawableTarget", ArrayUtils.asListArgs("onResourceReady","onLoadStarted","onLoadFailed","onLoadCleared"));
        ignoreAnnotateMap.put("GlideUtils.InnerDrawableViewTarget", ArrayUtils.asListArgs("setResource","onResourceReady","onLoadStarted","onLoadFailed"));
        ignoreAnnotateMap.put("GsonEngineImpl", ArrayUtils.asListArgs("toJson","toJson","fromJson","fromJson","fromJson","fromJson","isJSON","isJSONObject","isJSONArray","toJsonIndent","toJsonIndent","toJsonIndent","toJsonIndent"));
        ignoreAnnotateMap.put("HttpLoggingInterceptor", ArrayUtils.asListArgs("intercept","isPlaintext","bodyEncoded"));
        ignoreAnnotateMap.put("ImageConfig", ArrayUtils.asListArgs("create","create","isCacheDisk","setCacheDisk","isCacheMemory","setCacheMemory","getScaleType","setScaleType","getTransform","setTransform","getRoundedCornersRadius","setRoundedCornersRadius","getErrorPlaceholder","setErrorPlaceholder","getLoadingPlaceholder","setLoadingPlaceholder","getErrorDrawable","setErrorDrawable","getLoadingDrawable","setLoadingDrawable","getWidth","getHeight","setSize","getThumbnail","setThumbnail","getQuality","setQuality","isOriginalPathReturn","setOriginalPathReturn"));
        ignoreAnnotateMap.put("LocalMediaData", ArrayUtils.asListArgs("getLocalMedia","setLocalMedia"));
        ignoreAnnotateMap.put("LocationWorker", ArrayUtils.asListArgs("doWork","test"));
        ignoreAnnotateMap.put("LogWorker", ArrayUtils.asListArgs("doWork"));
        ignoreAnnotateMap.put("LubanEngineImpl", ArrayUtils.asListArgs("compress","compress","compress","compress"));
        ignoreAnnotateMap.put("LubanUtils.Config", ArrayUtils.asListArgs("isFailFinish","setFailFinish"));
        ignoreAnnotateMap.put("MMKVConfig", ArrayUtils.asListArgs("getMMKV"));
        ignoreAnnotateMap.put("MMKVStorageEngineImpl", ArrayUtils.asListArgs("getConfig","remove","removeForKeys","contains","clear","putInt","putLong","putFloat","putDouble","putBoolean","putString","putEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getEntity"));
        ignoreAnnotateMap.put("MMKVUtils.Holder", ArrayUtils.asListArgs("encode","encode","encode","encode","encode","encode","encode","encode","encode","decodeBool","decodeBool","decodeInt","decodeInt","decodeLong","decodeLong","decodeFloat","decodeFloat","decodeDouble","decodeDouble","decodeString","decodeString","decodeStringSet","decodeStringSet","decodeStringSet","decodeBytes","decodeBytes","decodeParcelable","decodeParcelable"));
        ignoreAnnotateMap.put("MediaConfig.MimeType", ArrayUtils.asListArgs("ofAll","ofImage","ofVideo","ofAudio"));
        ignoreAnnotateMap.put("OkGoResponse.Builder", ArrayUtils.asListArgs("setData","setMessage","setCode","setToast","setResult","setOriginal","setException"));
        ignoreAnnotateMap.put("PictureSelectorEngineImpl", ArrayUtils.asListArgs("openCamera","openCamera","openCamera","openCamera","openGallery","openGallery","openGallery","openGallery","getConfig","setConfig","getCameraSavePath","getCompressSavePath","setSavePath","getMinimumCompressSize","setMinimumCompressSize","deleteCacheDirFile","deleteAllCacheDirFile","isMediaSelectorResult","getSelectors","getSelectorPaths","getSingleSelector","getSingleSelectorPath"));
        ignoreAnnotateMap.put("RetrofitManager", ArrayUtils.asListArgs("getInstance"));
        ignoreAnnotateMap.put("RxJavaManager", ArrayUtils.asListArgs("getInstance"));
        ignoreAnnotateMap.put("SPConfig", ArrayUtils.asListArgs("getPreference"));
        ignoreAnnotateMap.put("SPStorageEngineImpl", ArrayUtils.asListArgs("getConfig","remove","removeForKeys","contains","clear","putInt","putLong","putFloat","putDouble","putBoolean","putString","putEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getEntity"));
        ignoreAnnotateMap.put("WorkManagerUtils", ArrayUtils.asListArgs("enqueue","enqueueUniqueWork","beginWith","beginUniqueWork"));

        return ignoreAnnotateMap;
    }

    /**
     * 获取忽略指定方法参数 final 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreFinalMap() {
        Map<String, List<String>> ignoreFinalMap = new HashMap<>();
        ignoreFinalMap.put("CompressConfig", ArrayUtils.asListArgs("setFailFinish"));
        ignoreFinalMap.put("DevCacheEngineImpl", ArrayUtils.asListArgs("remove","removeForKeys","contains","isDue","clearType","getItemByKey","put","put","put","put","put","put","put","put","put","put","put","put","getInt","getLong","getFloat","getDouble","getBoolean","getString","getBytes","getBitmap","getDrawable","getSerializable","getParcelable","getJSONObject","getJSONArray","getEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getBytes","getBitmap","getDrawable","getSerializable","getParcelable","getJSONObject","getJSONArray","getEntity"));
        ignoreFinalMap.put("DevPermissionEngineImpl", ArrayUtils.asListArgs("isGranted","shouldShowRequestPermissionRationale","getDeniedPermissionStatus","againRequest","request","request"));
        ignoreFinalMap.put("FastjsonEngineImpl", ArrayUtils.asListArgs("toJson","toJson","fromJson","fromJson","fromJson","fromJson","isJSON","isJSONObject","isJSONArray","toJsonIndent","toJsonIndent","toJsonIndent","toJsonIndent"));
        ignoreFinalMap.put("GlideEngine", ArrayUtils.asListArgs("loadImage","loadImage","loadImage","loadFolderImage","loadAsGifImage","loadGridImage"));
        ignoreFinalMap.put("GlideEngineImpl", ArrayUtils.asListArgs("pause","resume","pause","resume","preload","preload","clear","clear","clearDiskCache","clearMemoryCache","clearAllCache","lowMemory","display","display","display","display","display","display","display","display","display","display","display","display","display","display","display","display","loadImage","loadImage","loadImage","loadImageThrows","loadBitmap","loadBitmap","loadBitmap","loadBitmapThrows","loadDrawable","loadDrawable","loadDrawable","loadDrawableThrows","convertImageFormat","convertImageFormat","canFragmentLoadImage","setToRequest","setToRequest","buildRequestOptions","buildRequest","priDisplayToRequestBuilder","priDisplayToRequestBuilder","priConvertImageFormat"));
        ignoreFinalMap.put("GlideEngineImpl.InnerBitmapTarget", ArrayUtils.asListArgs("onResourceReady","onLoadStarted","onLoadFailed","onLoadCleared"));
        ignoreFinalMap.put("GlideEngineImpl.InnerBitmapViewTarget", ArrayUtils.asListArgs("setResource","onResourceReady","onLoadStarted","onLoadFailed"));
        ignoreFinalMap.put("GlideEngineImpl.InnerConvertStorage", ArrayUtils.asListArgs("convert"));
        ignoreFinalMap.put("GlideEngineImpl.InnerDrawableTarget", ArrayUtils.asListArgs("onResourceReady","onLoadStarted","onLoadFailed","onLoadCleared"));
        ignoreFinalMap.put("GlideEngineImpl.InnerDrawableViewTarget", ArrayUtils.asListArgs("setResource","onResourceReady","onLoadStarted","onLoadFailed"));
        ignoreFinalMap.put("GlideTransformUtils.GlideBlurformation", ArrayUtils.asListArgs("transform","updateDiskCacheKey","blurBitmap"));
        ignoreFinalMap.put("GlideTransformUtils.GlideCircleTransform", ArrayUtils.asListArgs("transform","updateDiskCacheKey"));
        ignoreFinalMap.put("GlideTransformUtils.GlideRoundTransform", ArrayUtils.asListArgs("transform","updateDiskCacheKey"));
        ignoreFinalMap.put("GlideTransformUtils.RotateTransformation", ArrayUtils.asListArgs("transform","updateDiskCacheKey"));
        ignoreFinalMap.put("GlideUtils", ArrayUtils.asListArgs("pause","resume","pause","resume","preload","preload","clear","clear","clearDiskCache","clearMemoryCache","clearAllCache","lowMemory","display","display","display","display","display","display","display","display","display","display","display","display","display","display","display","display","loadImage","loadImage","loadImage","loadImageThrows","loadBitmap","loadBitmap","loadBitmap","loadBitmapThrows","loadDrawable","loadDrawable","loadDrawable","loadDrawableThrows","convertImageFormat","convertImageFormat","canFragmentLoadImage","setToRequest","setToRequest","buildRequestOptions","buildRequest","priDisplayToRequestBuilder","priDisplayToRequestBuilder","priConvertImageFormat"));
        ignoreFinalMap.put("GlideUtils.InnerBitmapTarget", ArrayUtils.asListArgs("onResourceReady","onLoadStarted","onLoadFailed","onLoadCleared"));
        ignoreFinalMap.put("GlideUtils.InnerBitmapViewTarget", ArrayUtils.asListArgs("setResource","onResourceReady","onLoadStarted","onLoadFailed"));
        ignoreFinalMap.put("GlideUtils.InnerConvertStorage", ArrayUtils.asListArgs("convert"));
        ignoreFinalMap.put("GlideUtils.InnerDrawableTarget", ArrayUtils.asListArgs("onResourceReady","onLoadStarted","onLoadFailed","onLoadCleared"));
        ignoreFinalMap.put("GlideUtils.InnerDrawableViewTarget", ArrayUtils.asListArgs("setResource","onResourceReady","onLoadStarted","onLoadFailed"));
        ignoreFinalMap.put("GsonEngineImpl", ArrayUtils.asListArgs("toJson","toJson","fromJson","fromJson","fromJson","fromJson","isJSON","isJSONObject","isJSONArray","toJsonIndent","toJsonIndent","toJsonIndent","toJsonIndent"));
        ignoreFinalMap.put("HttpLoggingInterceptor", ArrayUtils.asListArgs("intercept","_finalPrintLog","isPlaintext","bodyEncoded"));
        ignoreFinalMap.put("ImageConfig", ArrayUtils.asListArgs("setCacheDisk","setCacheMemory","setScaleType","setTransform","setRoundedCornersRadius","setErrorPlaceholder","setLoadingPlaceholder","setErrorDrawable","setLoadingDrawable","setSize","setThumbnail","setQuality","setOriginalPathReturn"));
        ignoreFinalMap.put("LogWorker", ArrayUtils.asListArgs("observe"));
        ignoreFinalMap.put("LubanEngineImpl", ArrayUtils.asListArgs("compress","compress","compress","compress"));
        ignoreFinalMap.put("LubanUtils", ArrayUtils.asListArgs("compress","compress","compress","compress"));
        ignoreFinalMap.put("LubanUtils.Config", ArrayUtils.asListArgs("setFailFinish"));
        ignoreFinalMap.put("MMKVStorageEngineImpl", ArrayUtils.asListArgs("remove","removeForKeys","contains","putInt","putLong","putFloat","putDouble","putBoolean","putString","putEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getEntity"));
        ignoreFinalMap.put("MMKVUtils.Holder", ArrayUtils.asListArgs("containsKey","removeValueForKey","removeValuesForKeys","encode","encode","encode","encode","encode","encode","encode","encode","encode","decodeBool","decodeBool","decodeInt","decodeInt","decodeLong","decodeLong","decodeFloat","decodeFloat","decodeDouble","decodeDouble","decodeString","decodeString","decodeStringSet","decodeStringSet","decodeStringSet","decodeBytes","decodeBytes","decodeParcelable","decodeParcelable"));
        ignoreFinalMap.put("OkGoDemo", ArrayUtils.asListArgs("getUserInfo","getUserList","uploadImage","uploadImages"));
        ignoreFinalMap.put("OkGoResponse.Builder", ArrayUtils.asListArgs("setData","setMessage","setCode","setToast","setResult","setOriginal","setException"));
        ignoreFinalMap.put("OkGoUtils", ArrayUtils.asListArgs("initOkGo","execute","execute"));
        ignoreFinalMap.put("PictureSelectorEngineImpl", ArrayUtils.asListArgs("openCamera","openCamera","openCamera","openCamera","openGallery","openGallery","openGallery","openGallery","setConfig","setSavePath","setMinimumCompressSize","deleteCacheDirFile","deleteAllCacheDirFile","isMediaSelectorResult","getSelectors","getSelectorPaths","getSingleSelector","getSingleSelectorPath"));
        ignoreFinalMap.put("SPStorageEngineImpl", ArrayUtils.asListArgs("remove","removeForKeys","contains","putInt","putLong","putFloat","putDouble","putBoolean","putString","putEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getEntity"));

        return ignoreFinalMap;
    }

    /**
     * 获取忽略指定方法 static 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreStaticMap() {
        Map<String, List<String>> ignoreStaticMap = new HashMap<>();
        ignoreStaticMap.put("ACache", ArrayUtils.asListArgs("put","put","getAsString","put","put","getAsJSONObject","put","put","getAsJSONArray","put","get","getAsBinary","getAsObject","put","put","getAsBitmap","put","put","getAsDrawable","file","remove","clear"));
        ignoreStaticMap.put("ACache.XFileOutputStream", ArrayUtils.asListArgs("close"));
        ignoreStaticMap.put("ACacheManager", ArrayUtils.asListArgs("calculateCacheSizeAndCacheCount","put","get","newFile","remove","clear","removeNext","calculateSize"));
        ignoreStaticMap.put("ChainWorker.AWorker", ArrayUtils.asListArgs("doWork"));
        ignoreStaticMap.put("ChainWorker.BWorker", ArrayUtils.asListArgs("doWork"));
        ignoreStaticMap.put("ChainWorker.CWorker", ArrayUtils.asListArgs("doWork"));
        ignoreStaticMap.put("ChainWorker.DWorker", ArrayUtils.asListArgs("doWork"));
        ignoreStaticMap.put("CompressConfig", ArrayUtils.asListArgs("isFailFinish","setFailFinish"));
        ignoreStaticMap.put("DevCacheEngineImpl", ArrayUtils.asListArgs("getConfig","remove","removeForKeys","contains","isDue","clear","clearDue","clearType","getItemByKey","getKeys","getPermanentKeys","getCount","getSize","put","put","put","put","put","put","put","put","put","put","put","put","getInt","getLong","getFloat","getDouble","getBoolean","getString","getBytes","getBitmap","getDrawable","getSerializable","getParcelable","getJSONObject","getJSONArray","getEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getBytes","getBitmap","getDrawable","getSerializable","getParcelable","getJSONObject","getJSONArray","getEntity"));
        ignoreStaticMap.put("DevPermissionEngineImpl", ArrayUtils.asListArgs("isGranted","shouldShowRequestPermissionRationale","getDeniedPermissionStatus","againRequest","request","request"));
        ignoreStaticMap.put("FastjsonEngineImpl", ArrayUtils.asListArgs("toJson","toJson","fromJson","fromJson","fromJson","fromJson","isJSON","isJSONObject","isJSONArray","toJsonIndent","toJsonIndent","toJsonIndent","toJsonIndent"));
        ignoreStaticMap.put("GlideEngine", ArrayUtils.asListArgs("loadImage","loadImage","loadImage","loadFolderImage","loadAsGifImage","loadGridImage"));
        ignoreStaticMap.put("GlideEngineImpl", ArrayUtils.asListArgs("pause","resume","pause","resume","preload","preload","clear","clear","clearDiskCache","clearMemoryCache","clearAllCache","lowMemory","display","display","display","display","display","display","display","display","display","display","display","display","display","display","display","display","loadImage","loadImage","loadImage","loadImageThrows","loadBitmap","loadBitmap","loadBitmap","loadBitmapThrows","loadDrawable","loadDrawable","loadDrawable","loadDrawableThrows","convertImageFormat","convertImageFormat","canFragmentLoadImage","setToRequest","setToRequest","buildRequestOptions","buildRequest","priDisplayToRequestBuilder","priDisplayToRequestBuilder","priConvertImageFormat"));
        ignoreStaticMap.put("GlideEngineImpl.InnerBitmapTarget", ArrayUtils.asListArgs("onResourceReady","onLoadStarted","onLoadFailed","onLoadCleared"));
        ignoreStaticMap.put("GlideEngineImpl.InnerBitmapViewTarget", ArrayUtils.asListArgs("setResource","onResourceReady","onLoadStarted","onLoadFailed"));
        ignoreStaticMap.put("GlideEngineImpl.InnerConvertStorage", ArrayUtils.asListArgs("convert"));
        ignoreStaticMap.put("GlideEngineImpl.InnerDrawableTarget", ArrayUtils.asListArgs("onResourceReady","onLoadStarted","onLoadFailed","onLoadCleared"));
        ignoreStaticMap.put("GlideEngineImpl.InnerDrawableViewTarget", ArrayUtils.asListArgs("setResource","onResourceReady","onLoadStarted","onLoadFailed"));
        ignoreStaticMap.put("GlideTransformUtils.GlideBlurformation", ArrayUtils.asListArgs("transform","updateDiskCacheKey","blurBitmap"));
        ignoreStaticMap.put("GlideTransformUtils.GlideCircleTransform", ArrayUtils.asListArgs("transform","updateDiskCacheKey"));
        ignoreStaticMap.put("GlideTransformUtils.GlideRoundTransform", ArrayUtils.asListArgs("transform","updateDiskCacheKey"));
        ignoreStaticMap.put("GlideTransformUtils.RotateTransformation", ArrayUtils.asListArgs("transform","updateDiskCacheKey"));
        ignoreStaticMap.put("GlideUtils.InnerBitmapTarget", ArrayUtils.asListArgs("onResourceReady","onLoadStarted","onLoadFailed","onLoadCleared"));
        ignoreStaticMap.put("GlideUtils.InnerBitmapViewTarget", ArrayUtils.asListArgs("setResource","onResourceReady","onLoadStarted","onLoadFailed"));
        ignoreStaticMap.put("GlideUtils.InnerConvertStorage", ArrayUtils.asListArgs("convert"));
        ignoreStaticMap.put("GlideUtils.InnerDrawableTarget", ArrayUtils.asListArgs("onResourceReady","onLoadStarted","onLoadFailed","onLoadCleared"));
        ignoreStaticMap.put("GlideUtils.InnerDrawableViewTarget", ArrayUtils.asListArgs("setResource","onResourceReady","onLoadStarted","onLoadFailed"));
        ignoreStaticMap.put("GsonEngineImpl", ArrayUtils.asListArgs("toJson","toJson","fromJson","fromJson","fromJson","fromJson","isJSON","isJSONObject","isJSONArray","toJsonIndent","toJsonIndent","toJsonIndent","toJsonIndent"));
        ignoreStaticMap.put("HttpLoggingInterceptor", ArrayUtils.asListArgs("intercept","_finalPrintLog","isPlaintext","bodyEncoded"));
        ignoreStaticMap.put("ImageConfig", ArrayUtils.asListArgs("clone","isCacheDisk","setCacheDisk","isCacheMemory","setCacheMemory","getScaleType","setScaleType","getTransform","setTransform","getRoundedCornersRadius","setRoundedCornersRadius","getErrorPlaceholder","setErrorPlaceholder","getLoadingPlaceholder","setLoadingPlaceholder","getErrorDrawable","setErrorDrawable","getLoadingDrawable","setLoadingDrawable","getWidth","getHeight","setSize","getThumbnail","setThumbnail","getQuality","setQuality","isOriginalPathReturn","setOriginalPathReturn"));
        ignoreStaticMap.put("LocalMediaData", ArrayUtils.asListArgs("getLocalMedia","setLocalMedia","getLocalMediaPath"));
        ignoreStaticMap.put("LocationWorker", ArrayUtils.asListArgs("doWork","test"));
        ignoreStaticMap.put("LogWorker", ArrayUtils.asListArgs("onStopped","doWork","code","getLog"));
        ignoreStaticMap.put("LubanEngineImpl", ArrayUtils.asListArgs("compress","compress","compress","compress"));
        ignoreStaticMap.put("LubanUtils.Config", ArrayUtils.asListArgs("isFailFinish","setFailFinish"));
        ignoreStaticMap.put("MMKVConfig", ArrayUtils.asListArgs("getMMKV"));
        ignoreStaticMap.put("MMKVStorageEngineImpl", ArrayUtils.asListArgs("getConfig","remove","removeForKeys","contains","clear","putInt","putLong","putFloat","putDouble","putBoolean","putString","putEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getEntity"));
        ignoreStaticMap.put("MMKVUtils.Holder", ArrayUtils.asListArgs("getMMKV","mmapID","isMMKVEmpty","isMMKVNotEmpty","containsKey","removeValueForKey","removeValuesForKeys","sync","async","clear","encode","encode","encode","encode","encode","encode","encode","encode","encode","decodeBool","decodeBool","decodeInt","decodeInt","decodeLong","decodeLong","decodeFloat","decodeFloat","decodeDouble","decodeDouble","decodeString","decodeString","decodeStringSet","decodeStringSet","decodeStringSet","decodeBytes","decodeBytes","decodeParcelable","decodeParcelable"));
        ignoreStaticMap.put("MediaConfig", ArrayUtils.asListArgs("getMimeType","setMimeType","getSelectionMode","setSelectionMode","isCamera","setCamera","isCrop","setCrop","isCircleCrop","setCircleCrop","isCompress","setCompress","getMinimumCompressSize","setMinimumCompressSize","getWithAspectRatio","setWithAspectRatio","isGif","setGif","getImageSpanCount","setImageSpanCount","getMinSelectNum","setMinSelectNum","getMaxSelectNum","setMaxSelectNum","getLocalMedia","setLocalMedia","getCameraSavePath","setCameraSavePath","getCompressSavePath","setCompressSavePath","clone","set"));
        ignoreStaticMap.put("OkGoResponse", ArrayUtils.asListArgs("getDataString"));
        ignoreStaticMap.put("OkGoResponse.Builder", ArrayUtils.asListArgs("build","setData","setMessage","setCode","setToast","setResult","setOriginal","setException"));
        ignoreStaticMap.put("PictureSelectorEngineImpl", ArrayUtils.asListArgs("openCamera","openCamera","openCamera","openCamera","openGallery","openGallery","openGallery","openGallery","getConfig","setConfig","getCameraSavePath","getCompressSavePath","setSavePath","getMinimumCompressSize","setMinimumCompressSize","deleteCacheDirFile","deleteAllCacheDirFile","isMediaSelectorResult","getSelectors","getSelectorPaths","getSingleSelector","getSingleSelectorPath","getPictureSelector","forResult","getPictureSelectionModel","convertList"));
        ignoreStaticMap.put("PictureSelectorUtils.MediaConfig", ArrayUtils.asListArgs("getMimeType","setMimeType","getSelectionMode","setSelectionMode","isCamera","setCamera","isCrop","setCrop","isCircleCrop","setCircleCrop","isCompress","setCompress","getMinimumCompressSize","setMinimumCompressSize","getWithAspectRatio","setWithAspectRatio","isGif","setGif","getImageSpanCount","setImageSpanCount","getMinSelectNum","setMinSelectNum","getMaxSelectNum","setMaxSelectNum","getLocalMedia","setLocalMedia","getCameraSavePath","setCameraSavePath","getCompressSavePath","setCompressSavePath","clone","set"));
        ignoreStaticMap.put("RetrofitManager", ArrayUtils.asListArgs("get","put","remove","contains","getRetrofitMap","create"));
        ignoreStaticMap.put("RxJavaManager", ArrayUtils.asListArgs("add","remove","contains","getManagerMap","io_main"));
        ignoreStaticMap.put("SPConfig", ArrayUtils.asListArgs("getPreference"));
        ignoreStaticMap.put("SPStorageEngineImpl", ArrayUtils.asListArgs("getConfig","remove","removeForKeys","contains","clear","putInt","putLong","putFloat","putDouble","putBoolean","putString","putEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getEntity"));
        ignoreStaticMap.put("WebViewAssist", ArrayUtils.asListArgs("setWebView","getWebView","isWebViewNotEmpty","setBuilder","setBuilder","getBuilder","apply","loadUrl","loadUrl","loadData","loadDataWithBaseURL","postUrl","loadDataWithBaseURL","loadDataWithBaseURL","getSettings","getUserAgentString","setUserAgentString","addJavascriptInterface","removeJavascriptInterface","evaluateJavascript","setWebViewClient","getWebViewClient","setWebChromeClient","getWebChromeClient","destroy","canGoBack","goBack","canGoForward","goForward","canGoBackOrForward","goBackOrForward","reload","stopLoading","clearCache","clearHistory","clearFormData","getScale","getScrollY","getScrollX","getContentHeight","getScaleHeight","getScaleHeight","getHeight","pageDown","pageUp","handlerKeyDown","setLayerTypeSoftware","setLayerType","getUrl","getOriginalUrl","getHitTestResult"));
        ignoreStaticMap.put("WebViewAssist.Builder", ArrayUtils.asListArgs("setWebViewAssist","apply","setOnApplyListener","getApplyListener","clone","reset","applyPri","isJavaScriptEnabled","setJavaScriptEnabled","getRenderPriority","setRenderPriority","isUseWideViewPort","setUseWideViewPort","isLoadWithOverviewMode","setLoadWithOverviewMode","getLayoutAlgorithm","setLayoutAlgorithm","isSupportZoom","setSupportZoom","isBuiltInZoomControls","setBuiltInZoomControls","isDisplayZoomControls","setDisplayZoomControls","getTextZoom","setTextZoom","getStandardFontFamily","setStandardFontFamily","getDefaultFontSize","setDefaultFontSize","getMinimumFontSize","setMinimumFontSize","getMixedContentMode","setMixedContentMode","isLoadsImagesAutomatically","setLoadsImagesAutomatically","isJavaScriptCanOpenWindowsAutomatically","setJavaScriptCanOpenWindowsAutomatically","getDefaultTextEncodingName","setDefaultTextEncodingName","isGeolocationEnabled","setGeolocationEnabled","getUserAgentString","setUserAgentString","isAllowFileAccess","setAllowFileAccess","isAllowFileAccessFromFileURLs","setAllowFileAccessFromFileURLs","isAllowUniversalAccessFromFileURLs","setAllowUniversalAccessFromFileURLs","getCacheMode","setCacheMode","isDomStorageEnabled","setDomStorageEnabled","isAppCacheEnabled","setAppCacheEnabled","getAppCachePath","setAppCachePath","getAppCacheMaxSize","setAppCacheMaxSize","isDatabaseEnabled","setDatabaseEnabled","getDatabasePath","setDatabasePath"));
        ignoreStaticMap.put("WorkManagerUtils", ArrayUtils.asListArgs("getWorkManager","setWorkManager","cancelAllWork","cancelWorkById","cancelAllWorkByTag","cancelUniqueWork","pruneWork","getLastCancelAllTimeMillisLiveData","getLastCancelAllTimeMillis","getWorkInfoByIdLiveData","getWorkInfoById","getWorkInfosByTagLiveData","getWorkInfosByTag","getWorkInfosForUniqueWorkLiveData","getWorkInfosForUniqueWork","getWorkInfosLiveData","getWorkInfos","enqueue","enqueue","enqueueUniqueWork","enqueueUniqueWork","enqueueUniquePeriodicWork","beginWith","beginWith","beginUniqueWork","beginUniqueWork"));

        return ignoreStaticMap;
    }

    /**
     * 获取忽略指定方法 @param 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreParamMap() {
        Map<String, List<String>> ignoreParamMap = new HashMap<>();
        ignoreParamMap.put("BaseBeanSubscriber", ArrayUtils.asListArgs("onNext","onError"));
        ignoreParamMap.put("BaseResponseSubscriber", ArrayUtils.asListArgs("onNext","onError"));
        ignoreParamMap.put("ChainWorker", ArrayUtils.asListArgs("builder"));
        ignoreParamMap.put("CompressConfig", ArrayUtils.asListArgs("setFailFinish"));
        ignoreParamMap.put("DevCacheEngineImpl", ArrayUtils.asListArgs("remove","removeForKeys","contains","isDue","clearType","getItemByKey","put","put","put","put","put","put","put","put","put","put","put","put","getInt","getLong","getFloat","getDouble","getBoolean","getString","getBytes","getBitmap","getDrawable","getSerializable","getParcelable","getJSONObject","getJSONArray","getEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getBytes","getBitmap","getDrawable","getSerializable","getParcelable","getJSONObject","getJSONArray","getEntity"));
        ignoreParamMap.put("DevLoggerEngineImpl", ArrayUtils.asListArgs("d","e","e","e","w","i","v","wtf","json","xml","dTag","eTag","eTag","eTag","wTag","iTag","vTag","wtfTag","jsonTag","xmlTag"));
        ignoreParamMap.put("DevPermissionEngineImpl", ArrayUtils.asListArgs("isGranted","shouldShowRequestPermissionRationale","getDeniedPermissionStatus","againRequest","request","request"));
        ignoreParamMap.put("FastjsonEngineImpl", ArrayUtils.asListArgs("toJson","toJson","fromJson","fromJson","fromJson","fromJson","isJSON","isJSONObject","isJSONArray","toJsonIndent","toJsonIndent","toJsonIndent","toJsonIndent"));
        ignoreParamMap.put("GlideEngineImpl", ArrayUtils.asListArgs("pause","resume","pause","resume","preload","preload","clear","clear","clearDiskCache","clearMemoryCache","clearAllCache","lowMemory","display","display","display","display","display","display","display","display","display","display","display","display","display","display","display","display","loadImage","loadImage","loadImage","loadImageThrows","loadBitmap","loadBitmap","loadBitmap","loadBitmapThrows","loadDrawable","loadDrawable","loadDrawable","loadDrawableThrows","convertImageFormat","convertImageFormat","setToRequest","buildRequest","priDisplayToRequestBuilder"));
        ignoreParamMap.put("GlideEngineImpl.InnerBitmapTarget", ArrayUtils.asListArgs("onResourceReady","onLoadStarted","onLoadFailed","onLoadCleared"));
        ignoreParamMap.put("GlideEngineImpl.InnerBitmapViewTarget", ArrayUtils.asListArgs("setResource","onResourceReady","onLoadStarted","onLoadFailed"));
        ignoreParamMap.put("GlideEngineImpl.InnerConvertStorage", ArrayUtils.asListArgs("convert"));
        ignoreParamMap.put("GlideEngineImpl.InnerDrawableTarget", ArrayUtils.asListArgs("onResourceReady","onLoadStarted","onLoadFailed","onLoadCleared"));
        ignoreParamMap.put("GlideEngineImpl.InnerDrawableViewTarget", ArrayUtils.asListArgs("setResource","onResourceReady","onLoadStarted","onLoadFailed"));
        ignoreParamMap.put("GlideTransformUtils.GlideBlurformation", ArrayUtils.asListArgs("transform","updateDiskCacheKey","blurBitmap"));
        ignoreParamMap.put("GlideTransformUtils.GlideCircleTransform", ArrayUtils.asListArgs("transform","updateDiskCacheKey"));
        ignoreParamMap.put("GlideTransformUtils.GlideRoundTransform", ArrayUtils.asListArgs("transform","updateDiskCacheKey"));
        ignoreParamMap.put("GlideTransformUtils.RotateTransformation", ArrayUtils.asListArgs("transform","updateDiskCacheKey"));
        ignoreParamMap.put("GlideUtils", ArrayUtils.asListArgs("pause","resume","pause","resume","preload","preload","clear","clear","clearDiskCache","clearMemoryCache","clearAllCache","lowMemory","display","display","display","display","display","display","display","display","display","display","display","display","display","display","display","display","loadImage","loadImage","loadImage","loadImageThrows","loadBitmap","loadBitmap","loadBitmap","loadBitmapThrows","loadDrawable","loadDrawable","loadDrawable","loadDrawableThrows","convertImageFormat","convertImageFormat","setToRequest","buildRequest","priDisplayToRequestBuilder"));
        ignoreParamMap.put("GlideUtils.InnerBitmapTarget", ArrayUtils.asListArgs("onResourceReady","onLoadStarted","onLoadFailed","onLoadCleared"));
        ignoreParamMap.put("GlideUtils.InnerBitmapViewTarget", ArrayUtils.asListArgs("setResource","onResourceReady","onLoadStarted","onLoadFailed"));
        ignoreParamMap.put("GlideUtils.InnerConvertStorage", ArrayUtils.asListArgs("convert"));
        ignoreParamMap.put("GlideUtils.InnerDrawableTarget", ArrayUtils.asListArgs("onResourceReady","onLoadStarted","onLoadFailed","onLoadCleared"));
        ignoreParamMap.put("GlideUtils.InnerDrawableViewTarget", ArrayUtils.asListArgs("setResource","onResourceReady","onLoadStarted","onLoadFailed"));
        ignoreParamMap.put("GsonEngineImpl", ArrayUtils.asListArgs("toJson","toJson","fromJson","fromJson","fromJson","fromJson","isJSON","isJSONObject","isJSONArray","toJsonIndent","toJsonIndent","toJsonIndent","toJsonIndent"));
        ignoreParamMap.put("HttpLoggingInterceptor", ArrayUtils.asListArgs("intercept","isPlaintext","bodyEncoded"));
        ignoreParamMap.put("ImageConfig", ArrayUtils.asListArgs("create","setCacheDisk","setCacheMemory","setRoundedCornersRadius","setErrorPlaceholder","setLoadingPlaceholder","setErrorDrawable","setLoadingDrawable","setSize","setThumbnail","setQuality","setOriginalPathReturn"));
        ignoreParamMap.put("LocalMediaData", ArrayUtils.asListArgs("setLocalMedia"));
        ignoreParamMap.put("LogWorker", ArrayUtils.asListArgs("observe"));
        ignoreParamMap.put("LubanEngineImpl", ArrayUtils.asListArgs("compress","compress","compress","compress"));
        ignoreParamMap.put("LubanUtils.Config", ArrayUtils.asListArgs("setFailFinish"));
        ignoreParamMap.put("MMKVStorageEngineImpl", ArrayUtils.asListArgs("remove","removeForKeys","contains","putInt","putLong","putFloat","putDouble","putBoolean","putString","putEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getEntity"));
        ignoreParamMap.put("MMKVUtils.Holder", ArrayUtils.asListArgs("encode","encode","encode","encode","encode","encode","encode","encode","encode","decodeBool","decodeBool","decodeInt","decodeInt","decodeLong","decodeLong","decodeFloat","decodeFloat","decodeDouble","decodeDouble","decodeString","decodeString","decodeStringSet","decodeStringSet","decodeStringSet","decodeBytes","decodeBytes","decodeParcelable","decodeParcelable"));
        ignoreParamMap.put("OkGoCallback", ArrayUtils.asListArgs("onStart","uploadProgress","downloadProgress","onCacheSuccess","onError","onSuccess","convertResponse"));
        ignoreParamMap.put("OkGoResponse.Builder", ArrayUtils.asListArgs("setData","setMessage","setCode","setToast","setResult","setOriginal","setException"));
        ignoreParamMap.put("PictureSelectorEngineImpl", ArrayUtils.asListArgs("openCamera","openCamera","openCamera","openCamera","openGallery","openGallery","openGallery","openGallery","setConfig","setSavePath","setMinimumCompressSize","deleteCacheDirFile","deleteAllCacheDirFile","isMediaSelectorResult","getSelectors","getSelectorPaths","getSingleSelector","getSingleSelectorPath"));
        ignoreParamMap.put("SPStorageEngineImpl", ArrayUtils.asListArgs("remove","removeForKeys","contains","putInt","putLong","putFloat","putDouble","putBoolean","putString","putEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getEntity"));
        ignoreParamMap.put("WorkManagerUtils", ArrayUtils.asListArgs("enqueue","enqueueUniqueWork","beginWith","beginUniqueWork"));

        return ignoreParamMap;
    }

    /**
     * 获取忽略指定方法 @return 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreReturnMap() {
        Map<String, List<String>> ignoreReturnMap = new HashMap<>();
        ignoreReturnMap.put("ImageConfig", ArrayUtils.asListArgs("setScaleType","setTransform"));
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
        ignoreUnPublicMap.put("ACache", ArrayUtils.asListArgs("myPid","getCachePath"));
        ignoreUnPublicMap.put("ACacheManager", ArrayUtils.asListArgs("calculateCacheSizeAndCacheCount","put","get","newFile","remove","clear","removeNext","calculateSize"));
        ignoreUnPublicMap.put("ACacheUtils", ArrayUtils.asListArgs("isDue","isDue","newStringWithDateInfo","newByteArrayWithDateInfo","createDateInfo","clearDateInfo","clearDateInfo","hasDateInfo","getDateInfoFromDate","indexOf","copyOfRange","bitmapToByte","byteToBitmap","drawableToBitmap","bitmapToDrawable","isDue","isDue","newStringWithDateInfo","newByteArrayWithDateInfo","createDateInfo","clearDateInfo","clearDateInfo","hasDateInfo","getDateInfoFromDate","indexOf","copyOfRange","bitmapToByte","byteToBitmap","drawableToBitmap","bitmapToDrawable"));
        ignoreUnPublicMap.put("BaseBeanSubscriber", ArrayUtils.asListArgs("onStart","getErrorMessage"));
        ignoreUnPublicMap.put("BaseResponseSubscriber", ArrayUtils.asListArgs("onStart","getErrorMessage","isSuccess"));
        ignoreUnPublicMap.put("GlideEngineImpl", ArrayUtils.asListArgs("canFragmentLoadImage","setToRequest","setToRequest","buildRequestOptions","buildRequest","priDisplayToRequestBuilder","priDisplayToRequestBuilder","priConvertImageFormat"));
        ignoreUnPublicMap.put("GlideEngineImpl.InnerBitmapViewTarget", ArrayUtils.asListArgs("setResource"));
        ignoreUnPublicMap.put("GlideEngineImpl.InnerDrawableViewTarget", ArrayUtils.asListArgs("setResource"));
        ignoreUnPublicMap.put("GlideTransformUtils.GlideBlurformation", ArrayUtils.asListArgs("transform"));
        ignoreUnPublicMap.put("GlideTransformUtils.GlideCircleTransform", ArrayUtils.asListArgs("transform"));
        ignoreUnPublicMap.put("GlideTransformUtils.GlideRoundTransform", ArrayUtils.asListArgs("transform"));
        ignoreUnPublicMap.put("GlideTransformUtils.RotateTransformation", ArrayUtils.asListArgs("transform"));
        ignoreUnPublicMap.put("GlideUtils", ArrayUtils.asListArgs("canFragmentLoadImage","setToRequest","setToRequest","buildRequestOptions","buildRequest","priDisplayToRequestBuilder","priDisplayToRequestBuilder","priConvertImageFormat"));
        ignoreUnPublicMap.put("GlideUtils.InnerBitmapViewTarget", ArrayUtils.asListArgs("setResource"));
        ignoreUnPublicMap.put("GlideUtils.InnerDrawableViewTarget", ArrayUtils.asListArgs("setResource"));
        ignoreUnPublicMap.put("HttpLoggingInterceptor", ArrayUtils.asListArgs("_finalPrintLog","isPlaintext","bodyEncoded"));
        ignoreUnPublicMap.put("LocationWorker", ArrayUtils.asListArgs("test"));
        ignoreUnPublicMap.put("LogWorker", ArrayUtils.asListArgs("code","createData","getLog"));
        ignoreUnPublicMap.put("LubanUtils.OnCompressListener", ArrayUtils.asListArgs("onStart","onSuccess","onError","onComplete"));
        ignoreUnPublicMap.put("OkGoCallback", ArrayUtils.asListArgs("_response","isSuccess"));
        ignoreUnPublicMap.put("OkGoDemo", ArrayUtils.asListArgs("demo"));
        ignoreUnPublicMap.put("PictureSelectorEngineImpl", ArrayUtils.asListArgs("getPictureSelector","forResult","getPictureSelectionModel","convertList"));
        ignoreUnPublicMap.put("WebViewAssist.Builder", ArrayUtils.asListArgs("setWebViewAssist","applyPri"));
        ignoreUnPublicMap.put("WebViewAssist.Builder.OnApplyListener", ArrayUtils.asListArgs("onApply"));
        ignoreUnPublicMap.put("ZXingQRCodeUtils.QRResultCallback", ArrayUtils.asListArgs("onResult","onResult","onResult","onResult","onResult","onResult","onResult","onResult","onResult","onResult","onResult","onResult","onResult","onResult"));
        ignoreUnPublicMap.put("ZXingQRCodeUtils.QRScanCallback", ArrayUtils.asListArgs("onResult","onResult","onResult","onResult","onResult","onResult","onResult","onResult","onResult","onResult","onResult","onResult","onResult","onResult"));

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
        ignoreReturnVoidMap.put("ACache", ArrayUtils.asListArgs("clear - void"));
        ignoreReturnVoidMap.put("ACacheManager", ArrayUtils.asListArgs("calculateCacheSizeAndCacheCount - void","put - void","clear - void"));
        ignoreReturnVoidMap.put("BaseBeanSubscriber", ArrayUtils.asListArgs("onSuccessResponse - void","onErrorResponse - void"));
        ignoreReturnVoidMap.put("BaseResponseSubscriber", ArrayUtils.asListArgs("onSuccessResponse - void","onErrorResponse - void"));
        ignoreReturnVoidMap.put("ChainWorker", ArrayUtils.asListArgs("start - void"));
        ignoreReturnVoidMap.put("EventBusUtils", ArrayUtils.asListArgs("register - void","unregister - void","post - void","cancelEventDelivery - void","postSticky - void","removeStickyEvent - void","removeAllStickyEvents - void"));
        ignoreReturnVoidMap.put("GlideEngine", ArrayUtils.asListArgs("loadImage - void","loadImage - void","loadImage - void","loadFolderImage - void","loadAsGifImage - void","loadGridImage - void"));
        ignoreReturnVoidMap.put("GlideEngineImpl", ArrayUtils.asListArgs("priDisplayToRequestBuilder - void","priDisplayToRequestBuilder - void"));
        ignoreReturnVoidMap.put("GlideUtils", ArrayUtils.asListArgs("priDisplayToRequestBuilder - void","priDisplayToRequestBuilder - void"));
        ignoreReturnVoidMap.put("HttpLoggingInterceptor", ArrayUtils.asListArgs("_finalPrintLog - void"));
        ignoreReturnVoidMap.put("ImageLoaderUtils", ArrayUtils.asListArgs("init - void","displayImage - void","displayImage - void","displayImage - void","displayImage - void","displayImage - void","displayImage - void","displayImage - void","displayImage - void","loadImage - void","loadImage - void","loadImage - void","loadImage - void","loadImage - void","loadImage - void","clearDiskCache - void","clearMemoryCache - void","handleSlowNetwork - void","denyNetworkDownloads - void","cancelDisplayTask - void","setDefaultLoadingListener - void","destroy - void","pause - void","resume - void","stop - void"));
        ignoreReturnVoidMap.put("LogWorker", ArrayUtils.asListArgs("onStopped - void","code - void","observe - void"));
        ignoreReturnVoidMap.put("LubanUtils.OnCompressListener", ArrayUtils.asListArgs("onStart - void","onSuccess - void","onError - void","onComplete - void"));
        ignoreReturnVoidMap.put("MMKVUtils", ArrayUtils.asListArgs("init - void"));
        ignoreReturnVoidMap.put("OkGoCallback", ArrayUtils.asListArgs("onStart - void","onFinish - void","uploadProgress - void","downloadProgress - void","onCacheSuccess - void","onError - void","onSuccess - void","onSuccessResponse - void","onErrorResponse - void","_response - void"));
        ignoreReturnVoidMap.put("OkGoDemo", ArrayUtils.asListArgs("getUserInfo - void","getUserList - void","uploadImage - void","uploadImages - void","demo - void"));
        ignoreReturnVoidMap.put("OkGoUtils", ArrayUtils.asListArgs("initOkGo - void","execute - void","execute - void"));
        ignoreReturnVoidMap.put("PictureSelectorUtils", ArrayUtils.asListArgs("setConfig - void","setSavePath - void","setMinimumCompressSize - void","deleteCacheDirFile - void","deleteAllCacheDirFile - void"));
        ignoreReturnVoidMap.put("RxJavaManager", ArrayUtils.asListArgs("add - void","remove - void"));
        ignoreReturnVoidMap.put("WebViewAssist", ArrayUtils.asListArgs("setGlobalBuilder - void","removeCookie - void"));
        ignoreReturnVoidMap.put("WebViewAssist.Builder.OnApplyListener", ArrayUtils.asListArgs("onApply - void"));
        ignoreReturnVoidMap.put("ZXingQRCodeUtils", ArrayUtils.asListArgs("createQRCodeImage - void","createQRCodeImage - void","createQRCodeImage - void","decodeQRCode - void","createQRCodeImage - void","createQRCodeImage - void","createQRCodeImage - void","decodeQRCode - void","createQRCodeImage - void","createQRCodeImage - void","createQRCodeImage - void","decodeQRCode - void","createQRCodeImage - void","createQRCodeImage - void","createQRCodeImage - void","decodeQRCode - void","createQRCodeImage - void","createQRCodeImage - void","createQRCodeImage - void","decodeQRCode - void","createQRCodeImage - void","createQRCodeImage - void","createQRCodeImage - void","decodeQRCode - void","createQRCodeImage - void","createQRCodeImage - void","createQRCodeImage - void","decodeQRCode - void","createQRCodeImage - void","createQRCodeImage - void","createQRCodeImage - void","decodeQRCode - void","createQRCodeImage - void","createQRCodeImage - void","createQRCodeImage - void","decodeQRCode - void","createQRCodeImage - void","createQRCodeImage - void","createQRCodeImage - void","decodeQRCode - void","createQRCodeImage - void","createQRCodeImage - void","createQRCodeImage - void","decodeQRCode - void","createQRCodeImage - void","createQRCodeImage - void","createQRCodeImage - void","decodeQRCode - void","createQRCodeImage - void","createQRCodeImage - void","createQRCodeImage - void","decodeQRCode - void","createQRCodeImage - void","createQRCodeImage - void","createQRCodeImage - void","decodeQRCode - void"));
        ignoreReturnVoidMap.put("ZXingQRCodeUtils.QRResultCallback", ArrayUtils.asListArgs("onResult - void","onResult - void","onResult - void","onResult - void","onResult - void","onResult - void","onResult - void","onResult - void","onResult - void","onResult - void","onResult - void","onResult - void","onResult - void","onResult - void"));
        ignoreReturnVoidMap.put("ZXingQRCodeUtils.QRScanCallback", ArrayUtils.asListArgs("onResult - void","onResult - void","onResult - void","onResult - void","onResult - void","onResult - void","onResult - void","onResult - void","onResult - void","onResult - void","onResult - void","onResult - void","onResult - void","onResult - void"));

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