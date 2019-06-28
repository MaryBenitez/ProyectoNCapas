<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.padre{
		display: flex;
		justify-content: center;
		
	}
	.hijo{
		padding: 10px;
		margin: 200px;
		display: incline-block;
		border-style:solid;
		border-radius:10px;
		padding:30px;
	}
</style>
</head>
<body>
<div class="padre">
	<div class="hijo">
		<h1>Resumen de Transacci&oacute;n</h1>
			<label>Pelicula: </label>
			<label>${funcion.pelicula.nombre}</label><br>
			<label>Horario: </label>
			<label>${funcion.hora}</label><br>
			<label>Asientos Seleccionados: </label>
			<label>${asiento}</label><br>
			<label>Subtotal: </label>
			<label>${reserva.subTotal}</label><br>
			<label>Saldo a utilizar: </label>
			<label>${x}</label><br>
			<label>Saldo Actual: </label>
			<label>${reserva.tCuenta}</label><br>
			<label>Gran Total: </label>
			<label>${reserva.granTotal}</label>
	</div>
</div>
	
	
</body>
</html>