<%@ page errorPage="error/internal-server-error.jsp"%>
<%@ page import="java.math.*" %>
<%
	int num1 = Integer.parseInt(request.getParameter("firstNumber"));
	int num2 = Integer.parseInt(request.getParameter("secondNumber"));

	out.print("Division is: " + (num1 * Math.PI / num2));
%>