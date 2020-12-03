package javadoc.dev_utils;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;

/**
 * detail: 配置信息
 * @author Ttt
 */
public final class ApiConfig {

    private ApiConfig() {
    }

    // 项目名
    public static final String PROJECT_NAME   = "DevUtils";
    // 文件保存路径
    public static final String FILE_SAVE_PATH = "D:/API/";
    // 本地路径
    public static final String LOCAL_PATH     = "F:/Project/Android";
    // 项目路径
    public static final String PROJECT_PATH   = LOCAL_PATH + File.separator + PROJECT_NAME;

    // 包目录名
    public static final String DEV_PACKAGE          = "dev.utils";
    // 作者 Github 地址
    public static final String GITHUB_AUTHOR_URL    = "https://github.com/afkT";
    // README API 文件名
    public static final String README_FILE_NAME     = "README.md";
    // README_API 文件名
    public static final String README_API_FILE_NAME = "README_API.md";

    // ==========
    // = DevApp =
    // ==========

    // DevApp API 文件保存路径
    public static final String DEV_APP_API_FILE_SAVE_PATH = FILE_SAVE_PATH + "DevApp/";
    // DevApp 文件路径
    public static final String DEV_APP_PATH               = LOCAL_PATH + "/DevUtils/lib/DevApp/src/main/java/dev/";
    // DevApp Utils 文件路径
    public static final String DEV_APP_UTILS_PATH         = DEV_APP_PATH + "utils/";
    // DevApp GitHub 项目文件路径
    public static final String DEV_APP_GITHUB_URL         = GITHUB_AUTHOR_URL + "/DevUtils/blob/master/lib/DevApp/src/main/java/dev/utils/";
    // DevApp 版本号
    public static final String DEV_APP_VERSION            = "2.1.1";

    // ===========
    // = DevJava =
    // ===========

    // DevJava API 文件保存路径
    public static final String DEV_JAVA_API_FILE_SAVE_PATH = FILE_SAVE_PATH + "DevJava/";
    // DevJava 文件路径
    public static final String DEV_JAVA_PATH               = LOCAL_PATH + "/DevUtils/lib/DevJava/src/main/java/dev/";
    // DevJava Utils 文件路径
    public static final String DEV_JAVA_UTILS_PATH         = DEV_JAVA_PATH + "utils/";
    // DevJava GitHub 项目文件路径
    public static final String DEV_JAVA_GITHUB_URL         = GITHUB_AUTHOR_URL + "/DevUtils/blob/master/lib/DevJava/src/main/java/dev/utils/";
    // DevJava 版本号
    public static final String DEV_JAVA_VERSION            = "1.2.4";

    // =============
    // = DevAssist =
    // =============

    // 包目录名
    public static final String DEV_ASSIST_PACKAGE            = "dev";
    // DevAssist API 文件保存路径
    public static final String DEV_ASSIST_API_FILE_SAVE_PATH = FILE_SAVE_PATH + "DevAssist/";
    // DevAssist 文件路径
    public static final String DEV_ASSIST_PATH               = LOCAL_PATH + "/DevUtils/lib/DevAssist/src/main/java/dev/";
    // DevAssist GitHub 项目文件路径
    public static final String DEV_ASSIST_GITHUB_URL         = GITHUB_AUTHOR_URL + "/DevUtils/blob/master/lib/DevAssist/src/main/java/dev";
    // DevAssist 版本号
    public static final String DEV_ASSIST_VERSION            = "1.0.5";

    // ============
    // = DevOther =
    // ============

    // 包目录名
    public static final String DEV_OTHER_PACKAGE            = "dev";
    // DevOther API 文件保存路径
    public static final String DEV_OTHER_API_FILE_SAVE_PATH = FILE_SAVE_PATH + "DevOther/";
    // DevOther 文件路径
    public static final String DEV_OTHER_PATH               = LOCAL_PATH + "/DevUtils/lib/DevOther/src/main/java/dev/";
    // DevOther GitHub 项目文件路径
    public static final String DEV_OTHER_GITHUB_URL         = GITHUB_AUTHOR_URL + "/DevUtils/blob/master/lib/DevOther/src/main/java/dev";

