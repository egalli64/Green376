<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Table</title>
</head>
<body>

	<div>
		<ul>
			<c:forEach var="user" items="${viewuser}">
				<li>${user.username},${user.password}</li>
			</c:forEach>
		</ul>
	</div>
</body>
</html>