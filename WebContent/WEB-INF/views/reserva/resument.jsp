<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Resumen de Transacci&oacute;n</h1>
	<label>Pelicula: </label>
	<label>${funcion.pelicula.nombre}</label>
	<label>Horario: </label>
	<label>${funcion.hora}</label>
	<label>Asientos Seleccionados: </label>
	<label>${asiento}</label>
	<label>Subtotal: </label>
	<label>${reserva.subTotal}</label>
	<label>Saldo a utilizar: </label>
	<label>${x}</label>
	<label>Saldo Actual: </label>
	<label>${reserva.tCuenta}</label>
	<label>Gran Total: </label>
	<label>${reserva.granTotal}</label>
	
	
</body>
</html>