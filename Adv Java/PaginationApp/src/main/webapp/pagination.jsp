<%@page import="com.pagination.Product"%>
<%@page import="java.util.List"%>
<%@page import="com.cdac.servlet.*"%>
<%@page import="com.pagination.ProductDataLoader"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="pagination.css">
</head>
<body>

	

		<%
		List<Product> list = (List<Product>) session.getAttribute("listOfProducts");

		if (list != null) {
			for (Product product : list) {
		%>
	
	<div class="card">
		<h4>
			<b><%=product.getName()%></b>
		</h4>
		<p>
			Price:
			<%=product.getPrice()%></p>
		<p>
			Quantity:
			<%=product.getQuantity()%></p>
	</div>
	<%
	}
	} else {
	%>
	<p>No products available.</p>
	<%
	}
	%><div class="card">
		<a href="pagination.cdac?move=prev">Previous</a> <a
			href="pagination.cdac?move=next">Next</a>
	</div>

</body>
</html>