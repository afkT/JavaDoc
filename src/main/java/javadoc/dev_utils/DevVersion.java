package javadoc.dev_utils;

import java.io.File;
import java.util.Properties;

import dev.utils.common.FileIOUtils;
import dev.utils.common.StringUtils;

/**
 * detail: Dev 系列库版本读取
 * @author Ttt
 */
final class DevVersion {

    private DevVersion() {
    }

    // ==========
    // = 版本信息 =
    // ==========

    // DevApp 版本号
    static final String DEV_APP_VERSION;
    // DevAssist 版本号
    static final String DEV_ASSIST_VERSION;
    // DevBase 版本号
    static final String DEV_BASE_VERSION;
    // DevBaseMVVM 版本号
    static final String DEV_BASE_MVVM_VERSION;
    // DevEngine 版本号
    static final String DEV_ENGINE_VERSION;
    // DevSimple 版本号
    static final String DEV_SIMPLE_VERSION;
    // DevWidget 版本号
    static final String DEV_WIDGET_VERSION;
    // DevRetrofit 版本号
    static final String DEV_RETROFIT_VERSION;
    // DevHttpManager 版本号
    static final String DEV_HTTP_MANAGER_VERSION;
    // DevHttpCapture 版本号
    static final String DEV_HTTP_CAPTURE_VERSION;
    // DevEnvironment 版本号
    static final String DEV_ENVIRONMENT_VERSION;
    // DevDeprecated 版本号
    static final String DEV_DEPRECATED_VERSION;
    // DevJava 版本号
    static final String DEV_JAVA_VERSION;

    // ==========
    // = 内部逻辑 =
    // ==========

    static {
        File versionsFile = new File(
                System.getProperty("user.dir"),
                "versions.gradle"
        );
        // 版本配置属性
        Properties prop = new Properties();
        try {
            prop.load(FileIOUtils.getFileInputStream(versionsFile));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // ===============
        // = 初始化版本信息 =
        // ===============

        // DevApp 版本号
        DEV_APP_VERSION = getProperty(
                prop, "dev_app_versionName"
        );
        // DevAssist 版本号
        DEV_ASSIST_VERSION = getProperty(
                prop, "dev_assist_versionName"
        );
        // DevBase 版本号
        DEV_BASE_VERSION = getProperty(
                prop, "dev_base_versionName"
        );
        // DevBaseMVVM 版本号
        DEV_BASE_MVVM_VERSION = getProperty(
                prop, "dev_base_mvvm_versionName"
        );
        // DevEngine 版本号
        DEV_ENGINE_VERSION = getProperty(
                prop, "dev_engine_versionName"
        );
        // DevSimple 版本号
        DEV_SIMPLE_VERSION = getProperty(
                prop, "dev_simple_versionName"
        );
        // DevWidget 版本号
        DEV_WIDGET_VERSION = getProperty(
                prop, "dev_widget_versionName"
        );
        // DevRetrofit 版本号
        DEV_RETROFIT_VERSION = getProperty(
                prop, "dev_retrofit_versionName"
        );
        // DevHttpManager 版本号
        DEV_HTTP_MANAGER_VERSION = getProperty(
                prop, "dev_http_manager_versionName"
        );
        // DevHttpCapture 版本号
        DEV_HTTP_CAPTURE_VERSION = getProperty(
                prop, "dev_http_capture_versionName"
        );
        // DevEnvironment 版本号
        DEV_ENVIRONMENT_VERSION = getProperty(
                prop, "dev_environment_version"
        );
        // DevDeprecated 版本号
        DEV_DEPRECATED_VERSION = getProperty(
                prop, "dev_deprecated_versionName"
        );
        // DevJava 版本号
        DEV_JAVA_VERSION = getProperty(
                prop, "dev_java_version"
        );
    }

    // 未知版本默认值
    private static final String UNKNOWN = "x.y.z";

    /**
     * 获取对应 Key 版本信息
     * @param prop 版本配置属性
     * @param key  Key
     * @return 对应 Key 版本信息
     */
    private static String getProperty(
            final Properties prop,
            final String key
    ) {
        String version = prop.getProperty(key, UNKNOWN);
        version = StringUtils.clearSEWiths(version, ",");
        version = StringUtils.clearSEWiths(version, "\"");
        return version;
    }
}