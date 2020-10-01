<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page isELIgnored="false"%>
<%@ page import="java.io.*,java.util.*, javax.servlet.*"%>
<html>
<head>
<title>JSTL sql:param Tag</title>
</head>

<body>
	<sql:setDataSource driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/sqltag" user="root" password="root"
		var="ds" />


	<form method="post">
		<table>
			<tr>
				<td>Student id -</td>
				<td><input type="text" name="t1"></td>
			</tr>
			<tr>
				<td>Student name -</td>
				<td><input type="text" name="t2"></td>
			</tr>
			<tr>
				<td>Student LastName -</td>
				<td><input type="text" name="t3"></td>
			</tr>
			<tr>
				<td>Student Age -</td>
				<td><input type="text" name="t4"></td>
			</tr>
			<tr>
				<td>Student Date Of Birth -</td>
				<td><input type="text" name="t5"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Insert Record"></td>
				<td><input type="reset" value="Reset"></td>
			</tr>
		</table>
	</form>

	<c:if
		test="${param.t1 != null and param.t2 != null and param.t3 != null and param.t4 != null and param.t5 != null}">

		<%
			String d1 = request.getParameter("t5");
				Date dob = new Date(d1);
		%>
		<%-- <fmt:parseDate pattern="MM/dd/yyyy" value="${param.t5}" var="parsedDate" /> --%>
		<%-- <fmt:formatDate value="${param.t5}" pattern="MM-dd-yyyy" var="datee" /> --%>
		<sql:update dataSource="${ds}">
           insert into student values (?,?,?,?,?)
           <sql:param value="${param.t1}" />
			<sql:param value="${param.t2}" />
			<sql:param value="${param.t3}" />
			<sql:param value="${param.t4}" />
			<%-- <sql:dateParam value="${dob}" type="DATE" /> --%>
			<sql:dateParam value="<%= dob %>" type="DATE" />
		</sql:update>
	</c:if>

	<h4>Table Records -</h4>
	<sql:query dataSource="${ds}" var="rs" scope="page">
           select * from student
       </sql:query>
	<table border="1px">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>LastName</th>
			<th>Age</th>
			<th>DOB</th>
		</tr>

		<c:forEach var="row" items="${rs.rows}">
			<tr>
				<td><c:out value="${row.id}" /></td>
				<td><c:out value="${row.name}" /></td>
				<td><c:out value="${row.lastname}" /></td>
				<td><c:out value="${row.age}" /></td>
				<td><c:out value="${row.dob}" /></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>