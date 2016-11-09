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
</head>
<body>
<div class="container-fluid">
<div class="col-sm-4">
<k:form action="" method="post" commandName="supForm">




<k:input path="supid" class="form-control" placeholder="supplierid" type="text"></k:input><br>

<k:input path="supname" class="form-control" placeholder="suppliername" type="text"></k:input><br>
<k:input path="supaddress" class="form-control" placeholder="supplieraddress" type="text" ></k:input>
<k:input path="supnumber" class="form-control" placeholder="suppliernumber" type="text" ></k:input>
<k:input path="supemail" class="form-control" placeholder="supplieremail" type="text" ></k:input>
<br><br>
<k:button path="submit" class="btn btn-success">Submit</k:button>



</k:form><!-- end of form -->
</div>
</div>
</body>
</html>