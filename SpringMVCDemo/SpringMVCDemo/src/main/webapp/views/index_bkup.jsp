<%@ page language="java" contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Welcome to Spring MVC Demo</title>
</head>
<body>
	<h1>Welcome to Spring MVC Demo Application</h1>
	<p>This is the default index.jsp page. Non-Meta</p>
    <form action="getAliens" method="get">
        <input type="submit" value="Show Aliens"/>
    </form>
    <br></br>
    <form action="addAlien" method="post">
        Enter First Number: <input type="text" name="aid"/><br/><br/>
        Enter Second Number: <input type="text" name="aname"/><br/><br/>
        <input type="submit" />    
    </form>
</body>
</html>
