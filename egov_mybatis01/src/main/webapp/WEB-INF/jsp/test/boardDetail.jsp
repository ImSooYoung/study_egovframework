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
<title>상세 페이지</title>
</head>
<body>

		<div class="py-3 boarder-bottom" >
			<label class="column">제목</label>
			<input type="text" name="title" readonly value="${result.title }"/>
		</div>
		<div class="py-3 boarder-bottom" >
			<label class="column">작성자</label>
			<input type="text" name="name" readonly value="${result.name }"/>
		</div>
		<div class="py-3 boarder-bottom" >
			<label class="column">내용</label>
			<input type="text" name="content" readonly value="${result.content }"/>
		</div>
	</div>
	
	<button onclick="location='boardModify.do?no=${result.no}' ">수정</button>
	<button onclick="location='boardDelete.do?no=${result.no}' ">삭제</button>
</body>
</html>