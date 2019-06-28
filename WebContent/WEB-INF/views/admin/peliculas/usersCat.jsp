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
<body style="text-align: center">
<div>
<h1 class="display-3">Usuarios
	<small style="text-align:center;"class="text-muted">Modulo Administrador</small></h1>
	</div>
	<table style="text-align:center;" class="table table-hover">
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
					<form action="${pageContext.request.contextPath}/updateUser" method="post">
						<input type="hidden" value="${usuarios.idUsr}" name="codigoP">
						<input class="btn btn-outline-dark" type="submit" value="Editar">
					</form>
						<c:if test="${usuarios.estado == false}">
							<form action="${pageContext.request.contextPath}/statusUsr" method="post">
								<input type="hidden" value="${usuarios.idUsr}" name="codigo">
								<input type="hidden" value="" name="coment">
								<input class="btn btn-outline-dark" type="submit" value="Activar">
							</form>
						</c:if>
						<c:if test	="${usuarios.estado == true}">
							<form action="${pageContext.request.contextPath}/comment" method="post">
								<input type="hidden" value="${usuarios.idUsr}" name="codigoP">
								<input class="btn btn-outline-dark" type="submit" value="Desactivar">
							</form>
						</c:if>
					
					</td>
					<td>${usuarios.usuario}</td>
					<td>${usuarios.nombre}</td>
					<td>${usuarios.direccion}</td>
					<td>${usuarios.saldo}</td>
					<td>${usuarios.estadoDelegate}</td>
					<td>${usuarios.tipoDelegate}</td>
					<td>${usuarios.comentario}</td>
					<td>${usuarios.iniciadoDelegate}</td>
				</tr>	
			</c:forEach>
	</table>
</body>
</html>