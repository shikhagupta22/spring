<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@include file="admin.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>USER REGISTRATION</title>
</head>
<body>
<center>
<form:form name="myForm" action="/FinalBRD/welcomeadmin/new" method="post" commandName="customer">
Username:<br>
<form:input type="text" name="username" path="username"/><br>
<form:errors path="username" Class="error"/><br>
Password:<br>
<form:input type="text" name="password" path="password"/><br>
<form:errors path="password" Class="error"/><br>
Enabled(1-ACTIVE/0-INACTIVE):<br>
<form:input type="text" name="enabled" path="enabled"/><br>
<form:errors path="enabled" Class="error"/><br>
</form:form>
</center>
</body>
</html>