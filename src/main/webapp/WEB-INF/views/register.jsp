
<%@taglib uri="http://www.springframework.org/tags/form" prefix="k"%>
<!DOCTYPE html>
<html>
<head></head>
<body>

<k:form action="register" method="post" commandName="regForm">

            <table border="0">
                <tr>
                    <td colspan="2" align="center"> Registration Form</td>
                </tr>
                <tr>
                    <td>User Name:</td>
                    <td><k:input path="username"  /></td>
</tr>


<tr>
                    <td>email:</td>
                    <td><k:input path="email"  /></td>
</tr>
<tr>
                    <td>Birthdate:</td>
                    <td><k:input path="birthdate"  /></td>
</tr>

<tr>
                    <td>Password:</td>
                    <td><k:input path="password" type="password"  /></td>
</tr>

<tr>
                    <td>Gender:</td>
                    <td><k:radiobutton path="gender" items="${gendertype}"/></td>
</tr>
<tr><td><k:button type="submit" >Register</k:button></td></tr>
</table>
</k:form>
</body>
</html>

