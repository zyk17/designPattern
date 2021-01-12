package com.zs.c_001_singleton;

/**
 * 懒汉模式 lazy loading
 * 解决懒汉的问题，加锁
 * @author zhangsan
 * @date 2021/1/12 20:44
 */
public class Singleton03 {

    private Singleton03() {}

    private static Singleton03 INSTANCE;

    public /*synchronized*/ static Singleton03 getInstance(){
        synchronized (Singleton03.class) {
            if (INSTANCE == null) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Singleton03();
            }
        }
        return INSTANCE;
    }

}

class TestSingleton03 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton03.getInstance().hashCode());
            }).start();
        }
    }
}
