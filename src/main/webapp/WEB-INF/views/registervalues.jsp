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
//this will get list from controller cat_list
 
var reg_list= ${getusername};
angular.module('registermodel',[]).controller('registercontrl',function($scope){
$scope.register=reg_list;

});
</script>
</head>
<h1>Registered Details</h1>
<body ng-app="registermodel" ng-controller="registercontrl">

<div >
	<div class="col-sm-4">
    <div class="input-group">
      <input type="text" class="form-control" placeholder="Search for..." ng-model="searchreg">
      <span class="input-group-btn">
        <button class="btn btn-secondary" type="button">Go!</button>
      </span>
    </div>
    <br>
  </div>

<table class="table table-bordered table-hover table-striped">
 <tr><th>name</th>
<th>password</th>
<th>email</th>
<th>birthdate</th>
<th>gender</th>
<th>location</th>
<th>Block<th>


</tr> 
<tr class="success" ng-repeat="reg in register|filter:searchreg">
                <td>{{reg.username}}</td> 
                 <td>{{reg.password}}</td>
                <td>{{reg.email}}</td>
                <td> {{reg.birthdate}}</td>
                <td> {{reg.gender}}</td>
                <td> {{reg.location}}</td>
               <td><a href="#" class="btn btn-danger">Block</a></td> 
        
</tr>
</table>
</div>
	</div>
</body>
</html>
