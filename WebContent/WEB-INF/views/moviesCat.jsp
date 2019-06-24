<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>
<h1 class="display-3">Catalogo de peliculas
	<small class="text-muted">Modulo Administrador</small></h1>
	<table class="table table-hover">
		<tr class="table-light bg-info">
			<th>Accion</th>
			<th>Nombre Pelicula</th>
			<th>Duracion </th>
			<th>Descripcion </th>
			<th>Estado </th>
			<th>Poster</th>
			<th> </th>
			<th><form action="${pageContext.request.contextPath}/addPeli" method = "post">
			<input class="btn btn-outline-dark" type="submit" value="Agregar Pelicula">
			</form> </th>
		</tr>
			<c:forEach items="${pelis}" var="pelis">
				<tr>
					<td>
					<form action="${pageContext.request.contextPath}/peliUpdate" method="post">
						<input type="hidden" value="${pelis.idPelicula}" name="codigoP">
						<input class="btn btn-outline-dark" type="submit" value="Editar">
					</form>
					<form action="${pageContext.request.contextPath}/peliStatus" method="post">
						<input type="hidden" value="${pelis.idPelicula}" name="codigoP">
						<c:if test="${pelis.estado == false}">
							<input class="btn btn-outline-dark" type="submit" value="Activar">
						</c:if>
						<c:if test="${pelis.estado == true}">
							<input class="btn btn-outline-dark" type="submit" value="Desactivar">
						</c:if>
					</form>
					</td>
					<td>${pelis.nombre}</td>
					<td>${pelis.duracion}</td>
					<td>${pelis.descripcion}</td>
					<td>${pelis.activoDelegate}</td>
					<td><img height="300px" width="200px" src="data:image/jpeg;base64,${pelis.imgDelegate}" /></td>
				</tr>	
			</c:forEach>
	</table>
</body>
</html>