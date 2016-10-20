

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
		<div class="container col-md-8 col-md-offset-2">
			<div class="page-header">
				<h1 class="text-center">Lançar Honorario</h1>
			</div>
			<div align="center">
				${mensagem}
			</div>
			<div class="form horizontal">
				<form method="post" action="honorario">
					<div class="form-group">
						<div class="form-group row">
							<label for="dataInpt" class="col-sm-2 control-label">Data:</label>
							<div class="col-sm-10">
								<input type="text" id="dataInpt" name="data" class="form-control">
							</div>
						</div>
						<div class="form-group row">
							<label for="duracaoInpt" class="col-sm-2 control-label">Duração:</label>
							<div class="col-sm-10">
								<input type="text" id="duracaoInpt" name="duracao" class="form-control">
							</div>
						</div>
							<div class="form-group row">
								<label for="observacaoInpt" class="col-sm-2 control-label">Observação:</label>
								<div class="col-sm-10">
									<input type="text" id="observacaoInpt" name="observacao" class="form-control">
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-offset-5 col-sm-10">
									<input type="submit" id="submitInpt" value="ENVIAR" class="btn btn-success">
								</div>
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