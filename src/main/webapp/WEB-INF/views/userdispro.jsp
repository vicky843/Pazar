<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="k" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<script>
$(document).ready(function(){
    $('[data-toggle="tooltip"]').tooltip();   
});
</script>
<style >
.well
{
position:relative;
overflow:hidden;
}
</style>
</head>
<body>
<div class="container-fluid">
<k:forEach  items="${getprodlist}" var="pro">
<div class="col-sm-3">
<div class="well" >
 <a href="displaycat?proid=${cat.catid}"></a>
  <b>${pro.proname}</b><br>
  <img alt="${pro.proname}" src="images/${pro.proid}.jpg" data-toggle="tooltip" title="${pro.prodesc }">
  <div style="margin-top:5px;"> <b style="color:black;">Rs.${pro.proprice}</b></div>
    <div style="margin-top:5px;" ><a class="btn btn-danger "> BUY</a>  </div>
    <div style="margin-top:5px;"><a class="btn btn-success "> ADD TO CART</a></div>
  
  </div>
  </div>
</k:forEach>

</div>
</body>
</html>