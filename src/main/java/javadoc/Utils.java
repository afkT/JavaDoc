package javadoc;

import com.google.gson.GsonBuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import dev.utils.DevFinal;
import dev.utils.JCLogUtils;
import dev.utils.common.ArrayUtils;
import dev.utils.common.FileUtils;

/**
 * detail: 内部工具类
 * @author Ttt
 */
public final class Utils {

    private Utils() {
    }

    static {
        JCLogUtils.setPrintLog(true);
        JCLogUtils.setControlPrintLog(true);
//        JCLogUtils.setPrint(new JCLogUtils.Print() {
//            @Override
//            public void printLog(int logType, String tag, String message) {
//                System.out.println(tag + " : " + message);
//            }
//        });
    }

    /**
     * 获取文件列表
     * @param path 文件路径
     * @return 文件列表
     */
    public static List<File> getFileLists(final String path) {
        List<File> lists = new ArrayList<>();
        // 获取文件路径
        File baseFile = new File(path);
        // 获取子文件
        List<File> files = Utils.listFilesOrEmpty(baseFile);
        Utils.sortWindowsExplorerFileSimpleComparatorAsc(files);
        for (File file : files) {
            // 属于文件才处理
            if (file.isFile()) {
                lists.add(file);
            }
        }
        return lists;
    }

    /**
     * 获取文件目录列表
     * @param path 文件路径
     * @return 文件目录列表
     */
    public static List<File> getFileCatalogLists(final String path) {
        List<File> files = Utils.listFilesOrEmpty(path);
        Utils.sortWindowsExplorerFileSimpleComparatorAsc(files);
        return files;
    }

    /**
     * HashMap 排序
     * @param map {@link Map}
     * @return 排序后的 Map
     */
    public static Map<String, List<String>> sortHashMap(final Map<String, List<String>> map) {
        Map<String, List<String>> sortedMap = new LinkedHashMap<>();
        List<String>              list      = new ArrayList<>();
        Iterator<String>          item      = map.keySet().iterator();
        while (item.hasNext()) {
            list.add(item.next());
        }
        Collections.sort(list);
        Iterator<String> item2 = list.iterator();
        while (item2.hasNext()) {
            String key = item2.next();
            sortedMap.put(key, map.get(key));
        }
        return sortedMap;
    }

    /**
     * HashSet 排序
     * @param set {@link Set}
     * @return 排序后的 Set
     */
    public static Set<String> sortHashSet(final Set<String> set) {
        List<String>     list = new ArrayList<>();
        Iterator<String> item = set.iterator();
        while (item.hasNext()) {
            list.add(item.next());
        }
        Collections.sort(list);
        return new LinkedHashSet<>(list);
    }

    /**
     * 生成 Map 字符串
     * @param map     {@link HashMap}
     * @param mapName map 变量名
     * @return 生成指定格式字符串
     */
    public static String generateMapString(
            final HashMap<String, List<String>> map,
            final String mapName
    ) {
        StringBuilder builder = new StringBuilder();
        // HashMap 排序
        Map<String, List<String>> sortHashMap = sortHashMap(map);
        // 空格前缀
        String space = "        ";
        // 格式化字符串
        String format = space + "%s.put(\"%s\", ArrayUtils.asListArgs(%s));";
        // 循环处理
        for (String className : sortHashMap.keySet()) {
            List<String> lists = sortHashMap.get(className);
            // 格式化追加
            builder.append(String.format(format, mapName, className,
                    ArrayUtils.appendToString(lists.toArray(new String[]{}))));
            builder.append(DevFinal.SYMBOL.NEW_LINE);
        }
        // 用于生成 Config 特殊处理
        builder.delete(0, space.length());
        return builder.toString();
    }

    /**
     * 生成 Set 字符串
     * @param set     {@link HashSet}
     * @param mapName map 变量名
     * @return 生成指定格式字符串
     */
    public static String generateSetString(
            final Set<String> set,
            final String mapName
    ) {
        StringBuilder builder = new StringBuilder();
        // HashMap 排序
        Set<String> sortHashMap = sortHashSet(set);
        // 空格前缀
        String space = "        ";
        // 格式化字符串
        String format = space + "%s.remove(\"%s\");";
        // 循环处理
        for (String className : sortHashMap) {
            // 格式化追加
            builder.append(String.format(format, mapName, className));
            builder.append(DevFinal.SYMBOL.NEW_LINE);
        }
        // 用于生成 Config 特殊处理
        builder.delete(0, space.length());
        return builder.toString();
    }

    // ========
    // = Gson =
    // ========

    /**
     * 创建 GsonBuilder
     * @param serializeNulls 是否序列化null值
     * @return {@link GsonBuilder}
     */
    private static GsonBuilder createGson(final boolean serializeNulls) {
        final GsonBuilder builder = new GsonBuilder();
        if (serializeNulls) builder.serializeNulls();
        return builder;
    }

    /**
     * 转换 JSON 格式数据, 并且格式化
     * @param data         待转换对象
     * @param includeNulls 是否序列化null值
     * @return 格式化 JSON 数据
     */
    public static String toJsonFormat(
            final Object data,
            final boolean includeNulls
    ) {
        if (data != null) {
            try {
                // 返回 JSON格式数据 - 格式化
                return createGson(includeNulls).setPrettyPrinting().create().toJson(data);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    // ========
    // = Temp =
    // ========

    /**
     * 获取文件夹下的文件目录列表 ( 非全部子目录 )
     * @param dirPath 目录路径
     * @return 文件目录列表
     */
    public static List<File> listFilesOrEmpty(final String dirPath) {
        return listFilesOrEmpty(FileUtils.getFile(dirPath));
    }

    /**
     * 获取文件夹下的文件目录列表 ( 非全部子目录 )
     * @param dir 目录
     * @return 文件目录列表
     */
    public static List<File> listFilesOrEmpty(final File dir) {
        if (FileUtils.isFileExists(dir)) {
            List<File> list = ArrayUtils.asList(dir.listFiles());
            if (list != null) return list;
        }
        return new ArrayList<>();
    }

    /**
     * Windows 目录资源文件升序排序
     * @param list 集合
     * @return {@code true} success, {@code false} fail
     */
    public static boolean sortWindowsExplorerFileSimpleComparatorAsc(final List<File> list) {
        return sort(list, new WindowsExplorerFileSimpleComparator());
    }

    /**
     * List 排序处理
     * @param list       集合
     * @param comparator 排序比较器
     * @param <T>        泛型
     * @return {@code true} success, {@code false} fail
     */
    private static <T> boolean sort(
            final List<T> list,
            final Comparator<? super T> comparator
    ) {
        if (list != null) {
            Collections.sort(list, comparator);
            return true;
        }
        return false;
    }
}