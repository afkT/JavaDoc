package javadoc.dev_utils.check.dev_httpcapturecompiler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dev.utils.common.ArrayUtils;
import javadoc.dev_utils.check.dev.ICheckConfig;

/**
 * detail: DevHttpCaptureCompilerConfig 代码检测分析配置
 * @author Ttt
 */
final class DevHttpCaptureCompilerConfig implements ICheckConfig {

    /**
     * 获取忽略指定方法注释配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreAnnotateMap() {
        Map<String, List<String>> ignoreAnnotateMap = new HashMap<>();
        ignoreAnnotateMap.put("AdapterCaptureFile", ArrayUtils.asListArgs("onCreateViewHolder","onBindViewHolder"));
        ignoreAnnotateMap.put("AdapterDateModuleList", ArrayUtils.asListArgs("getMultiSelectKey","onCreateViewHolder","onBindViewHolder"));
        ignoreAnnotateMap.put("AdapterDateModuleListItem", ArrayUtils.asListArgs("onCreateViewHolder","onBindViewHolder"));
        ignoreAnnotateMap.put("AdapterMainModule", ArrayUtils.asListArgs("getMultiSelectKey","onCreateViewHolder","onBindViewHolder"));
        ignoreAnnotateMap.put("AdapterMainModuleList", ArrayUtils.asListArgs("onCreateViewHolder","onBindViewHolder"));
        ignoreAnnotateMap.put("BaseDevHttpActivity", ArrayUtils.asListArgs("onCreate","onDestroy"));
        ignoreAnnotateMap.put("DevHttpCaptureFileActivity", ArrayUtils.asListArgs("onCreate","onBackPressed"));
        ignoreAnnotateMap.put("DevHttpCaptureListActivity", ArrayUtils.asListArgs("onCreate","onBackPressed"));
        ignoreAnnotateMap.put("DevHttpCaptureMainActivity", ArrayUtils.asListArgs("onCreate","onBackPressed"));
        ignoreAnnotateMap.put("Dialogs.DataTypeDialog", ArrayUtils.asListArgs("callback"));
        ignoreAnnotateMap.put("Dialogs.GroupTypeDialog", ArrayUtils.asListArgs("callback"));
        ignoreAnnotateMap.put("Items.DataType", ArrayUtils.asListArgs("getTitle"));
        ignoreAnnotateMap.put("Items.GroupItem", ArrayUtils.asListArgs("setFunction"));
        ignoreAnnotateMap.put("Items.GroupType", ArrayUtils.asListArgs("getTitle"));

        return ignoreAnnotateMap;
    }

    /**
     * 获取忽略指定方法参数 final 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreFinalMap() {
        Map<String, List<String>> ignoreFinalMap = new HashMap<>();
        ignoreFinalMap.put("AdapterCaptureFile", ArrayUtils.asListArgs("onCreateViewHolder","onBindViewHolder"));
        ignoreFinalMap.put("AdapterDateModuleList", ArrayUtils.asListArgs("getMultiSelectKey","onCreateViewHolder","onBindViewHolder"));
        ignoreFinalMap.put("AdapterDateModuleListItem", ArrayUtils.asListArgs("onCreateViewHolder","onBindViewHolder"));
        ignoreFinalMap.put("AdapterMainModule", ArrayUtils.asListArgs("getMultiSelectKey","onCreateViewHolder","onBindViewHolder"));
        ignoreFinalMap.put("AdapterMainModuleList", ArrayUtils.asListArgs("onCreateViewHolder","onBindViewHolder"));
        ignoreFinalMap.put("BaseDevHttpActivity", ArrayUtils.asListArgs("onCreate"));
        ignoreFinalMap.put("DevHttpCaptureFileActivity", ArrayUtils.asListArgs("onCreate"));
        ignoreFinalMap.put("DevHttpCaptureListActivity", ArrayUtils.asListArgs("onCreate"));
        ignoreFinalMap.put("DevHttpCaptureMainActivity", ArrayUtils.asListArgs("onCreate"));

        return ignoreFinalMap;
    }

    /**
     * 获取忽略指定方法 static 修饰符配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreStaticMap() {
        Map<String, List<String>> ignoreStaticMap = new HashMap<>();
        ignoreStaticMap.put("AdapterCaptureFile", ArrayUtils.asListArgs("onCreateViewHolder","onBindViewHolder"));
        ignoreStaticMap.put("AdapterDateModuleList", ArrayUtils.asListArgs("getMultiSelectKey","onCreateViewHolder","onBindViewHolder"));
        ignoreStaticMap.put("AdapterDateModuleListItem", ArrayUtils.asListArgs("onCreateViewHolder","onBindViewHolder","start"));
        ignoreStaticMap.put("AdapterMainModule", ArrayUtils.asListArgs("getMultiSelectKey","onCreateViewHolder","onBindViewHolder"));
        ignoreStaticMap.put("AdapterMainModuleList", ArrayUtils.asListArgs("onCreateViewHolder","onBindViewHolder","start"));
        ignoreStaticMap.put("BaseDevHttpActivity", ArrayUtils.asListArgs("onCreate","onDestroy"));
        ignoreStaticMap.put("DevHttpCaptureFileActivity", ArrayUtils.asListArgs("onCreate","onBackPressed","finishOperate","initValue"));
        ignoreStaticMap.put("DevHttpCaptureListActivity", ArrayUtils.asListArgs("onCreate","onBackPressed","finishOperate","initValue","queryData","getNewOptions","refreshOptionsText","initListener","initDialogs"));
        ignoreStaticMap.put("DevHttpCaptureMainActivity", ArrayUtils.asListArgs("onCreate","onBackPressed","finishOperate","initValue"));
        ignoreStaticMap.put("Dialogs.DataTypeDialog", ArrayUtils.asListArgs("callback"));
        ignoreStaticMap.put("Dialogs.GroupTypeDialog", ArrayUtils.asListArgs("callback"));
        ignoreStaticMap.put("Items.DataType", ArrayUtils.asListArgs("getTitle"));
        ignoreStaticMap.put("Items.GroupItem", ArrayUtils.asListArgs("setFunction"));
        ignoreStaticMap.put("Items.GroupType", ArrayUtils.asListArgs("getTitle"));
        ignoreStaticMap.put("UtilsCompiler", ArrayUtils.asListArgs("addActivity","removeActivity","finishAllActivity","createGson","toJsonIndent","toJsonIndent","fromJson","fromJson","putUrlFunction","removeUrlFunction","getUrlFunction","clearCallback","removeCallback","addCallback","notifyCallback","queryData","clearData","getMainData","getCaptureItemByDate","getFileData","getDateData","getUrlFunctionByInfo","getUrlFunctionByFile"));

        return ignoreStaticMap;
    }

    /**
     * 获取忽略指定方法 @param 处理配置
     * @return 忽略配置 Map
     */
    @Override
    public Map<String, List<String>> getIgnoreParamMap() {
        Map<String, List<String>> ignoreParamMap = new HashMap<>();
        ignoreParamMap.put("AdapterCaptureFile", ArrayUtils.asListArgs("onCreateViewHolder","onBindViewHolder"));
        ignoreParamMap.put("AdapterDateModuleList", ArrayUtils.asListArgs("getMultiSelectKey","onCreateViewHolder","onBindViewHolder"));
        ignoreParamMap.put("AdapterDateModuleListItem", ArrayUtils.asListArgs("onCreateViewHolder","onBindViewHolder"));
        ignoreParamMap.put("AdapterMainModule", ArrayUtils.asListArgs("getMultiSelectKey","onCreateViewHolder","onBindViewHolder"));
        ignoreParamMap.put("AdapterMainModuleList", ArrayUtils.asListArgs("onCreateViewHolder","onBindViewHolder"));
        ignoreParamMap.put("BaseDevHttpActivity", ArrayUtils.asListArgs("onCreate"));
        ignoreParamMap.put("DevHttpCaptureFileActivity", ArrayUtils.asListArgs("onCreate"));
        ignoreParamMap.put("DevHttpCaptureListActivity", ArrayUtils.asListArgs("onCreate"));
        ignoreParamMap.put("DevHttpCaptureMainActivity", ArrayUtils.asListArgs("onCreate"));
        ignoreParamMap.put("Dialogs.DataTypeDialog", ArrayUtils.asListArgs("callback"));
        ignoreParamMap.put("Dialogs.GroupTypeDialog", ArrayUtils.asListArgs("callback"));
        ignoreParamMap.put("Items.GroupItem", ArrayUtils.asListArgs("setFunction"));

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
        ignoreUnPublicMap.put("AdapterDateModuleListItem", ArrayUtils.asListArgs("start"));
        ignoreUnPublicMap.put("AdapterMainModuleList", ArrayUtils.asListArgs("start"));
        ignoreUnPublicMap.put("BaseDevHttpActivity", ArrayUtils.asListArgs("onCreate","onDestroy"));
        ignoreUnPublicMap.put("DevHttpCaptureFileActivity", ArrayUtils.asListArgs("onCreate","finishOperate","initValue"));
        ignoreUnPublicMap.put("DevHttpCaptureListActivity", ArrayUtils.asListArgs("onCreate","finishOperate","initValue","queryData","getNewOptions","refreshOptionsText","initListener","initDialogs"));
        ignoreUnPublicMap.put("DevHttpCaptureMainActivity", ArrayUtils.asListArgs("onCreate","finishOperate","initValue"));
        ignoreUnPublicMap.put("Dialogs.DataTypeDialog", ArrayUtils.asListArgs("callback"));
        ignoreUnPublicMap.put("Dialogs.GroupTypeDialog", ArrayUtils.asListArgs("callback"));
        ignoreUnPublicMap.put("Items", ArrayUtils.asListArgs("convertDataType","convertTitleByHHMM","convertUrlKey"));
        ignoreUnPublicMap.put("UrlFunctionGet", ArrayUtils.asListArgs("toUrlFunction"));
        ignoreUnPublicMap.put("UtilsCompiler", ArrayUtils.asListArgs("addActivity","removeActivity","createGson","toJsonIndent","toJsonIndent","fromJson","fromJson","getUrlFunction","clearCallback","removeCallback","addCallback","notifyCallback","queryData","clearData","getMainData","getCaptureItemByDate","getFileData","getDateData","getUrlFunctionByInfo","getUrlFunctionByFile"));

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
        ignoreReturnVoidMap.put("AdapterDateModuleListItem", ArrayUtils.asListArgs("start - void"));
        ignoreReturnVoidMap.put("AdapterMainModuleList", ArrayUtils.asListArgs("start - void"));
        ignoreReturnVoidMap.put("DevHttpCaptureCompiler", ArrayUtils.asListArgs("finishAllActivity - void","putUrlFunction - void","removeUrlFunction - void"));
        ignoreReturnVoidMap.put("DevHttpCaptureFileActivity", ArrayUtils.asListArgs("finishOperate - void","initValue - void"));
        ignoreReturnVoidMap.put("DevHttpCaptureListActivity", ArrayUtils.asListArgs("finishOperate - void","initValue - void","queryData - void","refreshOptionsText - void","initListener - void","initDialogs - void"));
        ignoreReturnVoidMap.put("DevHttpCaptureMainActivity", ArrayUtils.asListArgs("finishOperate - void","initValue - void"));
        ignoreReturnVoidMap.put("UtilsCompiler", ArrayUtils.asListArgs("addActivity - void","removeActivity - void","finishAllActivity - void","putUrlFunction - void","removeUrlFunction - void","clearCallback - void","removeCallback - void","addCallback - void","notifyCallback - void","queryData - void","clearData - void"));

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