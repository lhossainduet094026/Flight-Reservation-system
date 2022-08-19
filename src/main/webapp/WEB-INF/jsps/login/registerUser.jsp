<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User registration page</title>
</head>
<body>
<h2>User Registration:</h2>
	<form action="registerUser" method="post">
	<pre>
		First name:<input type="text" name="firstName"> 
		Last name:<input type="text" name="lastName">
		User email:<input type="text" name="email"> 
		Password:<input type="password" name="password">
		Confirm password:<input type="password" name="confirmPassword">
		<input type="submit" value="Register">
		</pre>
	</form>
</body>
</html>