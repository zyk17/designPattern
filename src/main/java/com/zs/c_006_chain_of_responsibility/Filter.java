package com.zs.c_006_chain_of_responsibility;

/**
 * @author zhangsan
 * @date 2021/1/13 18:12
 */
public interface Filter {

    void doFilter(Request req, Response res, FilterChain chain);

}

class HTMLFilter implements Filter {

    @Override
    public void doFilter(Request req, Response res, FilterChain chain) {
        System.out.println("html过滤器进来");

        String r = req.body;
        r = r.replace('<', '[').replace('>', ']');
        req.body = r;
        chain.doFilter(req, res);


        System.out.println("html过滤器回去的操作。。");
    }
}

class ZangHuaFilter implements Filter {

    @Override
    public void doFilter(Request req, Response res, FilterChain chain) {
        String r = req.body;
        if (r.contains("傻")) {

        } else {
            chain.doFilter(req, res);
        }
    }
}

class SmileFilter implements Filter {

    @Override
    public void doFilter(Request req, Response res, FilterChain chain) {
        System.out.println("笑脸过滤器进来");


        String r = req.body;
        r = r.replace("(:", "^_^");
        req.body = r;
        chain.doFilter(req, res);


        System.out.println("笑脸过滤器回去的操作。。");
    }
}

class URLFilter implements Filter {

    @Override
    public void doFilter(Request req, Response res, FilterChain chain) {
        System.out.println("url过滤器进来");


        String r = req.body;
        r = r.replace("baidu.com", "https://www.baidu.com");
        req.body = r;
        chain.doFilter(req, res);


        System.out.println("url回去的操作。。");

    }
}
