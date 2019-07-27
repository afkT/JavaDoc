package javadoc.dev_utils.assist;

import javadoc.Utils;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * detail: 包目录结构生成
 * @author Ttt
 */
public final class PackageCatalog {

    private PackageCatalog() {
    }

// 生成参考如下
//```
//- dev.utils          | 根目录
//   - app             | APP 相关工具类
//      - anim         | 动画工具类
//      - assist       | 辅助类
//         - manager   | 管理器 如: TimerManager
//      - cache        | 缓存工具类
//      - camera1      | 摄像头相关 android.hardware.Camera
//      - image        | 图片相关处理
//      - info         | APP 信息、PackageInfo 等
//      - logger       | 日志库 DevLogger
//      - permission   | 权限工具类
//      - player       | 多媒体 ( 视频、音频 ) 播放封装
//      - share        | SharedPreferences 封装
//      - toast        | Toast
//         - toaster   | Toaster 处理无通知权限
//      - wifi         | Wifi、热点工具类
//   - common          | Java 工具类, 不依赖 android api
//      - assist       | 各种快捷辅助类
//         - search    | 搜索相关 ( 文件搜索等 )
//      - cipher       | 编 / 解码工具类
//      - encrypt      | 加密工具类
//      - random       | 随机概率算法工具类
//      - thread       | 线程相关
//      - validator    | 数据校验工具类
//```

    // ====================
    // = 目录层级计算回调 =
    // ====================

    /**
     * detail: 文件目录层级回调
     * @author Ttt
     */
    private interface CatalogCallback {

        /**
         * 回调通知
         * @param name       目录名
         * @param lineNumber 行数
         * @param linkTag    锚链接 TAG 标记
         */
        void callback(String name, int lineNumber, String linkTag);
    }

    // ======================
    // = 文件目录遍历实体类 =
    // ======================

    /**
     * detail: 目录实体类
     * @author Ttt
     */
    private static class Catalog {

        // 文件夹对象
        private File cataFile;
        // 文件夹内的子文件列表
        private ArrayList<Catalog> listCataLogs = new ArrayList<>();

        /**
         * 构造函数
         * @param file  文件夹对象
         * @param lists 文件夹内的子文件列表
         */
        public Catalog(File file, ArrayList<Catalog> lists) {
            this.cataFile = file;
            this.listCataLogs = lists;
        }

        /**
         * 获取文件夹对象
         * @return {@link File}
         */
        public File getCataFile() {
            return cataFile;
        }

        /**
         * 获取文件夹内的子文件列表
         * @return {@link ArrayList}
         */
        public ArrayList<Catalog> getListCataLogs() {
            return listCataLogs;
        }
    }

    /**
     * 获取文件夹目录列表
     * @param path            文件路径
     * @param catalogCallback 目录回调通知
     * @return 文件夹目录列表集合
     */
    private static ArrayList<Catalog> getFolderLists(final String path, final CatalogCallback catalogCallback) {
        ArrayList<Catalog> lists = new ArrayList<>();
        // 获取文件路径
        File baseFile = new File(path);
        // 获取子文件
        File[] files = baseFile.listFiles();
        for (File file : files) {
            // 获取文件名
            String name = file.getName();
            // 属于文件夹才处理
            if (file.isDirectory()) {
                Catalog catalog = new Catalog(file, getFolderLists(file.getAbsolutePath(), catalogCallback));
                lists.add(catalog);

                // 触发回调
                if (catalogCallback != null) {
                    // lineNumber 固定传 1 只是为了增加默认空格间距
                    catalogCallback.callback(name, 1, name + "." + name);
                }
            }
        }
        return lists;
    }

    // ============
    // = 内部方法 =
    // ============

    // 目录信息最大长度
    private static int sMaxLength = 0;

    /**
     * 计算目录最大长度
     * @param isAnchor    是否增加锚链接
     * @param packageName 包名
     * @param name        目录名
     * @param lineNumber  行数
     * @param linkTag     锚链接 TAG 标记
     */
    private static void calculateMaxLength(final boolean isAnchor, final String packageName,
                                           final String name, final int lineNumber, final String linkTag) {
        StringBuffer buffer = new StringBuffer();
        // 添加目录
        buffer.append(createCatelog(isAnchor, packageName, name, lineNumber, linkTag));
        // 获取长度
        int length = buffer.toString().length();
        // 判断长度 => 大于最大长度, 则重新设置
        if ((length + 6) >= sMaxLength) {
            sMaxLength = length + 6;
        }
    }

