<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>

<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1 class="display-3">Catalogo de peliculas
	<small class="text-muted">Modulo Administrador</small></h1>
	<table class="table table-hover">
		<tr class="table-light bg-info">
			<th>Accion</th>
			<th>Fecha</th>
			<th>Hora </th>
			<th>Pelicula </th>
			<th>Formato </th>
			<th>Estado </th>
		
			<th> </th>
			<th><form action="${pageContext.request.contextPath}/addFuncion" method = "post">
			<input class="btn btn-outline-dark" type="submit" value="Agregar Funcion">
			</form> </th>
		</tr>
		<c:forEach items="${funciones}" var="funciones">
				<tr>
					<td>
					<form action="${pageContext.request.contextPath}/funUpdate" method="post">
						<%-- <input type="hidden" value="${funciones.idFuncion}" name="codigoP"> --%>
						<input class="btn btn-outline-dark" type="submit" value="Editar">
					</form>
					<form action="${pageContext.request.contextPath}/funStatus" method="post">
						<input type="hidden" value="${pelis.idPelicula}" name="codigoP">
						 <c:if test="${funciones.activo == false}">
							<input class="btn btn-outline-dark" type="submit" value="Activar">
						</c:if>
						<c:if test="${funciones.activo == true}">
							<input class="btn btn-outline-dark" type="submit" value="Desactivar">
						</c:if> 
					</form>
					</td>
					<td>${funciones.fecha}</td>
					<td>${funciones.hora}</td>
					<td>${funciones.pelicula}</td>
					<td>${funciones.formato}</td>
					<td>${funciones.activoDelegate}</td>
				
				</tr>	
			</c:forEach>
		
	</table>

</body>
</html>