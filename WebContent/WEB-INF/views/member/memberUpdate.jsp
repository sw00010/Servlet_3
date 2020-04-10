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
	
	<div class="container">
	<form action="./memberUpdate" method="POST">
		<h1>Member Update</h1>
		<div class="form-group">
			<label for="num">ID:</label> <input type="text" class="form-control"
				name="id" id="id" readonly="readonly" value = "${member.id}">
		</div>
		<div class="form-group">
			<label for="name">Name:</label> <input type="text"
				class="form-control" name="name" id="name" value="${member.name}">
		</div>
		<div class="form-group">
			<label for="kor">Age:</label> <input type="text" class="form-control"
				name="age" id="age" value="${member.age}">
		</div>
		<div class="form-group">
			<label for="eng">E-Mail</label> <input type="text" class="form-control"
				name="email" id="email" value="${member.email}">
		</div>
		<div class="form-group">
			<label for="math">Phone</label> <input type="text"
				class="form-control" name="phone" id="phone" value="${member.phone}">
		</div>


		<button type="submit" class="btn btn-default">Submit</button>
	</form>
	</div>
</body>
</html>