package com.jm2100810.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServletRequestChangeAttributeListener implements ServletRequestAttributeListener {

	public MyServletRequestChangeAttributeListener() {
	}

	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		System.out.println(srae.getName() + " is removed");
	}

	public void attributeAdded(ServletRequestAttributeEvent srae) {
		System.out.println(srae.getName() + " is added");
	}

	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		System.out.println(srae.getName() + " is replaced");
	}

}
