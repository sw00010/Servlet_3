<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!--  BootStrap API  -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<!-- BootStrap API -->
</head>
<body>
	<!-- NAV  -->
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">WebSiteName</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="${pageContext.request.contextPath}">Home</a></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Page 1 <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="#">Page 1-1</a></li>
						<li><a href="#">Page 1-2</a></li>
						<li><a href="#">Page 1-3</a></li>
					</ul></li>
				<li><a
					href="${pageContext.request.contextPath}/point/pointList">Point</a></li>
				<li><a href="#">Page 3</a></li>
			</ul>
		</div>
	</nav>
	<!-- NAV -->

	<div class="container">
		<div class="jumbotron">
			<h1>Bootstrap Tutorial</h1>
			<p>Bootstrap is the most popular HTML, CSS, and JS framework for
				developing responsive, mobile-first projects on the web.</p>
		</div>
		<p>This is some text.</p>
		<p>This is another text.</p>
	</div>
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