    /**
     * 创建目录信息
     * @param isAnchor    是否增加锚链接
     * @param packageName 包名
     * @param name        目录名
     * @param lineNumber  行数
     * @param linkTag     锚链接 TAG 标记
     * @return 目录信息
     */
    private static String createCatelog(final boolean isAnchor, final String packageName,
                                        final String name, final int lineNumber, final String linkTag) {
        StringBuffer buffer = new StringBuffer();
        if (isAnchor) {
            // 添加空格
            buffer.append(Utils.appendSpace(lineNumber * 3));
            // 打印目录
            buffer.append("- [" + name + "]");
            // 增加锚
            buffer.append("(#" + (packageName + linkTag).replaceAll("\\.", "") + ")");
        } else {
            // 添加空格
            buffer.append(Utils.appendSpace(lineNumber * 3));
            // 打印目录
            buffer.append("- " + name);
        }
        return buffer.toString();
    }

    /**
     * 创建目录行
     * @param isAnchor    是否增加锚链接
     * @param packageName 包名
     * @param name        目录名
     * @param lineNumber  行数
     * @param linkTag     锚链接 TAG 标记
     * @param mapCatelog  对应目录的注释
     * @return 目录行信息
     */
    private static String createCataLogLine(final boolean isAnchor, final String packageName,
                                            final String name, final int lineNumber, final String linkTag,
                                            final HashMap<String, String> mapCatelog) {
        StringBuffer buffer = new StringBuffer();
        // 添加目录
        buffer.append(createCatelog(isAnchor, packageName, name, lineNumber, linkTag));
        // 设置间隔长度
        buffer.append(Utils.appendSpace(sMaxLength - buffer.toString().length()));
        // 添加 间隔 |
        buffer.append("| " + mapCatelog.get(linkTag));
        // 返回处理后的目录行
        return buffer.toString();
    }

    /**
     * 递归目录拼接目录列表信息
     * @param buffer      拼接 Buffer
     * @param lists       目录列表
     * @param isAnchor    是否增加锚链接
     * @param packageName 包名
     * @param lineNumber  行数
     * @param linkTag     锚链接 TAG 标记
     * @param mapCatelog  对应目录的注释
     */
    private static void forCatelog(final StringBuffer buffer, final ArrayList<Catalog> lists,
                                   final boolean isAnchor, final String packageName,
                                   final int lineNumber, final String linkTag,
                                   final HashMap<String, String> mapCatelog) {
        // 循环遍历
        for (int i = 0, len = lists.size(); i < len; i++) {
            // 获取目录
            Catalog catalog = lists.get(i);
            // 获取目录名
            String name = catalog.getCataFile().getName();
            // 进行换行
            buffer.append("\n");
            // 添加目录行
            buffer.append(createCataLogLine(isAnchor, packageName, name, lineNumber,
                    linkTag + "." + name, mapCatelog));
            // 判断是否存在子文件夹
            if (catalog.getListCataLogs().size() != 0) {
                forCatelog(buffer, catalog.getListCataLogs(), isAnchor, packageName,
                        lineNumber + 1, linkTag + "." + name, mapCatelog);
            }
        }
    }

    // ================
    // = 对外公开方法 =
    // ================

    /**
     * 创建目录信息
     * @param isAnchor    是否增加锚链接
     * @param path        文件路径
     * @param packageName 包名
     * @param mapCatelog  对应目录的注释
     * @return 目录信息
     */
    public static String apiCatalog(final boolean isAnchor, final String path, final String packageName,
                                    final HashMap<String, String> mapCatelog) {

        // 拼接信息
        StringBuffer buffer = new StringBuffer();
        // 获取文件夹列表
        ArrayList<Catalog> lists = getFolderLists(path, new CatalogCallback() {
            @Override
            public void callback(String name, int lineNumber, String linkTag) {
                // 计算目录最大长度
                calculateMaxLength(isAnchor, packageName, name, lineNumber, linkTag);
            }
        });
        // 默认头部
        String head = "- " + packageName;
        // 判断是否增加锚链接处理
        if (isAnchor) {
            buffer.append("\n");
        } else {
            buffer.append("```\n");
        }
        // 增加根目录
        buffer.append(head + Utils.appendSpace(sMaxLength - head.length()) + "| " + mapCatelog.get(packageName));
        // 递归循环目录
        forCatelog(buffer, lists, isAnchor, packageName, 1, "", mapCatelog);
        // 判断是否增加锚链接处理
        if (isAnchor) {
            buffer.append("\n\n");
        } else {
            buffer.append("\n```\n");
        }
        // 返回数据
        return buffer.toString();
    }
}