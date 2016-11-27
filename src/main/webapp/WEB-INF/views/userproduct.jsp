
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="k" %>
<!DOCTYPE html>
<html lang="en">
<head>
</head>
<body>
<div class="panel-body">
<k:forEach  items="${getprodlist}" var="pro">
<h2>this is userproduct</h2>
<div class="col-sm-3">
<div class="panel panel-default" id="panel" >
  <div class="panel-body" id="panel_body"><a href="displaycat?proid=${cat.catid}"></a></div>
  <div class="panel-footer text-center" ><b>${pro.proname}</b><br>
  <div style="margin-top:5px;"> <b style="color:red;">Rs.${pro.proprice}</b></div>
    <div style="margin-top:5px;"><a class="btn btn-danger btn-block"><i class="fa fa-money" aria-hidden="true"></i> BUY</a>  </div>
    <div style="margin-top:5px;"><a class="btn btn-success btn-block"><i class="fa fa-shopping-cart fa-lg" aria-hidden="true"></i> ADD TO CART</a></div>
  
  
  </div>
</div>
</div>
</k:forEach>
</div> <!-- body panel -->
</body>
</html>
