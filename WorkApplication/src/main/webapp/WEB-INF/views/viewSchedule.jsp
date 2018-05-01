<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
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
<form action = "getuserschedule" method = "post">
Enter User Id : <input type= "number" name="userId" value = ""/>
<br/>
</form>
</center>
<center>
<table border="1" style="width:90%;margin-left:20px;" >
<tr>
<th> UserId </th>
<th> Time In </th>
<th> Time out</th>
</tr>
<c:forEach items="${searchResults}" var="searchResult">
<tr>
<td><c:out value ="${searchResult.userId}"/></td>
<td><c:out value ="${searchResult.timeIn}"/></td>
<td><c:out value ="${searchResult.timeOut}"/></td>
</tr>
</c:forEach>
</table></center>
</body>
</html>