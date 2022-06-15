

## 摘要

* [框架功能介绍](#框架功能介绍)


## Gradle

```gradle
implementation 'io.github.afkt:DevRetrofit:1.0.0'
```

## 框架功能介绍

DevRetrofit 是基于 Retrofit + Kotlin Coroutines 进行封装的网络层封装库，
针对 `CoroutineScope`、`ViewModel`、`Lifecycle`、`LifecycleOwner` 及 `LifecycleOwner` 实现类 ( `Activity`、`Fragment` ) 封装快捷扩展函数。

并对上述封装的请求方法扩展函数支持传入 `回调方法体`、`Callback`、`LiveData`，
内部定义 `Base.Response<T>`、`Base.Result` Base 基类，以及 `Notify.Callback<T>`、`Notify.ResultCallback`、`Notify.GlobalCallback` Notify ( Callback ) 类，防止污染引用项目 BaseXxx、Callback 类

## API 文档




newline





[DevRetrofit]: https://github.com/afkT/DevUtils/blob/master/lib/DevRetrofit
[目录]: https://github.com/afkT/DevUtils/blob/master/lib/DevRetrofit/src/main/java/dev/retrofit
[model.kt]: https://github.com/afkT/DevUtils/blob/master/lib/DevRetrofit/src/main/java/dev/retrofit/model.kt
[model_ext.kt]: https://github.com/afkT/DevUtils/blob/master/lib/DevRetrofit/src/main/java/dev/retrofit/model_ext.kt
[request.kt]: https://github.com/afkT/DevUtils/blob/master/lib/DevRetrofit/src/main/java/dev/retrofit/request.kt
[request_coroutines.kt]: https://github.com/afkT/DevUtils/blob/master/lib/DevRetrofit/src/main/java/dev/retrofit/request_coroutines.kt
[request_coroutines_simple.kt]: https://github.com/afkT/DevUtils/blob/master/lib/DevRetrofit/src/main/java/dev/retrofit/request_coroutines_simple.kt
[request_coroutines_simple_livedata.kt]: https://github.com/afkT/DevUtils/blob/master/lib/DevRetrofit/src/main/java/dev/retrofit/request_coroutines_simple_livedata.kt