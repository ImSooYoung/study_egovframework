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
			<form action="/board/boardModifiedSave" method="get">
				<div class="my-2">
					<label for="title" class="form-label">제목</label>
					<input id="title" class="form-control" type="text" name="title" value="${result.title }" />
				</div>
				<div class="my-2">
					<label class="content">내용</label>
					<input type="text" id="content" class="form-control" name="content" value="${result.content }"  />
				</div>
				<input type="hidden" name="no" value="${result.no }"/>
				<input type="submit" value="저장"/>
			</form>
		</div>
	</main>
	
</body>
</html>