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
	<form action="./memberJoin" method="POST">
		<h1>Member Join</h1>
		<div class="form-group">
			<label for="name">Name:</label> <input type="text"
				class="form-control" name="name">
		</div>
		<div class="form-group">
			<label for="age">Age:</label> <input type="text" class="form-control"
				name="age" >
		</div>
		<div class="form-group">
			<label for="id">ID:</label> <input type="text" class="form-control"
				name="id">
		</div>
		<div class="form-group">
			<label for="pw">PW</label> <input type="password" class="form-control"
				name="pw" >
		</div>
		<div class="form-group">
			<label for="email">E-Mail:</label> <input type="text"
				class="form-control" name="email">
		</div>
		
		<div class="form-group">
			<label for="phone">Phone:</label> <input type="text"
				class="form-control" name="phone">
		</div>


		<button type="submit" class="btn btn-default">Submit</button>
	</form>
	
</body>
</html>