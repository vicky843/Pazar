<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="k" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>this is in cart page</h1>
<div class="col-sm-12">

	<table class="table table-bordered table-hover table-striped">

		<tr>
		<th>ProductImage</th>
<th>Cartid</th>
<th>Username</th>
<th>Productid</th>
<th>Productname</th>
<th>Productprice</th>
<th>Status</th>
<th>Date_Added</th>
<th>Remove from Cart</th>


		</tr>
<k:forEach items="${getcartlist }" var="cart">
<tr>

<td><img alt="${cart.proname}" src="images/${cart.proid}.jpg" width="50px" height="50px" ></td>

<td>${cart.cartid }</td>

<td>${cart.username }</td>
<td>${cart.proid }</td>
<td>${cart.proname }</td>
<td>${cart.proprice }</td>
<td>${cart.status }</td>
<td>${cart.date_added }</td>
<td><a href="del?cartid={{cart.cartid}}" class="btn btn-danger"><span class="glyphicon glyphicon-trash"></span></a>
            <!-- <td><a href="updated?supid={{sup.supid}}" class="btn btn-success"><span class="glyphicon glyphicon-trash"></span></a></td> -->
</tr>
</k:forEach>
	</table>
</div>


</body>
</html>