<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui"     uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 목록</title>
<style>
	.tr:hover { cursor:pointer; background:#ccc; }
</style>
</head>

<body>

	<table>
		<caption>글 목록</caption>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
		</tr>
		
		<c:forEach var="result" items="${result }">
			<tr onclick="location='boardDetail.do?no=${result.no} ' "  class="tr" >
				<td>${result.no }</td>
				<td>${result.title }</td>
				<td>${result.name }</td>
			</tr>
		</c:forEach>
	</table>
	
	<button onclick="location='boardWrite.do' ">글작성</button>

</body>
</html>