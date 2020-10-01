<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Include Other Page</title>
</head>
<body>
	<h1>Before Include</h1>
	<jsp:include page="action_includeShowdata.jsp">
		<jsp:param value="Have A WonderFull Day." name="msg" />
	</jsp:include>
	<h1>After Include</h1>
</body>
</html>