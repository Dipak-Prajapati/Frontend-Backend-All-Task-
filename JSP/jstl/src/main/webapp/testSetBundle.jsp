<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Test Set Bundle</title>
</head>
<body>
	<h1>fmt:messsage</h1>
	<fmt:message key="count.k1" bundle="${rs}" />
	<br>
	<fmt:message key="count.k2" bundle="${rs}" />
	<br>
	<fmt:message key="count.k3" bundle="${rs}" />
	<br>
	<fmt:message key="count.k4" bundle="${rs}" />
	<br>


</body>
</html>