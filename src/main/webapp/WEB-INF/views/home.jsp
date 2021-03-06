<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>

  <style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;
  }
  </style>
</head>
<body>

<div class="container-fluid">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">

      <div class="item active">
        <center><img src="1.jpg" alt="Chania" width="460" height="345"></center>
        <div class="carousel-caption">
          <h3>Fruits</h3>
          
        </div>
      </div>

      <div class="item">
       <center> <img src="2.jpg" alt="Chania" width="460" height="345"></center>
        <div class="carousel-caption">
          <h3>Vegetables</h3>
          
        </div>
      </div>
    
      <div class="item">
        <center><img src="3.png" alt="Flower" width="460" height="345"></center>
        <div class="carousel-caption">
          <h3>General Items</h3>
        
        </div>
      </div>

      <div class="item">
        <center><img src="4.jpg" alt="Flower" width="1000px" height="345"></center>
        <div class="carousel-caption">
          <h3>Pulses</h3>
          
        </div>
      </div>
  
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>

</body>
</html>

