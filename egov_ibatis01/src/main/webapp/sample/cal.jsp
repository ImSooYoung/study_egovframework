<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Calendar cal = Calendar.getInstance();
int y = cal.get(cal.YEAR);
int m = cal.get(cal.MONTH);
int d = cal.get(cal.DATE);
%>

<%=y %>년 <%=m+1 %> 월 <%=d %>일

</body>
</html>