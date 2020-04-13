<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:import url="../template/header.jsp"></c:import>
	<c:import url="../template/boot.jsp"></c:import>
	<form action="./noticeAdd" method="POST">
		<h1>Notice Add</h1>
		<div class="form-group">
			<label for="name">글제목:</label> <input type="text"
				class="form-control" name="documentName">
		</div>
		<div class="form-group">
			<label for="comment">글내용:</label>
			<textarea class="form-control" rows="5" name="documentContents"></textarea>
		</div>
		<div>
			<label>작성자 :
				<input readonly="readonly" name="writeId" value="${member.id}">
			</label>
			
		</div>
		


		<button type="submit" class="btn btn-default">Submit</button>
	</form>

</body>
</html>