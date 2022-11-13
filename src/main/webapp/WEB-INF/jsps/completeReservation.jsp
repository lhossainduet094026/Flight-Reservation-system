<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Complete reservation</title>
</head>
<body>
	<h2>Complete reservation</h2>
	Operating airlines:${flight.operatingAirlines}
	<br> Departure city: ${flight.departureCity}
	<br> Arival city: ${flight.arrivalCity}

	<form action="completeReservation" method="post">
		<h2>Passenger details</h2>
		First Name:<input type="text" name="passengerFirstName"><br>
		Last Name:<input type="text" name="passengerLastName"><br>
		Email:<input type="text" name="passengerEmail"><br> Phone
		:<input type="text" name="passengerPhone"><br>
		<br>

		<h2>Card details</h2>
		Name of the card:<input type="text" name="cardName"><br>
		Card no :<input type="text" name="cardNo"><br> Expire
		date: <input type="text" name="expireDate"><br> Three
		digit sec:<input type="text" name="securityCode"> 
		<input type="submit" value="Confirm">
		<h2></h2>
	</form>
</body>
</html>