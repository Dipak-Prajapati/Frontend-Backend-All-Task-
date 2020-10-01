<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<title>JSTL fmt:parseDate Tag</title>
</head>

<body>
	<h1>fmt:parseDate</h1>
	<h3>Date to be parsed from 'MM/dd/yyyy' string format</h3>
	<c:set var="current_time_1" value="07/05/199" />
	Date:-
	<br>
	<fmt:parseDate value="${current_time_1}" type="date"
		pattern="MM/dd/yyyy" />
	<br>
	<br>

	<h3>Date Time to be parsed from 'dd/mm/yyyy HH:mm:ss' string
		format</h3>
	<c:set var="current_time_2" value="05/07/1999 11:20:50" />
	Date and time -
	<br>
	<fmt:parseDate value="${current_time_2}" type="both"
		pattern="dd/mm/yyyy HH:mm:ss" />
	<br>
	<br>

	<h3>Time to be parsed from 'HH:mm:ss' string format</h3>
	<c:set var="current_time_3" value="11:20:50" />
	Time (As date is not defined so it will take - 'Jan 01 1970' as default
	value ) -
	<br>
	<fmt:parseDate value="${current_time_3}" type="time" pattern="HH:mm:ss" />
	<br>
	<br>

	<h3>Date and Time to be parsed from dateStyle="long" and
		timeStyle="long" string format/ or</h3>
	<c:set var="current_time_4" value="December 27, 2018 1:38:09 PM IST" />
	Date and time -
	<br>
	<fmt:parseDate value="${current_time_4}" type="both" dateStyle="long"
		timeStyle="long" />
	<br>
	<br>

</body>
</html>