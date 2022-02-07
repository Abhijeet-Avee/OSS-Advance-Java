<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee list</title>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>
<body>
<table>
	<thead>
		<tr>
			<th>id</th>
			<th>ename</th>
			<th>city</th>
			<th>desi</th>
			<th>salary</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${employees}" var="employee">
			<tr>
				<td>${employee.id}</td>
				<td>${employee.ename}</td>
				<td>${employee.city}</td>
				<td>${employee.desi}</td>
				<td>${employee.salary}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>


