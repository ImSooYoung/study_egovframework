<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>

	<h2>hello</h2>
	<a href="/member/joinWrite">회원가입</a>
	<a href="/member/">회원목록 조회</a>
	
	<form action="/member/login" method="post">
		<input type="text" name="id" />
		<input type="text" name="pw" />
		<input type="submit" value="로그인"></input>
	</form>
	
</body>
</html>
