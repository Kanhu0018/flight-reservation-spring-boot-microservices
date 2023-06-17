<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Reservation Details</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #e8f0fe; /* Updated background color */
            padding: 20px;
            margin: 0; /* Remove default margin */
        }

        h2 {
            color: #333333;
            margin-top: 0; /* Remove default margin */
        }

        form {
            width: 400px;
            background-color: #ffffff;
            border: 1px solid #dddddd;
            border-radius: 5px;
            padding: 20px;
        }

        input[type="text"] {
            margin-bottom: 10px;
            padding: 8px;
            width: 100%;
            box-sizing: border-box;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: #ffffff;
            border: none;
            cursor: pointer;
            padding: 10px 20px;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }

        pre {
            margin-top: 20px;
        }

        /* Additional CSS */
        .flight-image {
            width: 200px;
            height: auto;
            margin-bottom: 20px;
        }

        .flight-info {
            font-size: 18px;
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
    <h2>Flight Details</h2>
    <p class="flight-info">Flight Number: ${flight.flightNumber}</p>
    <p class="flight-info">Operating Airlines: ${flight.operatingAirlines}</p>
    <p class="flight-info">Departure City: ${flight.departureCity}</p>
    <p class="flight-info">Arrival City: ${flight.arrivalCity}</p>
    <p class="flight-info">Departure Date: ${flight.dateOfDeparture}</p>
    
    <h2>Enter Passenger Details</h2>
    <form action="confirmReservation" method="post">
        <pre>
            First Name:  <input type="text" name="firstName" /> 
            Last Name:   <input type="text" name="lastName" />  
            Middle Name: <input type="text" name="middleName"/> 
            Email:       <input type="text" name="email" />     
            Phone:       <input type="text" name="phone" />     
            <input type="hidden" name="flightId" value="${flight.id}"/>
            
            <h2>Enter The Payment Details</h2>
            Name On The Card <input type="text" name="nameOfTheCard"/>
            Card Number      <input type="text" name="cardNumber"/>
            Cvv              <input type="text" name="cvv"/>
            Expiry Date      <input type="text" name="expiryDate"/>
            Amount           <input type="text" name="amount"/>
           
            <input type="submit" value="Complete Reservation" />
        </pre>
    </form>
</body>
</html>
