package com.zs.c_016_prototype;

/**
 * @author zhangsan
 * @date 2021/1/14 19:51
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person();
        Person p2 = (Person) p1.clone();
        System.out.println(p1 == p2);
        System.out.println(p1.t == p2.t);
    }

}

class Person implements Cloneable {
    int id;
    String name;
    T t = new T();

    @Override
    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
        Person p = (Person) super.clone();
        p.t = (T) t.clone();
        return p;
    }
}

class T implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
