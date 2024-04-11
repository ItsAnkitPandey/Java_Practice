<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>JSP demo</h2>
<%
	int a= 10;
	int b=20;
	int c = a+b;
	out.println("sum:" + c);
	LocalDate today = LocalDate.now();
%>
<h2>Sum = <%=c %></h2>
<h2>Day = <%=today %></h2>

</body>
</html>