package com.zs.c_019_state;

/**
 * @author zhangsan
 * @date 2021/1/14 20:54
 */
public class Main {
    public static void main(String[] args) {
        Connection connectionOpenState = new ConnectionOpenState();
        Connection connectionCloseState = new ConnectionCloseState();
        connectionOpenState.open();
        connectionOpenState.close();
        connectionCloseState.open();
        connectionCloseState.close();
    }
}

abstract class Connection {
    abstract void open();
    abstract void close();
}

class ConnectionOpenState extends Connection {

    @Override
    void open() {
        System.out.println("已经打开,无需打开...");
    }

    @Override
    void close() {
        System.out.println("关闭");
    }
}

class ConnectionCloseState extends Connection {

    @Override
    void open() {
        System.out.println("打开");
    }

    @Override
    void close() {
        System.out.println("已经关闭,无需关闭...");
    }
}
