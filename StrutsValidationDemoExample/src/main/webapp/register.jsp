<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Register Form</title>
</head>
<body>
    <h2>Register Form</h2>
    <form action="registerAction" method="post">
        <label>Name:</label>
        <input type="text" name="user.name"><br>
        <label>Email:</label>
        <input type="text" name="user.email"><br>
        <input type="submit" value="Register">
    </form>
</body>
</html>