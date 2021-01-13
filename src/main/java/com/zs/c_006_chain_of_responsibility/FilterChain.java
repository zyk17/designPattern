package com.zs.c_006_chain_of_responsibility;

/**
 * @author zhangsan
 * @date 2021/1/13 18:24
 */
public interface FilterChain {

    void doFilter(Request request, Response response);

}
