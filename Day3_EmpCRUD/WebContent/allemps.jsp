<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>YMSLI Employee Application</title>
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
<br><br>
Welcome ${user.username}&nbsp;&nbsp;&nbsp;<a href="LogoutController">Logout</a>
<br><br>

	<table>
		<thead>
			<tr>
				<th>id</th>
				<th>employee name</th>
				<th>city</th>
				<th>designation</th>
				<th>salary</th>
				<th>update</th>
				<th>delete</th>
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
					<td><a href="EmployeeController.do?action=update&id=${employee.id}">update</a></td>
					<td><a href="EmployeeController.do?action=delete&id=<c:out value="${employee.id}"/>">delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
<br>
<a href="EmployeeController.do?action=addemp">Add new employee</a>
</body>
</html>