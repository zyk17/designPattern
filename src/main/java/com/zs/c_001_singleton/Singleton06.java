package com.zs.c_001_singleton;

/**
 * 枚举实现
 * @author zhangsan
 * @date 2021/1/12 21:13
 */
public enum Singleton06 {
    INSTANCE;
}


class TestSingleton06 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton06.INSTANCE.hashCode());
            }).start();
        }
    }
}
