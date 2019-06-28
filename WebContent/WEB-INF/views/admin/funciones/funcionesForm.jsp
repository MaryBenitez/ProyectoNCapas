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
	<div style="width:50%; margin: auto;">
	<h1 >Datos de la Funci&oacute;n</h1>
		<form:form class="text-center border border-light" action="${pageContext.request.contextPath}/saveFuncion" method="POST" modelAttribute="funcionDTO">
			<input type="hidden" name="idFuncion" value="${funcion.idFuncion }">
			<label>Seleccione la pelicula</label><br>
			<select name="pelicula" class="form-control">
				<c:forEach items="${pelis}" var="pelis">
					<c:choose>
						<c:when test="${pelis.nombre == funcionDTO.pelicula}" >
						
							<option value="${pelis.idPelicula}" selected="selected">${pelis.nombre}</option>
						</c:when>
						<c:otherwise>
							<option value="${pelis.idPelicula}">${pelis.nombre}</option>
						
						</c:otherwise>
					</c:choose>
				</c:forEach>
			</select><br>
			<label>Ingrese la Fecha</label><br>
			<form:input class="form-control" type="date" name="fecha" path="fecha" /><br>
			<label>Ingrese la Hora</label><br>
			<form:input class="form-control" type="time" name="hora" path="hora" />
			<label>Ingrese el formato de la pelicula</label><br>
			<select name="formato" class="form-control">
				<c:forEach items="${formato}" var="formato">
					<c:choose>
						<c:when test="${formato.formato == funcionDTO.formato }" >						
							<option value="${formato.id_formato}" selected="selected">${formato.formato}</option>
						</c:when>
						<c:otherwise>
							<option value="${formato.id_formato}" >${formato.formato}</option>
							
						</c:otherwise>
					</c:choose>
					
				</c:forEach>
			</select><br>
			
			<input type="submit" class="btn btn-info my-4 btn-block" value="Guardar Función">
			
			
		</form:form>
	</div>
</body>
</html>