package javadoc.dev_utils.check.dev_assist;

import dev.utils.common.ArrayUtils;
import javadoc.dev_utils.check.dev.ICheckConfig;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * detail: DevAssistConfig 代码检测分析配置
 * @author Ttt
 */
final class DevAssistConfig implements ICheckConfig {

    /**
     * 获取忽略指定方法注释配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreAnnotateMap() {
        Map<String, List<String>> ignoreAnnotateMap = new HashMap<>();
        ignoreAnnotateMap.put("BitmapListener", ArrayUtils.asListArgs("getTranscodeType"));
        ignoreAnnotateMap.put("DevDataAdapter", ArrayUtils.asListArgs("getContext","getItemCount","getDataList","getDataArrayList","getDataSize","getDataItem","getDataItemPosition","getFirstData","getLastData","getLastPosition","isDataEmpty","isDataNotEmpty","isFirstPosition","isLastPosition","isLastPosition","isLastPositionAndGreaterThanOrEqual","isLastPositionAndGreaterThanOrEqual","equalsFirstData","equalsLastData","equalsPositionData","addData","addDataAt","addDatas","addDatasAt","addDatasChecked","addDatasCheckedAt","addLists","removeData","removeDataAt","removeDatas","replaceData","replaceDataAt","swipePosition","contains","clearDataList","clearDataList","setDataList","setDataList","notifyDataChanged","notifyElementChanged"));
        ignoreAnnotateMap.put("DevDataAdapterExt", ArrayUtils.asListArgs("getObject","getPage","setPage"));
        ignoreAnnotateMap.put("DevSource", ArrayUtils.asListArgs("create","create","createWithPath","isUrl","isUri","isBytes","isResource","isFile","isSource"));
        ignoreAnnotateMap.put("DrawableListener", ArrayUtils.asListArgs("getTranscodeType"));
        ignoreAnnotateMap.put("EditTextSearchAssist", ArrayUtils.asListArgs("initTextWatcher"));
        ignoreAnnotateMap.put("EditTextWatcherAssist.FocusListener", ArrayUtils.asListArgs("onFocusChange"));
        ignoreAnnotateMap.put("Function.Method", ArrayUtils.asListArgs("method"));
        ignoreAnnotateMap.put("Function.Method2", ArrayUtils.asListArgs("error"));
        ignoreAnnotateMap.put("IImageEngine", ArrayUtils.asListArgs("pause","resume","pause","resume","preload","preload","clear","clear","clearDiskCache","clearMemoryCache","clearAllCache","lowMemory","display","display","display","display","display","display","display","display","display","display","display","display","display","display","display","display","loadImage","loadImage","loadImage","loadImageThrows","loadBitmap","loadBitmap","loadBitmap","loadBitmapThrows","loadDrawable","loadDrawable","loadDrawable","loadDrawableThrows","convertImageFormat","convertImageFormat"));

        return ignoreAnnotateMap;
    }

    /**
     * 获取忽略指定方法参数 final 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreFinalMap() {
        Map<String, List<String>> ignoreFinalMap = new HashMap<>();
        ignoreFinalMap.put("DataAssist", ArrayUtils.asListArgs("getDataItem","getDataItemPosition","isFirstPosition","isLastPosition","isLastPosition","isLastPositionAndGreaterThanOrEqual","isLastPositionAndGreaterThanOrEqual","equalsFirstData","equalsLastData","equalsPositionData","addData","addDataAt","addDatas","addDatasAt","addDatasChecked","addDatasCheckedAt","addLists","removeData","removeDataAt","removeDatas","replaceData","replaceDataAt","swipePosition","contains","clearDataList","setDataList","setDataList","notifyElementChanged"));
        ignoreFinalMap.put("DevCallback", ArrayUtils.asListArgs("callback","callback","filter","isFilter","compare"));
        ignoreFinalMap.put("DevClickCallback", ArrayUtils.asListArgs("onClick","onClick","onLongClick","onLongClick"));
        ignoreFinalMap.put("DevDataSource", ArrayUtils.asListArgs("getDataItem","getDataItemPosition","isFirstPosition","isLastPosition","isLastPosition","isLastPositionAndGreaterThanOrEqual","isLastPositionAndGreaterThanOrEqual","equalsFirstData","equalsLastData","equalsPositionData","addData","addDataAt","addDatas","addDatasAt","addDatasChecked","addDatasCheckedAt","addLists","removeData","removeDataAt","removeDatas","replaceData","replaceDataAt","swipePosition","contains","clearDataList","setDataList","setDataList"));
        ignoreFinalMap.put("DevItemClickCallback", ArrayUtils.asListArgs("onItemClick","onItemClick","onItemLongClick","onItemLongClick"));
        ignoreFinalMap.put("EditTextWatcherAssist.FocusListener", ArrayUtils.asListArgs("onFocusChange"));

        return ignoreFinalMap;
    }

    /**
     * 获取忽略指定方法 static 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreStaticMap() {
        Map<String, List<String>> ignoreStaticMap = new HashMap<>();
        ignoreStaticMap.put("DataAssist", ArrayUtils.asListArgs("setDataChanged","getDataSource","getDataList","getDataArrayList","getDataSize","getDataItem","getDataItemPosition","getFirstData","getLastData","getLastPosition","isDataEmpty","isDataNotEmpty","isFirstPosition","isLastPosition","isLastPosition","isLastPositionAndGreaterThanOrEqual","isLastPositionAndGreaterThanOrEqual","equalsFirstData","equalsLastData","equalsPositionData","addData","addDataAt","addDatas","addDatasAt","addDatasChecked","addDatasCheckedAt","addLists","removeData","removeDataAt","removeDatas","replaceData","replaceDataAt","swipePosition","contains","clearDataList","clearDataList","setDataList","setDataList","notifyDataChanged","notifyElementChanged"));
        ignoreStaticMap.put("DevCallback", ArrayUtils.asListArgs("callback","callback","callback","filter","isFilter","compare"));
        ignoreStaticMap.put("DevClickCallback", ArrayUtils.asListArgs("onClick","onClick","onClick","onLongClick","onLongClick","onLongClick"));
        ignoreStaticMap.put("DevDataSource", ArrayUtils.asListArgs("getDataList","getDataArrayList","getDataSize","getDataItem","getDataItemPosition","getFirstData","getLastData","getLastPosition","isDataEmpty","isDataNotEmpty","isFirstPosition","isLastPosition","isLastPosition","isLastPositionAndGreaterThanOrEqual","isLastPositionAndGreaterThanOrEqual","equalsFirstData","equalsLastData","equalsPositionData","addData","addDataAt","addDatas","addDatasAt","addDatasChecked","addDatasCheckedAt","addLists","removeData","removeDataAt","removeDatas","replaceData","replaceDataAt","swipePosition","contains","clearDataList","clearDataList","setDataList","setDataList"));
        ignoreStaticMap.put("DevDialogCallback", ArrayUtils.asListArgs("onDialogNotify","onDialogShow","onDialogDismiss","onDialogStart","onDialogResume","onDialogPause","onDialogStop","onDialogDestroy"));
        ignoreStaticMap.put("DevEntry", ArrayUtils.asListArgs("getKey","setKey","getValue","setValue","equalsKey","equalsValue"));
        ignoreStaticMap.put("DevItemClickCallback", ArrayUtils.asListArgs("onItemClick","onItemClick","onItemClick","onItemLongClick","onItemLongClick","onItemLongClick"));
        ignoreStaticMap.put("DevMultiSelectList", ArrayUtils.asListArgs("clearSelects","getSelectSize","getSelects","putSelects","putSelects","isSelect","isSelectValue","unselectValue","unselectValueAll","isSelect","select","select","select","unselect","unselect","toggle","getSelectValues","getSelectValuesToReverse","getSelectValue","getSelectValueToPosition"));
        ignoreStaticMap.put("DevMultiSelectMap", ArrayUtils.asListArgs("clearSelects","getSelectSize","getSelects","putSelects","putSelects","isSelect","isSelectValue","unselectValue","unselectValueAll","isSelect","isSelectKey","select","select","unselect","toggle","getSelectValue","getSelectValues","getSelectValuesToReverse","getSelectKey","getSelectKeys","getSelectKeysToReverse"));
        ignoreStaticMap.put("DevNumber", ArrayUtils.asListArgs("isMinNumber","isMinNumber","isLessThanMinNumber","isGreaterThanMinNumber","isMaxNumber","isMaxNumber","isLessThanMaxNumber","isGreaterThanMaxNumber","getMinNumber","setMinNumber","getMaxNumber","setMaxNumber","setMinMaxNumber","getCurrentNumber","setCurrentNumber","setCurrentNumber","getResetNumber","setResetNumber","isAllowNegative","setAllowNegative","numberChange","addNumber","subtractionNumber","getNumberListener","setNumberListener","checkUpdate"));
        ignoreStaticMap.put("DevObject", ArrayUtils.asListArgs("getUUID","getObject","setObject","getTag","convertTag","setTag","getModelId","setModelId","getCode","setCode","setCode","getType","setType","getState","setState","getTokenUUID","setTokenUUID","randomTokenUUID","equalsObject","equalsTag","equalsModelId","equalsCode","equalsCode","equalsType","equalsState","equalsTokenUUID","isCorrect"));
        ignoreStaticMap.put("DevPage", ArrayUtils.asListArgs("reset","getPage","setPage","equalsPage","getPageSize","equalsPageSize","isLastPage","setLastPage","calculateLastPage","isFirstPage","canNextPage","getNextPage","nextPage","isLessThanPageSize"));
        ignoreStaticMap.put("DevSource", ArrayUtils.asListArgs("isUrl","isUri","isBytes","isResource","isFile","isSource"));
        ignoreStaticMap.put("DevVariable", ArrayUtils.asListArgs("getVariables","clearVariables","putVariables","getVariablesSize","isVariables","isVariableValue","removeVariableValue","removeVariableValueAll","isVariable","isVariable","putVariable","putVariable","removeVariable","toggle","getVariableValue","getVariableValueConvert","getVariableValues","getVariableValuesToReverse","getVariableKey","getVariableKeys","getVariableKeysToReverse"));
        ignoreStaticMap.put("EditTextSearchAssist", ArrayUtils.asListArgs("remove","post","setDelayMillis","setCallback","setCallback","bindEditText","initTextWatcher"));
        ignoreStaticMap.put("EditTextWatcherAssist", ArrayUtils.asListArgs("bindListener","bindListener","focusChange"));
        ignoreStaticMap.put("EditTextWatcherAssist.FocusListener", ArrayUtils.asListArgs("onFocusChange"));
        ignoreStaticMap.put("Function.Operation", ArrayUtils.asListArgs("getObject","setObject","operation","operation","tryCatch","thread","thread","threadPool","threadPool","threadPool","threadPool","threadCatch","threadCatch","threadPoolCatch","threadPoolCatch","threadPoolCatch","threadPoolCatch"));
        ignoreStaticMap.put("IHttpEngine.Response", ArrayUtils.asListArgs("getRequest","getSentRequestAtMillis","getReceivedResponseAtMillis"));
        ignoreStaticMap.put("NumberControlAssist", ArrayUtils.asListArgs("getNumber","isMinNumber","isMinNumber","isLessThanMinNumber","isGreaterThanMinNumber","isMaxNumber","isMaxNumber","isLessThanMaxNumber","isGreaterThanMaxNumber","getMinNumber","setMinNumber","getMaxNumber","setMaxNumber","setMinMaxNumber","getCurrentNumber","setCurrentNumber","setCurrentNumber","getResetNumber","setResetNumber","isAllowNegative","setAllowNegative","numberChange","addNumber","subtractionNumber","getNumberListener","setNumberListener"));
        ignoreStaticMap.put("PageAssist", ArrayUtils.asListArgs("reset","getPage","setPage","equalsPage","getPageSize","equalsPageSize","isLastPage","setLastPage","calculateLastPage","isFirstPage","canNextPage","getNextPage","nextPage","isLessThanPageSize"));
        ignoreStaticMap.put("RequestState", ArrayUtils.asListArgs("getType","setType","equalsType","getRequestUUID","randomRequestUUID","equalsRequestUUID","getState","setState","equalsState","isRequestNormal","isRequestNever","isRequestIng","isRequestSuccess","isRequestFail","isRequestError","setRequestNormal","setRequestNever","setRequestIng","setRequestSuccess","setRequestFail","setRequestError"));

        return ignoreStaticMap;
    }

    /**
     * 获取忽略指定方法 @param 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreParamMap() {
        Map<String, List<String>> ignoreParamMap = new HashMap<>();
        ignoreParamMap.put("DataAssist", ArrayUtils.asListArgs("setDataChanged"));
        ignoreParamMap.put("DevDataAdapter", ArrayUtils.asListArgs("getDataItem","getDataItemPosition","isFirstPosition","isLastPosition","isLastPosition","isLastPositionAndGreaterThanOrEqual","isLastPositionAndGreaterThanOrEqual","equalsFirstData","equalsLastData","equalsPositionData","addData","addDataAt","addDatas","addDatasAt","addDatasChecked","addDatasCheckedAt","addLists","removeData","removeDataAt","removeDatas","replaceData","replaceDataAt","swipePosition","contains","clearDataList","setDataList","setDataList","notifyElementChanged"));
        ignoreParamMap.put("DevDataAdapterExt", ArrayUtils.asListArgs("setPage"));
        ignoreParamMap.put("DevEntry", ArrayUtils.asListArgs("setKey","setValue"));
        ignoreParamMap.put("DevNumber", ArrayUtils.asListArgs("setMinNumber","setMaxNumber","setMinMaxNumber","setCurrentNumber","setCurrentNumber","setResetNumber","setAllowNegative","numberChange","setNumberListener"));
        ignoreParamMap.put("DevObject", ArrayUtils.asListArgs("setObject","convertTag","setTag","setModelId","setCode","setCode","setType","setState","setTokenUUID"));
        ignoreParamMap.put("DevPage", ArrayUtils.asListArgs("setPage","setLastPage","calculateLastPage"));
        ignoreParamMap.put("DevSource", ArrayUtils.asListArgs("create","create","createWithPath"));
        ignoreParamMap.put("DevVariable", ArrayUtils.asListArgs("putVariables","removeVariableValue","removeVariableValueAll","putVariable","putVariable","removeVariable","toggle"));
        ignoreParamMap.put("EditTextWatcherAssist.FocusListener", ArrayUtils.asListArgs("onFocusChange"));
        ignoreParamMap.put("Function.Method", ArrayUtils.asListArgs("method"));
        ignoreParamMap.put("Function.Method2", ArrayUtils.asListArgs("error"));
        ignoreParamMap.put("IImageEngine", ArrayUtils.asListArgs("pause","resume","pause","resume","preload","preload","clear","clear","clearDiskCache","clearMemoryCache","clearAllCache","lowMemory","display","display","display","display","display","display","display","display","display","display","display","display","display","display","display","display","loadImage","loadImage","loadImage","loadImageThrows","loadBitmap","loadBitmap","loadBitmap","loadBitmapThrows","loadDrawable","loadDrawable","loadDrawable","loadDrawableThrows","convertImageFormat","convertImageFormat"));
        ignoreParamMap.put("PageAssist", ArrayUtils.asListArgs("setPage","setLastPage","calculateLastPage"));
        ignoreParamMap.put("RequestState", ArrayUtils.asListArgs("setType","setState"));

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
        ignoreUnPublicMap.put("CompressFilter", ArrayUtils.asListArgs("apply"));
        ignoreUnPublicMap.put("ConvertStorage", ArrayUtils.asListArgs("convert"));
        ignoreUnPublicMap.put("DataChanged", ArrayUtils.asListArgs("notifyDataChanged","notifyElementChanged"));
        ignoreUnPublicMap.put("DataManager", ArrayUtils.asListArgs("getDataList","getDataArrayList","getDataSize","getDataItem","getDataItemPosition","getFirstData","getLastData","getLastPosition","isDataEmpty","isDataNotEmpty","isFirstPosition","isLastPosition","isLastPosition","isLastPositionAndGreaterThanOrEqual","isLastPositionAndGreaterThanOrEqual","equalsFirstData","equalsLastData","equalsPositionData","addData","addDataAt","addDatas","addDatasAt","addDatasChecked","addDatasCheckedAt","addLists","removeData","removeDataAt","removeDatas","replaceData","replaceDataAt","swipePosition","contains","clearDataList","clearDataList","setDataList","setDataList"));
        ignoreUnPublicMap.put("DevNumber", ArrayUtils.asListArgs("checkUpdate"));
        ignoreUnPublicMap.put("EditTextSearchAssist", ArrayUtils.asListArgs("initTextWatcher"));
        ignoreUnPublicMap.put("EditTextSearchAssist.SearchCallback", ArrayUtils.asListArgs("callback"));
        ignoreUnPublicMap.put("EditTextWatcherAssist", ArrayUtils.asListArgs("focusChange"));
        ignoreUnPublicMap.put("EditTextWatcherAssist.InputListener", ArrayUtils.asListArgs("onTextChanged"));
        ignoreUnPublicMap.put("Function.Method", ArrayUtils.asListArgs("method"));
        ignoreUnPublicMap.put("Function.Method2", ArrayUtils.asListArgs("error"));
        ignoreUnPublicMap.put("ICacheEngine", ArrayUtils.asListArgs("getConfig","remove","removeForKeys","contains","isDue","clear","clearDue","clearType","getKeys","getPermanentKeys","getCount","getSize","put","put","put","put","put","put","put","put","put","put","put","put","getInt","getLong","getFloat","getDouble","getBoolean","getString","getBytes","getBitmap","getDrawable","getSerializable","getParcelable","getJSONObject","getJSONArray","getEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getBytes","getBitmap","getDrawable","getSerializable","getParcelable","getJSONObject","getJSONArray","getEntity"));
        ignoreUnPublicMap.put("ICompressEngine", ArrayUtils.asListArgs("compress","compress","compress","compress"));
        ignoreUnPublicMap.put("IHttpEngine", ArrayUtils.asListArgs("newCall","cancelAll","cancelCall","cancelUrl","cancelTag"));
        ignoreUnPublicMap.put("IHttpEngine.Call", ArrayUtils.asListArgs("getRequest","isCanceled","isExecuted","isEnd","cancel","start","startAsync"));
        ignoreUnPublicMap.put("IImageEngine", ArrayUtils.asListArgs("pause","resume","pause","resume","preload","preload","clear","clear","clearDiskCache","clearMemoryCache","clearAllCache","lowMemory","display","display","display","display","display","display","display","display","display","display","display","display","display","display","display","display","loadImage","loadImage","loadImage","loadImageThrows","loadBitmap","loadBitmap","loadBitmap","loadBitmapThrows","loadDrawable","loadDrawable","loadDrawable","loadDrawableThrows","convertImageFormat","convertImageFormat"));
        ignoreUnPublicMap.put("IJSONEngine", ArrayUtils.asListArgs("toJson","toJson","fromJson","fromJson","fromJson","fromJson","isJSON","isJSONObject","isJSONArray","toJsonIndent","toJsonIndent","toJsonIndent","toJsonIndent"));
        ignoreUnPublicMap.put("ILogEngine", ArrayUtils.asListArgs("isPrintLog","d","e","e","e","w","i","v","wtf","json","xml","dTag","eTag","eTag","eTag","wTag","iTag","vTag","wtfTag","jsonTag","xmlTag"));
        ignoreUnPublicMap.put("IMediaEngine", ArrayUtils.asListArgs("openCamera","openCamera","openCamera","openCamera","openGallery","openGallery","openGallery","openGallery","getConfig","setConfig","getCameraSavePath","getCompressSavePath","setSavePath","getMinimumCompressSize","setMinimumCompressSize","deleteCacheDirFile","deleteAllCacheDirFile","isMediaSelectorResult","getSelectors","getSelectorPaths","getSingleSelector","getSingleSelectorPath"));
        ignoreUnPublicMap.put("IMultiSelect", ArrayUtils.asListArgs("clearSelects","getSelectSize","getSelects","putSelects","putSelects","isSelect","isSelectValue","unselectValue","unselectValueAll"));
        ignoreUnPublicMap.put("IMultiSelectEdit", ArrayUtils.asListArgs("isEditState","setEditState","toggleEditState","selectAll","clearSelectAll","inverseSelect","isSelectAll","isSelect","isNotSelect","getSelectSize","getDataCount"));
        ignoreUnPublicMap.put("IMultiSelectToList", ArrayUtils.asListArgs("isSelect","select","select","select","unselect","unselect","toggle","getSelectValues","getSelectValuesToReverse","getSelectValue","getSelectValueToPosition"));
        ignoreUnPublicMap.put("IMultiSelectToMap", ArrayUtils.asListArgs("isSelect","isSelectKey","select","select","unselect","toggle","getSelectValue","getSelectValues","getSelectValuesToReverse","getSelectKey","getSelectKeys","getSelectKeysToReverse"));
        ignoreUnPublicMap.put("INumberListener", ArrayUtils.asListArgs("onPrepareChanged","onNumberChanged"));
        ignoreUnPublicMap.put("INumberOperate", ArrayUtils.asListArgs("isMinNumber","isMinNumber","isLessThanMinNumber","isGreaterThanMinNumber","isMaxNumber","isMaxNumber","isLessThanMaxNumber","isGreaterThanMaxNumber","getMinNumber","setMinNumber","getMaxNumber","setMaxNumber","setMinMaxNumber","getCurrentNumber","setCurrentNumber","setCurrentNumber","getResetNumber","setResetNumber","isAllowNegative","setAllowNegative","numberChange","addNumber","subtractionNumber","getNumberListener","setNumberListener"));
        ignoreUnPublicMap.put("IPermissionEngine", ArrayUtils.asListArgs("isGranted","shouldShowRequestPermissionRationale","getDeniedPermissionStatus","againRequest","request","request"));
        ignoreUnPublicMap.put("IPermissionEngine.Callback", ArrayUtils.asListArgs("onGranted","onDenied"));
        ignoreUnPublicMap.put("IStorageEngine", ArrayUtils.asListArgs("getConfig","remove","removeForKeys","contains","clear","putInt","putLong","putFloat","putDouble","putBoolean","putString","putEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getEntity"));
        ignoreUnPublicMap.put("LoadListener", ArrayUtils.asListArgs("getTranscodeType","onStart","onResponse","onFailure"));
        ignoreUnPublicMap.put("OnCompressListener", ArrayUtils.asListArgs("onStart","onSuccess","onError","onComplete"));
        ignoreUnPublicMap.put("OnConvertListener", ArrayUtils.asListArgs("onStart","onSuccess","onError","onComplete"));
        ignoreUnPublicMap.put("OnRenameListener", ArrayUtils.asListArgs("rename"));

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
        ignoreReturnVoidMap.put("DataAssist", ArrayUtils.asListArgs("clearDataList - void","clearDataList - void","notifyDataChanged - void","notifyElementChanged - void"));
        ignoreReturnVoidMap.put("DataChanged", ArrayUtils.asListArgs("notifyDataChanged - void","notifyElementChanged - void"));
        ignoreReturnVoidMap.put("DataManager", ArrayUtils.asListArgs("clearDataList - void","clearDataList - void"));
        ignoreReturnVoidMap.put("DevCacheEngine", ArrayUtils.asListArgs("setEngine - void"));
        ignoreReturnVoidMap.put("DevCallback", ArrayUtils.asListArgs("callback - void","callback - void","callback - void"));
        ignoreReturnVoidMap.put("DevClickCallback", ArrayUtils.asListArgs("onClick - void","onClick - void","onClick - void","onLongClick - void","onLongClick - void","onLongClick - void"));
        ignoreReturnVoidMap.put("DevCompressEngine", ArrayUtils.asListArgs("setEngine - void"));
        ignoreReturnVoidMap.put("DevDataSource", ArrayUtils.asListArgs("clearDataList - void","clearDataList - void"));
        ignoreReturnVoidMap.put("DevDialogCallback", ArrayUtils.asListArgs("onDialogNotify - void","onDialogShow - void","onDialogDismiss - void","onDialogStart - void","onDialogResume - void","onDialogPause - void","onDialogStop - void","onDialogDestroy - void"));
        ignoreReturnVoidMap.put("DevHttpEngine", ArrayUtils.asListArgs("setEngine - void"));
        ignoreReturnVoidMap.put("DevImageEngine", ArrayUtils.asListArgs("setEngine - void"));
        ignoreReturnVoidMap.put("DevItemClickCallback", ArrayUtils.asListArgs("onItemClick - void","onItemClick - void","onItemClick - void","onItemLongClick - void","onItemLongClick - void","onItemLongClick - void"));
        ignoreReturnVoidMap.put("DevJSONEngine", ArrayUtils.asListArgs("setEngine - void"));
        ignoreReturnVoidMap.put("DevLogEngine", ArrayUtils.asListArgs("setEngine - void"));
        ignoreReturnVoidMap.put("DevMediaEngine", ArrayUtils.asListArgs("setEngine - void"));
        ignoreReturnVoidMap.put("DevMultiSelectList", ArrayUtils.asListArgs("clearSelects - void","putSelects - void","putSelects - void","unselectValue - void","unselectValueAll - void","select - void","select - void","select - void","unselect - void","toggle - void"));
        ignoreReturnVoidMap.put("DevMultiSelectMap", ArrayUtils.asListArgs("clearSelects - void","putSelects - void","putSelects - void","unselectValue - void","unselectValueAll - void","select - void","select - void","unselect - void","toggle - void"));
        ignoreReturnVoidMap.put("DevNumber", ArrayUtils.asListArgs("checkUpdate - void"));
        ignoreReturnVoidMap.put("DevPermissionEngine", ArrayUtils.asListArgs("setEngine - void"));
        ignoreReturnVoidMap.put("DevResultCallback", ArrayUtils.asListArgs("onResult - void","onError - void","onFailure - void"));
        ignoreReturnVoidMap.put("DevStorageEngine", ArrayUtils.asListArgs("setEngine - void"));
        ignoreReturnVoidMap.put("EditTextSearchAssist", ArrayUtils.asListArgs("remove - void","post - void"));
        ignoreReturnVoidMap.put("EditTextSearchAssist.SearchCallback", ArrayUtils.asListArgs("callback - void"));
        ignoreReturnVoidMap.put("EditTextWatcherAssist", ArrayUtils.asListArgs("bindListener - void","bindListener - void","focusChange - void"));
        ignoreReturnVoidMap.put("EditTextWatcherAssist.InputListener", ArrayUtils.asListArgs("onTextChanged - void"));
        ignoreReturnVoidMap.put("ICacheEngine", ArrayUtils.asListArgs("remove - void","removeForKeys - void","clear - void","clearDue - void","clearType - void"));
        ignoreReturnVoidMap.put("IHttpEngine", ArrayUtils.asListArgs("cancelAll - void","cancelCall - void","cancelUrl - void","cancelTag - void"));
        ignoreReturnVoidMap.put("IHttpEngine.Call", ArrayUtils.asListArgs("cancel - void"));
        ignoreReturnVoidMap.put("IHttpEngine.RequestCallback", ArrayUtils.asListArgs("onStart - void","onCancel - void","onResponse - void","onFailure - void"));
        ignoreReturnVoidMap.put("ILogEngine", ArrayUtils.asListArgs("d - void","e - void","e - void","e - void","w - void","i - void","v - void","wtf - void","json - void","xml - void","dTag - void","eTag - void","eTag - void","eTag - void","wTag - void","iTag - void","vTag - void","wtfTag - void","jsonTag - void","xmlTag - void"));
        ignoreReturnVoidMap.put("IMediaEngine", ArrayUtils.asListArgs("setConfig - void","setSavePath - void","setMinimumCompressSize - void","deleteCacheDirFile - void","deleteAllCacheDirFile - void"));
        ignoreReturnVoidMap.put("IMultiSelect", ArrayUtils.asListArgs("clearSelects - void","putSelects - void","putSelects - void","unselectValue - void","unselectValueAll - void"));
        ignoreReturnVoidMap.put("IMultiSelectToList", ArrayUtils.asListArgs("select - void","select - void","select - void","unselect - void","toggle - void"));
        ignoreReturnVoidMap.put("IMultiSelectToMap", ArrayUtils.asListArgs("select - void","select - void","unselect - void","toggle - void"));
        ignoreReturnVoidMap.put("INumberListener", ArrayUtils.asListArgs("onNumberChanged - void"));
        ignoreReturnVoidMap.put("IPermissionEngine", ArrayUtils.asListArgs("request - void","request - void"));
        ignoreReturnVoidMap.put("IPermissionEngine.Callback", ArrayUtils.asListArgs("onGranted - void","onDenied - void"));
        ignoreReturnVoidMap.put("IStorageEngine", ArrayUtils.asListArgs("remove - void","removeForKeys - void","clear - void"));
        ignoreReturnVoidMap.put("LoadListener", ArrayUtils.asListArgs("onStart - void","onResponse - void","onFailure - void"));
        ignoreReturnVoidMap.put("OnCompressListener", ArrayUtils.asListArgs("onStart - void","onSuccess - void","onError - void","onComplete - void"));
        ignoreReturnVoidMap.put("OnConvertListener", ArrayUtils.asListArgs("onStart - void","onSuccess - void","onError - void","onComplete - void"));
        ignoreReturnVoidMap.put("PageAssist", ArrayUtils.asListArgs("initPageConfig - void"));

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