<%@taglib uri="http://www.springframework.org/tags/form" prefix="k" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="m" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Case</title>
  <meta charset="utf-8">
  
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
 
<script>
var sup_list=${getsupid}
angular.module('suppliermodel',[]).controller('suppliercontrl',function ($scope){
	$scope.supplier=sup_list;
});
</script>
</head>

<body ng-app='suppliermodel' ng-controller='suppliercontrl'>
<m:if test="${savesup == 1 }">
<div class="jumbotron">
<div class="jumbotron text-center">
<div class="container">
  <h1>Welcome to Admin</h1></div></div>
<div class="container">
<div class="col-sm-5 col-sm-offset-4">
<div class="jumbotron">
<h3> <b>Enter Supplier details</b></h3><br>
<k:form action="supplierpost" method="post" commandName="supForm">

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
</m:if>
<m:if test="${updatesup == 1 }">
<div class="jumbotron">
<div class="jumbotron text-center">
<div class="container">
  <h1>Welcome to Admin</h1></div></div>
<div class="container">
<div class="col-sm-5 col-sm-offset-4">
<div class="jumbotron">
<h3> <b>Enter Supplier details</b></h3><br>
<k:form action="supplierupdate" method="post" commandName="supForm">

<k:input path="supid" class="form-control" placeholder="supplierid" type="text"></k:input><br>

<k:input path="supname" required="true" class="form-control" placeholder="suppliername" type="text"></k:input><br>
<k:input path="supaddress"  required="true" class="form-control" placeholder="supplieraddress" type="text" ></k:input><br>
<k:input path="supnumber" required="true" class="form-control" placeholder="suppliernumber" type="text" ></k:input><br>
<k:input path="supemail" required="true" class="form-control" placeholder="supplieremail" type="text" ></k:input><br>
<br><br>
<k:button path="submit" class="btn btn-success">Update</k:button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<k:button path="reset" class="btn btn-danger">Reset</k:button>


</k:form></div></div></div></div>

</m:if>
	<div >
	<div class="col-sm-4">
    <div class="input-group">
      <input type="text" class="form-control" placeholder="Search for..." ng-model="searchsupplier">
      <span class="input-group-btn">
        <button class="btn btn-secondary" type="button">Go!</button>
      </span>
    </div>
    <br>
  </div>

<br>
<table class="table table-bordered table-hover table-striped">
 <tr><th>Supplier Id</th>
<th>Supplier name</th>
<th>Supplier address</th>
<th>Supplier email</th>
<th>Supplier number</th>

<th>Delete</th>
<th>Update</th>
</tr> 
<tr class="success" ng-repeat="sup in supplier|filter:searchsupplier">
                <td>{{sup.supid}}</td> 
                 <td>{{sup.supname}}</td>
                <td>{{sup.supaddress}}</td>
            <td>{{sup.supemail}}</td>
            <td>{{sup.supnumber}}</td>
            
            <td><a href="deleting?supid={{sup.supid}}" class="btn btn-warning">Delete</a>
            <td><a href="updated?supid={{sup.supid}}" class="btn btn-success">Update</a></td>
</tr>
</table>
</div>
	</div>
</body>
</html>