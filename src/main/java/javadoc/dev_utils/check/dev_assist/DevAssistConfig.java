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
        ignoreAnnotateMap.put("EditTextWatcherAssist.FocusListener", Utils.asListArgs("onFocusChange"));
        ignoreAnnotateMap.put("IImageEngine.BitmapCallBack", Utils.asListArgs("getTranscodeType","onResponse","onFailure"));
        ignoreAnnotateMap.put("IImageEngine.DrawableCallBack", Utils.asListArgs("getTranscodeType","onResponse","onFailure"));

        return ignoreAnnotateMap;
    }

    /**
     * 获取忽略指定方法参数 final 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreFinalMap() {
        Map<String, List<String>> ignoreFinalMap = new HashMap<>();
        ignoreFinalMap.put("DevCallBack", Utils.asListArgs("callback","callback","callback"));
        ignoreFinalMap.put("DevClickCallBack", Utils.asListArgs("onClick","onLongClick","onClick","onLongClick","onClick","onLongClick"));
        ignoreFinalMap.put("DevFilterCallback", Utils.asListArgs("filter","filter","isFilter","isFilter","compare","compare"));
        ignoreFinalMap.put("DevItemClickCallBack", Utils.asListArgs("onItemClick","onItemLongClick","onItemClick","onItemLongClick","onItemClick","onItemLongClick"));
        ignoreFinalMap.put("EditTextWatcherAssist.FocusListener", Utils.asListArgs("onFocusChange"));

        return ignoreFinalMap;
    }

    /**
     * 获取忽略指定方法 static 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreStaticMap() {
        Map<String, List<String>> ignoreStaticMap = new HashMap<>();
        ignoreStaticMap.put("AdapterDataAssist", Utils.asListArgs("setAdapterNotify","getDataList","getDataArrayList","getDataCount","getDataItem","getDataItemPosition","getDataFirstItem","getDataLastItem","isFirstItem","isLastItem","isLastItem","clearDataList","clearDataList","addData","addData","addAllData","addAllData","removeData","removeData","removeData","setDataList","setDataList","adapterNotifyDataSetChanged"));
        ignoreStaticMap.put("DevBaseEntry", Utils.asListArgs("getEntryKey","setEntryKey","getEntryValue","setEntryValue","isCorrect"));
        ignoreStaticMap.put("DevBaseEvent", Utils.asListArgs("getCode","setCode","getCodeStr","setCodeStr","getValue","setValue","getObject","setObject","equalsCode","equalsCode","equalsValue","equalsObject"));
        ignoreStaticMap.put("DevBaseVariable", Utils.asListArgs("getVariables","clearVariables","putVariables","getVariablesSize","isVariables","isVariableValue","removeVariableValue","removeVariableValueAll","isVariable","isVariable","putVariable","putVariable","removeVariable","toggle","getVariableValue","getVariableValueConvert","getVariableValues","getVariableValuesToReverse","getVariableKey","getVariableKeys","getVariableKeysToReverse"));
        ignoreStaticMap.put("DevCallBack", Utils.asListArgs("callback","callback","callback","callback"));
        ignoreStaticMap.put("DevClickCallBack", Utils.asListArgs("onClick","onLongClick","onClick","onLongClick","onClick","onLongClick","onClick","onLongClick"));
        ignoreStaticMap.put("DevDialogCallBack", Utils.asListArgs("onDialogNotify","onDialogShow","onDialogDismiss","onDialogStart","onDialogResume","onDialogPause","onDialogStop","onDialogDestroy"));
        ignoreStaticMap.put("DevFilterCallback", Utils.asListArgs("filter","filter","isFilter","isFilter","compare","compare"));
        ignoreStaticMap.put("DevItemClickCallBack", Utils.asListArgs("onItemClick","onItemLongClick","onItemClick","onItemLongClick","onItemClick","onItemLongClick","onItemClick","onItemLongClick"));
        ignoreStaticMap.put("EditTextWatcherAssist", Utils.asListArgs("bindListener","bindListener","focusChange"));
        ignoreStaticMap.put("EditTextWatcherAssist.FocusListener", Utils.asListArgs("onFocusChange"));
        ignoreStaticMap.put("IHttpEngine.Response", Utils.asListArgs("getRequest","getSentRequestAtMillis","getReceivedResponseAtMillis"));
        ignoreStaticMap.put("MultiSelectListAssist", Utils.asListArgs("clearSelects","getSelectSize","getSelects","putSelects","putSelects","isSelect","isSelectValue","unselectValue","unselectValueAll","isSelect","select","select","select","unselect","unselect","toggle","getSelectValues","getSelectValuesToReverse","getSelectValue","getSelectValueToPosition"));
        ignoreStaticMap.put("MultiSelectMapAssist", Utils.asListArgs("clearSelects","getSelectSize","getSelects","putSelects","putSelects","isSelect","isSelectValue","unselectValue","unselectValueAll","isSelect","isSelectKey","select","select","unselect","toggle","getSelectValue","getSelectValues","getSelectValuesToReverse","getSelectKey","getSelectKeys","getSelectKeysToReverse"));
        ignoreStaticMap.put("NumberControlAssist", Utils.asListArgs("isMinNumber","isMinNumber","isLessThanMinNumber","isGreaterThanMinNumber","isMaxNumber","isMaxNumber","isLessThanMaxNumber","isGreaterThanMaxNumber","getObject","setObject","getMinNumber","setMinNumber","getMaxNumber","setMaxNumber","setMinMaxNumber","getCurrentNumber","setCurrentNumber","setCurrentNumber","getResetNumber","setResetNumber","isAllowNegative","setAllowNegative","numberChange","addNumber","subtractionNumber","checkUpdate","getNumberListener","setNumberListener"));
        ignoreStaticMap.put("PageAssist", Utils.asListArgs("getPageNum","getPageNum","setPageNum","getPageSize","getPageSize","setPageSize","getTotalRow","getTotalRow","setTotalRow","isLastPage","isLastPage","setLastPage","isFirstPage","isFirstPage","isAllowNextPage","getNextPage","nextPage","isLessThanPageSize","reset"));
        ignoreStaticMap.put("RequestStateAssist", Utils.asListArgs("getRequestType","getRequestType","setRequestType","equalsRequestType","getRequestHashCode","getRequestHashCodeRandom","equalsHashCode","getRequestState","getRequestState","setRequestState","isRequestNormal","isRequestNever","isRequestIng","isRequestSuccess","isRequestFail","isRequestError","setRequestNormal","setRequestNever","setRequestIng","setRequestSuccess","setRequestFail","setRequestError"));
        ignoreStaticMap.put("VariableAssist", Utils.asListArgs("getBooleanVariable","getObjectVariable"));

        return ignoreStaticMap;
    }

    /**
     * 获取忽略指定方法 @param 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreParamMap() {
        Map<String, List<String>> ignoreParamMap = new HashMap<>();
        ignoreParamMap.put("AbstractCallBack", Utils.asListArgs("setTag","setValue","setObject"));
        ignoreParamMap.put("AdapterDataAssist", Utils.asListArgs("setAdapterNotify"));
        ignoreParamMap.put("DevBaseEntry", Utils.asListArgs("setEntryKey","setEntryValue"));
        ignoreParamMap.put("DevBaseEvent", Utils.asListArgs("setCode","setCodeStr","setValue","setObject"));
        ignoreParamMap.put("DevBaseVariable", Utils.asListArgs("putVariables","removeVariableValue","removeVariableValueAll","putVariable","putVariable","removeVariable","toggle"));
        ignoreParamMap.put("DevExResultCallback", Utils.asListArgs("setExpandResult"));
        ignoreParamMap.put("EditTextWatcherAssist.FocusListener", Utils.asListArgs("onFocusChange"));
        ignoreParamMap.put("IImageEngine.BitmapCallBack", Utils.asListArgs("onResponse","onFailure"));
        ignoreParamMap.put("IImageEngine.DrawableCallBack", Utils.asListArgs("onResponse","onFailure"));
        ignoreParamMap.put("PageAssist", Utils.asListArgs("setPageNum","setPageSize","setTotalRow","setLastPage"));
        ignoreParamMap.put("RequestStateAssist", Utils.asListArgs("setRequestType","setRequestState"));

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
        ignoreUnPublicMap.put("DevBaseModel", Utils.asListArgs("isCorrect"));
        ignoreUnPublicMap.put("EditTextWatcherAssist", Utils.asListArgs("focusChange"));
        ignoreUnPublicMap.put("EditTextWatcherAssist.InputListener", Utils.asListArgs("onTextChanged"));
        ignoreUnPublicMap.put("IAdapterData", Utils.asListArgs("getDataList","getDataArrayList","getDataCount","getDataItem","getDataItemPosition","getDataFirstItem","getDataLastItem","isFirstItem","isLastItem","isLastItem","clearDataList","clearDataList","addData","addData","addAllData","addAllData","removeData","removeData","removeData","setDataList","setDataList"));
        ignoreUnPublicMap.put("IAdapterNotify", Utils.asListArgs("adapterNotifyDataSetChanged"));
        ignoreUnPublicMap.put("IBaseMultiSelect", Utils.asListArgs("clearSelects","getSelectSize","getSelects","putSelects","putSelects","isSelect","isSelectValue","unselectValue","unselectValueAll"));
        ignoreUnPublicMap.put("IHttpEngine", Utils.asListArgs("newCall","cancelAll","cancelCall","cancelUrl","cancelTag"));
        ignoreUnPublicMap.put("IHttpEngine.Call", Utils.asListArgs("getRequest","isCanceled","isExecuted","isEnd","cancel","start","startAync"));
        ignoreUnPublicMap.put("IImageEngine", Utils.asListArgs("displayImage","displayImage","displayImage","displayImage","loadImage","loadImage","clearDiskCache","clearMemoryCache"));
        ignoreUnPublicMap.put("IImageEngine.ImageCallBack", Utils.asListArgs("getTranscodeType","onResponse","onFailure"));
        ignoreUnPublicMap.put("IJSONEngine", Utils.asListArgs("toJson","toJson","fromJson","fromJson","fromJson","fromJson","isJSON","isJSONObject","isJSONArray","toJsonIndent","toJsonIndent","toJsonIndent","toJsonIndent"));
        ignoreUnPublicMap.put("ILogEngine", Utils.asListArgs("isPrintLog","d","e","e","e","w","i","v","wtf","json","xml","dTag","eTag","eTag","eTag","wTag","iTag","vTag","wtfTag","jsonTag","xmlTag"));
        ignoreUnPublicMap.put("IMultiSelectEdit", Utils.asListArgs("isEditState","setEditState","toggleEditState","selectAll","clearSelectAll","inverseSelect","isSelectAll","isSelect","isNotSelect","getSelectSize","getDataCount"));
        ignoreUnPublicMap.put("IMultiSelectToList", Utils.asListArgs("isSelect","select","select","select","unselect","unselect","toggle","getSelectValues","getSelectValuesToReverse","getSelectValue","getSelectValueToPosition"));
        ignoreUnPublicMap.put("IMultiSelectToMap", Utils.asListArgs("isSelect","isSelectKey","select","select","unselect","toggle","getSelectValue","getSelectValues","getSelectValuesToReverse","getSelectKey","getSelectKeys","getSelectKeysToReverse"));
        ignoreUnPublicMap.put("NumberControlAssist", Utils.asListArgs("checkUpdate"));
        ignoreUnPublicMap.put("NumberControlAssist.INumberListener", Utils.asListArgs("onPrepareChanged","onNumberChanged"));
        ignoreUnPublicMap.put("NumberControlAssist.INumberOperate", Utils.asListArgs("isMinNumber","isMinNumber","isLessThanMinNumber","isGreaterThanMinNumber","isMaxNumber","isMaxNumber","isLessThanMaxNumber","isGreaterThanMaxNumber","getObject","setObject","getMinNumber","setMinNumber","getMaxNumber","setMaxNumber","setMinMaxNumber","getCurrentNumber","setCurrentNumber","setCurrentNumber","getResetNumber","setResetNumber","isAllowNegative","setAllowNegative","numberChange","addNumber","subtractionNumber","getNumberListener","setNumberListener"));

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
        ignoreReturnVoidMap.put("AbstractCommonCallBack", Utils.asListArgs("onResult - void","onError - void","onFailure - void"));
        ignoreReturnVoidMap.put("AdapterDataAssist", Utils.asListArgs("clearDataList - void","clearDataList - void","addData - void","addData - void","addAllData - void","addAllData - void","removeData - void","setDataList - void","setDataList - void","adapterNotifyDataSetChanged - void"));
        ignoreReturnVoidMap.put("DevCallBack", Utils.asListArgs("callback - void","callback - void","callback - void","callback - void"));
        ignoreReturnVoidMap.put("DevClickCallBack", Utils.asListArgs("onClick - void","onLongClick - void","onClick - void","onLongClick - void","onClick - void","onLongClick - void","onClick - void","onLongClick - void"));
        ignoreReturnVoidMap.put("DevDialogCallBack", Utils.asListArgs("onDialogNotify - void","onDialogShow - void","onDialogDismiss - void","onDialogStart - void","onDialogResume - void","onDialogPause - void","onDialogStop - void","onDialogDestroy - void"));
        ignoreReturnVoidMap.put("DevExResultCallback", Utils.asListArgs("onResult - void","onResult - void","onError - void","onFailure - void"));
        ignoreReturnVoidMap.put("DevHttpEngine", Utils.asListArgs("initEngine - void","cancelAll - void","cancelCall - void","cancelUrl - void","cancelTag - void"));
        ignoreReturnVoidMap.put("DevImageEngine", Utils.asListArgs("initEngine - void","displayImage - void","displayImage - void","displayImage - void","displayImage - void","loadImage - void","loadImage - void","clearDiskCache - void","clearMemoryCache - void"));
        ignoreReturnVoidMap.put("DevItemClickCallBack", Utils.asListArgs("onItemClick - void","onItemLongClick - void","onItemClick - void","onItemLongClick - void","onItemClick - void","onItemLongClick - void","onItemClick - void","onItemLongClick - void"));
        ignoreReturnVoidMap.put("DevJSONEngine", Utils.asListArgs("initEngine - void"));
        ignoreReturnVoidMap.put("DevLogEngine", Utils.asListArgs("initEngine - void","d - void","e - void","e - void","e - void","w - void","i - void","v - void","wtf - void","json - void","xml - void","dTag - void","eTag - void","eTag - void","eTag - void","wTag - void","iTag - void","vTag - void","wtfTag - void","jsonTag - void","xmlTag - void"));
        ignoreReturnVoidMap.put("DevResultCallback", Utils.asListArgs("onResult - void"));
        ignoreReturnVoidMap.put("EditTextWatcherAssist", Utils.asListArgs("bindListener - void","bindListener - void","focusChange - void"));
        ignoreReturnVoidMap.put("EditTextWatcherAssist.InputListener", Utils.asListArgs("onTextChanged - void"));
        ignoreReturnVoidMap.put("IAdapterData", Utils.asListArgs("clearDataList - void","clearDataList - void","addData - void","addData - void","addAllData - void","addAllData - void","removeData - void","setDataList - void","setDataList - void"));
        ignoreReturnVoidMap.put("IAdapterNotify", Utils.asListArgs("adapterNotifyDataSetChanged - void"));
        ignoreReturnVoidMap.put("IBaseMultiSelect", Utils.asListArgs("clearSelects - void","putSelects - void","putSelects - void","unselectValue - void","unselectValueAll - void"));
        ignoreReturnVoidMap.put("IHttpEngine", Utils.asListArgs("cancelAll - void","cancelCall - void","cancelUrl - void","cancelTag - void"));
        ignoreReturnVoidMap.put("IHttpEngine.Call", Utils.asListArgs("cancel - void"));
        ignoreReturnVoidMap.put("IHttpEngine.RequestCallBack", Utils.asListArgs("onStart - void","onCancel - void","onResponse - void","onFailure - void"));
        ignoreReturnVoidMap.put("IImageEngine", Utils.asListArgs("displayImage - void","displayImage - void","displayImage - void","displayImage - void","loadImage - void","loadImage - void","clearDiskCache - void","clearMemoryCache - void"));
        ignoreReturnVoidMap.put("IImageEngine.ImageCallBack", Utils.asListArgs("onResponse - void","onFailure - void"));
        ignoreReturnVoidMap.put("ILogEngine", Utils.asListArgs("d - void","e - void","e - void","e - void","w - void","i - void","v - void","wtf - void","json - void","xml - void","dTag - void","eTag - void","eTag - void","eTag - void","wTag - void","iTag - void","vTag - void","wtfTag - void","jsonTag - void","xmlTag - void"));
        ignoreReturnVoidMap.put("IMultiSelectToList", Utils.asListArgs("select - void","select - void","select - void","unselect - void","toggle - void"));
        ignoreReturnVoidMap.put("IMultiSelectToMap", Utils.asListArgs("select - void","select - void","unselect - void","toggle - void"));
        ignoreReturnVoidMap.put("MultiSelectListAssist", Utils.asListArgs("clearSelects - void","putSelects - void","putSelects - void","unselectValue - void","unselectValueAll - void","select - void","select - void","select - void","unselect - void","toggle - void"));
        ignoreReturnVoidMap.put("MultiSelectMapAssist", Utils.asListArgs("clearSelects - void","putSelects - void","putSelects - void","unselectValue - void","unselectValueAll - void","select - void","select - void","unselect - void","toggle - void"));
        ignoreReturnVoidMap.put("NumberControlAssist", Utils.asListArgs("checkUpdate - void"));
        ignoreReturnVoidMap.put("NumberControlAssist.INumberListener", Utils.asListArgs("onNumberChanged - void"));
        ignoreReturnVoidMap.put("PageAssist", Utils.asListArgs("initPageConfig - void"));

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