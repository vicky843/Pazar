<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>Bootstrap Example</title>
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="http://path/to/font-awesome/css/font-awesome.min.css">
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-T8Gy5hrqNKT+hzMclPo118YTQO6cYprQmhrYwIiQ/3axmI1hQomh7Ud2hPOy8SP1" crossorigin="anonymous">
<head>
<style>
.body{
 position: relative;}
.footer
{
font-size=200px;
background-color:white;
text-align: center;}
h5{
text-align: center;
}
.div{
 background-color: white;
}
</style>
</head>
<body>
<hr></hr>
<footer color="grey">
<div class="container-fluid">
<div class="container">

<div class="row">

<div class="col-sm-1">

<img  src="images/TROLLY.png"  class="brand" height="12%"  width="150%"    />
</div>

<div class="col-sm-3">
<h5>
						<b>Copyright &copy; 2016 PAZAR</b></h5>
						
</div>

<div class="col-sm-3">
<h4>Made with&nbsp;<span class="fa fa-heart fa-1x"></span>&nbsp;at Pazar, India.</h4>

<br>
						<p>Logo Designed by<br> @Shanawaz Memon</p>
</div><!--end of row div  --> 
<div class="col-sm-3">
<p class="txt-railway" ><b>Follow us</b></p>
<a href="#"><span class="fa fa-facebook-square fa-2x" style="color:black" aria-hidden="true"></span></a> 
					<a href="#"><span class="fa fa-linkedin-square fa-2x" style="color:black" aria-hidden="true"></span></a>
					<a href="#"><span class="fa fa-twitter fa-2x" style="color:black" aria-hidden="true"></span></a>
					<a href="#"><span class="fa fa-google-plus-official fa-2x" style="color:black" aria-hidden="true"></span></a>
	

</div>
<div class="col-sm-2">
<a class="up-arrow" href="home" data-toggle="tooltip" title="BACK TO TOP"/>
<span class="glyphicon glyphicon-chevron-up"></span></div>
</div>


</div><!-- end of container div -->





</div>

</footer><!-- end of footer -->
<script>
$(document).ready(function(){
    // Initialize Tooltip
    $('[data-toggle="tooltip"]').tooltip();
})
</script>
</body>
</html>