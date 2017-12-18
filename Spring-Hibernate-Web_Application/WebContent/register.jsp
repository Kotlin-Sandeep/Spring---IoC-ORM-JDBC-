<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 style="text-align: center;color:blue;">Registration Form</h1>
	<hr>
	<h1 style="text-align: left;color:red;">${msg}</h1>
	<hr>
	<form action="./register.d" method="post">
		<input type="text" name="fname" placeholder="Enter your first name" value="${fname}"><br><br> 
		<input type="text" name="lname" placeholder="Enter your last name" value="${lname}"><br><br> 
		<input type="text" name="no" placeholder="8976543210" value="${no}"><br><br> 
		<input type="password" name="pass" placeholder="*****************"><br><br> 
		<input type="password" name="cpass" placeholder="*****************"><br><br> 
		<input type="email" name="email" placeholder="john@gmail.com" value="${email}"><br><br>
		<input type="submit" value="Get Register With Us"><br><br>
	</form>
</body>
</html>