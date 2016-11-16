<%@taglib uri="http://www.springframework.org/tags/form" prefix="k" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Case</title>
  <meta charset="utf-8">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script>
var sup_list=${getsupid}
angular.module('suppliermodel',[]).controller('suppliercontrl',function ($scope){
	$scope.supplier=sup_list;
});
</script>
</head>

<body ng-app='suppliermodel' ng-controller='suppliercontrl'>

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
<div>
	<div>

<table class="table table-bordered table-hover table-striped">
 <tr><th>Supplier Id</th>
<th>Supplier name</th>

<th>Supplier address</th>
<th>Supplier number</th>
<th>Supplier email</th>
<th>Edit</th>
<th>Delete</th>

</tr> 
<tr class="success" ng-repeat="sup in supplier">
                <td>{{sup.supid}}</td> 
                 <td>{{sup.supname}}</td>
                <td>{{sup.supaddress}}</td>
                <td>{{sup.supnumber}}</td>
                <td>{{sup.supemail}}</td>
                     
</tr>
</table>
</div>
	</div>
</body>
</html>