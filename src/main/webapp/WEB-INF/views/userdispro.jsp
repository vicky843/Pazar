<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="k" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 
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
.button {
  display: inline-block;
  border-radius: 4px;
  background-color: green;
  border: none;
  color: #FFFFFF;
  text-align: center;
  font-size: 28px;
 padding: 5px;
  width: 100px;
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
</style>
</head>
<body>
<div class="container-fluid">
<k:forEach  items="${getprodlist}" var="pro">
<div class="col-sm-3">
<div class="well" >
 <a href="displaycat?proid=${cat.catid}"></a>
  <b>${pro.proname}</b><br>
   <a href="gotocart?proid=${pro.proid }">
  <img alt="${pro.proname}" src="images/${pro.proid}.jpg" data-toggle="tooltip" title="${pro.prodesc }">
 <div style="margin-top:5px;"> <b style="color:black;">Rs.${pro.proprice}</b></div>
  <div class="button"  style="vertical-align:middle" ><span>BUY </span> </div>
    <div style="margin-top:5px;"><a class="btn btn-success "> ADD TO CART</a></div></a> 
  
  </div>
  </div>
</k:forEach>

</div>
</body>
</html>