    // =============
    // = DevWidget =
    // =============

    // 包目录名
    public static final String DEV_WIDGET_PACKAGE            = "dev";
    // DevWidget API 文件保存路径
    public static final String DEV_WIDGET_API_FILE_SAVE_PATH = FILE_SAVE_PATH + "DevWidget/";
    // DevWidget 文件路径
    public static final String DEV_WIDGET_PATH               = LOCAL_PATH + "/DevUtils/lib/DevWidget/src/main/java/dev/";
    // DevWidget GitHub 项目文件路径
    public static final String DEV_WIDGET_GITHUB_URL         = GITHUB_AUTHOR_URL + "/DevUtils/blob/master/lib/DevWidget/src/main/java/dev";
    // DevWidget 版本号
    public static final String DEV_WIDGET_VERSION            = "1.0.5";

    // ===========
    // = DevBase =
    // ===========

    // 包目录名
    public static final String DEV_BASE_PACKAGE            = "dev.base";
    // DevBase API 文件保存路径
    public static final String DEV_BASE_API_FILE_SAVE_PATH = FILE_SAVE_PATH + "DevBase/";
    // DevBase 文件路径
    public static final String DEV_BASE_PATH               = LOCAL_PATH + "/DevUtils/lib/DevBase/src/main/java/dev/base/";
    // DevBase GitHub 项目文件路径
    public static final String DEV_BASE_GITHUB_URL         = GITHUB_AUTHOR_URL + "/DevUtils/blob/master/lib/DevBase/src/main/java/dev/base";
    // DevBase 版本号
    public static final String DEV_BASE_VERSION            = "1.0.2";

    // ===============
    // = DevBaseMVVM =
    // ===============

    // 包目录名
    public static final String DEV_BASE_MVVM_PACKAGE            = "dev.base";
    // DevBaseMVVM API 文件保存路径
    public static final String DEV_BASE_MVVM_API_FILE_SAVE_PATH = FILE_SAVE_PATH + "DevBaseMVVM/";
    // DevBaseMVVM 文件路径
    public static final String DEV_BASE_MVVM_PATH               = LOCAL_PATH + "/DevUtils/lib/DevBaseMVVM/src/main/java/dev/base/";
    // DevBaseMVVM GitHub 项目文件路径
    public static final String DEV_BASE_MVVM_GITHUB_URL         = GITHUB_AUTHOR_URL + "/DevUtils/blob/master/lib/DevBaseMVVM/src/main/java/dev/base";
    // DevBaseMVVM 版本号
    public static final String DEV_BASE_MVVM_VERSION            = "1.0.0";

    // ===============
    // = DevStandard =
    // ===============

    // 包目录名
    public static final String DEV_STANDARD_PACKAGE            = "dev";
    // DevStandard API 文件保存路径
    public static final String DEV_STANDARD_API_FILE_SAVE_PATH = FILE_SAVE_PATH + "DevStandard/";
    // DevStandard 文件路径
    public static final String DEV_STANDARD_PATH               = LOCAL_PATH + "/DevUtils/lib/DevStandard/src/main/java/dev/";
    // DevStandard GitHub 项目文件路径
    public static final String DEV_STANDARD_GITHUB_URL         = GITHUB_AUTHOR_URL + "/DevUtils/blob/master/lib/DevStandard/src/main/java/dev";

    // =======
    // = 其他 =
    // =======

    // 方法名规则
    public static final String sMethodNameRegex = "[A-Za-z]+[2][A-Za-z][A-Za-z0-9]+";

    // ==================
    // = DevApp、DevJava =
    // ==================

    // 包名目录注释
    public static final HashMap<String, String>   sCatalogMap      = new HashMap<>();
    // 忽略不保存的类
    public static final HashSet<String>           sFilterClassSet  = new HashSet<>();
    // 忽略不保存的方法
    public static final HashMap<String, String[]> sFilterMethodMap = new HashMap<>();

    // =============
    // = DevAssist =
    // =============

