<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<title>JSTL fmt:timeZone Tag</title>
</head>

<body>
	<h1>fmt:timeZone</h1>
	<c:set var="current_date" value="<%=new java.util.Date()%>" />

	<h3>Date and time in 'Asia/Calcutta' (GMT+5:30) -</h3>
	<fmt:timeZone value="Asia/Calcutta">
		<fmt:formatDate value="${current_date}" type="both" dateStyle="long"
			timeStyle="long" />
	</fmt:timeZone>

	<h3>Date and time in 'US/Alaska'(GMT-9:00) -</h3>
	<fmt:timeZone value="US/Alaska">
		<fmt:formatDate value="${current_date}" type="both" dateStyle="long"
			timeStyle="long" />
	</fmt:timeZone>

	<h3>Date and time in 'America/Los_Angeles'(GMT-8:00) -</h3>
	<fmt:timeZone value="GMT-8:00">
		<fmt:formatDate value="${current_date}" type="both" dateStyle="long"
			timeStyle="long" />
	</fmt:timeZone>

	<hr>

	<h1>fmt:setTimeZone</h1>

	<h3>Date and time in 'Asia/Calcutta' (GMT+5:30) -</h3>
	<fmt:setTimeZone value="Asia/Calcutta" var="x" scope="application" />
	<fmt:formatDate value="${current_date}" timeZone="${x}" type="both"
		dateStyle="long" timeStyle="long" />

	<h3>Date and time in 'US/Alaska'(GMT-9:00) -</h3>
	<fmt:setTimeZone value="US/Alaska" var="y" scope="application" />
	<fmt:formatDate value="${current_date}" timeZone="${y}" type="both"
		dateStyle="long" timeStyle="long" />


	<h3>Date and time in 'America/Los_Angeles'(GMT-8:00) -</h3>
	<fmt:setTimeZone value="GMT-8:00" var="z" scope="application" />
	<fmt:formatDate value="${current_date}" timeZone="${z}" type="both"
		dateStyle="long" timeStyle="long" />
</body>
</html>