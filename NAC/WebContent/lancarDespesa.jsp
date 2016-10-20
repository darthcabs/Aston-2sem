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
				<h1 class="text-center">Lançar Despesa</h1>
			</div>
			<div align="center">
				${mensagem}
			</div>
			<div class="form horizontal">
				<form method="post" action="despesa">
					<div class="form-group">
						<div class="form-group row">
							<label for="tipoInpt" class="col-sm-2 control-label">Tipo:</label>
							<div class="col-sm-10">
								<select id="tipoInpt" name="tipo" class="form-control">
									<option value="xerox">Xerox</option>
									<option value="autenticacao">Autenticação</option>
									<option value="viagem">Viagem</option>
									<option value="hospedagem">Hospedagem</option>
									<option value="outros">Outros</option>
								</select>
							</div>
						</div>
							<div class="form-group row">
								<label for="dataInpt" class="col-sm-2 control-label">Data: </label>
								<div class="col-sm-10">
									<input type="text" id="dataInpt" name="data" class="form-control">
								</div>
							</div>
							<div class="form-group row">
								<label for="valorInpt" class="col-sm-2 control-label">Valor:</label>
								<div class="col-sm-10">
									<input type="text" id="valorInpt" name="valor" class="form-control">
								</div>
							</div>
							<div class="form-group row">
								<label  for="observacaoInpt" class="col-sm-2 control-label">Observação:</label>
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