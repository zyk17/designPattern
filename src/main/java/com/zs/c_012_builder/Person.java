package com.zs.c_012_builder;

/**
 * @author zhangsan
 * @date 2021/1/14 15:58
 */
public class Person {

    private int id;
    private String name;
    private int age;
    private String sex;
    private String idCard;
    private int score;


    public static class PersonBuilder {

        private Person person = new Person();

        public PersonBuilder basicInfo(int id, String name, int age, String sex) {
            person.id = id;
            person.name = name;
            person.age = age;
            person.sex = sex;
            return this;
        }

        public PersonBuilder idCard(String idCard) {
            person.idCard = idCard;
            return this;
        }

        public PersonBuilder score(int score) {
            person.score = score;
            return this;
        }

        public Person build() {
            return person;
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", idCard='" + idCard + '\'' +
                ", score=" + score +
                '}';
    }
}
