package com.zs.c_007_observer;

/**
 * @author zhangsan
 * @date 2021/1/13 20:29
 */
public class Main {

    public static void main(String[] args) {
        Goods goods = new Goods();
        goods.addObserver(new Zhangsan()).addObserver(new Lisi());
        /*try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        goods.priceCut(150);
    }

}
