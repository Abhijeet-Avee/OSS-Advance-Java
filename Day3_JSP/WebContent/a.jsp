<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="false" errorPage="b.jsp"%>
<%@ include file="Header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
		String no="44";
		Integer val=Integer.parseInt(no);
		out.print(val.toString());
	
%>
<%@ include file="footer.jsp" %>
</body>
</html>