
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="k" %>
<!DOCTYPE html>
<html>
<head>

</head>
<style>
.logo{
width:40%;
}
</style>
<body>


            <div class="container"> 
            <div class="col-sm-4 col-sm-offset-4">
            <div class="jumbotron">
            <img src="images/TROLLY.png" class="logo"  class="img-responsive"><Span>Pazar World</Span>
          <!--  <h1>Registration Form</h1> --> 
               
<k:form action="register" method="post" commandName="regForm"><br>
                   <b>User Name:</b>
<k:input path="username" required="true" class="form-control" /><br>	
                   <b>email:</b>
                    <k:input path="email" required="true" class="form-control"  /><br>

                   <b> Birthdate:</b>
                    <k:input path="birthdate" required="true"  class="form-control" type="date" /><br>	
          <b> Password:</b>
                    <k:input path="password" required="true" class="form-control"  type="password"  /><br>

                  <b>  Gender:</b>
                   <k:select path="gender" required="true" items="${gendertype}"/><br><br>	
                  <b>Address</b>
                  <k:input path="location" required="true" class="form-control" ></k:input>
                   <k:checkbox path="" value="Remember Me" required="true" label="I agree the terms and conditions"/><br>
<k:button type="submit" class="btn btn-success">Create an account</k:button>
<h4>Already have an Account?<a href="loginpage">Click Here</a></h4>
</k:form>
</div>
</div>
</div>
</body>
</html>

