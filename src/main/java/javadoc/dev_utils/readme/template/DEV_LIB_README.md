# About

该目录主要存储 DevUtils project 全部 lib module，封装快捷使用的工具类及 API 方法调用，隐藏内部逻辑判断对外提供便捷辅助类、统一回调类、Bean、Event 以及
Engine 兼容框架等

## 项目目录结构（ 全部已迁移至 Maven Central ）

```
- lib                                            | 根目录
   - DevApp                                      | Android 工具类库
   - DevAssist                                   | 封装逻辑代码, 实现多个快捷功能辅助类、以及 Engine 兼容框架等
   - DevBase                                     | Base ( Activity、Fragment )、MVP、ViewBinding、ContentLayout 基类库
   - DevBaseMVVM                                 | MVVM ( ViewDataBinding + ViewModel ) 基类库
   - DevMVVM                                     | DataBinding 工具类库
   - DevEngine                                   | 第三方框架解耦、一键替换第三方库、同类库多 Engine 组件化混合使用
   - DevWidget                                   | 自定义 View UI 库
   - DevDeprecated                               | Dev 系列库弃用代码统一存储库
   - DevSimple                                   | 简单敏捷开发库集合
      - DevAgile                                 | 简单敏捷开发库 ( 常用、零散代码 )
      - DevSimple                                | 简单敏捷开发库
   - Environment                                 | Android 环境配置切换库
      - DevEnvironment                           | 环境切换可视化 UI 操作
      - DevEnvironmentBase                       | 注解类、实体类、监听事件等通用基础
      - DevEnvironmentCompiler                   | Debug ( 打包 / 编译 ) 生成实现代码
      - DevEnvironmentCompilerRelease            | Release ( 打包 / 编译 ) 生成实现代码
   - HttpCapture                                 | Android 抓包库
      - DevHttpCapture                           | OkHttp 抓包工具库
      - DevHttpCaptureCompiler                   | Debug ( 打包 / 编译 ) 实现代码 ( 可视化 UI 操作 )
      - DevHttpCaptureCompilerRelease            | Release ( 打包 / 编译 ) 实现代码
   - HttpRequest                                 | Android 网络请求库
      - DevRetrofit                              | Retrofit + Kotlin Coroutines 封装
      - DevHttpManager                           | OkHttp 管理库 ( Retrofit 多 BaseUrl 管理、Progress 监听 )
   - DevJava                                     | Java 工具类库 ( 不依赖 android api )
```


## Dev 系列开发库全部 Lib Gradle

```gradle

// DevApp - Android 工具类库
implementation 'io.github.afkt:DevAppX:【DevApp-vn】'

// DevAssist - 封装逻辑代码, 实现多个快捷功能辅助类、以及 Engine 兼容框架等
implementation 'io.github.afkt:DevAssist:【DevAssist-vn】'

// DevBase - Base ( Activity、Fragment )、MVP、ViewBinding、ContentLayout 基类库
implementation 'io.github.afkt:DevBase:【DevBase-vn】'

// DevBaseMVVM - MVVM ( ViewDataBinding + ViewModel ) 基类库
implementation 'io.github.afkt:DevBaseMVVM:【DevBaseMVVM-vn】'

// DevMVVM - DataBinding 工具类库
implementation 'io.github.afkt:DevMVVM:【DevMVVM-vn】'

// DevEngine - 第三方框架解耦、一键替换第三方库、同类库多 Engine 组件化混合使用
implementation 'io.github.afkt:DevEngine:【DevEngine-vn】'

// DevSimple - 简单敏捷开发库
implementation 'io.github.afkt:DevSimple:【DevSimple-vn】'

// DevAgile - 简单敏捷开发库 ( 常用、零散代码 )
implementation 'io.github.afkt:DevAgile:【DevAgile-vn】'

// DevWidget - 自定义 View UI 库
implementation 'io.github.afkt:DevWidgetX:【DevWidget-vn】'

// DevRetrofit - Retrofit + Kotlin Coroutines 封装
implementation 'io.github.afkt:DevRetrofit:【DevRetrofit-vn】'

// DevHttpManager - OkHttp 管理库 ( Retrofit 多 BaseUrl 管理、Progress 监听 )
implementation 'io.github.afkt:DevHttpManager:【DevHttpManager-vn】'

// DevHttpCapture - OkHttp 抓包工具库
implementation 'io.github.afkt:DevHttpCapture:【DevHttpCapture-vn】'

// DevHttpCaptureCompiler - OkHttp 抓包工具库 ( 可视化功能 )
debugImplementation 'io.github.afkt:DevHttpCaptureCompiler:【DevHttpCapture-vn】'
releaseImplementation 'io.github.afkt:DevHttpCaptureCompilerRelease:【DevHttpCapture-vn】'

// DevEnvironment - Android 环境配置切换库
implementation 'io.github.afkt:DevEnvironment:【DevEnvironment-vn】'
debugAnnotationProcessor 'io.github.afkt:DevEnvironmentCompiler:【DevEnvironment-vn】' // kaptDebug
releaseAnnotationProcessor 'io.github.afkt:DevEnvironmentCompilerRelease:【DevEnvironment-vn】' // kaptRelease
//annotationProcessor 'io.github.afkt:DevEnvironmentCompiler:【DevEnvironment-vn】' // kapt

// DevDeprecated - Dev 系列库弃用代码统一存储库
implementation 'io.github.afkt:DevDeprecated:【DevDeprecated-vn】'

// DevJava - Java 工具类库 ( 不依赖 android api )
implementation 'io.github.afkt:DevJava:【DevJava-vn】'
```