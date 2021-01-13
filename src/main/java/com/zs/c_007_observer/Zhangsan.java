package com.zs.c_007_observer;

/**
 * @author zhangsan
 * @date 2021/1/13 20:38
 */
public class Zhangsan implements Observer {
    @Override
    public void goodsPriceCut(GoodsEvent event) {
        if(event.target.price <= 100){
            System.out.println("张三得知商品小于100元，觉得可以购买了。。。");
        }else {
            System.out.println("张三觉得还是不够划算于是不购买了。");
        }
    }
}

class Lisi implements Observer {
    @Override
    public void goodsPriceCut(GoodsEvent event) {
        if(event.target.price <= 150){
            System.out.println("李四得知商品小于150元，觉得可以购买了。。。");
        }else {
            System.out.println("李四觉得还是不够划算于是不购买了。");
        }
    }
}
