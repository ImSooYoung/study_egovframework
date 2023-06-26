<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 작성</title>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
      rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">

</head>
<body>

	<form class="card-body" name="frm" action="boardWriteSave.do" method="get">
		<div class="py-3 boarder-bottom" >
			<label class="column">제목</label>
			<input type="text" name="title" />
		</div>
		<div class="py-3 boarder-bottom" >
			<label class="column">작성자</label>
			<input type="text" name="name" />
		</div>
		<div class="py-3 boarder-bottom" >
			<label class="column">내용</label>
			<input type="text" name="content" />
		</div>
		<div  class="py-3 boarder-bottom" >
			<button type="submit">작성</button>
		</div>
	</form>
	
	
</body>
</html>