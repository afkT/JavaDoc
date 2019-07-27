package javadoc.dev_utils.assist;

import javadoc.Utils;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * detail: Api 生成
 * @author Ttt
 */
public class APIGenerate {

    /**
     * 快捷生成方法
     * @param module                  模块名
     * @param path                    文件路径
     * @param packageName             包名
     * @param githubUrl               Github 链接地址
     * @param filterClassMap          忽略不保存的类 Map
     * @param filterMethodMap         忽略不保存方法 Map
     * @param methodNameRegex         方法名匹配正则表达式
     * @param methodNameMatchesMap    方法名匹配存储 Map
     * @param methodRepeatBuffer      方法名重复记录存储 Buffer
     * @param methodNotAnnotateBuffer 方法没有注释记录存储 Buffer
     * @param notMethodBuffer         类不存在方法记录存储 Buffer
     * @return API 生成信息
     */
    public static String apiGenerate(final String module, final String path, final String packageName, final String githubUrl,
                                     final HashMap<String, String> filterClassMap,
                                     final HashMap<String, String[]> filterMethodMap,
                                     final String methodNameRegex,
                                     final HashMap<String, ArrayList<String>> methodNameMatchesMap,
                                     final StringBuffer methodRepeatBuffer,
                                     final StringBuffer methodNotAnnotateBuffer,
                                     final StringBuffer notMethodBuffer) {
        // 文件路径
        String apiPath = path + module + "/";
        // 包名
        String apiPackageName = packageName + "." + module;
        // Github 链接地址
        String apiGitHubUrl = githubUrl + module + "/";

        // 拼接对象
        StringBuffer buffer = new StringBuffer();
        // 设置锚链接标记 => ## <span id="包名(无.)">**`包名`**</span>
        buffer.append("\n## <span id=\"" + apiPackageName.replaceAll("\\.", "") + "\">**`" + apiPackageName + "`**</span>");

        // 获取全部文件夹
        ArrayList<File> lists = Utils.getFileLists(apiPath);
        // 循环子文件
        for (File file : lists) {
            // 获取类名
            String className = file.getName();
            // 等于 null 才处理 => 不为 null, 则表示需要忽略
            if (filterClassMap.get(className) == null) {
                // 原始路径
                String root = apiPath;
                // 获取 MarkDown 格式 dev.utils
                String apiMarkDown = APIReader.readDoc(root, className, apiGitHubUrl + className, filterMethodMap,
                        methodNameRegex, methodNameMatchesMap, methodRepeatBuffer, methodNotAnnotateBuffer, notMethodBuffer);
                // 拼接保存
                buffer.append(apiMarkDown);
            }
        }
        // 保存 module 目录下的文件夹子节点
        buffer.append(APIGenerateByModule.apiGenerate(apiPath, apiPackageName, apiGitHubUrl,
                filterClassMap, filterMethodMap, methodNameRegex, methodNameMatchesMap,
                methodRepeatBuffer, methodNotAnnotateBuffer, notMethodBuffer));
        // 返回对应模块的 API 信息
        return buffer.toString();
    }
}
