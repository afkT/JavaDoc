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

    // 本项目路径 ( JavaDoc 项目 )
    private static final String JAVADOC_PROJECT_PATH          = new File(System.getProperty("user.dir")).getAbsolutePath();
    // Template package path
    private static final String JAVADOC_TEMPLATE_PACKAGE_PATH = JAVADOC_PROJECT_PATH + "/src/main/java/javadoc/dev_utils/readme/template";

    // API 文件保存路径 ( 该项目根目录下 )
    public static final String API_FILE_SAVE_PATH     = JAVADOC_PROJECT_PATH + "/API";
    // Lib 文件保存路径
    public static final String API_LIB_FILE_SAVE_PATH = API_FILE_SAVE_PATH + "/lib";
    // 项目名
    public static final String PROJECT_NAME           = "DevUtils";
    // 本地路径 ( DevUtils 项目 )
    public static final String PROJECT_LOCAL_PATH     = "../../AndroidStudioProjects";
    // 项目路径 ( DevUtils 项目 )
    public static final String PROJECT_PATH           = PROJECT_LOCAL_PATH + File.separator + PROJECT_NAME;

    // 包目录名
    public static final String DEV_PACKAGE          = "dev.utils";
    // 作者 Github 地址
    public static final String GITHUB_AUTHOR_URL    = "https://github.com/afkT";
    // README API 文件名
    public static final String README_FILE_NAME     = "README.md";
    // README_API 文件名
    public static final String README_API_FILE_NAME = "README_API.md";

    // ============
    // = DevUtils =
    // ============

    // DevUtils Readme 文件保存路径
    public static final String DEV_UTILS_README_FILE_SAVE_PATH = API_FILE_SAVE_PATH;
    // DevUtils Template Readme
    public static final String DEV_UTILS_TEMPLATE              = JAVADOC_TEMPLATE_PACKAGE_PATH + "/Dev_README.md";

    // ==========
    // = DevApp =
    // ==========

    // DevApp 版本号
    public static final String DEV_APP_VERSION            = "2.3.2";
    // DevApp 文件路径
    public static final String DEV_APP_PATH               = PROJECT_LOCAL_PATH + "/DevUtils/lib/DevApp/src/main/java/dev";
    // DevApp Utils 文件路径
    public static final String DEV_APP_UTILS_PATH         = DEV_APP_PATH + "/utils/";
    // DevApp GitHub 项目文件路径
    public static final String DEV_APP_GITHUB_URL         = GITHUB_AUTHOR_URL + "/DevUtils/blob/master/lib/DevApp/src/main/java/dev/utils/";
    // DevApp API 文件保存路径
    public static final String DEV_APP_API_FILE_SAVE_PATH = API_LIB_FILE_SAVE_PATH + "/DevApp/";
    // DevApp Template Readme
    public static final String DEV_APP_TEMPLATE           = JAVADOC_TEMPLATE_PACKAGE_PATH + "/DevApp_README.md";

    // =============
    // = DevAssist =
    // =============

    // DevAssist 版本号
    public static final String DEV_ASSIST_VERSION            = "1.3.0";
    // 包目录名
    public static final String DEV_ASSIST_PACKAGE            = "dev";
    // DevAssist 文件路径
    public static final String DEV_ASSIST_PATH               = PROJECT_LOCAL_PATH + "/DevUtils/lib/DevAssist/src/main/java/dev/";
    // DevAssist GitHub 项目文件路径
    public static final String DEV_ASSIST_GITHUB_URL         = GITHUB_AUTHOR_URL + "/DevUtils/blob/master/lib/DevAssist/src/main/java/dev";
    // DevAssist API 文件保存路径
    public static final String DEV_ASSIST_API_FILE_SAVE_PATH = API_LIB_FILE_SAVE_PATH + "/DevAssist/";
    // DevAssist Template Readme
    public static final String DEV_ASSIST_TEMPLATE           = JAVADOC_TEMPLATE_PACKAGE_PATH + "/DevAssist_README.md";

    // ===========
    // = DevBase =
    // ===========

    // DevBase 版本号
    public static final String DEV_BASE_VERSION            = "1.0.8";
    // 包目录名
    public static final String DEV_BASE_PACKAGE            = "dev.base";
    // DevBase 文件路径
    public static final String DEV_BASE_PATH               = PROJECT_LOCAL_PATH + "/DevUtils/lib/DevBase/src/main/java/dev/base/";
    // DevBase GitHub 项目文件路径
    public static final String DEV_BASE_GITHUB_URL         = GITHUB_AUTHOR_URL + "/DevUtils/blob/master/lib/DevBase/src/main/java/dev/base";
    // DevBase API 文件保存路径
    public static final String DEV_BASE_API_FILE_SAVE_PATH = API_LIB_FILE_SAVE_PATH + "/DevBase/";
    // DevBase Template Readme
    public static final String DEV_BASE_TEMPLATE           = JAVADOC_TEMPLATE_PACKAGE_PATH + "/DevBase_README.md";

    // ===============
    // = DevBaseMVVM =
    // ===============

    // DevBaseMVVM 版本号
    public static final String DEV_BASE_MVVM_VERSION            = "1.0.6";
    // 包目录名
    public static final String DEV_BASE_MVVM_PACKAGE            = "dev.base";
    // DevBaseMVVM 文件路径
    public static final String DEV_BASE_MVVM_PATH               = PROJECT_LOCAL_PATH + "/DevUtils/lib/DevBaseMVVM/src/main/java/dev/base/";
    // DevBaseMVVM GitHub 项目文件路径
    public static final String DEV_BASE_MVVM_GITHUB_URL         = GITHUB_AUTHOR_URL + "/DevUtils/blob/master/lib/DevBaseMVVM/src/main/java/dev/base";
    // DevBaseMVVM API 文件保存路径
    public static final String DEV_BASE_MVVM_API_FILE_SAVE_PATH = API_LIB_FILE_SAVE_PATH + "/DevBaseMVVM/";
    // DevBaseMVVM Template Readme
    public static final String DEV_BASE_MVVM_TEMPLATE           = JAVADOC_TEMPLATE_PACKAGE_PATH + "/DevBaseMVVM_README.md";

    // =============
    // = DevEngine =
    // =============

    // DevEngine 版本号
    public static final String DEV_ENGINE_VERSION            = "1.0.2";
    // 包目录名
    public static final String DEV_ENGINE_PACKAGE            = "dev.engine";
    // DevEngine 文件路径
    public static final String DEV_ENGINE_PATH               = PROJECT_LOCAL_PATH + "/DevUtils/lib/DevEngine/src/main/java/dev/engine/";
    // DevEngine GitHub 项目文件路径
    public static final String DEV_ENGINE_GITHUB_URL         = GITHUB_AUTHOR_URL + "/DevUtils/blob/master/lib/DevEngine/src/main/java/dev/engine";
    // DevEngine API 文件保存路径
    public static final String DEV_ENGINE_API_FILE_SAVE_PATH = API_LIB_FILE_SAVE_PATH + "/DevEngine/";
    // DevEngine Template Readme
    public static final String DEV_ENGINE_TEMPLATE           = JAVADOC_TEMPLATE_PACKAGE_PATH + "/DevEngine_README.md";

    // ==================
    // = DevHttpCapture =
    // ==================

    // DevHttpCapture 版本号
    public static final String DEV_HTTP_CAPTURE_VERSION            = "1.0.6";
    // 包目录名
    public static final String DEV_HTTP_CAPTURE_PACKAGE            = "dev";
    // DevHttpCapture 文件路径
    public static final String DEV_HTTP_CAPTURE_PATH               = PROJECT_LOCAL_PATH + "/DevUtils/lib/DevHttpCapture/src/main/java/dev/";
    // DevHttpCapture GitHub 项目文件路径
    public static final String DEV_HTTP_CAPTURE_GITHUB_URL         = GITHUB_AUTHOR_URL + "/DevUtils/blob/master/lib/DevHttpCapture/src/main/java/dev";
    // DevHttpCapture API 文件保存路径
    public static final String DEV_HTTP_CAPTURE_API_FILE_SAVE_PATH = API_LIB_FILE_SAVE_PATH + "/DevHttpCapture/";
    // DevHttpCapture Template Readme
    public static final String DEV_HTTP_CAPTURE_TEMPLATE           = JAVADOC_TEMPLATE_PACKAGE_PATH + "/DevHttpCapture_README.md";

    // ==========================
    // = DevHttpCaptureCompiler =
    // ==========================

    // DevHttpCaptureCompiler 版本号
    public static final String DEV_HTTP_CAPTURE_COMPILER_VERSION            = DEV_HTTP_CAPTURE_VERSION;
    // 包目录名
    public static final String DEV_HTTP_CAPTURE_COMPILER_PACKAGE            = "dev";
    // DevHttpCaptureCompiler 文件路径
    public static final String DEV_HTTP_CAPTURE_COMPILER_PATH               = PROJECT_LOCAL_PATH + "/DevUtils/lib/HttpCapture/DevHttpCaptureCompiler/src/main/java/dev/";
    // DevHttpCaptureCompiler GitHub 项目文件路径
    public static final String DEV_HTTP_CAPTURE_COMPILER_GITHUB_URL         = GITHUB_AUTHOR_URL + "/DevUtils/blob/master/lib/HttpCapture/DevHttpCaptureCompiler/src/main/java/dev";
    // DevHttpCaptureCompiler API 文件保存路径
    public static final String DEV_HTTP_CAPTURE_COMPILER_API_FILE_SAVE_PATH = API_LIB_FILE_SAVE_PATH + "/HttpCapture/";
    // DevHttpCaptureCompiler Template Readme
    public static final String DEV_HTTP_CAPTURE_COMPILER_TEMPLATE           = JAVADOC_TEMPLATE_PACKAGE_PATH + "/DevHttpCaptureCompiler_README.md";

    // ============
    // = DevOther =
    // ============

    // 包目录名
    public static final String DEV_OTHER_PACKAGE            = "";
    // DevOther 文件路径
    public static final String DEV_OTHER_PATH               = PROJECT_LOCAL_PATH + "/DevUtils/lib/DevOther/src/main/java/";
    // DevOther GitHub 项目文件路径
    public static final String DEV_OTHER_GITHUB_URL         = GITHUB_AUTHOR_URL + "/DevUtils/blob/master/lib/DevOther/src/main/java/";
    // DevOther API 文件保存路径
    public static final String DEV_OTHER_API_FILE_SAVE_PATH = API_LIB_FILE_SAVE_PATH + "/DevOther/";
    // DevOther Template Readme
    public static final String DEV_OTHER_TEMPLATE           = JAVADOC_TEMPLATE_PACKAGE_PATH + "/DevOther_README.md";

    // =============
    // = DevWidget =
    // =============

    // DevWidget 版本号
    public static final String DEV_WIDGET_VERSION            = "1.1.3";
    // 包目录名
    public static final String DEV_WIDGET_PACKAGE            = "dev";
    // DevWidget 文件路径
    public static final String DEV_WIDGET_PATH               = PROJECT_LOCAL_PATH + "/DevUtils/lib/DevWidget/src/main/java/dev/";
    // DevWidget GitHub 项目文件路径
    public static final String DEV_WIDGET_GITHUB_URL         = GITHUB_AUTHOR_URL + "/DevUtils/blob/master/lib/DevWidget/src/main/java/dev";
    // DevWidget API 文件保存路径
    public static final String DEV_WIDGET_API_FILE_SAVE_PATH = API_LIB_FILE_SAVE_PATH + "/DevWidget/";
    // DevWidget Template Readme
    public static final String DEV_WIDGET_TEMPLATE           = JAVADOC_TEMPLATE_PACKAGE_PATH + "/DevWidget_README.md";
    public static final String DEV_WIDGET_API_TEMPLATE       = JAVADOC_TEMPLATE_PACKAGE_PATH + "/DevWidget_README_API.md";

    // ==================
    // = DevEnvironment =
    // ==================

    // DevEnvironment 版本号
    public static final String DEV_ENVIRONMENT_VERSION            = "1.0.6";
    // DevEnvironment API 文件保存路径
    public static final String DEV_ENVIRONMENT_API_FILE_SAVE_PATH = API_LIB_FILE_SAVE_PATH + "/Environment/";
    // DevEnvironment Template Readme
    public static final String DEV_ENVIRONMENT_TEMPLATE           = JAVADOC_TEMPLATE_PACKAGE_PATH + "/DevEnvironment_README.md";

    // ===========
    // = DevJava =
    // ===========

    // DevJava 版本号
    public static final String DEV_JAVA_VERSION            = "1.4.0";
    // DevJava 文件路径
    public static final String DEV_JAVA_PATH               = PROJECT_LOCAL_PATH + "/DevUtils/lib/DevJava/src/main/java/dev";
    // DevJava Utils 文件路径
    public static final String DEV_JAVA_UTILS_PATH         = DEV_JAVA_PATH + "/utils/";
    // DevJava GitHub 项目文件路径
    public static final String DEV_JAVA_GITHUB_URL         = GITHUB_AUTHOR_URL + "/DevUtils/blob/master/lib/DevJava/src/main/java/dev/utils/";
    // DevJava API 文件保存路径
    public static final String DEV_JAVA_API_FILE_SAVE_PATH = API_LIB_FILE_SAVE_PATH + "/DevJava/";
    // DevJava Template Readme
    public static final String DEV_JAVA_TEMPLATE           = JAVADOC_TEMPLATE_PACKAGE_PATH + "/DevJava_README.md";

    // ===============
    // = DevStandard =
    // ===============

    // 包目录名
    public static final String DEV_STANDARD_PACKAGE            = "dev";
    // DevStandard 文件路径
    public static final String DEV_STANDARD_PATH               = PROJECT_LOCAL_PATH + "/DevUtils/interesting/DevStandard/src/main/java/dev/";
    // DevStandard GitHub 项目文件路径
    public static final String DEV_STANDARD_GITHUB_URL         = GITHUB_AUTHOR_URL + "/DevUtils/blob/master/lib/DevStandard/src/main/java/dev";
    // DevStandard API 文件保存路径
    public static final String DEV_STANDARD_API_FILE_SAVE_PATH = API_LIB_FILE_SAVE_PATH + "/DevStandard/";

    // =======
    // = 其他 =
    // =======

    // 方法名规则
    public static final String sMethodNameRegex = "[A-Za-z]+[2][A-Za-z][A-Za-z0-9]+";

    // ==================
    // = DevApp、DevJava =
    // ==================

    // 包名目录注释
    public static final HashMap<String, String>   sCatalogMap_APP      = new HashMap<>();
    // 忽略不保存的类
    public static final HashSet<String>           sFilterClassSet_APP  = new HashSet<>();
    // 忽略不保存的方法
    public static final HashMap<String, String[]> sFilterMethodMap_APP = new HashMap<>();

    // =============
    // = DevAssist =
    // =============

    // 包名目录注释
    public static final HashMap<String, String>   sCatalogMap_Assist      = new HashMap<>();
    // 忽略不保存的类
    public static final HashSet<String>           sFilterClassSet_Assist  = new HashSet<>();
    // 忽略不保存的方法
    public static final HashMap<String, String[]> sFilterMethodMap_Assist = new HashMap<>();

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
    // = DevEngine =
    // =============

    // 包名目录注释
    public static final HashMap<String, String> sCatalogMap_Engine = new HashMap<>();

    // ==================
    // = DevHttpCapture =
    // ==================

    // 包名目录注释
    public static final HashMap<String, String>   sCatalogMap_HttpCapture      = new HashMap<>();
    // 忽略不保存的类
    public static final HashSet<String>           sFilterClassSet_HttpCapture  = new HashSet<>();
    // 忽略不保存的方法
    public static final HashMap<String, String[]> sFilterMethodMap_HttpCapture = new HashMap<>();

    // ============
    // = DevOther =
    // ============

    // 包名目录注释
    public static final HashMap<String, String>   sCatalogMap_Other      = new HashMap<>();
    // 忽略不保存的类
    public static final HashSet<String>           sFilterClassSet_Other  = new HashSet<>();
    // 忽略不保存的方法
    public static final HashMap<String, String[]> sFilterMethodMap_Other = new HashMap<>();

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

        sCatalogMap_APP.put("dev.utils", "根目录");

        // ===========
        // = APP 目录 =
        // ===========

        sCatalogMap_APP.put(".app", "APP 相关工具类");
        sCatalogMap_APP.put(".app.anim", "动画工具类");

        sCatalogMap_APP.put(".app.assist", "辅助类");
        sCatalogMap_APP.put(".app.assist.floating", "悬浮窗实现方案辅助类");
        sCatalogMap_APP.put(".app.assist.lifecycle", "Activity 生命周期监听辅助类");
        sCatalogMap_APP.put(".app.assist.record", "文件记录分析类");

        sCatalogMap_APP.put(".app.cache", "缓存工具类");
        sCatalogMap_APP.put(".app.camera", "摄像头相关");
        sCatalogMap_APP.put(".app.camera.camera1", "android.hardware.Camera ( Camera1 相关 )");
        sCatalogMap_APP.put(".app.helper", "功能 Helper 辅助类");
        sCatalogMap_APP.put(".app.helper.dev", "Dev 工具类链式调用 Helper 类");
        sCatalogMap_APP.put(".app.helper.quick", "简化链式设置 View Quick Helper 类");
        sCatalogMap_APP.put(".app.helper.version", "Android 版本适配 Helper 类");
        sCatalogMap_APP.put(".app.helper.view", "View 链式调用快捷设置 Helper 类");
        sCatalogMap_APP.put(".app.image", "图片相关处理");
        sCatalogMap_APP.put(".app.info", "APP 信息、PackageInfo 等");
        sCatalogMap_APP.put(".app.logger", "日志库 DevLogger");
        sCatalogMap_APP.put(".app.permission", "权限工具类");
        sCatalogMap_APP.put(".app.player", "多媒体 ( 视频、音频 ) 播放封装");
        sCatalogMap_APP.put(".app.timer", "定时器");
        sCatalogMap_APP.put(".app.share", "SharedPreferences 封装");

        sCatalogMap_APP.put(".app.toast", "Toast");
        sCatalogMap_APP.put(".app.toast.toaster", "Toaster 处理无通知权限");

        sCatalogMap_APP.put(".app.wifi", "Wifi、热点工具类");

        // ==============
        // = Common 目录 =
        // ==============

        sCatalogMap_APP.put(".common", "Java 工具类, 不依赖 android api");
        sCatalogMap_APP.put(".common.assist", "各种快捷辅助类");
        sCatalogMap_APP.put(".common.assist.record", "文件记录分析类");
        sCatalogMap_APP.put(".common.assist.search", "搜索相关 ( 文件搜索等 )");
        sCatalogMap_APP.put(".common.cipher", "编 / 解码工具类");
        sCatalogMap_APP.put(".common.comparator", "排序比较器");
        sCatalogMap_APP.put(".common.comparator.sort", "各种类型比较器排序实现");
        sCatalogMap_APP.put(".common.encrypt", "加密工具类");
        sCatalogMap_APP.put(".common.file", "文件分片相关");
        sCatalogMap_APP.put(".common.random", "随机概率算法工具类");
        sCatalogMap_APP.put(".common.thread", "线程相关");
        sCatalogMap_APP.put(".common.validator", "数据校验工具类");

        // =============
        // = DevAssist =
        // =============

        sCatalogMap_Assist.put("dev", "根目录");
        sCatalogMap_Assist.put(".adapter", "适配器相关");
        sCatalogMap_Assist.put(".assist", "快捷功能辅助类");
        sCatalogMap_Assist.put(".base", "实体类基类相关");
        sCatalogMap_Assist.put(".base.data", "数据操作");
        sCatalogMap_Assist.put(".base.entry", "KeyValue 实体类");
        sCatalogMap_Assist.put(".base.multiselect", "多选编辑操作");
        sCatalogMap_Assist.put(".base.number", "数值操作");
        sCatalogMap_Assist.put(".base.state", "状态相关");
        sCatalogMap_Assist.put(".callback", "接口回调相关");
        sCatalogMap_Assist.put(".engine", "兼容 Engine");
        sCatalogMap_Assist.put(".engine.analytics", "Analytics Engine 数据统计 ( 埋点 )");
        sCatalogMap_Assist.put(".engine.barcode", "BarCode Engine 条形码、二维码处理");
        sCatalogMap_Assist.put(".engine.barcode.listener", "条形码、二维码操作回调事件");
        sCatalogMap_Assist.put(".engine.cache", "Cache Engine 有效期键值对缓存");
        sCatalogMap_Assist.put(".engine.compress", "Image Compress Engine 图片压缩");
        sCatalogMap_Assist.put(".engine.compress.listener", "图片压缩回调事件");
        sCatalogMap_Assist.put(".engine.http", "Http Engine 网络请求");
        sCatalogMap_Assist.put(".engine.image", "Image Engine 图片加载、下载、转格式等");
        sCatalogMap_Assist.put(".engine.image.listener", "图片加载监听事件");
        sCatalogMap_Assist.put(".engine.json", "JSON Engine 映射");
        sCatalogMap_Assist.put(".engine.keyvalue", "KeyValue Engine 键值对存储");
        sCatalogMap_Assist.put(".engine.log", "Log Engine 日志打印");
        sCatalogMap_Assist.put(".engine.media", "Media Selector Engine 多媒体资源选择");
        sCatalogMap_Assist.put(".engine.permission", "Permission Engine 权限申请");
        sCatalogMap_Assist.put(".engine.push", "Push Engine 推送平台处理");
        sCatalogMap_Assist.put(".engine.share", "Share Engine 分享平台处理");
        sCatalogMap_Assist.put(".engine.share.listener", "分享回调事件");
        sCatalogMap_Assist.put(".engine.storage", "Storage Engine 外部、内部文件存储");
        sCatalogMap_Assist.put(".engine.storage.listener", "Storage 存储结果事件");
        sCatalogMap_Assist.put(".function", "快捷方法执行相关");

        // ==================
        // = DevHttpCapture =
        // ==================

        sCatalogMap_HttpCapture.put("dev", "根目录");
        sCatalogMap_HttpCapture.put(".capture", "Http 抓包实现代码");

        // ============
        // = DevOther =
        // ============

        sCatalogMap_Other.put("", "根目录");
        sCatalogMap_Other.put(".dev", "通用实现");
        sCatalogMap_Other.put(".dev.receiver", "BroadcastReceiver 监听相关");
        sCatalogMap_Other.put(".dev.service", "Service 相关");

        sCatalogMap_Other.put(".java", "Java 实现");
        sCatalogMap_Other.put(".java.dev", "根目录");
        sCatalogMap_Other.put(".java.dev.assist", "常用辅助类封装");
        sCatalogMap_Other.put(".java.dev.engine", "兼容 Engine");
        sCatalogMap_Other.put(".java.dev.engine.analytics", "Analytics Engine 数据统计 ( 埋点 )");
        sCatalogMap_Other.put(".java.dev.engine.barcode", "BarCode Engine 条形码、二维码处理");
        sCatalogMap_Other.put(".java.dev.engine.barcode.listener", "条形码、二维码操作回调事件");
        sCatalogMap_Other.put(".java.dev.engine.cache", "Cache Engine 有效期键值对缓存");
        sCatalogMap_Other.put(".java.dev.engine.compress", "Image Compress Engine 图片压缩");
        sCatalogMap_Other.put(".java.dev.engine.http", "Http Engine 网络请求");
        sCatalogMap_Other.put(".java.dev.engine.image", "Image Engine 图片加载、下载、转格式等");
        sCatalogMap_Other.put(".java.dev.engine.json", "JSON Engine 映射");
        sCatalogMap_Other.put(".java.dev.engine.keyvalue", "KeyValue Engine 键值对存储");
        sCatalogMap_Other.put(".java.dev.engine.log", "Log Engine 日志打印");
        sCatalogMap_Other.put(".java.dev.engine.media", "Media Selector Engine 多媒体资源选择");
        sCatalogMap_Other.put(".java.dev.engine.permission", "Permission Engine 权限申请");
        sCatalogMap_Other.put(".java.dev.engine.push", "Push Engine 推送平台处理");
        sCatalogMap_Other.put(".java.dev.engine.share", "Share Engine 分享平台处理");
        sCatalogMap_Other.put(".java.dev.engine.share.listener", "分享回调事件");
        sCatalogMap_Other.put(".java.dev.engine.storage", "Storage Engine 外部、内部文件存储");
        sCatalogMap_Other.put(".java.dev.engine.storage.listener", "Storage 存储结果事件");
        sCatalogMap_Other.put(".java.dev.other", "第三方库封装工具类");
        sCatalogMap_Other.put(".java.dev.other.cache", "缓存工具类");
        sCatalogMap_Other.put(".java.dev.other.okgo", "OkGo 网络请求");
        sCatalogMap_Other.put(".java.dev.other.okgo.demo", "OkGo 使用 Demo");
        sCatalogMap_Other.put(".java.dev.other.retrofit", "Retrofit 网络请求");
        sCatalogMap_Other.put(".java.dev.other.retrofit.response", "请求响应解析");
        sCatalogMap_Other.put(".java.dev.other.retrofit.subscriber", "请求响应处理");
        sCatalogMap_Other.put(".java.dev.other.work", "WorkManager Utils");
        sCatalogMap_Other.put(".java.dev.other.work.demo", "WorkManager 使用 Demo");

        sCatalogMap_Other.put(".ktx", "Kotlin 实现");
        sCatalogMap_Other.put(".ktx.dev", "根目录");
        sCatalogMap_Other.put(".ktx.dev.assist", "常用辅助类封装");
        sCatalogMap_Other.put(".ktx.dev.other", "第三方库封装工具类");
        sCatalogMap_Other.put(".ktx.dev.other.retrofit_coroutines", "Retrofit Coroutines 封装");
        sCatalogMap_Other.put(".ktx.dev.other.retrofit_coroutines.demo", "Retrofit Coroutines Demo");
        sCatalogMap_Other.put(".ktx.dev.other.retrofit_rxjava", "Retrofit RxJava 封装");
        sCatalogMap_Other.put(".ktx.dev.other.retrofit_rxjava.demo", "Retrofit RxJava Demo");
        sCatalogMap_Other.put(".ktx.dev.other.retrofit_rxjava.response", "请求响应解析");
        sCatalogMap_Other.put(".ktx.dev.other.retrofit_rxjava.subscriber", "请求响应处理");

        // =============
        // = DevWidget =
        // =============

        sCatalogMap_Widget.put("dev", "根目录");
        sCatalogMap_Widget.put(".widget", "自定义 View 根目录");
        sCatalogMap_Widget.put(".widget.adjust", "自动调节高度 View");
        sCatalogMap_Widget.put(".widget.assist", "View 辅助类");
        sCatalogMap_Widget.put(".widget.custom", "自定义 View");
        sCatalogMap_Widget.put(".widget.decoration", "RecyclerView ItemDecoration");
        sCatalogMap_Widget.put(".widget.decoration.horizontal", "Horizontal ItemDecoration");
        sCatalogMap_Widget.put(".widget.function", "需求功能 View");
        sCatalogMap_Widget.put(".widget.ui", "UI View");
        sCatalogMap_Widget.put(".widget.ui.round", "圆角相关 View");
        sCatalogMap_Widget.put(".widget.utils", "工具类目录");

        // ===========
        // = DevBase =
        // ===========

        sCatalogMap_Base.put("dev.base", "根目录");
        sCatalogMap_Base.put(".able", "基类库接口相关");
        sCatalogMap_Base.put(".activity", "核心 Base Activity 代码");
        sCatalogMap_Base.put(".adapter", "RecyclerView ViewBinding ViewHolder");
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
        sCatalogMap_BaseMVVM.put(".adapter", "RecyclerView ViewDataBinding ViewHolder");
        sCatalogMap_BaseMVVM.put(".expand", "基于 Base Activity、Fragment 扩展包");
        sCatalogMap_BaseMVVM.put(".expand.content", "Content Layout MVVM 基类");
        sCatalogMap_BaseMVVM.put(".expand.mvvm", "MVVM 架构基类");
        sCatalogMap_BaseMVVM.put(".expand.viewdata", "ViewDataBinding 基类");
        sCatalogMap_BaseMVVM.put(".expand.viewmodel", "ViewModel 基类");
        sCatalogMap_BaseMVVM.put(".utils", "依赖工具包");
        sCatalogMap_BaseMVVM.put(".utils.assist", "功能辅助类 ( 抽取通用代码 )");

        // =============
        // = DevEngine =
        // =============

        sCatalogMap_Engine.put("dev.engine", "根目录");
        sCatalogMap_Engine.put(".analytics", "Analytics Engine 数据统计 ( 埋点 )");
        sCatalogMap_Engine.put(".barcode", "BarCode Engine 条形码、二维码处理");
        sCatalogMap_Engine.put(".barcode.listener", "条形码、二维码操作回调事件");
        sCatalogMap_Engine.put(".cache", "Cache Engine 有效期键值对缓存");
        sCatalogMap_Engine.put(".compress", "Image Compress Engine 图片压缩");
        sCatalogMap_Engine.put(".compress.listener", "图片压缩回调事件");
        sCatalogMap_Engine.put(".http", "Http Engine 网络请求");
        sCatalogMap_Engine.put(".image", "Image Engine 图片加载、下载、转格式等");
        sCatalogMap_Engine.put(".image.listener", "图片加载监听事件");
        sCatalogMap_Engine.put(".json", "JSON Engine 映射");
        sCatalogMap_Engine.put(".keyvalue", "KeyValue Engine 键值对存储");
        sCatalogMap_Engine.put(".log", "Log Engine 日志打印");
        sCatalogMap_Engine.put(".media", "Media Selector Engine 多媒体资源选择");
        sCatalogMap_Engine.put(".permission", "Permission Engine 权限申请");
        sCatalogMap_Engine.put(".push", "Push Engine 推送平台处理");
        sCatalogMap_Engine.put(".share", "Share Engine 分享平台处理");
        sCatalogMap_Engine.put(".share.listener", "分享回调事件");
        sCatalogMap_Engine.put(".storage", "Storage Engine 外部、内部文件存储");
        sCatalogMap_Engine.put(".storage.listener", "Storage 存储结果事件");
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

        sFilterClassSet_APP.add("IPrinter.java");
        sFilterClassSet_APP.add("IPreference.java");
        sFilterClassSet_APP.add("IToast.java");
        sFilterClassSet_APP.add("DefaultToastStyle.java");
        sFilterClassSet_APP.add("WifiVo.java");

        // ==========
        // = Common =
        // ==========

        sFilterClassSet_APP.add("Cipher.java");
        sFilterClassSet_APP.add("Decrypt.java");
        sFilterClassSet_APP.add("Encrypt.java");

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

        sFilterMethodMap_APP.put("ActivityUtils.java", new String[]{"onStartActivityForResult", "onActivityResult", "start", "onCreate", "onDestroy"});
        sFilterMethodMap_APP.put("PermissionUtils.java", new String[]{"start", "onCreate", "onGranted", "onDenied"});
        sFilterMethodMap_APP.put("WifiHotUtils.java", new String[]{"onStarted", "onStopped", "onFailed"});
        sFilterMethodMap_APP.put("HandlerUtils.java", new String[]{"onEnd"});
        sFilterMethodMap_APP.put("OnLocationChangeListener.java", new String[]{"getLastKnownLocation", "onLocationChanged", "onStatusChanged"});
        sFilterMethodMap_APP.put("SizeUtils.java", new String[]{"onGetSize"});
        sFilterMethodMap_APP.put("KeyBoardUtils.java", new String[]{"onSoftInputChanged"});
        sFilterMethodMap_APP.put("DevMediaManager.java", new String[]{"onPrepared", "onCompletion", "onBufferingUpdate", "onSeekComplete", "onError", "onVideoSizeChanged", "isLooping", "setMediaConfig"});
        sFilterMethodMap_APP.put("DevVideoPlayerControl.java", new String[]{"onPrepared", "onCompletion", "onBufferingUpdate", "onSeekComplete", "onError", "onVideoSizeChanged", "isLooping", "setMediaConfig", "surfaceChanged", "surfaceCreated", "surfaceDestroyed"});
        sFilterMethodMap_APP.put("CameraAssist.java", new String[]{"stopPreviewNotify", "startPreviewNotify"});
        sFilterMethodMap_APP.put("ImageUtils.java", new String[]{"getValue"});
        sFilterMethodMap_APP.put("ToastUtils.java", new String[]{"filter", "handlerContent"});
        sFilterMethodMap_APP.put("AnalysisRecordUtils.java", new String[]{"callback"});
        sFilterMethodMap_APP.put("AsyncExecutor.java", new String[]{"doInBackground", "onPostExecute", "onCanceled", "abort"});
        sFilterMethodMap_APP.put("ToastTintUtils.java", new String[]{"getTextColor", "getTextSize", "getBackgroundTintColor", "getBackground", "getMaxLines", "getEllipsize", "getTypeface", "getTintIconColor", "isTintIcon", "filter", "handlerContent"});
        sFilterMethodMap_APP.put("EditTextUtils.java", new String[]{"getMarkId", "isOperate", "setOperate", "getOperateState", "setOperateState", "getType", "setType", "beforeTextChanged", "onTextChanged", "afterTextChanged"});
        sFilterMethodMap_APP.put("AutoFocusAssist.java", new String[]{"onAutoFocus"});
        sFilterMethodMap_APP.put("PhoneUtils.java", new String[]{"printInfo"});
        sFilterMethodMap_APP.put("ROMUtils.java", new String[]{"getName", "getVersion", "toString"});
        sFilterMethodMap_APP.put("DialogUtils.java", new String[]{"onLeftButton", "onRightButton", "onDismiss", "onSingleChoiceItems", "onPositiveButton", "onCancel", "onMultiChoiceItems"});
        sFilterMethodMap_APP.put("SnackbarUtils.java", new String[]{"getRootGravity", "setRootGravity", "getRootCornerRadius", "setRootCornerRadius", "getRootBackgroundTintColor", "setRootBackgroundTintColor", "getRootBackground", "setRootBackground", "getRootMargin", "setRootMargin", "getRootAlpha", "setRootAlpha", "getTextGravity", "setTextGravity", "getTextColor", "setTextColor", "getTextSize", "setTextSize", "getTextMaxLines", "setTextMaxLines", "getTextEllipsize", "setTextEllipsize", "getTextTypeface", "setTextTypeface", "getTextPadding", "setTextPadding", "getActionGravity", "setActionGravity", "getActionColor", "setActionColor", "getActionSize", "setActionSize", "getActionPadding", "setActionPadding", "getActionCornerRadius", "setActionCornerRadius", "getActionBackgroundTintColor", "setActionBackgroundTintColor", "getActionBackground", "setActionBackground"});
        sFilterMethodMap_APP.put("ClickUtils.java", new String[]{"onClick", "doClick", "doInvalidClick", "doMultiClick", "getCount", "getInvalidCount", "getInvalidCycleNumber"});
        sFilterMethodMap_APP.put("ScreenshotUtils.java", new String[]{"onScreenshot", "onChange", "onChecker"});
        sFilterMethodMap_APP.put("NotificationUtils.java", new String[]{"getPendingIntent", "setPendingIntent", "getIcon", "setIcon", "getTicker", "setTicker", "getTitle", "setTitle", "getContent", "setContent", "isAutoCancel", "setAutoCancel", "getVibratePattern", "setVibratePattern", "getLightPattern", "setLightPattern", "getChannel", "setChannel", "callback"});

        // ==========
        // = Common =
        // ==========

        sFilterMethodMap_APP.put("FileBreadthFirstSearchUtils.java", new String[]{"isHandlerFile", "isAddToList", "onEndListener"});
        sFilterMethodMap_APP.put("FileDepthFirstSearchUtils.java", new String[]{"isHandlerFile", "isAddToList", "onEndListener"});
        sFilterMethodMap_APP.put("FileUtils.java", new String[]{"onReplace", "getSubFiles"});
        sFilterMethodMap_APP.put("FileRecordUtils.java", new String[]{"callback"});
        sFilterMethodMap_APP.put("HttpURLConnectionUtils.java", new String[]{"onResponse", "onFail"});
        sFilterMethodMap_APP.put("TimeKeeper.java", new String[]{"onEnd"});
        sFilterMethodMap_APP.put("TypeUtils.java", new String[]{"getActualTypeArguments", "getOwnerType", "getRawType", "equals", "hashCode"});
        sFilterMethodMap_APP.put("CollectionUtils.java", new String[]{"put", "create"});
        sFilterMethodMap_APP.put("ScaleUtils.java", new String[]{"getXYx", "getXY", "compareTo"});
        sFilterMethodMap_APP.put("ColorUtils.java", new String[]{"toString"});
        sFilterMethodMap_APP.put("KeyValue.java", new String[]{"toString"});
        sFilterMethodMap_APP.put("CalendarUtils.java", new String[]{"compareTo", "toString", "hook"});

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