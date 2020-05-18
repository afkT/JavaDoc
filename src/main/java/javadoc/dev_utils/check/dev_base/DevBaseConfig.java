package javadoc.dev_utils.check.dev_base;

import javadoc.Utils;
import javadoc.dev_utils.check.dev.ICheckConfig;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * detail: DevBaseConfig 代码检测分析配置
 * @author Ttt
 */
final class DevBaseConfig implements ICheckConfig {

    /**
     * 获取忽略指定方法注释配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreAnnotateMap() {
        Map<String, ArrayList<String>> ignoreAnnotateMap = new HashMap<>();
        ignoreAnnotateMap.put("AbstractDevBaseFragment", Utils.asList("onAttach","onDetach","onCreate","onCreateView","onHiddenChanged","setUserVisibleHint","onStart","onResume","onPause","onStop","onDestroy","getContentView","contentId","contentView"));
        ignoreAnnotateMap.put("AbstractbsDevBaseActivity", Utils.asList("onCreate","onStart","onRestart","onResume","onPause","onStop","onDestroy","getContentView","contentId","contentView"));
        ignoreAnnotateMap.put("DevBaseActivity", Utils.asList("onClick"));
        ignoreAnnotateMap.put("DevBaseFragment", Utils.asList("onClick"));
        ignoreAnnotateMap.put("DevBaseMVPActivity", Utils.asList("onCreate","onDestroy"));
        ignoreAnnotateMap.put("DevBaseMVPFragment", Utils.asList("onCreateView","onDestroy"));
        ignoreAnnotateMap.put("MVP.Presenter", Utils.asList("attachView","detachView"));

        return ignoreAnnotateMap;
    }

    /**
     * 获取忽略指定方法参数 final 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreFinalMap() {
        Map<String, ArrayList<String>> ignoreFinalMap = new HashMap<>();
        ignoreFinalMap.put("MVP.Presenter", Utils.asList("attachView"));

        return ignoreFinalMap;
    }

    /**
     * 获取忽略指定方法 static 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreStaticMap() {
        Map<String, ArrayList<String>> ignoreStaticMap = new HashMap<>();
        ignoreStaticMap.put("MVP.Presenter", Utils.asList("attachView","detachView"));

        return ignoreStaticMap;
    }

    /**
     * 获取忽略指定方法 @param 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreParamMap() {
        Map<String, ArrayList<String>> ignoreParamMap = new HashMap<>();
        ignoreParamMap.put("AbstractDevBaseFragment", Utils.asList("onAttach","onCreate","onCreateView","onHiddenChanged","setUserVisibleHint","setPopupWindow","setPopupWindow","setDialog","setDialog","setDialogFragment","setDialogFragment"));
        ignoreParamMap.put("AbstractbsDevBaseActivity", Utils.asList("onCreate","setPopupWindow","setPopupWindow","setDialog","setDialog","setDialogFragment","setDialogFragment"));
        ignoreParamMap.put("DevBaseActivity", Utils.asList("onClick"));
        ignoreParamMap.put("DevBaseFragment", Utils.asList("onClick"));
        ignoreParamMap.put("DevBaseMVPActivity", Utils.asList("onCreate"));
        ignoreParamMap.put("DevBaseMVPFragment", Utils.asList("onCreateView"));
        ignoreParamMap.put("IDevBaseUIOperation", Utils.asList("setPopupWindow","setPopupWindow","setDialog","setDialog","setDialogFragment","setDialogFragment"));
        ignoreParamMap.put("MVP.Presenter", Utils.asList("attachView"));

        return ignoreParamMap;
    }

    /**
     * 获取忽略指定方法 @return 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreReturnMap() {
        Map<String, ArrayList<String>> ignoreReturnMap = new HashMap<>();
        
        return ignoreReturnMap;
    }

    /**
     * 获取忽略指定方法非 public 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreUnPublicMap() {
        Map<String, ArrayList<String>> ignoreUnPublicMap = new HashMap<>();
        ignoreUnPublicMap.put("AbstractDevBaseFragment", Utils.asList("printLogPri","printLogPri","layoutInit","isFragmentVisible","onInit"));
        ignoreUnPublicMap.put("AbstractbsDevBaseActivity", Utils.asList("onCreate","onStart","onRestart","onResume","onPause","onStop","onDestroy","printLogPri","printLogPri","layoutInit","isActivityVisible"));
        ignoreUnPublicMap.put("DevBaseMVPActivity", Utils.asList("onCreate","onDestroy","createPresenter","presenter"));
        ignoreUnPublicMap.put("DevBaseMVPFragment", Utils.asList("createPresenter","presenter"));
        ignoreUnPublicMap.put("IDevBaseMethod", Utils.asList("initMethodOrder","initViews","initValues","initListeners","initOtherOperate"));
        ignoreUnPublicMap.put("IDevBaseUIOperation", Utils.asList("showToast","showToast","getPopupWindow","setPopupWindow","setPopupWindow","getDialog","setDialog","setDialog","getDialogFragment","setDialogFragment","setDialogFragment"));
        ignoreUnPublicMap.put("IDevBaseViewOperation", Utils.asList("getContentView","contentId","contentView"));
        ignoreUnPublicMap.put("MVP.IPresenter", Utils.asList("attachView","detachView"));

        return ignoreUnPublicMap;
    }

    /**
     * 获取忽略无修饰符变量处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreModifierVariableMap() {
        Map<String, ArrayList<String>> ignoreModifierVariableMap = new HashMap<>();
        
        return ignoreModifierVariableMap;
    }

    /**
     * 获取忽略指定方法 return void 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, ArrayList<String>> getIgnoreReturnVoidMap() {
        Map<String, ArrayList<String>> ignoreReturnVoidMap = new HashMap<>();
        ignoreReturnVoidMap.put("AbstractDevBaseFragment", Utils.asList("printLogPri - void","printLogPri - void","layoutInit - void","initMethodOrder - void","initViews - void","initValues - void","initListeners - void","initOtherOperate - void","showToast - void","showToast - void","onInit - void"));
        ignoreReturnVoidMap.put("AbstractbsDevBaseActivity", Utils.asList("onBackPressed - void","printLogPri - void","printLogPri - void","layoutInit - void","initMethodOrder - void","initViews - void","initValues - void","initListeners - void","initOtherOperate - void","showToast - void","showToast - void"));
        ignoreReturnVoidMap.put("DevBaseMVPActivity", Utils.asList("createPresenter - void"));
        ignoreReturnVoidMap.put("DevBaseMVPFragment", Utils.asList("createPresenter - void"));
        ignoreReturnVoidMap.put("IDevBaseMethod", Utils.asList("initMethodOrder - void","initViews - void","initValues - void","initListeners - void","initOtherOperate - void"));
        ignoreReturnVoidMap.put("IDevBaseUIOperation", Utils.asList("showToast - void","showToast - void"));
        ignoreReturnVoidMap.put("MVP.IPresenter", Utils.asList("attachView - void","detachView - void"));

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