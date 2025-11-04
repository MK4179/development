<%@ page language="java" contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Welcome to Spring MVC Demo</title>
</head>
<body>
	<h1>Welcome to Spring MVC Demo Application</h1>
	<p>This is the default index.jsp page.</p>
    <form action="addAlien">
        Enter First Number: <input type="text" name="id"/><br/><br/>
        Enter Second Number: <input type="text" name="name"/><br/><br/>
                Enter Thrid Number: <input type="text" name="tech"/><br/><br/>

        <input type="submit" />    
    </form>

     <form action="getAlien">
        Enter First Number: <input type="text" name="id"/><br/><br/>
      
        <input type="submit" />    
    </form>
</body>
</html>
