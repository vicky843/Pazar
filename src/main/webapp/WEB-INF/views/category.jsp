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
<style>
  
  .body {
  background-color:"white";
      position: relative;
  }
  .affix {
      top:0;
      width: 100%;
      z-index: 9999 !important;
  }
  .navbar {
      margin-bottom: 0px;
      background-color: white;
      border-radius: 10px;

box-shadow: 5px 5px 10px #202020
  }

  .affix ~ .container-fluid {
     position: relative;
     top: 50px;
   background-color: white;  
  }
    
  </style>
</head>
<body>

<div class="jumbotron text-center">
<div class="container">
  <h1>Welcome to Admin</h1></div></div>
<div class="container">
<div class="col-sm-5 col-sm-offset-4">
<div class="jumbotron">
<h3> <b>Enter Category details</b></h3><br>
<k:form action="" method="post" commandName="catForm">

<k:input path="catid" required="true" class="form-control" placeholder="Enter Categoryid" type="text"></k:input><br>

<k:input path="catname" required="true" class="form-control" placeholder="Enter Categoryname" type="text"></k:input><br>
<k:input path="catdesc" required="true" class="form-control" placeholder="Enter Categorydesc" type="text" />
<br>


<k:button path="submit" class="btn btn-success" onclick="myFunction()">Save</k:button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

<k:button  type="reset" value="reset"  class="btn btn-danger">Reset</k:button>


</k:form><!-- end of form -->
</div>
</div></div>
</body>
</html>

