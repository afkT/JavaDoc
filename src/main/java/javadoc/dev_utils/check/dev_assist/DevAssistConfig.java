package javadoc.dev_utils.check.dev_assist;

import javadoc.Utils;
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
        ignoreAnnotateMap.put("EditTextWatcherAssist.FocusListener", Utils.asList("onFocusChange"));
        ignoreAnnotateMap.put("IImageEngine.BitmapCallBack", Utils.asList("getTranscodeType", "onResponse", "onFailure"));
        ignoreAnnotateMap.put("IImageEngine.DrawableCallBack", Utils.asList("getTranscodeType", "onResponse", "onFailure"));

        return ignoreAnnotateMap;
    }

    /**
     * 获取忽略指定方法参数 final 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreFinalMap() {
        Map<String, List<String>> ignoreFinalMap = new HashMap<>();
        ignoreFinalMap.put("DevCallBack", Utils.asList("callback", "callback", "callback"));
        ignoreFinalMap.put("DevClickCallBack", Utils.asList("onClick", "onLongClick", "onClick", "onLongClick", "onClick", "onLongClick"));
        ignoreFinalMap.put("DevFilterCallback", Utils.asList("filter", "filter", "isFilter", "isFilter", "compare", "compare"));
        ignoreFinalMap.put("DevItemClickCallBack", Utils.asList("onItemClick", "onItemLongClick", "onItemClick", "onItemLongClick", "onItemClick", "onItemLongClick"));
        ignoreFinalMap.put("EditTextWatcherAssist.FocusListener", Utils.asList("onFocusChange"));

        return ignoreFinalMap;
    }

    /**
     * 获取忽略指定方法 static 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreStaticMap() {
        Map<String, List<String>> ignoreStaticMap = new HashMap<>();
        ignoreStaticMap.put("AdapterDataAssist", Utils.asList("setAdapterNotify", "getDataList", "getDataArrayList", "getDataCount", "getDataItem", "getDataItemPosition", "getDataFirstItem", "getDataLastItem", "isFirstItem", "isLastItem", "isLastItem", "clearDataList", "clearDataList", "addData", "addData", "addAllData", "addAllData", "removeData", "removeData", "removeData", "setDataList", "setDataList", "adapterNotifyDataSetChanged"));
        ignoreStaticMap.put("DevBaseEntry", Utils.asList("getEntryKey", "setEntryKey", "getEntryValue", "setEntryValue", "isCorrect"));
        ignoreStaticMap.put("DevBaseEvent", Utils.asList("getCode", "setCode", "getCodeStr", "setCodeStr", "getValue", "setValue", "getObject", "setObject", "equalsCode", "equalsCode", "equalsValue", "equalsObject"));
        ignoreStaticMap.put("DevBaseVariable", Utils.asList("getVariables", "clearVariables", "putVariables", "getVariablesSize", "isVariables", "isVariableValue", "removeVariableValue", "removeVariableValueAll", "isVariable", "isVariable", "putVariable", "putVariable", "removeVariable", "toggle", "getVariableValue", "getVariableValueConvert", "getVariableValues", "getVariableValuesToReverse", "getVariableKey", "getVariableKeys", "getVariableKeysToReverse"));
        ignoreStaticMap.put("DevCallBack", Utils.asList("callback", "callback", "callback", "callback"));
        ignoreStaticMap.put("DevClickCallBack", Utils.asList("onClick", "onLongClick", "onClick", "onLongClick", "onClick", "onLongClick", "onClick", "onLongClick"));
        ignoreStaticMap.put("DevDialogCallBack", Utils.asList("onDialogNotify", "onDialogShow", "onDialogDismiss", "onDialogStart", "onDialogResume", "onDialogPause", "onDialogStop", "onDialogDestroy"));
        ignoreStaticMap.put("DevFilterCallback", Utils.asList("filter", "filter", "isFilter", "isFilter", "compare", "compare"));
        ignoreStaticMap.put("DevItemClickCallBack", Utils.asList("onItemClick", "onItemLongClick", "onItemClick", "onItemLongClick", "onItemClick", "onItemLongClick", "onItemClick", "onItemLongClick"));
        ignoreStaticMap.put("EditTextWatcherAssist", Utils.asList("bindListener", "bindListener", "focusChange"));
        ignoreStaticMap.put("EditTextWatcherAssist.FocusListener", Utils.asList("onFocusChange"));
        ignoreStaticMap.put("IHttpEngine.Response", Utils.asList("getRequest", "getSentRequestAtMillis", "getReceivedResponseAtMillis"));
        ignoreStaticMap.put("MultiSelectListAssist", Utils.asList("clearSelects", "getSelectSize", "getSelects", "putSelects", "putSelects", "isSelect", "isSelectValue", "unselectValue", "unselectValueAll", "isSelect", "select", "select", "select", "unselect", "unselect", "toggle", "getSelectValues", "getSelectValuesToReverse", "getSelectValue", "getSelectValueToPosition"));
        ignoreStaticMap.put("MultiSelectMapAssist", Utils.asList("clearSelects", "getSelectSize", "getSelects", "putSelects", "putSelects", "isSelect", "isSelectValue", "unselectValue", "unselectValueAll", "isSelect", "isSelectKey", "select", "select", "unselect", "toggle", "getSelectValue", "getSelectValues", "getSelectValuesToReverse", "getSelectKey", "getSelectKeys", "getSelectKeysToReverse"));
        ignoreStaticMap.put("NumberControlAssist", Utils.asList("isMinNumber", "isMinNumber", "isLessThanMinNumber", "isGreaterThanMinNumber", "isMaxNumber", "isMaxNumber", "isLessThanMaxNumber", "isGreaterThanMaxNumber", "getObject", "setObject", "getMinNumber", "setMinNumber", "getMaxNumber", "setMaxNumber", "setMinMaxNumber", "getCurrentNumber", "setCurrentNumber", "setCurrentNumber", "getResetNumber", "setResetNumber", "isAllowNegative", "setAllowNegative", "numberChange", "addNumber", "subtractionNumber", "checkUpdate", "getNumberListener", "setNumberListener"));
        ignoreStaticMap.put("PageAssist", Utils.asList("getPageNum", "getPageNum", "setPageNum", "getPageSize", "getPageSize", "setPageSize", "getTotalRow", "getTotalRow", "setTotalRow", "isLastPage", "isLastPage", "setLastPage", "isFirstPage", "isFirstPage", "isAllowNextPage", "getNextPage", "nextPage", "isLessThanPageSize", "reset"));
        ignoreStaticMap.put("RequestStateAssist", Utils.asList("getRequestType", "getRequestType", "setRequestType", "equalsRequestType", "getRequestHashCode", "getRequestHashCodeRandom", "equalsHashCode", "getRequestState", "getRequestState", "setRequestState", "isRequestNormal", "isRequestNever", "isRequestIng", "isRequestSuccess", "isRequestFail", "isRequestError", "setRequestNormal", "setRequestNever", "setRequestIng", "setRequestSuccess", "setRequestFail", "setRequestError"));
        ignoreStaticMap.put("VariableAssist", Utils.asList("getBooleanVariable", "getObjectVariable"));

        return ignoreStaticMap;
    }

    /**
     * 获取忽略指定方法 @param 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreParamMap() {
        Map<String, List<String>> ignoreParamMap = new HashMap<>();
        ignoreParamMap.put("AbstractCallBack", Utils.asList("setTag", "setValue", "setObject"));
        ignoreParamMap.put("AdapterDataAssist", Utils.asList("setAdapterNotify"));
        ignoreParamMap.put("DevBaseEntry", Utils.asList("setEntryKey", "setEntryValue"));
        ignoreParamMap.put("DevBaseEvent", Utils.asList("setCode", "setCodeStr", "setValue", "setObject"));
        ignoreParamMap.put("DevBaseVariable", Utils.asList("putVariables", "removeVariableValue", "removeVariableValueAll", "putVariable", "putVariable", "removeVariable", "toggle"));
        ignoreParamMap.put("DevExResultCallback", Utils.asList("setExpandResult"));
        ignoreParamMap.put("EditTextWatcherAssist.FocusListener", Utils.asList("onFocusChange"));
        ignoreParamMap.put("IImageEngine.BitmapCallBack", Utils.asList("onResponse", "onFailure"));
        ignoreParamMap.put("IImageEngine.DrawableCallBack", Utils.asList("onResponse", "onFailure"));
        ignoreParamMap.put("PageAssist", Utils.asList("setPageNum", "setPageSize", "setTotalRow", "setLastPage"));
        ignoreParamMap.put("RequestStateAssist", Utils.asList("setRequestType", "setRequestState"));

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
        ignoreUnPublicMap.put("DevBaseModel", Utils.asList("isCorrect"));
        ignoreUnPublicMap.put("EditTextWatcherAssist", Utils.asList("focusChange"));
        ignoreUnPublicMap.put("EditTextWatcherAssist.InputListener", Utils.asList("onTextChanged"));
        ignoreUnPublicMap.put("IAdapterData", Utils.asList("getDataList", "getDataArrayList", "getDataCount", "getDataItem", "getDataItemPosition", "getDataFirstItem", "getDataLastItem", "isFirstItem", "isLastItem", "isLastItem", "clearDataList", "clearDataList", "addData", "addData", "addAllData", "addAllData", "removeData", "removeData", "removeData", "setDataList", "setDataList"));
        ignoreUnPublicMap.put("IAdapterNotify", Utils.asList("adapterNotifyDataSetChanged"));
        ignoreUnPublicMap.put("IBaseMultiSelect", Utils.asList("clearSelects", "getSelectSize", "getSelects", "putSelects", "putSelects", "isSelect", "isSelectValue", "unselectValue", "unselectValueAll"));
        ignoreUnPublicMap.put("IHttpEngine", Utils.asList("newCall", "cancelAll", "cancelCall", "cancelUrl", "cancelTag"));
        ignoreUnPublicMap.put("IHttpEngine.Call", Utils.asList("getRequest", "isCanceled", "isExecuted", "isEnd", "cancel", "start", "startAync"));
        ignoreUnPublicMap.put("IImageEngine", Utils.asList("displayImage", "displayImage", "displayImage", "displayImage", "loadImage", "loadImage", "clearDiskCache", "clearMemoryCache"));
        ignoreUnPublicMap.put("IImageEngine.ImageCallBack", Utils.asList("getTranscodeType", "onResponse", "onFailure"));
        ignoreUnPublicMap.put("IJSONEngine", Utils.asList("toJson", "toJson", "fromJson", "fromJson", "fromJson", "fromJson", "isJSON", "isJSONObject", "isJSONArray", "toJsonIndent", "toJsonIndent", "toJsonIndent", "toJsonIndent"));
        ignoreUnPublicMap.put("ILogEngine", Utils.asList("isPrintLog", "d", "e", "e", "e", "w", "i", "v", "wtf", "json", "xml", "dTag", "eTag", "eTag", "eTag", "wTag", "iTag", "vTag", "wtfTag", "jsonTag", "xmlTag"));
        ignoreUnPublicMap.put("IMultiSelectEdit", Utils.asList("isEditState", "setEditState", "toggleEditState", "selectAll", "clearSelectAll", "inverseSelect", "isSelectAll", "isSelect", "isNotSelect", "getSelectSize", "getDataCount"));
        ignoreUnPublicMap.put("IMultiSelectToList", Utils.asList("isSelect", "select", "select", "select", "unselect", "unselect", "toggle", "getSelectValues", "getSelectValuesToReverse", "getSelectValue", "getSelectValueToPosition"));
        ignoreUnPublicMap.put("IMultiSelectToMap", Utils.asList("isSelect", "isSelectKey", "select", "select", "unselect", "toggle", "getSelectValue", "getSelectValues", "getSelectValuesToReverse", "getSelectKey", "getSelectKeys", "getSelectKeysToReverse"));
        ignoreUnPublicMap.put("NumberControlAssist", Utils.asList("checkUpdate"));
        ignoreUnPublicMap.put("NumberControlAssist.INumberListener", Utils.asList("onPrepareChanged", "onNumberChanged"));
        ignoreUnPublicMap.put("NumberControlAssist.INumberOperate", Utils.asList("isMinNumber", "isMinNumber", "isLessThanMinNumber", "isGreaterThanMinNumber", "isMaxNumber", "isMaxNumber", "isLessThanMaxNumber", "isGreaterThanMaxNumber", "getObject", "setObject", "getMinNumber", "setMinNumber", "getMaxNumber", "setMaxNumber", "setMinMaxNumber", "getCurrentNumber", "setCurrentNumber", "setCurrentNumber", "getResetNumber", "setResetNumber", "isAllowNegative", "setAllowNegative", "numberChange", "addNumber", "subtractionNumber", "getNumberListener", "setNumberListener"));

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
        ignoreReturnVoidMap.put("AbstractCommonCallBack", Utils.asList("onResult - void", "onError - void", "onFailure - void"));
        ignoreReturnVoidMap.put("AdapterDataAssist", Utils.asList("clearDataList - void", "clearDataList - void", "addData - void", "addData - void", "addAllData - void", "addAllData - void", "removeData - void", "setDataList - void", "setDataList - void", "adapterNotifyDataSetChanged - void"));
        ignoreReturnVoidMap.put("DevCallBack", Utils.asList("callback - void", "callback - void", "callback - void", "callback - void"));
        ignoreReturnVoidMap.put("DevClickCallBack", Utils.asList("onClick - void", "onLongClick - void", "onClick - void", "onLongClick - void", "onClick - void", "onLongClick - void", "onClick - void", "onLongClick - void"));
        ignoreReturnVoidMap.put("DevDialogCallBack", Utils.asList("onDialogNotify - void", "onDialogShow - void", "onDialogDismiss - void", "onDialogStart - void", "onDialogResume - void", "onDialogPause - void", "onDialogStop - void", "onDialogDestroy - void"));
        ignoreReturnVoidMap.put("DevExResultCallback", Utils.asList("onResult - void", "onResult - void", "onError - void", "onFailure - void"));
        ignoreReturnVoidMap.put("DevHttpEngine", Utils.asList("initEngine - void", "cancelAll - void", "cancelCall - void", "cancelUrl - void", "cancelTag - void"));
        ignoreReturnVoidMap.put("DevImageEngine", Utils.asList("initEngine - void", "displayImage - void", "displayImage - void", "displayImage - void", "displayImage - void", "loadImage - void", "loadImage - void", "clearDiskCache - void", "clearMemoryCache - void"));
        ignoreReturnVoidMap.put("DevItemClickCallBack", Utils.asList("onItemClick - void", "onItemLongClick - void", "onItemClick - void", "onItemLongClick - void", "onItemClick - void", "onItemLongClick - void", "onItemClick - void", "onItemLongClick - void"));
        ignoreReturnVoidMap.put("DevJSONEngine", Utils.asList("initEngine - void"));
        ignoreReturnVoidMap.put("DevLogEngine", Utils.asList("initEngine - void", "d - void", "e - void", "e - void", "e - void", "w - void", "i - void", "v - void", "wtf - void", "json - void", "xml - void", "dTag - void", "eTag - void", "eTag - void", "eTag - void", "wTag - void", "iTag - void", "vTag - void", "wtfTag - void", "jsonTag - void", "xmlTag - void"));
        ignoreReturnVoidMap.put("DevResultCallback", Utils.asList("onResult - void"));
        ignoreReturnVoidMap.put("EditTextWatcherAssist", Utils.asList("bindListener - void", "bindListener - void", "focusChange - void"));
        ignoreReturnVoidMap.put("EditTextWatcherAssist.InputListener", Utils.asList("onTextChanged - void"));
        ignoreReturnVoidMap.put("IAdapterData", Utils.asList("clearDataList - void", "clearDataList - void", "addData - void", "addData - void", "addAllData - void", "addAllData - void", "removeData - void", "setDataList - void", "setDataList - void"));
        ignoreReturnVoidMap.put("IAdapterNotify", Utils.asList("adapterNotifyDataSetChanged - void"));
        ignoreReturnVoidMap.put("IBaseMultiSelect", Utils.asList("clearSelects - void", "putSelects - void", "putSelects - void", "unselectValue - void", "unselectValueAll - void"));
        ignoreReturnVoidMap.put("IHttpEngine", Utils.asList("cancelAll - void", "cancelCall - void", "cancelUrl - void", "cancelTag - void"));
        ignoreReturnVoidMap.put("IHttpEngine.Call", Utils.asList("cancel - void"));
        ignoreReturnVoidMap.put("IHttpEngine.RequestCallBack", Utils.asList("onStart - void", "onCancel - void", "onResponse - void", "onFailure - void"));
        ignoreReturnVoidMap.put("IImageEngine", Utils.asList("displayImage - void", "displayImage - void", "displayImage - void", "displayImage - void", "loadImage - void", "loadImage - void", "clearDiskCache - void", "clearMemoryCache - void"));
        ignoreReturnVoidMap.put("IImageEngine.ImageCallBack", Utils.asList("onResponse - void", "onFailure - void"));
        ignoreReturnVoidMap.put("ILogEngine", Utils.asList("d - void", "e - void", "e - void", "e - void", "w - void", "i - void", "v - void", "wtf - void", "json - void", "xml - void", "dTag - void", "eTag - void", "eTag - void", "eTag - void", "wTag - void", "iTag - void", "vTag - void", "wtfTag - void", "jsonTag - void", "xmlTag - void"));
        ignoreReturnVoidMap.put("IMultiSelectToList", Utils.asList("select - void", "select - void", "select - void", "unselect - void", "toggle - void"));
        ignoreReturnVoidMap.put("IMultiSelectToMap", Utils.asList("select - void", "select - void", "unselect - void", "toggle - void"));
        ignoreReturnVoidMap.put("MultiSelectListAssist", Utils.asList("clearSelects - void", "putSelects - void", "putSelects - void", "unselectValue - void", "unselectValueAll - void", "select - void", "select - void", "select - void", "unselect - void", "toggle - void"));
        ignoreReturnVoidMap.put("MultiSelectMapAssist", Utils.asList("clearSelects - void", "putSelects - void", "putSelects - void", "unselectValue - void", "unselectValueAll - void", "select - void", "select - void", "unselect - void", "toggle - void"));
        ignoreReturnVoidMap.put("NumberControlAssist", Utils.asList("checkUpdate - void"));
        ignoreReturnVoidMap.put("NumberControlAssist.INumberListener", Utils.asList("onNumberChanged - void"));
        ignoreReturnVoidMap.put("PageAssist", Utils.asList("initPageConfig - void"));

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