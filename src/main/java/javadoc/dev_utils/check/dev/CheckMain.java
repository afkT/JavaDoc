package javadoc.dev_utils.check.dev;

import dev.utils.common.MapUtils;
import javadoc.Utils;
import javadoc.dev_utils.check.CodeAnalyeReader;
import javadoc.dev_utils.check.CodeAnnotationAnalyeRecord;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * detail: 代码读取检测分析入口方法
 * @author Ttt
 */
public final class CheckMain {

    private CheckMain(){
    }

    /**
     * 执行检测方法
     * @param checkInfo 检测信息实体类
     * @return 检测结果 JSON String
     */
    public static String execute(final CheckInfo checkInfo) {
        // 代码检测分析配置接口
        ICheckConfig checkConfig = checkInfo.mICheckConfig;
        // 本地文件路径
        String path = checkInfo.mPath;
        // 检测代码规范
        final ArrayList<HashMap<String, ArrayList<String>>> lists;
        // 代码注释间距检测
        final HashMap<String, String> sAnnotationSpaceMap;

        if (checkInfo.mIsLists) {
            final ArrayList<File> listFiles = new ArrayList<>();
            // 保存指定文件集合
            if (checkInfo.mListFiles != null) {
                listFiles.addAll(checkInfo.mListFiles);
            }
            // 检测代码规范
            lists = CodeAnalyeReader.codeAnalye(listFiles);
            // 代码注释间距检测记录
            sAnnotationSpaceMap = CodeAnnotationAnalyeRecord.codeAnalye(listFiles, checkInfo.mCoverText);
        } else {
            // 检测代码规范
            lists = CodeAnalyeReader.codeAnalye(path);
            // 代码注释间距检测
            sAnnotationSpaceMap = CodeAnnotationAnalyeRecord.codeAnalye(path, checkInfo.mCoverText);
        }

        // ============
        // = 代码间距 =
        // ============

        // 代码注释重复换行记录
        final HashMap<String, ArrayList<String>> sAnnotationRepeatLineMap = CodeAnnotationAnalyeRecord.getAnnotationRepeatLineMap();

        // 忽略处理
        checkConfig.ignoreAnnotationSpaceMap(sAnnotationSpaceMap);

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
        // 方法返回值 void 记录
        final HashMap<String, ArrayList<String>> sMethodReturnVoidMap = lists.get(9);

        // =

        // 忽略处理
        MapUtils.removeToMap(sMethodUnAnnotateMap, checkConfig.getIgnoreAnnotateMap());
        // 转换 JSON 数据 - 缺少注释的方法
        String unAnnotateJSON = Utils.toJsonFormat(sMethodUnAnnotateMap, true);
        // 转换 Map 字符串
        String unAnnotateGenerateMapString = Utils.generateMapString(sMethodUnAnnotateMap, "ignoreAnnotateMap");

        // =

        // 忽略处理
        MapUtils.removeToMap(sParamUnFinalMap, checkConfig.getIgnoreFinalMap());
        // 转换 JSON 数据 - 缺少 final 修饰的方法(参数)
        String unFinalJSON = Utils.toJsonFormat(sParamUnFinalMap, true);
        // 转换 Map 字符串
        String unFinalGenerateMapString = Utils.generateMapString(sParamUnFinalMap, "ignoreFinalMap");

        // =

        // 忽略处理
        MapUtils.removeToMap(sMethodUnStaticMap, checkConfig.getIgnoreStaticMap());
        // 转换 JSON 数据 - 缺少 static 修饰的方法
        String unStaticJSON = Utils.toJsonFormat(sMethodUnStaticMap, true);
        // 转换 Map 字符串
        String unStaticGenerateMapString = Utils.generateMapString(sMethodUnStaticMap, "ignoreStaticMap");

        // =

        // 忽略处理
        MapUtils.removeToMap(sMethodLackParamMap, checkConfig.getIgnoreParamMap());
        // 转换 JSON 数据 - 缺少 @param 的方法
        String lackParamJSON = Utils.toJsonFormat(sMethodLackParamMap, true);
        // 转换 Map 字符串
        String lackParamGenerateMapString = Utils.generateMapString(sMethodLackParamMap, "ignoreParamMap");

        // =

        // 忽略处理
        MapUtils.removeToMap(sMethodLackReturnMap, checkConfig.getIgnoreReturnMap());
        // 转换 JSON 数据 - 缺少 @return 的方法
        String lackReturnJSON = Utils.toJsonFormat(sMethodLackReturnMap, true);
        // 转换 Map 字符串
        String lackReturnGenerateMapString = Utils.generateMapString(sMethodLackReturnMap, "ignoreReturnMap");

        // =

        // 转换 JSON 数据 - 存在 @param 但缺少注释的方法
        String unAnnotateParamJSON = Utils.toJsonFormat(sMethodUnAnnotateParamMap, true);

        // =

        // 转换 JSON 数据 - 存在 @return 但缺少注释的方法
        String unAnnotateReturnJSON = Utils.toJsonFormat(sMethodUnAnnotateReturnMap, true);

        // =

        // 忽略处理
        MapUtils.removeToMap(sMethodUnPublicMap, checkConfig.getIgnoreUnPublicMap());
        // 转换 JSON 数据 - 非 public 方法记录
        String methodUnPublicJSON = Utils.toJsonFormat(sMethodUnPublicMap, true);
        // 转换 Map 字符串
        String methodUnPublicGenerateMapString = Utils.generateMapString(sMethodUnPublicMap, "ignoreUnPublicMap");

        // =

        // 忽略处理
        MapUtils.removeToMap(sNoModifierVariableMap, checkConfig.getIgnoreModifierVariableMap());
        // 转换 JSON 数据 - 无修饰符变量 记录
        String noModifierVariableJSON = Utils.toJsonFormat(sNoModifierVariableMap, true);
        // 转换 Map 字符串
        String noModifierVariableGenerateMapString = Utils.generateMapString(sNoModifierVariableMap, "ignoreModifierVariableMap");

        // =

        // 忽略处理
        MapUtils.removeToMap(sMethodReturnVoidMap, checkConfig.getIgnoreReturnVoidMap());
        // 转换 JSON 数据 - 方法返回值 void 记录
        String methodReturnVoidJSON = Utils.toJsonFormat(sMethodReturnVoidMap, true);
        // 转换 Map 字符串
        String methodReturnVoidGenerateMapString = Utils.generateMapString(sMethodReturnVoidMap, "ignoreReturnVoidMap");

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

        // 判断是否打印
        if (checkInfo.mIsPrintVoid) {
            printMap.put("10.方法返回值 void 记录", sMethodReturnVoidMap);
        }

        // 转换 JSON 数据
        String mapJSON = Utils.toJsonFormat(printMap, true);
        System.out.println(mapJSON);
        return mapJSON;
    }
}
