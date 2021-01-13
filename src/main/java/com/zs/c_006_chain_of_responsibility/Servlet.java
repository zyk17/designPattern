package com.zs.c_006_chain_of_responsibility;

/**
 * @author zhangsan
 * @date 2021/1/13 18:51
 */
public class Servlet {

    public void service(Request req, Response res) {
        res.body = req.body;
    }

}
