package com.zs.c_002_strategy.util;

import com.zs.c_002_strategy.strategy.OperatorStrategy;

/**
 * @author zhangsan
 * @date 2021/1/12 22:33
 */
public class Operation {

    public static <T> T operator(T a, T b, OperatorStrategy<T> o) {
        return o.doOperator(a, b);
    }

}
