package javadoc.dev_utils.check.dev_base;

import javadoc.Utils;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * detail: 代码检测分析配置
 * @author Ttt
 */
final class DevBaseConfig {

    private DevBaseConfig() {
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

    /**
     * 初始化 忽略指定方法注释处理
     */
    private static void initIgnoreAnnotateMap() {
        sIgnoreAnnotateMap.put("AbstractDevBaseFragment", Utils.asList("onAttach","onDetach","onCreate","onCreateView","onHiddenChanged","setUserVisibleHint","onStart","onResume","onPause","onStop","onDestroy","getContentView","contentId","contentView"));
        sIgnoreAnnotateMap.put("AbstractbsDevBaseActivity", Utils.asList("onCreate","onStart","onRestart","onResume","onPause","onStop","onDestroy","getContentView","contentId","contentView"));
        sIgnoreAnnotateMap.put("DevBaseActivity", Utils.asList("onClick"));
        sIgnoreAnnotateMap.put("DevBaseFragment", Utils.asList("onClick"));
        sIgnoreAnnotateMap.put("DevBaseMVPActivity", Utils.asList("onCreate","onDestroy"));
        sIgnoreAnnotateMap.put("DevBaseMVPFragment", Utils.asList("onCreateView","onDestroy"));
        sIgnoreAnnotateMap.put("MVP.Presenter", Utils.asList("attachView","detachView"));
    }

    /**
     * 初始化 忽略指定方法参数 final 修饰符
     */
    private static void initIgnoreFinalMap() {
        sIgnoreFinalMap.put("MVP.Presenter", Utils.asList("attachView"));
    }

    /**
     * 初始化 忽略指定方法 static 修饰符
     */
    private static void initIgnoreStaticMap() {
        sIgnoreStaticMap.put("MVP.Presenter", Utils.asList("attachView","detachView"));
    }

    /**
     * 初始化 忽略指定方法 @param 处理
     */
    private static void initIgnoreParamMap() {
        sIgnoreParamMap.put("AbstractDevBaseFragment", Utils.asList("onAttach","onCreate","onCreateView","onHiddenChanged","setUserVisibleHint","setPopupWindow","setPopupWindow","setDialog","setDialog","setDialogFragment","setDialogFragment"));
        sIgnoreParamMap.put("AbstractbsDevBaseActivity", Utils.asList("onCreate","setPopupWindow","setPopupWindow","setDialog","setDialog","setDialogFragment","setDialogFragment"));
        sIgnoreParamMap.put("DevBaseActivity", Utils.asList("onClick"));
        sIgnoreParamMap.put("DevBaseFragment", Utils.asList("onClick"));
        sIgnoreParamMap.put("DevBaseMVPActivity", Utils.asList("onCreate"));
        sIgnoreParamMap.put("DevBaseMVPFragment", Utils.asList("onCreateView"));
        sIgnoreParamMap.put("IDevBaseUIOperation", Utils.asList("setPopupWindow","setPopupWindow","setDialog","setDialog","setDialogFragment","setDialogFragment"));
        sIgnoreParamMap.put("MVP.Presenter", Utils.asList("attachView"));
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
        sIgnoreUnPublicMap.put("AbstractDevBaseFragment", Utils.asList("printLogPri","printLogPri","layoutInit","isFragmentVisible","onInit"));
        sIgnoreUnPublicMap.put("AbstractbsDevBaseActivity", Utils.asList("onCreate","onStart","onRestart","onResume","onPause","onStop","onDestroy","printLogPri","printLogPri","layoutInit","isActivityVisible"));
        sIgnoreUnPublicMap.put("DevBaseMVPActivity", Utils.asList("onCreate","onDestroy","createPresenter","presenter"));
        sIgnoreUnPublicMap.put("DevBaseMVPFragment", Utils.asList("createPresenter","presenter"));
        sIgnoreUnPublicMap.put("IDevBaseMethod", Utils.asList("initMethodOrder","initViews","initValues","initListeners","initOtherOperate"));
        sIgnoreUnPublicMap.put("IDevBaseUIOperation", Utils.asList("showToast","showToast","getPopupWindow","setPopupWindow","setPopupWindow","getDialog","setDialog","setDialog","getDialogFragment","setDialogFragment","setDialogFragment"));
        sIgnoreUnPublicMap.put("IDevBaseViewOperation", Utils.asList("getContentView","contentId","contentView"));
        sIgnoreUnPublicMap.put("MVP.IPresenter", Utils.asList("attachView","detachView"));
    }

    /**
     * 初始化 忽略无修饰符变量 处理
     */
    private static void initIgnoreModifierVariableMap() {
    }

    /**
     * 初始化 忽略指定方法 return void 处理
     */
    private static void initIgnoreReturnVoidMap() {
    }
}