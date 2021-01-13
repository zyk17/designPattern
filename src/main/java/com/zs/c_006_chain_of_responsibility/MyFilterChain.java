package com.zs.c_006_chain_of_responsibility;

/**
 * @author zhangsan
 * @date 2021/1/13 18:25
 */
public class MyFilterChain implements FilterChain {

    // 包含的过滤器
    private Filter[] filters = new Filter[0];
    // 总共有多少个过滤器
    private int n;
    // 当前执行的过滤器的位置
    private int pos;
    // 过滤器数组不够时，每回增加多少个过滤器位置
    public static final int INCREMENT = 10;

    private Servlet servlet;



    @Override
    public void doFilter(Request request, Response response) {
        if (pos < n) {
            // 如果还有下一个过滤器
            filters[pos++].doFilter(request, response, this);
        }

        servlet.service(request, response);

    }

    void addFilter(Filter filter) {
        // 防止同一过滤器被多次添加
        for(Filter element:filters)
            if(filter==element)
                return;

        if (n == filters.length) {
            Filter[] newFilters =
                    new Filter[n + INCREMENT];
            System.arraycopy(filters, 0, newFilters, 0, n);
            filters = newFilters;
        }
        filters[n++] = filter;
    }

    void setServlet(Servlet servlet) {
        this.servlet = servlet;
    }

}
