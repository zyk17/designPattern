package com.zs.c_002_strategy;

import com.zs.c_002_strategy.strategy.*;
import com.zs.c_002_strategy.util.Operation;

/**
 * @author zhangsan
 * @date 2021/1/12 21:20
 */
public class Main {

    public static void main(String[] args) {
        OperatorStrategy<Integer> o1 = new IntAddStrategy();
        OperatorStrategy<Integer> o2 = new IntMulStrategy();
        OperatorStrategy<Integer> o3 = new IntSubStrategy();
        OperatorStrategy<Integer> o4 = new IntDivStrategy();
        OperatorStrategy<Double> o5 = new DoubleAddStrategy();

        System.out.println(Operation.operator(10, 2, o1));
        System.out.println(Operation.operator(10, 2, o2));
        System.out.println(Operation.operator(10, 2, o3));
        System.out.println(Operation.operator(10, 2, o4));
        System.out.println(Operation.operator(10.0, 2.5, o5));
    }

}

