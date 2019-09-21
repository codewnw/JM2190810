package com.jm2100810.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class AMainFilter implements Filter {

	public AMainFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//pre-processing
		System.out.println("MainFilter: pre-processing");
		System.out.println(request.getLocalAddr());
		System.out.println(request.getLocale());
		System.out.println(request.getLocalPort());
		System.out.println(request.getRemoteAddr());
		System.out.println(request.getRemoteHost());
		System.out.println(request.getServerName());
		chain.doFilter(request, response);
		//post-processing
		System.out.println("MainFilter: post-processing");
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
