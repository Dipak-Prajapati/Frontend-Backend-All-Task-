<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formatting Tag fmt:setLocale</title>
</head>
<body>
<!-- http://gettechnotes.com/JSP-JSTL-fmt-formatDate-tag.php -->
	<h1>fmt:setLocale ,fmt:bundle , fmt:message</h1>
	<h1>English Of US</h1>
	<fmt:bundle basename="resourceBundle.Res_Bun" prefix="count.">
		<fmt:message key="k1"></fmt:message>
		<fmt:message key="k2"></fmt:message>
		<fmt:message key="k3"></fmt:message>
		<fmt:message key="k4"></fmt:message>
	</fmt:bundle>

	<hr>
	<h1>French Of Canada</h1>
	<fmt:setLocale value="fr_CA"/>
	<fmt:bundle basename="resourceBundle.Res_Bun" prefix="count.">
		<fmt:message key="k1"></fmt:message>
		<fmt:message key="k2"></fmt:message>
		<fmt:message key="k3"></fmt:message>
		<fmt:message key="k4"></fmt:message>
	</fmt:bundle>
	<hr>

	<h1>fmt:requestEncoding</h1>
	
	<fmt:requestEncoding value="UTF-8" />
	<fmt:setLocale value="en_US"/>
	<fmt:bundle basename="resourceBundle.Res_Bun" prefix="count.">
		<fmt:message key="k1"></fmt:message>
		<fmt:message key="k2"></fmt:message>
		<fmt:message key="k3"></fmt:message>
		<fmt:message key="k4"></fmt:message>
	</fmt:bundle>
</body>
</html>