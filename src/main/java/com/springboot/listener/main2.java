package com.springboot.listener;

import com.springboot.filter.secondFilter;
import com.springboot.servlet.secondServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class main2 {
    public static void main(String[] args) {
        SpringApplication.run(main2.class);
    }
    @Bean
    public ServletRegistrationBean getrServletRegistrationBean(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new secondServlet());
        bean.addUrlMappings("/second");
        return bean;
    }
    @Bean
    public FilterRegistrationBean getFilterRegistrationBean(){
        FilterRegistrationBean bean = new FilterRegistrationBean(new secondFilter());
        bean.addUrlPatterns("/second");
        return bean;
    }
    @Bean
    public ServletListenerRegistrationBean getServletListenerRegistrationBean(){
        ServletListenerRegistrationBean bean = new ServletListenerRegistrationBean(new secondlistener());
          return  bean;
    }
}
