package com.zs.c_009_flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangsan
 * @date 2021/1/13 21:50
 */
public class Main {
    public static void main(String[] args) {
        ConnectionPool pool = new ConnectionPool();
        for (int i = 0; i < 100; i++) {
            System.out.println(pool.get());
        }
    }
}

class Connection {
    public boolean idle = true;

    public boolean isIdle() {
        return idle;
    }

    public void setIdle(boolean idle) {
        this.idle = idle;
    }
}

class ConnectionPool {

    List<Connection> conns = new ArrayList<>();
    {
        for (int i = 0; i < 16; i++) {
            conns.add(new Connection());
        }
    }

    public Connection get(){
        for (Connection conn : conns) {
            if(conn.isIdle()) {
                conn.setIdle(false);
                return conn;
            }
        }
        return new Connection();
    }
}
