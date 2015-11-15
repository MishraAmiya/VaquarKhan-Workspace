<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Product List page</title>
</head>
<body>
	<h1>Product Search page</h1>
	<table style="text-align: center;" border="1px" cellpadding="0"
		cellspacing="0">
		<thead>
			<tr>
				<th width="25px">id</th>
				<th width="150px">Company</th>
				<th width="25px">Employees</th>
				<th width="50px">Search</th>

			</tr>
		</thead>
		<tbody>
			<c:forEach var="shop" items="${shopList}">
				<tr>
					<td>${shop.id}</td>
					<td>${shop.name}</td>
					<td>${shop.emplNumber}</td>
					<td><a 	href="${pageContext.request.contextPath}/products/prodFetch/${shop.id}">Search by product id</a><br /></td>
					<td><a 	href="${pageContext.request.contextPath}/products/productList">Display  all Product</a><br /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="${pageContext.request.contextPath}/">Home page</a>
</body>



<table style="text-align: center;" border="1px" cellpadding="0"
		cellspacing="0">
		<thead>
			<tr>
				<th width="25px">id</th>
				<th width="150px">Name</th>
				<th width="25px">Email</th>
				<th width="50px">Address</th>
				<th width="50px">Phone No</th>
				<th width="50px">Request</th>

			</tr>
		</thead>
		<tbody>
	<c:forEach var="product" items="${productList}">
		<tr>
			<td>${product.id}</td>
			<td>${product.name}</td>
			<td>${product.email}</td>
			<td>${product.address}</td>
			<td>${product.phoneNumber}</td>
			<tr>
			<c:forEach var="req" items="${requests}">
			<td>${req.id}</td>
			<td>${req.quantity}</td>
			<td>${req.customer}</td>
			</c:forEach>
			</tr>
			
			
			
		</tr>
	</c:forEach>
</tbody>
	</table>





</html>