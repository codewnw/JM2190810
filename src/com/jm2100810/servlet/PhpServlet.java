package com.jm2100810.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PhpServlet", urlPatterns = { "/php-enrollment" }, initParams = {
		@WebInitParam(name = "trainerName", value = "Sia"),
		@WebInitParam(name = "trainerMobile", value = "9876543210") })
public class PhpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PhpServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/HTML");
		String name = request.getParameter("name");

		PrintWriter out = response.getWriter();
		out.print("<h1>Hello, " + name + "</h1>");

		ServletConfig config = getServletConfig();
		String trainerName = config.getInitParameter("trainerName");
		String trainerMobile = config.getInitParameter("trainerMobile");
		out.print("<p>Your triner name is <strong>" + trainerName + "</strong> and his mobile number is <strong>"
				+ trainerMobile + "</strong></p>");

		ServletContext context = config.getServletContext();
		String instituteName = context.getInitParameter("institute");
		out.print("<p>Your institute is <strong>" + instituteName + "</strong></p>");
	}

}
