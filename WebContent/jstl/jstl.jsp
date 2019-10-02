<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL</title>
</head>
<body>
	<h1>JSTL - if</h1>
	<form action="if.jsp" method="post">
		<input type="text" name="name"><input type="submit">
	</form>
	
	<h1>JSTL - out</h1>
	<form action="out.jsp" method="post">
		<input type="text" name="name"><input type="submit">
	</form>
	
	<h1>JSTL - catch</h1>
	<form action="catch.jsp" method="post">
		<input type="number" name="num1"><input type="number" name="num2"><input type="submit">
	</form>
	
	<h1>JSTL - forEach</h1>
	<a href="forEach.jsp">For Each</a>
	
	<h1>JSTL - choose-when-otherwise</h1>
	<form action="choose-when-otherwise.jsp" method="post">
		<input type="number" name="age"><input type="submit">
	</form>
	
	<h1>JSTL - import</h1>
	<a href="import.jsp">Import</a>
	
	<h1>JSTL - redirect</h1>
	<a href="redirect.jsp">Redirect</a>
	
	<h1>JSTL - remove</h1>
	<a href="remove.jsp">Remove</a>
	
		<h1>JSTL - forTokens</h1>
	<a href="forTokens.jsp">For tokens</a>
</body>
</html>