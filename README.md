
# About

> :smirk: 该项目主要是通过 JavaDoc API 读取 class 中的信息 (注释、方法名、参数、返回值等), 方便大家通过了解 JavaDoc API 并能够实现节省时间、提高效率的工具

> 编写该项目主要是提高效率, 方便自己工具类项目生成 API 以及检测代码规范、中英字符间距、@param、@return 等容易遗漏且复杂耗时的操作

- 生成效果示范 [DevApp - API](https://github.com/afkT/DevUtils/blob/master/lib/DevApp/README.md)



# [JavaDoc](https://github.com/afkT/JavaDoc)

#### 使用演示类 [JavaDocMain](https://github.com/afkT/JavaDoc/blob/master/src/main/java/javadoc/api/JavaDocMain.java) 介绍了使用方法, 以及可获取信息

#### 项目类结构 - [包目录](https://github.com/afkT/JavaDoc/tree/master/src/main/java/javadoc/api)

- Class 信息读取类（[JavaDocReader](https://github.com/afkT/JavaDoc/blob/master/src/main/java/javadoc/api/JavaDocReader.java)）：核心类, Class 信息都通过该类 API 读取



# 代码排版

> 代码、注释间距规范检测通过第三方类 (pangu.java) 进行检测

- [Github - vinta/pangu.java](https://github.com/vinta/pangu.java)

- [中文文案排版指北 - 简书](https://www.jianshu.com/p/a05ecfe0fea5#%E4%B8%AD%E8%8B%B1%E6%96%87%E4%B9%8B%E9%97%B4%E9%9C%80%E8%A6%81%E5%A2%9E%E5%8A%A0%E7%A9%BA%E6%A0%BC)



# DevUtils API 生成

#### 项目类结构 - [包目录](https://github.com/afkT/JavaDoc/tree/master/src/main/java/javadoc/dev_utils)

- DevUtils API 生成实现代码（[API Generate](https://github.com/afkT/JavaDoc/tree/master/src/main/java/javadoc/dev_utils/assist)）：该包下的类, 有各自的作用主要用于生成 DevUtils API 文档

- DevUtils 代码规范检测（[Code Checker](https://github.com/afkT/JavaDoc/tree/master/src/main/java/javadoc/dev_utils/check)）：该包下的类, 主要检测是否缺少注释、@param、@return、重复换行等代码, 并且支持注释间距检测覆盖操作

- API 生成配置信息（[API Config](https://github.com/afkT/JavaDoc/blob/master/src/main/java/javadoc/dev_utils/ApiConfig.java)）：配置生成 API 相关信息, 以及忽略指定类、方法的配置等

- DevApp API README 生成执行方法（[DevApp API README](https://github.com/afkT/JavaDoc/blob/master/src/main/java/javadoc/dev_utils/readme/DevApp_READMEMain.java)）：按 API Config 信息生成 API 文档

- DevJava API README 生成执行方法（[DevJava API README](https://github.com/afkT/JavaDoc/blob/master/src/main/java/javadoc/dev_utils/readme/DevJava_READMEMain.java)）：按 API Config 信息生成 API 文档