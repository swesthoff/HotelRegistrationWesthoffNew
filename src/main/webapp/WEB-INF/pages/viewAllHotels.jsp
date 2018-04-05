<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All Hotels</title>
</head>


<body>
	<c:forEach items="${all}" var="item">
		<table>
			<tr>
				<td>Hotel Name</td>
				<td>${item.hotelName}</td>
			</tr>
			<tr>
				<td>City</td>
				<td>${item.cityName}</td>
			</tr>
			<tr>
				<td>Room Type</td>
				<td>${item.roomType}</td>
			</tr>
			<tr>
				<td>Number of Adults</td>
				<td>${item.numberOfAdults}</td>
			</tr>
			<tr>
				<td>Number of Children</td>
				<td>${item.numberOfChildren}</td>
			</tr>
			<tr>
				<td>Cost</td>
				<td>${item.cost}</td>
			</tr>
			
		</table>
		<br />
		<hr style="text-align: left; margin-left: 0; width: 25%">
		<br />
	</c:forEach>
	<a href="form.mvc">Add a new Hotel</a>
</body>
</html>