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
 <thead>
 
      <tr >
        <th class="text-center" >Product</th>
        <th class="text-center" >Quantity</th>
          <th class="text-center" >Date</th>
            <th class="text-center"  >Price</th>
            
         
         
        
      </tr>
    </thead>


<%--   <k:forEach items='<%=session.getAttribute("carted_list")%>' var="car"> 
<tbody>
      <tr>
        
        <td class="text-center"><img width="30px" height="60px" src="pro_images/${car.pro_id}.jpg"><span style="margin-left: 50px;">
        <b >${car.pro_name}</b></span></td>
        <td class="text-center"> 
       ${car.quantity}
        </td>
        <td class="text-center"><div style="margin-top:20px;">${car.date_cart}</div></td>
           <td class="text-center"><div style="margin-top:20px;">${car.price}</div></td>
          
      </tr>
      
    </tbody>
   
 </k:forEach> --%>
 
 
  </table>
 <%--  <b style="font-size: 20px; color: red;" class="pull-right">Total:    <%=session.getAttribute("total")%></b>
  </div>
 
<div class="panel-footer">
  
 <h6>@ShopOn</h6>
 
<f:form modelAttribute="order">
<div class="pull-right" style="position:relative; top:-30px;"> <f:button type="submit" name="_eventId_submitOrder" value="confirm order" class="btn btn-success ">Confirm Order</f:button></div>
<div class="pull-left" style="position:relative; top:-40px; "><f:button type="submit" name="_eventId_cancel" class="btn btn-danger " style="margin-top:10px; ">Cancel</f:button></div>
 --%>
<!-- </f:form> -->

    </div>
  </div>
</div>


</div>


</body>
</html>