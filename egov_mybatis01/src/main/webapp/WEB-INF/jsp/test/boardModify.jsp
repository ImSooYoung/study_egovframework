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
<title>글 수정</title>
</head>
<body>

	<form class="card-body" name="frm" action="boardModifySave.do" method="get">
		<div class="py-3 boarder-bottom" >
			<label class="column">제목</label>
			<input type="text" name="title" value="${result.title }" />
		</div>
		<div class="py-3 boarder-bottom" >
			<label class="column">작성자</label>
			<input type="text" name="name" value="${result.name }"/>
		</div>
		<div class="py-3 boarder-bottom" >
			<label class="column">내용</label>
			<input type="text" name="content" value="${result.content }" />
		</div>
		<input type="hidden" name="no" value="${result.no }" }>
		
		<div  class="py-3 boarder-bottom" >
			<button type="submit">수정하기</button>
		</div>
	</form>
	
</body>
</html>