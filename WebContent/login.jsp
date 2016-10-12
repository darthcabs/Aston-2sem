<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
<%@ include file="imports.jsp"%>
</head>
<body>
	<%@ include file="menu.jsp"%>
	<section class="container mainSection">
		<div class="container col-md-4 col-md-offset-4">
			<div class="page-header">
				<h1 class="text-center">Login</h1>
			</div>
			<div>
				<form method="post" action="">
					<div class="form-group row">
						<label class="col-md-2 control-label" for="userInpt">User:
						</label>
						<div class="col-md-10">
							<input type="text" id="userInpt" name="user" class="form-control">
						</div>
					</div>
					<!-- UserInput -->
					<div class="form-group row">
						<label class="col-md-2 control-label">Senha</label>
						<div class="col-md-10">
							<input type="password" id="passInpt" name="pass"
								class="form-control">
						</div>
					</div>
					<!-- PassInput -->
					<div class="form-group row">
						<input type="submit" class="btn btn-success col-md-offset-10"
							value="Login">
					</div>
				</form>
			</div>
		</div>
	</section>
	
	<%@ include file="footer.jsp" %>
</body>
</html>