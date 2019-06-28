<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<meta charset="ISO-8859-1">
<title>main user</title>
</head>
<body style="text-align: center">
<h1 class="display-3">Usuario
	<small class="text-muted">Dashboard Usuario</small></h1>

<table class="table table-hover">
	<tr>
		<td> 
			<form action="${pageContext.request.contextPath}/cartelera">
			<input  class="btn btn-outline-dark" type="submit" value="Ver Cartelera">
		</form>
		</td>
		<td> 
			<form action="${pageContext.request.contextPath}/logout">
	<input type="hidden" name="idUsuario" id="idUsuario">
	<input class="btn btn-outline-dark" type="submit" value="Cerrar Sesion">
</form>
		</td>
		<td> 
			<form action="${pageContext.request.contextPath}/historial">
	<input type="hidden" name="idUsuario" id="idUsuario2">
	<input class="btn btn-outline-dark" type="submit" value="Ver Transacciones">
</form>
		</td>
	</tr>
</table>

</body>
<script>
	$("#idUsuario").val(localStorage.getItem("idUsuario"));
	$("#idUsuario2").val(localStorage.getItem("idUsuario"));
</script>
</html>