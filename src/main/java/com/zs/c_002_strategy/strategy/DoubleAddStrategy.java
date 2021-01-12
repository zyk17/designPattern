package com.zs.c_002_strategy.strategy;

/**
 * @author zhangsan
 * @date 2021/1/12 22:31
 */
public class DoubleAddStrategy implements OperatorStrategy<Double> {

    @Override
    public Double doOperator(Double a, Double b) {
        return a + b;
    }

}
