<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EL - profile</title>
</head>
<body>
	<h1>EL - profile</h1>
	<table>
		<tr>
			<td><strong>Name</strong></td>
			<td>${param.name}</td>
		</tr>
		<tr>
			<td><strong>Email</strong></td>
			<td>${requestScope.user.email}</td>
		</tr>
		<tr>
			<td><strong>Courses</strong></td>
			<td>${paramValues.courses[0]}&nbsp;${paramValues.courses[1]}
				&nbsp; ${paramValues.courses[2]}</td>
		</tr>
		<tr>
			<td><strong>Date</strong></td>
			<td>${requestScope.date}</td>
		</tr>
		<tr>
			<td><strong>Copyright</strong></td>
			<td>${applicationScope.copyright}</td>
		</tr>
		<tr>
			<td><strong>Institute</strong></td>
			<td>${initParam.institute}</td>
		</tr>
	</table>

	<hr>

	<h1>Cookie</h1>
	<%-- <span>${cookie.msg2.value}</span> --%>
	<hr>
	<h1>Headers</h1>
	<br> Host: ${header.host}
	<br> Accepts: ${header.accept}
	<br> Accepts Language: ${header["accept-language"]}
	<br> User Agent: ${header["user-agent"]}
</body>
</html>