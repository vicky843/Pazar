<%@taglib uri="http://www.springframework.org/tags/form" prefix="k" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="t" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Case</title>
  <meta charset="utf-8">
 
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
 <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script>
var cat_list = ${getcatid};
angular.module('categorymodel',[]).controller('categorycontrl',function($scope){
	$scope.category=cat_list;	
});

</script>
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
<body ng-app='categorymodel' ng-controller='categorycontrl'>
<t:if test="${beforeupdate == 1 }">
<div class="jumbotron text-center">
<div class="container">
  <h1>Welcome to Admin</h1></div></div>
<div class="container">
<div class="col-sm-5 col-sm-offset-4">
<div class="jumbotron">
<h3> <b>Enter Category details</b></h3><br>
<k:form action="categorypost" method="post" commandName="catForm">

<k:input path="catid" required="true" class="form-control" placeholder="Enter Categoryid" type="text"></k:input><br>

<k:input path="catname" required="true" class="form-control" placeholder="Enter Categoryname" type="text"></k:input><br>
<k:input path="catdesc" required="true" class="form-control" placeholder="Enter Categorydesc" type="text" />
<br>


<k:button path="submit" class="btn btn-success" >Save</k:button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

<k:button  type="reset" value="reset"  class="btn btn-danger">Reset</k:button>


</k:form><!-- end of form -->
</div>
</div></div>
</t:if>
<t:if test="${afterupdate == 1 }">
<div class="jumbotron text-center">
<div class="container">
  <h1>Welcome to Admin</h1></div></div>
<div class="container">
<div class="col-sm-5 col-sm-offset-4">
<div class="jumbotron">
<h3> <b>Enter Category details</b></h3><br>
<k:form action="updatedcat" method="post" commandName="catForm">

<k:input path="catid" required="true" class="form-control" placeholder="Enter Categoryid" type="text"></k:input><br>

<k:input path="catname" required="true" class="form-control" placeholder="Enter Categoryname" type="text"></k:input><br>
<k:input path="catdesc" required="true" class="form-control" placeholder="Enter Categorydesc" type="text" />
<br>


<k:button path="submit" class="btn btn-success" >Update</k:button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

<k:button  type="reset" value="reset"  class="btn btn-danger">Reset</k:button>


</k:form><!-- end of form -->
</div>
</div></div>
</t:if>
<div>
	<div>

<table class="table table-bordered table-hover table-striped">
 <tr><th>Category Id</th>
<th>Category name</th>
<th>Category desc</th>

<th>Delete</th>
<th>Update</th>
</tr> 
<tr class="success" ng-repeat="cat in category">
                <td>{{cat.catid}}</td> 
                 <td>{{cat.catname}}</td>
                <td>{{cat.catdesc}}</td>
            <td><a href="deleted?catid={{cat.catid}}" class="btn btn-warning">Delete</a>
            <td><a href="updating?catid={{cat.catid}}" class="btn btn-success">Update</a></td>
</tr>
</table>
</div>
	</div>
</body>
</html>

