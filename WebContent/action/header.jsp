<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Header</title>
</head>
<body>
<h1>This is header</h1>
<p>Welcome, <%=request.getParameter("name")%> <%=request.getParameter("surname")%></p>
<hr>
</body>
</html>