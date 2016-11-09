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

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">Admin</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="category">Category<span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Save</a></li>
            <li><a href="#">Delete</a></li>
            <li><a href="#">Update</a></li>
          </ul>
        </li>
        <li><a href="supplier">Supplier</a></li>
        <li><a href="product">Products</a></li>
      </ul>
      
    </div>
  </div>
</nav>
<div class="container-fluid">
<div class="col-sm-4">
<k:form action="" method="post" commandName="catForm">




<k:input path="catid" class="form-control" placeholder="categoryid" type="text"></k:input><br>

<k:input path="catname" class="form-control" placeholder="categoryname" type="text"></k:input><br>
<k:input path="catdesc" class="form-control" placeholder="categorydesc" type="text" />
<br><br>
<k:button path="submit" class="btn btn-success">Submit</k:button>



</k:form><!-- end of form -->
</div>
</div>
</body>
</html>

