package com.zs.c_003_factory.factory;

import com.zs.c_003_factory.model.Car;
import com.zs.c_003_factory.model.Vehicle;

/**
 * @author zhangsan
 * @date 2021/1/13 14:41
 */
public class CarFactory {

    public Vehicle create() {
        System.out.println("\033[32;4m" + "小汽车生产中。。。" + "\033[0m");
        Car car = new Car();
        System.out.println("\033[32;4m" + "小汽车生产完成。。。" + "\033[0m");
        return car;
    }

}
