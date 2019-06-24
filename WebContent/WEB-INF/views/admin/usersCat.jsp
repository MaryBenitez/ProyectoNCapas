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
<h1 class="display-3">Usuarios
	<small class="text-muted">Modulo Administrador</small></h1>
	<table class="table table-hover">
		<tr class="table-light bg-info">
			<th>Accion</th>
			<th>Usuario</th>
			<th>Nombre </th>
			<th>Direccion </th>
			<th>Saldo</th>
			<th>Estado</th>
			<th>Tipo</th>
			<th>Comentario</th>
			<th>Sesion</th>
			<th> </th>
			<th><form action="${pageContext.request.contextPath}/addUser" method = "post">
			<input class="btn btn-outline-dark" type="submit" value="Agregar Usuario">
			</form> </th>
		</tr>
			<c:forEach items="${usuarios}" var="usuarios">
				<tr>
					<td>
					<form action="${pageContext.request.contextPath}/updateUsr" method="post">
						<input type="hidden" value="${usuarios.idUsr}" name="codigoP">
						<input class="btn btn-outline-dark" type="submit" value="Editar">
					</form>
					<form action="${pageContext.request.contextPath}/statusUsr" method="post">
						<input type="hidden" value="${usuarios.idUsr}" name="codigoP">
						<c:if test="${usuarios.estado == false}">
							<input class="btn btn-outline-dark" type="submit" value="Activar">
						</c:if>
						<c:if test="${usuarios.estado == true}">
							<input class="btn btn-outline-dark" type="submit" value="Desactivar">
						</c:if>
					</form>
					</td>
					<td>${usuarios.usuario}</td>
					<td>${usuarios.nombre}</td>
					<td>${usuarios.direccion}</td>
					<td>${usuarios.saldo}</td>
					<td>${usuarios.estado}</td>
					<td>${usuarios.tipo}</td>
					<td>${usuarios.comentario}</td>
					<td>${usuarios.iniciado}</td>
				</tr>	
			</c:forEach>
	</table>
</body>
</html>