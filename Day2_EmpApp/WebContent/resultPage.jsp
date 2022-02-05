<%@page import="com.model.persistence.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>employee application</title>
</head>
<body>
<%

	Employee employee=(Employee)session.getAttribute("employee");

	out.print(employee);

%>
</body>
</html>