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
		<h2>Vertical (basic) form</h2>
		<form action="./memberLogin" method = "post">
			<div class="form-group">
				<label for="id">ID:</label> <input type="text"
					class="form-control" id="id" placeholder="Enter ID"
					name="id">
			</div>
			<div class="form-group">
				<label for="pw">Password:</label> <input type="password"
					class="form-control" id="pw" placeholder="Enter password"
					name="pw">
			</div>
			<div class="checkbox">
				<label><input type="checkbox" name="remember">
					Remember me</label>
			</div>
			<button type="submit" class="btn btn-default">Submit</button>
		</form>
	</div>


</body>
</html>