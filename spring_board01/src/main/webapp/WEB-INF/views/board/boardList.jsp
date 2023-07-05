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
	
	<main>
	
		<div class="bg-light my-2 p-2">
			<form action="/board/boardSearch" method="get">
				<div class="row">
					<div class="col-3">
						<select class="form-control" name="type">
							<option value="all">전체</option>
							<option value="t">제목</option>
							<option value="a">작성자</option>
						</select>
					</div>
					<div class="col-5">
						<input class="form-control" type="text" name="keyword" placeholder="검색어" autofocus />
					</div>
					<div class="col-2">
						<input class="form-control btn btn-outline-success" type="submit" value="검색" />
						<input type="hidden" name="member_no" value="${memberVO.no}" />
					</div>
				</div>
			</form>
		</div>
		
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
					<tr class="tr_row" onclick="location.href='/board/boardDetail?no=${item.no}&member_no=${memberVO.no }'">
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
		
	</main>

</body>
</html>