    // 包名目录注释
    public static final HashMap<String, String>   sCatalogMap_Assist      = new HashMap<>();
    // 忽略不保存的类
    public static final HashSet<String>           sFilterClassSet_Assist  = new HashSet<>();
    // 忽略不保存的方法
    public static final HashMap<String, String[]> sFilterMethodMap_Assist = new HashMap<>();

    // ============
    // = DevOther =
    // ============

    // 包名目录注释
    public static final HashMap<String, String>   sCatalogMap_Other      = new HashMap<>();
    // 忽略不保存的类
    public static final HashSet<String>           sFilterClassSet_Other  = new HashSet<>();
    // 忽略不保存的方法
    public static final HashMap<String, String[]> sFilterMethodMap_Other = new HashMap<>();

    // ===========
    // = DevBase =
    // ===========

    // 包名目录注释
    public static final HashMap<String, String> sCatalogMap_Base = new HashMap<>();

    // ===============
    // = DevBaseMVVM =
    // ===============

    // 包名目录注释
    public static final HashMap<String, String> sCatalogMap_BaseMVVM = new HashMap<>();

    // =============
    // = DevWidget =
    // =============

    // 包名目录注释
    public static final HashMap<String, String>   sCatalogMap_Widget      = new HashMap<>();
    // 忽略不保存的类
    public static final HashSet<String>           sFilterClassSet_Widget  = new HashSet<>();
    // 忽略不保存的方法
    public static final HashMap<String, String[]> sFilterMethodMap_Widget = new HashMap<>();

    static {
        // 初始化 包名目录注释 Map
        initCatalogMap();
        // 初始化 忽略不保存的类 Map
        initFilterClassMap();
        // 初始化 忽略不保存的方法 Map
        initFilterMethodMap();
        // 初始化方法名正则表达式
        initMethodNameRegex();
    }

    // ===============
    // = 内部初始化方法 =
    // ===============

