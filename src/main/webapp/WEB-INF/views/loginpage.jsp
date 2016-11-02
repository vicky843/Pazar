<%@taglib uri="http://www.springframework.org/tags/form" prefix="k"%>
<!DOCTYPE html>
<html>
<head></head>
<body>
<k:form action="loginpage" method="post" commandName="loginForm">
<table align:"center">
<tr>
<td>Login page</td>
</tr>
<tr>
<td>User name</td>
<td><k:input path="username" type="text"></k:input>
</td>
</tr>
<br>
<tr>
<td>Password</td>
<td><k:input path="password" type="password"></k:input>
</td>
</tr><tr>
 <td><k:checkbox path="" value="Remember Me"  label="Remember Me"></k:checkbox></td>
</tr>
<tr>

<td><k:button path="submit" >Login</k:button>
</td>

</tr>

</table>



</k:form>


</body>
</html>
