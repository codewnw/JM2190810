<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL - if</title>
</head>
<body>
	<c:if test="${param.name eq 'Atul' }">
		<span>Atul Dwivedi</span>
	</c:if>
	<c:if test="${param.name ne 'Atul' }">
		<span>${param.name}</span>
	</c:if>
</body>
</html>