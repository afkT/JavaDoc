package javadoc.dev_utils.check.dev_assist;

import javadoc.Utils;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * detail: 代码检测分析配置
 * @author Ttt
 */
final class DevAssistConfig {

    private DevAssistConfig() {
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
        sIgnoreAnnotateMap.put("EditTextWatcherAssist.FocusListener", Utils.asList("onFocusChange"));
        sIgnoreAnnotateMap.put("IImageEngine.BitmapCallBack", Utils.asList(
                "getTranscodeType", "onResponse", "onFailure"));
        sIgnoreAnnotateMap.put("IImageEngine.DrawableCallBack", Utils.asList(
                "getTranscodeType", "onResponse", "onFailure"));
    }

    // =

    /**
     * 初始化 忽略指定方法参数 final 修饰符
     */
    private static void initIgnoreFinalMap() {
        sIgnoreFinalMap.put("DevCallBack", Utils.asList("callback", "callback", "callback"));
        sIgnoreFinalMap.put("DevClickCallBack", Utils.asList("onClick", "onLongClick",
                "onClick", "onLongClick", "onClick", "onLongClick"));
        sIgnoreFinalMap.put("DevFilterCallback", Utils.asList("filter", "filter",
                "isFilter", "isFilter", "compare", "compare"));
        sIgnoreFinalMap.put("DevItemClickCallBack", Utils.asList("onItemClick",
                "onItemLongClick", "onItemClick", "onItemLongClick", "onItemClick", "onItemLongClick"));
        sIgnoreFinalMap.put("EditTextWatcherAssist.FocusListener", Utils.asList("onFocusChange"));
    }

    // =

