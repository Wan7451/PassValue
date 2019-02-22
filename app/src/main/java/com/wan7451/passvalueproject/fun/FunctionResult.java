package com.wan7451.passvalueproject.fun;

/**
 * Description:
 * Blog: www.jianshu.com/u/1f69adf1da84
 *
 * @Data: 2019/2/22
 * @Author: wan7451
 */
public abstract class FunctionResult<R> extends FunBase {

    public FunctionResult(String name) {
        super(name);
    }


    public abstract R invoke();


}
