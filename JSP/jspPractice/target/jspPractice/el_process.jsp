<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EL Process</title>
</head>
<body>
	<%@page isELIgnored="false" %>
	<h1>param</h1>
	Welcome : ${param.name}<br/>
	<% String name = request.getParameter("name"); %>
	<%
		session.setAttribute("uname", name);
	%>
	<jsp:include page="el_session.jsp"></jsp:include>
	
</body>
</html>