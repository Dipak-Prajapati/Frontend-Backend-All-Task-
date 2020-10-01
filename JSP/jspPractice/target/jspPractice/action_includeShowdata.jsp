<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Include Show Data</title>
</head>
<body>
	<%="Name :" + request.getParameter("name")%><br />
	<%="SurName :" + request.getParameter("surname")%><br />
	<%=request.getParameter("msg")%>
</body>
</html>