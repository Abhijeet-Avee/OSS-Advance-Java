
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page import="com.demo.Dog"%>
<%@page import="com.demo.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>print all employees</title>
</head>
<body>

    Favorite Team: ${footballList[0]} <br>

	Worst Team: ${footballList["1"]} <br>
  
	  ${person.dog.dogName }<br>

	<br>

	<c:forEach items="${names}" var="name">
		<c:out value="${name }"></c:out><br>
	</c:forEach>
</body>
</html>



