<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Hello
<br>
<form action="/submitRegistration" method="post">
	Name : <input type="text" name="name"/>
	<br>
	Email id : <input type="text" name="email"/>
	<br>
	Username : <input type="text" name="username"/>
	<br>
	Password : <input type="text" name="password"/>
	<br>
	<br>
	<input type="submit" value="Submit Form"/>
</form>
</body>
</html>