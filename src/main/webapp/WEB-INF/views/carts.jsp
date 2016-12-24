<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="k" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.button {                                    
  display: inline-block;
  border-radius: 4px;
  background-color: wheat;
  border: none;
  color: #FFFFFF;
  text-align: center;
  font-size: 22px;
 padding: 14px;
  width: 300px;
  transition: all 0.5s;
  cursor: pointer;
  margin: 2px;
}

.button span {
  cursor: pointer;
  display: inline-block;
  position: relative;
  transition: 0.5s;
}

.button span:after {
  content: '»';
  position: absolute;
  opacity: 0;
  top: 0;
  right: -20px;
  transition: 0.5s;
}

.button:hover span {
  padding-right: 25px;
}

.button:hover span:after {
  opacity: 1;
  right: 0;
}
.buttons {
  display: inline-block;
  border-radius: 4px;
  background-color: wheat;
  border: none;
  color: #FFFFFF;
  text-align: center;
  font-size: 22px;
 padding: 14px;
  width: 300px;
  transition: all 0.5s;
  cursor: pointer;
  margin: 2px;
}

.buttons span {
  cursor: pointer;
  display: inline-block;
  position: relative;
  transition: 0.5s;
}

.buttons span:after {
  content: '»';
  position: absolute;
  opacity: 0;
  top: 0;
  
  right: -20px;
  transition: 0.5s;
}

.buttons:hover span {
  padding-right: 25px;
}

.buttons:hover span:after {
  opacity: 1;
  right: 0;
}
</style>
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
<th>Quantity_Update</th>
<!-- <th>Totalprice</th> -->
<th>Date_Added</th>
<th>TotalPrice</th>
<th>Remove from Cart</th>
<!-- <th>Update</th> -->



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

	 <div class="buttons pull-left text-center"  style="vertical-align:middle" ><a href="home"><span class="fa fa-inr" aria-hidden="true ">Continue Shopping </span></a> </div><br>

	 <div class="button pull-right"  style="vertical-align:middle" ><a href="buying"><span class="fa fa-inr" aria-hidden="true ">&nbsp BUY </span></a> </div><br>
</div>
</body>
</html>