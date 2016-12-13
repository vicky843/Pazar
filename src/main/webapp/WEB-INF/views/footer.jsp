<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>Bootstrap Example</title>
 <meta name="viewport" content="width=device-width, initial-scale=1">
  
  <link rel="stylesheet" href="http://path/to/font-awesome/css/font-awesome.min.css">
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-T8Gy5hrqNKT+hzMclPo118YTQO6cYprQmhrYwIiQ/3axmI1hQomh7Ud2hPOy8SP1" crossorigin="anonymous">
<head>
<style>
.text-right{text-align:right}
.body{
 position: relative;}
.footer
{
font-size=200px;
background-color:white;
text-align: center;
/*  filter:drop-shadow(5px 5px 10px #202020); */
/*  box-shadow: 5px 5px 10px #202020 */
}
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
<footer >
<div class="container-fluid footer" >
<div class="container ">

<div class="row">

<div class="col-sm-1">
<br>
<img  src="images/TROLLY.png"  class="brand" height="12%"  width="150%"    />
</div>

<div class="col-sm-3">
<br>
<h5>
<br><br>
						<b>Copyright &copy; 2016 PAZAR</b></h5>
						
</div>

<div class="col-sm-3">
<br>
<h4>Made with&nbsp;<span class="fa fa-heart fa-1x"></span>&nbsp;at Pazar, India.</h4>

<br>
						<p>Logo Designed by<br> @Shanawaz Memon</p>
</div><!--end of row div  --> 
<div class="col-sm-3">
<br>
<p class="txt-railway" ><b>Follow us</b></p>
<a href="#"><span class="fa fa-facebook-square fa-2x" style="color:black" aria-hidden="true"></span></a> 
					<a href="#"><span class="fa fa-linkedin-square fa-2x" style="color:black" aria-hidden="true"></span></a>
					<a href="#"><span class="fa fa-twitter fa-2x" style="color:black" aria-hidden="true"></span></a>
					<a href="#"><span class="fa fa-google-plus-official fa-2x" style="color:black" aria-hidden="true"></span></a>
	

</div>
<div class="col-sm-2">
<br>
<div class="text-right" style="padding:0 15px 5px 0"><br><br><a href="#"><span class="glyphicon glyphicon-circle-arrow-up"></span> Top of the Page</a></div>

</div>
</div><!-- end of container div -->
</div>
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