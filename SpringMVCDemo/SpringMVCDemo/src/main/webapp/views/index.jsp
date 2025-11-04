<%@ page language="java" contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome to Spring MVC Demo</title>
</head>
<body>
    <h1>Welcome to Spring MVC Demo Application</h1>
    <p>This is the default index.jsp page META.</p>
    <form action="addAlien" method="post">
        Enter First Number: <input type="text" name="id"/><br/><br/>
        Enter Name : <input type="text" name="name"/><br/><br/>
        <input type="submit" />    
    </form>

    <p>This is the default index.jsp page META.</p>
    <form action="getAlien" method="get">
        Enter First Number: <input type="text" name="id"/><br/><br/>
        <input type="submit" />    
    </form>

    <p>This is the default index.jsp page META.</p>
    <form action="getAlienByName" method="get">
        Enter First Name: <input type="text" name="name"/><br/><br/>
        <input type="submit" />    
    </form>

    <p>This is the default index.jsp page META.</p>
    <form action="getAliens" method="get">
        Enter First Name: <input type="text" name="name"/><br/><br/>
        <input type="submit" />    
    </form>
</body>
</html>
