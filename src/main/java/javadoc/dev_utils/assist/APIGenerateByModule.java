package javadoc.dev_utils.assist;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import dev.utils.common.FileUtils;
import dev.utils.common.comparator.ComparatorUtils;
import javadoc.Utils;

/**
 * detail: 功能模块 API 生成
 * @author Ttt
 */
final class APIGenerateByModule {

    private APIGenerateByModule() {
    }

    // ==================
    // = 文件目录遍历实体类 =
    // ==================

    /**
     * detail: 子级节点实体类
     * @author Ttt
     */
    private static class SubNode {

        // 文件夹对象
        private final File          subFile;
        // 文件夹内的子文件列表
        private final List<SubNode> listSubs;

        /**
         * 构造函数
         * @param file  文件夹对象
         * @param lists 文件夹内的子文件列表
         */
        public SubNode(
                File file,
                List<SubNode> lists
        ) {
            this.subFile  = file;
            this.listSubs = lists;
        }

        /**
         * 获取文件夹对象
         * @return {@link File}
         */
        public File getSubFile() {
            return subFile;
        }

        /**
         * 获取文件夹内的子文件列表
         * @return {@link List}
         */
        public List<SubNode> getListSubs() {
            return listSubs;
        }
    }

    /**
     * 获取文件夹目录列表
     * @param path 文件路径
     * @return 文件夹目录列表集合
     */
    private static List<SubNode> getFolderLists(final String path) {
        List<SubNode> lists = new ArrayList<>();
        // 获取文件路径
        File baseFile = new File(path);
        // 获取子文件
        List<File> files = FileUtils.listFilesOrEmpty(baseFile);
        ComparatorUtils.sortWindowsExplorerFileSimpleComparatorAsc(files);
        for (File file : files) {
            // 属于文件夹才处理
            if (file.isDirectory()) {
                SubNode subNode = new SubNode(
                        file, getFolderLists(file.getAbsolutePath())
                );
                lists.add(subNode);
            }
        }
        return lists;
    }

    // ==========
    // = 内部方法 =
    // ==========

    /**
     * 递归循环子节点
     * @param builder                  拼接 Builder
     * @param lists                    子级节点列表
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
     */
    private static void forSubNode(
            final StringBuilder builder,
            final List<SubNode> lists,
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
        // 循环遍历
        for (SubNode subNode : lists) {
            // 获取目录名
            String name = subNode.getSubFile().getName();
            // 包名
            String apiPackageName = packageName + "." + name;

            // 特殊处理
            if (apiPackageName.startsWith(".")) {
                apiPackageName = apiPackageName.substring(1);
            }

            // 设置锚链接标记 => ## <span id="包名(无.)">**`包名`**</span>
            builder.append("\n\n\n## <span id=\"" + apiPackageName.replaceAll("\\.", "") + "\">**`" + apiPackageName + "`**</span>");

            // 获取全部文件夹
            List<File> listFiles = Utils.getFileLists((path + "/" + name));
            // 循环子节点文件
            for (File file : listFiles) {
                // 获取类名
                String className = file.getName();
                // 隐藏文件则跳过
                if (file.isHidden()) {
                    continue;
                }
                // 等于 null 才处理 => 不为 null, 则表示需要忽略
                if (!filterClassSet.contains(className)) {
                    if (className.endsWith(".kt")) {
                        continue; // kotlin 跳过
                    }
                    // 原始路径
                    String root = (path + "/" + name) + "/";
                    // 拼接最后点击 url
                    String clickUrl = githubUrl + "/" + name + "/" + className;
                    // 防止有多余的 /
                    if (clickUrl.lastIndexOf("//") > 6) { // https:// 大于 6 位表示还有除 https:// 外的 //
                        // 保存替换后的内容
                        clickUrl = clickUrl.replaceAll("//", "/");
                        // 进行处理
                        StringBuilder urlBuilder = new StringBuilder(clickUrl);
                        urlBuilder.insert(6, "/");
                        clickUrl = urlBuilder.toString();
                    }
                    // 获取 MarkDown 格式 dev.utils
                    String apiMarkDown = APIReader.readDoc(
                            root, className, clickUrl,
                            filterMethodMap, methodNameRegex,
                            methodNameMatchesMap, methodRepeatBuilder,
                            methodNotAnnotateBuilder, notMethodBuilder
                    );
                    // 拼接保存数据
                    builder.append(apiMarkDown);
                }
            }

            // 判断是否存在子文件夹
            if (subNode.getListSubs().size() != 0) {
                forSubNode(
                        builder, subNode.getListSubs(),
                        path + "/" + name,
                        packageName + "." + name,
                        githubUrl + "/" + name,
                        filterClassSet, filterMethodMap,
                        methodNameRegex, methodNameMatchesMap,
                        methodRepeatBuilder, methodNotAnnotateBuilder,
                        notMethodBuilder
                );
            }
        }
    }

    // =============
    // = 对外公开方法 =
    // =============

    /**
     * 生成指定模块 API 数据
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
     * @return 指定模块 API 数据
     */
    public static String apiGenerate(
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
        // 拼接信息
        StringBuilder builder = new StringBuilder();
        // 递归循环子节点
        forSubNode(
                builder, getFolderLists(path), path,
                packageName, githubUrl,
                filterClassSet, filterMethodMap,
                methodNameRegex, methodNameMatchesMap,
                methodRepeatBuilder, methodNotAnnotateBuilder,
                notMethodBuilder
        );
        // 返回数据
        return builder.toString();
    }
}