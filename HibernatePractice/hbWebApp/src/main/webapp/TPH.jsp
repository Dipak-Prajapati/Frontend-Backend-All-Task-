<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="EmployeeSalary" method="post">
		<h1>Employee</h1>
		Name : <input type="text" name="name" required><br/>
		
		<h1>Regular Employee</h1>
		Salary : <input type="text" name="salary"><br/><br/>
		Bonus  : <input type="text" name="bonus"><br/>
		
		<h1>Contract Employee</h1>
		Pay Per Hour : <input type="text" name="pph"><br/><br/>
		Contract Period : <input type="text" name="cp"><br/><br/>
		
		<input type="submit" value="submit">
	</form>

</body>
</html>