package com.zs.c_003_factory;

import com.zs.c_003_factory.factory.AbstractFactory;
import com.zs.c_003_factory.factory.MyVehicleFactory;
import com.zs.c_003_factory.model.Car;
import com.zs.c_003_factory.model.Color;
import com.zs.c_003_factory.model.MoveAble;
import com.zs.c_003_factory.model.Red;

/**
 * @author zhangsan
 * @date 2021/1/13 14:45
 */
public class Main {

    public static void main(String[] args) {
//        CarFactory carFactory = new CarFactory();
//        Vehicle vehicle = carFactory.create();
//        vehicle.run();
        AbstractFactory factory = new MyVehicleFactory();
        try {
            MoveAble moveAble = factory.createMoveAble(Car.class);
            Color color = factory.getColor(Red.class);
            moveAble.run();
            color.print();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
