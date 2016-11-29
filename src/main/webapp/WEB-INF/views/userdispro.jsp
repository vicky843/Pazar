<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="k" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Insert title here</title>
</head>
<body>
<div class="container-fluid">
<k:forEach  items="${getprodlist}" var="pro">
<div class="col-sm-4">
<div class="well" >
 <a href="displaycat?proid=${cat.catid}"></a>
  <b>${pro.proname}</b><br>
  <img alt="${pro.proname}" src="images/${pro.proid}.jpg">
  <div style="margin-top:5px;"> <b style="color:black;">Rs.${pro.proprice}</b></div>
    <div style="margin-top:5px;" ><a class="btn btn-danger "> BUY</a>  </div>
    <div style="margin-top:5px;"><a class="btn btn-success "> ADD TO CART</a></div>
  
  </div>
  </div>
</k:forEach>

</div>
</body>
</html>