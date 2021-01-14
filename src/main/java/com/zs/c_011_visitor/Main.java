package com.zs.c_011_visitor;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author zhangsan
 * @date 2021/1/14 15:23
 */
public class Main {

    public static void main(String[] args) {
        LinkedBlockingQueue q = new LinkedBlockingQueue(1);
        try {
            q.put("a");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            q.put("a");
            System.out.println("是否阻塞");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            q.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
