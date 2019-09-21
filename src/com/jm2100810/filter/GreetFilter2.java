package com.jm2100810.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GreetFilter2 implements Filter {

	public GreetFilter2() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("GreetFilter2: pre-processing");
		chain.doFilter(request, response);
		System.out.println("GreetFilter2: post-processing");
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
