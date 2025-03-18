package javadoc.dev_utils.check.dev_other;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dev.utils.common.ArrayUtils;
import javadoc.dev_utils.check.dev.ICheckConfig;

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
        ignoreAnnotateMap.put("DevCacheEngineImpl", ArrayUtils.asListArgs("setJSONEngine","getConfig","remove","removeForKeys","contains","isDue","clear","clearDue","clearType","getItemByKey","getKeys","getPermanentKeys","getCount","getSize","put","put","put","put","put","put","put","put","put","put","put","put","getInt","getLong","getFloat","getDouble","getBoolean","getString","getBytes","getBitmap","getDrawable","getSerializable","getParcelable","getJSONObject","getJSONArray","getEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getBytes","getBitmap","getDrawable","getSerializable","getParcelable","getJSONObject","getJSONArray","getEntity"));
        ignoreAnnotateMap.put("DevLoggerEngineImpl", ArrayUtils.asListArgs("getLogConfig","d","e","e","e","w","i","v","wtf","json","xml","dTag","eTag","eTag","eTag","wTag","iTag","vTag","wtfTag","jsonTag","xmlTag"));
        ignoreAnnotateMap.put("DevPermissionEngineImpl", ArrayUtils.asListArgs("isGranted","shouldShowRequestPermissionRationale","getDeniedPermissionStatus","againRequest","request","request","request"));
        ignoreAnnotateMap.put("FastjsonEngineImpl", ArrayUtils.asListArgs("toJson","toJson","fromJson","fromJson","fromJson","fromJson","isJSON","isJSONObject","isJSONArray","toJsonIndent","toJsonIndent","toJsonIndent","toJsonIndent"));
        ignoreAnnotateMap.put("GlideEngineImpl", ArrayUtils.asListArgs("pause","resume","pause","resume","preload","preload","clear","clear","clearDiskCache","clearMemoryCache","clearAllCache","lowMemory","display","display","display","display","display","display","display","display","display","display","display","display","display","display","display","display","loadImage","loadImage","loadImage","loadImageThrows","loadBitmap","loadBitmap","loadBitmap","loadBitmapThrows","loadDrawable","loadDrawable","loadDrawable","loadDrawableThrows","convertImageFormat","convertImageFormat"));
        ignoreAnnotateMap.put("GlideEngineImpl.InnerBitmapTarget", ArrayUtils.asListArgs("onResourceReady","onLoadStarted","onLoadFailed","onLoadCleared"));
        ignoreAnnotateMap.put("GlideEngineImpl.InnerBitmapViewTarget", ArrayUtils.asListArgs("setResource","onResourceReady","onLoadStarted","onLoadFailed"));
        ignoreAnnotateMap.put("GlideEngineImpl.InnerConvertStorage", ArrayUtils.asListArgs("convert"));
        ignoreAnnotateMap.put("GlideEngineImpl.InnerDrawableTarget", ArrayUtils.asListArgs("onResourceReady","onLoadStarted","onLoadFailed","onLoadCleared"));
        ignoreAnnotateMap.put("GlideEngineImpl.InnerDrawableViewTarget", ArrayUtils.asListArgs("setResource","onResourceReady","onLoadStarted","onLoadFailed"));
        ignoreAnnotateMap.put("GlideUtils", ArrayUtils.asListArgs("pause","resume","pause","resume","preload","preload","clear","clear","clearDiskCache","clearMemoryCache","clearAllCache","lowMemory","display","display","display","display","display","display","display","display","display","display","display","display","display","display","display","display","loadImage","loadImage","loadImage","loadImageThrows","loadBitmap","loadBitmap","loadBitmap","loadBitmapThrows","loadDrawable","loadDrawable","loadDrawable","loadDrawableThrows","convertImageFormat","convertImageFormat"));
        ignoreAnnotateMap.put("GsonEngineImpl", ArrayUtils.asListArgs("toJson","toJson","fromJson","fromJson","fromJson","fromJson","isJSON","isJSONObject","isJSONArray","toJsonIndent","toJsonIndent","toJsonIndent","toJsonIndent"));
        ignoreAnnotateMap.put("ImageConfig", ArrayUtils.asListArgs("create","create","isCacheDisk","setCacheDisk","isCacheMemory","setCacheMemory","getScaleType","setScaleType","getTransform","setTransform","getRoundedCornersRadius","setRoundedCornersRadius","getErrorPlaceholder","setErrorPlaceholder","getLoadingPlaceholder","setLoadingPlaceholder","getErrorDrawable","setErrorDrawable","getLoadingDrawable","setLoadingDrawable","getWidth","getHeight","setSize","getThumbnail","setThumbnail","getQuality","setQuality","isOriginalPathReturn","setOriginalPathReturn","isDontAnimate","setDontAnimate","isDontTransform","setDontTransform"));
        ignoreAnnotateMap.put("LocationWorker", ArrayUtils.asListArgs("doWork","test"));
        ignoreAnnotateMap.put("LogWorker", ArrayUtils.asListArgs("doWork"));
        ignoreAnnotateMap.put("LubanEngineImpl", ArrayUtils.asListArgs("compress","compress","compress","compress"));
        ignoreAnnotateMap.put("LubanUtils.Config", ArrayUtils.asListArgs("isFailFinish","setFailFinish"));
        ignoreAnnotateMap.put("LuckCompressFileEngineImpl", ArrayUtils.asListArgs("onStartCompress"));
        ignoreAnnotateMap.put("LuckCropFileEngineImpl", ArrayUtils.asListArgs("onStartCrop"));
        ignoreAnnotateMap.put("LuckImageEngineImpl", ArrayUtils.asListArgs("createEngine","loadImage","pauseRequests","resumeRequests"));
        ignoreAnnotateMap.put("LuckMediaEditInterceptListener", ArrayUtils.asListArgs("onStartMediaEdit"));
        ignoreAnnotateMap.put("LuckRecordAudioInterceptListener", ArrayUtils.asListArgs("onRecordAudio"));
        ignoreAnnotateMap.put("LuckSandboxFileEngineImpl", ArrayUtils.asListArgs("createEngine","onUriToFileAsyncTransform"));
        ignoreAnnotateMap.put("MMKVConfig", ArrayUtils.asListArgs("getMMKV"));
        ignoreAnnotateMap.put("MMKVKeyValueEngineImpl", ArrayUtils.asListArgs("setJSONEngine","getConfig","remove","removeForKeys","contains","clear","putInt","putLong","putFloat","putDouble","putBoolean","putString","putEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getEntity"));
        ignoreAnnotateMap.put("MMKVUtils.Holder", ArrayUtils.asListArgs("encode","encode","encode","encode","encode","encode","encode","encode","encode","decodeBool","decodeBool","decodeInt","decodeInt","decodeLong","decodeLong","decodeFloat","decodeFloat","decodeDouble","decodeDouble","decodeString","decodeString","decodeStringSet","decodeStringSet","decodeStringSet","decodeBytes","decodeBytes","decodeParcelable","decodeParcelable"));
        ignoreAnnotateMap.put("MediaConfig.MimeType", ArrayUtils.asListArgs("ofAll","ofImage","ofVideo","ofAudio"));
        ignoreAnnotateMap.put("PictureSelectorEngineImpl", ArrayUtils.asListArgs("getConfig","setConfig","openCamera","openCamera","openCamera","openCamera","openGallery","openGallery","openGallery","openGallery","openPreview","openPreview","openPreview","openPreview","deleteCacheDirFile","deleteAllCacheDirFile","isMediaSelectorResult","getSelectors","getSelectorUris","getSingleSelector","getSingleSelectorUri"));
        ignoreAnnotateMap.put("RetrofitManager", ArrayUtils.asListArgs("getInstance"));
        ignoreAnnotateMap.put("RxJavaManager", ArrayUtils.asListArgs("getInstance"));
        ignoreAnnotateMap.put("SPConfig", ArrayUtils.asListArgs("getPreference"));
        ignoreAnnotateMap.put("SPKeyValueEngineImpl", ArrayUtils.asListArgs("setJSONEngine","getConfig","remove","removeForKeys","contains","clear","putInt","putLong","putFloat","putDouble","putBoolean","putString","putEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getEntity"));
        ignoreAnnotateMap.put("StorageItem", ArrayUtils.asListArgs("getOutputUri","getFileName","getFilePath","getFolder","getMimeType","getFormat","setFormat","getQuality","setQuality","setOutputUri","setFileName","setFilePath","setFolder","setMimeType"));
        ignoreAnnotateMap.put("StorageResult", ArrayUtils.asListArgs("isSuccess","getUri","getFile","getError","getType","isExternal","setUri","setFile","setError","setType","setExternal"));
        ignoreAnnotateMap.put("StorageType", ArrayUtils.asListArgs("isImage","isVideo","isAudio","isDownload","isNone"));
        ignoreAnnotateMap.put("WorkManagerUtils", ArrayUtils.asListArgs("enqueue","enqueueUniqueWork","beginWith","beginUniqueWork"));
        ignoreAnnotateMap.put("ZXingEngineImpl", ArrayUtils.asListArgs("initialize","getConfig","encodeBarCode","encodeBarCodeSync","decodeBarCode","decodeBarCodeSync"));
        ignoreAnnotateMap.put("ZXingUtils", ArrayUtils.asListArgs("initialize","getConfig","encodeBarCode","encodeBarCodeSync","decodeBarCode","decodeBarCodeSync","addIconToBarCode"));

        return ignoreAnnotateMap;
    }

    /**
     * 获取忽略指定方法参数 final 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreFinalMap() {
        Map<String, List<String>> ignoreFinalMap = new HashMap<>();
        ignoreFinalMap.put("BarCodeConfig", ArrayUtils.asListArgs("putEncodeHints","putDecodeHints"));
        ignoreFinalMap.put("BarCodeData", ArrayUtils.asListArgs("get","get","setFormat","setForegroundColor","setBackgroundColor","setBackgroundColor","setIcon","setIconScale"));
        ignoreFinalMap.put("CompressConfig", ArrayUtils.asListArgs("setFailFinish"));
        ignoreFinalMap.put("DevCacheEngineImpl", ArrayUtils.asListArgs("remove","removeForKeys","contains","isDue","clearType","getItemByKey","put","put","put","put","put","put","put","put","put","put","put","put","getInt","getLong","getFloat","getDouble","getBoolean","getString","getBytes","getBitmap","getDrawable","getSerializable","getParcelable","getJSONObject","getJSONArray","getEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getBytes","getBitmap","getDrawable","getSerializable","getParcelable","getJSONObject","getJSONArray","getEntity"));
        ignoreFinalMap.put("DevMediaStoreEngineImpl", ArrayUtils.asListArgs("insertImageToExternal","insertVideoToExternal","insertAudioToExternal","insertDownloadToExternal","insertMediaToExternal","insertImageToInternal","insertVideoToInternal","insertAudioToInternal","insertDownloadToInternal","insertMediaToInternal"));
        ignoreFinalMap.put("DevPermissionEngineImpl", ArrayUtils.asListArgs("isGranted","shouldShowRequestPermissionRationale","getDeniedPermissionStatus","againRequest","request","request","request"));
        ignoreFinalMap.put("FastjsonEngineImpl", ArrayUtils.asListArgs("toJson","toJson","fromJson","fromJson","fromJson","fromJson","isJSON","isJSONObject","isJSONArray","toJsonIndent","toJsonIndent","toJsonIndent","toJsonIndent"));
        ignoreFinalMap.put("GlideEngineImpl", ArrayUtils.asListArgs("pause","resume","pause","resume","preload","preload","clear","clear","clearDiskCache","clearMemoryCache","clearAllCache","lowMemory","display","display","display","display","display","display","display","display","display","display","display","display","display","display","display","display","loadImage","loadImage","loadImage","loadImageThrows","loadBitmap","loadBitmap","loadBitmap","loadBitmapThrows","loadDrawable","loadDrawable","loadDrawable","loadDrawableThrows","convertImageFormat","convertImageFormat","canFragmentLoadImage","setToRequest","setToRequest","buildRequestOptions","buildRequest","innerDisplayToRequestBuilder","innerDisplayToRequestBuilder","innerConvertImageFormat"));
        ignoreFinalMap.put("GlideEngineImpl.InnerBitmapTarget", ArrayUtils.asListArgs("onResourceReady","onLoadStarted","onLoadFailed","onLoadCleared"));
        ignoreFinalMap.put("GlideEngineImpl.InnerBitmapViewTarget", ArrayUtils.asListArgs("setResource","onResourceReady","onLoadStarted","onLoadFailed"));
        ignoreFinalMap.put("GlideEngineImpl.InnerConvertStorage", ArrayUtils.asListArgs("convert"));
        ignoreFinalMap.put("GlideEngineImpl.InnerDrawableTarget", ArrayUtils.asListArgs("onResourceReady","onLoadStarted","onLoadFailed","onLoadCleared"));
        ignoreFinalMap.put("GlideEngineImpl.InnerDrawableViewTarget", ArrayUtils.asListArgs("setResource","onResourceReady","onLoadStarted","onLoadFailed"));
        ignoreFinalMap.put("GlideUtils", ArrayUtils.asListArgs("pause","resume","pause","resume","preload","preload","clear","clear","clearDiskCache","clearMemoryCache","clearAllCache","lowMemory","display","display","display","display","display","display","display","display","display","display","display","display","display","display","display","display","loadImage","loadImage","loadImage","loadImageThrows","loadBitmap","loadBitmap","loadBitmap","loadBitmapThrows","loadDrawable","loadDrawable","loadDrawable","loadDrawableThrows","convertImageFormat","convertImageFormat"));
        ignoreFinalMap.put("GsonEngineImpl", ArrayUtils.asListArgs("toJson","toJson","fromJson","fromJson","fromJson","fromJson","isJSON","isJSONObject","isJSONArray","toJsonIndent","toJsonIndent","toJsonIndent","toJsonIndent"));
        ignoreFinalMap.put("ImageConfig", ArrayUtils.asListArgs("setCacheDisk","setCacheMemory","setScaleType","setTransform","setRoundedCornersRadius","setErrorPlaceholder","setLoadingPlaceholder","setErrorDrawable","setLoadingDrawable","setSize","setThumbnail","setQuality","setOriginalPathReturn","setDontAnimate","setDontTransform"));
        ignoreFinalMap.put("LogWorker", ArrayUtils.asListArgs("observe"));
        ignoreFinalMap.put("LubanEngineImpl", ArrayUtils.asListArgs("compress","compress","compress","compress"));
        ignoreFinalMap.put("LubanUtils", ArrayUtils.asListArgs("compress","compress","compress","compress"));
        ignoreFinalMap.put("LubanUtils.Config", ArrayUtils.asListArgs("setFailFinish"));
        ignoreFinalMap.put("LuckCompressFileEngineImpl", ArrayUtils.asListArgs("onStartCompress"));
        ignoreFinalMap.put("LuckCropFileEngineImpl", ArrayUtils.asListArgs("onStartCrop"));
        ignoreFinalMap.put("LuckImageEngineImpl", ArrayUtils.asListArgs("loadImage","loadImage","loadAlbumCover","loadGridImage","pauseRequests","resumeRequests"));
        ignoreFinalMap.put("LuckMediaEditInterceptListener", ArrayUtils.asListArgs("onStartMediaEdit"));
        ignoreFinalMap.put("LuckRecordAudioInterceptListener", ArrayUtils.asListArgs("onRecordAudio"));
        ignoreFinalMap.put("LuckSandboxFileEngineImpl", ArrayUtils.asListArgs("onUriToFileAsyncTransform"));
        ignoreFinalMap.put("MMKVKeyValueEngineImpl", ArrayUtils.asListArgs("remove","removeForKeys","contains","putInt","putLong","putFloat","putDouble","putBoolean","putString","putEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getEntity"));
        ignoreFinalMap.put("MMKVUtils.Holder", ArrayUtils.asListArgs("containsKey","removeValueForKey","removeValuesForKeys","encode","encode","encode","encode","encode","encode","encode","encode","encode","decodeBool","decodeBool","decodeInt","decodeInt","decodeLong","decodeLong","decodeFloat","decodeFloat","decodeDouble","decodeDouble","decodeString","decodeString","decodeStringSet","decodeStringSet","decodeStringSet","decodeBytes","decodeBytes","decodeParcelable","decodeParcelable"));
        ignoreFinalMap.put("PictureSelectorEngineImpl", ArrayUtils.asListArgs("setConfig","openCamera","openCamera","openCamera","openCamera","openGallery","openGallery","openGallery","openGallery","openPreview","openPreview","openPreview","openPreview","deleteCacheDirFile","deleteAllCacheDirFile","isMediaSelectorResult","getSelectors","getSelectorUris","getSingleSelector","getSingleSelectorUri"));
        ignoreFinalMap.put("PictureSelectorUtils", ArrayUtils.asListArgs("setConfig","openCamera","openCamera","openCamera","openCamera","openGallery","openGallery","openGallery","openGallery","openPreview","openPreview","openPreview","openPreview","deleteCacheDirFile","deleteAllCacheDirFile","isMediaSelectorResult","getSelectors","getSelectorUris","getSingleSelector","getSingleSelectorUri"));
        ignoreFinalMap.put("SPKeyValueEngineImpl", ArrayUtils.asListArgs("remove","removeForKeys","contains","putInt","putLong","putFloat","putDouble","putBoolean","putString","putEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getEntity"));
        ignoreFinalMap.put("StorageItem", ArrayUtils.asListArgs("setFormat","setQuality","setOutputUri","setFileName","setFilePath","setFolder","setMimeType"));
        ignoreFinalMap.put("StorageResult", ArrayUtils.asListArgs("setUri","setFile","setError","setType","setExternal"));
        ignoreFinalMap.put("ZXingEngineImpl", ArrayUtils.asListArgs("initialize","encodeBarCode","encodeBarCodeSync","decodeBarCode","decodeBarCodeSync","addIconToBarCode","isValidData","encodeCallback","encodeFailureCallback","decodeCallback","decodeFailureCallback"));
        ignoreFinalMap.put("ZXingUtils", ArrayUtils.asListArgs("initialize","encodeBarCode","encodeBarCodeSync","decodeBarCode","decodeBarCodeSync","addIconToBarCode"));

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
        ignoreStaticMap.put("BarCodeConfig", ArrayUtils.asListArgs("getEncodeHints","getDecodeHints","defaultEncode","putEncodeHints","putDecodeHints"));
        ignoreStaticMap.put("BarCodeData", ArrayUtils.asListArgs("getContent","getWidth","getHeight","getFormat","setFormat","getForegroundColor","setForegroundColor","getBackgroundColor","setBackgroundColor","setBackgroundColor","getIcon","setIcon","getIconScale","setIconScale"));
        ignoreStaticMap.put("BarCodeResult", ArrayUtils.asListArgs("isSuccess","getResult","getResultData","getBarcodeFormat"));
        ignoreStaticMap.put("ChainWorker.AWorker", ArrayUtils.asListArgs("doWork"));
        ignoreStaticMap.put("ChainWorker.BWorker", ArrayUtils.asListArgs("doWork"));
        ignoreStaticMap.put("ChainWorker.CWorker", ArrayUtils.asListArgs("doWork"));
        ignoreStaticMap.put("ChainWorker.DWorker", ArrayUtils.asListArgs("doWork"));
        ignoreStaticMap.put("CompressConfig", ArrayUtils.asListArgs("isFailFinish","setFailFinish"));
        ignoreStaticMap.put("DevCacheEngineImpl", ArrayUtils.asListArgs("setJSONEngine","getConfig","remove","removeForKeys","contains","isDue","clear","clearDue","clearType","getItemByKey","getKeys","getPermanentKeys","getCount","getSize","put","put","put","put","put","put","put","put","put","put","put","put","getInt","getLong","getFloat","getDouble","getBoolean","getString","getBytes","getBitmap","getDrawable","getSerializable","getParcelable","getJSONObject","getJSONArray","getEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getBytes","getBitmap","getDrawable","getSerializable","getParcelable","getJSONObject","getJSONArray","getEntity"));
        ignoreStaticMap.put("DevMediaStoreEngineImpl", ArrayUtils.asListArgs("insertImageToExternal","insertVideoToExternal","insertAudioToExternal","insertDownloadToExternal","insertMediaToExternal","insertImageToInternal","insertVideoToInternal","insertAudioToInternal","insertDownloadToInternal","insertMediaToInternal","convertType","innerPreCheck","getOutputUri","getOutputFile","innerInsertToExternal","innerInsertToInternal","innerInsertThread","innerInsertFinal","finalCallback"));
        ignoreStaticMap.put("DevPermissionEngineImpl", ArrayUtils.asListArgs("isGranted","shouldShowRequestPermissionRationale","getDeniedPermissionStatus","againRequest","request","request","request"));
        ignoreStaticMap.put("FastjsonEngineImpl", ArrayUtils.asListArgs("toJson","toJson","fromJson","fromJson","fromJson","fromJson","isJSON","isJSONObject","isJSONArray","toJsonIndent","toJsonIndent","toJsonIndent","toJsonIndent"));
        ignoreStaticMap.put("GlideEngineImpl", ArrayUtils.asListArgs("pause","resume","pause","resume","preload","preload","clear","clear","clearDiskCache","clearMemoryCache","clearAllCache","lowMemory","display","display","display","display","display","display","display","display","display","display","display","display","display","display","display","display","loadImage","loadImage","loadImage","loadImageThrows","loadBitmap","loadBitmap","loadBitmap","loadBitmapThrows","loadDrawable","loadDrawable","loadDrawable","loadDrawableThrows","convertImageFormat","convertImageFormat","canFragmentLoadImage","setToRequest","setToRequest","buildRequestOptions","buildRequest","innerDisplayToRequestBuilder","innerDisplayToRequestBuilder","innerConvertImageFormat"));
        ignoreStaticMap.put("GlideEngineImpl.InnerBitmapTarget", ArrayUtils.asListArgs("onResourceReady","onLoadStarted","onLoadFailed","onLoadCleared"));
        ignoreStaticMap.put("GlideEngineImpl.InnerBitmapViewTarget", ArrayUtils.asListArgs("setResource","onResourceReady","onLoadStarted","onLoadFailed"));
        ignoreStaticMap.put("GlideEngineImpl.InnerConvertStorage", ArrayUtils.asListArgs("convert"));
        ignoreStaticMap.put("GlideEngineImpl.InnerDrawableTarget", ArrayUtils.asListArgs("onResourceReady","onLoadStarted","onLoadFailed","onLoadCleared"));
        ignoreStaticMap.put("GlideEngineImpl.InnerDrawableViewTarget", ArrayUtils.asListArgs("setResource","onResourceReady","onLoadStarted","onLoadFailed"));
        ignoreStaticMap.put("GsonEngineImpl", ArrayUtils.asListArgs("toJson","toJson","fromJson","fromJson","fromJson","fromJson","isJSON","isJSONObject","isJSONArray","toJsonIndent","toJsonIndent","toJsonIndent","toJsonIndent"));
        ignoreStaticMap.put("ImageConfig", ArrayUtils.asListArgs("clone","isCacheDisk","setCacheDisk","isCacheMemory","setCacheMemory","getScaleType","setScaleType","getTransform","setTransform","getRoundedCornersRadius","setRoundedCornersRadius","getErrorPlaceholder","setErrorPlaceholder","getLoadingPlaceholder","setLoadingPlaceholder","getErrorDrawable","setErrorDrawable","getLoadingDrawable","setLoadingDrawable","getWidth","getHeight","setSize","getThumbnail","setThumbnail","getQuality","setQuality","isOriginalPathReturn","setOriginalPathReturn","isDontAnimate","setDontAnimate","isDontTransform","setDontTransform"));
        ignoreStaticMap.put("LocationWorker", ArrayUtils.asListArgs("doWork","test"));
        ignoreStaticMap.put("LogWorker", ArrayUtils.asListArgs("onStopped","doWork","code","getLog"));
        ignoreStaticMap.put("LubanEngineImpl", ArrayUtils.asListArgs("compress","compress","compress","compress"));
        ignoreStaticMap.put("LubanUtils.Config", ArrayUtils.asListArgs("isFailFinish","setFailFinish"));
        ignoreStaticMap.put("LuckCompressFileEngineImpl", ArrayUtils.asListArgs("onStartCompress","toInputStreamList","toUriPath"));
        ignoreStaticMap.put("LuckCropFileEngineImpl", ArrayUtils.asListArgs("onStartCrop"));
        ignoreStaticMap.put("LuckImageEngineImpl", ArrayUtils.asListArgs("loadImage","loadImage","loadAlbumCover","loadGridImage","pauseRequests","resumeRequests"));
        ignoreStaticMap.put("LuckMediaEditInterceptListener", ArrayUtils.asListArgs("onStartMediaEdit"));
        ignoreStaticMap.put("LuckRecordAudioInterceptListener", ArrayUtils.asListArgs("onRecordAudio","startRecordSoundAction"));
        ignoreStaticMap.put("LuckSandboxFileEngineImpl", ArrayUtils.asListArgs("onUriToFileAsyncTransform"));
        ignoreStaticMap.put("MMKVConfig", ArrayUtils.asListArgs("getMMKV"));
        ignoreStaticMap.put("MMKVKeyValueEngineImpl", ArrayUtils.asListArgs("setJSONEngine","getConfig","remove","removeForKeys","contains","clear","putInt","putLong","putFloat","putDouble","putBoolean","putString","putEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getEntity"));
        ignoreStaticMap.put("MMKVUtils.Holder", ArrayUtils.asListArgs("getMMKV","mmapID","isMMKVEmpty","isMMKVNotEmpty","containsKey","removeValueForKey","removeValuesForKeys","sync","async","clear","encode","encode","encode","encode","encode","encode","encode","encode","encode","decodeBool","decodeBool","decodeInt","decodeInt","decodeLong","decodeLong","decodeFloat","decodeFloat","decodeDouble","decodeDouble","decodeString","decodeString","decodeStringSet","decodeStringSet","decodeStringSet","decodeBytes","decodeBytes","decodeParcelable","decodeParcelable"));
        ignoreStaticMap.put("MediaConfig", ArrayUtils.asListArgs("convertLibCustomConfig","getLibCustomConfig","setLibCustomConfig","getMimeType","setMimeType","getSelectionMode","setSelectionMode","getCustomData","setCustomData","getMediaDatas","setMediaDatas","clone","set"));
        ignoreStaticMap.put("MediaData", ArrayUtils.asListArgs("convertLibOriginalData","getLibOriginalData","setLibOriginalData","getAvailableUri","isExistOriginalUri","isExistSandboxUri","isExistThumbnailUri","isExistWatermarkUri","isExistCompressUri","isExistCropUri","clone","set","getUUID","getCustomData","setCustomData","getOriginalUri","setOriginalUri","getSandboxUri","setSandboxUri","getCompressUri","setCompressUri","getThumbnailUri","setThumbnailUri","getWatermarkUri","setWatermarkUri","getCropUri","setCropUri","getMimeType","setMimeType","getDuration","setDuration","getWidth","setWidth","getHeight","setHeight","getCropImageWidth","setCropImageWidth","getCropImageHeight","setCropImageHeight","getCropOffsetX","setCropOffsetX","getCropOffsetY","setCropOffsetY","getCropAspectRatio","setCropAspectRatio","isCropState","setCropState","isCompressState","setCompressState"));
        ignoreStaticMap.put("PictureSelectorEngineImpl", ArrayUtils.asListArgs("getConfig","setConfig","openCamera","openCamera","openCamera","openCamera","openGallery","openGallery","openGallery","openGallery","openPreview","openPreview","openPreview","openPreview","deleteCacheDirFile","deleteAllCacheDirFile","isMediaSelectorResult","getSelectors","getSelectorUris","getSingleSelector","getSingleSelectorUri","convertList","createMediaData","startCameraModel","startGalleryModel","startPreviewModel"));
        ignoreStaticMap.put("RetrofitManager", ArrayUtils.asListArgs("get","put","remove","contains","getRetrofitMap","create"));
        ignoreStaticMap.put("RxJavaManager", ArrayUtils.asListArgs("add","remove","contains","getManagerMap","io_main"));
        ignoreStaticMap.put("SPConfig", ArrayUtils.asListArgs("getPreference"));
        ignoreStaticMap.put("SPKeyValueEngineImpl", ArrayUtils.asListArgs("setJSONEngine","getConfig","remove","removeForKeys","contains","clear","putInt","putLong","putFloat","putDouble","putBoolean","putString","putEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getEntity"));
        ignoreStaticMap.put("StorageItem", ArrayUtils.asListArgs("getOutputUri","getFileName","getFilePath","getFolder","getMimeType","getFormat","setFormat","getQuality","setQuality","setOutputUri","setFileName","setFilePath","setFolder","setMimeType","getInternalFile","getExternalFile","getExternalFile","getExternalFolder"));
        ignoreStaticMap.put("StorageResult", ArrayUtils.asListArgs("isSuccess","getUri","getFile","getError","getType","isExternal","setUri","setFile","setError","setType","setExternal"));
        ignoreStaticMap.put("StorageType", ArrayUtils.asListArgs("isImage","isVideo","isAudio","isDownload","isNone"));
        ignoreStaticMap.put("WebViewAssist", ArrayUtils.asListArgs("setWebView","getWebView","isWebViewNotEmpty","setBuilder","setBuilder","getBuilder","apply","loadUrl","loadUrl","loadData","loadDataWithBaseURL","postUrl","loadDataWithBaseURL","loadDataWithBaseURL","getSettings","getUserAgentString","setUserAgentString","addJavascriptInterface","removeJavascriptInterface","evaluateJavascript","setWebViewClient","getWebViewClient","setWebChromeClient","getWebChromeClient","destroy","canGoBack","goBack","canGoForward","goForward","canGoBackOrForward","goBackOrForward","reload","stopLoading","clearCache","clearHistory","clearFormData","getScale","getScrollY","getScrollX","getContentHeight","getScaleHeight","getScaleHeight","getHeight","pageDown","pageUp","handlerKeyDown","setLayerTypeSoftware","setLayerType","getUrl","getOriginalUrl","getHitTestResult"));
        ignoreStaticMap.put("WebViewAssist.Builder", ArrayUtils.asListArgs("setWebViewAssist","apply","setOnApplyListener","getApplyListener","clone","reset","applyPri","isJavaScriptEnabled","setJavaScriptEnabled","getRenderPriority","setRenderPriority","isUseWideViewPort","setUseWideViewPort","isLoadWithOverviewMode","setLoadWithOverviewMode","getLayoutAlgorithm","setLayoutAlgorithm","isSupportZoom","setSupportZoom","isBuiltInZoomControls","setBuiltInZoomControls","isDisplayZoomControls","setDisplayZoomControls","getTextZoom","setTextZoom","getStandardFontFamily","setStandardFontFamily","getDefaultFontSize","setDefaultFontSize","getMinimumFontSize","setMinimumFontSize","getMixedContentMode","setMixedContentMode","isLoadsImagesAutomatically","setLoadsImagesAutomatically","isJavaScriptCanOpenWindowsAutomatically","setJavaScriptCanOpenWindowsAutomatically","getDefaultTextEncodingName","setDefaultTextEncodingName","isGeolocationEnabled","setGeolocationEnabled","getUserAgentString","setUserAgentString","isAllowFileAccess","setAllowFileAccess","isAllowFileAccessFromFileURLs","setAllowFileAccessFromFileURLs","isAllowUniversalAccessFromFileURLs","setAllowUniversalAccessFromFileURLs","getCacheMode","setCacheMode","isDomStorageEnabled","setDomStorageEnabled","isAppCacheEnabled","setAppCacheEnabled","getAppCachePath","setAppCachePath","getAppCacheMaxSize","setAppCacheMaxSize","isDatabaseEnabled","setDatabaseEnabled","getDatabasePath","setDatabasePath"));
        ignoreStaticMap.put("WorkManagerUtils", ArrayUtils.asListArgs("getWorkManager","setWorkManager","cancelAllWork","cancelWorkById","cancelAllWorkByTag","cancelUniqueWork","pruneWork","getLastCancelAllTimeMillisLiveData","getLastCancelAllTimeMillis","getWorkInfoByIdLiveData","getWorkInfoById","getWorkInfosByTagLiveData","getWorkInfosByTag","getWorkInfosForUniqueWorkLiveData","getWorkInfosForUniqueWork","getWorkInfosLiveData","getWorkInfos","enqueue","enqueue","enqueueUniqueWork","enqueueUniqueWork","enqueueUniquePeriodicWork","beginWith","beginWith","beginUniqueWork","beginUniqueWork"));
        ignoreStaticMap.put("ZXingEngineImpl", ArrayUtils.asListArgs("initialize","getConfig","encodeBarCode","encodeBarCodeSync","decodeBarCode","decodeBarCodeSync","addIconToBarCode","getInnerConfig","isValidData","encodeCallback","encodeFailureCallback","decodeCallback","decodeFailureCallback"));

        return ignoreStaticMap;
    }

    /**
     * 获取忽略指定方法 @param 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreParamMap() {
        Map<String, List<String>> ignoreParamMap = new HashMap<>();
        ignoreParamMap.put("BarCodeConfig", ArrayUtils.asListArgs("putEncodeHints","putDecodeHints"));
        ignoreParamMap.put("BaseBeanSubscriber", ArrayUtils.asListArgs("onNext","onError"));
        ignoreParamMap.put("BaseResponseSubscriber", ArrayUtils.asListArgs("onNext","onError"));
        ignoreParamMap.put("ChainWorker", ArrayUtils.asListArgs("builder"));
        ignoreParamMap.put("CompressConfig", ArrayUtils.asListArgs("setFailFinish"));
        ignoreParamMap.put("DevCacheEngineImpl", ArrayUtils.asListArgs("setJSONEngine","remove","removeForKeys","contains","isDue","clearType","getItemByKey","put","put","put","put","put","put","put","put","put","put","put","put","getInt","getLong","getFloat","getDouble","getBoolean","getString","getBytes","getBitmap","getDrawable","getSerializable","getParcelable","getJSONObject","getJSONArray","getEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getBytes","getBitmap","getDrawable","getSerializable","getParcelable","getJSONObject","getJSONArray","getEntity"));
        ignoreParamMap.put("DevLoggerEngineImpl", ArrayUtils.asListArgs("d","e","e","e","w","i","v","wtf","json","xml","dTag","eTag","eTag","eTag","wTag","iTag","vTag","wtfTag","jsonTag","xmlTag"));
        ignoreParamMap.put("DevPermissionEngineImpl", ArrayUtils.asListArgs("isGranted","shouldShowRequestPermissionRationale","getDeniedPermissionStatus","againRequest","request","request","request"));
        ignoreParamMap.put("FastjsonEngineImpl", ArrayUtils.asListArgs("toJson","toJson","fromJson","fromJson","fromJson","fromJson","isJSON","isJSONObject","isJSONArray","toJsonIndent","toJsonIndent","toJsonIndent","toJsonIndent"));
        ignoreParamMap.put("GlideEngineImpl", ArrayUtils.asListArgs("pause","resume","pause","resume","preload","preload","clear","clear","clearDiskCache","clearMemoryCache","clearAllCache","lowMemory","display","display","display","display","display","display","display","display","display","display","display","display","display","display","display","display","loadImage","loadImage","loadImage","loadImageThrows","loadBitmap","loadBitmap","loadBitmap","loadBitmapThrows","loadDrawable","loadDrawable","loadDrawable","loadDrawableThrows","convertImageFormat","convertImageFormat","setToRequest","buildRequest","innerDisplayToRequestBuilder"));
        ignoreParamMap.put("GlideEngineImpl.InnerBitmapTarget", ArrayUtils.asListArgs("onResourceReady","onLoadStarted","onLoadFailed","onLoadCleared"));
        ignoreParamMap.put("GlideEngineImpl.InnerBitmapViewTarget", ArrayUtils.asListArgs("setResource","onResourceReady","onLoadStarted","onLoadFailed"));
        ignoreParamMap.put("GlideEngineImpl.InnerConvertStorage", ArrayUtils.asListArgs("convert"));
        ignoreParamMap.put("GlideEngineImpl.InnerDrawableTarget", ArrayUtils.asListArgs("onResourceReady","onLoadStarted","onLoadFailed","onLoadCleared"));
        ignoreParamMap.put("GlideEngineImpl.InnerDrawableViewTarget", ArrayUtils.asListArgs("setResource","onResourceReady","onLoadStarted","onLoadFailed"));
        ignoreParamMap.put("GlideUtils", ArrayUtils.asListArgs("pause","resume","pause","resume","preload","preload","clear","clear","clearDiskCache","clearMemoryCache","clearAllCache","lowMemory","display","display","display","display","display","display","display","display","display","display","display","display","display","display","display","display","loadImage","loadImage","loadImage","loadImageThrows","loadBitmap","loadBitmap","loadBitmap","loadBitmapThrows","loadDrawable","loadDrawable","loadDrawable","loadDrawableThrows","convertImageFormat","convertImageFormat"));
        ignoreParamMap.put("GsonEngineImpl", ArrayUtils.asListArgs("toJson","toJson","fromJson","fromJson","fromJson","fromJson","isJSON","isJSONObject","isJSONArray","toJsonIndent","toJsonIndent","toJsonIndent","toJsonIndent"));
        ignoreParamMap.put("ImageConfig", ArrayUtils.asListArgs("create","setCacheDisk","setCacheMemory","setRoundedCornersRadius","setErrorPlaceholder","setLoadingPlaceholder","setErrorDrawable","setLoadingDrawable","setSize","setThumbnail","setQuality","setOriginalPathReturn","setDontAnimate","setDontTransform"));
        ignoreParamMap.put("LogWorker", ArrayUtils.asListArgs("observe"));
        ignoreParamMap.put("LubanEngineImpl", ArrayUtils.asListArgs("compress","compress","compress","compress"));
        ignoreParamMap.put("LubanUtils.Config", ArrayUtils.asListArgs("setFailFinish"));
        ignoreParamMap.put("LuckCompressFileEngineImpl", ArrayUtils.asListArgs("onStartCompress"));
        ignoreParamMap.put("LuckCropFileEngineImpl", ArrayUtils.asListArgs("onStartCrop"));
        ignoreParamMap.put("LuckImageEngineImpl", ArrayUtils.asListArgs("loadImage","pauseRequests","resumeRequests"));
        ignoreParamMap.put("LuckMediaEditInterceptListener", ArrayUtils.asListArgs("onStartMediaEdit"));
        ignoreParamMap.put("LuckRecordAudioInterceptListener", ArrayUtils.asListArgs("onRecordAudio"));
        ignoreParamMap.put("LuckSandboxFileEngineImpl", ArrayUtils.asListArgs("onUriToFileAsyncTransform"));
        ignoreParamMap.put("MMKVKeyValueEngineImpl", ArrayUtils.asListArgs("setJSONEngine","remove","removeForKeys","contains","putInt","putLong","putFloat","putDouble","putBoolean","putString","putEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getEntity"));
        ignoreParamMap.put("MMKVUtils.Holder", ArrayUtils.asListArgs("encode","encode","encode","encode","encode","encode","encode","encode","encode","decodeBool","decodeBool","decodeInt","decodeInt","decodeLong","decodeLong","decodeFloat","decodeFloat","decodeDouble","decodeDouble","decodeString","decodeString","decodeStringSet","decodeStringSet","decodeStringSet","decodeBytes","decodeBytes","decodeParcelable","decodeParcelable"));
        ignoreParamMap.put("PictureSelectorEngineImpl", ArrayUtils.asListArgs("setConfig","openCamera","openCamera","openCamera","openCamera","openGallery","openGallery","openGallery","openGallery","openPreview","openPreview","openPreview","openPreview","deleteCacheDirFile","deleteAllCacheDirFile","isMediaSelectorResult","getSelectors","getSelectorUris","getSingleSelector","getSingleSelectorUri"));
        ignoreParamMap.put("SPKeyValueEngineImpl", ArrayUtils.asListArgs("setJSONEngine","remove","removeForKeys","contains","putInt","putLong","putFloat","putDouble","putBoolean","putString","putEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getEntity"));
        ignoreParamMap.put("StorageItem", ArrayUtils.asListArgs("setFormat","setQuality","setOutputUri","setFileName","setFilePath","setFolder","setMimeType"));
        ignoreParamMap.put("StorageResult", ArrayUtils.asListArgs("setUri","setFile","setError","setType","setExternal"));
        ignoreParamMap.put("WorkManagerUtils", ArrayUtils.asListArgs("enqueue","enqueueUniqueWork","beginWith","beginUniqueWork"));
        ignoreParamMap.put("ZXingEngineImpl", ArrayUtils.asListArgs("initialize","encodeBarCode","encodeBarCodeSync","decodeBarCode","decodeBarCodeSync"));
        ignoreParamMap.put("ZXingUtils", ArrayUtils.asListArgs("initialize","encodeBarCode","encodeBarCodeSync","decodeBarCode","decodeBarCodeSync","addIconToBarCode"));

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
        ignoreUnPublicMap.put("ACacheUtils", ArrayUtils.asListArgs("isDue","isDue","newStringWithDateInfo","newByteArrayWithDateInfo","createDateInfo","clearDateInfo","clearDateInfo","hasDateInfo","getDateInfoFromDate","indexOf","copyOfRange","bitmapToByte","byteToBitmap","drawableToBitmap","bitmapToDrawable"));
        ignoreUnPublicMap.put("BaseBeanSubscriber", ArrayUtils.asListArgs("onStart","getErrorMessage"));
        ignoreUnPublicMap.put("BaseResponseSubscriber", ArrayUtils.asListArgs("onStart","getErrorMessage","isSuccess"));
        ignoreUnPublicMap.put("DevMediaStoreEngineImpl", ArrayUtils.asListArgs("convertType","innerPreCheck","getOutputUri","getOutputFile","innerInsertToExternal","innerInsertToInternal","innerInsertThread","innerInsertFinal","finalCallback"));
        ignoreUnPublicMap.put("GlideEngineImpl", ArrayUtils.asListArgs("canFragmentLoadImage","setToRequest","setToRequest","buildRequestOptions","buildRequest","innerDisplayToRequestBuilder","innerDisplayToRequestBuilder","innerConvertImageFormat"));
        ignoreUnPublicMap.put("GlideEngineImpl.InnerBitmapViewTarget", ArrayUtils.asListArgs("setResource"));
        ignoreUnPublicMap.put("GlideEngineImpl.InnerDrawableViewTarget", ArrayUtils.asListArgs("setResource"));
        ignoreUnPublicMap.put("LocationWorker", ArrayUtils.asListArgs("test"));
        ignoreUnPublicMap.put("LogWorker", ArrayUtils.asListArgs("code","createData","getLog"));
        ignoreUnPublicMap.put("LubanUtils.OnCompressListener", ArrayUtils.asListArgs("onStart","onSuccess","onError","onComplete"));
        ignoreUnPublicMap.put("LuckCompressFileEngineImpl", ArrayUtils.asListArgs("toInputStreamList","toUriPath"));
        ignoreUnPublicMap.put("LuckRecordAudioInterceptListener", ArrayUtils.asListArgs("startRecordSoundAction"));
        ignoreUnPublicMap.put("PictureSelectorEngineImpl", ArrayUtils.asListArgs("convertList","createMediaData","startCameraModel","startGalleryModel","startPreviewModel"));
        ignoreUnPublicMap.put("StorageItem", ArrayUtils.asListArgs("setOutputUri","setFileName","setFilePath","setFolder","setMimeType"));
        ignoreUnPublicMap.put("StorageResult", ArrayUtils.asListArgs("setUri","setFile","setError","setType","setExternal"));
        ignoreUnPublicMap.put("WebViewAssist.Builder", ArrayUtils.asListArgs("setWebViewAssist","applyPri"));
        ignoreUnPublicMap.put("WebViewAssist.Builder.OnApplyListener", ArrayUtils.asListArgs("onApply"));
        ignoreUnPublicMap.put("ZXingEngineImpl", ArrayUtils.asListArgs("getInnerConfig","isValidData","encodeCallback","encodeFailureCallback","decodeCallback","decodeFailureCallback"));

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
        ignoreReturnVoidMap.put("DevMediaStoreEngineImpl", ArrayUtils.asListArgs("insertImageToExternal - void","insertVideoToExternal - void","insertAudioToExternal - void","insertDownloadToExternal - void","insertMediaToExternal - void","insertImageToInternal - void","insertVideoToInternal - void","insertAudioToInternal - void","insertDownloadToInternal - void","insertMediaToInternal - void","innerInsertToExternal - void","innerInsertToInternal - void","innerInsertThread - void","innerInsertFinal - void","finalCallback - void"));
        ignoreReturnVoidMap.put("EventBusUtils", ArrayUtils.asListArgs("register - void","unregister - void","post - void","cancelEventDelivery - void","postSticky - void","removeStickyEvent - void","removeAllStickyEvents - void"));
        ignoreReturnVoidMap.put("GlideEngineImpl", ArrayUtils.asListArgs("innerDisplayToRequestBuilder - void","innerDisplayToRequestBuilder - void"));
        ignoreReturnVoidMap.put("ImageLoaderUtils", ArrayUtils.asListArgs("initialize - void","displayImage - void","displayImage - void","displayImage - void","displayImage - void","displayImage - void","displayImage - void","displayImage - void","displayImage - void","loadImage - void","loadImage - void","loadImage - void","loadImage - void","loadImage - void","loadImage - void","clearDiskCache - void","clearMemoryCache - void","handleSlowNetwork - void","denyNetworkDownloads - void","cancelDisplayTask - void","setDefaultLoadingListener - void","destroy - void","pause - void","resume - void","stop - void"));
        ignoreReturnVoidMap.put("LogWorker", ArrayUtils.asListArgs("onStopped - void","code - void","observe - void"));
        ignoreReturnVoidMap.put("LubanUtils.OnCompressListener", ArrayUtils.asListArgs("onStart - void","onSuccess - void","onError - void","onComplete - void"));
        ignoreReturnVoidMap.put("LuckImageEngineImpl", ArrayUtils.asListArgs("loadImage - void","loadAlbumCover - void","loadGridImage - void"));
        ignoreReturnVoidMap.put("LuckRecordAudioInterceptListener", ArrayUtils.asListArgs("startRecordSoundAction - void"));
        ignoreReturnVoidMap.put("MMKVUtils", ArrayUtils.asListArgs("initialize - void"));
        ignoreReturnVoidMap.put("PictureSelectorUtils", ArrayUtils.asListArgs("setConfig - void","deleteCacheDirFile - void","deleteAllCacheDirFile - void"));
        ignoreReturnVoidMap.put("RxJavaManager", ArrayUtils.asListArgs("add - void","remove - void"));
        ignoreReturnVoidMap.put("WebViewAssist", ArrayUtils.asListArgs("setGlobalBuilder - void","removeCookie - void"));
        ignoreReturnVoidMap.put("WebViewAssist.Builder.OnApplyListener", ArrayUtils.asListArgs("onApply - void"));
        ignoreReturnVoidMap.put("ZXingEngineImpl", ArrayUtils.asListArgs("encodeCallback - void","encodeFailureCallback - void","decodeCallback - void","decodeFailureCallback - void"));

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