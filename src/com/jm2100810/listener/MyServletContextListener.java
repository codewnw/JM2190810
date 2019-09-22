package com.jm2100810.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServletContextListener implements ServletContextListener {

	public MyServletContextListener() {
	}

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Application is going down.");
	}

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Application is up");
	}

}
