<%@ page contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Core Tag</title>
</head>
<body>
	<!-- c:set tag  -->
	<c:set var="i" value="22" scope="page"></c:set>

	<h1>This is c:out tag</h1>
	<c:out value="${i}"></c:out>
	<hr>
	<!-- c:import  -->
	<h1>This is c:import tag</h1>
	<c:import url="index.jsp"></c:import>

	<%-- 	<c:import var="data" url="https://www.inexture.com/" scope="page"></c:import>
	<c:out value="${data}"></c:out> --%>

	<hr>
	<h1>This is c:remove tag</h1>
	<c:set var="remove" value="Hiii Remove"></c:set>
	<span>Before remove variabe :</span>
	<c:out value="${remove}"></c:out>
	<c:remove var="remove" />
	<br />
	<span>After remove variabe :</span>
	<c:out value="${remove}"></c:out>

	<hr>
	<h1>This is c:catch tag</h1>
	<c:catch var="catchTheException">
		<%
			int x = 10 / 0;
		%>
		<%-- 	<c:set var="no" value="${10/5}"></c:set>
		<c:out value="${no}"></c:out> --%>
	</c:catch>

	<c:if test="${catchTheException != null}">
		<p>
			The Exception type is : ${catchTheException}<br /> The Exception
			Message is : ${catchTheException.message}
		</p>
	</c:if>

	<hr>

	<h1>This is c:if tag</h1>
	<c:set var="income" scope="session" value="${4000*4}" />
	<c:if test="${income > 8000}">
		<p>
			Income is:
			<c:out value="${income}" />
		<p>
	</c:if>

	<hr>

	<h1>This is c:choose , c:when , c:otherwise tag</h1>

	<c:choose>
		<c:when test="${income <= 1000}">
			<p>Income is not good.</p>
		</c:when>

		<c:when test="${income > 10000}">
			<p>Income is very good.</p>
		</c:when>

		<c:otherwise>  
       		Income is undetermined...  
    	</c:otherwise>
	</c:choose>

	<hr>

	<h1>This is c:forEach tag</h1>

	<c:forEach var="j" begin="1" end="5">
		<c:out value="Count${j}" />
	</c:forEach>

	<hr>

	<h1>This is c:forTokens tag</h1>
	<c:forTokens var="friend" items="Dipak-Shreyansh-Akshat-Savan-Nitesh"
		delims="-">
		<c:out value="${friend}"></c:out>
		<br />
	</c:forTokens>

	<hr>
	<h1>This is c:url , c:param tag</h1>
	<c:url var="completeURL" value="/index1.jsp" > 
	<c:param name="id" value="786"></c:param>
	<c:param name="name" value="Dipak"></c:param>
	</c:url>
	${completeURL}
</body>
</html>
