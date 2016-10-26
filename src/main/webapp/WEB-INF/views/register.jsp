<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="invoker"%>
<!DOCTYPE html>
<html>
<title>registration page</title>
<head></head>
<body>

<invoker:form action="register" method="post" commandName="userForm">

            <table border="0">
                <tr>
                    <td colspan="2" align="center"> Registration Form</td>
                </tr>
                <tr>
                    <td>User Name:</td>
                    <td><invoker:input path="username"  /></td>
</tr>

<tr>
                    <td>Password:</td>
                    <td><invoker:input path="password" type="password"  /></td>
</tr>
<tr>
                    <td>email:</td>
                    <td><invoker:input path="email"  /></td>
</tr>
<tr>
                    <td>Birthdate:</td>
                    <td><invoker:input path="birthdate"  /></td>
</tr>

<tr>
                    <td>Profession:</td>
                    <td><invoker:select path="profession" items="${professionList}" /></td>
</tr>
<tr><td><invoker:button type="submit" >Register</invoker:button></td></tr>
</table>
</invoker:form>
</body>

</html>

