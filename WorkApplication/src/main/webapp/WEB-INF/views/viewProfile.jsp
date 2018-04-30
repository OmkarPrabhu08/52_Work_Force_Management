<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<center>
<title>View Profile</title>
</center>
</head>
<body>
<center>
<input type="firstName" name="First name" value="${firstName}" readonly=true/>
<input type="lastName" name="Last name" value="${lastName}" readonly=true/>
<input type="phonenumber" name="Phone number" value="${phonenumber}" readonly=true/>
<input type="emailID" name="Email ID" value="${emailID}" readonly=true/>
<input type="DOB" name="Date of birth" value="${DOB}" readonly=true/>
</center>

</body>
</html>