package com.zs.c_005_decorator;

/**
 * @author zhangsan
 * @date 2021/1/13 16:29
 */
public class Main {

    public static void main(String[] args) {
        new PersonWrapper(new Employee()).working();
    }

}
