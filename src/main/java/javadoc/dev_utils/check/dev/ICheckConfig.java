package javadoc.dev_utils.check.dev;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * detail: 代码检测分析配置接口
 * @author Ttt
 */
public interface ICheckConfig {

    /**
     * 获取忽略指定方法注释配置
     * @return 忽略配置 Map
     */
    Map<String, ArrayList<String>> getIgnoreAnnotateMap();

    /**
     * 获取忽略指定方法参数 final 修饰符配置
     * @return 忽略配置 Map
     */
    Map<String, ArrayList<String>> getIgnoreFinalMap();

    /**
     * 获取忽略指定方法 static 修饰符配置
     * @return 忽略配置 Map
     */
    Map<String, ArrayList<String>> getIgnoreStaticMap();

    /**
     * 获取忽略指定方法 @param 处理配置
     * @return 忽略配置 Map
     */
    Map<String, ArrayList<String>> getIgnoreParamMap();

    /**
     * 获取忽略指定方法 @return 处理配置
     * @return 忽略配置 Map
     */
    Map<String, ArrayList<String>> getIgnoreReturnMap();

    /**
     * 获取忽略指定方法非 public 处理配置
     * @return 忽略配置 Map
     */
    Map<String, ArrayList<String>> getIgnoreUnPublicMap();

    /**
     * 获取忽略无修饰符变量处理配置
     * @return 忽略配置 Map
     */
    Map<String, ArrayList<String>> getIgnoreModifierVariableMap();

    /**
     * 获取忽略指定方法 return void 处理配置
     * @return 忽略配置 Map
     */
    Map<String, ArrayList<String>> getIgnoreReturnVoidMap();

    /**
     * 忽略注释间距异常文件
     * @param map {@link HashMap}
     */
    void ignoreAnnotationSpaceMap(Map<String, String> map);
}