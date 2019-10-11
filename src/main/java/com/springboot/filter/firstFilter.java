package com.springboot.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
@WebFilter(filterName = "firstFilter",urlPatterns = "/first")
public class firstFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入filter");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("离开");
    }

    @Override
    public void destroy() {

    }
}
