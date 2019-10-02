<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile</title>
</head>
<body>
	<jsp:include page="header.jsp">
		<jsp:param value="Dwivedi" name="surname" />
	</jsp:include>
	<p><%=request.getParameter("message")%></p>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>