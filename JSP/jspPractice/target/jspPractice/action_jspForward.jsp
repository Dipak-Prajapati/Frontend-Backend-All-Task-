<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forward Other Page</title>
</head>
<body>
	<h1>Before forward </h1>
	<jsp:forward page="action_forwardShowdata.jsp">
		<jsp:param value="Have A WonderFull Day." name="msg"/>
	</jsp:forward>
	<h1>After Forward</h1>
</body>
</html>