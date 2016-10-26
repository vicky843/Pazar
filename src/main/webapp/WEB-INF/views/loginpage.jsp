<%@ taglib uri="http://www.springframework.org/tags/form" prefix="dota" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
</head>
<body>
<dota:form action="login" method="post" >
<table border="0">
                <tr>
                    <td colspan="2" align="center"> Registration Form</td>
                </tr>
                <tr>
                    <td>User Name:</td>
                    <td><dota:input path="username"  /></td>
</tr>

<tr>
                    <td>Password:</td>
                    <td><dota:input path="password" type="password"  /></td>
</tr>
<tr><td><dota:button type="submit">Register</dota:button></td></tr>
</table>
</dota:form>
</body>
</html>