package com.jm2100810.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jm2100810.model.User;

@WebServlet("/el-register")
public class ElRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ElRegistrationServlet() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//response.addCookie(new Cookie("msg2", "Big billion day"));

		User user = new User();
		user.setEmail(request.getParameter("email"));
		request.setAttribute("user", user);
		request.setAttribute("date", new Date());
		getServletConfig().getServletContext().setAttribute("copyright", "@2019");
		request.getRequestDispatcher("el/el-profile.jsp").forward(request, response);
	}

}
