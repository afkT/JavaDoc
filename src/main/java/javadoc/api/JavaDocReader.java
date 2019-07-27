package javadoc.api;

import com.sun.javadoc.ClassDoc;
import com.sun.javadoc.RootDoc;

/**
 * detail: JavaDoc 读取类
 * @author Ttt
 */
public final class JavaDocReader {

    private JavaDocReader() {
    }

    // Doc 信息临时存储
    private static RootDoc mRoot;

    /**
     * detail: 一个简单 Doclet, 收到 RootDoc 对象保存起来供后续使用
     * @author Ttt
     */
    public static class Doclet {

        public Doclet() {
        }

        /**
         * Doclet 中, 方法 start 必须为静态
         * @param root {@link RootDoc}
         * @return true
         */
        public static boolean start(final RootDoc root) {
            mRoot = root;
            return true;
        }
    }

    // ================
    // = 回调通知接口 =
    // ================

    /**
     * detail: 读取回调
     * @author Ttt
     */
    public interface CallBack {

        /**
         * 回调通知
         * @param path      文件路径
         * @param className 文件名 ( 类名 )
         * @param rootDoc   根 Doc 信息
         * @param classDocs 类 Doc 信息
         * @return 处理后的文档信息
         */
        String callback(String path, String className, RootDoc rootDoc, ClassDoc[] classDocs);

        /**
         * 异常回调
         * @param e 异常信息
         */
        void error(Exception e);
    }

    // ============
    // = 读取处理 =
    // ============

    /**
     * 读取处理
     * @param callBack  读取回调
     * @param path      文件路径
     * @param className 文件名 ( 类名 )
     * @return 处理后的文档信息
     */
    private static String read(final CallBack callBack, final String path, final String className) {
        // 类 Doc 信息
        ClassDoc[] classDocs = null; // 如果有内部类, 则长度大于 1, 否则为 1 ( 指定的 className)
        // 防止为 null
        if (mRoot != null) {
            classDocs = mRoot.classes();
        }
        // 触发回调
        if (callBack != null) {
            return callBack.callback(path, className, mRoot, classDocs);
        }
        return null;
    }

    // ================
    // = 对外提供方法 =
    // ================

    /**
     * 读取文档处理
     * @param callBack      读取回调
     * @param path          文件路径
     * @param className     文件名 ( 类名 )
     * @param executeParams 执行参数
     * @return 处理后的文档信息
     */
    public static String readDoc(final CallBack callBack, final String path, final String className, final String[] executeParams) {
        try {
            // 调用 com.sun.tools.javadoc.Main 执行 javadoc, 具体参数百度搜索
            com.sun.tools.javadoc.Main.execute(executeParams);
            // 进行读取
            return read(callBack, path, className);
        } catch (Exception e) {
            if (callBack != null) {
                callBack.error(e);
            }
        }
        return null;
    }

    // =

    /**
     * 创建执行参数
     * <pre>
     *     根据自己的需求创建, 对应需要的执行参数
     *     该方法, 主要是示范, 并且自用
     * </pre>
     * @param readAll   是否读取全部 (-private 显示所有类和成员 )
     * @param path      文件路径
     * @param className 文件名 ( 类名 )
     * @return 执行参数
     */
    public static String[] getExecuteParams(final boolean readAll, final String path, final String className) {
        if (readAll) {
            return new String[]{
                    "-private", "-doclet", Doclet.class.getName(),
                    "-encoding", "utf-8",
                    "-classpath", "", path + className};
        } else {
            return new String[]{
                    "-doclet", Doclet.class.getName(),
                    "-encoding", "utf-8",
                    "-classpath", "", path + className};
        }
    }
}