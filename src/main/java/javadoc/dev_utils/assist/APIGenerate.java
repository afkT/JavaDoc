package javadoc.dev_utils.assist;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import dev.utils.common.StringUtils;
import javadoc.Utils;

/**
 * detail: Api 生成
 * @author Ttt
 */
public class APIGenerate {

    /**
     * 快捷生成方法
     * @param module                   模块名
     * @param path                     文件路径
     * @param packageName              包名
     * @param githubUrl                Github 链接地址
     * @param filterClassSet           忽略不保存的类 Set
     * @param filterMethodMap          忽略不保存方法 Map
     * @param methodNameRegex          方法名匹配正则表达式
     * @param methodNameMatchesMap     方法名匹配存储 Map
     * @param methodRepeatBuilder      方法名重复记录存储 Builder
     * @param methodNotAnnotateBuilder 方法没有注释记录存储 Builder
     * @param notMethodBuilder         类不存在方法记录存储 Builder
     * @return API 生成信息
     */
    public static String apiGenerate(
            final String module,
            final String path,
            final String packageName,
            final String githubUrl,
            final HashSet<String> filterClassSet,
            final HashMap<String, String[]> filterMethodMap,
            final String methodNameRegex,
            final HashMap<String, List<String>> methodNameMatchesMap,
            final StringBuilder methodRepeatBuilder,
            final StringBuilder methodNotAnnotateBuilder,
            final StringBuilder notMethodBuilder
    ) {
        // 文件路径
        String apiPath = path + module + "/";
        // 包名
        String apiPackageName = packageName + "." + module;
        // Github 链接地址
        String apiGitHubUrl = githubUrl + module + "/";

        // 特殊处理
        if (StringUtils.isEmpty(module)) {
            apiPackageName = packageName;
        }
        if (apiPackageName.startsWith(".")) {
            apiPackageName = apiPackageName.substring(1);
        }
        // 拼接对象
        StringBuilder builder = new StringBuilder();

        if (StringUtils.isNotEmpty(apiPackageName)) {
            // 设置锚链接标记 => ## <span id="包名(无.)">**`包名`**</span>
            builder.append("\n## <span id=\"" + apiPackageName.replaceAll("\\.", "") + "\">**`" + apiPackageName + "`**</span>");
        }

        // 获取全部文件夹
        List<File> lists = Utils.getFileLists(apiPath);
        // 循环子文件
        for (File file : lists) {
            // 获取类名
            String className = file.getName();
            // 等于 null 才处理 => 不为 null, 则表示需要忽略
            if (!filterClassSet.contains(className)) {
                if (className.endsWith(".kt")) {
                    continue; // kotlin 跳过
                }
                // 原始路径
                String root = apiPath;
                // 获取 MarkDown 格式 dev.utils
                String apiMarkDown = APIReader.readDoc(root, className, apiGitHubUrl + className, filterMethodMap,
                        methodNameRegex, methodNameMatchesMap, methodRepeatBuilder, methodNotAnnotateBuilder, notMethodBuilder);
                // 拼接保存
                builder.append(apiMarkDown);
            }
        }
        // 保存 module 目录下的文件夹子节点
        builder.append(APIGenerateByModule.apiGenerate(apiPath, apiPackageName, apiGitHubUrl,
                filterClassSet, filterMethodMap, methodNameRegex, methodNameMatchesMap,
                methodRepeatBuilder, methodNotAnnotateBuilder, notMethodBuilder));
        // 返回对应模块的 API 信息
        return builder.toString();
    }
}