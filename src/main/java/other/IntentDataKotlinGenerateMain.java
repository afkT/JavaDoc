package other;

import java.util.LinkedHashSet;

import dev.utils.DevFinal;
import dev.utils.common.StringUtils;

/**
 * detail: IntentData 类创建
 * @author Ttt
 * <pre>
 *     生成 Intent 传参读写辅助类快捷方法
 * </pre>
 */
public class IntentDataKotlinGenerateMain {

    // 方法字符串
    private static final String METHOD_STR;

    static {
        StringBuilder builder = new StringBuilder();
        builder.append("\n    // =");
        builder.append("\n");
        builder.append("\n    /**");
        builder.append("\n     * 获取 Key ( UPPERCASE_KEY ) 对应的 Value");
        builder.append("\n     * @return Value");
        builder.append("\n     */");
        builder.append("\n    fun getLOWERCASE_KEY(): String? {");
        builder.append("\n        return get(INTENT_KEY.UPPERCASE_KEY)");
        builder.append("\n    }");
        builder.append("\n");
        builder.append("\n    /**");
        builder.append("\n     * 设置 Key ( UPPERCASE_KEY ) 对应的 Value");
        builder.append("\n     * @param value 保存的 value");
        builder.append("\n     * @return IntentData");
        builder.append("\n     */");
        builder.append("\n    fun setLOWERCASE_KEY(value : String?): IntentData {");
        builder.append("\n        return put(INTENT_KEY.UPPERCASE_KEY, value)");
        builder.append("\n    }");
        builder.append("\n");
        builder.append("\n    /**");
        builder.append("\n     * 移除 Key ( UPPERCASE_KEY )");
        builder.append("\n     * @return IntentData");
        builder.append("\n     */");
        builder.append("\n    fun removeLOWERCASE_KEY(): IntentData {");
        builder.append("\n        return remove(INTENT_KEY.UPPERCASE_KEY)");
        builder.append("\n    }");
        builder.append("\n");
        builder.append("\n    /**");
        builder.append("\n     * 是否存在 Key ( UPPERCASE_KEY )");
        builder.append("\n     * @return `true` yes, `false` no");
        builder.append("\n     */");
        builder.append("\n    fun containsLOWERCASE_KEY(): Boolean {");
        builder.append("\n        return containsKey(INTENT_KEY.UPPERCASE_KEY)");
        builder.append("\n    }");
        builder.append("\n");
        builder.append("\n    /**");
        builder.append("\n     * Key ( UPPERCASE_KEY ) 保存的 Value 是否为 null");
        builder.append("\n     * @return `true` yes, `false` no");
        builder.append("\n     */");
        builder.append("\n    fun isNullValueLOWERCASE_KEY(): Boolean {");
        builder.append("\n        return isNullValue(INTENT_KEY.UPPERCASE_KEY)");
        builder.append("\n    }");
        METHOD_STR = builder.toString();
    }

    // 大写 Key【常量名】
    private static final String R_UPPERCASE_KEY = "UPPERCASE_KEY";

    // 小写 Key【方法名字】
    private static final String R_LOWERCASE_KEY = "LOWERCASE_KEY";

    // Intent Key 类命名
    private static final String R_INTENT_KEY = "INTENT_KEY";

    // Intent Key 类命名【项目实际类名】
    private static final String INTENT_KEY = "IntentKey";

    public static void main(String[] args) {
        LinkedHashSet<String> keys = new LinkedHashSet<>();
        keys.add("UUID");
        keys.add("ID");
        keys.add("Data");
        keys.add("JSON");
        keys.add("JSON2");
        keys.add("Type");
        keys.add("Result");
        keys.add("Status");
        keys.add("Index");
        keys.add("Index_Id");
        keys.add("Current");
        keys.add("Title");
        keys.add("Session");
        keys.add("File");
        keys.add("Path");
        keys.add("Url");
        keys.add("Max_Number");

        // ==========
        // = 开始拼接 =
        // ==========

        StringBuilder builder = new StringBuilder();
        for (String name : keys) {
            String finalName     = StringUtils.underScoreCaseToCamelCase(name);
            String nameUpperCase = name.toUpperCase();

            // class 特殊处理防止 getClass
            if ("class".equalsIgnoreCase(finalName)) {
                finalName = finalName.toUpperCase();
            }

            // 方法字符串【格式化后】
            String methodFormat = METHOD_STR.replaceAll(
                    R_UPPERCASE_KEY, nameUpperCase
            ).replaceAll(
                    R_LOWERCASE_KEY, finalName
            ).replaceAll(
                    R_INTENT_KEY, INTENT_KEY
            );

            builder.append(DevFinal.SYMBOL.NEW_LINE)
                    .append(methodFormat);
        }
        // 最终内容
        String content = builder.toString();

        String debug = "";
    }
}