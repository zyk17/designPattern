package com.zs.c_001_singleton;

/**
 * 懒汉模式 lazy loading
 * 优化加锁后影响性能。
 * @author zhangsan
 * @date 2021/1/12 20:44
 */
public class Singleton04 {

    private Singleton04() {}

    private static Singleton04 INSTANCE;

    public static Singleton04 getInstance(){
        // double check
        if(INSTANCE == null){
            synchronized (Singleton04.class) {
                if (INSTANCE == null) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Singleton04();
                }
            }
        }
        return INSTANCE;
    }

}

class TestSingleton04 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton04.getInstance().hashCode());
            }).start();
        }
    }
}
