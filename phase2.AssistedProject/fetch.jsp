<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <jsp:include page="header.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>
<jsp:useBean id="entry" class="core.programs.Entry" scope="session"></jsp:useBean>
Entry Record:<br>  
ID :	<jsp:getProperty property="id" name="entry"/><br>  
Name:	<jsp:getProperty property="name" name="entry"/><br>  
Age :	<jsp:getProperty property="age" name="entry"/><br>  
Dept :  <jsp:getProperty property="dept" name="entry" /><br>  


	
</body>
</html>