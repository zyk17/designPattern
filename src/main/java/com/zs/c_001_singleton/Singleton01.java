package com.zs.c_001_singleton;

/**
 * 饿汉式：
 * 提前创建好一个实例,JVM加载好类就会创建，JVM保证了线程安全的问题
 * 优点：实现简单
 * 缺点：这个类只要加载了，这个实例就会被创建，如果可能不需要但也会创建出来，占内存
 * @author zhangsan
 * @date 2021/1/12 20:34
 */
public class Singleton01 {

    private Singleton01() {}

    private static Singleton01 INSTANCE = new Singleton01();

    public static Singleton01 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Singleton01 s1 = Singleton01.getInstance();
        Singleton01 s2 = Singleton01.getInstance();
        System.out.println(s1 == s2);
    }

}

class TestSingleton01 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton01.getInstance().hashCode());
            }).start();
        }
    }
}
