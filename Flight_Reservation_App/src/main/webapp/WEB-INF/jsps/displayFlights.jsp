<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Display Flights</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
        }

        h2 {
            color: #333333;
        }

        table {
            width: 100%;
            border-collapse: collapse;
        }

        th, td {
            padding: 10px;
            text-align: left;
            border-bottom: 1px solid #dddddd;
        }

        th {
            background-color: #f2f2f2;
        }

        tr:nth-child(even) {
            background-color: #f9f9f9;
        }

        tr:hover {
            background-color: #eaf6ff;
        }

        a {
            text-decoration: none;
            color: #0044cc;
        }

        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <h2>Flight Search Results</h2>
    <h2>List Of Flights</h2>
    <table>
        <tr>
            <th>Airlines</th>
            <th>Departure City</th>
            <th>Arrival City</th>
            <th>Departure Time</th>
            <th>Select Flight</th>
        </tr>
        <c:forEach items="${findFlights}" var="findFlights">
            <tr>
                <td>${findFlights.operatingAirlines}</td>
                <td>${findFlights.departureCity}</td>
                <td>${findFlights.arrivalCity}</td>
                <td>${findFlights.estimatedDepartureTime}</td>
                <td><a href="showCompleteReservation?flightId=${findFlights.id}">Select</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
