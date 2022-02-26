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
<jsp:useBean id="entry" class="core.programs.Entry" scope="session"/>
	<jsp:setProperty property="id" name="entry"/>  
	<jsp:setProperty property="name" name="entry"/>  
	<jsp:setProperty property="age" name="entry"/>  
	<jsp:setProperty property="dept" name="entry"/>  <br><br>
	
<center><a href = "fetch.jsp">Click to get the Data</a></center><br><br>
<center><a href = "forword.jsp">Logout</a></center>

<br><br>
<jsp:text>
        <![CDATA[This will show within a text action tag exactly as it has been entered]]>
</jsp:text>
	
</body>
</html>