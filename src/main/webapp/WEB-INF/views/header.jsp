<!DOCTYPE html>
<html>
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
  body {
      position: relative;
  }
  .affix {
      top:0;
      width: 100%;
      z-index: 9999 !important;
  }
  .navbar {
      margin-bottom: 0px;
      background-color:wheat;
      border-radius: 10px;

box-shadow: 5px 5px 10px #202020
  }

  .affix ~ .container-fluid {
     position: relative;
     top: 50px;
  }
  footer {
width: 100%;
background: white;
float: left;
margin: 0 0 .5% 0;

}

address {
font-size : 16px; 
text-align : center; 
color: #efefef;
padding: 1% 0;
text-shadow: 1px 1px 0px #202020
}
  
  
  </style>
</head>
<img  class="brand" alt="GIF" src="insta1.gif">
<body data-spy="scroll" data-target=".navbar" data-offset="50">



<nav class="navbar navbar-inverse" data-spy="affix" data-offset-top="197">
  <div class="container-fluid">
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">WebSiteName</a>
    </div>
    <div>
      <div class="collapse navbar-collapse" id="myNavbar">
        <ul class="nav navbar-nav">
          <li><a href="home">Home</a></li>
          <li><a href="#aboutus">About us</a></li>
          <li><a href="#section3">Section 3</a></li>
          <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Section 4 <span class="caret"></span></a>
            <ul class="dropdown-menu">
              <li><a href="#section41">Section 4-1</a></li>
              <li><a href="#section42">Section 4-2</a></li>
            </ul>
          </li>
        </ul>
         <ul class="nav navbar-nav navbar-right">
        
        <li><a href="register" data-toggle="modal" data-target="#myModalR"  ><span class="glyphicon glyphicon-user"></span> Register</a></li>
        <li><a href="loginpage" data-toggle="modal" data-target="#myModal"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </ul>
    </div>
  </div>
      </div>
    </div>
  </div>
</nav>



</body>
</html>

