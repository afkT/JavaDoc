package javadoc.dev_utils.check.dev_assist;

import javadoc.Utils;
import javadoc.dev_utils.check.dev.ICheckConfig;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * detail: 代码检测分析配置
 * @author Ttt
 */
final class DevAssistConfig implements ICheckConfig {

    /**
     * 获取忽略指定方法注释配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreAnnotateMap() {
        // 忽略配置
        Map<String, ArrayList<String>> ignoreAnnotateMap = new HashMap<>();
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
    public Map<String, ArrayList<String>> getIgnoreFinalMap() {
        // 忽略配置
        Map<String, ArrayList<String>> ignoreFinalMap = new HashMap<>();
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
    public Map<String, ArrayList<String>> getIgnoreStaticMap() {
        // 忽略配置
        Map<String, ArrayList<String>> ignoreStaticMap = new HashMap<>();
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
        ignoreStaticMap.put("PageAssist", Utils.asList("getPageNum", "getPageNum", "setPageNum", "getPageNumReady", "getPageNumReady", "setPageNumReady", "getPageSize", "getPageSize", "setPageSize", "getTotalRow", "getTotalRow", "setTotalRow", "isLastPage", "isLastPage", "setLastPage", "isFirstPage", "isFirstPage", "isAllowNextPage", "getNextPage", "nextPage", "getNextPageReady", "nextPageReady", "isLessThanPageSize", "reset"));
        ignoreStaticMap.put("RequestStateAssist", Utils.asList("getRequestType", "getRequestType", "setRequestType", "equalsRequestType", "getRequestHashCode", "getRequestHashCodeRandom", "equalsHashCode", "getRequestState", "getRequestState", "setRequestState", "isRequestNormal", "isRequestNever", "isRequestIng", "isRequestSuccess", "isRequestFail", "isRequestError", "setRequestNormal", "setRequestNever", "setRequestIng", "setRequestSuccess", "setRequestFail", "setRequestError"));
        ignoreStaticMap.put("VariableAssist", Utils.asList("getBooleanVariable", "getObjectVariable"));
        return ignoreStaticMap;
    }

    /**
     * 获取忽略指定方法 @param 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreParamMap() {
        // 忽略配置
        Map<String, ArrayList<String>> ignoreParamMap = new HashMap<>();
        ignoreParamMap.put("AbstractCallBack", Utils.asList("setTag", "setValue", "setObject"));
        ignoreParamMap.put("AdapterDataAssist", Utils.asList("setAdapterNotify"));
        ignoreParamMap.put("DevBaseEntry", Utils.asList("setEntryKey", "setEntryValue"));
        ignoreParamMap.put("DevBaseEvent", Utils.asList("setCode", "setCodeStr", "setValue", "setObject"));
        ignoreParamMap.put("DevBaseVariable", Utils.asList("putVariables", "removeVariableValue", "removeVariableValueAll", "putVariable", "putVariable", "removeVariable", "toggle"));
        ignoreParamMap.put("DevExResultCallback", Utils.asList("setExpandResult"));
        ignoreParamMap.put("EditTextWatcherAssist.FocusListener", Utils.asList("onFocusChange"));
        ignoreParamMap.put("IImageEngine.BitmapCallBack", Utils.asList("onResponse", "onFailure"));
        ignoreParamMap.put("IImageEngine.DrawableCallBack", Utils.asList("onResponse", "onFailure"));
        ignoreParamMap.put("PageAssist", Utils.asList("setPageNum", "setPageNumReady", "setPageSize", "setTotalRow", "setLastPage"));
        ignoreParamMap.put("RequestStateAssist", Utils.asList("setRequestType", "setRequestState"));
        return ignoreParamMap;
    }

    /**
     * 获取忽略指定方法 @return 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreReturnMap() {
        // 忽略配置
        Map<String, ArrayList<String>> ignoreReturnMap = new HashMap<>();
        return ignoreReturnMap;
    }

    /**
     * 获取忽略指定方法非 public 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreUnPublicMap() {
        // 忽略配置
        Map<String, ArrayList<String>> ignoreUnPublicMap = new HashMap<>();
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
    public Map<String, ArrayList<String>> getIgnoreModifierVariableMap() {
        // 忽略配置
        Map<String, ArrayList<String>> ignoreModifierVariableMap = new HashMap<>();
        return ignoreModifierVariableMap;
    }

    /**
     * 获取忽略指定方法 return void 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreReturnVoidMap() {
        // 忽略配置
        Map<String, ArrayList<String>> ignoreReturnVoidMap = new HashMap<>();
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