    /**
     * 初始化 忽略指定方法 static 修饰符
     */
    private static void initIgnoreStaticMap() {
        sIgnoreStaticMap.put("AdapterDataAssist", Utils.asList(
                "setAdapterNotify", "getDataList", "getDataArrayList", "getDataCount",
                "getDataItem", "getDataItemPosition", "getDataFirstItem", "getDataLastItem",
                "isFirstItem", "isLastItem", "isLastItem", "clearDataList", "clearDataList",
                "addData", "addData", "addAllData", "addAllData", "removeData", "removeData",
                "removeData", "setDataList", "setDataList", "adapterNotifyDataSetChanged"));
        sIgnoreStaticMap.put("DevBaseEntry", Utils.asList(
                "getEntryKey", "setEntryKey", "getEntryValue", "setEntryValue", "isCorrect"));
        sIgnoreStaticMap.put("DevBaseEvent", Utils.asList(
                "getCode", "setCode", "getCodeStr", "setCodeStr", "getValue", "setValue",
                "getObject", "setObject", "equalsCode", "equalsCode", "equalsValue", "equalsObject"));
        sIgnoreStaticMap.put("DevBaseVariable", Utils.asList(
                "getVariables", "clearVariables", "putVariables", "getVariablesSize",
                "isVariables", "isVariableValue", "removeVariableValue", "removeVariableValueAll",
                "isVariable", "isVariable", "putVariable", "putVariable", "removeVariable",
                "toggle", "getVariableValue", "getVariableValueConvert", "getVariableValues",
                "getVariableValuesToReverse", "getVariableKey", "getVariableKeys", "getVariableKeysToReverse"));
        sIgnoreStaticMap.put("DevCallBack", Utils.asList(
                "callback", "callback", "callback", "callback"));
        sIgnoreStaticMap.put("DevClickCallBack", Utils.asList(
                "onClick", "onLongClick", "onClick", "onLongClick", "onClick",
                "onLongClick", "onClick", "onLongClick"));
        sIgnoreStaticMap.put("DevDialogCallBack", Utils.asList(
                "onDialogNotify", "onDialogShow", "onDialogDismiss", "onDialogStart",
                "onDialogResume", "onDialogPause", "onDialogStop", "onDialogDestroy"));
        sIgnoreStaticMap.put("DevFilterCallback", Utils.asList(
                "filter", "filter", "isFilter", "isFilter", "compare", "compare"));
        sIgnoreStaticMap.put("DevItemClickCallBack", Utils.asList(
                "onItemClick", "onItemLongClick", "onItemClick", "onItemLongClick",
                "onItemClick", "onItemLongClick", "onItemClick", "onItemLongClick"));
        sIgnoreStaticMap.put("EditTextWatcherAssist", Utils.asList(
                "bindListener", "bindListener", "focusChange"));
        sIgnoreStaticMap.put("EditTextWatcherAssist.FocusListener", Utils.asList("onFocusChange"));
        sIgnoreStaticMap.put("IHttpEngine.Response", Utils.asList(
                "getRequest", "getSentRequestAtMillis", "getReceivedResponseAtMillis"));
        sIgnoreStaticMap.put("MultiSelectListAssist", Utils.asList(
                "clearSelects", "getSelectSize", "getSelects", "putSelects", "putSelects",
                "isSelect", "isSelectValue", "unselectValue", "unselectValueAll", "isSelect",
                "select", "select", "select", "unselect", "unselect", "toggle", "getSelectValues",
                "getSelectValuesToReverse", "getSelectValue", "getSelectValueToPosition"));
        sIgnoreStaticMap.put("MultiSelectMapAssist", Utils.asList(
                "clearSelects", "getSelectSize", "getSelects", "putSelects", "putSelects",
                "isSelect", "isSelectValue", "unselectValue", "unselectValueAll", "isSelect",
                "isSelectKey", "select", "select", "unselect", "toggle", "getSelectValue", "getSelectValues",
                "getSelectValuesToReverse", "getSelectKey", "getSelectKeys", "getSelectKeysToReverse"));
        sIgnoreStaticMap.put("NumberControlAssist", Utils.asList(
                "isMinNumber", "isMinNumber", "isLessThanMinNumber", "isGreaterThanMinNumber",
                "isMaxNumber", "isMaxNumber", "isLessThanMaxNumber", "isGreaterThanMaxNumber",
                "getObject", "setObject", "getMinNumber", "setMinNumber", "getMaxNumber", "setMaxNumber",
                "setMinMaxNumber", "getCurrentNumber", "setCurrentNumber", "setCurrentNumber",
                "getResetNumber", "setResetNumber", "isAllowNegative", "setAllowNegative",
                "numberChange", "addNumber", "subtractionNumber", "checkUpdate", "getNumberListener", "setNumberListener"));
        sIgnoreStaticMap.put("PageAssist", Utils.asList(
                "getPageNum", "getPageNum", "setPageNum", "getPageNumReady",
                "getPageNumReady", "setPageNumReady", "getPageSize", "getPageSize", "setPageSize", "getTotalRow",
                "getTotalRow", "setTotalRow", "isLastPage", "isLastPage", "setLastPage", "isFirstPage", "isFirstPage",
                "isAllowNextPage", "getNextPage", "nextPage", "getNextPageReady", "nextPageReady", "isLessThanPageSize", "reset"));
        sIgnoreStaticMap.put("RequestStatusAssist", Utils.asList(
                "getRequestType", "getRequestType", "setRequestType", "equalsRequestType",
                "getRequestHashCode", "getRequestHashCodeRandom", "equalsHashCode", "getRequestStatus",
                "getRequestStatus", "setRequestStatus", "isRequestNormal", "isRequestNever", "isRequestIng",
                "isRequestSuccess", "isRequestFail", "isRequestError", "setRequestNormal", "setRequestNever",
                "setRequestIng", "setRequestSuccess", "setRequestFail", "setRequestError"));
        sIgnoreStaticMap.put("VariableAssist", Utils.asList(
                "getBooleanVariable", "getObjectVariable"));
    }

