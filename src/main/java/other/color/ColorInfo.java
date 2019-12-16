package other.color;

import dev.utils.common.ColorUtils;
import dev.utils.common.StringUtils;

/**
 * detail: 颜色信息
 * @author Ttt
 */
public class ColorInfo {

    // key
    private String key;
    // value ( 如: #000000 )
    private String value;
    // value 解析后的值 ( 如: #000 => #000000 )
    private String valueParser;
    // ARGB/RGB color
    private long valueColor;
    // A、R、G、B
    private int alpha = 255, red = 0, green = 0, blue = 0;

    /**
     * 构造函数
     * @param key   Key
     * @param value Value ( 如: #000000 )
     */
    public ColorInfo(String key, String value) {
        this.key = key;
        this.value = value;
        priConvert();
    }

    /**
     * 获取 Key
     * @return key String
     */
    public String getKey() {
        return key;
    }

    /**
     * 获取 Value
     * @return value String
     */
    public String getValue() {
        return value;
    }

    /**
     * 获取 Value 解析后的值 ( 如: #000 => #000000 )
     * @return value 解析后的值 ( 如: #000 => #000000 )
     */
    public String getValueParser() {
        return valueParser;
    }

    /**
     * 获取 ARGB/RGB color
     * @return ARGB/RGB color
     */
    public long getValueColor() {
        return valueColor;
    }

    /**
     * 返回颜色中的透明度值 ( 返回十进制 )
     * @return alpha 值
     */
    public int getAlpha() {
        return alpha;
    }

    /**
     * 返回颜色中红色的色值 ( 返回十进制 )
     * @return red 值
     */
    public int getRed() {
        return red;
    }

    /**
     * 返回颜色中绿色的色值 ( 返回十进制 )
     * @return green 值
     */
    public int getGreen() {
        return green;
    }

    /**
     * 返回颜色中蓝色的色值 ( 返回十进制 )
     * @return blue 值
     */
    public int getBlue() {
        return blue;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("key : " + key);
        builder.append("\nvalue : " + value);
        builder.append("\nalpha : " + alpha);
        builder.append("\nred : " + red);
        builder.append("\ngreen : " + green);
        builder.append("\nblue : " + blue);
        builder.append("\nintToRgbString : " + ColorUtils.intToRgbString((int) valueColor));
        builder.append("\nintToArgbString : " + ColorUtils.intToArgbString((int) valueColor));
        return builder.toString();
    }

    // ============
    // = 内部处理 =
    // ============

    /**
     * 内部转换处理
     */
    private void priConvert() {
        String temp = value;
        if (sParser != null) {
            temp = sParser.handleColor(value);
            // 保存解析后的值
            valueParser = temp;
        }
        if (temp == null) return;
        // 转换 long 颜色值
        valueColor = ColorUtils.parseColor(temp);

        int[] argb = ColorMain.getARGB((int) valueColor);
        // 获取 ARGB
        alpha = argb[0];
        red = argb[1];
        green = argb[2];
        blue = argb[3];
    }

    // ==============
    // = 解析器相关 =
    // ==============

    /**
     * detail: Color 解析器
     * @author Ttt
     */
    public interface Parser {

        /**
         * 处理 color
         * @param value 如: #000000
         * @return 处理后的 value
         */
        String handleColor(String value);
    }

    /**
     * detail: Color 解析器
     * @author Ttt
     */
    public static class ColorParser implements Parser {
        @Override
        public String handleColor(String value) {
            if (value == null) return null;
            String color = StringUtils.toClearSpace(value);
            char[] chars = color.toCharArray();
            int length = chars.length;
            if (length != 0 && chars[0] == '#') {
                if (length == 4) {
                    String colorsub = color.substring(1);
                    // #000 => #000000
                    return color + colorsub;
                } else if (length == 5) {
                    String colorsub = color.substring(3);
                    // #0011 => #00111111
                    return color + colorsub + colorsub;
                }
            }
            return color;
        }
    }

    // 内部解析器
    private static Parser sParser;

    /**
     * 设置 Color 解析器
     * @param parser {@link Parser}
     */
    public static void setParser(Parser parser) {
        ColorInfo.sParser = parser;
    }
}
