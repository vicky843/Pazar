<%@taglib uri="http://www.springframework.org/tags/form" prefix="k" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Case</title>
  
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script >
var cat_list = ${getcatid};
var sup_list= ${getsupid}; 
angular.module('productmodel',[]).controller('productcontrl',function($scope){
$scope.category=cat_list;
$scope.supplier=sup_list;
});
</script>
</head>
<body ng-app="productmodel" ng-controller="productcontrl">

<div class="jumbotron text-center">
<div class="container" >
  <h1>Welcome to Admin</h1></div></div>
<div class="container">
<div class="col-sm-5 col-sm-offset-4">
<div class="jumbotron">
<h3> <b>Enter Product details</b></h3><br>
<k:form action="" method="post" commandName="proForm">

<k:input path="proid" required="true" class="form-control" placeholder="Enter Productid" type="text"></k:input><br>

<k:input path="proname" required="true" class="form-control" placeholder="Enter Productname" type="text"></k:input><br>
<k:input path="proprice" required="true" class="form-control" placeholder="Enter Productprice" type="text" /><br>
<k:select path="proscatid" required="true" class="form-control"   ><br>
<k:option value="-1" >Category id</k:option>
<k:option ng-repeat="cat in category" value="{{cat.catid}}">{{cat.catname}}</k:option>
</k:select><br>
<k:select path="prossupid" required="true" class="form-control" >
<k:option value="-1">Supplier id</k:option>
<k:option ng-repeat="sup in supplier" value="{{sup.supid}}">{{sup.supname}}</k:option>
</k:select>

<br>
<k:button path="submit" class="btn btn-success" onclick="myFunction()">Save</k:button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

<k:button  type="reset" value="reset"  class="btn btn-danger">Reset</k:button>


</k:form><!-- end of form -->
</div>
</div></div>
</body>
</html>

