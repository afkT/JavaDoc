package other;

import dev.utils.common.ColorUtils;
import dev.utils.common.StringUtils;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RunMain {

    private static final String TAG = RunMain.class.getSimpleName();
    // 数据实体类
    private static List<ColorBean> sListColors = new ArrayList<>();
    // 保存值

    public static void main(String[] args) {
        try {
            analysisXml();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Collections.sort(sListColors, new Comparator<ColorBean>() {
            @Override
            public int compare(ColorBean c1, ColorBean c2) {
                long diff = c1.valueColor - c2.valueColor;
                if (diff > 0) {
                    return 1;
                } else if (diff < 0) {
                    return -1;
                }
                return 0; // 相等为 0
            }
        });


        StringBuilder builder = new StringBuilder("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        builder.append(StringUtils.NEW_LINE_STR);
        builder.append("<resources>");
        for (ColorBean colorBean : sListColors) {
            builder.append(StringUtils.NEW_LINE_STR);
            String colorStr = "<color name=\"%s\">%s</color>";
            builder.append(String.format(colorStr, colorBean.key, colorBean.value));
        }
        builder.append(StringUtils.NEW_LINE_STR);
        builder.append("</resources>");

        System.out.println(builder.toString());
    }



    /**
     * StringBuilder 拼接处理 ( 最后一个不追加间隔 )
     * @param split 追加间隔
     * @param args  拼接数据源
     * @return {@link StringBuilder}
     */
    public static StringBuilder appendsIgnoreLast(final StringBuilder builder, final String split, final Object... args) {
        if (builder != null && args != null) {
            // 获取间隔字符串, 优化循环判断
            String str = StringUtils.isEmpty(split) ? "" : split;
            int len = args.length;
            // 循环处理
            for (int i = 0; i < len - 1; i++) {
                builder.append(args[i]); // 拼接数据
                builder.append(str); // 间隔追加
            }
            builder.append(args[len - 1]); // 拼接数据
        }
        return builder;
    }

    /**
     * detail: 颜色实体类
     * @author Ttt
     */
    public static class ColorBean {

        // Key
        public String key;
        // Value
        private String value;
        // Int
        public long valueColor;
        // ARGB
        public int alpha = 255, red = 0, green = 0, blue = 0;

        public ColorBean setValue(String value) {
            this.value = value;

            // ============
            // = 转换处理 =
            // ============

            // 转换 int 颜色值
            valueColor = ColorUtils.parseColor(value);

            int[] argb = getARGB((int) valueColor);
            // 获取 ARGB
            alpha = ColorUtils.alpha((int) valueColor);
            red = ColorUtils.red((int) valueColor);
            green = ColorUtils.green((int) valueColor);
            blue = ColorUtils.blue((int) valueColor);

            alpha = argb[0];
            red = argb[1];
            green = argb[2];
            blue = argb[3];


            return this;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("value : " + value);
            builder.append("\nalpha : " + alpha);
            builder.append("\nred : " + red);
            builder.append("\ngreen : " + green);
            builder.append("\nblue : " + blue);
            builder.append("\nintToRgbString : " + ColorUtils.intToRgbString((int) valueColor));
            builder.append("\nintToArgbString : " + ColorUtils.intToArgbString((int) valueColor));
            return builder.toString();
        }

        /**
         * 返回一个颜色 ARGB 色值 ( 返回十进制 )
         * @param color argb color
         * @return red 值
         */
        public static int[] getARGB(final int color) {
            int[] argb = new int[4];
            if (ColorUtils.isARGB(color)) {
                argb[0] = ColorUtils.alpha(color);
            } else {
                argb[0] = 255;
            }
            argb[1] = ColorUtils.red(color);
            argb[2] = ColorUtils.green(color);
            argb[3] = ColorUtils.blue(color);
            return argb;
        }
    }

    private static void analysisXml() throws Exception {
        // 1.或去SAXParserFactory实例
        SAXParserFactory factory = SAXParserFactory.newInstance();
        // 2.获取SAXparser实例
        SAXParser saxParser = factory.newSAXParser();
        //创建Handel对象
        SAXDemoHandel handel = new SAXDemoHandel();
        saxParser.parse("D://colors.xml", handel);
    }


    static class SAXDemoHandel extends DefaultHandler {

        private ColorBean tempBean;

        // 遍历 xml 文件开始标签
        @Override
        public void startDocument() throws SAXException {
            super.startDocument();
            System.out.println("sax 解析开始");
        }

        // 遍历 xml 文件结束标签
        @Override
        public void endDocument() throws SAXException {
            super.endDocument();
            System.out.println("sax 解析结束");
        }

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            super.startElement(uri, localName, qName, attributes);
            if (qName.equals("color")) {
                String key = attributes.getValue("name");
                // 开始遍历
                tempBean = new ColorBean();
                tempBean.key = key;
            }
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            super.endElement(uri, localName, qName);
            if (qName.equals("color")) {
                // 遍历结束
                sListColors.add(tempBean);
            }
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            super.characters(ch, start, length);
            String value = new String(ch, start, length).trim();
            if (!value.equals("")) {
                tempBean.setValue(value);
            }
        }
    }
}