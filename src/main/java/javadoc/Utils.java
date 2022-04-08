package javadoc;

import com.google.gson.GsonBuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import dev.utils.DevFinal;
import dev.utils.common.ArrayUtils;
import dev.utils.common.FileUtils;
import dev.utils.common.comparator.ComparatorUtils;
import javadoc.dev_utils.ApiConfig;

/**
 * detail: 内部工具类
 * @author Ttt
 */
public final class Utils {

    private Utils() {
    }

//    static {
//        JCLogUtils.setPrintLog(true);
//        JCLogUtils.setControlPrintLog(true);
////        JCLogUtils.setPrint(new JCLogUtils.Print() {
////            @Override
////            public void printLog(int logType, String tag, String message) {
////                System.out.println(tag + " : " + message);
////            }
////        });
//    }

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
        List<File> files = FileUtils.listFilesOrEmpty(baseFile);
        ComparatorUtils.sortWindowsExplorerFileSimpleComparatorAsc(files);
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
        List<File> files = FileUtils.listFilesOrEmpty(path);
        ComparatorUtils.sortWindowsExplorerFileSimpleComparatorAsc(files);
        return files;
    }

    /**
     * HashMap 排序
     * @param map {@link Map}
     * @return 排序后的 Map
     */
    public static Map<String, List<String>> sortHashMap(final Map<String, List<String>> map) {
        Map<String, List<String>> sortedMap = new LinkedHashMap<>();
        List<String>              list      = new ArrayList<>(map.keySet());
        Collections.sort(list);
        for (String key : list) {
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
        List<String> list = new ArrayList<>(set);
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

    /**
     * 拼接 API 内容
     * <pre>
     *     解决 Markdown link 优化, 底部拼接 API 错乱问题
     *     内部查找占位符并进行替换
     *     如果不存在占位符则直接进行拼接
     * </pre>
     * @param builder    拼接 Builder
     * @param apiContent API 内容
     */
    public static void appendAPI(
            final StringBuilder builder,
            final String apiContent
    ) {
        int apiIndex = builder.lastIndexOf(ApiConfig.API_PLACEHOLDER_FORMAT);
        if (apiIndex != -1) {
            builder.delete(apiIndex, apiIndex + ApiConfig.API_PLACEHOLDER_FORMAT.length());
            builder.insert(apiIndex, apiContent);
        } else {
            builder.append(apiContent);
        }
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
}