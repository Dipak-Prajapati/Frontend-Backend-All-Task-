<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<meta charset="ISO-8859-1">
<head>
<title>JSTL fmt:formatDate Tag</title>
</head>

<body>

	<h1>fmt:formateDate</h1>
	<c:set var="current_time" value="<%=new java.util.Date()%>" />
	Date -
	<br>
	<fmt:formatDate value="${current_time}" type="date" />
	<br><hr>
	<br> Time -
	<br>
	<fmt:formatDate value="${current_time}" type="time" />
	<br><hr>
	<br> Date and Time Both -
	<br>
	<fmt:formatDate value="${current_time}" type="both" />
	<br><hr>
	<br> Date in 'dd-MM-yyyy' format -
	<br>
	<fmt:formatDate value="${current_time}" type="date"
		pattern="dd-MM-yyyy" />
	<br><hr>
	<br> Date and time in short style -
	<br>
	<fmt:formatDate value="${current_time}" type="both" dateStyle="short"
		timeStyle="short" />
	<br><hr>
	<br> Date and time in long style -
	<br>
	<fmt:formatDate value="${current_time}" type="both" dateStyle="long"
		timeStyle="long" />
	<br><hr>
	<br> Date and time in US/Alaska(timeZone="GMT-9:00") -
	<br>
	<fmt:formatDate value="${current_time}" type="both" timeZone="GMT-9:00" />
	<br>
</body>
</html>