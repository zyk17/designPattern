package com.zs.c_010_proxy.v4;

import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Random;

/**
 * @author zhangsan
 * @date 2021/1/13 22:06
 */
public class Main {

    public static void main(String[] args) {

//        System.setProperty("jdb.proxy.ProxyGenerator.saveGeneratedFiles", "true");
        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles", "true");

        Operator operator = new Operator();
        Runable runable = (Runable) Proxy.newProxyInstance(Operator.class.getClassLoader(), new Class[]{Runable.class},(proxy, method, argss)->{
                System.out.println("代理对象：" + proxy.getClass());
                System.out.println("代理方法：" + method.getName());
                System.out.println("代理方法的参数：" + Arrays.toString(args));

                Object r = null;

                if(method.getDeclaringClass() == Object.class) {
                    System.out.println("执行的是Object的方法。。。");
                    r = method.invoke(operator, argss);
                }else {
                    System.out.println("执行的是接口的方法。。");

                    long start = System.currentTimeMillis();
                    r = method.invoke(operator, argss);
                    long end = System.currentTimeMillis();
                    System.out.println("ran for "+ (end - start) +"mill second");
                }

                return r;
        });
        runable.run();
        System.out.println(runable);
        System.out.println(runable.hashCode());
    }

}

interface Runable {
    void run();
}

class Operator implements Runable {
    public void run (){
        System.out.println("i'm running。。。");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
