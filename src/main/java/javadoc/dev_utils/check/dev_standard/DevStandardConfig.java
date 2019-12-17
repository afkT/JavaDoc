package javadoc.dev_utils.check.dev_standard;

import javadoc.Utils;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * detail: 代码检测分析配置
 * @author Ttt
 */
final class DevStandardConfig {

    private DevStandardConfig() {
    }

    // 忽略指定方法 @param 处理
    protected static final HashMap<String, ArrayList<String>> sIgnoreAnnotateMap = new HashMap<>();
    // 忽略指定方法参数 final 修饰符
    protected static final HashMap<String, ArrayList<String>> sIgnoreFinalMap = new HashMap<>();
    // 忽略指定方法 static 修饰符
    protected static final HashMap<String, ArrayList<String>> sIgnoreStaticMap = new HashMap<>();
    // 忽略指定方法 @param 处理
    protected static final HashMap<String, ArrayList<String>> sIgnoreParamMap = new HashMap<>();
    // 忽略指定方法 @return 处理
    protected static final HashMap<String, ArrayList<String>> sIgnoreReturnMap = new HashMap<>();
    // 忽略指定方法非 public 处理
    protected static final HashMap<String, ArrayList<String>> sIgnoreUnPublicMap = new HashMap<>();
    // 忽略无修饰符变量 处理
    protected static final HashMap<String, ArrayList<String>> sIgnoreModifierVariableMap = new HashMap<>();
    // 忽略指定方法 return void 处理
    protected static final HashMap<String, ArrayList<String>> sIgnoreReturnVoidMap = new HashMap<>();

    // ==========
    // = 初始化 =
    // ==========

    static {
        // 初始化 忽略指定方法注释处理
        initIgnoreAnnotateMap();
        // 初始化 忽略指定方法参数 final 修饰符
        initIgnoreFinalMap();
        // 初始化 忽略指定方法 static 修饰符
        initIgnoreStaticMap();
        // 初始化 忽略指定方法 @param 处理
        initIgnoreParamMap();
        // 初始化 忽略指定方法 @return 处理
        initIgnoreReturnMap();
        // 初始化 忽略指定方法非 public 处理
        initIgnoreUnPublicMap();
        // 初始化 忽略无修饰符变量 处理
        initIgnoreModifierVariableMap();
        // 初始化 忽略指定方法 return void 处理
        initIgnoreReturnVoidMap();
    }

    /**
     * 初始化 忽略指定方法注释处理
     */
    private static void initIgnoreAnnotateMap() {
        sIgnoreAnnotateMap.put("ColorSortMain", Utils.asList("main"));
        sIgnoreAnnotateMap.put("ColorSortMain.SAXXml.SAXDemoHandel", Utils.asList("startDocument","endDocument","startElement","endElement","characters"));
    }

    /**
     * 初始化 忽略指定方法参数 final 修饰符
     */
    private static void initIgnoreFinalMap() {
        sIgnoreFinalMap.put("ColorSortMain", Utils.asList("main"));
        sIgnoreFinalMap.put("ColorSortMain.SAXXml.SAXDemoHandel", Utils.asList("startElement","endElement","characters"));
    }

    /**
     * 初始化 忽略指定方法 static 修饰符
     */
    private static void initIgnoreStaticMap() {
        sIgnoreStaticMap.put("ColorSortMain.SAXXml", Utils.asList("analysisColorsXml"));
        sIgnoreStaticMap.put("ColorSortMain.SAXXml.SAXDemoHandel", Utils.asList("startDocument","endDocument","startElement","endElement","characters"));
    }

    /**
     * 初始化 忽略指定方法 @param 处理
     */
    private static void initIgnoreParamMap() {
        sIgnoreParamMap.put("ColorSortMain", Utils.asList("main"));
        sIgnoreParamMap.put("ColorSortMain.SAXXml.SAXDemoHandel", Utils.asList("startElement","endElement","characters"));
    }

    /**
     * 初始化 忽略指定方法 @return 处理
     */
    private static void initIgnoreReturnMap() {
    }

    /**
     * 初始化 忽略指定方法非 public 处理
     */
    private static void initIgnoreUnPublicMap() {
        sIgnoreUnPublicMap.put("ColorSortMain.SAXXml.DocumentListener", Utils.asList("OnEnd"));
    }

    /**
     * 初始化 忽略无修饰符变量 处理
     */
    private static void initIgnoreModifierVariableMap() {
    }

    /**
     * 初始化 忽略指定方法 return void 处理
     */
    private static void initIgnoreReturnVoidMap() {
    }
}