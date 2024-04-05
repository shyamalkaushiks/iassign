<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Information Form</title>
</head>
<body>
    <h1>User Information Form</h1>
    <form action="${pageContext.request.contextPath}/save-details" method="post">
       <label for="name">Name:</label>
        <input type="text" id="name" name="name"><br>
        <label for="phoneNumber">Phone Number:</label>
        <input type="text" id="phoneNumber" name="phoneNumber"><br>
        <label for="currentLocation">Current Location:</label>
        <input type="text" id="currentLocation" name="currentLocation"><br>
        <label for="destination">Destination:</label>
        <input type="text" id="destination" name="destination"><br>
        <label for="travelDate">Travel Date:</label>
        <input type="date" id="travelDate" name="travelDate"><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
