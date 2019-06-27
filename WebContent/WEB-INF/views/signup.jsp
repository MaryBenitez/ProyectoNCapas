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
	<h1 >Datos del Usuario</h1>
		<form:form class="text-center border border-light" action="${pageContext.request.contextPath}/agregarUser" method="POST" modelAttribute="usuario">
		<form:input type="hidden" name="idUsr" path="idUsr" value="${usuario.idUsr}"/>
		<label>Username : </label>
		<form:input class="form-control" type="text" name="usuario" path="usuario" value="${usuario.usuario}"/>
		<label>Password</label>
		<form:input class="form-control" type="password" name="pass" path="pass" value="${usuario.pass}"/>
		<label>Nombre: </label>
		<form:input class="form-control" type="text" name="nombre" path="nombre" value="${usuario.nombre}"/>
		<label>Apellido: </label>
		<form:input class="form-control" type="text" name="apellido" path="apellido" value="${usuario.apellido}"/>
		<label>Fecha de Nacimiento: </label>
		<form:input class="form-control" type="date" name="f_nacimiento" path="f_nacimiento" value="${usuario.f_nacimiento}"/>
		<label>Direccion: </label>
		<form:input class="form-control" type="text" name="direccion" path="direccion" value="${usuario.direccion}"/>
		
		<label>Pais: </label>
		<select id="select" name="select">
		<c:forEach items="${paises}" var="paises">
			<option value="${paises.idPais}">${paises.npais} </option>
		</c:forEach>
		</select>
		<label>Departamento: </label>
		<select id="select2" name="select2">
		<c:forEach items="${deps}" var="deps">
			<option value="${deps.idDept}">${deps.departamento} </option>
		</c:forEach>
		</select>
		<label>Municipio: </label>
		<select id="select3" name="select3">
		<c:forEach items="${munis}" var="munis">
			<option value="${munis.idMuni}">${munis.municipio} </option>
		</c:forEach>
		</select>
		<form:input type="hidden" name="saldo" path="saldo" value="${usuario.saldo}"/>
		<form:input type="hidden" name="iniciado" path="iniciado" value="${usuario.iniciado}"/>
		<input class="btn btn-info my-4 btn-block" type="submit" value="Actualizar">
	</form:form>
	</div>

</body>
</html>