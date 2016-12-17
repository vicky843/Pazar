<%@taglib uri="http://www.springframework.org/tags/form" prefix="k" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="j" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<h4><b>Order Confirmation</b></h4>


<div class="container-fluid">
<div class="col-sm-6">
<b>Shipping address</b>
<j:set var="ship" value='<%=session.getAttribute("shipaddress")%>' ></j:set>

${ship.firstname}
<br>
${ship.lastname}
<br>
${ship.address_line1}
<br>
${ship.city}
<br>
${ship.pin_code}
<br>
${ship.state}
<br>
${ship.country}
</div>

</div>




</div></body>
</html>