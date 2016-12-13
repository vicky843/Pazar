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
<!-- <th>Cartid</th> -->
<th>Username</th>
<!-- <th>Productid</th> -->
<th>Productname</th>
<th>Productprice</th>
<th>Quantity</th>
<!-- <th>Totalprice</th> -->
<th>Date_Added</th>
<th>TotalPrice</th>
<th>Remove from Cart</th>
<th>Update</th>



		</tr>

<k:forEach items="${getcartlist }" var="cart">
<tr>

<td><img alt="${cart.proname}" src="images/${cart.proid}.jpg" width="80px" height="80px" ></td>

<%-- <td>${cart.cartid }</td> --%>

<td>${cart.username }</td>
 <td>${cart.proname }</td>
<td>${cart.proprice }</td>

<td>
<form action="updatecart" method="get"  >
<input min=1 max=10 type="number" value=" ${cart.quantity }" name="quantity">
 <input type="hidden" value="${cart.cartid }"name="cartid"></input>

  <input type="submit" value="Submit">
 

</form></td>


<%-- <td>${cart.totalprice }</td> --%>
<td>${cart.date_added }</td>
<td>${cart.totalprice }</td>
<td><a href="del?cartid=${cart.cartid}" class="btn btn-danger"><span class="glyphicon glyphicon-trash"></span></a></td>
            <td></td>
            
</tr>
</k:forEach>
	</table>
</div>


</body>
</html>