

## 目录结构

```
- src.main               | 根目录
   - dev                 | 通用实现
      - receiver         | BroadcastReceiver 监听相关
      - service          | Service 相关
   - java                | Java 实现
      - dev              | 根目录
         - assist        | 常用辅助类封装
         - other         | 第三方库封装工具类
            - cache      | 缓存工具类
            - work       | WorkManager Utils
               - demo    | WorkManager 使用 Demo
   - ktx                 | Kotlin 实现
      - dev              | 根目录
         - assist        | 常用辅助类封装
         - other         | 第三方库封装工具类
```


## Use

> 直接 copy 所需要的类到项目中使用


## API


- src.main                                    | 根目录
   - [dev](#dev)                              | 通用实现
      - [receiver](#devreceiver)              | BroadcastReceiver 监听相关
      - [service](#devservice)                | Service 相关
   - [java](#java)                            | Java 实现
      - [dev](#javadev)                       | 根目录
         - [assist](#javadevassist)           | 常用辅助类封装
         - [other](#javadevother)             | 第三方库封装工具类
            - [cache](#javadevothercache)     | 缓存工具类
            - [work](#javadevotherwork)       | WorkManager Utils
               - [demo](#javadevotherworkdemo)| WorkManager 使用 Demo
   - [ktx](#ktx)                              | Kotlin 实现
      - [dev](#ktxdev)                        | 根目录
         - [assist](#ktxdevassist)            | 常用辅助类封装
         - [other](#ktxdevother)              | 第三方库封装工具类




## <span id="dev">**`dev`**</span>


## <span id="devreceiver">**`dev.receiver`**</span>


## <span id="devservice">**`dev.service`**</span>


## <span id="java">**`java`**</span>


## <span id="javadev">**`java.dev`**</span>


## <span id="javadevassist">**`java.dev.assist`**</span>


* **WebView 辅助类 ->** [WebViewAssist.java](https://github.com/afkT/DevUtils-repo/blob/main/local_dev/DevOther/src/main/java//java/dev/assist/WebViewAssist.java)

| 方法 | 注释 |
| :- | :- |
| setWebView | 设置 WebView |
| getWebView | 获取 WebView |
| isWebViewNotEmpty | WebView 是否不为 null |
| setBuilder | 设置 WebView 常用配置构建类 |
| getBuilder | 获取 WebView 常用配置构建类 |
| apply | 应用 ( 设置 ) 配置 |
| setGlobalBuilder | 设置全局 WebView 常用配置构建类 |
| getGlobalBuilder | 获取全局 WebView 常用配置构建类 |
| loadUrl | 加载网页 |
| loadData | 加载 Html 代码 |
| loadDataWithBaseURL | 加载 Html 代码 |
| postUrl | 使用 POST 方法将带有 postData 的 url 加载到 WebView 中 |
| getSettings | 获取 WebView 配置 |
| getUserAgentString | 获取浏览器标识 UA |
| setUserAgentString | 设置浏览器标识 |
| addJavascriptInterface | 添加 JS 交互注入对象 |
| removeJavascriptInterface | 移除 JS 交互注入对象 |
| evaluateJavascript | 执行 JS 方法 |
| setWebViewClient | 设置处理各种通知和请求事件对象 |
| getWebViewClient | 获取处理各种通知和请求事件对象 |
| setWebChromeClient | 设置辅助 WebView 处理 Javascript 对话框、标题等对象 |
| getWebChromeClient | 获取辅助 WebView 处理 Javascript 对话框、标题等对象 |
| destroy | 销毁处理 |
| canGoBack | WebView 是否可以后退 |
| goBack | WebView 后退 |
| canGoForward | WebView 是否可以前进 |
| goForward | WebView 前进 |
| canGoBackOrForward | WebView 是否可以跳转到当前起始点相距的历史记录 |
| goBackOrForward | WebView 跳转到当前起始点相距的历史记录 |
| reload | 刷新页面 ( 当前页面的所有资源都会重新加载 ) |
| stopLoading | 停止加载 |
| clearCache | 清除资源缓存 |
| clearHistory | 清除当前 WebView 访问的历史记录 |
| clearFormData | 清除自动完成填充的表单数据 |
| getScale | 获取缩放比例 |
| getScrollY | 获取当前可见区域的顶端距整个页面顶端的距离 ( 当前内容滚动的距离 ) |
| getScrollX | 获取当前内容横向滚动距离 |
| getContentHeight | 获取 HTML 的高度 ( 原始高度, 不包括缩放后的高度 ) |
| getScaleHeight | 获取缩放高度 |
| getHeight | 获取 WebView 控件高度 |
| pageDown | 将视图内容向下滚动一半页面大小 |
| pageUp | 将视图内容向上滚动一半页面大小 |
| handlerKeyDown | 处理按键 ( 是否回退 ) |
| setLayerTypeSoftware | 关闭 WebView 硬件加速功能 |
| setLayerType | 设置 WebView 硬件加速类型 |
| getUrl | 获取当前 Url |
| getOriginalUrl | 获取最初请求 Url |
| getHitTestResult | 获取长按事件类型 |
| setCookie | 将 Cookie 设置到 WebView |
| getCookie | 获取指定 Url 的 Cookie |
| removeCookie | 移除 Cookie |
| removeSessionCookie | 移除 Session Cookie |
| removeAllCookie | 移除所有的 Cookie |
| setOnApplyListener | 设置应用配置监听事件 |
| getApplyListener | 获取应用配置监听事件 |
| clone | 克隆方法 ( 用于全局配置克隆操作 ) |
| reset | 重置方法 |
| isJavaScriptEnabled | 是否支持 JavaScript |
| setJavaScriptEnabled | 设置是否支持 JavaScript |
| getRenderPriority | 获取渲染优先级 |
| setRenderPriority | 设置渲染优先级 |
| isUseWideViewPort | 是否使用宽视图 |
| setUseWideViewPort | 设置是否使用宽视图 |
| isLoadWithOverviewMode | 是否按宽度缩小内容以适合屏幕 |
| setLoadWithOverviewMode | 设置是否按宽度缩小内容以适合屏幕 |
| getLayoutAlgorithm | 获取基础布局算法 |
| setLayoutAlgorithm | 设置基础布局算法 |
| isSupportZoom | 是否支持缩放 |
| setSupportZoom | 设置是否支持缩放 |
| isBuiltInZoomControls | 是否显示内置缩放工具 |
| setBuiltInZoomControls | 设置是否显示内置缩放工具 |
| isDisplayZoomControls | 是否显示缩放工具 |
| setDisplayZoomControls | 设置是否显示缩放工具 |
| getTextZoom | 获取文本缩放倍数 |
| setTextZoom | 设置文本缩放倍数 |
| getStandardFontFamily | 获取 WebView 字体 |
| setStandardFontFamily | 设置 WebView 字体 |
| getDefaultFontSize | 获取 WebView 字体大小 |
| setDefaultFontSize | 设置 WebView 字体大小 |
| getMinimumFontSize | 获取 WebView 支持最小字体大小 |
| setMinimumFontSize | 设置 WebView 支持最小字体大小 |
| getMixedContentMode | 获取混合内容模式 |
| setMixedContentMode | 设置混合内容模式 |
| isLoadsImagesAutomatically | 是否支持自动加载图片 |
| setLoadsImagesAutomatically | 设置是否支持自动加载图片 |
| isJavaScriptCanOpenWindowsAutomatically | 是否支持通过 JS 打开新窗口 |
| setJavaScriptCanOpenWindowsAutomatically | 设置是否支持通过 JS 打开新窗口 |
| getDefaultTextEncodingName | 获取编码格式 |
| setDefaultTextEncodingName | 设置编码格式 |
| isGeolocationEnabled | 是否允许网页执行定位操作 |
| setGeolocationEnabled | 设置是否允许网页执行定位操作 |
| isAllowFileAccess | 是否可以访问文件 ( false 不影响 assets 和 resources 资源的加载 ) |
| setAllowFileAccess | 设置是否可以访问文件 ( false 不影响 assets 和 resources 资源的加载 ) |
| isAllowFileAccessFromFileURLs | 是否允许通过 file url 加载的 JS 代码读取其他的本地文件 |
| setAllowFileAccessFromFileURLs | 设置是否允许通过 file url 加载的 JS 代码读取其他的本地文件 |
| isAllowUniversalAccessFromFileURLs | 是否允许通过 file url 加载的 JS 可以访问其他的源 ( 包括 http、https 等源 ) |
| setAllowUniversalAccessFromFileURLs | 设置是否允许通过 file url 加载的 JS 可以访问其他的源 ( 包括 http、https 等源 ) |
| getCacheMode | 获取 WebView 缓存模式 |
| setCacheMode | 设置 WebView 缓存模式 |
| isDomStorageEnabled | 是否支持 DOM Storage |
| setDomStorageEnabled | 设置是否支持 DOM Storage |
| isAppCacheEnabled | 是否开启 Application Caches 功能 |
| setAppCacheEnabled | 设置是否开启 Application Caches 功能 |
| getAppCachePath | 获取 Application Caches 地址 |
| setAppCachePath | 设置 Application Caches 地址 |
| getAppCacheMaxSize | 获取 Application Caches 大小 |
| setAppCacheMaxSize | 设置 Application Caches 大小 |
| isDatabaseEnabled | 是否支持数据库缓存 |
| setDatabaseEnabled | 设置是否支持数据库缓存 |
| getDatabasePath | 获取数据库缓存路径 |
| setDatabasePath | 设置数据库缓存路径 |
| onApply | 应用配置通知方法 |


## <span id="javadevother">**`java.dev.other`**</span>


* **EventBus 工具类 ->** [EventBusUtils.java](https://github.com/afkT/DevUtils-repo/blob/main/local_dev/DevOther/src/main/java//java/dev/other/EventBusUtils.java)

| 方法 | 注释 |
| :- | :- |
| register | 注册 EventBus |
| unregister | 解绑 EventBus |
| post | 发送事件消息 |
| cancelEventDelivery | 取消事件传送 |
| postSticky | 发送粘性事件消息 |
| removeStickyEvent | 移除指定的粘性订阅事件 |
| removeAllStickyEvents | 移除所有的粘性订阅事件 |


* **Fastjson 工具类 ->** [FastjsonUtils.java](https://github.com/afkT/DevUtils-repo/blob/main/local_dev/DevOther/src/main/java//java/dev/other/FastjsonUtils.java)

| 方法 | 注释 |
| :- | :- |
| toJson | 将对象转换为 JSON String |
| fromJson | 将 JSON String 映射为指定类型对象 |
| isJSON | 判断字符串是否 JSON 格式 |
| isJSONObject | 判断字符串是否 JSON Object 格式 |
| isJSONArray | 判断字符串是否 JSON Array 格式 |
| toJsonIndent | JSON String 缩进处理 |
| getArrayType | 获取 Array Type |
| getListType | 获取 List Type |
| getSetType | 获取 Set Type |
| getMapType | 获取 Map Type |
| getType | 获取 Type |


* **Gson 工具类 ->** [GsonUtils.java](https://github.com/afkT/DevUtils-repo/blob/main/local_dev/DevOther/src/main/java//java/dev/other/GsonUtils.java)

| 方法 | 注释 |
| :- | :- |
| toJson | 将对象转换为 JSON String |
| fromJson | 将 JSON String 映射为指定类型对象 |
| isJSON | 判断字符串是否 JSON 格式 |
| isJSONObject | 判断字符串是否 JSON Object 格式 |
| isJSONArray | 判断字符串是否 JSON Array 格式 |
| toJsonIndent | JSON String 缩进处理 |
| createGson | 创建 GsonBuilder |
| createGsonExcludeFields | 创建过滤指定修饰符字段 GsonBuilder |
| getArrayType | 获取 Array Type |
| getListType | 获取 List Type |
| getSetType | 获取 Set Type |
| getMapType | 获取 Map Type |
| getType | 获取 Type |


* **Luban 工具类 ->** [LubanUtils.java](https://github.com/afkT/DevUtils-repo/blob/main/local_dev/DevOther/src/main/java//java/dev/other/LubanUtils.java)

| 方法 | 注释 |
| :- | :- |
| compress | 压缩方法 |
| isFailFinish | isFailFinish |
| setFailFinish | setFailFinish |
| onStart | 开始压缩前调用 |
| onSuccess | 压缩成功后调用 |
| onError | 当压缩过程出现问题时触发 |
| onComplete | 压缩完成 ( 压缩结束 ) |


* **MMKV 工具类 ->** [MMKVUtils.java](https://github.com/afkT/DevUtils-repo/blob/main/local_dev/DevOther/src/main/java//java/dev/other/MMKVUtils.java)

| 方法 | 注释 |
| :- | :- |
| initialize | 初始化方法 ( 必须调用 ) |
| containsMMKV | 是否存在指定 Key 的 MMKV Holder |
| get | 通过 Key 获取 MMKV Holder |
| putHolder | 保存自定义 MMKV Holder |
| defaultHolder | 获取 Default MMKV Holder |
| getMMKV | 获取 MMKV |
| mmapID | 获取 MMKV mmap id |
| isMMKVEmpty | 判断 MMKV 是否为 null |
| isMMKVNotEmpty | 判断 MMKV 是否不为 null |
| containsKey | 是否存在指定 Key value |
| removeValueForKey | 通过 key 移除 value |
| removeValuesForKeys | 通过 key 数组移除 value |
| sync | 同步操作 |
| async | 异步操作 |
| clear | 清除全部数据 |
| encode | encode |
| decodeBool | decodeBool |
| decodeInt | decodeInt |
| decodeLong | decodeLong |
| decodeFloat | decodeFloat |
| decodeDouble | decodeDouble |
| decodeString | decodeString |
| decodeStringSet | decodeStringSet |
| decodeBytes | decodeBytes |
| decodeParcelable | decodeParcelable |


## <span id="javadevothercache">**`java.dev.other.cache`**</span>


* **缓存工具类 ->** [ACache.java](https://github.com/afkT/DevUtils-repo/blob/main/local_dev/DevOther/src/main/java//java/dev/other/cache/ACache.java)

| 方法 | 注释 |
| :- | :- |
| newCache | 获取 DevCache ( 默认缓存文件名 ) |
| put | 保存 String 数据到缓存中 |
| getAsString | 读取 String 数据 |
| getAsJSONObject | 读取 JSONObject 数据 |
| getAsJSONArray | 读取 JSONArray 数据 |
| get | 获取对应 key 的 File 输入流 |
| getAsBinary | 获取 byte[] 数据 |
| getAsObject | 读取 Serializable 数据 |
| getAsBitmap | 读取 Bitmap 数据 |
| getAsDrawable | 读取 Drawable 数据 |
| file | 获取缓存文件 |
| remove | 移除某个 key 的数据 |
| clear | 清除所有数据 |


## <span id="javadevotherwork">**`java.dev.other.work`**</span>


* **WorkManager 工具类 ->** [WorkManagerUtils.java](https://github.com/afkT/DevUtils-repo/blob/main/local_dev/DevOther/src/main/java//java/dev/other/work/WorkManagerUtils.java)

| 方法 | 注释 |
| :- | :- |
| getInstance | 获取 WorkManagerUtils 实例 |
| getWorkManager | 获取 WorkManager |
| setWorkManager | 设置 WorkManager |
| cancelAllWork | 取消所有未完成的 Worker |
| cancelWorkById | 通过 UUID 取消未完成 Worker |
| cancelAllWorkByTag | 通过 TAG 取消未完成 Worker |
| cancelUniqueWork | 通过 Worker 唯一名称取消未完成 Worker |
| pruneWork | 清除已执行 Worker |
| getLastCancelAllTimeMillisLiveData | 获取上次调用 cancelAllWork() 时间戳 |
| getLastCancelAllTimeMillis | 获取上次调用 cancelAllWork() 时间戳 |
| getWorkInfoByIdLiveData | 通过 UUID 获取 WorkInfo |
| getWorkInfoById | 通过 UUID 获取 WorkInfo |
| getWorkInfosByTagLiveData | 通过 TAG 获取 WorkInfo |
| getWorkInfosByTag | 通过 TAG 获取 WorkInfo |
| getWorkInfosForUniqueWorkLiveData | 通过 Worker 唯一名称获取 WorkInfo |
| getWorkInfosForUniqueWork | 通过 Worker 唯一名称获取 WorkInfo |
| getWorkInfosLiveData | 自定义搜索条件获取 WorkInfo |
| getWorkInfos | 自定义搜索条件获取 WorkInfo |
| enqueue | enqueue |
| enqueueUniqueWork | enqueueUniqueWork |
| enqueueUniquePeriodicWork | 加入唯一定期 Worker 执行队列 |
| beginWith | beginWith |
| beginUniqueWork | beginUniqueWork |


## <span id="javadevotherworkdemo">**`java.dev.other.work.demo`**</span>


* ** ->** [ChainWorker.java](https://github.com/afkT/DevUtils-repo/blob/main/local_dev/DevOther/src/main/java//java/dev/other/work/demo/ChainWorker.java)

| 方法 | 注释 |
| :- | :- |
| start | 模拟工作链 |
| builder | builder |
| doWork | doWork |


* **模拟后台间隔性进行定位 ->** [LocationWorker.java](https://github.com/afkT/DevUtils-repo/blob/main/local_dev/DevOther/src/main/java//java/dev/other/work/demo/LocationWorker.java)

| 方法 | 注释 |
| :- | :- |
| doWork | doWork |
| builder | 快捷创建循环 Worker Request |


* **打印日志 Worker ( 用于演示 ) ->** [LogWorker.java](https://github.com/afkT/DevUtils-repo/blob/main/local_dev/DevOther/src/main/java//java/dev/other/work/demo/LogWorker.java)

| 方法 | 注释 |
| :- | :- |
| onStopped | 只会 worker 在运行时执行 onStopped |
| doWork | doWork |
| builder | 快捷创建 {@link OneTimeWorkRequest.Builder} |
| observe | 监听 WorkRequest 状态 |


## <span id="ktx">**`ktx`**</span>


## <span id="ktxdev">**`ktx.dev`**</span>


## <span id="ktxdevassist">**`ktx.dev.assist`**</span>


## <span id="ktxdevother">**`ktx.dev.other`**</span>