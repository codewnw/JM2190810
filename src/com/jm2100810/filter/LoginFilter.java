package com.jm2100810.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/login")
public class LoginFilter implements Filter {

	List<String> bloackedUsers = new ArrayList<>();

	public LoginFilter() {
		bloackedUsers.add("sachin");
		bloackedUsers.add("saurav");
		bloackedUsers.add("Sehwag");
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("LoginFilter: pre-processing");
		String username = request.getParameter("username");
		if (bloackedUsers.contains(username)) {
			PrintWriter out = response.getWriter();
			out.print("You are bloacked for 30 minutes.");
		} else {
			chain.doFilter(request, response);
			System.out.println("LoginFilter: post-processing");
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
