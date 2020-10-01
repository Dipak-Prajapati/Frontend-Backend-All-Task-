<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Data</title>
</head>
<body>
<!-- 	<form action="Display" method="post">
		<input type="submit" value="Display Data">
	</form>
 -->
 	<a href="Display" >Display Data</a><br>	
	<%@ page isELIgnored="false"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
	<c:set var="data" value="${sessionScope.one}"></c:set>
	<%-- ${data} --%>
	<c:forEach items="${data}" var="list">
		<h1>${list[0]}</h1>
		<h2>${list[1]}</h2>
		<h3>${list[2]}</h3>
		<hr>
	</c:forEach>
</body>
</html>