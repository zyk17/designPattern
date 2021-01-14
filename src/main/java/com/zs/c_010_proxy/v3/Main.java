package com.zs.c_010_proxy.v3;

import java.util.Random;

/**
 * @author zhangsan
 * @date 2021/1/13 22:06
 */
public class Main {

    public static void main(String[] args) {
        new OperatorProxy(new Operator()).run();
    }

}

interface Runable {
    void run();
}

class Operator implements Runable {
    public void run (){
        System.out.println("i'm running。。。");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class OperatorProxy implements Runable {

    public Operator operator;
    public OperatorProxy(Operator o) {
        this.operator = o;
    }

    public void run (){
        long start = System.currentTimeMillis();

        operator.run();
        long end = System.currentTimeMillis();
        System.out.println("ran for "+ (end - start) +"mill second");
    }

}
