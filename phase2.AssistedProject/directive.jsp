<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.io.PrintWriter" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Directives</title>
</head>
<body>

This is content from the main file.
<%@ include file="header.jsp" %>
<hr>

<h1>Welcome to this page</h1>
Date : <%= (new java.util.Date()) %><br><br>
</p>

</body>
</html>