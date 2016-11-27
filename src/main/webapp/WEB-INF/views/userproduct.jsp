<%@taglib uri="http://www.springframework.org/tags/form" prefix="k" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="m" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Case</title>
  
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script >

var cat_list=${getcatid};
var sup_list=${getsupid};
var pro_list=${getproid};
angular.module('productmodel',[]).controller('productcontrl',function ($scope)
		{
	$scope.category=cat_list;
	$scope.supplier=sup_list;
	$scope.product=pro_list;
});
</script>
</head>
<body ng-app="productmodel" ng-controller="productcontrl">

<div >
	<div class="col-sm-4">
    <div class="input-group">
      <input type="text" class="form-control" placeholder="Search for..." ng-model="searchpro">
      <span class="input-group-btn">
        <button class="btn btn-secondary" type="button">Go!</button>
      </span>
    </div>
    <br>
  </div>

<table class="table table-bordered table-hover table-striped">
 <tr><th>Product Id</th>
<th>Product name</th>
<th>Supplier Id</th>
<th>Category Id</th>
<th>Stock</th>
<th>Desc</th>
<th>Price</th>


</tr> 
<tr class="success" ng-repeat="pro in product|filter:searchpro">
                <td>{{pro.proid}}</td> 
                 <td>{{pro.proname}}</td>
                <td>{{pro.proprice}}</td>
                <td> {{pro.proscatid}}</td>
                <td> {{pro.prossupid}}</td>
                <td> {{pro.prodesc}}</td>
                 <td> {{pro.prostock}}</td>
        
</tr>
</table>
</div>
</body>
</html>