    /**
     * 初始化 包名目录注释 Map
     */
    private static void initCatalogMap() {

        // ==================
        // = DevApp、DevJava =
        // ==================

        sCatalogMap.put("dev.utils", "根目录");

        // ===========
        // = APP 目录 =
        // ===========

        sCatalogMap.put(".app", "APP 相关工具类");
        sCatalogMap.put(".app.anim", "动画工具类");

        sCatalogMap.put(".app.assist", "辅助类");
        sCatalogMap.put(".app.assist.manager", "管理器 如: TimerManager");

        sCatalogMap.put(".app.cache", "缓存工具类");
        sCatalogMap.put(".app.camera1", "摄像头相关 android.hardware.Camera");
        sCatalogMap.put(".app.helper", "功能 Helper 辅助类");
        sCatalogMap.put(".app.image", "图片相关处理");
        sCatalogMap.put(".app.info", "APP 信息、PackageInfo 等");
        sCatalogMap.put(".app.logger", "日志库 DevLogger");
        sCatalogMap.put(".app.permission", "权限工具类");
        sCatalogMap.put(".app.player", "多媒体 ( 视频、音频 ) 播放封装");
        sCatalogMap.put(".app.share", "SharedPreferences 封装");

        sCatalogMap.put(".app.toast", "Toast");
        sCatalogMap.put(".app.toast.toaster", "Toaster 处理无通知权限");

        sCatalogMap.put(".app.wifi", "Wifi、热点工具类");

        // ==============
        // = Common 目录 =
        // ==============

        sCatalogMap.put(".common", "Java 工具类, 不依赖 android api");
        sCatalogMap.put(".common.assist", "各种快捷辅助类");
        sCatalogMap.put(".common.assist.search", "搜索相关 ( 文件搜索等 )");
        sCatalogMap.put(".common.cipher", "编 / 解码工具类");
        sCatalogMap.put(".common.encrypt", "加密工具类");
        sCatalogMap.put(".common.file", "文件分片相关");
        sCatalogMap.put(".common.random", "随机概率算法工具类");
        sCatalogMap.put(".common.thread", "线程相关");
        sCatalogMap.put(".common.validator", "数据校验工具类");

        // =============
        // = DevAssist =
        // =============

        sCatalogMap_Assist.put("dev", "根目录");
        sCatalogMap_Assist.put(".assist", "快捷功能辅助类");
        sCatalogMap_Assist.put(".assist.adapter", "Adapter 相关");
        sCatalogMap_Assist.put(".assist.multiselect", "多选模块");
        sCatalogMap_Assist.put(".assist.multiselect.edit", "多选编辑方法");
        sCatalogMap_Assist.put(".base", "基类相关");
        sCatalogMap_Assist.put(".callback", "回调相关");
        sCatalogMap_Assist.put(".callback.click", "点击回调");
        sCatalogMap_Assist.put(".callback.common", "通用回调");
        sCatalogMap_Assist.put(".callback.result", "操作结果回调");
        sCatalogMap_Assist.put(".engine", "兼容 Engine");
        sCatalogMap_Assist.put(".engine.http", "Http Engine");
        sCatalogMap_Assist.put(".engine.image", "Image Engine");
        sCatalogMap_Assist.put(".engine.json", "JSON Engine");
        sCatalogMap_Assist.put(".engine.log", "Log Engine");

        // ============
        // = DevOther =
        // ============

        sCatalogMap_Other.put("dev", "根目录");
        sCatalogMap_Other.put(".assist", "常用辅助类封装");
        sCatalogMap_Other.put(".other", "第三方库封装工具类");
        sCatalogMap_Other.put(".other.okgo", "OkGo 网络请求");
        sCatalogMap_Other.put(".other.picture", "PictureSelector 图片选择库");
        sCatalogMap_Other.put(".other.retrofit", "Retrofit 网络请求");
        sCatalogMap_Other.put(".other.retrofit.response", "请求响应解析");
        sCatalogMap_Other.put(".other.retrofit.subscriber", "请求响应处理");
        sCatalogMap_Other.put(".receiver", "BroadcastReceiver 监听相关");
        sCatalogMap_Other.put(".service", "Service 相关");
        sCatalogMap_Other.put(".temp", "临时快捷调用工具类");

        // =============
        // = DevWidget =
        // =============

        sCatalogMap_Widget.put("dev", "根目录");
        sCatalogMap_Widget.put(".widget", "自定义 View 根目录");
        sCatalogMap_Widget.put(".widget.adjust", "自动调节高度 View");
        sCatalogMap_Widget.put(".widget.assist", "View 辅助类");
        sCatalogMap_Widget.put(".widget.custom", "自定义 View");
        sCatalogMap_Widget.put(".widget.function", "需求功能 View");
        sCatalogMap_Widget.put(".widget.ui", "UI View");
        sCatalogMap_Widget.put(".widget.utils", "工具类目录");

        // ===========
        // = DevBase =
        // ===========

        sCatalogMap_Base.put("dev.base", "根目录");
        sCatalogMap_Base.put(".able", "基类库接口相关");
        sCatalogMap_Base.put(".activity", "核心 Base Activity 代码");
        sCatalogMap_Base.put(".expand", "基于 Base Activity、Fragment 扩展包");
        sCatalogMap_Base.put(".expand.content", "Content Layout 基类");
        sCatalogMap_Base.put(".expand.mvp", "MVP 架构基类");
        sCatalogMap_Base.put(".expand.viewbinding", "ViewBinding 基类");
        sCatalogMap_Base.put(".fragment", "核心 Base Fragment 代码");
        sCatalogMap_Base.put(".utils", "依赖工具包");
        sCatalogMap_Base.put(".utils.assist", "功能辅助类 ( 抽取通用代码 )");

        // ===============
        // = DevBaseMVVM =
        // ===============

        sCatalogMap_BaseMVVM.put("dev.base", "根目录");
        sCatalogMap_BaseMVVM.put(".able", "基类库接口相关");
        sCatalogMap_BaseMVVM.put(".expand", "基于 Base Activity、Fragment 扩展包");
        sCatalogMap_BaseMVVM.put(".expand.content", "Content Layout MVVM 基类");
        sCatalogMap_BaseMVVM.put(".expand.mvvm", "MVVM 架构基类");
        sCatalogMap_BaseMVVM.put(".expand.viewdata", "ViewDataBinding 基类");
        sCatalogMap_BaseMVVM.put(".expand.viewmodel", "ViewModel 基类");
        sCatalogMap_BaseMVVM.put(".utils", "依赖工具包");
        sCatalogMap_BaseMVVM.put(".utils.assist", "功能辅助类 ( 抽取通用代码 )");
    }

