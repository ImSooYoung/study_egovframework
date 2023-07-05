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
		header {background:#ccc;}
	</style>
</head>
<body>

	<header class="mb-2 p-4 text-center">
		<h1>글 디테일 페이지</h1>
	</header>
	
	<main>
		<div class="card my-4">
			<div class="my-2">
				<label for="title" class="form-label">제목</label>
				<input id="title" class="form-control" type="text" name="title" value="${result.title }" readonly/>
			</div>
			<div class="my-2">
				<label class="content">내용</label>
				<input type="text" id="content" class="form-control" name="content" value="${result.content }" readonly />
			</div>
			<input type="hidden" name="memberNo" value="${member_no }"/>
			
			<c:set var="member_no" value="${member_no }"/>
			<c:set var="board_member_no" value="${result.member_no }" />
			
			<c:if test="${ member_no == board_member_no }">
				<a href="/board/boardModified?no=${result.no }" class="btn btn-outline-success" >수정</a>
				<a href="/board/boardDelete?no=${result.no }&member_no=${member_no}" class="btn btn-outline-success">삭제</a>
			</c:if>
				
		</div>
	</main>
	
</body>
</html>