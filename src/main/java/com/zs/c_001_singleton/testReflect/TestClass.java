package com.zs.c_001_singleton.testReflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class TestClass {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<SingletonClass> c1 = SingletonClass.class;
        Field[] fields = c1.getDeclaredFields();
        for (Field field : fields) {
            if ("flag".equals(field.getName())) {
                field.setAccessible(true);
                try {
                    Class<?> aClass = Class.forName(field.getType().getName());
                    System.out.println(aClass);
                    Object o = aClass.getDeclaredConstructor().newInstance();
                    Field count = aClass.getDeclaredField("count");
                    count.setAccessible(true);
                    count.set(o, -1);
                    field.set(c1, o);

                    System.out.println(c1);
                } catch (ClassNotFoundException | NoSuchFieldException e) {
                    e.printStackTrace();
                }
                break;
            }
        }

        Constructor<SingletonClass> constructor = c1.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonClass s2 = constructor.newInstance();
        SingletonClass s1 = SingletonClass.getInstance();

        System.out.println(s1 == s2);
    }
}
