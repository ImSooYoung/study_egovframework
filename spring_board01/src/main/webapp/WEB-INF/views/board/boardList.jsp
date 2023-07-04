<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" 
        rel="stylesheet" 
        integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" 
        crossorigin="anonymous">
	<style>
		.tr_row:hover {background:#ccc;}
	</style>
</head>
<body>

	<header class="mb-2 p-4 text-center" style="background:#ccc">
		<h1>리스트</h1>
	</header>
	
	<div class="bg-light my-2 p-2" style="text-align:right;">
		<p>${memberVO.name }님</p>
	</div>
	
	<nav>
		<ul class="nav bg-light" style="text-align:right;">
			<li>
				<a class="nav-link active" href="/board/boardWrite?no=${memberVO.no}">글 작성</a>
			</li>
		</ul>
	</nav>
	
	<div class="card my-2">
		<table>
			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>작성시간</th>
					<th>수정시간</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${boardVO }">
				<tr class="tr_row" onclick="location.href='/board/boardDetail?no=${item.no}'">
					<td>${item.no }</td>
					<td>${item.title }</td>
					<td>${item.name }</td>
					<td>${item.create_time }</td>
					<td>${item.modified_time }</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>