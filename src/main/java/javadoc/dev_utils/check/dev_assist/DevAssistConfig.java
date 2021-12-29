package javadoc.dev_utils.check.dev_assist;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dev.utils.common.ArrayUtils;
import javadoc.dev_utils.check.dev.ICheckConfig;

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
        ignoreAnnotateMap.put("DevDataAdapter", ArrayUtils.asListArgs("getItemCount","getRecyclerView","setRecyclerView","bindAdapter","bindAdapter","initialize","initialize","getDataList","getDataArrayList","getDataSize","getDataItem","getDataItemPosition","getFirstData","getLastData","getLastPosition","isDataEmpty","isDataNotEmpty","isFirstPosition","isLastPosition","isLastPosition","isLastPositionAndGreaterThanOrEqual","isLastPositionAndGreaterThanOrEqual","equalsFirstData","equalsLastData","equalsPositionData","addData","addDataAt","addDatas","addDatasAt","addDatasChecked","addDatasCheckedAt","addLists","removeData","removeDataAt","removeDatas","replaceData","replaceDataAt","swipePosition","contains","clearDataList","clearDataList","setDataList","setDataList","notifyDataChanged","notifyElementChanged"));
        ignoreAnnotateMap.put("DevDataAdapterExt2", ArrayUtils.asListArgs("isEditState","setEditState","toggleEditState","clearSelectAll","isSelectAll","isSelect","isNotSelect","getSelectSize","getDataCount","selectAll","inverseSelect"));
        ignoreAnnotateMap.put("DevDataList", ArrayUtils.asListArgs("getItemCount","getDataList","getDataArrayList","getDataSize","getDataItem","getDataItemPosition","getFirstData","getLastData","getLastPosition","isDataEmpty","isDataNotEmpty","isFirstPosition","isLastPosition","isLastPosition","isLastPositionAndGreaterThanOrEqual","isLastPositionAndGreaterThanOrEqual","equalsFirstData","equalsLastData","equalsPositionData","addData","addDataAt","addDatas","addDatasAt","addDatasChecked","addDatasCheckedAt","addLists","removeData","removeDataAt","removeDatas","replaceData","replaceDataAt","swipePosition","contains","clearDataList","clearDataList","setDataList","setDataList"));
        ignoreAnnotateMap.put("DevDataListExt", ArrayUtils.asListArgs("isEditState","setEditState","toggleEditState","clearSelectAll","isSelectAll","isSelect","isNotSelect","getSelectSize","getDataCount","selectAll","inverseSelect"));
        ignoreAnnotateMap.put("DevFunction.Method", ArrayUtils.asListArgs("method"));
        ignoreAnnotateMap.put("DevFunction.Method2", ArrayUtils.asListArgs("error"));
        ignoreAnnotateMap.put("DevSource", ArrayUtils.asListArgs("create","create","create","create","createWithPath","isUrl","isUri","isBytes","isResource","isFile","isInputStream","isDrawable","isBitmap"));
        ignoreAnnotateMap.put("DrawableListener", ArrayUtils.asListArgs("getTranscodeType"));
        ignoreAnnotateMap.put("EditTextSearchAssist", ArrayUtils.asListArgs("initTextWatcher"));
        ignoreAnnotateMap.put("EditTextWatcherAssist.FocusListener", ArrayUtils.asListArgs("onFocusChange"));
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
        ignoreStaticMap.put("CommonState", ArrayUtils.asListArgs("getType","setType","equalsType","getUUID","randomUUID","equalsUUID","getState","setState","equalsState","isNormal","isIng","isSuccess","isFail","isError","isStart","isRestart","isEnd","isPause","isResume","isStop","isCancel","isCreate","isDestroy","isRecycle","isInit","isEnabled","isEnabling","isDisabled","isDisabling","isConnected","isConnecting","isDisconnected","isSuspended","isUnknown","isInsert","isDelete","isUpdate","isSelect","isEncrypt","isDecrypt","isReset","isClose","isOpen","isExit","setNormal","setIng","setSuccess","setFail","setError","setStart","setRestart","setEnd","setPause","setResume","setStop","setCancel","setCreate","setDestroy","setRecycle","setInit","setEnabled","setEnabling","setDisabled","setDisabling","setConnected","setConnecting","setDisconnected","setSuspended","setUnknown","setInsert","setDelete","setUpdate","setSelect","setEncrypt","setDecrypt","setReset","setClose","setOpen","setExit"));
        ignoreStaticMap.put("DataAssist", ArrayUtils.asListArgs("setDataChanged","getDataSource","getDataList","getDataArrayList","getDataSize","getDataItem","getDataItemPosition","getFirstData","getLastData","getLastPosition","isDataEmpty","isDataNotEmpty","isFirstPosition","isLastPosition","isLastPosition","isLastPositionAndGreaterThanOrEqual","isLastPositionAndGreaterThanOrEqual","equalsFirstData","equalsLastData","equalsPositionData","addData","addDataAt","addDatas","addDatasAt","addDatasChecked","addDatasCheckedAt","addLists","removeData","removeDataAt","removeDatas","replaceData","replaceDataAt","swipePosition","contains","clearDataList","clearDataList","setDataList","setDataList","notifyDataChanged","notifyElementChanged"));
        ignoreStaticMap.put("DevCallback", ArrayUtils.asListArgs("callback","callback","callback","filter","isFilter","compare"));
        ignoreStaticMap.put("DevClickCallback", ArrayUtils.asListArgs("onClick","onClick","onClick","onLongClick","onLongClick","onLongClick"));
        ignoreStaticMap.put("DevDataSource", ArrayUtils.asListArgs("getDataList","getDataArrayList","getDataSize","getDataItem","getDataItemPosition","getFirstData","getLastData","getLastPosition","isDataEmpty","isDataNotEmpty","isFirstPosition","isLastPosition","isLastPosition","isLastPositionAndGreaterThanOrEqual","isLastPositionAndGreaterThanOrEqual","equalsFirstData","equalsLastData","equalsPositionData","addData","addDataAt","addDatas","addDatasAt","addDatasChecked","addDatasCheckedAt","addLists","removeData","removeDataAt","removeDatas","replaceData","replaceDataAt","swipePosition","contains","clearDataList","clearDataList","setDataList","setDataList"));
        ignoreStaticMap.put("DevDialogCallback", ArrayUtils.asListArgs("onDialogNotify","onDialogShow","onDialogDismiss","onDialogStart","onDialogResume","onDialogPause","onDialogStop","onDialogDestroy"));
        ignoreStaticMap.put("DevEngineAssist", ArrayUtils.asListArgs("getEngine","getEngine","setEngine","setEngine","removeEngine","removeEngine","getEngineMaps","contains","contains","isEmpty","isEmpty"));
        ignoreStaticMap.put("DevEntry", ArrayUtils.asListArgs("getKey","setKey","getValue","setValue","equalsKey","equalsValue"));
        ignoreStaticMap.put("DevFunction.Operation", ArrayUtils.asListArgs("getObject","setObject","operation","operation","tryCatch","thread","thread","threadPool","threadPool","threadPool","threadPool","threadCatch","threadCatch","threadPoolCatch","threadPoolCatch","threadPoolCatch","threadPoolCatch"));
        ignoreStaticMap.put("DevHistory", ArrayUtils.asListArgs("getCurrent","setCurrent","getListener","setListener","cleanCurrent","reset","reset","clearBack","sizeBack","isEmptyBack","canGoBack","canGoBack","addBack","getBack","getBack","goBack","goBack","toStringBack","toStringBack","clearForward","sizeForward","isEmptyForward","canGoForward","canGoForward","addForward","getForward","getForward","goForward","goForward","toStringForward","toStringForward","calculateRealIndex","setCurrent","clear","size","isEmpty","canGo","add","get","gotoBack","gotoForward","toString"));
        ignoreStaticMap.put("DevIntent", ArrayUtils.asListArgs("getDataMaps","containsKey","containsValue","put","putAll","remove","removeAll","get","clear","clearNull","clearNullKey","clearNullValue","clearEmpty","clearEmptyKey","clearEmptyValue"));
        ignoreStaticMap.put("DevItemClickCallback", ArrayUtils.asListArgs("onItemClick","onItemClick","onItemClick","onItemLongClick","onItemLongClick","onItemLongClick"));
        ignoreStaticMap.put("DevMultiSelectList", ArrayUtils.asListArgs("clearSelects","getSelectSize","getSelects","putSelects","putSelects","isSelect","isSelectValue","unselectValue","unselectValueAll","isSelect","select","select","select","unselect","unselect","toggle","getSelectValues","getSelectValuesToReverse","getSelectValue","getSelectValueToPosition"));
        ignoreStaticMap.put("DevMultiSelectMap", ArrayUtils.asListArgs("clearSelects","getSelectSize","getSelects","putSelects","putSelects","isSelect","isSelectValue","unselectValue","unselectValueAll","isSelect","isSelectKey","select","select","unselect","toggle","getSelectValue","getSelectValues","getSelectValuesToReverse","getSelectKey","getSelectKeys","getSelectKeysToReverse"));
        ignoreStaticMap.put("DevNumber", ArrayUtils.asListArgs("isMinNumber","isMinNumber","isLessThanMinNumber","isGreaterThanMinNumber","isMaxNumber","isMaxNumber","isLessThanMaxNumber","isGreaterThanMaxNumber","getMinNumber","setMinNumber","getMaxNumber","setMaxNumber","setMinMaxNumber","getCurrentNumber","setCurrentNumber","setCurrentNumber","getResetNumber","setResetNumber","isAllowNegative","setAllowNegative","numberChange","addNumber","subtractionNumber","getNumberListener","setNumberListener","checkUpdate"));
        ignoreStaticMap.put("DevObject", ArrayUtils.asListArgs("getUUID","getObject","setObject","getTag","convertTag","setTag","getModelId","setModelId","getCode","setCode","setCode","getType","setType","getState","setState","getTokenUUID","setTokenUUID","randomTokenUUID","equalsObject","equalsTag","equalsModelId","equalsCode","equalsCode","equalsType","equalsState","equalsTokenUUID","isCorrect"));
        ignoreStaticMap.put("DevPage", ArrayUtils.asListArgs("reset","reset","getPage","setPage","equalsPage","getConfig","getConfigPage","getConfigPageSize","getPageSize","equalsPageSize","isLastPage","setLastPage","calculateLastPage","isFirstPage","canNextPage","getNextPage","nextPage","isLessThanPageSize","response","response"));
        ignoreStaticMap.put("DevSource", ArrayUtils.asListArgs("isUrl","isUri","isBytes","isResource","isFile","isInputStream","isDrawable","isBitmap","isSource"));
        ignoreStaticMap.put("DevVariable", ArrayUtils.asListArgs("getVariables","clearVariables","putVariables","getVariablesSize","isVariables","isVariableValue","removeVariableValue","removeVariableValueAll","isVariable","isVariable","putVariable","putVariable","removeVariable","toggle","getVariableValue","getVariableValueConvert","getVariableValues","getVariableValuesToReverse","getVariableKey","getVariableKeys","getVariableKeysToReverse"));
        ignoreStaticMap.put("EditTextSearchAssist", ArrayUtils.asListArgs("remove","post","setDelayMillis","setCallback","setCallback","bindEditText","initTextWatcher"));
        ignoreStaticMap.put("EditTextWatcherAssist", ArrayUtils.asListArgs("bindListener","bindListener","focusChange"));
        ignoreStaticMap.put("EditTextWatcherAssist.FocusListener", ArrayUtils.asListArgs("onFocusChange"));
        ignoreStaticMap.put("NumberControlAssist", ArrayUtils.asListArgs("getNumber","isMinNumber","isMinNumber","isLessThanMinNumber","isGreaterThanMinNumber","isMaxNumber","isMaxNumber","isLessThanMaxNumber","isGreaterThanMaxNumber","getMinNumber","setMinNumber","getMaxNumber","setMaxNumber","setMinMaxNumber","getCurrentNumber","setCurrentNumber","setCurrentNumber","getResetNumber","setResetNumber","isAllowNegative","setAllowNegative","numberChange","addNumber","subtractionNumber","getNumberListener","setNumberListener"));
        ignoreStaticMap.put("PageAssist", ArrayUtils.asListArgs("reset","getPage","setPage","equalsPage","getConfig","getConfigPage","getConfigPageSize","getPageSize","equalsPageSize","isLastPage","setLastPage","calculateLastPage","isFirstPage","canNextPage","getNextPage","nextPage","isLessThanPageSize","response","response"));
        ignoreStaticMap.put("RequestState", ArrayUtils.asListArgs("getType","setType","equalsType","getRequestUUID","randomRequestUUID","equalsRequestUUID","getState","setState","equalsState","isRequestNormal","isRequestIng","isRequestSuccess","isRequestFail","isRequestError","isRequestStart","isRequestRestart","isRequestEnd","isRequestPause","isRequestResume","isRequestStop","isRequestCancel","setRequestNormal","setRequestIng","setRequestSuccess","setRequestFail","setRequestError","setRequestStart","setRequestRestart","setRequestEnd","setRequestPause","setRequestResume","setRequestStop","setRequestCancel"));

        return ignoreStaticMap;
    }

    /**
     * 获取忽略指定方法 @param 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreParamMap() {
        Map<String, List<String>> ignoreParamMap = new HashMap<>();
        ignoreParamMap.put("CommonState", ArrayUtils.asListArgs("setType","setState"));
        ignoreParamMap.put("DataAssist", ArrayUtils.asListArgs("setDataChanged"));
        ignoreParamMap.put("DevDataAdapter", ArrayUtils.asListArgs("setRecyclerView","bindAdapter","bindAdapter","initialize","initialize","getDataItem","getDataItemPosition","isFirstPosition","isLastPosition","isLastPosition","isLastPositionAndGreaterThanOrEqual","isLastPositionAndGreaterThanOrEqual","equalsFirstData","equalsLastData","equalsPositionData","addData","addDataAt","addDatas","addDatasAt","addDatasChecked","addDatasCheckedAt","addLists","removeData","removeDataAt","removeDatas","replaceData","replaceDataAt","swipePosition","contains","clearDataList","setDataList","setDataList","notifyElementChanged"));
        ignoreParamMap.put("DevDataAdapterExt2", ArrayUtils.asListArgs("setEditState"));
        ignoreParamMap.put("DevDataList", ArrayUtils.asListArgs("setContext","setActivity","parentContext","getDataItem","getDataItemPosition","isFirstPosition","isLastPosition","isLastPosition","isLastPositionAndGreaterThanOrEqual","isLastPositionAndGreaterThanOrEqual","equalsFirstData","equalsLastData","equalsPositionData","addData","addDataAt","addDatas","addDatasAt","addDatasChecked","addDatasCheckedAt","addLists","removeData","removeDataAt","removeDatas","replaceData","replaceDataAt","swipePosition","contains","clearDataList","setDataList","setDataList","setCallback","setItemCallback","setObject","setPage","setPage","setPage","setFlags","setState","setRequestState","setTextWatcherAssist","setMultiSelectMap"));
        ignoreParamMap.put("DevDataListExt", ArrayUtils.asListArgs("setNotifyAdapter","setEditState"));
        ignoreParamMap.put("DevEntry", ArrayUtils.asListArgs("setKey","setValue"));
        ignoreParamMap.put("DevFunction.Method", ArrayUtils.asListArgs("method"));
        ignoreParamMap.put("DevFunction.Method2", ArrayUtils.asListArgs("error"));
        ignoreParamMap.put("DevHistory", ArrayUtils.asListArgs("setCurrent","setListener","reset","setCurrent","clear"));
        ignoreParamMap.put("DevNumber", ArrayUtils.asListArgs("setMinNumber","setMaxNumber","setMinMaxNumber","setCurrentNumber","setCurrentNumber","setResetNumber","setAllowNegative","numberChange","setNumberListener"));
        ignoreParamMap.put("DevObject", ArrayUtils.asListArgs("setObject","convertTag","setTag","setModelId","setCode","setCode","setType","setState","setTokenUUID"));
        ignoreParamMap.put("DevPage", ArrayUtils.asListArgs("reset","setPage","setLastPage","calculateLastPage","response","response"));
        ignoreParamMap.put("DevSource", ArrayUtils.asListArgs("create","create","create","create","createWithPath"));
        ignoreParamMap.put("DevVariable", ArrayUtils.asListArgs("putVariables","removeVariableValue","removeVariableValueAll","putVariable","putVariable","removeVariable","toggle"));
        ignoreParamMap.put("EditTextWatcherAssist.FocusListener", ArrayUtils.asListArgs("onFocusChange"));
        ignoreParamMap.put("ICacheEngine", ArrayUtils.asListArgs("getParcelable","getParcelable"));
        ignoreParamMap.put("IImageEngine", ArrayUtils.asListArgs("pause","resume","pause","resume","preload","preload","clear","clear","clearDiskCache","clearMemoryCache","clearAllCache","lowMemory","display","display","display","display","display","display","display","display","display","display","display","display","display","display","display","display","loadImage","loadImage","loadImage","loadImageThrows","loadBitmap","loadBitmap","loadBitmap","loadBitmapThrows","loadDrawable","loadDrawable","loadDrawable","loadDrawableThrows","convertImageFormat","convertImageFormat"));
        ignoreParamMap.put("PageAssist", ArrayUtils.asListArgs("setPage","setLastPage","calculateLastPage","response","response"));
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
        ignoreUnPublicMap.put("BarCodeDecodeCallback", ArrayUtils.asListArgs("onResult"));
        ignoreUnPublicMap.put("BarCodeEncodeCallback", ArrayUtils.asListArgs("onResult"));
        ignoreUnPublicMap.put("CompressFilter", ArrayUtils.asListArgs("apply"));
        ignoreUnPublicMap.put("ConvertStorage", ArrayUtils.asListArgs("convert"));
        ignoreUnPublicMap.put("DataChanged", ArrayUtils.asListArgs("notifyDataChanged","notifyElementChanged"));
        ignoreUnPublicMap.put("DataManager", ArrayUtils.asListArgs("getDataList","getDataArrayList","getDataSize","getDataItem","getDataItemPosition","getFirstData","getLastData","getLastPosition","isDataEmpty","isDataNotEmpty","isFirstPosition","isLastPosition","isLastPosition","isLastPositionAndGreaterThanOrEqual","isLastPositionAndGreaterThanOrEqual","equalsFirstData","equalsLastData","equalsPositionData","addData","addDataAt","addDatas","addDatasAt","addDatasChecked","addDatasCheckedAt","addLists","removeData","removeDataAt","removeDatas","replaceData","replaceDataAt","swipePosition","contains","clearDataList","clearDataList","setDataList","setDataList"));
        ignoreUnPublicMap.put("DevFunction.Method", ArrayUtils.asListArgs("method"));
        ignoreUnPublicMap.put("DevFunction.Method2", ArrayUtils.asListArgs("error"));
        ignoreUnPublicMap.put("DevHistory", ArrayUtils.asListArgs("calculateRealIndex","setCurrent","clear","size","isEmpty","canGo","add","get","gotoBack","gotoForward","toString"));
        ignoreUnPublicMap.put("DevHistory.Listener", ArrayUtils.asListArgs("accept","changeCurrent","clear","add","acceptCurrentToList"));
        ignoreUnPublicMap.put("DevNumber", ArrayUtils.asListArgs("checkUpdate"));
        ignoreUnPublicMap.put("EditTextSearchAssist", ArrayUtils.asListArgs("initTextWatcher"));
        ignoreUnPublicMap.put("EditTextSearchAssist.SearchCallback", ArrayUtils.asListArgs("callback"));
        ignoreUnPublicMap.put("EditTextWatcherAssist", ArrayUtils.asListArgs("focusChange"));
        ignoreUnPublicMap.put("EditTextWatcherAssist.InputListener", ArrayUtils.asListArgs("onTextChanged"));
        ignoreUnPublicMap.put("IAnalyticsEngine", ArrayUtils.asListArgs("initialize","register","unregister","track"));
        ignoreUnPublicMap.put("IBarCodeEngine", ArrayUtils.asListArgs("initialize","getConfig","encodeBarCode","encodeBarCodeSync","decodeBarCode","decodeBarCodeSync","addIconToBarCode"));
        ignoreUnPublicMap.put("ICacheEngine", ArrayUtils.asListArgs("getConfig","remove","removeForKeys","contains","isDue","clear","clearDue","clearType","getItemByKey","getKeys","getPermanentKeys","getCount","getSize","put","put","put","put","put","put","put","put","put","put","put","put","getInt","getLong","getFloat","getDouble","getBoolean","getString","getBytes","getBitmap","getDrawable","getSerializable","getParcelable","getJSONObject","getJSONArray","getEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getBytes","getBitmap","getDrawable","getSerializable","getParcelable","getJSONObject","getJSONArray","getEntity"));
        ignoreUnPublicMap.put("ICompressEngine", ArrayUtils.asListArgs("compress","compress","compress","compress"));
        ignoreUnPublicMap.put("IImageEngine", ArrayUtils.asListArgs("pause","resume","pause","resume","preload","preload","clear","clear","clearDiskCache","clearMemoryCache","clearAllCache","lowMemory","display","display","display","display","display","display","display","display","display","display","display","display","display","display","display","display","loadImage","loadImage","loadImage","loadImageThrows","loadBitmap","loadBitmap","loadBitmap","loadBitmapThrows","loadDrawable","loadDrawable","loadDrawable","loadDrawableThrows","convertImageFormat","convertImageFormat"));
        ignoreUnPublicMap.put("IJSONEngine", ArrayUtils.asListArgs("toJson","toJson","fromJson","fromJson","fromJson","fromJson","isJSON","isJSONObject","isJSONArray","toJsonIndent","toJsonIndent","toJsonIndent","toJsonIndent"));
        ignoreUnPublicMap.put("IKeyValueEngine", ArrayUtils.asListArgs("getConfig","remove","removeForKeys","contains","clear","putInt","putLong","putFloat","putDouble","putBoolean","putString","putEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getEntity","getInt","getLong","getFloat","getDouble","getBoolean","getString","getEntity"));
        ignoreUnPublicMap.put("ILogEngine", ArrayUtils.asListArgs("isPrintLog","d","e","e","e","w","i","v","wtf","json","xml","dTag","eTag","eTag","eTag","wTag","iTag","vTag","wtfTag","jsonTag","xmlTag"));
        ignoreUnPublicMap.put("IMediaEngine", ArrayUtils.asListArgs("openCamera","openCamera","openCamera","openCamera","openGallery","openGallery","openGallery","openGallery","getConfig","setConfig","getCameraSavePath","getCompressSavePath","setSavePath","getMinimumCompressSize","setMinimumCompressSize","deleteCacheDirFile","deleteAllCacheDirFile","isMediaSelectorResult","getSelectors","getSelectorPaths","getSingleSelector","getSingleSelectorPath"));
        ignoreUnPublicMap.put("IMultiSelect", ArrayUtils.asListArgs("clearSelects","getSelectSize","getSelects","putSelects","putSelects","isSelect","isSelectValue","unselectValue","unselectValueAll"));
        ignoreUnPublicMap.put("IMultiSelectEdit", ArrayUtils.asListArgs("isEditState","setEditState","toggleEditState","selectAll","clearSelectAll","inverseSelect","isSelectAll","isSelect","isNotSelect","getSelectSize","getDataCount"));
        ignoreUnPublicMap.put("IMultiSelectToList", ArrayUtils.asListArgs("isSelect","select","select","select","unselect","unselect","toggle","getSelectValues","getSelectValuesToReverse","getSelectValue","getSelectValueToPosition"));
        ignoreUnPublicMap.put("IMultiSelectToMap", ArrayUtils.asListArgs("isSelect","isSelectKey","select","select","unselect","toggle","getSelectValue","getSelectValues","getSelectValuesToReverse","getSelectKey","getSelectKeys","getSelectKeysToReverse"));
        ignoreUnPublicMap.put("INumberListener", ArrayUtils.asListArgs("onPrepareChanged","onNumberChanged"));
        ignoreUnPublicMap.put("INumberOperate", ArrayUtils.asListArgs("isMinNumber","isMinNumber","isLessThanMinNumber","isGreaterThanMinNumber","isMaxNumber","isMaxNumber","isLessThanMaxNumber","isGreaterThanMaxNumber","getMinNumber","setMinNumber","getMaxNumber","setMaxNumber","setMinMaxNumber","getCurrentNumber","setCurrentNumber","setCurrentNumber","getResetNumber","setResetNumber","isAllowNegative","setAllowNegative","numberChange","addNumber","subtractionNumber","getNumberListener","setNumberListener"));
        ignoreUnPublicMap.put("IPermissionEngine", ArrayUtils.asListArgs("isGranted","shouldShowRequestPermissionRationale","getDeniedPermissionStatus","againRequest","request","request","request"));
        ignoreUnPublicMap.put("IPermissionEngine.Callback", ArrayUtils.asListArgs("onGranted","onDenied"));
        ignoreUnPublicMap.put("IPushEngine", ArrayUtils.asListArgs("initialize","register","unregister","onReceiveServicePid","onReceiveClientId","onReceiveDeviceToken","onReceiveOnlineState","onReceiveCommandResult","onNotificationMessageArrived","onNotificationMessageClicked","onReceiveMessageData","convertMessage"));
        ignoreUnPublicMap.put("IShareEngine", ArrayUtils.asListArgs("initialize","openMinApp","shareMinApp","shareUrl","shareImage","shareImageList","shareText","shareVideo","shareMusic","shareEmoji","shareFile","share","onActivityResult"));
        ignoreUnPublicMap.put("IStorageEngine", ArrayUtils.asListArgs("insertImageToExternal","insertVideoToExternal","insertAudioToExternal","insertDownloadToExternal","insertMediaToExternal","insertImageToInternal","insertVideoToInternal","insertAudioToInternal","insertDownloadToInternal","insertMediaToInternal"));
        ignoreUnPublicMap.put("LoadListener", ArrayUtils.asListArgs("getTranscodeType","onStart","onResponse","onFailure"));
        ignoreUnPublicMap.put("OnCompressListener", ArrayUtils.asListArgs("onStart","onSuccess","onError","onComplete"));
        ignoreUnPublicMap.put("OnConvertListener", ArrayUtils.asListArgs("onStart","onSuccess","onError","onComplete"));
        ignoreUnPublicMap.put("OnInsertListener", ArrayUtils.asListArgs("onResult"));
        ignoreUnPublicMap.put("OnRenameListener", ArrayUtils.asListArgs("rename"));
        ignoreUnPublicMap.put("ShareListener", ArrayUtils.asListArgs("onStart","onResult","onError","onCancel"));

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
        ignoreReturnVoidMap.put("BarCodeDecodeCallback", ArrayUtils.asListArgs("onResult - void"));
        ignoreReturnVoidMap.put("BarCodeEncodeCallback", ArrayUtils.asListArgs("onResult - void"));
        ignoreReturnVoidMap.put("DataAssist", ArrayUtils.asListArgs("clearDataList - void","clearDataList - void","notifyDataChanged - void","notifyElementChanged - void"));
        ignoreReturnVoidMap.put("DataChanged", ArrayUtils.asListArgs("notifyDataChanged - void","notifyElementChanged - void"));
        ignoreReturnVoidMap.put("DataManager", ArrayUtils.asListArgs("clearDataList - void","clearDataList - void"));
        ignoreReturnVoidMap.put("DevAnalyticsEngine", ArrayUtils.asListArgs("removeEngine - void","removeEngine - void"));
        ignoreReturnVoidMap.put("DevBarCodeEngine", ArrayUtils.asListArgs("removeEngine - void","removeEngine - void"));
        ignoreReturnVoidMap.put("DevCacheEngine", ArrayUtils.asListArgs("removeEngine - void","removeEngine - void"));
        ignoreReturnVoidMap.put("DevCallback", ArrayUtils.asListArgs("callback - void","callback - void","callback - void"));
        ignoreReturnVoidMap.put("DevClickCallback", ArrayUtils.asListArgs("onClick - void","onClick - void","onClick - void","onLongClick - void","onLongClick - void","onLongClick - void"));
        ignoreReturnVoidMap.put("DevCompressEngine", ArrayUtils.asListArgs("removeEngine - void","removeEngine - void"));
        ignoreReturnVoidMap.put("DevDataSource", ArrayUtils.asListArgs("clearDataList - void","clearDataList - void"));
        ignoreReturnVoidMap.put("DevDialogCallback", ArrayUtils.asListArgs("onDialogNotify - void","onDialogShow - void","onDialogDismiss - void","onDialogStart - void","onDialogResume - void","onDialogPause - void","onDialogStop - void","onDialogDestroy - void"));
        ignoreReturnVoidMap.put("DevEngineAssist", ArrayUtils.asListArgs("removeEngine - void","removeEngine - void"));
        ignoreReturnVoidMap.put("DevHistory.Listener", ArrayUtils.asListArgs("changeCurrent - void","clear - void","add - void"));
        ignoreReturnVoidMap.put("DevImageEngine", ArrayUtils.asListArgs("removeEngine - void","removeEngine - void"));
        ignoreReturnVoidMap.put("DevItemClickCallback", ArrayUtils.asListArgs("onItemClick - void","onItemClick - void","onItemClick - void","onItemLongClick - void","onItemLongClick - void","onItemLongClick - void"));
        ignoreReturnVoidMap.put("DevJSONEngine", ArrayUtils.asListArgs("removeEngine - void","removeEngine - void"));
        ignoreReturnVoidMap.put("DevKeyValueEngine", ArrayUtils.asListArgs("removeEngine - void","removeEngine - void"));
        ignoreReturnVoidMap.put("DevLogEngine", ArrayUtils.asListArgs("removeEngine - void","removeEngine - void"));
        ignoreReturnVoidMap.put("DevMediaEngine", ArrayUtils.asListArgs("removeEngine - void","removeEngine - void"));
        ignoreReturnVoidMap.put("DevMultiSelectList", ArrayUtils.asListArgs("clearSelects - void","putSelects - void","putSelects - void","unselectValue - void","unselectValueAll - void","select - void","select - void","select - void","unselect - void","toggle - void"));
        ignoreReturnVoidMap.put("DevMultiSelectMap", ArrayUtils.asListArgs("clearSelects - void","putSelects - void","putSelects - void","unselectValue - void","unselectValueAll - void","select - void","select - void","unselect - void","toggle - void"));
        ignoreReturnVoidMap.put("DevNumber", ArrayUtils.asListArgs("checkUpdate - void"));
        ignoreReturnVoidMap.put("DevPermissionEngine", ArrayUtils.asListArgs("removeEngine - void","removeEngine - void"));
        ignoreReturnVoidMap.put("DevPushEngine", ArrayUtils.asListArgs("removeEngine - void","removeEngine - void"));
        ignoreReturnVoidMap.put("DevResultCallback", ArrayUtils.asListArgs("onResult - void","onError - void","onFailure - void"));
        ignoreReturnVoidMap.put("DevShareEngine", ArrayUtils.asListArgs("removeEngine - void","removeEngine - void"));
        ignoreReturnVoidMap.put("DevStorageEngine", ArrayUtils.asListArgs("removeEngine - void","removeEngine - void"));
        ignoreReturnVoidMap.put("EditTextSearchAssist", ArrayUtils.asListArgs("remove - void","post - void"));
        ignoreReturnVoidMap.put("EditTextSearchAssist.SearchCallback", ArrayUtils.asListArgs("callback - void"));
        ignoreReturnVoidMap.put("EditTextWatcherAssist", ArrayUtils.asListArgs("bindListener - void","bindListener - void","focusChange - void"));
        ignoreReturnVoidMap.put("EditTextWatcherAssist.InputListener", ArrayUtils.asListArgs("onTextChanged - void"));
        ignoreReturnVoidMap.put("EditTextWatcherAssist.OtherListener", ArrayUtils.asListArgs("onFocusChange - void","beforeTextChanged - void","onTextChanged - void","afterTextChanged - void"));
        ignoreReturnVoidMap.put("IAnalyticsEngine", ArrayUtils.asListArgs("initialize - void","register - void","unregister - void"));
        ignoreReturnVoidMap.put("IBarCodeEngine", ArrayUtils.asListArgs("initialize - void","encodeBarCode - void","decodeBarCode - void"));
        ignoreReturnVoidMap.put("ICacheEngine", ArrayUtils.asListArgs("remove - void","removeForKeys - void","clear - void","clearDue - void","clearType - void"));
        ignoreReturnVoidMap.put("IKeyValueEngine", ArrayUtils.asListArgs("remove - void","removeForKeys - void","clear - void"));
        ignoreReturnVoidMap.put("ILogEngine", ArrayUtils.asListArgs("d - void","e - void","e - void","e - void","w - void","i - void","v - void","wtf - void","json - void","xml - void","dTag - void","eTag - void","eTag - void","eTag - void","wTag - void","iTag - void","vTag - void","wtfTag - void","jsonTag - void","xmlTag - void"));
        ignoreReturnVoidMap.put("IMediaEngine", ArrayUtils.asListArgs("setConfig - void","setSavePath - void","setMinimumCompressSize - void","deleteCacheDirFile - void","deleteAllCacheDirFile - void"));
        ignoreReturnVoidMap.put("IMultiSelect", ArrayUtils.asListArgs("clearSelects - void","putSelects - void","putSelects - void","unselectValue - void","unselectValueAll - void"));
        ignoreReturnVoidMap.put("IMultiSelectToList", ArrayUtils.asListArgs("select - void","select - void","select - void","unselect - void","toggle - void"));
        ignoreReturnVoidMap.put("IMultiSelectToMap", ArrayUtils.asListArgs("select - void","select - void","unselect - void","toggle - void"));
        ignoreReturnVoidMap.put("INumberListener", ArrayUtils.asListArgs("onNumberChanged - void"));
        ignoreReturnVoidMap.put("IPermissionEngine", ArrayUtils.asListArgs("request - void","request - void","request - void"));
        ignoreReturnVoidMap.put("IPermissionEngine.Callback", ArrayUtils.asListArgs("onGranted - void","onDenied - void"));
        ignoreReturnVoidMap.put("IPushEngine", ArrayUtils.asListArgs("initialize - void","register - void","unregister - void","onReceiveServicePid - void","onReceiveClientId - void","onReceiveDeviceToken - void","onReceiveOnlineState - void","onReceiveCommandResult - void","onNotificationMessageArrived - void","onNotificationMessageClicked - void","onReceiveMessageData - void"));
        ignoreReturnVoidMap.put("IShareEngine", ArrayUtils.asListArgs("initialize - void","onActivityResult - void"));
        ignoreReturnVoidMap.put("IStorageEngine", ArrayUtils.asListArgs("insertImageToExternal - void","insertVideoToExternal - void","insertAudioToExternal - void","insertDownloadToExternal - void","insertMediaToExternal - void","insertImageToInternal - void","insertVideoToInternal - void","insertAudioToInternal - void","insertDownloadToInternal - void","insertMediaToInternal - void"));
        ignoreReturnVoidMap.put("LoadListener", ArrayUtils.asListArgs("onStart - void","onResponse - void","onFailure - void"));
        ignoreReturnVoidMap.put("OnCompressListener", ArrayUtils.asListArgs("onStart - void","onSuccess - void","onError - void","onComplete - void"));
        ignoreReturnVoidMap.put("OnConvertListener", ArrayUtils.asListArgs("onStart - void","onSuccess - void","onError - void","onComplete - void"));
        ignoreReturnVoidMap.put("OnInsertListener", ArrayUtils.asListArgs("onResult - void"));
        ignoreReturnVoidMap.put("PageAssist", ArrayUtils.asListArgs("initPageConfig - void"));
        ignoreReturnVoidMap.put("ShareListener", ArrayUtils.asListArgs("onStart - void","onResult - void","onError - void","onCancel - void"));

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