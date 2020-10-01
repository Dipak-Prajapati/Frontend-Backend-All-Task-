<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formatting Tag fmt:formatNumber</title>
</head>
<body>

	<!-- http://gettechnotes.com/JSP-JSTL-fmt-formatDate-tag.php -->
	<h1>fmt:formatNumber</h1>

	<c:set var="val" value="997816.5679" />
	Formatted Number 1 -
	<br>
	<fmt:formatNumber value="${val}" type="number" />
	<br><hr> 
	Formatted Number 2 *groupingUsed="false"* -
	<br>
	<fmt:formatNumber value="${val}" type="number" groupingUsed="false" />
	<br><hr>
	Formatted Number 3 * type="currency" *-
	<br>
	<fmt:formatNumber value="${val}" type="currency" />
	<br><hr> 
	Formatted Number 4 * type="percent" *-
	<br>
	<fmt:formatNumber value="${val}" type="percent" />
	<br> <hr>
	Formatted Number 5 * pattern="###.##E0" *-
	<br>
	<fmt:formatNumber value="${val}" type="number" pattern="###.##E0" />
	<br> <hr>
	Formatted Number 6 * maxIntegerDigits="2" *-
	<br>
	<fmt:formatNumber value="${val}" type="number" maxIntegerDigits="2" />
	<br> <hr>
	Formatted Number 7 * maxFractionDigits="2" *-
	<br>
	<fmt:formatNumber value="${val}" type="number" maxFractionDigits="2" />
	<br> <hr>
	Currency in US -
	<br>
	<fmt:setLocale value="en_US" />
	<fmt:formatNumber value="${val}" type="currency" />
	<br> <hr>
	Currency in India -
	<br>
	<fmt:setLocale value="en_IN" />
	<fmt:formatNumber value="${val}" type="currency" />
	<br> 
	<hr>Currency in Canada -
	<br>
	<fmt:setLocale value="fr_CA" />
	<fmt:formatNumber value="${val}" type="currency" />
	<br>


</body>
</html>