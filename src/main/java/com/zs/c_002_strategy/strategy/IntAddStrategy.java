package com.zs.c_002_strategy.strategy;

/**
 * int类型加操作的策略
 * @author zhangsan
 * @date 2021/1/12 22:28
 */
public class IntAddStrategy implements OperatorStrategy<Integer> {


    @Override
    public Integer doOperator(Integer a, Integer b) {
        return a + b;
    }
}
