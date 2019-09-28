<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
<meta charset="utf-8">
<title>JSP Hello World!!!</title>
</head>
<body>
	<h1>This is JSP hello world program.</h1>
	<ul>
		<li>JSP: JavaServer pages</li>
		<li>Java code embedded into HTML</li>
		<li>It is extension of Servlet</li>
	</ul>

	<!-- This is Scriptlet Tag of JSP -->
	<%
		int i = 10;
		int j = 20;
		int temp = 200;
		int result = sum(i, j);
	%>

	<!-- This is expression tag of JSP -->
	<%="Ram" + " Shyam"%>
	<br />
	<%=i + j%>
	<br />
	<%= result %>

	<!-- This is declaration tag of JSP -->
	<%!
	int minimum = 100;
	int sum(int a, int b) {
		return minimum + a + b;
	}%>
</body>
</html>
