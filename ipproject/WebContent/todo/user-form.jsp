<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Course Management Application</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

</head>

</head>
<body>
<jsp:include page="../common/header.jsp"></jsp:include>
	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: white;">
			<div>
				<a href="" class="navbar-brand"> Course
					App</a>
			</div>

			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/list"
					class="nav-link">Course List</a></li>
			</ul>
		</nav>
	</header>
	<br>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
				<c:if test="${user != null}">
					<form action="update" method="post">
				</c:if>
				<c:if test="${user == null}">
					<form action="insertu" method="post">
				</c:if>

				<caption>
					<h2>
						<c:if test="${user != null}">
            			Edit student
            		</c:if>
						<c:if test="${user == null}">
            			Add New student
            		</c:if>
					</h2>
				</caption>

				<c:if test="${user != null}">
					<input type="hidden" name="id" value="<c:out value='${user.id}' />" />
				</c:if>

				<fieldset class="form-group">
					<label>FIRST NAME</label> <input type="text"
						value="<c:out value='${user.first_name}' />" class="form-control"
						name="fname" required="required" minlength="5">
				</fieldset>

				<fieldset class="form-group">
					<label>LAST NAME</label> <input type="text"
						value="<c:out value='${user.last_name}' />" class="form-control"
						name="lname" minlength="1">
				</fieldset>
                <fieldset class="form-group">
					<label>PASSWORD</label> <input type="password"
						value="<c:out value='${user.password}' />" class="form-control"
						name="pass" minlength="5">
				</fieldset>

				<fieldset class="form-group">
					<label>USER NAME</label> <input type="text"
						value="<c:out value='${user.user_name}' />" class="form-control"
						name="user" minlength="1">
				</fieldset>
				

				

				<button type="submit" class="btn btn-success">Save</button>
				</form>
			</div>
		</div>
	</div>

	<jsp:include page="../common/footer.jsp"></jsp:include>
</body>
</html>
