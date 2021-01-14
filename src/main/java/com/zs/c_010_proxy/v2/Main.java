package com.zs.c_010_proxy.v2;

import java.util.Random;

/**
 * @author zhangsan
 * @date 2021/1/13 22:06
 */
public class Main {

    public static void main(String[] args) {
        new Operator2().run();
    }

}

class Operator {
    public void run() {
        System.out.println("i'm running。。。");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class Operator2 extends Operator {
    public void run() {
        long start = System.currentTimeMillis();
        super.run();
        long end = System.currentTimeMillis();
        System.out.println("ran for " + (end - start) + "mill second");
    }
}
