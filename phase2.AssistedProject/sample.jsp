<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 scriptlet:<br>
	<% 
		int a= 8;
		int b= 10;
		int c= a+b;
		out.println("welcome in jsp page   " + c);
	%>
<br><br>
Expression Tag:<br>
	sum is:
	<%= (3+2) %>
	<br><br>
 declaration tag:<br>
   <%! int a = 90, b=70; %>	
   <%= "subracted value" + (90+70) %>
 
</body>
</html>