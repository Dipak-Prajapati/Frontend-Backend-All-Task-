<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page Directive Import Attribute</title>
</head>
<body>
	<%@ page import="java.util.Date" %>
	<%@ page import="jspPracticePackage.MyClass" %>
	<%= "Today is : "+new Date()%>
	
	<%
		MyClass m1 = new MyClass();
	%>
	<%= m1.hello() %>
</body>
</html>