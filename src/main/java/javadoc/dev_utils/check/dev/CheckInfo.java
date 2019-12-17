package javadoc.dev_utils.check.dev;

import java.io.File;
import java.util.ArrayList;

/**
 * detail: 检测信息实体类
 * @author Ttt
 */
public final class CheckInfo {

    // 检测路径
    public String mPath;
    // 代码检测分析配置接口
    public ICheckConfig mICheckConfig;
    // 是否覆盖文件内容
    public boolean mCoverText = true;
    // 是否使用 ArrayList<File>
    public boolean mIsLists = false;
    // 检测指定文件集合
    public ArrayList<File> mListFiles;
    // 是否打印方法返回值 void 记录
    public boolean mIsPrintVoid = false;

    public CheckInfo(String path, ICheckConfig iCheckConfig) {
        this.mPath = path;
        this.mICheckConfig = iCheckConfig;
    }

    // ================
    // = 对外公开方法 =
    // ================

    /**
     * 设置检测路径
     * @param path 检测路径
     * @return {@link CheckInfo}
     */
    public CheckInfo setPath(String path) {
        this.mPath = path;
        return this;
    }

    /**
     * 设置代码检测分析配置接口
     * @param iCheckConfig {@link ICheckConfig}
     * @return {@link CheckInfo}
     */
    public CheckInfo setCheckConfig(ICheckConfig iCheckConfig) {
        this.mICheckConfig = iCheckConfig;
        return this;
    }

    /**
     * 设置是否覆盖文件内容
     * @param coverText {@code true} yes, {@code false} no
     * @return {@link CheckInfo}
     */
    public CheckInfo setCoverText(boolean coverText) {
        this.mCoverText = coverText;
        return this;
    }

    /**
     * 设置是否使用 ArrayList<File>
     * @param lists {@code true} yes, {@code false} no
     * @return {@link CheckInfo}
     */
    public CheckInfo setLists(boolean lists) {
        this.mIsLists = lists;
        return this;
    }

    /**
     * 设置检测指定文件集合
     * @param listFiles 检测指定文件集合
     * @return {@link CheckInfo}
     */
    public CheckInfo setListFiles(ArrayList<File> listFiles) {
        this.mListFiles = listFiles;
        return this;
    }

    /**
     * 设置是否打印方法返回值 void 记录
     * @param printVoid {@code true} yes, {@code false} no
     * @return {@link CheckInfo}
     */
    public CheckInfo setPrintVoid(boolean printVoid) {
        this.mIsPrintVoid = printVoid;
        return this;
    }
}
