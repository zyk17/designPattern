package com.zs.c_001_singleton;

/**
 * 静态内部类方式
 * 解决了饿汉式，一使用那个单例类，实例就会被new的问题
 * @author zhangsan
 * @date 2021/1/12 21:07
 */
public class Singleton05 {

    private Singleton05(){}

    private static class SingletonHolder {
        private static Singleton05 INSTANCE = new Singleton05();
    }

    public static Singleton05 getInstance() {
        return SingletonHolder.INSTANCE;
    }

}

class TestSingleton05 {
    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("com.zs.c_001_singleton.Singleton05.SingletonHolder");
            System.out.println(aClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton05.getInstance().hashCode());
            }).start();
        }
    }
}
