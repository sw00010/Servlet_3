<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:import url="../template/header.jsp"></c:import>
	<c:import url="../template/boot.jsp"></c:import>
	<form action="./noticeUpdate" method="POST">
		<h1>Notice Update</h1>
		<div class="form-group">
			<label for="name">글제목:</label> <input type="text"
				class="form-control" name="documentName" value ="${ndto.documentName}">
		</div>
		<div class="form-group">
			<label for="name">글내용:</label> <input type="text"
				class="form-control" name="documentContents" value ="${ndto.documentContents}">
		</div>


		<button type="submit" class="btn btn-default">Submit</button>
		
		<a href="./noticeUpdate?num=${ndto.documentNum}" class="btn btn-primary">Update</a>
	</form>

</body>
</html>