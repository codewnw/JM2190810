package com.jm2100810.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServletRequestListener implements ServletRequestListener {

	public MyServletRequestListener() {
	}

	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("Request destroyed.");
	}

	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("Request Initialized.");
	}

}
