
## Gradle

```java
implementation 'io.github.afkt:DevJava:%s'
```

## 目录结构

%s

## 事项

- 部分 API 更新不及时或有遗漏等，`具体以对应的工具类为准`

- [检测代码规范、注释内容排版，API 文档生成](https://github.com/afkT/JavaDoc)

- [Change Log](https://github.com/afkT/DevUtils/blob/master/lib/DevJava/CHANGELOG.md)

- 该工具类不依赖 android api，属于 Java 工具类库

- 开启日志
```java
// 打开 lib 内部日志 - 线上 (release) 环境，不调用方法
JCLogUtils.setPrintLog(true);
// 控制台打印日志
JCLogUtils.setControlPrintLog(true);
// 设置 Java 模块日志信息监听
JCLogUtils.setPrint(new JCLogUtils.Print() {});
```

## API

%s