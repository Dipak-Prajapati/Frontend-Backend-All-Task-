<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="khaki">
	<h1>Mouse Drag Example</h1>
	<jsp:plugin align="middle" height="500" width="500" type="applet"
		code="MouseDrag.class" name="clock" codebase=".">

		<jsp:fallback>
        	<p>Could not load the applet!</p>
        </jsp:fallback>
	</jsp:plugin>
</body>
</html>