<jsp:useBean id="user" class="com.jm2100810.model.User" />
<jsp:setProperty property="*" name="user" />
<jsp:forward page="user-profile.jsp">
	<jsp:param value="Registration successfull." name="message" />
</jsp:forward>








<%-- 
<%@ page import="com.jm2100810.model.User"%>
<%

	User user = new User();

	String name = request.getParameter("name");
	int age = Integer.parseInt(request.getParameter("age"));
	String email = request.getParameter("email");

	
	user.setName(name);
	user.setAge(age);
	user.setEmail(email);
	
	request.setAttribute("user", user);
	request.getRequestDispatcher("user-profile.jsp").forward(request, response);
%> --%>