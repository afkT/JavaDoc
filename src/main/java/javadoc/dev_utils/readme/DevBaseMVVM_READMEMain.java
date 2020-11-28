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
     * @param mapCatalog  对应目录的注释
     * @param githubUrl   项目 github 链接
     */
    private static void createREADMEHead(final StringBuffer buffer, final String path, final String packageName,
                                         final HashMap<String, String> mapCatalog, final String githubUrl) {
        buffer.append("\n");
        buffer.append("## Gradle");

        buffer.append("\n\n");
        buffer.append("```java");
        buffer.append("\n");
        buffer.append("implementation 'com.afkt:DevBaseMVVM:" + ApiConfig.DEV_BASE_MVVM_VERSION + "'");
        buffer.append("\n");
        buffer.append("```");

        buffer.append("\n\n");
        buffer.append("## 目录结构");

        buffer.append("\n\n");
        // 不增加锚链接 -> 一级目录
        buffer.append(PackageCatalog.apiCatalog(false, path, packageName, mapCatalog));

        buffer.append("\n\n");
        buffer.append("## 项目类结构 - [包目录](" + githubUrl + ")");
        buffer.append("\n\n");
        buffer.append("### 核心代码");
        buffer.append("\n\n");
        buffer.append("* 核心依赖库 [DevBase](https://github.com/afkT/DevUtils/blob/master/lib/DevBase/README.md)：整个库最终基类都基于该库 `DevBase` 代码");
        buffer.append("\n\n");
        buffer.append("### 其他代码");
        buffer.append("\n\n");
        buffer.append("* 接口相关（[able](" + githubUrl + "/able)）：对外提供开放方法接口，用于基类可选配置及获取操作");
        buffer.append("\n\n");
        buffer.append("* 库依赖工具包（[utils、assist](" + githubUrl + "/utils)）：抽取通用代码工具类、封装相同逻辑代码辅助类");
        buffer.append("\n\n");
        buffer.append("### 基于 Base Activity、Fragment 扩展包（[expand](" + githubUrl + "/expand)）");
        buffer.append("\n\n");
        buffer.append("* Content Layout MVVM 基类（[content](" + githubUrl + "/expand/content)）：通过内置 Layout 作为根布局，方便对全局进行增删 View 控制处理");
        buffer.append("\n\n");
        buffer.append("* MVVM 架构基类（[mvvm](" + githubUrl + "/expand/mvvm)）：MVVM ( ViewDataBinding + ViewModel ) 架构基类");
        buffer.append("\n\n");
        buffer.append("* ViewDataBinding 基类（[viewdata](" + githubUrl + "/expand/viewdata)）：使用 ViewDataBinding 实现对 View 进行 bind、数据双向绑定基类");
        buffer.append("\n\n");
        buffer.append("* ViewModel 基类（[viewmodel](" + githubUrl + "/expand/viewmodel)）：使用 ViewModel 进行数据管理、交互基类");

        buffer.append("\n\n");
        buffer.append("## Google");
        buffer.append("\n\n");
        buffer.append("* [android / sunflower](https://github.com/android/sunflower)");
        buffer.append("\n\n");
        buffer.append("* [ViewModel 概览](https://developer.android.com/topic/libraries/architecture/viewmodel)");
        buffer.append("\n\n");
        buffer.append("* [LiveData 概览](https://developer.android.com/topic/libraries/architecture/livedata)");

        buffer.append("\n\n");
        buffer.append("## 其他");
        buffer.append("\n\n");
        buffer.append("* [MVPVM in Action, 谁告诉你 MVP 和 MVVM 是互斥的](http://blog.zhaiyifan.cn/2016/03/16/android-new-project-from-0-p3)");
        buffer.append("\n\n");
        buffer.append("* [是让人耳目一新的 Jetpack MVVM 精讲啊！](https://juejin.cn/post/6844903976240939021)");
        buffer.append("\n\n");
        buffer.append("* [DataBinding 最全使用说明](https://juejin.cn/post/6844903549223059463)");
        buffer.append("\n\n");
        buffer.append("* [Android 官方 MVVM 框架实现组件化之整体结构](https://www.jianshu.com/p/c0988e7f31fd)");
        buffer.append("\n\n");
        buffer.append("* [AndroidX Jetpack Practice](https://github.com/hi-dhl/AndroidX-Jetpack-Practice)");
        buffer.append("\n\n");
        buffer.append("* [AndroidLibs / 框架](https://github.com/GuoYangGit/AndroidLibs/tree/master/%E6%A1%86%E6%9E%B6)");
        buffer.append("\n\n");
        buffer.append("* [深入浅出 MVVM 教程](https://www.jianshu.com/p/bcdb7c2a07eb)");
        buffer.append("\n\n");
        buffer.append("* [深入浅出 MVVM 教程 Repository ( 数据仓库 ) ](https://juejin.cn/post/6844903505635835911)");

        buffer.append("\n\n");
        buffer.append("## Other");
        buffer.append("\n\n");
        buffer.append("* [GitHub MVVMHabit](https://github.com/goldze/MVVMHabit)");
        buffer.append("\n\n");
        buffer.append("* [GitHub Jetpack-MVVM-Best-Practice](https://github.com/KunMinX/Jetpack-MVVM-Best-Practice)");

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

        // ===========
        // = 生成 API =
        // ===========

        // 最终的数据
        StringBuffer buffer = new StringBuffer();
        // 添加头部信息
        createREADMEHead(buffer, path, packageName, ApiConfig.sCatalogMap_BaseMVVM, githubUrl);

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