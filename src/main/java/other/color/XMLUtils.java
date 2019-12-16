package other.color;


import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.util.ArrayList;
import java.util.List;

final class XMLUtils {

    // 数据实体类
    private static List<ColorInfo> sListColors = new ArrayList<>();

    public static void main(String[] args) {
        try {
            analysisXml();
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (ColorInfo colorInfo : sListColors) {
            System.out.println(String.format("sListColors.add(new ColorInfo(\"%s\", \"%s\"));", colorInfo.getKey(), colorInfo.getValue()));
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

        String colorKey;
        String colorValue;

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
                this.colorKey = attributes.getValue("name");
            }
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            super.endElement(uri, localName, qName);
            if (qName.equals("color")) {
                // 遍历结束
                sListColors.add(new ColorInfo(colorKey, colorValue));
            }
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            super.characters(ch, start, length);
            String value = new String(ch, start, length).trim();
            if (!value.equals("")) {
                this.colorValue = value;
            }
        }
    }
}
