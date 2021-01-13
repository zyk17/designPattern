package com.zs.c_007_observer;

/**
 * @author zhangsan
 * @date 2021/1/13 20:36
 */
public class GoodsEvent {

    public Goods target;

    public GoodsEvent(Goods goods) {
        this.target = goods;
    }
}
