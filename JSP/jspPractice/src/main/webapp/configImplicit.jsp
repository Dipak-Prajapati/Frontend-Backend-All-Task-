<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Config Implicit Onbject </title>
</head>
<body>
	
	<%-- <%
		//out.println("Welcome :" + request.getParameter("uname"));
		out.println("Servlet Name :" + config.getServletName());
		String name = config.getInitParameter("name");
		out.println("Config Parameter Name :"+ name);
	%>
	
	<%= config.getInitParameter("name") %>	 --%>
</body>
</html>
