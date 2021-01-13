package com.zs.c_005_decorator;

/**
 * @author zhangsan
 * @date 2021/1/13 16:47
 */
public class PersonWrapper implements Person {

    private Person person;

    public PersonWrapper(Person person) {
        this.person = person;
    }

    @Override
    public void working() {
        System.out.println("升职后，多做的事情");
        person.working();
    }
}
