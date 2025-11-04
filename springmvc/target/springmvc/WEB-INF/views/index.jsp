<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<title>Welcome to Spring MVC Demo</title>
</head>
<body>
	<h1>Welcome to Spring MVC Demo Application</h1>
	<p>This is the default index.jsp page.</p>

	<h2>Simple add (num1 + num2)</h2>
	<form action="add" method="get">
		Enter First Number: <input type="text" name="num1"/><br/><br/>
		Enter Second Number: <input type="text" name="num2"/><br/><br/>
		<input type="submit" value="Add"/>
	</form>

	<h2>Add Alien (model binding)</h2>
	<form action="addAlien" method="post">
		id: <input type="text" name="id"/><br/>
		name: <input type="text" name="name"/><br/>
		tech: <input type="text" name="tech"/><br/>
		<input type="submit" value="Create Alien"/>
	</form>

</body>
</html>
