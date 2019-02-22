package com.wan7451.passvalueproject.fun;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

/**
 * Description:
 * Blog: www.jianshu.com/u/1f69adf1da84
 *
 * @Data: 2019/2/22
 * @Author: wan7451
 */
public class MyLifecycle implements LifecycleObserver {

    private FunBase fun;

    public MyLifecycle(FunBase fun) {
        this.fun = fun;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void onDestory() {
        FunctionManager.init().remove(fun.getName());
    }


}