    /**
     * 初始化 忽略指定方法 @param 处理
     */
    private static void initIgnoreParamMap() {
        sIgnoreParamMap.put("AbstractCallBack", Utils.asList(
                "setTag", "setValue", "setObject"));
        sIgnoreParamMap.put("AdapterDataAssist", Utils.asList(
                "setAdapterNotify"));
        sIgnoreParamMap.put("DevBaseEntry", Utils.asList(
                "setEntryKey", "setEntryValue"));
        sIgnoreParamMap.put("DevBaseEvent", Utils.asList(
                "setCode", "setCodeStr", "setValue", "setObject"));
        sIgnoreParamMap.put("DevBaseVariable", Utils.asList(
                "putVariables", "removeVariableValue", "removeVariableValueAll", "putVariable",
                "putVariable", "removeVariable", "toggle"));
        sIgnoreParamMap.put("DevExResultCallback", Utils.asList(
                "setExpandResult"));
        sIgnoreParamMap.put("EditTextWatcherAssist.FocusListener", Utils.asList(
                "onFocusChange"));
        sIgnoreParamMap.put("IImageEngine.BitmapCallBack", Utils.asList(
                "onResponse", "onFailure"));
        sIgnoreParamMap.put("IImageEngine.DrawableCallBack", Utils.asList(
                "onResponse", "onFailure"));
        sIgnoreParamMap.put("PageAssist", Utils.asList(
                "setPageNum", "setPageNumReady", "setPageSize", "setTotalRow", "setLastPage"));
        sIgnoreParamMap.put("RequestStatusAssist", Utils.asList(
                "setRequestType", "setRequestStatus"));
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
        sIgnoreUnPublicMap.put("DevBaseModel", Utils.asList("isCorrect"));
        sIgnoreUnPublicMap.put("EditTextWatcherAssist", Utils.asList("focusChange"));
        sIgnoreUnPublicMap.put("EditTextWatcherAssist.InputListener", Utils.asList("onTextChanged"));
        sIgnoreUnPublicMap.put("IAdapterData", Utils.asList(
                "getDataList", "getDataArrayList", "getDataCount", "getDataItem",
                "getDataItemPosition", "getDataFirstItem", "getDataLastItem", "isFirstItem",
                "isLastItem", "isLastItem", "clearDataList", "clearDataList", "addData", "addData",
                "addAllData", "addAllData", "removeData", "removeData", "removeData", "setDataList", "setDataList"));
        sIgnoreUnPublicMap.put("IAdapterNotify", Utils.asList("adapterNotifyDataSetChanged"));
        sIgnoreUnPublicMap.put("IBaseMultiSelect", Utils.asList(
                "clearSelects", "getSelectSize", "getSelects", "putSelects",
                "putSelects", "isSelect", "isSelectValue", "unselectValue", "unselectValueAll"));
        sIgnoreUnPublicMap.put("IHttpEngine", Utils.asList(
                "newCall", "cancelAll", "cancelCall", "cancelUrl", "cancelTag"));
        sIgnoreUnPublicMap.put("IHttpEngine.Call", Utils.asList(
                "getRequest", "isCanceled", "isExecuted", "isEnd", "cancel", "start", "startAync"));
        sIgnoreUnPublicMap.put("IImageEngine", Utils.asList(
                "displayImage", "displayImage", "displayImage", "displayImage",
                "loadImage", "loadImage", "clearDiskCache", "clearMemoryCache"));
        sIgnoreUnPublicMap.put("IImageEngine.ImageCallBack", Utils.asList("getTranscodeType", "onResponse", "onFailure"));
        sIgnoreUnPublicMap.put("IJSONEngine", Utils.asList(
                "toJson", "toJson", "fromJson", "fromJson", "fromJson", "fromJson",
                "isJSON", "toJsonIndent", "toJsonIndent", "toJsonIndent", "toJsonIndent"));
        sIgnoreUnPublicMap.put("ILogEngine", Utils.asList(
                "isPrintLog", "d", "e", "e", "e", "w", "i", "v", "wtf", "json", "xml", "dTag", "eTag",
                "eTag", "eTag", "wTag", "iTag", "vTag", "wtfTag", "jsonTag", "xmlTag"));
        sIgnoreUnPublicMap.put("IMultiSelectEdit", Utils.asList(
                "isEditStatus", "setEditStatus", "toggleEditStatus", "selectAll", "clearSelectAll",
                "inverseSelect", "isSelectAll", "isSelect", "isNotSelect"));
        sIgnoreUnPublicMap.put("IMultiSelectToList", Utils.asList(
                "isSelect", "select", "select", "select", "unselect", "unselect", "toggle",
                "getSelectValues", "getSelectValuesToReverse", "getSelectValue", "getSelectValueToPosition"));
        sIgnoreUnPublicMap.put("IMultiSelectToMap", Utils.asList(
                "isSelect", "isSelectKey", "select", "select", "unselect", "toggle", "getSelectValue",
                "getSelectValues", "getSelectValuesToReverse", "getSelectKey", "getSelectKeys", "getSelectKeysToReverse"));
        sIgnoreUnPublicMap.put("NumberControlAssist", Utils.asList("checkUpdate"));
        sIgnoreUnPublicMap.put("NumberControlAssist.INumberListener", Utils.asList(
                "onPrepareChanged", "onNumberChanged"));
        sIgnoreUnPublicMap.put("NumberControlAssist.INumberOperate", Utils.asList(
                "isMinNumber", "isMinNumber", "isLessThanMinNumber", "isGreaterThanMinNumber",
                "isMaxNumber", "isMaxNumber", "isLessThanMaxNumber", "isGreaterThanMaxNumber", "getObject",
                "setObject", "getMinNumber", "setMinNumber", "getMaxNumber", "setMaxNumber", "setMinMaxNumber",
                "getCurrentNumber", "setCurrentNumber", "setCurrentNumber", "getResetNumber", "setResetNumber",
                "isAllowNegative", "setAllowNegative", "numberChange", "addNumber", "subtractionNumber",
                "getNumberListener", "setNumberListener"));
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