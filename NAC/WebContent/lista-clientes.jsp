<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Lista de Clientes</title>
	<%@ include file="imports.jsp"%>
</head>
<body>
	<%@ include file="menu.jsp"%>
	<div class="container">
		<h1>Lista de Clientes</h1>
		<c:forEach var="cli" items="${clientes }">
			<br>
			<div class="form-group">
				<label for="id-razao-social">Razão Social:</label>
				<input type="text" value="${cli.razaoSocial}" id="id-razao-social" class="form-control">
			</div>
			<div class="form-group">
				<label>Endereço(s)</label>
				<br>
				<table class="table table-bordered table-hover">
					<thead>
						<tr>
							<th>Logradouro</th>
							<th>Número</th>
							<th>Complemento</th>
							<th>Bairro</th>
							<th>CEP</th>
							<th>Cidade</th>
							<th>Estado</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="ende" items="${cli.enderecos }">
							<tr>
								<td>${ende.logradouro}</td>
								<td>${ende.numeroResidencia}</td>
								<td>${ende.complemento}</td>
								<td>${ende.bairro}</td>
								<td>${ende.cep}</td>
								<td>${ende.cidade}</td>
								<td>${ende.estado}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<div class="form-group">
				<label>Telefone(s)</label>
				<br>
				<table class="table table-bordered table-hover">
					<thead>
						<tr>
							<th>Tipo</th>
							<th>DDD</th>
							<th>Telefone</th>
							<th>Ramal</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="tel" items="${cli.telefones }">
							<tr>
								<td>${tel.tipo}</td>
								<td>${tel.ddd}</td>
								<td>${tel.numero}</td>
								<td>${tel.ramal}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<div class="form-group">
				<label for="id-cnpj">CNPJ:</label>
				<input type="text" value="${cli.cnpj }" id="id-cnpj" class="form-control">
			</div>
			<div class="form-group">
				<label for="id-email">E-mail:</label>
				<input type="text" value="${cli.email }" id="id-email" class="form-control">
			</div>
			<div class="form-group">
				<label for="id-insc-est">Incrição Estadual:</label>
				<input type="text" value="${cli.inscricaoEstadual }" id="id-insc-est" class="form-control">
			</div>
			<br>
			<hr>
		</c:forEach>
	</div>
</body>
</html>