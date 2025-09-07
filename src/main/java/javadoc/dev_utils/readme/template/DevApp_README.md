
## Gradle

```gradle
// DevApp - Android 工具类库
implementation 'io.github.afkt:DevAppX:%s'
```

## 目录结构

%s

## 初始化

> ##### ~~只需要在 Application 中调用 `DevUtils.init()` 进行初始化~~，在 DevUtils FileProviderDevApp 中已初始化，无需主动调用

> 视情况决定是否主动调用 `DevUtils.init()` 方法 ( 可自行查阅 FileProvider onCreate() 方法什么时候被调用及 Application 初始化顺序 )

## 事项

- **`Permission`、`Toast`、`Wifi`、`Camera`** 相关代码迁移至 [DevDeprecated](https://github.com/afkT/DevUtils/blob/master/lib/DevDeprecated/README.md)，如需使用依赖该库即可，无需做任何变更。

- 部分 API 更新不及时或有遗漏等，`具体以对应的工具类为准`

- [检测代码规范、注释内容排版，API 文档生成](https://github.com/afkT/JavaDoc)

- [Change Log](https://github.com/afkT/DevUtils/blob/master/lib/DevApp/CHANGELOG.md)

- 内部存在两个日志工具类 ( 工具类内部调用 )，对外使用 [DevLogger](https://github.com/afkT/Resources/blob/main/utils_readme/logger/DevLogger.md)

```java
// 整个工具类内部日志信息，都通过以下两个工具类输出打印，并且通过 DevUtils.openLog() 控制开关

// dev.utils.app - APP 日志打印工具类
LogPrintUtils
// dev.utils.common - Java Common 日志打印工具类
JCLogUtils
```

- 开启日志
```java
// 打开 lib 内部日志 - 线上 (release) 环境，不调用方法
DevUtils.openLog();
// 标记 Debug 模式
DevUtils.openDebug();
```

- 工具类部分模块配置与使用 - [Use and Config](https://github.com/afkT/Resources/blob/main/utils_readme/USE_CONFIG.md)

- [View 链式调用快捷设置 Helper 类](https://github.com/afkT/DevUtils/blob/master/lib/DevApp/src/main/java/dev/utils/app/helper/view/ViewHelper.java)

- [Dev 工具类链式调用 Helper 类](https://github.com/afkT/DevUtils/blob/master/lib/DevApp/src/main/java/dev/utils/app/helper/dev/DevHelper.java)

- [Android 版本适配 Helper 类](https://github.com/afkT/DevUtils/blob/master/lib/DevApp/src/main/java/dev/utils/app/helper/version/VersionHelper.java)

## API

%s