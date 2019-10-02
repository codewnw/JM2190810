<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL - Choose When Otherwise</title>
</head>
<body>
	<c:choose>
		<c:when test="${param.age <= 6 }">
You are baby.
</c:when>

		<c:when test="${param.age > 6 and param.age < 18 }">
You are teen.
</c:when>

		<c:when test="${param.age >= 18 and param.age < 60 }">
You are adult.
</c:when>

		<c:otherwise>
You must be senior citizen.
</c:otherwise>
	</c:choose>
</body>
</html>