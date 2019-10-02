<%@ page errorPage="error/page-not-found.jsp"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
<meta charset="utf-8">
<title>JSP Login page</title>
</head>
<body>
	<%@ include file="header.jsp"%>
	<%=request.getParameter("msg") == null ? "Please enter credentials" : request.getParameter("msg")%>
	<form action="process-login.jsp" method="post">
		<input type="text" name="username" placeholder="Enter username">
		<input type="password" name="password" placeholder="Enter password">
		<input type="submit" value="Login">
	</form>
	<br />

	<a href="take-me-to-mars.jsp">Take me to Mars (Page not found)</a>
	<%@ include file="footer.jsp"%>
</body>
</html>
