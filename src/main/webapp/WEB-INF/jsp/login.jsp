<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Bank Login</title>
</head>
<body>

<h2>Customer Information</h2>
<form:form method="POST" modelAttribute="customer" action="/SpringWebApplication/validateCustomer">
   <table>
    <tr>
        <td><form:label path="username">User Name</form:label></td>
        <td><form:input path="username" /></td>
    </tr>
    <tr>
        <td><form:label path="pwd">Password</form:label></td>
        <td><form:password path="pwd" /></td>
    </tr>
    <tr>
        <td><form:label path="userId">User ID:</form:label></td>
        <td><form:input path="userId" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>
</body>
</html>