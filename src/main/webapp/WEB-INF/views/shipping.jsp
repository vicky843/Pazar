<%@taglib uri="http://www.springframework.org/tags/form" prefix="k" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
this is shipping part
<div class="container-fluid">
<div class="col-sm-4">
<k:form method="post" commandName="shippingAddress">
<k:input path="firstname" type="text" placeholder="firstname" ></k:input>
<k:input path="lastname" type="text" placeholder="lastname" ></k:input>
<k:input path="address_line1" type="text" placeholder="address_line1" ></k:input>
<k:input path="city" type="text" placeholder="city" ></k:input>
<k:input path="pin_code" type="text" placeholder="pin_code" ></k:input>
<k:input path="state" type="text" placeholder="state" ></k:input>
<k:input path="country" type="text" placeholder="country" ></k:input>

<k:button type="submit" name="_eventId_saveship">Submit</k:button>
</k:form>
</div></div>
</body>
</html>