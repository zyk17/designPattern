package com.zs.c_003_factory.factory;

import com.zs.c_003_factory.model.Color;
import com.zs.c_003_factory.model.MoveAble;

/**
 * 抽象工厂，其他工厂的工厂
 * @author zhangsan
 * @date 2021/1/13 15:13
 */
public abstract class AbstractFactory {

    public abstract MoveAble createMoveAble(Class<? extends MoveAble> clazz) throws NoSuchMethodException, Exception;
    public abstract Color getColor(Class<? extends Color> clazz) throws Exception;

}
