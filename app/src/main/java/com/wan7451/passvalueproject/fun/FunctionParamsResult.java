package com.wan7451.passvalueproject.fun;

/**
 * Description:
 * Blog: www.jianshu.com/u/1f69adf1da84
 *
 * @Data: 2019/2/22
 * @Author: wan7451
 */
public abstract class FunctionParamsResult<P, R> extends FunBase {

    public FunctionParamsResult(String name) {
        super(name);
    }

    public abstract R invoke(P p);


}
