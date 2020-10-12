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
final class DevBase_READMEMain {

    private DevBase_READMEMain() {
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
        buffer.append("implementation 'com.afkt:DevBase:" + ApiConfig.DEV_BASE_VERSION + "'");
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
        buffer.append("* 核心 Base Activity（[AbstractDevBaseActivity](" + githubUrl + "/activity)）：整个库 Activity 基类都基于该模块代码");
        buffer.append("\n\n");
        buffer.append("* 核心 Base Fragment（[AbstractDevBaseFragment](" + githubUrl + "/fragment)）：整个库 Fragment 基类都基于该模块代码");
        buffer.append("\n\n");
        buffer.append("### 其他代码");
        buffer.append("\n\n");
        buffer.append("* 接口相关（[able](" + githubUrl + "/able)）：对外提供开放方法接口，服务基类用于可选配置及获取操作");
        buffer.append("\n\n");
        buffer.append("* 库依赖工具包（[utils](" + githubUrl + "/utils)）：抽取通用代码工具类、封装相同逻辑代码辅助类");
        buffer.append("\n\n");
        buffer.append("### 基于 Base Activity、Fragment 扩展包（[expand](" + githubUrl + "/expand)）");
        buffer.append("\n\n");
        buffer.append("* 内置 XML Layout 基类（[content](" + githubUrl + "/expand/content)）：通过内置 Layout 作为根布局，方便对全局进行增删 View 控制处理");
        buffer.append("\n\n");
        buffer.append("* MVP 架构基类（[mvp](" + githubUrl + "/expand/mvp)）：MVP Contract 架构封装基类");
        buffer.append("\n\n");
        buffer.append("* ViewBinding 基类（[viewbinding](" + githubUrl + "/expand/viewbinding)）：使用 ViewBinding 实现对 View 进行 bind 基类");

        buffer.append("\n\n");
        buffer.append("## 设计思路");
        buffer.append("\n\n");

        buffer.append("\n\n");
    }

    /**
     * 创建 REAMDE 文件
     * @return Create Result
     */
    public static String createREADME() {
        // 包名
        final String packageName = ApiConfig.DEV_BASE_PACKAGE;
        // 本地文件路径
        final String path = ApiConfig.DEV_BASE_PATH;
        // Github 链接地址
        final String githubUrl = ApiConfig.DEV_BASE_GITHUB_URL;

        // ============
        // = 生成 API =
        // ============

        // 最终的数据
        StringBuffer buffer = new StringBuffer();
        // 添加头部信息
        createREADMEHead(buffer, path, packageName, ApiConfig.sCatelogMap_Base, githubUrl);

        // 保存合成后的 API REAMDE
        FileUtils.saveFile(new File(ApiConfig.DEV_BASE_API_FILE_SAVE_PATH, ApiConfig.README_FILE_NAME).getAbsolutePath(),
                buffer.toString().getBytes());

        StringBuffer resultBuffer = new StringBuffer();
        resultBuffer.append("\n\n");
        resultBuffer.append("\n=====================");
        resultBuffer.append("\n= 保存 JavaDoc 成功 =");
        resultBuffer.append("\n=====================");
        resultBuffer.append("\n");
        resultBuffer.append("\n");
        resultBuffer.append("保存地址: " + ApiConfig.DEV_BASE_API_FILE_SAVE_PATH + ApiConfig.README_FILE_NAME);
        resultBuffer.append("\n");
        return resultBuffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(DevBase_READMEMain.createREADME());
    }
}