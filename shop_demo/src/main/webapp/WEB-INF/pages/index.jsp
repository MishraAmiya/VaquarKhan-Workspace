<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<title>Vaquar Khan's Shop</title>
<link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">
	<script src="/scripts/jquery.min.js"></script>
	<script src="/bootstrap/js/bootstrap.min.js"></script>
	</head>
<body>
	<div class="page-header">
		<h1>
			Home Page 
		</h1>
	</div>



	<div class="container">
		<div class="row">
		<p>
					<div class="col-xs-6 col-md-offset-3" style="background-color: #FF0000; box-shadow: inset 1px -1px 1px #444, inset -1px 1px 1px #444;">
					Welcome to "Shop application".
					</div>
					<br />
					 <i>${message}</i>
					<br/>
			<div class="col-xs-6 col-md-offset-3" style="background-color: #dedef8; box-shadow: inset 1px -1px 1px #444, inset -1px 1px 1px #444;">
				
					<a href="${pageContext.request.contextPath}/shop/create.html">Createa new shop</a>
						<br />
						 <a href="${pageContext.request.contextPath}/shop/list.html">View all shops</a>
						<br />
						 <a href="${pageContext.request.contextPath}/shop/search.html">Search page</a>
						<br />
						<a href="${pageContext.request.contextPath}/shop/product.html">Product page</a>
						<br />
				</p>
			</div>

		</div>
	</div>

</body>
</html>