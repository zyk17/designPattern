package com.zs.c_010_proxy.v1;

import java.util.Random;

/**
 * @author zhangsan
 * @date 2021/1/13 22:06
 */
public class Main {

    public static void main(String[] args) {
        new Operator().run();
    }

}

class Operator {
    public void run (){
        long start = System.currentTimeMillis();

        System.out.println("i'm running。。。");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("ran for "+ (end - start) +"mill second");
    }
}
