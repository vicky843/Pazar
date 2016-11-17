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

<body data-spy="scroll" data-target=".navbar" data-offset="50">
<img  class="brand" alt="GIF" src="images/insta.gif" >

	<nav class="navbar navbar-default navbar-custom" data-spy="affix" 	data-offset-top="197" role="navigation">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand visible-xs" href="#" style="color: #000000;">Pazar</a>
      
      
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-left">
        <a class="navbar-brand" href="home">HOME</a>
        <li class="dropdown">
          <a   href="category">Category</a>
          
        </li>
        <li><a   href="supplier">Supplier</a></li>
        <li><a  href="product">Products</a></li>
      </ul>
      
    </div>
  </div>
</nav>



</body>
</html>

