package javadoc.dev_utils.readme;

import dev.utils.common.FileUtils;
import javadoc.dev_utils.ApiConfig;
import javadoc.dev_utils.assist.PackageCatalog;

import java.io.File;
import java.util.HashMap;

/**
 * detail: 创建 README Main 方法
 * @author Ttt
 */
final class DevBaseMVVM_READMEMain {

    private DevBaseMVVM_READMEMain() {
    }

    /**
     * 创建 DevUtils - README 头部前缀
     * @param buffer      拼接 Buffer
     * @param path        文件路径
     * @param packageName 包名
     * @param mapCatelog  对应目录的注释
     * @param githubUrl   项目 github 链接
     */
    private static void createREADMEHead(final StringBuffer buffer, final String path, final String packageName,
                                         final HashMap<String, String> mapCatelog, final String githubUrl) {
        buffer.append("\n");
        buffer.append("## Gradle");

        buffer.append("\n\n");
        buffer.append("```java");
        buffer.append("\n");
        buffer.append("implementation 'com.afkt:DevBase:" + ApiConfig.DEV_BASE_MVVM_VERSION + "'");
        buffer.append("\n");
        buffer.append("```");

        buffer.append("\n\n");
        buffer.append("## 目录结构");

        buffer.append("\n\n");
        // 不增加锚链接 -> 一级目录
        buffer.append(PackageCatalog.apiCatalog(false, path, packageName, mapCatelog));

        buffer.append("\n\n");
        buffer.append("## 项目类结构 - [包目录](" + githubUrl + ")");
        buffer.append("\n\n");
        buffer.append("### 核心代码");
        buffer.append("\n\n");
        buffer.append("* 核心 Base Activity（[activity](" + githubUrl + "/activity)）：整个库 Activity 基类都基于该模块代码");
        buffer.append("\n\n");
        buffer.append("* 核心 Base Fragment（[fragment](" + githubUrl + "/fragment)）：整个库 Fragment 基类都基于该模块代码");
        buffer.append("\n\n");
        buffer.append("### 其他代码");
        buffer.append("\n\n");
        buffer.append("* 接口相关（[able](" + githubUrl + "/able)）：对外提供开放方法接口，用于基类可选配置及获取操作");
        buffer.append("\n\n");
        buffer.append("* 库依赖工具包（[utils、assist](" + githubUrl + "/utils)）：抽取通用代码工具类、封装相同逻辑代码辅助类");
        buffer.append("\n\n");
        buffer.append("### 基于 Base Activity、Fragment 扩展包（[expand](" + githubUrl + "/expand)）");
        buffer.append("\n\n");
        buffer.append("* Content Layout 基类（[content](" + githubUrl + "/expand/content)）：通过内置 Layout 作为根布局，方便对全局进行增删 View 控制处理");
        buffer.append("\n\n");
        buffer.append("* MVP 架构基类（[mvp](" + githubUrl + "/expand/mvp)）：MVP Contract Lifecycle 架构基类");
        buffer.append("\n\n");
        buffer.append("* ViewBinding 基类（[viewbinding](" + githubUrl + "/expand/viewbinding)）：使用 ViewBinding 实现对 View 进行 bind 基类");

        buffer.append("\n\n");
        buffer.append("## 设计思路");
        buffer.append("\n\n");
        buffer.append("首先整个库 Activity、Fragment 最终实现都是继承");
        buffer.append(" [AbstractDevBaseActivity](" + githubUrl + "/activity/AbstractDevBaseActivity.kt)、");
        buffer.append("[AbstractDevBaseFragment](" + githubUrl + "/fragment/AbstractDevBaseFragment.kt)");
        buffer.append(" 方便对核心代码设计理解及管理控制，并在此基础上实现三个扩展基类 MVP、ViewBinding、Content Layout");
        buffer.append("\n\n");
        buffer.append("* **ViewBinding 基类**");
        buffer.append("\n\n");
        buffer.append("> 使用 ViewBinding 代替频繁 findViewById，或替换");
        buffer.append(" [Butter Knife](https://github.com/JakeWharton/butterknife)");
        buffer.append("\n");
        buffer.append(">");
        buffer.append("\n");
        buffer.append("> **Butter Knife Attention**: This tool is now deprecated. Please switch to");
        buffer.append(" [view binding](https://developer.android.com/topic/libraries/view-binding)");
        buffer.append("\n\n");
        buffer.append("* **MVP 架构基类**");
        buffer.append("\n\n");
        buffer.append("> 使用 MVP Contract 来进行管理，优化代码结构并使用");
        buffer.append(" [Lifecycle](https://developer.android.com/topic/libraries/architecture/lifecycle)");
        buffer.append(" 解决 MVP 内存泄漏问题");
        buffer.append("\n\n");
        buffer.append("* **Content Layout 基类**");
        buffer.append("\n\n");
        buffer.append("> **核心实现：内置 R.layout.base_content_view 作为 contentView 根布局进行显示**");
        buffer.append("\n");
        buffer.append(">");
        buffer.append("\n");
        buffer.append("> 并进行动态添加 title、body 等布局 View，以达到能够对全局进行 View 增删显隐控制处理");
        buffer.append("，以及后续需求迭代、维护全局操作");
        buffer.append("\n\n");
        buffer.append("各个拓展基类都有实现 MVP、ViewBinding 组合功能，如：");
        buffer.append("`MVPViewBinding`、`ContentMVP`、`ContentViewBinding`、`ContentMVPViewBinding` 组合基类");

        buffer.append("\n\n");
        buffer.append("## 其他");
        buffer.append("\n\n");
        buffer.append("* 为什么没添加 MVVM 架构基类");
        buffer.append("\n\n");
        buffer.append("> 因 MVVM 需要依赖较多库，可能部分项目并不使用 MVVM 作为基础架构，为此新增");
        buffer.append(" [DevBaseMVVM](https://github.com/afkT/DevUtils/blob/master/lib/DevBaseMVVM/README.md)");
        buffer.append(" 库进行区分，减少库依赖数量，以及 MVVM 架构代码实现设计理解");
        buffer.append("\n\n");
        buffer.append("架构只是一种思维方式，不管是 MVC、MVP 还是 MVVM，都只是一种思考问题、解决问题的思维");
        buffer.append("\n\n");
        buffer.append("其目的是要解决编程过程中，模块内部高内聚、模块与模块之间低耦合、可维护性、易测试等问题");

        buffer.append("\n\n");
    }

