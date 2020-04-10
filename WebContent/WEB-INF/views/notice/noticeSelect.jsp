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


	<div class="container">
		<div class="row">
			<h1>Notice 내용</h1>
			<table class="table table-hover">
				<tr>
					<td>글번호</td>
					<td>글 제목</td>
					<td>작성자</td>
					<td>DATE</td>
					<td>조회수</td>

				</tr>

				<tr>
					<td>${ndto.documentNum}</td>
					<td>${ndto.documentName}</td>
					<td>${ndto.writeId }</td>
					<td>${ndto.writeDate }</td>
					<td>${ndto.documentViews }</td>
	

				</tr>

			</table>
			<div class="form-group">
				<label for="comment">글내용:</label>
				<textarea class="form-control" rows="5" id="documentContents" readonly="readonly">${ndto.documentContents }</textarea>
			</div>
			<a href="./noticeUpdate?documentNum=${ndto.documentNum}" class="btn btn-primary">Update</a>
			<a href="./noticeDelete?documentNum=${ndto.documentNum}" class="btn btn-danger">Delete</a>

		</div>
	</div>

</body>







</html>