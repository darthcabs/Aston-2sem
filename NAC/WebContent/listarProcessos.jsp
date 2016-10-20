<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Processos</title>
<%@ include file="imports.jsp"%>
</head>
<body>
	<%@ include file="menu.jsp"%>
	<section class="container mainSection">
		<div class="container col-md-8 col-md-offset-2">
			<div class="page-header">
				<h1 class="text-center">Listar Processos</h1>
			</div>

			<div class="form horizontal">
				<form method="get" action="processos">
					<div class="form-group">
						<div class="form-group row">
							<label for="numeroInpt" class="col-sm-2 control-label">Número:</label>
							<div class="col-sm-10">
								<input type="text" id="numeroInpt" name="numero"
									class="form-control">
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-5 col-sm-10">
								<input type="submit" id="submitInpt" value="BUSCAR"
									class="btn btn-success">
							</div>
						</div>
					</div>
				</form>
			</div>
		</div>
		<table class="table table-striped">
			<tr>
				<th>Numero de Processo</th>
				<th>Forum</th>
				<th>Descrição</th>
				<th>Ação</th>
			</tr>
			<c:forEach var="processo" items="${lstProcessos}">
				<tr>
					<td>${processo.numero}</td>
					<td>${processo.forum.descricao }</td>
					<td>${processo.descricao}</td>
					<td><a class="btn btn-success" href="honorario">Honorários</a>
					<a class="" href="despesa">Despesas</a></td>
				</tr>
			</c:forEach>
		</table>
		<c:if test="${not empty mensagem}">
				<div class="alert alert-info">${mensagem}</div>
			</c:if>
	</section>
	
	<%@ include file="footer.jsp" %>
</body>
</html>