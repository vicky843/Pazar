<!DOCTYPE html>
<html>
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
  <script>
 
  var catlist=<%=session.getAttribute("catlist")%>;
  /* alert(catlist); */
  /* it will create alert message while executing
 */  angular.module('categmodel',[]).controller('catecontrol',function($scope){
	  $scope.category=catlist;
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
<img  class="brand" alt="GIF" src="images/insta.gif" >
<body ng-app='categmodel' ng-controller='catecontrol' data-spy="scroll" data-target=".navbar" data-offset="50">



<nav class="navbar navbar-default " data-spy="affix" data-offset-top="197">
  <div class="container-fluid">
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand visible-xs"  style="color:#000000;"><b>PAZAR</b></a>
    </div>
    <div>
      <div class="collapse navbar-collapse" id="myNavbar">
        <ul class="nav navbar-nav">
      <!--  <li> <a class="list-group-item" href="home"><i class="fa fa-home " aria-hidden="true"></i>&nbsp; Home</a></li> -->
          <li><a  href="home">Home</a></li>
          <li><a href="aboutus" >About us</a></li>
          <li><a href="contactus">Contact us</a></li>
         
         <!--  <li><a href="userproduct" >Products</a></li> -->
        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="displaycat">Shop By Category <span class="caret"></span></a>
            <ul class="dropdown-menu">
             
         <li ng-repeat="cat in category"  value="{{cat.catid}}"><a href="displaycat?proid={{cat.catid}}">{{cat.catname}}</a> </li>
         </ul>
         </li></ul>
        <form  class="navbar-form pull-left">
        <input type="text" class="form-control" placeholder="Search Here..">
        <button type="submit" class="btn btn-default">
        <span class="glyphicon glyphicon-search "></span>
        </button>
        </form>
         <ul class="nav navbar-nav pull-right">
        
        <li><a href="register"   ><span class="glyphicon glyphicon-user"></span> Register</a></li>
        <li><a href="loginpage" ><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
           <li><a href="adminindex"  ><span class="glyphicon glyphicon-log-in"></span> Admin</a></li>
      </ul>
    </div>
  </div>
      </div>
  
</nav>



</body>
</html>

