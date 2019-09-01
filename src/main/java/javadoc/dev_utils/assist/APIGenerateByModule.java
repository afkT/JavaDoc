package javadoc.dev_utils.assist;

import javadoc.Utils;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * detail: 功能模块 API 生成
 * @author Ttt
 */
final class APIGenerateByModule {

    private APIGenerateByModule() {
    }

    // ======================
    // = 文件目录遍历实体类 =
    // ======================

    /**
     * detail: 子级节点实体类
     * @author Ttt
     */
    private static class Subnode {

        // 文件夹对象
        private File subFile;
        // 文件夹内的子文件列表
        private ArrayList<Subnode> listSubs = new ArrayList<>();

        /**
         * 构造函数
         * @param file  文件夹对象
         * @param lists 文件夹内的子文件列表
         */
        public Subnode(File file, ArrayList<Subnode> lists) {
            this.subFile = file;
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
         * @return {@link ArrayList}
         */
        public ArrayList<Subnode> getListSubs() {
            return listSubs;
        }
    }

    /**
     * 获取文件夹目录列表
     * @param path 文件路径
     * @return 文件夹目录列表集合
     */
    private static ArrayList<Subnode> getFolderLists(final String path) {
        ArrayList<Subnode> lists = new ArrayList<>();
        // 获取文件路径
        File baseFile = new File(path);
        // 获取子文件
        File[] files = baseFile.listFiles();
        for (File file : files) {
            // 属于文件夹才处理
            if (file.isDirectory()) {
                Subnode subnode = new Subnode(file, getFolderLists(file.getAbsolutePath()));
                lists.add(subnode);
            }
        }
        return lists;
    }

    // ============
    // = 内部方法 =
    // ============

    /**
     * 递归循环子节点
     * @param buffer                  拼接 Buffer
     * @param lists                   子级节点列表
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
     */
    private static void forSubnode(final StringBuffer buffer, final ArrayList<Subnode> lists,
                                   final String path, final String packageName, final String githubUrl,
                                   final HashMap<String, String> filterClassMap,
                                   final HashMap<String, String[]> filterMethodMap,
                                   final String methodNameRegex,
                                   final HashMap<String, ArrayList<String>> methodNameMatchesMap,
                                   final StringBuffer methodRepeatBuffer,
                                   final StringBuffer methodNotAnnotateBuffer,
                                   final StringBuffer notMethodBuffer) {
        // 循环遍历
        for (int i = 0, len = lists.size(); i < len; i++) {
            // 获取子节点
            Subnode subnode = lists.get(i);
            // 获取目录名
            String name = subnode.getSubFile().getName();

            // 设置锚链接标记 => ## <span id="包名(无.)">**`包名`**</span>
            buffer.append("\n\n\n## <span id=\"" + (packageName + "." + name).replaceAll("\\.", "") + "\">**`" + (packageName + "." + name) + "`**</span>");

            // 获取全部文件夹
            ArrayList<File> listFiles = Utils.getFileLists((path + "/" + name));
            // 循环子节点文件
            for (File file : listFiles) {
                // 获取类名
                String className = file.getName();
                // 等于 null 才处理 => 不为 null, 则表示需要忽略
                if (filterClassMap.get(className) == null) {
                    // 原始路径
                    String root = (path + "/" + name) + "/";
                    // 拼接最后点击 url
                    String clickUrl = githubUrl + "/" + name + "/" + className;
                    // 防止有多余的 /
                    if (clickUrl.lastIndexOf("//") > 6) { // https:// 大于 6 位表示还有除 https:// 外的 //
                        // 保存替换后的内容
                        clickUrl = clickUrl.replaceAll("//", "/");
                        // 进行处理
                        StringBuffer urlBuffer = new StringBuffer(clickUrl);
                        urlBuffer.insert(6, "/");
                        clickUrl = urlBuffer.toString();
                    }
                    // 获取 MarkDown 格式 dev.utils
                    String apiMarkDown = APIReader.readDoc(root, className, clickUrl, filterMethodMap,
                            methodNameRegex, methodNameMatchesMap, methodRepeatBuffer, methodNotAnnotateBuffer, notMethodBuffer);
                    // 拼接保存数据
                    buffer.append(apiMarkDown);
                }
            }

            // 判断是否存在子文件夹
            if (subnode.getListSubs().size() != 0) {
                forSubnode(buffer, subnode.getListSubs(),
                        path + "/" + name, packageName + "." + name, githubUrl + "/" + name,
                        filterClassMap, filterMethodMap, methodNameRegex, methodNameMatchesMap,
                        methodRepeatBuffer, methodNotAnnotateBuffer, notMethodBuffer);
            }
        }
    }

    // ================
    // = 对外公开方法 =
    // ================

    /**
     * 生成指定模块 API 数据
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
     * @return 指定模块 API 数据
     */
    public static String apiGenerate(final String path, final String packageName, final String githubUrl,
                                     final HashMap<String, String> filterClassMap,
                                     final HashMap<String, String[]> filterMethodMap,
                                     final String methodNameRegex,
                                     final HashMap<String, ArrayList<String>> methodNameMatchesMap,
                                     final StringBuffer methodRepeatBuffer,
                                     final StringBuffer methodNotAnnotateBuffer,
                                     final StringBuffer notMethodBuffer) {
        // 拼接信息
        StringBuffer buffer = new StringBuffer();
        // 递归循环子节点
        forSubnode(buffer, getFolderLists(path), path, packageName, githubUrl,
                filterClassMap, filterMethodMap, methodNameRegex, methodNameMatchesMap,
                methodRepeatBuffer, methodNotAnnotateBuffer, notMethodBuffer);
        // 返回数据
        return buffer.toString();
    }
}
