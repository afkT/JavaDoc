package javadoc;

import com.google.gson.GsonBuilder;

import java.io.*;
import java.lang.reflect.Field;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * detail: 内部工具类
 * @author Ttt
 */
public final class Utils {

    private Utils() {
    }

    // 换行符
    public static final String NEW_LINE_STR = System.getProperty("line.separator");

    /**
     * 检查是否存在某个文件
     * @param file 文件路径
     * @return {@code true} yes, {@code false} no
     */
    public static boolean isFileExists(final File file) {
        return file != null && file.exists();
    }

    /**
     * 安静关闭 IO
     * @param closeables Closeable[]
     */
    public static void closeIOQuietly(final Closeable... closeables) {
        if (closeables == null) return;
        for (Closeable closeable : closeables) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Exception ignore) {
                }
            }
        }
    }

    /**
     * 追加空格
     * @param number 空格数量
     * @return 指定数量的空格字符串
     */
    public static String appendSpace(final int number) {
        StringBuffer buffer = new StringBuffer();
        if (number > 0) {
            for (int i = 0; i < number; i++) {
                buffer.append(" ");
            }
        }
        return buffer.toString();
    }

    /**
     * 读取文件内容, 返回字符串
     * @param file        文件
     * @param charsetName 字符编码
     * @return 文件内容字符串
     */
    public static String readFileToString(final File file, final String charsetName) {
        if (!isFileExists(file)) return null;
        BufferedReader br = null;
        try {
            StringBuilder builder = new StringBuilder();
            if (isSpace(charsetName)) {
                br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            } else {
                br = new BufferedReader(new InputStreamReader(new FileInputStream(file), charsetName));
            }
            String line;
            if ((line = br.readLine()) != null) {
                builder.append(line);
                while ((line = br.readLine()) != null) {
                    builder.append(NEW_LINE_STR).append(line);
                }
            }
            return builder.toString();
        } catch (IOException e) {
            return null;
        } finally {
            closeIOQuietly(br);
        }
    }

    /**
     * 读取文件内容, 返回换行 List
     * @param file  文件
     * @param start 开始位置
     * @param end   结束位置
     * @return 换行 {@link List<String>}
     */
    public static List<String> readFileToList(final File file, final int start, final int end) {
        return readFileToList(file, start, end, null);
    }

    /**
     * 读取文件内容, 返回换行 List
     * @param file        文件
     * @param start       开始位置
     * @param end         结束位置
     * @param charsetName 字符编码
     * @return 换行 {@link List<String>}
     */
    public static List<String> readFileToList(final File file, final int start, final int end, final String charsetName) {
        if (!isFileExists(file)) return null;
        if (start > end) return null;
        BufferedReader br = null;
        try {
            String line;
            int curLine = 1;
            List<String> list = new ArrayList<>();
            if (isSpace(charsetName)) {
                br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            } else {
                br = new BufferedReader(new InputStreamReader(new FileInputStream(file), charsetName));
            }
            while ((line = br.readLine()) != null) {
                if (curLine > end) break;
                if (start <= curLine && curLine <= end) list.add(line);
                ++curLine;
            }
            return list;
        } catch (IOException e) {
            return null;
        } finally {
            closeIOQuietly(br);
        }
    }

    /**
     * 保存文件
     * @param filePath 保存路径
     * @param fileName 文件名. 后缀
     * @param txt      保存内容
     * @return {@code true} 保存成功, {@code false} 保存失败
     */
    public static boolean saveFile(final String filePath, final String fileName, final String txt) {
        if (filePath != null && fileName != null && txt != null) {
            // 不存在数据, 则不保存
            if (txt.length() == 0) return false;
            try {
                // 创建文件夹
                new File(filePath).mkdirs();
                // 保存路径
                File sFile = new File(filePath, fileName);
                // 保存内容到一个文件
                FileOutputStream fos = new FileOutputStream(sFile);
                fos.write(txt.getBytes());
                fos.close();
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
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
     * 清空字符串前后所有空格
     * @param str 待处理字符串
     * @return 处理后的字符串
     */
    public static String toClearSpaceTrim(final String str) {
        if (isEmpty(str)) return str;
        String strTemp = str;
        // 如果前面或者后面都是空格开头, 就一直进行处理
        while (strTemp.startsWith(" ") || strTemp.endsWith(" ")) {
            strTemp = strTemp.trim();
        }
        return strTemp;
    }

    /**
     * 判断字符串是否为 null 或全为空白字符
     * @param str 待校验字符串
     * @return {@code true} yes, {@code false} no
     */
    public static boolean isSpace(final String str) {
        if (str == null) return true;
        for (int i = 0, len = str.length(); i < len; ++i) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * 判断是否为 null
     * @param str 待校验的字符串
     * @return {@code true} is null, {@code false} not null
     */
    public static boolean isEmpty(final String str) {
        return (str == null || str.length() == 0);
    }

    /**
     * 判断数组是否为 null
     * @param objects object[]
     * @return {@code true} is null, {@code false} not null
     */
    public static boolean isEmpty(final Object[] objects) {
        return objects == null || objects.length == 0;
    }

    /**
     * 判断 Collection 是否为 null
     * @param collection {@link Collection}
     * @return {@code true} is null, {@code false} not null
     */
    public static boolean isEmpty(final Collection collection) {
        return (collection == null || collection.size() == 0);
    }

    /**
     * 获取数组长度
     * @param objects object[]
     * @return 如果数据为 null, 则返回 defaultLength, 如果不为 null, 则返回 array[].length
     */
    public static int length(final Object[] objects) {
        return length(objects, 0);
    }

    /**
     * 获取数组长度
     * @param objects       object[]
     * @param defaultLength 数组为 null 时, 返回的长度
     * @return 如果数据为 null, 则返回 defaultLength, 如果不为 null, 则返回 array[].length
     */
    public static int length(final Object[] objects, final int defaultLength) {
        return objects != null ? objects.length : defaultLength;
    }

    /**
     * 获取 Collection 长度
     * @param collection {@link Collection}
     * @return 如果 Collection 为 null, 则返回默认长度, 如果不为 null, 则返回 collection.size()
     */
    public static int length(final Collection collection) {
        return length(collection, 0);
    }

    /**
     * 获取 Collection 长度
     * @param collection    {@link Collection}
     * @param defaultLength 集合为 null 默认长度
     * @return 如果 Collection 为 null, 则返回 defaultLength, 如果不为 null, 则返回 collection.size()
     */
    public static int length(final Collection collection, final int defaultLength) {
        return collection != null ? collection.size() : defaultLength;
    }

    /**
     * 通用匹配函数
     * @param regex 正则表达式
     * @param input 待校验的字符串
     * @return {@code true} yes, {@code false} no
     */
    public static boolean match(final String regex, final String input) {
        if (!isEmpty(input)) {
            try {
                return Pattern.matches(regex, input);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 判断两个值是否一样
     * @param value1 第一个值
     * @param value2 第二个值
     * @param <T>    泛型
     * @return {@code true} yes, {@code false} no
     */
    public static <T> boolean equals(final T value1, final T value2) {
        // 两个值都不为 null
        if (value1 != null && value2 != null) {
            try {
                if (value1 instanceof String && value2 instanceof String) {
                    return value1.equals(value2);
                } else if (value1 instanceof CharSequence && value2 instanceof CharSequence) {
                    CharSequence v1 = (CharSequence) value1;
                    CharSequence v2 = (CharSequence) value2;
                    // 获取数据长度
                    int length = v1.length();
                    // 判断数据长度是否一致
                    if (length == v2.length()) {
                        for (int i = 0; i < length; i++) {
                            if (v1.charAt(i) != v2.charAt(i)) {
                                return false;
                            }
                        }
                        return true;
                    }
                    return false;
                }
                // 其他都使用 equals 判断
                return value1.equals(value2);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return false;
        }
        // 防止两个值都为 null
        return (value1 == null && value2 == null);
    }

    /**
     * 获取父类中的变量对象
     * @param object    子类对象
     * @param fieldName 父类中的属性名
     * @return 父类中的变量对象
     */
    public static Object getDeclaredFieldParentObj(final Object object, final String fieldName) {
        if (object == null || fieldName == null) return null;
        try {
            Field field = getDeclaredFieldParent(object, fieldName);
            field.setAccessible(true);
            return field.get(object);
        } catch (Exception e) {
        }
        return null;
    }

    /**
     * 循环向上转型, 获取对象的 DeclaredField
     * @param object    子类对象
     * @param fieldName 父类中的属性名
     * @return 父类中的变量对象
     */
    public static Field getDeclaredFieldParent(final Object object, final String fieldName) {
        if (object == null || fieldName == null) return null;
        try {
            Field field;
            Class<?> clazz = object.getClass();
            for (; clazz != Object.class; clazz = clazz.getSuperclass()) {
                try {
                    field = clazz.getDeclaredField(fieldName);
                    return field;
                } catch (Exception e) {
                    // 这里甚么都不要做, 并且这里的异常必须这样写, 不能抛出去
                    // 如果这里的异常打印或者往外抛, 则就不会执行 clazz = clazz.getSuperclass(), 最后就不会进入到父类中了
                }
            }
        } catch (Exception e) {
        }
        return null;
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
     * 生成 Map 字符串
     * @param map {@link HashMap}
     * @param mapName map 变量名
     * @return 生成指定格式字符串
     */
    public static String generateMapString(final HashMap<String, ArrayList<String>> map, final String mapName){
        StringBuilder builder = new StringBuilder();
        // HashMap 排序
        Map<String, ArrayList<String>> sortHashMap = sortHashMap(map);
        // 格式化字符串
        String format = "%s.put(\"%s\", Utils.asList(%s));";
        // 循环处理
        for (String className : sortHashMap.keySet()){
            ArrayList<String> lists = sortHashMap.get(className);
            // 格式化追加
            builder.append(String.format(format, mapName, className,
                    appendToString(lists.toArray(new String[]{}))));
            builder.append(NEW_LINE_STR);
        }
        return builder.toString();
    }

    /**
     * 追加数组内容字符串
     * @param data 数组
     * @param <T>  泛型
     * @return 追加数组内容字符串
     */
    public static <T> String appendToString(final T[] data) {
        if (data != null) {
            int len = data.length;
            if (len != 0) {
                if (len == 1) {
                    return "\"" + ((data[0] == null) ? "null" : data[0].toString()) + "\"";
                } else {
                    StringBuilder builder = new StringBuilder();
                    for (int i = 0; i < len - 1; i++) {
                        T t = data[i];
                        builder.append("\"").append(((t == null) ? "null" : t.toString())).append("\",");
                    }
                    T end = data[len - 1];
                    builder.append("\"" + ((end == null) ? "null" : end.toString()) + "\"");
                    return builder.toString();
                }
            }
        }
        return "";
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

    // ============
    // = 特殊方法 =
    // ============

    /**
     * 统计字符串匹配个数
     * @param str     待匹配字符串
     * @param keyword 匹配 key
     * @return 字符串 key 匹配个数
     */
    public static int countMatches(final String str, final String keyword) {
        if (isEmpty(str) || isEmpty(keyword)) return 0;
        try {
            int count = 0;
            Matcher matcher = Pattern.compile(keyword).matcher(str);
            // find() 对字符串进行匹配, 匹配到的字符串可以在任何位置
            while (matcher.find()) {
                count++;
            }
            return count;
        } catch (Exception e) {
        }
        return 0;
    }

    /**
     * 拼接数组
     * @param prefix 第一个数组
     * @param suffix 第二个数组
     * @param <T>    泛型
     * @return 拼接后的数组集合
     */
    public static <T> ArrayList<T> arraycopy(final T[] prefix, final T[] suffix) {
        // 获取数据长度
        int prefixLength = (prefix != null) ? prefix.length : 0;
        int suffixLength = (suffix != null) ? suffix.length : 0;
        // 数据都为 null, 则直接跳过
        if (prefixLength + suffixLength == 0) return null;
        // 创建集合
        ArrayList<T> lists = new ArrayList<>(prefixLength + suffixLength);
        // 进行判断处理
        if (prefixLength != 0) {
            for (int i = 0; i < prefixLength; i++) {
                lists.add(prefix[i]);
            }
        }
        if (suffixLength != 0) {
            for (int i = 0; i < suffixLength; i++) {
                lists.add(suffix[i]);
            }
        }
        return lists;
    }

    // =================
    // = 特殊 Map 操作 =
    // =================

    /**
     * 添加一条数据 - (Value) List<T>
     * @param map   待添加 {@link Map}
     * @param key   key
     * @param value value, add to list
     * @param <K>   key
     * @param <T>   value type
     * @return {@code true} success, {@code false} fail
     */
    public static <K, T> boolean putToList(final Map<K, ArrayList<T>> map, final K key, final T value) {
        return putToList(map, key, value, true);
    }

    /**
     * 添加一条数据 - (Value) List<T>
     * @param map   {@link Map}
     * @param key   key
     * @param value value, add to list
     * @param isNew 当指定 (key) 的 value 为 null, 是否创建
     * @param <K>   key
     * @param <T>   value type
     * @return {@code true} success, {@code false} fail
     */
    public static <K, T> boolean putToList(final Map<K, ArrayList<T>> map, final K key, final T value, final boolean isNew) {
        if (map != null) {
            if (map.containsKey(key)) {
                ArrayList<T> lists = map.get(key);
                if (lists != null) {
                    try {
                        lists.add(value);
                        map.put(key, lists);
                        return true;
                    } catch (Exception e) {
                    }
                }
            } else {
                // 判断是否创建
                if (isNew) {
                    try {
                        ArrayList<T> lists = new ArrayList<>();
                        lists.add(value);
                        map.put(key, lists);
                        return true;
                    } catch (Exception e) {
                    }
                }
            }
        }
        return false;
    }

    // =

    /**
     * 移除多条数据 - 通过 Map 进行移除
     * @param map       {@link Map}
     * @param removeMap {@link Map} 移除对比数据源
     * @param <K>       key
     * @param <T>       value type
     */
    public static <K, T> void removeToMap(final Map<K, ArrayList<T>> map, final Map<K, ArrayList<T>> removeMap) {
        removeToMap(map, removeMap, true, true);
    }

    /**
     * 移除多条数据 - 通过 Map 进行移除
     * @param map             {@link Map}
     * @param removeMap       {@link Map} 移除对比数据源
     * @param removeEmpty     是否移除 null、长度为 0 的数据
     * @param isNullRemoveAll 如果待移除的 ArrayList 是 null, 是否移除全部
     * @param <K>             key
     * @param <T>             value type
     */
    public static <K, T> void removeToMap(final Map<K, ArrayList<T>> map, final Map<K, ArrayList<T>> removeMap,
                                          final boolean removeEmpty, final boolean isNullRemoveAll) {
        if (map != null && removeMap != null) {
            Iterator<Map.Entry<K, ArrayList<T>>> iterator = removeMap.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<K, ArrayList<T>> entry = iterator.next();
                // 获取 key
                K key = entry.getKey();
                // 进行移除处理
                if (map.containsKey(key)) {
                    ArrayList<T> value = entry.getValue();
                    try {
                        if (value != null) {
                            map.get(key).removeAll(value);
                        } else {
                            if (isNullRemoveAll) {
                                map.remove(key);
                            }
                        }
                    } catch (Exception e) {
                    }
                    // 判断是否移除 null、长度为 0 的数据
                    if (removeEmpty) {
                        ArrayList<T> lists = map.get(key);
                        try {
                            // 不存在数据了, 则移除
                            if (lists == null || lists.size() == 0) {
                                map.remove(key);
                            }
                        } catch (Exception e) {
                        }
                    }
                }
            }
        }
    }

    // ========
    // = Gson =
    // ========

    /**
     * 创建 GsonBuilder
     * @param serializeNulls 是否序列化null值
     * @return
     */
    private static GsonBuilder createGson(final boolean serializeNulls) {
        final GsonBuilder builder = new GsonBuilder();
        if (serializeNulls) builder.serializeNulls();
        return builder;
    }

    /**
     * 转换 json 格式数据, 并且格式化
     * @param data
     * @param includeNulls 是否序列化null值
     * @return
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