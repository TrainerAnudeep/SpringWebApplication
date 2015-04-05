<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Success Login</title>
</head>
<body>

<h2>Submitted Customer Information</h2>
   <table>
    <tr>
        <td>UserName</td>
        <td>${username}</td>
    </tr>
    <tr>
        <td>Password</td>
        <td>${pwd}</td>
    </tr>
    <tr>
        <td>UserId</td>
        <td>${userId}</td>
    </tr>
</table>  
</body>
</html>