package javadoc.dev_utils.check.dev_app;

import dev.utils.common.MapUtils;
import javadoc.Utils;
import javadoc.dev_utils.ApiConfig;
import javadoc.dev_utils.check.CodeAnalyeReader;
import javadoc.dev_utils.check.CodeAnnotationAnalyeRecord;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * detail: 代码读取检测分析 Main 方法
 * @author Ttt
 */
class DevAppMain {

    public static void main(String[] args) {
        // 本地文件路径
        String path = ApiConfig.DEV_APP_PATH;
        // 本地文件路径
        path = ApiConfig.DEV_APP_PATH + "utils/";

        // 判断是否使用 ArrayList<File>
        boolean isLists = false;
        // 判断是否覆盖文件内容
        boolean coverText = true;

        // =

        // 检测代码规范
        final ArrayList<HashMap<String, ArrayList<String>>> lists;
        // 代码注释间距检测
        final HashMap<String, String> sAnnotationSpaceMap;

        if (isLists) {
            final ArrayList<File> listFiles = new ArrayList<>();
//            // 根目录三个工具类
//            listFiles.add(new File(ApiConfig.DEV_APP_PATH + "DevUtils.java"));
//            listFiles.add(new File(ApiConfig.DEV_APP_PATH + "utils/JCLogUtils.java"));
//            listFiles.add(new File(ApiConfig.DEV_APP_PATH + "utils/LogPrintUtils.java"));

            // 检测代码规范
            lists = CodeAnalyeReader.codeAnalye(listFiles);
            // 代码注释间距检测记录
            sAnnotationSpaceMap = CodeAnnotationAnalyeRecord.codeAnalye(listFiles, coverText);
        } else {
            // 检测代码规范
            lists = CodeAnalyeReader.codeAnalye(path);
            // 代码注释间距检测
            sAnnotationSpaceMap = CodeAnnotationAnalyeRecord.codeAnalye(path, coverText);
        }

        // ============
        // = 代码间距 =
        // ============

        // 代码注释重复换行记录
        final HashMap<String, ArrayList<String>> sAnnotationRepeatLineMap = CodeAnnotationAnalyeRecord.getAnnotationRepeatLineMap();

        // 忽略处理
        DevAppConfig.ignoreAnnotationSpaceMap(sAnnotationSpaceMap);

        // 转换 JSON 数据 - 代码注释间距检测记录
        String annotationSpaceJSON = Utils.toJsonFormat(sAnnotationSpaceMap, true);

        // 转换 JSON 数据 - 代码注释重复换行记录
        String annotationRepeatLineJSON = Utils.toJsonFormat(sAnnotationRepeatLineMap, true);

        // ============
        // = 结果处理 =
        // ============

        // 方法注释缺少注释记录
        final HashMap<String, ArrayList<String>> sMethodUnAnnotateMap = lists.get(0);
        // 方法中参数未添加 final 记录
        final HashMap<String, ArrayList<String>> sParamUnFinalMap = lists.get(1);
        // 方法非 static 记录
        final HashMap<String, ArrayList<String>> sMethodUnStaticMap = lists.get(2);
        // 方法注释缺少 @param 记录
        final HashMap<String, ArrayList<String>> sMethodLackParamMap = lists.get(3);
        // 方法注释缺少 @return 记录
        final HashMap<String, ArrayList<String>> sMethodLackReturnMap = lists.get(4);
        // 方法存在 @param 但缺少注释记录
        final HashMap<String, ArrayList<String>> sMethodUnAnnotateParamMap = lists.get(5);
        // 方法存在 @return 但缺少注释记录
        final HashMap<String, ArrayList<String>> sMethodUnAnnotateReturnMap = lists.get(6);
        // 非 public 方法记录
        final HashMap<String, ArrayList<String>> sMethodUnPublicMap = lists.get(7);
        // 无修饰符变量 记录
        final HashMap<String, ArrayList<String>> sNoModifierVariableMap = lists.get(8);

        // =

        // 忽略处理
        MapUtils.removeToMap(sMethodUnAnnotateMap, DevAppConfig.sIgnoreAnnotateMap);
        // 转换 JSON 数据 - 缺少注释的方法
        String unAnnotateJSON = Utils.toJsonFormat(sMethodUnAnnotateMap, true);
        // 转换 Map 字符串
        String unAnnotateGenerateMapString = Utils.generateMapString(sMethodUnAnnotateMap, "sIgnoreAnnotateMap");

        // =

        // 忽略处理
        MapUtils.removeToMap(sParamUnFinalMap, DevAppConfig.sIgnoreFinalMap);
        // 转换 JSON 数据 - 缺少 final 修饰的方法(参数)
        String unFinalJSON = Utils.toJsonFormat(sParamUnFinalMap, true);
        // 转换 Map 字符串
        String unFinalGenerateMapString = Utils.generateMapString(sParamUnFinalMap, "sIgnoreFinalMap");

        // =

        // 忽略处理
        MapUtils.removeToMap(sMethodUnStaticMap, DevAppConfig.sIgnoreStaticMap);
        // 转换 JSON 数据 - 缺少 static 修饰的方法
        String unStaticJSON = Utils.toJsonFormat(sMethodUnStaticMap, true);
        // 转换 Map 字符串
        String unStaticGenerateMapString = Utils.generateMapString(sMethodUnStaticMap, "sIgnoreStaticMap");

        // =

        // 忽略处理
        MapUtils.removeToMap(sMethodLackParamMap, DevAppConfig.sIgnoreParamMap);
        // 转换 JSON 数据 - 缺少 @param 的方法
        String lackParamJSON = Utils.toJsonFormat(sMethodLackParamMap, true);
        // 转换 Map 字符串
        String lackParamGenerateMapString = Utils.generateMapString(sMethodLackParamMap, "sIgnoreParamMap");

        // =

        // 忽略处理
        MapUtils.removeToMap(sMethodLackReturnMap, DevAppConfig.sIgnoreReturnMap);
        // 转换 JSON 数据 - 缺少 @return 的方法
        String lackReturnJSON = Utils.toJsonFormat(sMethodLackReturnMap, true);
        // 转换 Map 字符串
        String lackReturnGenerateMapString = Utils.generateMapString(sMethodLackReturnMap, "sIgnoreReturnMap");

        // =

        // 转换 JSON 数据 - 存在 @param 但缺少注释的方法
        String unAnnotateParamJSON = Utils.toJsonFormat(sMethodUnAnnotateParamMap, true);

        // =

        // 转换 JSON 数据 - 存在 @return 但缺少注释的方法
        String unAnnotateReturnJSON = Utils.toJsonFormat(sMethodUnAnnotateReturnMap, true);

        // =

        // 忽略处理
        MapUtils.removeToMap(sMethodUnPublicMap, DevAppConfig.sIgnoreUnPublicMap);
        // 转换 JSON 数据 - 非 public 方法记录
        String methodUnPublicJSON = Utils.toJsonFormat(sMethodUnPublicMap, true);
        // 转换 Map 字符串
        String methodUnPublicGenerateMapString = Utils.generateMapString(sMethodUnPublicMap, "sIgnoreUnPublicMap");

        // =

        // 忽略处理
        MapUtils.removeToMap(sNoModifierVariableMap, DevAppConfig.sIgnoreModifierVariableMap);
        // 转换 JSON 数据 - 无修饰符变量 记录
        String noModifierVariableJSON = Utils.toJsonFormat(sNoModifierVariableMap, true);
        // 转换 Map 字符串
        String noModifierVariableGenerateMapString = Utils.generateMapString(sNoModifierVariableMap, "sIgnoreModifierVariableMap");

        // =

        // 统一拼接打印数据
        LinkedHashMap<String, HashMap<String, ArrayList<String>>> printMap = new LinkedHashMap<>();
        printMap.put("1.缺少注释的方法", sMethodUnAnnotateMap);
        printMap.put("2.缺少 final 修饰的方法(参数)", sParamUnFinalMap);
        printMap.put("3.缺少 static 修饰的方法", sMethodUnStaticMap);
        printMap.put("4.缺少 @param 的方法", sMethodLackParamMap);
        printMap.put("5.缺少 @return 的方法", sMethodLackReturnMap);
        printMap.put("6.存在 @param 但缺少注释的方法", sMethodUnAnnotateParamMap);
        printMap.put("7.存在 @return 但缺少注释的方法", sMethodUnAnnotateReturnMap);
        printMap.put("8.非 public 方法记录", sMethodUnPublicMap);
        printMap.put("8.无修饰符变量记录", sNoModifierVariableMap);
        printMap.put("9.代码注释重复换行记录", sAnnotationRepeatLineMap);

        // 转换 JSON 数据
        String mapJSON = Utils.toJsonFormat(printMap, true);

        System.out.println(mapJSON);
    }
}
