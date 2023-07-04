<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>글 작성</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" 
        rel="stylesheet" 
        integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" 
        crossorigin="anonymous">
</head>
<body>
	<header class="mb-2 p-4 text-center bg-secondary">
		<h1>글 작성 페이지</h1>
	</header>
	
	<main>
		<div class="card my-4">
			<form class="my-4" action="/board/boardCreate" method="get">
				<div class="my-2">
					<label for="title" class="form-label">제목</label>
					<input id="title" class="form-control" type="text" name="title" />
				</div>
				<div class="my-2">
					<label class="content">내용</label>
					<textarea id="content" class="form-control" name="content"></textarea>
				</div>
				<input type="hidden" name="memberNo" value="${no }"/>
				<input type="submit" value="작성" />
			</form>
		</div>
	</main>
	
</body>
</html>