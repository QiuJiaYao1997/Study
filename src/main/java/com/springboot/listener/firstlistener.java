package com.springboot.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebListener;

@WebListener
public class firstlistener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("listener==============");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
