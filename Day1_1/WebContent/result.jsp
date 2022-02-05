<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result Page</title>
</head>
<body>
	<%
		Integer result = (Integer)request.getAttribute("result");
		out.print("Sum : "+ result);
	%>
	<a href="cal.html"><br/><br/>Go to calculate more</a>
</body>
</html>