package javadoc;

import com.google.gson.GsonBuilder;
import dev.utils.JCLogUtils;
import dev.utils.common.ArrayUtils;
import dev.utils.common.StringUtils;

import java.io.File;
import java.util.*;

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
    public static ArrayList<File> getFileLists(final String path) {
        ArrayList<File> lists = new ArrayList<>();
        // 获取文件路径
        File baseFile = new File(path);
        // 获取子文件
        File[] files = baseFile.listFiles();
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
    public static ArrayList<File> getFileCatalogLists(final String path) {
        ArrayList<File> lists = new ArrayList<>();
        try {
            // 获取文件路径
            File baseFile = new File(path);
            // 获取子文件
            File[] files = baseFile.listFiles();
            for (File file : files) {
                lists.add(file);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lists;
    }

    /**
     * HashMap 排序
     * @param map {@link Map}
     * @return 排序后的 Map
     */
    public static Map<String, ArrayList<String>> sortHashMap(final Map<String, ArrayList<String>> map) {
        Map<String, ArrayList<String>> sortedMap = new LinkedHashMap<>();
        List<String> list = new ArrayList<>();
        Iterator<String> item = map.keySet().iterator();
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
        List<String> list = new ArrayList<>();
        Iterator<String> item = set.iterator();
        while (item.hasNext()) {
            list.add(item.next());
        }
        Collections.sort(list);
        return new HashSet<>(list);
    }

    /**
     * 生成 Map 字符串
     * @param map     {@link HashMap}
     * @param mapName map 变量名
     * @return 生成指定格式字符串
     */
    public static String generateMapString(final HashMap<String, ArrayList<String>> map, final String mapName) {
        StringBuilder builder = new StringBuilder();
        // HashMap 排序
        Map<String, ArrayList<String>> sortHashMap = sortHashMap(map);
        // 空格前缀
        String space = "        ";
        // 格式化字符串
        String format = space + "%s.put(\"%s\", Utils.asList(%s));";
        // 循环处理
        for (String className : sortHashMap.keySet()) {
            ArrayList<String> lists = sortHashMap.get(className);
            // 格式化追加
            builder.append(String.format(format, mapName, className,
                    ArrayUtils.appendToString(lists.toArray(new String[]{}))));
            builder.append(StringUtils.NEW_LINE_STR);
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
    public static String generateSetString(final Set<String> set, final String mapName) {
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
            builder.append(StringUtils.NEW_LINE_STR);
        }
        // 用于生成 Config 特殊处理
        builder.delete(0, space.length());
        return builder.toString();
    }

    /**
     * 转换数组为集合
     * @param array 数组
     * @param <T>   泛型
     * @return {@link ArrayList<T>}
     */
    public static <T> ArrayList<T> asList(final T... array) {
        if (array != null) {
            try {
                return new ArrayList<>(Arrays.asList(array));
            } catch (Exception e) {
            }
        }
        return null;
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
    public static String toJsonFormat(final Object data, final boolean includeNulls) {
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