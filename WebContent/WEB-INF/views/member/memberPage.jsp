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
			<h1>Member Page</h1>
			<table class="table table-hover">
				<tr class="success">
					<td>이름</td>
					<td>나이</td>
					<td>ID</td>
					<td>E-Mail</td>
					<td>Phone</td>

				</tr>

				<tr class="info">
					<td>${member.name}</td>
					<td>${member.age}</td>
					<td>${member.id}</td>
					<td>${member.email}</td>
					<td>${member.phone}</td>
				</tr>
			</table>
			<button class="btn btn-primary" id ="update">Update</button>
			<button class="btn btn-danger" id = "del">Delete</button>
		</div>
	</div>
</body>
<script type="text/javascript">
	$("#del").click(function () {
		var result = confirm("회원탈퇴하시겠습니까?");
		if(result){
			location.href="./memberDelete";
		}
	});
	$("#update").click(function() {
		location.replace("./memberUpdate");
	});
	
	
	
	
	
</script>

</html>