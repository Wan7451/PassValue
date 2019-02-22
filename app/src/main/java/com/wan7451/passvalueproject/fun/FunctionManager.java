package com.wan7451.passvalueproject.fun;


import java.util.HashMap;

import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleOwner;

/**
 * Description:
 * Blog: www.jianshu.com/u/1f69adf1da84
 *
 * @Data: 2019/2/22
 * @Author: wan7451
 */
public class FunctionManager {

    private static FunctionManager manager;
    private HashMap<String, FunBase> funs;

    private FunctionManager() {
        funs = new HashMap<>();
    }

    public static FunctionManager init() {
        if (manager == null) {
            manager = new FunctionManager();
        }
        return manager;
    }


    public void addFunction(@NonNull LifecycleOwner owner, @NonNull FunBase fun) {
        funs.put(fun.getName(), fun);
        owner.getLifecycle().addObserver(new MyLifecycle(fun));
    }


    public void addFunction(@NonNull FunBase fun) {
        funs.put(fun.getName(), fun);
    }


    public <R, P> R invokeParamsResult(@NonNull String name, @NonNull P params) {
        FunBase function = funs.get(name);
        if (function == null) {
            return null;
        }
        if (function instanceof FunctionParamsResult) {
            FunctionParamsResult fun = (FunctionParamsResult) function;
            return (R) fun.invoke(params);
        }
        return null;
    }

    public <R> R invokeResult(@NonNull String name) {
        FunBase function = funs.get(name);
        if (function == null) {
            return null;
        }
        if (function instanceof FunctionResult) {
            FunctionResult fun = (FunctionResult) function;
            return (R) fun.invoke();
        }
        return null;
    }


    public <P> void invokeParams(@NonNull String name, @NonNull P p) {
        FunBase function = funs.get(name);
        if (function == null) {
            return;
        }
        if (function instanceof FunctionParams) {
            FunctionParams fun = (FunctionParams) function;
            fun.invoke(p);
        }
    }

    public void invoke(@NonNull String name) {
        FunBase function = funs.get(name);
        if (function == null) {
            return;
        }
        if (function instanceof Function) {
            Function fun = (Function) function;
            fun.invoke();
        }
    }

    public void remove(String name) {
        funs.remove(name);
    }
}
