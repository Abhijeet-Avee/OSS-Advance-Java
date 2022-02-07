<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    import="java.util.*, java.sql.*"
    isThreadSafe="false"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- declaration tag -->
<%! private int counter=0;%>

<!-- it is a HTML comments -->
<%-- it is a JSP comments --%>
<%-- 
<% counter++;
	out.println(counter+"<br>");
%>>
 --%>
<%--shortcut of scriptlet --%>
<%=out.print(counter++) %>

</body>
</html>