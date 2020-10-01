<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page directive error attribute</title>
</head>
<body>
	<%@ page errorPage="page_iserror.jsp" %>
	
	<%= 100/0 %>
</body>
</html>