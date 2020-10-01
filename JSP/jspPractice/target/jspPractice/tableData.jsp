<%@ page language="java" contentType="application/xls; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
	table {
	  font-family: arial, sans-serif;
	  border-collapse: collapse;
	  width: 100%;
	}
	
	td, th {
	  border: 1px solid #dddddd;
	  text-align: left;
	  padding: 8px;
	}
	
	tr:nth-child(even) {
	  background-color: #dddddd;
	}
</style>


</head>
<body>
<h2>HTML Table</h2>

<table>
  <tr>
    <th>Name</th>
    <th>Mentor</th>
  </tr>
  <tr>
    <td>Dipak</td>
    <td rowspan="3">Bhavika Mam</td>
  </tr>
  <tr>
    <td>Akshat</td>
  </tr>
  <tr>
    <td>Komal</td>
  </tr>
  <tr>
    <td>Nitesh</td>
    <td>Darshan Bhai</td>
  </tr>
  <tr>
  	<td>Shreyansh</td>
  	<td>Ravi Bhai</td>
  </tr>
  <tr>
  	<td>Savan</td>
  	<td>Nishant Bhai</td>
  </tr>
</table>

</body>
</html>	