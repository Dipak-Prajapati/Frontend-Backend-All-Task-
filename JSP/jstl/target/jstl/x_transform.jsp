<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL XML Tag x:transform</title>
</head>
<body>
	<c:import var="xml" url="x_transfer.xml" />
	<c:import var="xsl" url="x_transform.xsl" />
	<x:transform xml="${xml}" xslt="${xsl}" />
</body>
</html>