<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Details</title>
    <script>
        function embedMap(destination) {
            var iframe = document.getElementById("map");
            if (destination === "Jaipur") {
                iframe.src = "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d227748.43602143804!2d75.62574294028634!3d26.885421391949393!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x396c4adf4c57e281%3A0xce1c63a0cf22e09!2sJaipur%2C%20Rajasthan!5e0!3m2!1sen!2sin!4v1712310705958!5m2!1sen!2sin";
            } else if (destination === "Ajmer") {
                iframe.src = "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d114306.33847086986!2d74.55331123637707!3d26.453373264663714!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x396be6d8fcb7cd01%3A0xcbaf8f12eb8100ee!2sAjmer%2C%20Rajasthan!5e0!3m2!1sen!2sin!4v1712310852502!5m2!1sen!2sin";
            } else {
                iframe.src = "";
            }
        }
    </script>
</head>
<body onload="embedMap('${savedUser.destination}')">
    <h1>User Details</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Phone Number</th>
            <th>Current Location</th>
            <th>Destination</th>
            <th>Travel Date</th>
        </tr>
        <tr>
            <td>${savedUser.id}</td>
            <td>${savedUser.name}</td>
            <td>${savedUser.phoneNumber}</td>
            <td>${savedUser.currentLocation}</td>
            <td>${savedUser.destination}</td>
            <td>${savedUser.travelDate}</td>
        </tr>
    </table>
    <div id="map-container">
        <iframe id="map" width="600" height="450" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
    </div>
    
    <h2>Users Going to Jaipur on ${savedUser.travelDate}</h2>
    <table border="1">
        <tr>
            <th>ID</th>
              <th>Name</th>
            <th>Phone Number</th>
            <th>Current Location</th>
        </tr>
        <c:forEach items="${usersGoingToJaipur}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.phoneNumber}</td>
                <td>${user.currentLocation}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
