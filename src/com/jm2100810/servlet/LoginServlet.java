package com.jm2100810.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet of LoginServlet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("LoginServlet: doPost");
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (username.equals(password)) {
			request.setAttribute("msg", "Login Successfull.");
			RequestDispatcher rd = request.getRequestDispatcher("profile");
			rd.forward(request, response);
		} else {
			// response.sendRedirect("login.html");
			response.sendRedirect("https://www.google.com/?search=Java");
		}
	}

}
