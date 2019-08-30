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
        sIgnoreAnnotateMap.put("EditTextWatcherAssist.FocusListener", Utils.asList("onFocusChange"));
    }

    // =

    /**
     * 初始化 忽略指定方法参数 final 修饰符
     */
    private static void initIgnoreFinalMap() {
        sIgnoreFinalMap.put("EditTextWatcherAssist.FocusListener", Utils.asList("onFocusChange"));
        sIgnoreFinalMap.put("NumberControlAssist", Utils.asList("setMinNumber", "setMaxNumber",
                "setCurrentNumber", "setResetNumber"));
        sIgnoreFinalMap.put("DevCallBack", Utils.asList("callback", "callback", "callback"));
        sIgnoreFinalMap.put("DevClickCallBack", Utils.asList("onClick", "onLongClick",
                "onClick", "onLongClick", "onClick", "onLongClick"));
        sIgnoreFinalMap.put("DevFilterCallback", Utils.asList("filter", "filter", "isFilter", "isFilter", "compare", "compare"));
        sIgnoreFinalMap.put("DevItemClickCallBack", Utils.asList("onItemClick", "onItemLongClick",
                "onItemClick", "onItemLongClick", "onItemClick", "onItemLongClick"));
    }

    // =

    /**
     * 初始化 忽略指定方法 static 修饰符
     */
    private static void initIgnoreStaticMap() {
    }

    /**
     * 初始化 忽略指定方法 @param 处理
     */
    private static void initIgnoreParamMap() {
        sIgnoreParamMap.put("EditTextWatcherAssist.FocusListener", Utils.asList("onFocusChange"));
        sIgnoreParamMap.put("DevBaseEntry", Utils.asList("setEntryKey", "setEntryValue"));
        sIgnoreParamMap.put("DevBaseEvent", Utils.asList("setCode", "setCodeStr", "setValue", "setObject"));
        sIgnoreParamMap.put("DevBaseVariable", Utils.asList("putVariables", "removeVariableValue",
                "removeVariableValueAll", "putVariable", "putVariable", "removeVariable", "toggle"));
        sIgnoreParamMap.put("DevExResultCallback", Utils.asList("setExpandResult"));
        sIgnoreParamMap.put("PageAssist", Utils.asList("setPageNum", "setPageNumReady", "setPageSize", "setTotalRow", "setLastPage"));
        sIgnoreParamMap.put("RequestStatusAssist", Utils.asList("setRequestType", "setRequestStatus"));

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
        sIgnoreUnPublicMap.put("EditTextWatcherAssist", Utils.asList("focusChange"));
        sIgnoreUnPublicMap.put("EditTextWatcherAssist.InputListener", Utils.asList("onTextChanged"));
        sIgnoreUnPublicMap.put("NumberControlAssist", Utils.asList("checkUpdate"));
        sIgnoreUnPublicMap.put("NumberControlAssist.INumberListener", Utils.asList(
                "onPrepareChanged", "onNumberChanged"));
        sIgnoreUnPublicMap.put("NumberControlAssist.INumberOperate", Utils.asList("isMinNumber",
                "isMinNumber", "isLessThanMinNumber", "isGreaterThanMinNumber", "isMaxNumber", "isMaxNumber",
                "isLessThanMaxNumber", "isGreaterThanMaxNumber", "getObject", "setObject", "getMinNumber",
                "setMinNumber", "getMaxNumber", "setMaxNumber", "setMinMaxNumber", "getCurrentNumber",
                "setCurrentNumber", "setCurrentNumber", "getResetNumber", "setResetNumber", "isAllowNegative",
                "setAllowNegative", "numberChange", "addNumber", "subtractionNumber", "getNumberListener", "setNumberListener"));
        sIgnoreUnPublicMap.put("DevBaseModel", Utils.asList("isCorrect"));
    }

    // =

    /**
     * 初始化 忽略无修饰符变量 处理
     */
    private static void initIgnoreModifierVariableMap() {
    }

    /**
     * 忽略注释间距异常文件
     * @param map {@link HashMap}
     */
    protected static void ignoreAnnotationSpaceMap(final HashMap<String, String> map) {
    }
}
