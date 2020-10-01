<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page isELIgnored="false"%>

<html>
   <head>
      <title>JSTL sql:transaction Tag</title>
   </head>

   <body>
       <sql:setDataSource 
       var="ds" 
       scope="page" 
       driver="com.mysql.jdbc.Driver" 
       url="jdbc:mysql://localhost:3306/sqltag" 
       user="root" 
       password="root" />
       
       <sql:query  var="rs" scope="page" dataSource="${ds}">
           select * from student
           </sql:query>
       <h4>Before Table Records - </h4>
       
           <table border = "1px">
         <tr>
            <th>ID</th>
            <th>Name</th>
            <th>LastName</th>
            <th>Age</th>
            <th>Date of Birth</th>
         </tr>
         
         <c:forEach var = "row" items = "${rs.rows}">
            <tr>
               <td> <c:out value = "${row.id}"/></td>
               <td> <c:out value = "${row.name}"/></td>
               <td> <c:out value = "${row.lastname}"/></td>
               <td> <c:out value = "${row.age}"/></td>
               <td> <c:out value = "${row.dob}"/></td>
            </tr>
         </c:forEach>
           </table>
       
       
       <sql:transaction dataSource="${ds}">
           
           <sql:update>
               insert into student values(5, 'Vijay', 'patel',25, '1980/02/25')
           </sql:update>
           <sql:update>
               update student set name='dips' where id=2;
           </sql:update>
           <sql:update>
               update student set name='Dhananjay' where id=1;
           </sql:update>
               
           <sql:query  var="rs" scope="page">
           select * from student
           </sql:query>
           
       </sql:transaction>
      
 
       <h4>After Table Records - </h4>
       
           <table border = "1px">
         <tr>
            <th>ID</th>
            <th>Name</th>
            <th>LastName</th>
            <th>Age</th>
            <th>Date of Birth</th>
         </tr>
         
         <c:forEach var = "row" items = "${rs.rows}">
            <tr>
               <td> <c:out value = "${row.id}"/></td>
               <td> <c:out value = "${row.name}"/></td>
               <td> <c:out value = "${row.lastname}"/></td>
               <td> <c:out value = "${row.age}"/></td>
               <td> <c:out value = "${row.dob}"/></td>
            </tr>
         </c:forEach>
           </table>
           
   </body>
</html>