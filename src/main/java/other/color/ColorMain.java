package other.color;

import dev.utils.common.FileUtils;
import dev.utils.common.StringUtils;
import javadoc.dev_utils.ApiConfig;

import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ColorMain {

    // 数据实体类
    private static List<other.color.ColorUtils.ColorInfo> sListColors = new ArrayList<>();

    static {
        sListColors.add(new ColorUtils.ColorInfo("colorPrimary", "#3F51B5"));
        sListColors.add(new ColorUtils.ColorInfo("colorPrimaryDark", "#303F9F"));
        sListColors.add(new ColorUtils.ColorInfo("colorAccent", "#FF4081"));
        sListColors.add(new ColorUtils.ColorInfo("colorTre", "#00000000"));
        sListColors.add(new ColorUtils.ColorInfo("color_e60012", "#E60012"));
        sListColors.add(new ColorUtils.ColorInfo("color_fef5f3", "#FEF5F3"));
        sListColors.add(new ColorUtils.ColorInfo("color_cce60012", "#CCE60012"));
        sListColors.add(new ColorUtils.ColorInfo("color_ec776a", "#EC776A"));
        sListColors.add(new ColorUtils.ColorInfo("color_eb645d", "#EB645D"));
        sListColors.add(new ColorUtils.ColorInfo("color_e5e60012", "#e5e60012"));
        sListColors.add(new ColorUtils.ColorInfo("color_88e60012", "#88E60012"));
        sListColors.add(new ColorUtils.ColorInfo("color_19e60012", "#19E60012"));
        sListColors.add(new ColorUtils.ColorInfo("color_08e60012", "#08E60012"));
        sListColors.add(new ColorUtils.ColorInfo("color_7fe60012", "#7FE60012"));
        sListColors.add(new ColorUtils.ColorInfo("color_f15E3C", "#F15E3C"));
        sListColors.add(new ColorUtils.ColorInfo("color_de3733", "#DE3733"));
        sListColors.add(new ColorUtils.ColorInfo("color_fd2f2a", "#fd2f2a"));
        sListColors.add(new ColorUtils.ColorInfo("color_f15e3c", "#F15E3C"));
        sListColors.add(new ColorUtils.ColorInfo("color_e34244", "#E34244"));
        sListColors.add(new ColorUtils.ColorInfo("color_f52e86", "#f52e86"));
        sListColors.add(new ColorUtils.ColorInfo("color_7ff52e86", "#7ff52e86"));
        sListColors.add(new ColorUtils.ColorInfo("color_f92d5b", "#f92d5b"));
        sListColors.add(new ColorUtils.ColorInfo("color_f9d789", "#F9D789"));
        sListColors.add(new ColorUtils.ColorInfo("color_f65959", "#f65959"));
        sListColors.add(new ColorUtils.ColorInfo("color_fa7373", "#fa7373"));
        sListColors.add(new ColorUtils.ColorInfo("color_fe4130", "#fe4130"));
        sListColors.add(new ColorUtils.ColorInfo("color_f9b547", "#F9B547"));
        sListColors.add(new ColorUtils.ColorInfo("color_7ff92d5b", "#7ff92d5b"));
        sListColors.add(new ColorUtils.ColorInfo("color_fd2c27", "#fd2c27"));
        sListColors.add(new ColorUtils.ColorInfo("color_7ffd2c27", "#7ffd2c27"));
        sListColors.add(new ColorUtils.ColorInfo("color_dd5f50", "#DD5F50"));
        sListColors.add(new ColorUtils.ColorInfo("color_e65b44", "#E65B44"));
        sListColors.add(new ColorUtils.ColorInfo("color_bb1e0f", "#BB1E0F"));
        sListColors.add(new ColorUtils.ColorInfo("color_eeeeee", "#eeeeee"));
        sListColors.add(new ColorUtils.ColorInfo("color_ff6e6e", "#ff6e6e"));
        sListColors.add(new ColorUtils.ColorInfo("color_ff4444", "#ff4444"));
        sListColors.add(new ColorUtils.ColorInfo("color_f5f8fa", "#f5f8fa"));
        sListColors.add(new ColorUtils.ColorInfo("color_e6e6e6", "#e6e6e6"));
        sListColors.add(new ColorUtils.ColorInfo("color_d2d2d2", "#d2d2d2"));
        sListColors.add(new ColorUtils.ColorInfo("color_ffe5e1", "#FFE5E1"));
        sListColors.add(new ColorUtils.ColorInfo("color_f5e3e4", "#f5e3e4"));
        sListColors.add(new ColorUtils.ColorInfo("color_fff0f0", "#fff0f0"));
        sListColors.add(new ColorUtils.ColorInfo("color_b4b4b4", "#B4B4B4"));
        sListColors.add(new ColorUtils.ColorInfo("color_e8e8e8", "#e8e8e8"));
        sListColors.add(new ColorUtils.ColorInfo("color_cacaca", "#CACACA"));
        sListColors.add(new ColorUtils.ColorInfo("color_d8d8d8", "#D8D8D8"));
        sListColors.add(new ColorUtils.ColorInfo("color_9b9b9b", "#9B9B9B"));
        sListColors.add(new ColorUtils.ColorInfo("color_c7c7c7", "#c7c7c7"));
        sListColors.add(new ColorUtils.ColorInfo("color_d7d7d7", "#D7D7D7"));
        sListColors.add(new ColorUtils.ColorInfo("color_e3e3e3", "#E3E3E3"));
        sListColors.add(new ColorUtils.ColorInfo("color_f6f6f6", "#F6F6F6"));
        sListColors.add(new ColorUtils.ColorInfo("color_cfcfcf", "#CFCFCF"));
        sListColors.add(new ColorUtils.ColorInfo("color_66555555", "#66555555"));
        sListColors.add(new ColorUtils.ColorInfo("color_555555", "#555555"));
        sListColors.add(new ColorUtils.ColorInfo("color_888888", "#888888"));
        sListColors.add(new ColorUtils.ColorInfo("color_4a4a4a", "#4A4A4A"));
        sListColors.add(new ColorUtils.ColorInfo("color_959595", "#959595"));
        sListColors.add(new ColorUtils.ColorInfo("color_333332", "#333332"));
        sListColors.add(new ColorUtils.ColorInfo("color_d84e4e", "#d84e4e"));
        sListColors.add(new ColorUtils.ColorInfo("color_c64a4a", "#c64a4a"));
        sListColors.add(new ColorUtils.ColorInfo("color_e54e4e", "#E54E4E"));
        sListColors.add(new ColorUtils.ColorInfo("color_ff2020", "#FF2020"));
        sListColors.add(new ColorUtils.ColorInfo("color_fe4545", "#FE4545"));
        sListColors.add(new ColorUtils.ColorInfo("color_f12717", "#F12717"));
        sListColors.add(new ColorUtils.ColorInfo("color_ff89ae", "#FF89AE"));
        sListColors.add(new ColorUtils.ColorInfo("color_ffe2e0", "#FFE2E0"));
        sListColors.add(new ColorUtils.ColorInfo("color_e93e3e", "#E93E3E"));
        sListColors.add(new ColorUtils.ColorInfo("color_f85d58", "#F85D58"));
        sListColors.add(new ColorUtils.ColorInfo("color_f12818", "#F12818"));
        sListColors.add(new ColorUtils.ColorInfo("color_776115", "#776115"));
        sListColors.add(new ColorUtils.ColorInfo("color_f4e8ff", "#f4e8ff"));
        sListColors.add(new ColorUtils.ColorInfo("color_8d30e3", "#8d30e3"));
        sListColors.add(new ColorUtils.ColorInfo("color_ff2e42", "#FF2E42"));
        sListColors.add(new ColorUtils.ColorInfo("color_ccff2e42", "#ccFF2E42"));
        sListColors.add(new ColorUtils.ColorInfo("color_ff814f", "#FF814F"));
        sListColors.add(new ColorUtils.ColorInfo("color_36f64c25", "#36F64C25"));
        sListColors.add(new ColorUtils.ColorInfo("color_f64c25", "#F64C25"));
        sListColors.add(new ColorUtils.ColorInfo("color_7ff64c25", "#7FF64C25"));
        sListColors.add(new ColorUtils.ColorInfo("color_ccf64c25", "#CCF64C25"));
        sListColors.add(new ColorUtils.ColorInfo("color_ee626d", "#ee626d"));
        sListColors.add(new ColorUtils.ColorInfo("color_88f64c25", "#88F64C25"));
        sListColors.add(new ColorUtils.ColorInfo("color_f5795d", "#F5795D"));
        sListColors.add(new ColorUtils.ColorInfo("color_f05f6d", "#F05F6D"));
        sListColors.add(new ColorUtils.ColorInfo("color_4b6a87", "#4B6A87"));
        sListColors.add(new ColorUtils.ColorInfo("color_99f12717", "#99F12717"));
        sListColors.add(new ColorUtils.ColorInfo("color_e66df1", "#E66DF1"));
        sListColors.add(new ColorUtils.ColorInfo("color_8d2be2", "#8D2BE2"));
        sListColors.add(new ColorUtils.ColorInfo("color_f3f3f3", "#f3f3f3"));
        sListColors.add(new ColorUtils.ColorInfo("color_f0f0f0", "#F0F0F0"));
        sListColors.add(new ColorUtils.ColorInfo("color_fafafa", "#fafafa"));
        sListColors.add(new ColorUtils.ColorInfo("color_ededed", "#EDEDED"));
        sListColors.add(new ColorUtils.ColorInfo("color_f4f4f4", "#f4f4f4"));
        sListColors.add(new ColorUtils.ColorInfo("color_eaeaea", "#EAEAEA"));
        sListColors.add(new ColorUtils.ColorInfo("color_dddddd", "#DDDDDD"));
        sListColors.add(new ColorUtils.ColorInfo("color_e7e7e7", "#e7e7e7"));
        sListColors.add(new ColorUtils.ColorInfo("color_bebebe", "#BEBEBE"));
        sListColors.add(new ColorUtils.ColorInfo("color_979797", "#979797"));
        sListColors.add(new ColorUtils.ColorInfo("color_848484", "#848484"));
        sListColors.add(new ColorUtils.ColorInfo("color_343434", "#343434"));
        sListColors.add(new ColorUtils.ColorInfo("color_252525", "#252525"));
        sListColors.add(new ColorUtils.ColorInfo("color_80000000", "#80000000"));
        sListColors.add(new ColorUtils.ColorInfo("color_777777", "#777777"));
        sListColors.add(new ColorUtils.ColorInfo("color_7f333333", "#7F333333"));
        sListColors.add(new ColorUtils.ColorInfo("color_f7f7f7", "#f7f7f7"));
        sListColors.add(new ColorUtils.ColorInfo("color_ccffffff", "#CCFFFFFF"));
        sListColors.add(new ColorUtils.ColorInfo("color_bbffffff", "#BBFFFFFF"));
        sListColors.add(new ColorUtils.ColorInfo("color_aaffffff", "#aaffffff"));
        sListColors.add(new ColorUtils.ColorInfo("color_99ffffff", "#99FFFFFF"));
        sListColors.add(new ColorUtils.ColorInfo("color_f8f8f8", "#f8f8f8"));
        sListColors.add(new ColorUtils.ColorInfo("color_f9f9f9", "#f9f9f9"));
        sListColors.add(new ColorUtils.ColorInfo("color_19cacaca", "#19cacaca"));
        sListColors.add(new ColorUtils.ColorInfo("color_00fbb828", "#00FBB828"));
        sListColors.add(new ColorUtils.ColorInfo("color_00f7f7f7", "#00F7F7F7"));
        sListColors.add(new ColorUtils.ColorInfo("color_11ffffff", "#11ffffff"));
        sListColors.add(new ColorUtils.ColorInfo("color_00ffffff", "#00ffffff"));
        sListColors.add(new ColorUtils.ColorInfo("color_55ffffff", "#55ffffff"));
        sListColors.add(new ColorUtils.ColorInfo("color_ebebeb", "#EBEBEB"));
        sListColors.add(new ColorUtils.ColorInfo("color_19999999", "#19999999"));
        sListColors.add(new ColorUtils.ColorInfo("color_19666666", "#19666666"));
        sListColors.add(new ColorUtils.ColorInfo("color_e4e4e4", "#E4E4E4"));
        sListColors.add(new ColorUtils.ColorInfo("color_19333333", "#19333333"));
        sListColors.add(new ColorUtils.ColorInfo("color_7fd8d8d8", "#7fd8d8d8"));
        sListColors.add(new ColorUtils.ColorInfo("color_19000000", "#19000000"));
        sListColors.add(new ColorUtils.ColorInfo("color_cccccc", "#cccccc"));
        sListColors.add(new ColorUtils.ColorInfo("color_cdcbcb", "#CDCBCB"));
        sListColors.add(new ColorUtils.ColorInfo("color_c0c5cc", "#c0c5cc"));
        sListColors.add(new ColorUtils.ColorInfo("color_b3b3ba", "#b3b3ba"));
        sListColors.add(new ColorUtils.ColorInfo("color_44000000", "#44000000"));
        sListColors.add(new ColorUtils.ColorInfo("color_3D000000", "#3D000000"));
        sListColors.add(new ColorUtils.ColorInfo("color_aaaaaa", "#AAAAAA"));
        sListColors.add(new ColorUtils.ColorInfo("color_4d000000", "#4D000000"));
        sListColors.add(new ColorUtils.ColorInfo("color_999999", "#999999"));
        sListColors.add(new ColorUtils.ColorInfo("color_66000000", "#66000000"));
        sListColors.add(new ColorUtils.ColorInfo("color_909399", "#909399"));
        sListColors.add(new ColorUtils.ColorInfo("color_666666", "#666666"));
        sListColors.add(new ColorUtils.ColorInfo("color_4f5154", "#4f5154"));
        sListColors.add(new ColorUtils.ColorInfo("color_565656", "#565656"));
        sListColors.add(new ColorUtils.ColorInfo("color_444444", "#444444"));
        sListColors.add(new ColorUtils.ColorInfo("color_333300", "#333300"));
        sListColors.add(new ColorUtils.ColorInfo("color_333333", "#333333"));
        sListColors.add(new ColorUtils.ColorInfo("color_88333333", "#88333333"));
        sListColors.add(new ColorUtils.ColorInfo("color_black", "#000000"));
        sListColors.add(new ColorUtils.ColorInfo("color_111111", "#111111"));
        sListColors.add(new ColorUtils.ColorInfo("color_dc000000", "#dc000000"));
        sListColors.add(new ColorUtils.ColorInfo("color_ffebeb", "#ffebeb"));
        sListColors.add(new ColorUtils.ColorInfo("color_ffe9bf", "#ffe9bf"));
        sListColors.add(new ColorUtils.ColorInfo("color_ffe4a3", "#FFE4A3"));
        sListColors.add(new ColorUtils.ColorInfo("color_f8d77a", "#F8D77A"));
        sListColors.add(new ColorUtils.ColorInfo("color_ffe48a", "#FFE48A"));
        sListColors.add(new ColorUtils.ColorInfo("color_f8d676", "#F8D676"));
        sListColors.add(new ColorUtils.ColorInfo("color_edc07a", "#EDC07A"));
        sListColors.add(new ColorUtils.ColorInfo("color_f6c064", "#F6C064"));
        sListColors.add(new ColorUtils.ColorInfo("color_f1b974", "#f1b974"));
        sListColors.add(new ColorUtils.ColorInfo("color_fbb828", "#fbb828"));
        sListColors.add(new ColorUtils.ColorInfo("color_ffbe1f", "#FFBE1F"));
        sListColors.add(new ColorUtils.ColorInfo("color_ffbe21", "#FFBE21"));
        sListColors.add(new ColorUtils.ColorInfo("color_ffb33d", "#FFB33D"));
        sListColors.add(new ColorUtils.ColorInfo("color_e5ffb33d", "#e5ffb33d"));
        sListColors.add(new ColorUtils.ColorInfo("color_f7a140", "#f7a140"));
        sListColors.add(new ColorUtils.ColorInfo("color_ffa305", "#ffa305"));
        sListColors.add(new ColorUtils.ColorInfo("color_f39800", "#F39800"));
        sListColors.add(new ColorUtils.ColorInfo("color_7f39800", "#07F39800"));
        sListColors.add(new ColorUtils.ColorInfo("color_d8a030", "#D8A030"));
        sListColors.add(new ColorUtils.ColorInfo("color_33b5e5", "#33b5e5"));
        sListColors.add(new ColorUtils.ColorInfo("color_43bffe", "#43BFFE"));
        sListColors.add(new ColorUtils.ColorInfo("color_91c5f8", "#91C5F8"));
        sListColors.add(new ColorUtils.ColorInfo("color_729fe1", "#729FE1"));
        sListColors.add(new ColorUtils.ColorInfo("color_89a3e2", "#89A3E2"));
        sListColors.add(new ColorUtils.ColorInfo("color_ff4a90e2", "#FF4A90E2"));
        sListColors.add(new ColorUtils.ColorInfo("color_2d7efb", "#2d7efb"));
        sListColors.add(new ColorUtils.ColorInfo("color_017cfc", "#017CFC"));
        sListColors.add(new ColorUtils.ColorInfo("color_007aff", "#007AFF"));
        sListColors.add(new ColorUtils.ColorInfo("color_486ac1", "#486AC1"));
        sListColors.add(new ColorUtils.ColorInfo("color_af7cfb", "#AF7CFB"));
        sListColors.add(new ColorUtils.ColorInfo("color_7c81fd", "#7C81FD"));
        sListColors.add(new ColorUtils.ColorInfo("color_19f12717", "#19F12717"));
        sListColors.add(new ColorUtils.ColorInfo("color_ffcece", "#ffcece"));
        sListColors.add(new ColorUtils.ColorInfo("color_ffb8b6", "#ffb8b6"));
        sListColors.add(new ColorUtils.ColorInfo("color_fff5f5", "#fff5f5"));
        sListColors.add(new ColorUtils.ColorInfo("color_f9a989", "#f9a989"));
        sListColors.add(new ColorUtils.ColorInfo("color_f9928f", "#F9928F"));
        sListColors.add(new ColorUtils.ColorInfo("color_fb8a81", "#FB8A81"));
        sListColors.add(new ColorUtils.ColorInfo("color_ff9871", "#FF9871"));
        sListColors.add(new ColorUtils.ColorInfo("color_e5ff814f", "#e5ff814f"));
        sListColors.add(new ColorUtils.ColorInfo("color_ff834e", "#FF834E"));
        sListColors.add(new ColorUtils.ColorInfo("color_fb9982", "#FB9982"));
        sListColors.add(new ColorUtils.ColorInfo("color_fe7563", "#FE7563"));
        sListColors.add(new ColorUtils.ColorInfo("color_f76e6e", "#F76E6E"));
        sListColors.add(new ColorUtils.ColorInfo("color_f8481f", "#F8481F"));
        sListColors.add(new ColorUtils.ColorInfo("color_e1f12717", "#E1F12717"));
        sListColors.add(new ColorUtils.ColorInfo("color_f75c57", "#f75c57"));
        sListColors.add(new ColorUtils.ColorInfo("color_ccf12717", "#CCF12717"));
        sListColors.add(new ColorUtils.ColorInfo("color_e5f64c25", "#e5f64c25"));
        sListColors.add(new ColorUtils.ColorInfo("color_fd481f", "#FD481F"));
        sListColors.add(new ColorUtils.ColorInfo("color_e5f12717", "#e5f12717"));
        sListColors.add(new ColorUtils.ColorInfo("color_f80000", "#F80000"));
        sListColors.add(new ColorUtils.ColorInfo("color_f52525", "#f52525"));
        sListColors.add(new ColorUtils.ColorInfo("color_e6f12717", "#E6F12717"));
        sListColors.add(new ColorUtils.ColorInfo("color_f74452", "#f74452"));
        sListColors.add(new ColorUtils.ColorInfo("color_d02e30", "#d02e30"));
        sListColors.add(new ColorUtils.ColorInfo("color_d4351a", "#d4351a"));
        sListColors.add(new ColorUtils.ColorInfo("color_e83d16", "#e83d16"));
        sListColors.add(new ColorUtils.ColorInfo("color_e5d4351a", "#e5d4351a"));
        sListColors.add(new ColorUtils.ColorInfo("color_e5e83d16", "#e5e83d16"));
        sListColors.add(new ColorUtils.ColorInfo("color_fd322c", "#fd322c"));
        sListColors.add(new ColorUtils.ColorInfo("color_2bcda0", "#2BCDA0"));
        sListColors.add(new ColorUtils.ColorInfo("color_008000", "#008000"));
        sListColors.add(new ColorUtils.ColorInfo("color_9bc88c", "#9bc88c"));
        sListColors.add(new ColorUtils.ColorInfo("color_f0ffec", "#f0ffec"));
        sListColors.add(new ColorUtils.ColorInfo("color_3aad4b", "#3AAD4B"));
        sListColors.add(new ColorUtils.ColorInfo("color_fcc43c", "#FCC43C"));
        sListColors.add(new ColorUtils.ColorInfo("color_88fcc43c", "#88F64C25"));
        sListColors.add(new ColorUtils.ColorInfo("color_88555555", "#88555555"));
        sListColors.add(new ColorUtils.ColorInfo("color_fef278", "#FEF278"));
        sListColors.add(new ColorUtils.ColorInfo("color_1C926B", "#1C926B"));
        sListColors.add(new ColorUtils.ColorInfo("color_fdf3d1", "#FDF3D1"));
        sListColors.add(new ColorUtils.ColorInfo("color_feb80f", "#FEB80F"));
        sListColors.add(new ColorUtils.ColorInfo("color_6403bd", "#6403BD"));
        sListColors.add(new ColorUtils.ColorInfo("color_88f39800", "#88F39800"));
        sListColors.add(new ColorUtils.ColorInfo("color_bdbdbd", "#BDBDBD"));
        sListColors.add(new ColorUtils.ColorInfo("color_dcdcdc", "#DCDCDC"));
        sListColors.add(new ColorUtils.ColorInfo("color_535151", "#535151"));
        sListColors.add(new ColorUtils.ColorInfo("color_44f64c25", "#44f64c25"));
        sListColors.add(new ColorUtils.ColorInfo("color_44e60012", "#44e60012"));
        sListColors.add(new ColorUtils.ColorInfo("color_fcaf9c", "#FCAF9C"));
        sListColors.add(new ColorUtils.ColorInfo("color_e56658", "#e56658"));
        sListColors.add(new ColorUtils.ColorInfo("color_ececec", "#ececec"));
        sListColors.add(new ColorUtils.ColorInfo("color_844400", "#844400"));
        sListColors.add(new ColorUtils.ColorInfo("color_19f64c25", "#19F64C25"));
        sListColors.add(new ColorUtils.ColorInfo("color_bbbbbb", "#BBBBBB"));
        sListColors.add(new ColorUtils.ColorInfo("color_fd8140", "#FD8140"));
        sListColors.add(new ColorUtils.ColorInfo("color_f1f1f1", "#F1F1F1"));
        sListColors.add(new ColorUtils.ColorInfo("color_fff8e6", "#FFF8E6"));
        sListColors.add(new ColorUtils.ColorInfo("color_fef7e6", "#FEF7E6"));
    }



    public static void main(String[] args) {
        Collections.sort(sListColors, new Comparator<ColorUtils.ColorInfo>() {
            @Override
            public int compare(ColorUtils.ColorInfo c1, ColorUtils.ColorInfo c2) {

                float[] hsbvals1 = new float[3];
                Color.RGBtoHSB(c1.getRed(), c1.getGreen(), c1.getBlue(), hsbvals1);

                float[] hsbvals2 = new float[3];
                Color.RGBtoHSB(c2.getRed(), c2.getGreen(), c2.getBlue(), hsbvals2);

                float diff = hsbvals1[0] - hsbvals2[0];
                if (hsbvals1[0] == 0){
                    diff = hsbvals1[1] - hsbvals2[1];
                }
//                diff = hsbvals1[2] - hsbvals2[2];

                if (diff > 0) {
                    return 1;
                } else if (diff < 0) {
                    return -1;
                }
                return 0; // 相等为 0
            }
        });

//        sortGray(sListColors);

        String xmlPath = "D:\\Android\\ASPro\\YouShi\\app\\src\\main\\res\\values\\colors.xml";

        StringBuilder builder = new StringBuilder("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        builder.append(StringUtils.NEW_LINE_STR);
        builder.append("<resources>");
        for (ColorUtils.ColorInfo colorInfo : sListColors) {
            builder.append(StringUtils.NEW_LINE_STR);
            String colorStr = "\t<color name=\"%s\">%s</color>";
            builder.append(String.format(colorStr, colorInfo.getKey(), colorInfo.getValue()));
        }
        builder.append(StringUtils.NEW_LINE_STR);
        builder.append("</resources>");

        boolean result = FileUtils.saveFile(new File(xmlPath), builder.toString().getBytes());
        System.out.println("保存结果: " + result);
    }



    // ============
    // = 颜色排序 =
    // ============

    /**
     * 以灰色值排序
     * @param lists 待排序颜色集合
     */
    public static void sortGray(final List<ColorUtils.ColorInfo> lists) {
        Collections.sort(lists, new Comparator<ColorUtils.ColorInfo>() {
            @Override
            public int compare(ColorUtils.ColorInfo c1, ColorUtils.ColorInfo c2) {
                long diff = c1.getGrayLevel() - c2.getGrayLevel();
                if (diff < 0) {
                    return 1;
                } else if (diff > 0) {
                    return -1;
                }
                return 0;
            }
        });
    }
}
