# PassValue
一个很有意思的组件间传递数据的Demo

1. 可以在Activity与Fragment之间随意传值、作方法处理

2. 类似于EventBus

3. 也可以在其他地方使用，但需要注意销魂的时候移除方法

4. 使用LifecycleOwner检测Activity与Fragment的生命周期，避免出现内存泄露的问题



-----
第一步：注册方法
```
 FunctionManager.init().addFunction(this, new FunctionParamsResult<String, String>("方法名") {
            @Override
            public String invoke(String s) {
                //执行操作
                return s;
            }
        });
```

第二步：调用方法
```
String 调用结果 = FunctionManager.init().invokeParamsResult("方法名", "传参数");

```
第三部:取消注册（Activity、Fragment,可以不调用）
```
FunctionManager.init().remove("方法名");
```
