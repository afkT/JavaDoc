
<h1 align="center">JavaDoc</h1>


<div align="center">

[![GitHub Profile](https://img.shields.io/badge/GitHub-afkT-orange.svg?style=for-the-badge)](https://github.com/afkT)
[![GitHub License](https://img.shields.io/badge/License-Apache%202.0-blue.svg?style=for-the-badge)](https://github.com/afkT/JavaDoc/blob/master/LICENSE)
[![Maven](https://img.shields.io/badge/Maven-Dev-5776E0.svg?style=for-the-badge)](https://search.maven.org/search?q=io.github.afkt)

</div>


<p align="center">
	🍧 该项目通过 JavaDoc API 读取 class 中的信息 (注释、方法名、参数、返回值等)
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


## 作用

方便大家通过了解 JavaDoc API 并能够实现节省时间、提高效率的工具。

编写该项目主要是提高效率，方便 Dev 系列开发库生成 API 以及检测代码规范、中英字符间距、@param、@return 等容易遗漏且复杂耗时的操作


## 核心实现

### 使用演示类 [JavaDocMain][JavaDocMain] 介绍了使用方法，以及可获取信息

### 项目类结构 - [包目录][包目录_api]

- Class 信息读取类（[JavaDocReader][JavaDocReader]）：核心类，Class 信息都通过该类 API 读取


## 代码排版

> 代码、注释间距规范检测通过第三方类 pangu.java 进行检测

- [Github - vinta/pangu.java][Github - vinta/pangu.java]

- [中文文案排版指北 - 简书][中文文案排版指北 - 简书]


## DevUtils API 生成

### 项目类结构 - [包目录][包目录_dev_utils]

- DevUtils API 生成实现代码（[API Generate][API Generate]）：该包下的类，有各自的作用主要用于生成 DevUtils API 文档

- DevUtils 代码规范检测（[Code Checker][Code Checker]）：该包下的类，主要检测是否缺少注释、@param、@return、重复换行等代码，并且支持注释间距检测覆盖操作

- API 生成配置信息（[API Config][API Config]）：配置生成 API 相关信息，以及忽略指定类、方法的配置等


### API 生成实现类 ( 按 API Config 信息生成 API 文档 )

- [DevApp API Generate Main][DevApp API Generate Main]

- [DevAssist API Generate Main][DevAssist API Generate Main]

- [DevBase API Generate Main][DevBase API Generate Main]

- [DevEngine API Generate Main][DevEngine API Generate Main]

- [DevWidget API Generate Main][DevWidget API Generate Main]

- [DevRetrofit API Generate Main][DevRetrofit API Generate Main]

- [DevHttpManager API Generate Main][DevHttpManager API Generate Main]

- [DevHttpCapture API Generate Main][DevHttpCapture API Generate Main]

- [DevEnvironment API Generate Main][DevEnvironment API Generate Main]

- [DevDeprecated API Generate Main][DevDeprecated API Generate Main]

- [DevJava API Generate Main][DevJava API Generate Main]

- [DevOther API Generate Main][DevOther API Generate Main]


### 生成效果

- [DevApp API][DevApp API] **Android 工具类库**

- [DevAssist API][DevAssist API] **封装逻辑代码, 实现多个快捷功能辅助类、以及 Engine 兼容框架等**

- [DevBase API][DevBase API] **Base ( Activity、Fragment ) MVP、MVVM 基类库**

- [DevEngine API][DevEngine API] **第三方框架解耦、一键替换第三方库、同类库多 Engine 组件化混合使用**

- [DevWidget API][DevWidget API] **自定义 View UI 库**

- [DevRetrofit API][DevRetrofit API] **Retrofit + Kotlin Coroutines 封装**

- [DevHttpManager API][DevHttpManager API] **OkHttp 管理库 ( Retrofit 多 BaseUrl 管理、Progress 监听 )**

- [DevHttpCapture API][DevHttpCapture API] **OkHttp 抓包工具库**

- [DevEnvironment API][DevEnvironment API] **Android 环境配置切换库**

- [DevDeprecated API][DevDeprecated API] **Dev 系列库弃用代码统一存储库**

- [DevJava API][DevJava API] **Java 工具类库 ( 不依赖 android api )**

- [DevOther API][DevOther API] **功能、工具类二次封装, 直接 copy 使用**


## License

    Copyright 2022 afkT

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.





[JavaDocMain]: https://github.com/afkT/JavaDoc/blob/master/src/main/java/javadoc/api/JavaDocMain.java
[包目录_api]: https://github.com/afkT/JavaDoc/blob/master/src/main/java/javadoc/api
[JavaDocReader]: https://github.com/afkT/JavaDoc/blob/master/src/main/java/javadoc/api/JavaDocReader.java
[Github - vinta/pangu.java]: https://github.com/vinta/pangu.java
[中文文案排版指北 - 简书]: https://www.jianshu.com/p/a05ecfe0fea5#%E4%B8%AD%E8%8B%B1%E6%96%87%E4%B9%8B%E9%97%B4%E9%9C%80%E8%A6%81%E5%A2%9E%E5%8A%A0%E7%A9%BA%E6%A0%BC
[包目录_dev_utils]: https://github.com/afkT/JavaDoc/blob/master/src/main/java/javadoc/dev_utils
[API Generate]: https://github.com/afkT/JavaDoc/blob/master/src/main/java/javadoc/dev_utils/assist
[Code Checker]: https://github.com/afkT/JavaDoc/blob/master/src/main/java/javadoc/dev_utils/check
[API Config]: https://github.com/afkT/JavaDoc/blob/master/src/main/java/javadoc/dev_utils/ApiConfig.java

[DevApp API]: https://github.com/afkT/DevUtils/blob/master/lib/DevApp/README.md
[DevApp API Generate Main]: https://github.com/afkT/JavaDoc/blob/master/src/main/java/javadoc/dev_utils/readme/DevApp_READMEMain.java

[DevAssist API]: https://github.com/afkT/DevUtils/blob/master/lib/DevAssist/README.md
[DevAssist API Generate Main]: https://github.com/afkT/JavaDoc/blob/master/src/main/java/javadoc/dev_utils/readme/DevAssist_READMEMain.java

[DevBase API]: https://github.com/afkT/DevUtils/blob/master/lib/DevBase/README.md
[DevBase API Generate Main]: https://github.com/afkT/JavaDoc/blob/master/src/main/java/javadoc/dev_utils/readme/DevBase_READMEMain.java

[DevEngine API]: https://github.com/afkT/DevUtils/blob/master/lib/DevEngine/README.md
[DevEngine API Generate Main]: https://github.com/afkT/JavaDoc/blob/master/src/main/java/javadoc/dev_utils/readme/DevEngine_READMEMain.java

[DevWidget API]: https://github.com/afkT/DevUtils/blob/master/lib/DevWidget/README.md
[DevWidget API Generate Main]: https://github.com/afkT/JavaDoc/blob/master/src/main/java/javadoc/dev_utils/readme/DevWidget_READMEMain.java

[DevRetrofit API]: https://github.com/afkT/DevUtils/blob/master/lib/HttpRequest/DevRetrofit/README.md
[DevRetrofit API Generate Main]: https://github.com/afkT/JavaDoc/blob/master/src/main/java/javadoc/dev_utils/readme/DevRetrofit_READMEMain.java

[DevHttpManager API]: https://github.com/afkT/DevUtils/blob/master/lib/HttpRequest/DevHttpManager/README.md
[DevHttpManager API Generate Main]: https://github.com/afkT/JavaDoc/blob/master/src/main/java/javadoc/dev_utils/readme/DevHttpManager_READMEMain.java

[DevHttpCapture API]: https://github.com/afkT/DevUtils/blob/master/lib/HttpCapture/README.md
[DevHttpCapture API Generate Main]: https://github.com/afkT/JavaDoc/blob/master/src/main/java/javadoc/dev_utils/readme/DevHttpCapture_READMEMain.java

[DevEnvironment API]: https://github.com/afkT/DevUtils/blob/master/lib/Environment
[DevEnvironment API Generate Main]: https://github.com/afkT/JavaDoc/blob/master/src/main/java/javadoc/dev_utils/readme/DevEnvironment_READMEMain.java

[DevDeprecated API]: https://github.com/afkT/DevUtils/blob/master/lib/DevDeprecated/README.md
[DevDeprecated API Generate Main]: https://github.com/afkT/JavaDoc/blob/master/src/main/java/javadoc/dev_utils/readme/DevDeprecated_READMEMain.java

[DevJava API]: https://github.com/afkT/DevUtils/blob/master/lib/DevJava/README.md
[DevJava API Generate Main]: https://github.com/afkT/JavaDoc/blob/master/src/main/java/javadoc/dev_utils/readme/DevJava_READMEMain.java

[DevOther API]: https://github.com/afkT/DevUtils-repo/blob/main/local_dev/DevOther
[DevOther API Generate Main]: https://github.com/afkT/JavaDoc/blob/master/src/main/java/javadoc/dev_utils/readme/DevOther_READMEMain.java