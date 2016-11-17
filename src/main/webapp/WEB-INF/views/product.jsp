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
var cat_list = ${getcatid};//this will get list from controller cat_list
var sup_list=  ${getsupid}; 
var pro_list= ${getproid};
angular.module('productmodel',[]).controller('productcontrl',function($scope){
$scope.category=cat_list;
$scope.supplier=sup_list;
$scope.product=pro_list;
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
<k:form action="productpost" method="post" commandName="proForm">

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
</k:select><br>
<k:input path="prostock" required="true" class="form-control" placeholder="Enter Productstock" type="text" /><br>
<k:input path="prodesc" required="true" class="form-control" placeholder="Enter Productdesc" type="text" /><br>

<br>
<k:button path="submit" class="btn btn-success" onclick="myFunction()">Save</k:button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

<k:button  type="reset" value="reset"  class="btn btn-danger">Reset</k:button>


</k:form><!-- end of form -->
</div>
</div></div>
<div>
	<div>

<table class="table table-bordered table-hover table-striped">
 <tr><th>Product Id</th>
<th>Product name</th>
<th>Supplier Id</th>
<th>Category Id</th>
<th>Stock</th>
<th>Desc</th>
<th>Price</th>
<th>Delete</th>
<th>Edit</th>

</tr> 
<tr class="success" ng-repeat="pro in product">
                <td>{{pro.proid}}</td> 
                 <td>{{pro.proname}}</td>
                <td>{{pro.proprice}}</td>
                <td> {{pro.proscatid}}</td>
                <td> {{pro.prossupid}}</td>
                <td> {{pro.prodesc}}</td>
                 <td> {{pro.prostock}}</td>
           <td><a href="delete?proid={{pro.proid}}" class="btn btn-warning">
           <b>Delete</b></a></td><!-- this will produce link in url to navigate with id&name -->

</tr>
</table>
</div>
	</div>
</body>
</html>

