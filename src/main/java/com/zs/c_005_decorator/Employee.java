package com.zs.c_005_decorator;

/**
 * @author zhangsan
 * @date 2021/1/13 17:01
 */
public class Employee implements Person {
    @Override
    public void working() {
        System.out.println("正在工作。。。");
    }
}
