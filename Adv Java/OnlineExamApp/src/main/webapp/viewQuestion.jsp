<%@page import="com.cdac.jdbc.Question"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
  Question q = (Question) session.getAttribute("currentQ");
  if (q != null){
%>
Q. <%= q.getQuestion() %><br>
1. <%= q.getOption1() %><br>
2. <%= q.getOption2() %><br>
3. <%= q.getOption3() %><br>
4. <%= q.getOption4() %><br>
<%
  } else {
%>
<p> No Question Available.</p>
<%
  }
%>
</body>
</html>