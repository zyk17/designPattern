package com.zs.c_003_factory.factory;

import com.zs.c_003_factory.model.Car;
import com.zs.c_003_factory.model.Plane;
import com.zs.c_003_factory.model.Train;
import com.zs.c_003_factory.model.Vehicle;

/**
 * 简单工厂
 * 不太灵活，比如新加入一个交通工具，就还得需要在添加方法
 * @author zhangsan
 * @date 2021/1/13 14:51
 */
public class SimpleVehicleFactory {

    public Vehicle createCar() {
        System.out.println("\033[32;4m" + "小汽车生产中。。。" + "\033[0m");
        Car car = new Car();
        System.out.println("\033[32;4m" + "小汽车生产完成。。。" + "\033[0m");
        return car;
    }

    public Vehicle createPlane() {
        System.out.println("\033[32;4m" + "飞机生产中。。。" + "\033[0m");
        Plane plane = new Plane();
        System.out.println("\033[32;4m" + "飞机生产完成。。。" + "\033[0m");
        return plane;
    }

    public Vehicle createTrain() {
        System.out.println("\033[32;4m" + "火车生产中。。。" + "\033[0m");
        Train train = new Train();
        System.out.println("\033[32;4m" + "火车生产完成。。。" + "\033[0m");
        return train;
    }

}
