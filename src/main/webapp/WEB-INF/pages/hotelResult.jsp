<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib uri = "http://www.springframework.org/tags/form" prefix="mvc" %>
 <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring MVC From Handling - NEW</title>
</head>
<body> <h2>Hotel Registration Result</h2>
    <table>
    
     <tr>
            <td>Hotel name</td>
            <td>${u.hotelName}</td>
        </tr>
        <tr>
            <td>City name</td>
            <td>${u.cityName}</td>
        </tr>
        <tr>
            <td>Room Type</td>
            <td>${u.roomType}</td>
        </tr>
        <tr>
            <td>Number of Adults</td>
            <td>${u.numberOfAdults}</td>
        </tr>
        <tr>
            <td>Number Of Children</td>
            <td>${u.numberOfChildren}</td>
        </tr>
     
        </table>
<a href = "viewAll.mvc">View All Hotel Registrations</a>
</body>
</html>