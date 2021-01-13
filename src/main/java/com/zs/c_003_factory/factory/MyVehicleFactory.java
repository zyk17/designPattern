package com.zs.c_003_factory.factory;

import com.zs.c_003_factory.model.Color;
import com.zs.c_003_factory.model.MoveAble;

/**
 * @author zhangsan
 * @date 2021/1/13 15:18
 */
public class MyVehicleFactory extends AbstractFactory {

    @Override
    public MoveAble createMoveAble(Class<? extends MoveAble> clazz) throws Exception {
        return clazz.getConstructor().newInstance();
    }

    @Override
    public Color getColor(Class<? extends Color> clazz) throws Exception {
        return clazz.getConstructor().newInstance();
    }
}
