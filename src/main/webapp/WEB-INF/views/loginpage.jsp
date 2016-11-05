<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="k"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>login</title>
 
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<style>

.logo{

width:40%;
}
h1{
text-align:center;
}

</style>
<body>





<div class="container">
<div class="col-sm-4 col-sm-offset-4">
<div class="jumbotron">

<img src="images/TROLLY.png" class="logo"  class="img-responsive"><Span>Pazar World</Span></img>
<!-- <h3 >Pazar World</h3> -->
<k:form action="loginpage" method="post" commandName="loginForm">



<b>User name:</b>
<k:input path="username" class="form-control" type="text"></k:input><br>
<b>Password:</b>
<k:input path="password" class="form-control" type="password"></k:input><br>
<k:checkbox path="" value="Remember Me"  label="Remember Me"></k:checkbox>
<br><br>
<k:button path="submit" class="btn btn-success">Login</k:button>

<h4><span>New to Pazar? <a href="register">Join us »</a></span></h4>

</k:form><!-- end of form -->
</div>
</div>
</div>

</body>
</html>
