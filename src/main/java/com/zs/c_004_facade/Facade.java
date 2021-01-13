package com.zs.c_004_facade;

/**
 * @author zhangsan
 * @date 2021/1/13 16:06
 */
public class Facade {

    Module1 m1 = new Module1();
    Module2 m2 = new Module2();
    Module3 m3 = new Module3();

    public void test() {
        m1.a();
        m1.b();
        m1.c();
        m2.a();
        m3.a();
        m3.b();
    }

}
