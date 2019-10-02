<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration Form</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/el-register" method="post">
		<table border="1">
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" placeholder="Enter name">
				</td>
			</tr>
			<tr>
				<td>Age</td>
				<td><input type="number" name="age" placeholder="Enter Age">
				</td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="email" name="email" placeholder="Enter email">
				</td>
			</tr>
			<tr>
				<td>Courses</td>
				<td><input type="checkbox" name="courses" value="M1"> Core Java &nbsp;
				<input type="checkbox" name="courses" value="M2"> Advance Java &nbsp;
				<input type="checkbox" name="courses" value="M3"> Java Frameworks
				</td>
			</tr>
			<tr>
				<td><input type="reset" value="Reset"></td>
				<td><input type="submit" value="Submit">
				</td>
			</tr>
		</table>

	</form>
</body>
</html>
