package javadoc.dev_utils;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

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
    public static final String API_FILE_SAVE_PATH         = JAVADOC_PROJECT_PATH + "/API";
    // Lib 文件保存路径
    public static final String API_LIB_FILE_SAVE_PATH     = API_FILE_SAVE_PATH + "/lib";
    // Android 项目文件夹路径
    public static final String PROJECT_LOCAL_PATH         = "../../AndroidStudioProjects";
    // DevUtils 项目名
    public static final String DEV_UTILS_PROJECT_NAME     = "DevUtils";
    // DevUtils 项目路径
    public static final String DEV_UTILS_PROJECT_PATH     = PROJECT_LOCAL_PATH + File.separator + DEV_UTILS_PROJECT_NAME;
    // DevComponent 项目名
    public static final String DEV_COMPONENT_PROJECT_NAME = "DevComponent";
    // DevComponent 项目路径
    public static final String DEV_COMPONENT_PROJECT_PATH = PROJECT_LOCAL_PATH + File.separator + DEV_COMPONENT_PROJECT_NAME;

    // 包目录名
    public static final String DEV_PACKAGE            = "dev.utils";
    // 作者 Github 地址
    public static final String GITHUB_AUTHOR_URL      = "https://github.com/afkT";
    // README API 文件名
    public static final String README_FILE_NAME       = "README.md";
    // API 占位符常量 【API_PLACEHOLDER_FORMAT】
    public static final String API_PLACEHOLDER_FORMAT = "【API_PLACEHOLDER_FORMAT】";

    // ============
    // = DevUtils =
    // ============

    // DevUtils Readme 文件保存路径
    public static final String DEV_UTILS_README_FILE_SAVE_PATH   = API_FILE_SAVE_PATH + File.separator;
    // DevUtils Template Readme
    public static final String DEV_UTILS_README_TEMPLATE         = JAVADOC_TEMPLATE_PACKAGE_PATH + "/Dev_README.md";
    // DevUtils 项目详情 Template Readme
    public static final String DEV_UTILS_README_PROJECT_TEMPLATE = JAVADOC_TEMPLATE_PACKAGE_PATH + "/DEV_README_PROJECT.md";

    // DevUtils 项目详情 Readme fileName
    public static final String README_PROJECT_FILE_NAME = "README_PROJECT.md";

    // ====================
    // = DevApp lib 文件夹 =
    // ====================

    // DevUtils Lib Publish Template Readme
    public static final String DEV_UTILS_LIB_PUBLISH_TEMPLATE = JAVADOC_TEMPLATE_PACKAGE_PATH + "/DEV_LIB_PUBLISH.md";
    // DevUtils Lib Template Readme
    public static final String DEV_UTILS_LIB_TEMPLATE         = JAVADOC_TEMPLATE_PACKAGE_PATH + "/DEV_LIB_README.md";

    // DevUtils Lib Publish fileName
    public static final String README_LIB_PUBLISH_FILE_NAME = "/lib/publish.md";
    // DevUtils Lib Readme fileName
    public static final String README_LIB_FILE_NAME         = "/lib/README.md";

    // ==========
    // = DevApp =
    // ==========

    // DevApp 版本号
    public static final String DEV_APP_VERSION            = DevVersion.DEV_APP_VERSION;
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
    public static final String DEV_ASSIST_VERSION            = DevVersion.DEV_ASSIST_VERSION;
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
    public static final String DEV_BASE_VERSION            = DevVersion.DEV_BASE_VERSION;
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

    // =============
    // = DevEngine =
    // =============

    // DevEngine 版本号
    public static final String DEV_ENGINE_VERSION            = DevVersion.DEV_ENGINE_VERSION;
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

    // =============
    // = DevSimple =
    // =============

    // DevSimple 版本号
    public static final String DEV_SIMPLE_VERSION = DevVersion.DEV_SIMPLE_VERSION;

    // =============
    // = DevWidget =
    // =============

    // DevWidget 版本号
    public static final String DEV_WIDGET_VERSION            = DevVersion.DEV_WIDGET_VERSION;
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

    // ===============
    // = DevRetrofit =
    // ===============

    // DevRetrofit 版本号
    public static final String DEV_RETROFIT_VERSION            = DevVersion.DEV_RETROFIT_VERSION;
    // 包目录名
    public static final String DEV_RETROFIT_PACKAGE            = "dev";
    // DevRetrofit 文件路径
    public static final String DEV_RETROFIT_PATH               = PROJECT_LOCAL_PATH + "/DevUtils/lib/HttpRequest/DevRetrofit/src/main/java/dev/";
    // DevRetrofit GitHub 项目文件路径
    public static final String DEV_RETROFIT_GITHUB_URL         = GITHUB_AUTHOR_URL + "/DevUtils/blob/master/lib/HttpRequest/DevRetrofit/src/main/java/dev";
    // DevRetrofit API 文件保存路径
    public static final String DEV_RETROFIT_API_FILE_SAVE_PATH = API_LIB_FILE_SAVE_PATH + "/HttpRequest/DevRetrofit/";
    // DevRetrofit Template Readme
    public static final String DEV_RETROFIT_TEMPLATE           = JAVADOC_TEMPLATE_PACKAGE_PATH + "/DevRetrofit_README.md";

    // ==================
    // = DevHttpManager =
    // ==================

    // DevHttpManager 版本号
    public static final String DEV_HTTP_MANAGER_VERSION            = DevVersion.DEV_HTTP_MANAGER_VERSION;
    // 包目录名
    public static final String DEV_HTTP_MANAGER_PACKAGE            = "dev";
    // DevHttpManager 文件路径
    public static final String DEV_HTTP_MANAGER_PATH               = PROJECT_LOCAL_PATH + "/DevUtils/lib/HttpRequest/DevHttpManager/src/main/java/dev/";
    // DevHttpManager GitHub 项目文件路径
    public static final String DEV_HTTP_MANAGER_GITHUB_URL         = GITHUB_AUTHOR_URL + "/DevUtils/blob/master/lib/HttpRequest/DevHttpManager/src/main/java/dev";
    // DevHttpManager API 文件保存路径
    public static final String DEV_HTTP_MANAGER_API_FILE_SAVE_PATH = API_LIB_FILE_SAVE_PATH + "/HttpRequest/DevHttpManager/";
    // DevHttpManager Template Readme
    public static final String DEV_HTTP_MANAGER_TEMPLATE           = JAVADOC_TEMPLATE_PACKAGE_PATH + "/DevHttpManager_README.md";

    // ==================
    // = DevHttpCapture =
    // ==================

    // DevHttpCapture 版本号
    public static final String DEV_HTTP_CAPTURE_VERSION            = DevVersion.DEV_HTTP_CAPTURE_VERSION;
    // DevHttpCapture API 文件保存路径
    public static final String DEV_HTTP_CAPTURE_API_FILE_SAVE_PATH = API_LIB_FILE_SAVE_PATH + "/HttpCapture/";
    // DevHttpCapture Template Readme
    public static final String DEV_HTTP_CAPTURE_TEMPLATE           = JAVADOC_TEMPLATE_PACKAGE_PATH + "/DevHttpCapture_README.md";

    // ==================
    // = DevEnvironment =
    // ==================

    // DevEnvironment 版本号
    public static final String DEV_ENVIRONMENT_VERSION            = DevVersion.DEV_ENVIRONMENT_VERSION;
    // DevEnvironment API 文件保存路径
    public static final String DEV_ENVIRONMENT_API_FILE_SAVE_PATH = API_LIB_FILE_SAVE_PATH + "/Environment/";
    // DevEnvironment Template Readme
    public static final String DEV_ENVIRONMENT_TEMPLATE           = JAVADOC_TEMPLATE_PACKAGE_PATH + "/DevEnvironment_README.md";

    // =================
    // = DevDeprecated =
    // =================

    // DevDeprecated 版本号
    public static final String DEV_DEPRECATED_VERSION            = DevVersion.DEV_DEPRECATED_VERSION;
    // DevDeprecated 文件路径
    public static final String DEV_DEPRECATED_PATH               = PROJECT_LOCAL_PATH + "/DevUtils/lib/DevDeprecated/src/main/java/dev";
    // DevDeprecated Utils 文件路径
    public static final String DEV_DEPRECATED_UTILS_PATH         = DEV_DEPRECATED_PATH + "/utils/";
    // DevDeprecated GitHub 项目文件路径
    public static final String DEV_DEPRECATED_GITHUB_URL         = GITHUB_AUTHOR_URL + "/DevUtils/blob/master/lib/DevDeprecated/src/main/java/dev/utils/";
    // DevDeprecated API 文件保存路径
    public static final String DEV_DEPRECATED_API_FILE_SAVE_PATH = API_LIB_FILE_SAVE_PATH + "/DevDeprecated/";
    // DevDeprecated Template Readme
    public static final String DEV_DEPRECATED_TEMPLATE           = JAVADOC_TEMPLATE_PACKAGE_PATH + "/DevDeprecated_README.md";

    // ===========
    // = DevJava =
    // ===========

    // DevJava 版本号
    public static final String DEV_JAVA_VERSION            = DevVersion.DEV_JAVA_VERSION;
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

    // ============
    // = DevOther =
    // ============

    // 包目录名
    public static final String DEV_OTHER_PACKAGE            = "";
    // DevOther 文件路径
    public static final String DEV_OTHER_PATH               = PROJECT_LOCAL_PATH + "/DevUtils-repo/lib/LocalModules/DevOther/src/main/java/";
    // DevOther GitHub 项目文件路径
    public static final String DEV_OTHER_GITHUB_URL         = GITHUB_AUTHOR_URL + "/DevUtils-repo/blob/main/lib/LocalModules/DevOther/src/main/java/";
    // DevOther API 文件保存路径
    public static final String DEV_OTHER_API_FILE_SAVE_PATH = API_LIB_FILE_SAVE_PATH + "/LocalModules/DevOther/";
    // DevOther Template Readme
    public static final String DEV_OTHER_TEMPLATE           = JAVADOC_TEMPLATE_PACKAGE_PATH + "/DevOther_README.md";

    // ===============
    // = DevStandard =
    // ===============

    // DevStandard 文件路径
    public static final String DEV_STANDARD_PATH = PROJECT_LOCAL_PATH + "/DevUtils-repo/interesting/DevStandard/src/main/java/dev/";

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

    // =============
    // = DevEngine =
    // =============

    // 包名目录注释
    public static final HashMap<String, String> sCatalogMap_Engine = new HashMap<>();

    // =============
    // = DevWidget =
    // =============

    // 包名目录注释
    public static final HashMap<String, String>   sCatalogMap_Widget      = new HashMap<>();
    // 忽略不保存的类
    public static final HashSet<String>           sFilterClassSet_Widget  = new HashSet<>();
    // 忽略不保存的方法
    public static final HashMap<String, String[]> sFilterMethodMap_Widget = new HashMap<>();

    // ===============
    // = DevRetrofit =
    // ===============

    // 包名目录注释
    public static final HashMap<String, String> sCatalogMap_Retrofit = new HashMap<>();

    // ==================
    // = DevHttpManager =
    // ==================

    // 包名目录注释
    public static final HashMap<String, String> sCatalogMap_HttpManager = new HashMap<>();

    // =================
    // = DevDeprecated =
    // =================

    // 包名目录注释
    public static final HashMap<String, String>   sCatalogMap_Deprecated      = new HashMap<>();
    // 忽略不保存的类
    public static final HashSet<String>           sFilterClassSet_Deprecated  = new HashSet<>();
    // 忽略不保存的方法
    public static final HashMap<String, String[]> sFilterMethodMap_Deprecated = new HashMap<>();

    // ============
    // = DevOther =
    // ============

    // 包名目录注释
    public static final HashMap<String, String>   sCatalogMap_Other      = new HashMap<>();
    // 忽略不保存的类
    public static final HashSet<String>           sFilterClassSet_Other  = new HashSet<>();
    // 忽略不保存的方法
    public static final HashMap<String, String[]> sFilterMethodMap_Other = new HashMap<>();

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
        sCatalogMap_APP.put(".app.activity_result", "Activity Result API");
        sCatalogMap_APP.put(".app.anim", "动画工具类");

        sCatalogMap_APP.put(".app.assist", "辅助类");
        sCatalogMap_APP.put(".app.assist.exif", "图片 EXIF 读写辅助类");
        sCatalogMap_APP.put(".app.assist.floating", "悬浮窗实现方案辅助类");
        sCatalogMap_APP.put(".app.assist.lifecycle", "Activity 生命周期监听辅助类");
        sCatalogMap_APP.put(".app.assist.lifecycle.current", "当前 Activity、Fragment 生命周期辅助类");
        sCatalogMap_APP.put(".app.assist.lifecycle.fragment", "Fragment 生命周期辅助类");
        sCatalogMap_APP.put(".app.assist.record", "文件记录分析类");
        sCatalogMap_APP.put(".app.assist.url", "Url 携带信息解析");

        sCatalogMap_APP.put(".app.cache", "缓存工具类");
        sCatalogMap_APP.put(".app.helper", "功能 Helper 辅助类");
        sCatalogMap_APP.put(".app.helper.dev", "Dev 工具类链式调用 Helper 类");
        sCatalogMap_APP.put(".app.helper.flow", "流式 ( 链式 ) 连接 Helper 类");
        sCatalogMap_APP.put(".app.helper.quick", "简化链式设置 View Quick Helper 类");
        sCatalogMap_APP.put(".app.helper.version", "Android 版本适配 Helper 类");
        sCatalogMap_APP.put(".app.helper.view", "View 链式调用快捷设置 Helper 类");
        sCatalogMap_APP.put(".app.image", "图片相关处理");
        sCatalogMap_APP.put(".app.info", "APP 信息、PackageInfo 等");
        sCatalogMap_APP.put(".app.logger", "日志库 DevLogger");
        sCatalogMap_APP.put(".app.player", "多媒体 ( 视频、音频 ) 播放封装");
        sCatalogMap_APP.put(".app.timer", "定时器");
        sCatalogMap_APP.put(".app.share", "SharedPreferences 封装");

        // ==============
        // = Common 目录 =
        // ==============

        sCatalogMap_APP.put(".common", "Java 工具类, 不依赖 android api");
        sCatalogMap_APP.put(".common.able", "通用接口定义");
        sCatalogMap_APP.put(".common.assist", "各种快捷辅助类");
        sCatalogMap_APP.put(".common.assist.record", "文件记录分析类");
        sCatalogMap_APP.put(".common.assist.search", "搜索相关 ( 文件搜索等 )");
        sCatalogMap_APP.put(".common.assist.url", "Url 携带信息解析");
        sCatalogMap_APP.put(".common.cipher", "编 / 解码工具类");
        sCatalogMap_APP.put(".common.comparator", "排序比较器");
        sCatalogMap_APP.put(".common.comparator.sort", "各种类型比较器排序实现");
        sCatalogMap_APP.put(".common.encrypt", "加密工具类");
        sCatalogMap_APP.put(".common.file", "文件分片相关");
        sCatalogMap_APP.put(".common.format", "格式化相关");
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
        sCatalogMap_Assist.put(".engine.debug", "Debug 编译辅助开发 Engine");
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
        sCatalogMap_Assist.put(".engine.toast", "Toast Engine 吐司提示");
        sCatalogMap_Assist.put(".function", "快捷方法执行相关");

        // ===========
        // = DevBase =
        // ===========

        sCatalogMap_Base.put("dev.base", "根目录");
        sCatalogMap_Base.put(".core", "核心实现代码");
        sCatalogMap_Base.put(".core.arch", "架构封装");
        sCatalogMap_Base.put(".core.arch.databinding", "ViewDataBinding 基类");
        sCatalogMap_Base.put(".core.arch.mvp", "MVP 基类");
        sCatalogMap_Base.put(".core.arch.mvvm", "MVVM 基类");
        sCatalogMap_Base.put(".core.interfaces", "基类开放接口包");
        sCatalogMap_Base.put(".simple", "简化敏捷开发基类");
        sCatalogMap_Base.put(".simple.contracts", "专属契约层");
        sCatalogMap_Base.put(".simple.contracts.binding", "Binding 相关代码");
        sCatalogMap_Base.put(".simple.contracts.factory", "Simple 简化开发工厂代码");
        sCatalogMap_Base.put(".simple.contracts.lifecycle", "生命周期监听管理");
        sCatalogMap_Base.put(".simple.contracts.viewmodel", "ViewModel 代码");
        sCatalogMap_Base.put(".simple.extensions", "扩展实现代码");
        sCatalogMap_Base.put(".simple.mvvm", "MVVM 简化开发封装");
        sCatalogMap_Base.put(".utils", "依赖工具包");
        sCatalogMap_Base.put(".utils.adapter", "RecyclerView Binding ViewHolder");
        sCatalogMap_Base.put(".utils.assist", "功能辅助类 ( 抽取通用代码 )");

        // =============
        // = DevEngine =
        // =============

        sCatalogMap_Engine.put("dev.engine", "根目录");
        sCatalogMap_Engine.put(".core", "核心实现代码");
        sCatalogMap_Engine.put(".core.analytics", "Analytics Engine 数据统计 ( 埋点 )");
        sCatalogMap_Engine.put(".core.barcode", "BarCode Engine 条形码、二维码处理");
        sCatalogMap_Engine.put(".core.barcode.listener", "条形码、二维码操作回调事件");
        sCatalogMap_Engine.put(".core.cache", "Cache Engine 有效期键值对缓存");
        sCatalogMap_Engine.put(".core.compress", "Image Compress Engine 图片压缩");
        sCatalogMap_Engine.put(".core.compress.listener", "图片压缩回调事件");
        sCatalogMap_Engine.put(".core.http", "Http Engine 网络请求");
        sCatalogMap_Engine.put(".core.image", "Image Engine 图片加载、下载、转格式等");
        sCatalogMap_Engine.put(".core.image.listener", "图片加载监听事件");
        sCatalogMap_Engine.put(".core.json", "JSON Engine 映射");
        sCatalogMap_Engine.put(".core.keyvalue", "KeyValue Engine 键值对存储");
        sCatalogMap_Engine.put(".core.log", "Log Engine 日志打印");
        sCatalogMap_Engine.put(".core.media", "Media Selector Engine 多媒体资源选择");
        sCatalogMap_Engine.put(".core.permission", "Permission Engine 权限申请");
        sCatalogMap_Engine.put(".core.push", "Push Engine 推送平台处理");
        sCatalogMap_Engine.put(".core.share", "Share Engine 分享平台处理");
        sCatalogMap_Engine.put(".core.share.listener", "分享回调事件");
        sCatalogMap_Engine.put(".core.storage", "Storage Engine 外部、内部文件存储");
        sCatalogMap_Engine.put(".core.storage.listener", "Storage 存储结果事件");
        sCatalogMap_Engine.put(".core.toast", "Toast Engine 吐司提示");
        sCatalogMap_Engine.put(".extensions", "Kotlin 扩展代码、函数实现");
        sCatalogMap_Engine.put(".extensions.analytics", "Analytics Engine 数据统计 ( 埋点 )");
        sCatalogMap_Engine.put(".extensions.barcode", "BarCode Engine 条形码、二维码处理");
        sCatalogMap_Engine.put(".extensions.barcode.listener", "条形码、二维码操作回调事件");
        sCatalogMap_Engine.put(".extensions.cache", "Cache Engine 有效期键值对缓存");
        sCatalogMap_Engine.put(".extensions.compress", "Image Compress Engine 图片压缩");
        sCatalogMap_Engine.put(".extensions.compress.listener", "图片压缩回调事件");
        sCatalogMap_Engine.put(".extensions.http", "Http Engine 网络请求");
        sCatalogMap_Engine.put(".extensions.image", "Image Engine 图片加载、下载、转格式等");
        sCatalogMap_Engine.put(".extensions.image.listener", "图片加载监听事件");
        sCatalogMap_Engine.put(".extensions.json", "JSON Engine 映射");
        sCatalogMap_Engine.put(".extensions.keyvalue", "KeyValue Engine 键值对存储");
        sCatalogMap_Engine.put(".extensions.log", "Log Engine 日志打印");
        sCatalogMap_Engine.put(".extensions.media", "Media Selector Engine 多媒体资源选择");
        sCatalogMap_Engine.put(".extensions.permission", "Permission Engine 权限申请");
        sCatalogMap_Engine.put(".extensions.push", "Push Engine 推送平台处理");
        sCatalogMap_Engine.put(".extensions.share", "Share Engine 分享平台处理");
        sCatalogMap_Engine.put(".extensions.share.listener", "分享回调事件");
        sCatalogMap_Engine.put(".extensions.storage", "Storage Engine 外部、内部文件存储");
        sCatalogMap_Engine.put(".extensions.storage.listener", "Storage 存储结果事件");
        sCatalogMap_Engine.put(".extensions.toast", "Toast Engine 吐司提示");

        // =============
        // = DevWidget =
        // =============

        sCatalogMap_Widget.put("dev", "根目录");
        sCatalogMap_Widget.put(".widget", "自定义 View 根目录");
        sCatalogMap_Widget.put(".widget.adjust", "自动调节高度 View");
        sCatalogMap_Widget.put(".widget.assist", "View 辅助类");
        sCatalogMap_Widget.put(".widget.custom", "自定义 View");
        sCatalogMap_Widget.put(".widget.decoration", "RecyclerView ItemDecoration");
        sCatalogMap_Widget.put(".widget.decoration.grid", "Grid ItemDecoration");
        sCatalogMap_Widget.put(".widget.decoration.linear", "Linear ItemDecoration");
        sCatalogMap_Widget.put(".widget.function", "需求功能 View");
        sCatalogMap_Widget.put(".widget.ui", "UI View");
        sCatalogMap_Widget.put(".widget.ui.radius", "圆角相关 View");
        sCatalogMap_Widget.put(".widget.ui.resize", "自适应高度 ImageView");
        sCatalogMap_Widget.put(".widget.ui.round", "圆角相关 View");
        sCatalogMap_Widget.put(".widget.utils", "工具类目录");

        // ===============
        // = DevRetrofit =
        // ===============

        sCatalogMap_Retrofit.put("dev", "根目录");
        sCatalogMap_Retrofit.put(".http", "基于 OkHttp 管理实现代码");
        sCatalogMap_Retrofit.put(".http.manager", "Retrofit 多 BaseUrl 管理");

        // ==================
        // = DevHttpManager =
        // ==================

        sCatalogMap_HttpManager.put("dev", "根目录");
        sCatalogMap_HttpManager.put(".http", "基于 OkHttp 管理实现代码");
        sCatalogMap_HttpManager.put(".http.manager", "Retrofit 多 BaseUrl 管理");
        sCatalogMap_HttpManager.put(".http.progress", "OkHttp 上传、下载进度监听");
        sCatalogMap_HttpManager.put(".http.progress.operation", "监听通知不同方式实现");

        // =================
        // = DevDeprecated =
        // =================

        sCatalogMap_Deprecated.put("dev.utils", "根目录");
        sCatalogMap_Deprecated.put(".app", "APP 相关工具类");
        sCatalogMap_Deprecated.put(".app.activity_result", "Activity Result API");
        sCatalogMap_Deprecated.put(".app.camera", "摄像头相关");
        sCatalogMap_Deprecated.put(".app.camera.camera1", "android.hardware.Camera ( Camera1 相关 )");
        sCatalogMap_Deprecated.put(".app.image", "图片相关处理");
        sCatalogMap_Deprecated.put(".app.permission", "权限工具类");
        sCatalogMap_Deprecated.put(".app.toast", "Toast");
        sCatalogMap_Deprecated.put(".app.toast.toaster", "Toaster 处理无通知权限");
        sCatalogMap_Deprecated.put(".app.wifi", "Wifi、热点工具类");

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
        sCatalogMap_Other.put(".java.dev.engine.media.luck_siege_lib", "LuckSiege PictureSelector Engine 实现");
        sCatalogMap_Other.put(".java.dev.engine.media.luck_siege_lib.listener", "LuckSiege PictureSelector Listener 实现");
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
        sCatalogMap_Other.put(".java.dev.other.retrofit_rxjava", "Retrofit RxJava 封装");
        sCatalogMap_Other.put(".java.dev.other.retrofit_rxjava.response", "请求响应解析");
        sCatalogMap_Other.put(".java.dev.other.retrofit_rxjava.subscriber", "请求响应处理");
        sCatalogMap_Other.put(".java.dev.other.work", "WorkManager Utils");
        sCatalogMap_Other.put(".java.dev.other.work.demo", "WorkManager 使用 Demo");

        sCatalogMap_Other.put(".ktx", "Kotlin 实现");
        sCatalogMap_Other.put(".ktx.dev", "根目录");
        sCatalogMap_Other.put(".ktx.dev.assist", "常用辅助类封装");
        sCatalogMap_Other.put(".ktx.dev.engine", "兼容 Engine");
        sCatalogMap_Other.put(".ktx.dev.engine.media", "Media Selector Engine 多媒体资源选择");
        sCatalogMap_Other.put(".ktx.dev.engine.media.luck_siege_lib", "LuckSiege PictureSelector Engine 实现");
        sCatalogMap_Other.put(".ktx.dev.engine.media.luck_siege_lib.listener", "LuckSiege PictureSelector Listener 实现");
        sCatalogMap_Other.put(".ktx.dev.other", "第三方库封装工具类");
        sCatalogMap_Other.put(".ktx.dev.other.retrofit_rxjava", "Retrofit RxJava 封装");
        sCatalogMap_Other.put(".ktx.dev.other.retrofit_rxjava.demo", "Retrofit RxJava Demo");
        sCatalogMap_Other.put(".ktx.dev.other.retrofit_rxjava.response", "请求响应解析");
        sCatalogMap_Other.put(".ktx.dev.other.retrofit_rxjava.subscriber", "请求响应处理");
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

        // ==========
        // = Common =
        // ==========

        sFilterClassSet_APP.add("Cipher.java");
        sFilterClassSet_APP.add("Decrypt.java");
        sFilterClassSet_APP.add("Encrypt.java");

        // =================
        // = DevDeprecated =
        // =================

        sFilterClassSet_Deprecated.add("IToast.java");
        sFilterClassSet_Deprecated.add("DefaultToastStyle.java");
        sFilterClassSet_Deprecated.add("WifiVo.java");

        // ============
        // = DevOther =
        // ============

        sFilterClassSet_Other.add("DataStoreUtils.kt");
        sFilterClassSet_Other.add("package-info.txt");
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
        sFilterMethodMap_APP.put("HandlerUtils.java", new String[]{"onEnd"});
        sFilterMethodMap_APP.put("OnLocationChangeListener.java", new String[]{"getLastKnownLocation", "onLocationChanged", "onStatusChanged"});
        sFilterMethodMap_APP.put("SizeUtils.java", new String[]{"onGetSize"});
        sFilterMethodMap_APP.put("KeyBoardUtils.java", new String[]{"onSoftInputChanged"});
        sFilterMethodMap_APP.put("DevMediaManager.java", new String[]{"onPrepared", "onCompletion", "onBufferingUpdate", "onSeekComplete", "onError", "onVideoSizeChanged", "isLooping", "setMediaConfig"});
        sFilterMethodMap_APP.put("DevVideoPlayerControl.java", new String[]{"onPrepared", "onCompletion", "onBufferingUpdate", "onSeekComplete", "onError", "onVideoSizeChanged", "isLooping", "setMediaConfig", "surfaceChanged", "surfaceCreated", "surfaceDestroyed"});
        sFilterMethodMap_APP.put("ImageUtils.java", new String[]{"getValue"});
        sFilterMethodMap_APP.put("AnalysisRecordUtils.java", new String[]{"callback"});
        sFilterMethodMap_APP.put("AsyncExecutor.java", new String[]{"doInBackground", "onPostExecute", "onCanceled", "abort"});
        sFilterMethodMap_APP.put("EditTextUtils.java", new String[]{"getMarkId", "isOperate", "setOperate", "getOperateState", "setOperateState", "getType", "setType", "beforeTextChanged", "onTextChanged", "afterTextChanged"});
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
        sFilterMethodMap_APP.put("StreamUtils.java", new String[]{"onStart", "onProgress", "onError", "onFinish", "onEnd"});
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

        // =================
        // = DevDeprecated =
        // =================

        sFilterMethodMap_Deprecated.put("AutoFocusAssist.java", new String[]{"onAutoFocus"});
        sFilterMethodMap_Deprecated.put("CameraAssist.java", new String[]{"stopPreviewNotify", "startPreviewNotify"});
        sFilterMethodMap_Deprecated.put("PermissionUtils.java", new String[]{"start", "onCreate", "onGranted", "onDenied"});
        sFilterMethodMap_Deprecated.put("ToastUtils.java", new String[]{"filter", "handlerContent"});
        sFilterMethodMap_Deprecated.put("ToastTintUtils.java", new String[]{"getTextColor", "getTextSize", "getBackgroundTintColor", "getBackground", "getMaxLines", "getEllipsize", "getTypeface", "getTintIconColor", "isTintIcon", "filter", "handlerContent"});
        sFilterMethodMap_Deprecated.put("WifiHotUtils.java", new String[]{"onStarted", "onStopped", "onFailed"});
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

    // ============
    // = 版本格式化 =
    // ============

    // 所有库名
    private static final List<String> sAllLibName = Arrays.asList(
            // DevApp - Android 工具类库
            "DevApp",
            // DevAssist - 封装逻辑代码, 实现多个快捷功能辅助类、以及 Engine 兼容框架等
            "DevAssist",
            // DevBase - Base ( Activity、Fragment ) MVP、MVVM 基类库
            "DevBase",
            // DevEngine - 第三方框架解耦、一键替换第三方库、同类库多 Engine 组件化混合使用
            "DevEngine",
            // DevSimple - 简单敏捷开发库
            "DevSimple",
            // DevWidget - 自定义 View UI 库
            "DevWidget",
            // DevRetrofit - Retrofit + Kotlin Coroutines 封装
            "DevRetrofit",
            // DevHttpManager - OkHttp 管理库 ( Retrofit 多 BaseUrl 管理、Progress 监听 )
            "DevHttpManager",
            // DevHttpCapture - OkHttp 抓包工具库
            "DevHttpCapture",
            // DevEnvironment - Android 环境配置切换库
            "DevEnvironment",
            // DevDeprecated - Dev 系列库弃用代码统一存储库
            "DevDeprecated",
            // DevJava - Java 工具类库 ( 不依赖 android api )
            "DevJava"
    );

    /**
     * 格式化全部版本处理
     * @param content 待格式化内容
     * @return 格式化后内容
     */
    public static String formatAllVersion(final String content) {
        String result = content;
        for (String value : sAllLibName) {
            result = formatVersion(result, value);
        }
        return result;
    }

    /**
     * 格式化版本处理
     * @param content 待格式化内容
     * @param tag     库名 Tag
     * @return 格式化后内容
     */
    private static String formatVersion(
            final String content,
            final String tag
    ) {
        String vn          = "【" + tag + "-vn】";
        String versionName = returnVersionName(tag);
        return content.replaceAll(vn, versionName);
    }

    /**
     * 返回库名对应库版本
     * @param tag 库名 Tag
     * @return 库名对应库版本
     */
    private static String returnVersionName(final String tag) {
        switch (tag) {
            // DevApp - Android 工具类库
            case "DevApp":
                return ApiConfig.DEV_APP_VERSION;
            // DevAssist - 封装逻辑代码, 实现多个快捷功能辅助类、以及 Engine 兼容框架等
            case "DevAssist":
                return ApiConfig.DEV_ASSIST_VERSION;
            // DevBase - Base ( Activity、Fragment ) MVP、MVVM 基类库
            case "DevBase":
                return ApiConfig.DEV_BASE_VERSION;
            // DevEngine - 第三方框架解耦、一键替换第三方库、同类库多 Engine 组件化混合使用
            case "DevEngine":
                return ApiConfig.DEV_ENGINE_VERSION;
            // DevSimple - 简单敏捷开发库
            case "DevSimple":
                return ApiConfig.DEV_SIMPLE_VERSION;
            // DevWidget - 自定义 View UI 库
            case "DevWidget":
                return ApiConfig.DEV_WIDGET_VERSION;
            // DevRetrofit - Retrofit + Kotlin Coroutines 封装
            case "DevRetrofit":
                return ApiConfig.DEV_RETROFIT_VERSION;
            // DevHttpManager - OkHttp 管理库 ( Retrofit 多 BaseUrl 管理、Progress 监听 )
            case "DevHttpManager":
                return ApiConfig.DEV_HTTP_MANAGER_VERSION;
            // DevHttpCapture - OkHttp 抓包工具库
            case "DevHttpCapture":
                return ApiConfig.DEV_HTTP_CAPTURE_VERSION;
            // DevEnvironment - Android 环境配置切换库
            case "DevEnvironment":
                return ApiConfig.DEV_ENVIRONMENT_VERSION;
            // DevDeprecated - Dev 系列库弃用代码统一存储库
            case "DevDeprecated":
                return ApiConfig.DEV_DEPRECATED_VERSION;
            // DevJava - Java 工具类库 ( 不依赖 android api )
            case "DevJava":
                return ApiConfig.DEV_JAVA_VERSION;
        }
        return null;
    }
}