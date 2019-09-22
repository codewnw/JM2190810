package com.jm2100810.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServletContextChangeListener implements ServletContextAttributeListener {

	public MyServletContextChangeListener() {
	}

	public void attributeAdded(ServletContextAttributeEvent scae) {
		System.out.println(scae.getName() + " is added.");
	}

	public void attributeRemoved(ServletContextAttributeEvent scae) {
		System.out.println(scae.getName() + " is removed.");
	}

	public void attributeReplaced(ServletContextAttributeEvent scae) {
		System.out.println(scae.getName() + " is replaced.");
	}

}
