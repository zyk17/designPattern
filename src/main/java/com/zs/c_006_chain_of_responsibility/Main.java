package com.zs.c_006_chain_of_responsibility;

/**
 * @author zhangsan
 * @date 2021/1/13 18:06
 */
public class Main {
    static MyFilterChain filterChain;
    static Servlet servlet;

    static {
        filterChain = new MyFilterChain();
        filterChain.addFilter(new HTMLFilter());
//        filterChain.addFilter(new ZangHuaFilter());
        filterChain.addFilter(new URLFilter());
        filterChain.addFilter(new SmileFilter());
        filterChain.addFilter(new ZangHuaFilter());
        servlet = new Servlet();

        filterChain.setServlet(servlet);
    }

    public static void main(String[] args) {
//        String msg = "大叫好 (: 我是张三 baidu.com点击查找，<script>傻</script>";
//        String r = msg;
//        // 过滤HTML标签
//        r = r.replace('<', '[').replace('>', ']');
//        // 过滤脏话，url
//        r = r.replace("傻", "福").replace("baidu.com", "https://www.baidu.com");
//        // 替换表情
//        r = r.replace("(:", "^_^");
//
//        System.out.println(r);

        Request req = new Request();
        Response res = new Response();
        req.body = "大叫好 (: 我是张三 baidu.com点击查找，<script>傻</script>";
        filterChain.doFilter(req, res);

        System.out.println(res.body);
    }

}
