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
		<div class="row">
			<h1>Notice List</h1>
			<table class="table table-hover">
				<tr>
					<td>글번호</td>
					<td>글 제목</td>
					<td>작성자</td>
					<td>DATE</td>
					<td>조회수</td>

				</tr>
				<c:forEach items="${nlist}" var="ndto">
					<tr>
						<td>${ndto.documentNum}</td>
						<td id="document"><a href="./noticeSelect?documentNum=${ndto.documentNum}">${ndto.documentName}</a></td>
						<td>${ndto.writeId }</td>
						<td>${ndto.writeDate }</td>
						<td>${ndto.documentViews }</td>
					
					</tr>
				</c:forEach>
				
			
			</table>
			
			<a href="./noticeAdd" class ="btn btn-primary">Notice Add</a>
		</div>	
	</div>	

</body>
<script type="text/javascript">
	$("#document").click(function() {
		
	});








</script>

</html>