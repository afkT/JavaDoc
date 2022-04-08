
## DevHttpCapture

> 该库主要对使用 OkHttp 网络请求库的项目，提供 Http 抓包功能，并支持抓包数据加密存储。
>
> **并且是以 Module ( ModuleName Key ) 为基础，支持组件化不同 Module 各自的抓包功能**，支持实时开关抓包功能、可控 Http 拦截过滤器。
>
> 内置两个 Http 抓包拦截器，CallbackInterceptor ( 无存储逻辑，进行回调通知 )、HttpCaptureInterceptor ( 存在存储抓包数据逻辑 )
>
> `DevHttpCaptureCompiler` 提供对 `DevHttpCapture` 抓包库可视化功能


### 最新版本

module | DevHttpCapture | DevHttpCaptureCompiler | DevHttpCaptureCompilerRelease
:---:|:---:|:---:|:---:
version | [![][maven_svg]][maven] | [![][maven_svg]][maven] | [![][maven_svg]][maven]


### Gradle

```groovy
dependencies {
    debugImplementation 'io.github.afkt:DevHttpCaptureCompiler:DEVersion'
    releaseImplementation 'io.github.afkt:DevHttpCaptureCompilerRelease:DEVersion'
}
```


### 使用示例

```java
// 显示所有 Module 抓包数据
DevHttpCaptureCompiler.start(context);
// 显示指定 Module 抓包数据
DevHttpCaptureCompiler.start(context, moduleName);

// =======
// = 可选 =
// =======

// 添加接口所属功能注释
DevHttpCaptureCompiler.putUrlFunction(moduleName, UrlFunctionGet);
// 移除接口所属功能注释
DevHttpCaptureCompiler.removeUrlFunction(moduleName);
```

### 目录结构

%s

### API

%s

【API_PLACEHOLDER_FORMAT】





[maven_svg]: https://img.shields.io/badge/Maven-DEVersion-brightgreen.svg
[maven]: https://search.maven.org/search?q=io.github.afkt