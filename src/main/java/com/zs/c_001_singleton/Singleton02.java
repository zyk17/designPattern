package com.zs.c_001_singleton;

/**
 * 懒汉模式 lazy loading
 * 用到的时候才初始化，但不能保证线程安全
 * @author zhangsan
 * @date 2021/1/12 20:44
 */
public class Singleton02 {

    private Singleton02() {}

    private static Singleton02 INSTANCE;

    public static Singleton02 getInstance(){
        if (INSTANCE == null) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Singleton02();
        }
        return INSTANCE;
    }

}

class TestSingleton02 {
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            new Thread(() -> {
                System.out.println(Singleton02.getInstance().hashCode());
            }).start();
        }
    }
}
