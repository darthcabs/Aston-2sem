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
		<div class="container">
			<div class="page-header">
				<h1 class="text-center">Cadastro Advogado</h1>
			</div>
			<div>
				<form method="post" action="">
					<div class="form-group">
						<div class="form-group">
							<label class="control-label col-md-1 text-right">Nome: </label>
							<div class="col-md-5">
								<input type="text" id="nomeInpt" name="nome"
									class="form-control">
							</div>
							<label class="control-label col-md-1 text-right">OAB:</label>
							<div class="col-md-4">
								<input type="text" id="oabInpt" name="oab" class="form-control">
							</div>
						</div>
					</div>
				</form>
			</div>
		</div>
	</section>

	<%@ include file="footer.jsp"%>
</body>
</html>