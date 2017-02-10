<%-- 
    Document   : listaLivros
    Created on : 09/02/2017, 13:20:47
    Author     : Bruno
--%>

<%@page import="teste.pratico.entities.Livro"%>
<%@page import="teste.pratico.interfaces.LivroHibernateDAO"%>
<%@page import="teste.pratico.persistencia.LivroHibernateDAOImpl"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Listar Livros</title>
<style>
body {
	background-image: url("IMG/background.jpg");
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="icon" type="image/png" href="ICON/livro.png" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#"><img src="ICON/livro.png"
					alt="Books 2.0" width="30" height="30"></a>
			</div>
			<ul class="nav navbar-nav">
				<li><a href="index.html">Home</a></li>
				<li><a href="cadastraLivro.html">Cadastrar Livro</a></li>
				<li class="active"><a href="#">Listar Livros</a></li>
			</ul>
		</div>
	</nav>
	<div class="container-fluid">
		<h1>Livros</h1>
		<%
			LivroHibernateDAO livroDAO = new LivroHibernateDAOImpl();
			List<Livro> livros = livroDAO.listaTodosLivros();
		%>
		<table class="table table-bordered">
			<thead>
				<tr class="info">
					<th>NOME</th>
					<th>QUANTIDADE DE PÁGINAS</th>
					<th>TEMA</th>
				</tr>
			</thead>
			<%
				for (Livro l : livros) {
			%>
			<tbody>
				<tr class="active">
					<td><%=l.getNomeLivro()%></td>
					<td><%=l.getQuantPags()%></td>
					<td><%=l.getTemaLivro()%></td>
				</tr>
			</tbody>
			<%
				}
			%>
		</table>
	</div>
</body>
</html>
