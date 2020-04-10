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
	<form action="./pointAdd" method="POST">
		<h1>Point Add Form</h1>
		<div class="form-group">
			<label for="name">Name:</label> <input type="text"
				class="form-control" name="name" id="name">
		</div>
		<div class="form-group">
			<label for="num">Num:</label> <input type="text" class="form-control"
				name="num" id="num">
		</div>
		<div class="form-group">
			<label for="kor">Kor:</label> <input type="text" class="form-control"
				name="kor" id="kor">
		</div>
		<div class="form-group">
			<label for="eng">Eng</label> <input type="text" class="form-control"
				name="eng" id="eng">
		</div>
		<div class="form-group">
			<label for="math">Math:</label> <input type="text"
				class="form-control" name="math" id="math">
		</div>


		<button type="submit" class="btn btn-default">Submit</button>
	</form>




</body>
</html>