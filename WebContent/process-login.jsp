<!-- request, out and response are implicit object of JSP -->
<%
	String un = request.getParameter("username");
	String pass = request.getParameter("password");

	if (un.equals(pass)) {
		out.print("Hi, " + un);
		%>
		<br>
		<%
		out.print("Login Success!!!.");
	} else {
		response.sendRedirect("login.jsp?msg=Login Faild. Try again....");
	}
%>