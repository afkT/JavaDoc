package other.catalog;

/**
 * detail: 目录生成 Main 方法
 * @author Ttt
 */
final class CatalogMain {

    public static void main(String[] args) {
        System.out.println();

        // 生成 Android 项目目录结构
        String androidCatelog = PackageCatalog.apiCatalog(false, ProjectConfig.ANDROID_LOCAL_PATH,
                ProjectConfig.ANDROID_PACKAGE, ProjectConfig.sAndroidCatelogMap);
        // 打印 Android 项目目录结构
        System.out.println(androidCatelog);

        System.out.println();
        System.out.println();

        // 生成 Java 项目目录结构
        String javaCatelog = PackageCatalog.apiCatalog(false, ProjectConfig.JAVA_LOCAL_PATH,
                ProjectConfig.JAVA_PACKAGE, ProjectConfig.sJavaCatelogMap);
        // 打印 Java 项目目录结构
        System.out.println(javaCatelog);

        System.out.println();
        System.out.println();

        // 生成 DevUtils 项目目录结构
        String devUtilsCatelog = PackageCatalog.apiCatalog(false, ProjectConfig.DEV_UTILS_LOCAL_PATH,
                ProjectConfig.DEV_UTILS_PACKAGE, ProjectConfig.sDevUtilsCatelogMap);
        // 打印 DevUtils 项目目录结构
        System.out.println(devUtilsCatelog);
    }
}
