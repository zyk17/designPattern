package com.zs.c_010_proxy.v5;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Random;

/**
 * @author zhangsan
 * @date 2021/1/13 22:06
 */
public class Main {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Operator.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {

                Object r = null;
                if(method.getDeclaringClass() == Object.class) {
                    System.out.println("执行的是Object的方法。。。");
                    proxy.invokeSuper(obj, args);
                }else {
                    System.out.println("执行的是接口的方法。。");

                    long start = System.currentTimeMillis();
                    proxy.invokeSuper(obj, args);
                    long end = System.currentTimeMillis();
                    System.out.println("ran for "+ (end - start) +"mill second");
                }
                return r;
            }
        });

        Operator o = (Operator) enhancer.create();
        o.run();
        System.out.println(o);
        System.out.println(o.hashCode());
    }

}

class Operator {
    public void run (){
        System.out.println("i'm running。。。");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
