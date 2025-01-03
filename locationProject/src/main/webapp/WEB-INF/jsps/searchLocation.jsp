<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Location</title>
</head>
<body>
	<h2>List of Locations</h2>
	<table border="1" >
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Code</th>
			<th>Type</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>
		<c:forEach items="${location}" var="location">
		<tr>
			<td>${location.id}</td>
			<td>${location.name}</td>
			<td>${location.codes}</td>
			<td>${location.type}</td>
			<td><a href="delete?id=${location.id}">Delete</a></td>
			<td><a href="update?id=${location.id}">Update</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>