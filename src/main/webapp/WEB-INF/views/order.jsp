<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="k" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
this is order display page
<div class="container">
 <div class="panel-group">
<div class="panel panel-default">
    <div class="panel-heading">Order page</div>
    <div class="panel-body">
    <div class="col-sm-6">
    <div  class="panel panel-default" >
<div class="panel-heading" >
<div ><b >Shipping Details</b></div>
<div class="panel-body">
  
<k:set var="ship" value='<%=session.getAttribute("shipaddress")%>' ></k:set>
<k:set var="user" value='<%=session.getAttribute("userid")%>' ></k:set>
    ${user}
    <br>
    ${ship.firstname }
   <br> ${ship.lastname }
   <br> ${ship.address_line1 }
   <br> ${ship.pin_code }
   <br> ${ship.state }
    <br>${ship.country }
  
  <br>  ${ship.city }
    its is present
    
    
    
    
    
    </div>
    
    </div>
    
    
    </div></div>
    
    
    <div class="col-sm-6 ">
<div  class="panel panel-default">
<div class="panel-heading">
<b>Billing Details</b>
<div class="panel-body">
<k:set var="bill" value='<%=session.getAttribute("billaddress")%>' ></k:set>
<k:set var="user" value='<%=session.getAttribute("userid")%>' ></k:set>

${user}<br>
    <br>
    ${bill.firstname }
   <br> ${bill.lastname }
   <br> ${bill.address_line1 }
   <br> ${bill.pin_code }
   <br> ${bill.state }
    <br>${bill.country }
  
  <br>  ${bill.city }
    its is present
    
</div>
</div>
</div>
</div>
<table class="table table-bordered table-hover" >
 
      <tr >
        <th class="text-center" >Product</th>
        <th class="text-center" >Quantity</th>
        
      </tr>
      <k:forEach var="carts" items='<%session.getAttribute("getcartlist")%>'>
      <tr>
      <td>
      </td>
      </tr>
      </k:forEach>
      
 </table>   
    </div>
  </div>
</div>


</div>


</body>
</html>