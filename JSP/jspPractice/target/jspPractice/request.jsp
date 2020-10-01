<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Request Implicit Object</title>
</head>
<body>

	<%
		String name = request.getParameter("uname");
		out.println("Welcome : " + name);
	%>
	<br/>

	<h2>Information retrieved from the request object - </h2>
	
	JSP request came from : <%= request.getRequestURI() %> <br/>
	Protocol of request : <%= request.getProtocol()%> <br/>
	IP address of request : <%= request.getRemoteAddr() %> <br/>
	Server name : <%= request.getServerName()%> <br/>
	Server Port : <%= request.getServerPort() %> <br/>
	Is request secure : <%= request.isSecure() %> <br/>
	Content-type of request : <%= request.getContentType() %> <br/>
	JSP request method  : <%= request.getMethod() %> <br/>
	
</body>
</html>