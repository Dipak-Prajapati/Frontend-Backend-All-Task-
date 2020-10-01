<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page Directive buffer attribute</title>
</head>
<body>
	<%@ page buffer="2kb" autoFlush="false" %>
	<%@ page isThreadSafe="true" %>
	<% 
		for (int i=0; i<9000; i++) 
		{ 
			out.print("This is buffer Attribute of Page Directive" + i);
		} 
	%>
 

	<h1>This is buffer Attribute of Page Directive</h1>
</body>
</html>