    /**
     * 初始化 忽略不保存的类 Map
     */
    private static void initFilterClassMap() {

        // ==================
        // = DevApp、DevJava =
        // ==================

        // =======
        // = APP =
        // =======

        sFilterClassSet.add("IPrinter.java");
        sFilterClassSet.add("IPreference.java");
        sFilterClassSet.add("IToast.java");
        sFilterClassSet.add("DefaultToastStyle.java");
        sFilterClassSet.add("WifiVo.java");

        // ==========
        // = Common =
        // ==========

        sFilterClassSet.add("Cipher.java");
        sFilterClassSet.add("Decrypt.java");
        sFilterClassSet.add("Encrypt.java");

        // ============
        // = DevOther =
        // ============

        sFilterClassSet_Other.add("DataStoreUtils.kt");
    }

    /**
     * 初始化 忽略不保存的方法 Map
     */
    private static void initFilterMethodMap() {

        // ==================
        // = DevApp、DevJava =
        // ==================

        // =======
        // = APP =
        // =======

        sFilterMethodMap.put("ActivityUtils.java", new String[]{"onStartActivityForResult", "onActivityResult", "start", "onCreate", "onDestroy"});
        sFilterMethodMap.put("PermissionUtils.java", new String[]{"start", "onCreate", "onGranted", "onDenied"});
        sFilterMethodMap.put("WifiHotUtils.java", new String[]{"onStarted", "onStopped", "onFailed"});
        sFilterMethodMap.put("HandlerUtils.java", new String[]{"onEnd"});
        sFilterMethodMap.put("OnLocationChangeListener.java", new String[]{"getLastKnownLocation", "onLocationChanged", "onStatusChanged"});
        sFilterMethodMap.put("SizeUtils.java", new String[]{"onGetSize"});
        sFilterMethodMap.put("KeyBoardUtils.java", new String[]{"onSoftInputChanged"});
        sFilterMethodMap.put("DevMediaManager.java", new String[]{"onPrepared", "onCompletion", "onBufferingUpdate", "onSeekComplete", "onError", "onVideoSizeChanged", "isLooping", "setMediaConfig"});
        sFilterMethodMap.put("DevVideoPlayerControl.java", new String[]{"onPrepared", "onCompletion", "onBufferingUpdate", "onSeekComplete", "onError", "onVideoSizeChanged", "isLooping", "setMediaConfig", "surfaceChanged", "surfaceCreated", "surfaceDestroyed"});
        sFilterMethodMap.put("CameraAssist.java", new String[]{"stopPreviewNotify", "startPreviewNotify"});
        sFilterMethodMap.put("ImageUtils.java", new String[]{"getValue"});
        sFilterMethodMap.put("ToastUtils.java", new String[]{"filter", "handlerContent"});
        sFilterMethodMap.put("AnalysisRecordUtils.java", new String[]{"callback"});
        sFilterMethodMap.put("AsyncExecutor.java", new String[]{"doInBackground", "onPostExecute", "onCanceled", "abort"});
        sFilterMethodMap.put("ToastTintUtils.java", new String[]{"getTextColor", "getTextSize", "getBackgroundTintColor", "getBackground", "getMaxLines", "getEllipsize", "getTypeface", "getTintIconColor", "isTintIcon", "filter", "handlerContent"});
        sFilterMethodMap.put("EditTextUtils.java", new String[]{"getMarkId", "isOperate", "setOperate", "getOperateState", "setOperateState", "getType", "setType", "beforeTextChanged", "onTextChanged", "afterTextChanged"});
        sFilterMethodMap.put("AutoFocusAssist.java", new String[]{"onAutoFocus"});
        sFilterMethodMap.put("PhoneUtils.java", new String[]{"printInfo"});
        sFilterMethodMap.put("ROMUtils.java", new String[]{"getName", "getVersion", "toString"});
        sFilterMethodMap.put("DialogUtils.java", new String[]{"onLeftButton", "onRightButton", "onDismiss", "onSingleChoiceItems", "onPositiveButton", "onCancel", "onMultiChoiceItems"});
        sFilterMethodMap.put("SnackbarUtils.java", new String[]{"getRootGravity", "setRootGravity", "getRootCornerRadius", "setRootCornerRadius", "getRootBackgroundTintColor", "setRootBackgroundTintColor", "getRootBackground", "setRootBackground", "getRootMargin", "setRootMargin", "getRootAlpha", "setRootAlpha", "getTextGravity", "setTextGravity", "getTextColor", "setTextColor", "getTextSize", "setTextSize", "getTextMaxLines", "setTextMaxLines", "getTextEllipsize", "setTextEllipsize", "getTextTypeface", "setTextTypeface", "getTextPadding", "setTextPadding", "getActionGravity", "setActionGravity", "getActionColor", "setActionColor", "getActionSize", "setActionSize", "getActionPadding", "setActionPadding", "getActionCornerRadius", "setActionCornerRadius", "getActionBackgroundTintColor", "setActionBackgroundTintColor", "getActionBackground", "setActionBackground"});
        sFilterMethodMap.put("ClickUtils.java", new String[]{"onClick", "doClick", "doInvalidClick", "getCount", "getInvalidCount", "getInvalidCycleNumber"});
        sFilterMethodMap.put("ScreenshotUtils.java", new String[]{"onScreenshot", "onChange", "onChecker"});

        // ==========
        // = Common =
        // ==========

        sFilterMethodMap.put("FileBreadthFirstSearchUtils.java", new String[]{"isHandlerFile", "isAddToList", "onEndListener"});
        sFilterMethodMap.put("FileDepthFirstSearchUtils.java", new String[]{"isHandlerFile", "isAddToList", "onEndListener"});
        sFilterMethodMap.put("FileUtils.java", new String[]{"onReplace", "getSubFiles"});
        sFilterMethodMap.put("FileRecordUtils.java", new String[]{"callback"});
        sFilterMethodMap.put("HttpURLConnectionUtils.java", new String[]{"onResponse", "onFail"});
        sFilterMethodMap.put("TimeKeeper.java", new String[]{"onEnd"});
        sFilterMethodMap.put("TypeUtils.java", new String[]{"getActualTypeArguments", "getOwnerType", "getRawType", "equals", "hashCode"});
        sFilterMethodMap.put("CollectionUtils.java", new String[]{"put", "create"});
        sFilterMethodMap.put("ScaleUtils.java", new String[]{"getXYx", "getXY", "compareTo"});
        sFilterMethodMap.put("ColorUtils.java", new String[]{"toString"});
        sFilterMethodMap.put("KeyValueBean.java", new String[]{"toString"});
        sFilterMethodMap.put("CalendarUtils.java", new String[]{"compareTo", "toString", "hook"});

        // =============
        // = DevAssist =
        // =============

        sFilterMethodMap_Assist.put("EditTextWatcherAssist.java", new String[]{"onTextChanged"});
        sFilterMethodMap_Assist.put("NumberControlAssist.java", new String[]{"onPrepareChanged", "onNumberChanged"});

        // =============
        // = DevWidget =
        // =============

        sFilterMethodMap_Widget.put("ViewAssist.java", new String[]{"onRemove", "onNotFound", "onChange", "onCreateView", "onBindView"});
        sFilterMethodMap_Widget.put("StateLayout.java", new String[]{"onRemove", "onNotFound", "onChange", "onCreateView", "onBindView"});
    }

    /**
     * 初始化方法名正则表达式
     */
    private static void initMethodNameRegex() {
//        // 中间包含数字 2
//        sMethodNameRegex = ".*2+.*";
//        // 属于 xxx数字xxx
//        sMethodNameRegex = "[A-Za-z]+[0-9][A-Za-z]+";
//        // 属于 xxx2(xxx数字)
//        sMethodNameRegex = "[A-Za-z]+[2][A-Za-z0-9]+";
//        // 属于 xxx2x xx数字
//        sMethodNameRegex = "[A-Za-z]+[2][A-Za-z][A-Za-z0-9]+";
    }
}