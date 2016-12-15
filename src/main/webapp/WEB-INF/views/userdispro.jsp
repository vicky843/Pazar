<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="k" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" href="http://path/to/font-awesome/css/font-awesome.min.css">
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-T8Gy5hrqNKT+hzMclPo118YTQO6cYprQmhrYwIiQ/3axmI1hQomh7Ud2hPOy8SP1" crossorigin="anonymous">

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
  background-color: wheat;
  border: none;
  color: #FFFFFF;
  text-align: center;
  font-size: 18px;
 padding: 5px;
  width: 80px;
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
/* this is for add to cart styling */
.buttons {
  display: inline-block;
  border-radius: 4px;
  background-color: wheat;
  border: none;
  color: #FFFFFF;
  text-align: center;
  font-size: 18px;
 padding: 10px;
  width: 150px;
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
<script>
function myFunction() {
    document.getElementById("myNumber").stepUp(1);
}
</script>
</head>
<body>
<div class="container-fluid">
<k:forEach  items="${getprodlist}" var="pro">
<div class="col-sm-3">
<div class="well" >
 <a href="displaycat?proid=${cat.catid}"></a>
  <b>${pro.proname}</b><br>
<%--    <a href="gotocart?proid=${pro.proid }"> --%>
  <img alt="${pro.proname}" src="images/${pro.proid}.jpg" data-toggle="tooltip" title="${pro.prodesc }"></a> <br>
 <div style="margin-top:5px;"> <b style="color:black;">Rs.${pro.proprice}/Kg</b></div><br>
<!--  Quantity: <input min=1 max=10 type="number" id="myNumber"><br><br> -->
  <div class="button"  style="vertical-align:middle" ><a href="buying"><span class=""fa fa-inr" aria-hidden="true ">BUY </span></a> </div>
    <div class="buttons"  style="vertical-align:middle"> <a href="addtocart?proid=${pro.proid }"><span class="glyphicon glyphicon-shopping-cart">ADD TO CART</a></span></div>
  
  </div>
  </div>
</k:forEach>

</div>
</body>
</html>