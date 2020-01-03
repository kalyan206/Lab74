<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>User Account Login</h1>
<form:form action="verifyUser.jlc" method="post" commandName="user">


<table>

<tr><td>Username</td>
<td><form:input path="username"/></td>
<td><font color=red size="5"><form:errors path="username"></form:errors></font></td></tr>


<tr><td>Password</td>
<td><form:input path="password"/></td>
<td><font color=red size="5"><form:errors path="password"></form:errors></font></td></tr>


</table>

<br><input type="submit" value="Account Login">






</form:form>

</body>
</html>