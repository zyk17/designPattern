package com.zs.c_007_observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangsan
 * @date 2021/1/13 20:33
 */
public class Goods {

    public double price;

    private List<Observer> observers = new ArrayList<>();

    public void priceCut(double price) {
        this.price = price;
        System.out.println("商品降价了。。。");
        notifyAllObserver();
    }

    public Goods addObserver(Observer e) {
        observers.add(e);
        return this;
    }

    public void notifyAllObserver() {
        GoodsEvent event = new GoodsEvent(this);
        observers.forEach(e->{
            e.goodsPriceCut(event);
        });
    }

}
