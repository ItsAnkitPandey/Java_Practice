<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Customer Registration Details</h1>
<p>${msg}</p>
<div>
	<p>Customer Id: ${mycustomer.customerId}</p>
	<p>Customer FirstName: ${mycustomer.firstName}</p>
	<p>Customer LastName: ${mycustomer.lastName}</p>
	<p>Customer Age: ${mycustomer.age}</p>
	<p>Customer Email: ${mycustomer.email}</p>
</div>
</body>
</html>