

## 摘要

* [框架功能介绍](#框架功能介绍)
* [项目类结构](#项目类结构)


## Gradle

```gradle
implementation 'io.github.afkt:DevRetrofit:%s'
```

## 框架功能介绍

DevRetrofit 是基于 Retrofit + Kotlin Coroutines 进行封装的网络层封装库，
针对 `CoroutineScope`、`ViewModel`、`Lifecycle`、`LifecycleOwner` 及 `LifecycleOwner` 实现类 ( `Activity`、`Fragment` 等 ) 封装快捷扩展函数。

并对上述封装的请求方法扩展函数支持传入 `LiveData`、`回调方法体`、`Callback`、`ResultCallback`。

且内部定义**Base 基类** ( `Base.Response<T>`、`Base.Result` )，以及**Notify ( Callback ) 类** ( `Notify.Callback<T>`、`Notify.ResultCallback`、`Notify.GlobalCallback` )，**防止污染引用项目 BaseXxx、Callback 类**

## 项目类结构 - [包目录][包目录]

* 数据模型类（[model.kt][model.kt]）：DevRetrofit Base 数据模型、接口汇总类

* 数据模型扩展类（[model_ext.kt][model_ext.kt]）：model.kt 扩展函数汇总类

* 封装请求方法（[request.kt][request.kt]）：整个 DevRetrofit 库最终实现，统一调用该请求封装方法

* 请求方法协程扩展函数（[request_coroutines.kt][request_coroutines.kt]）：在 request.kt 基础上封装使用协程

* Callback 扩展函数（[request_coroutines_simple.kt][request_coroutines_simple.kt]）：在 request_coroutines.kt 基础上减少 start、success、error、finish 方法体传参，使用 Callback、ResultCallback

* LiveData 扩展函数（[request_coroutines_simple_livedata.kt][request_coroutines_simple_livedata.kt]）：在 request_coroutines_simple.kt 基础上使用 LiveData


newline





[DevRetrofit]: https://github.com/afkT/DevUtils/blob/master/lib/DevRetrofit
[包目录]: https://github.com/afkT/DevUtils/blob/master/lib/DevRetrofit/src/main/java/dev/retrofit
[model.kt]: https://github.com/afkT/DevUtils/blob/master/lib/DevRetrofit/src/main/java/dev/retrofit/model.kt
[model_ext.kt]: https://github.com/afkT/DevUtils/blob/master/lib/DevRetrofit/src/main/java/dev/retrofit/model_ext.kt
[request.kt]: https://github.com/afkT/DevUtils/blob/master/lib/DevRetrofit/src/main/java/dev/retrofit/request.kt
[request_coroutines.kt]: https://github.com/afkT/DevUtils/blob/master/lib/DevRetrofit/src/main/java/dev/retrofit/request_coroutines.kt
[request_coroutines_simple.kt]: https://github.com/afkT/DevUtils/blob/master/lib/DevRetrofit/src/main/java/dev/retrofit/request_coroutines_simple.kt
[request_coroutines_simple_livedata.kt]: https://github.com/afkT/DevUtils/blob/master/lib/DevRetrofit/src/main/java/dev/retrofit/request_coroutines_simple_livedata.kt
