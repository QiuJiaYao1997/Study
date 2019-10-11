package com.springboot.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

public class secondlistener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("listener==============");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
