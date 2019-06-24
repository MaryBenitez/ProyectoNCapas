<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div style="width:50%; margin: auto;">
	<h1 >Inserte los datos de Pelicula</h1>
		<form:form class="text-center border border-light" action="${pageContext.request.contextPath}/savePeli2" method="POST" modelAttribute="peli">
		<form:input type="hidden" name="idPeli" path="idPelicula" value="${peli.idPelicula}" />
		<label>Ingrese un nombre : </label>
		<form:input class="form-control" type="text" name="nombre" path="nombre" value="${peli.nombre}"/>
		<label>Ingrese duracion (en minutos): </label>
		<form:input class="form-control" type="text" name="duracion" path="duracion" value="${peli.duracion}"/>
		<label>Estado: </label>
		<form:radiobutton name="estado" path="estado" value="true"/><label>Activo</label>
		<form:radiobutton name="estado" path="estado" value="false"/><label>Inactivo</label><br>
		<label>Descripcion: </label>
		<form:input class="form-control" type="text" name="descripcion" path="descripcion" value="${peli.descripcion}"/>
		<input class="btn btn-info my-4 btn-block" type="submit" value="Actualizar">
	</form:form>
	</div>
</body>
</html>