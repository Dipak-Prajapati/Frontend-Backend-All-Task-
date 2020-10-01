<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page Directive info Attribute</title>
</head>
<body>
	<%@ page info="page_information" %>
	<h1>This is info attribue of page directive</h1>
	
	<%= getServletInfo() %>
</body>
</html>