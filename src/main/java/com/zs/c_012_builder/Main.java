package com.zs.c_012_builder;

/**
 * @author zhangsan
 * @date 2021/1/14 15:58
 */
public class Main {

    public static void main(String[] args) {
        Person person = new Person.PersonBuilder().basicInfo(1, "张三", 18, "男")
//                .idCard("4111111111111111111")
                .score(100)
                .build();
        System.out.println(person);
    }

}
