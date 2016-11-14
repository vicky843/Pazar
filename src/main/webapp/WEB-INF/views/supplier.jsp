<%@taglib uri="http://www.springframework.org/tags/form" prefix="k" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Case</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<img  class="brand" alt="GIF" src="images/insta.gif" >
<body data-spy="scroll" data-target=".navbar" data-offset="50">
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="category">HOME</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        
        <li class="dropdown">
          <a   href="category">Category</a>
          
        </li>
        <li><a  class="active" href="supplier">Supplier</a></li>
        <li><a href="product">Products</a></li>
      </ul>
      
    </div>
  </div>
</nav>

<div class="jumbotron">
<div class="jumbotron text-center">
<div class="container">
  <h1>Welcome to Admin</h1></div></div>
<div class="container">
<div class="col-sm-5 col-sm-offset-4">
<div class="jumbotron">
<h3> <b>Enter Supplier details</b></h3><br>
<k:form action="" method="post" commandName="supForm">




<k:input path="supid" class="form-control" placeholder="supplierid" type="text"></k:input><br>

<k:input path="supname" required="true" class="form-control" placeholder="suppliername" type="text"></k:input><br>
<k:input path="supaddress"  required="true" class="form-control" placeholder="supplieraddress" type="text" ></k:input><br>
<k:input path="supnumber" required="true" class="form-control" placeholder="suppliernumber" type="text" ></k:input><br>
<k:input path="supemail" required="true" class="form-control" placeholder="supplieremail" type="text" ></k:input><br>
<br><br>
<k:button path="submit" class="btn btn-success">Save</k:button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<k:button path="reset" class="btn btn-danger">Reset</k:button>


</k:form><!-- end of form -->
</div>
</div></div></div>
</body>
</html>