<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL - catch</title>
</head>
<body>
	<c:catch var="e">
		<%
			int num1 = Integer.parseInt(request.getParameter("num1"));
				int num2 = Integer.parseInt(request.getParameter("num2"));
				int i = num1 / num2;
				out.print(i);
		%>
	</c:catch>


	<c:out value="${e }" />

	<%-- ${param.num1 / param.num2} --%>
</body>
</html>