<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL - redirect</title>
</head>
<body>
	<c:url value="redirect-page.jsp" var="jct">
		<c:param name="name">Atul</c:param>
		<c:param name="why">Advance Java 80%</c:param>
	</c:url>
	
	<c:redirect url="${jct}" />
</body>
</html>