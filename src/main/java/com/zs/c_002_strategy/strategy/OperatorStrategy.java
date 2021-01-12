package com.zs.c_002_strategy.strategy;

/**
 * 操作策略
 * @author zhangsan
 * @date 2021/1/12 22:25
 */
public interface OperatorStrategy<T> {

    T doOperator(T a, T b);

}
