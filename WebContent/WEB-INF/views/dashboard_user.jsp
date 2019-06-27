<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>login xd</h1>
<p>DASHBOARD</p>


<form action="${pageContext.request.contextPath}/cartelera">
	<input type="submit" value="Ver Cartelera">
</form>
<form action="${pageContext.request.contextPath}/logout">
	<input type="hidden" name="idUsuario" id="idUsuario">
	<input type="submit" value="Cerrar Sesion">
</form>

</body>
<script>
	$("#idUsuario").val(localStorage.getItem("idUsuario"));
</script>
</html>