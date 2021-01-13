package com.zs.c_003_factory;

import com.zs.c_003_factory.factory.CarFactory;
import com.zs.c_003_factory.model.Vehicle;

/**
 * @author zhangsan
 * @date 2021/1/13 14:45
 */
public class Main {

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Vehicle vehicle = carFactory.create();
        vehicle.run();
    }

}
