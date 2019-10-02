<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL - remove</title>
</head>
<body>
	<c:set var="userName" scope="session" value="atuldwivedi" />
	User Name:
	<c:out value="${userName}" />
	<br>
	
	<c:remove var="userName" />
	
	
	User Name:
	<c:out value="${userName}" />
</body>
</html>