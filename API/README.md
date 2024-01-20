
<h1 align="center">DevUtils</h1>


<p align="center">
	<a href="https://github.com/afkT">
		<img alt="Profile" src="https://img.shields.io/badge/GitHub-afkT-orange.svg" />
	</a>
	<a href="https://github.com/afkT/DevUtils/blob/master/LICENSE">
		<img alt="License" src="https://img.shields.io/badge/License-Apache%202.0-blue.svg" />
	</a>
	<a href="https://search.maven.org/search?q=io.github.afkt">
		<img alt="Version" src="https://img.shields.io/badge/Maven-Dev-5776E0.svg" />
	</a>
	<a href="https://android-arsenal.com/api?level=14">
		<img alt="API" src="https://img.shields.io/badge/API-14%2B-brightgreen.svg?style=flat" />
	</a>
	<a href="https://search.maven.org/search?q=io.github.afkt">
		<img alt="Version" src="https://img.shields.io/badge/DevUtils-2.4.4-yellow.svg" />
	</a>
	<a href="https://github.com/afkT/DevUtils/blob/master/lib/DevApp/README.md">
		<img alt="Utils" src="https://img.shields.io/badge/Utils-300+-critical.svg" />
	</a>
</p>


<p align="center">
	🔥 ( 持续更新，目前含 300+ 工具类 ) <a href="https://github.com/afkT/DevUtils/projects/1">Roadmap</a>
	<br>
	DevUtils 是一个 Android 工具库，主要根据不同功能模块，封装快捷使用的工具类及 API 方法调用。
	<br>
	该项目尽可能的便于开发人员，快捷、高效开发安全可靠的项目。
</p>


<p align="center">
	<b>
		<a href="https://github.com/afkT/DevUtils/blob/master/README/android_standard.md">Android 规范</a>
	</b>、
	<b>
		<a href="https://github.com/afkT/DevUtils/blob/master/README/java_standard.md">Java 规范</a>
	</b>、
	<b>
		<a href="https://github.com/afkT/DevUtils/blob/master/README/git_standard.md">Git 规范</a>
	</b>
</p>


![module](https://github.com/afkT/DevUtils/raw/master/art/module.png)


## Dev 系列开发库全部 Lib Gradle [API README](https://github.com/afkT/DevUtils/blob/master/README_API.md)、[DevApp API](https://github.com/afkT/DevUtils/blob/master/lib/DevApp/README.md)

```gradle

// DevApp - Android 工具类库
implementation 'io.github.afkt:DevAppX:2.4.4'

// DevAssist - 封装逻辑代码, 实现多个快捷功能辅助类、以及 Engine 兼容框架等
implementation 'io.github.afkt:DevAssist:1.4.0'

// DevBase - Base ( Activity、Fragment )、MVP、ViewBinding、ContentLayout 基类库
implementation 'io.github.afkt:DevBase:1.1.6'

// DevBaseMVVM - MVVM ( ViewDataBinding + ViewModel ) 基类库
implementation 'io.github.afkt:DevBaseMVVM:1.1.4'

// DevEngine - 第三方框架解耦、一键替换第三方库、同类库多 Engine 组件化混合使用
implementation 'io.github.afkt:DevEngine:1.1.2'

// DevHttpCapture - OkHttp 抓包工具库
implementation 'io.github.afkt:DevHttpCapture:1.1.6'

// DevHttpCaptureCompiler - OkHttp 抓包工具库 ( 可视化功能 )
debugImplementation 'io.github.afkt:DevHttpCaptureCompiler:1.1.6'
releaseImplementation 'io.github.afkt:DevHttpCaptureCompilerRelease:1.1.6'

// DevHttpManager - OkHttp 管理库 ( Retrofit 多 BaseUrl 管理、Progress 监听 )
implementation 'io.github.afkt:DevHttpManager:1.0.5'

// DevRetrofit - Retrofit + Kotlin Coroutines 封装
implementation 'io.github.afkt:DevRetrofit:1.0.4'

// DevWidget - 自定义 View UI 库
implementation 'io.github.afkt:DevWidgetX:1.2.2'

// DevEnvironment - Android 环境配置切换库
implementation 'io.github.afkt:DevEnvironment:1.1.4'
debugAnnotationProcessor 'io.github.afkt:DevEnvironmentCompiler:1.1.4' // kaptDebug
releaseAnnotationProcessor 'io.github.afkt:DevEnvironmentCompilerRelease:1.1.4' // kaptRelease
//annotationProcessor 'io.github.afkt:DevEnvironmentCompiler:1.1.4' // kapt

// DevJava - Java 工具类库 ( 不依赖 android api )
implementation 'io.github.afkt:DevJava:1.5.0' // 用于纯 Java 开发，如果依赖了 DevApp 则不需要依赖 DevJava
```

## 赞赏

如果你喜欢 DevUtils 的设计，感觉它帮助到了你，并且很想支持该库的后续开发和维护，那么可以扫描下方的二维码，请作者喝一杯咖啡~

![][pay_qrcodeImg]


## License

    Copyright 2018 afkT

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


[pay_qrcodeImg]: https://github.com/afkT/Resources/raw/main/art/pay_qrcode.png