    /**
     * 创建 REAMDE 文件
     * @return Create Result
     */
    public static String createREADME() {
        // 包名
        final String packageName = ApiConfig.DEV_BASE_MVVM_PACKAGE;
        // 本地文件路径
        final String path = ApiConfig.DEV_BASE_MVVM_PATH;
        // Github 链接地址
        final String githubUrl = ApiConfig.DEV_BASE_MVVM_GITHUB_URL;

        // ============
        // = 生成 API =
        // ============

        // 最终的数据
        StringBuffer buffer = new StringBuffer();
        // 添加头部信息
        createREADMEHead(buffer, path, packageName, ApiConfig.sCatelogMap_Base, githubUrl);

        // 保存合成后的 API REAMDE
        FileUtils.saveFile(new File(ApiConfig.DEV_BASE_MVVM_API_FILE_SAVE_PATH, ApiConfig.README_FILE_NAME).getAbsolutePath(),
                buffer.toString().getBytes());

        StringBuffer resultBuffer = new StringBuffer();
        resultBuffer.append("\n\n");
        resultBuffer.append("\n=====================");
        resultBuffer.append("\n= 保存 JavaDoc 成功 =");
        resultBuffer.append("\n=====================");
        resultBuffer.append("\n");
        resultBuffer.append("\n");
        resultBuffer.append("保存地址: " + ApiConfig.DEV_BASE_MVVM_API_FILE_SAVE_PATH + ApiConfig.README_FILE_NAME);
        resultBuffer.append("\n");
        return resultBuffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(DevBaseMVVM_READMEMain.createREADME());
    }
}