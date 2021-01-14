package com.zs.c_017_memento;

import java.io.*;

/**
 * 备忘录把对象的某一瞬时状态可以存储起来
 * 带有深拷贝
 * @author zhangsan
 * @date 2021/1/14 20:24
 */
public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String fileName = System.getProperty("user.dir") + "/src/main/java/"
                + com.zs.c_013_adapter.Main.class.getPackageName().replace('.', '/')
                + "/object";

        Person person = new Person();
        person.id = 1;
        person.name = "张三";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
        oos.writeObject(person);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
        Person p2 = (Person) ois.readObject();
        System.out.println(person == p2);
        System.out.println(person);
        System.out.println(p2);
    }

}
class Person implements Serializable {

    private static final long serialVersionUID = 9527L;

    int id;
    String name;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
