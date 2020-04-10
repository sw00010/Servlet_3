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
	<form action="./pointMod" method="POST">
		<h1>Point Mod Form</h1>
		<div class="form-group">
			<label for="name">Name:</label> <input type="text"
				class="form-control" name="name" id="name" value="${dto.name}">
		</div>
		<div class="form-group">
			<label for="num">Num:</label> <input type="text" class="form-control"
				name="num" id="num" readonly="readonly" value = "${dto.num}">
		</div>
		<div class="form-group">
			<label for="kor">Kor:</label> <input type="text" class="form-control"
				name="kor" id="kor" value="${dto.kor}">
		</div>
		<div class="form-group">
			<label for="eng">Eng</label> <input type="text" class="form-control"
				name="eng" id="eng" value="${dto.eng}">
		</div>
		<div class="form-group">
			<label for="math">Math:</label> <input type="text"
				class="form-control" name="math" id="math" value="${dto.math}">
		</div>


		<button type="submit" class="btn btn-default">Submit</button>
	</form>

	
</body>
</html>