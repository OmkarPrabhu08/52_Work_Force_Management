<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<center>
<title>Clock In</title>
</center>
</head>
<body>
<center>
<form action = "ClockInTime" method = "post">
Enter User Id : <input type= "number" name="timesheetId" value = ""/>
<br/>
</form>
</center>
<center>
Clock In Time : <input type="ClockIn" name="Clock In Time" value="${ClockIn}" readonly=true/>
</center>
</body>
</html>