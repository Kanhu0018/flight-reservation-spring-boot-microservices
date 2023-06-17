<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Search Flights</title>
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background: linear-gradient(to bottom, #ff4d4d, #4d4dff);
        }

        .container {
            width: 400px;
            padding: 20px;
            background-color: #ff4d4d;
            border: 1px solid #dddddd;
            border-radius: 5px;
            box-shadow: 0px 2px 4px rgba(0, 0, 0, 0.1);
        }

        h2 {
            color: #ffffff;
            text-align: center;
        }

        form {
            margin-top: 20px;
        }

        label {
            display: block;
            margin-bottom: 5px;
            color: #ffffff;
        }

        input[type="text"],
        input[type="submit"] {
            margin-bottom: 10px;
            padding: 8px;
            width: 100%;
            box-sizing: border-box;
        }

        input[type="submit"] {
            background-color: #ffffff;
            color: #ff4d4d;
            border: none;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Find Flights</h2>
        <form action="findFlights" method="post">
            <label for="from">From:</label>
            <input type="text" name="from" id="from" />

            <label for="to">To:</label>
            <input type="text" name="to" id="to" />

            <label for="departureDate">Departure Date:</label>
            <input type="text" name="departureDate" id="departureDate" />

            <input type="submit" value="Search" />
        </form>
    </div>
</body>
</html>
