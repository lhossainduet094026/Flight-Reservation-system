<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User registration page</title>
</head>
<body>
	<h2>Find flights</h2>

	<form action="findFlights" method="post">
		<pre>
		   From:<input type="text" name="from"> 
		   To:<input type="text" name="to"> 
		   Departure date :<input type="text" name="dapartureDate"> 
		   <input type="submit" value="Search">
		</pre>
	</form>

</body>
</html>