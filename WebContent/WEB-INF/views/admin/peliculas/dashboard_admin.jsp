<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<style type="text/css">
	.padre{
		display: flex;
		justify-content: center;
	}
	.hijo{
		padding: 10px;
		margin: 200px;
		display: incline-block;
	}
</style>
</head>
<body style="text-align: center">
<div class="padre">
<div class="hijo">
<h1 class="display-3">Administrador
	<small class="text-muted">Dashboard Administrador</small></h1>

<table class="table table-hover">
	<tr>
		<td> 
			<form action="${pageContext.request.contextPath}/adminMovies" method="post">
				<input class="btn btn-outline-dark" type="submit" value="Administrar Peliculas">
			</form>
		</td>
		<td> 
			<form action="${pageContext.request.contextPath}/adminUsers" method="post">
			<input class="btn btn-outline-dark" type="submit" value="Administrar Usuarios">
			</form>
		</td>
		<td> 
			<form action="${pageContext.request.contextPath}/adminFunciones" method="post">
			<input class="btn btn-outline-dark" type="submit" value="Administrar Funciones">
			</form>
		</td>
		<%-- <td> 
			<form action="${pageContext.request.contextPath}/logout" method="post">
			<input type="hidden" name="idUsuario" id="idUsuario">
			<input class="btn btn-outline-dark" type="submit" value="Cerrar Sesión">
			</form>
		</td> --%>
	</tr>
</table>
	
</div>
</div>
</body>
<script>
	$("#idUsuario").val(localStorage.getItem("idUsuario"));
	
</script>
</html>