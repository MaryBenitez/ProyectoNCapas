<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
      
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

</head>
<body>

		<h1 class="display-3">Seleccione un horario:</h1><br>
		<table class="table table-hover">
		<tr class="table-light bg-info">
			<th>Accion</th>
			<th>Fecha</th>
			<th>Hora </th>
			<th>Asientos Disponibles </th>
			<th>Formato </th>
		
			<th> </th>
			
		</tr>
		<c:forEach items="${funciones}" var="funciones">
				<tr>
					<td>
					<form action="${pageContext.request.contextPath}/reserva2" method="post">
						<input type="hidden" value="${funciones.idFuncion}" name="idFuncion">
						<input class="btn btn-outline-dark" type="submit" value="Editar">
					</form>
				
					</td>
					<td>${funciones.fecha}</td>
					<td>${funciones.hora}</td>
					<td>${funciones.casientoe}</td>
					<td>${funciones.formato.formato}</td>
					
				</tr>	
			</c:forEach>
		
	</table>

		
	<%-- 	<table>
		
		<c:forEach items="${peli}" var="peli">
		
				<form:input type="hidden" path="idFuncion" value="${peli.idFuncion }"/>
				<form:radiobutton name="hora" path="hora" value="${peli.idFuncion}" />
				<form:input type="hidden" name="fecha" path="fecha" value="${peli.fecha}" />
				<label>${peli.hora}</label>
				<label>Asientos Especiales Disponibles: ${peli.casientoe}</label><br>
				<label style="padding-left:4em;">Asientos Normales Disponibles: ${peli.casienton}</label>
				<label style="padding-left:4em;">Formato: ${peli.formato.formato}</label><br>
				
		
		</c:forEach>
	
		</table> --%>
		<%-- <label>Desea utilizar su saldo?</label>
		<input type="checkbox" name="is" id="is" >
		<input type="text" name="saldo" id="saldo" disabled ><br>
		<script>
				localStorage.getItem("idUsuario");
				$( function() {
				    $("#is").change( function() {
				        if ($(this).prop("checked")) {
				            $("#saldo").prop("disabled", false);
				        } else {
				            $("#saldo").prop("disabled", true);
				            $("#saldo").val('');
				        }
				    });
				});
		</script>
		<input type="hidden" name="idUsuario" id="idUsuario">
		<script>
			$("#idUsuario").val(localStorage.getItem("idUsuario"));
		</script>
		<label id="label">Cantidad de Asientos</label>
		<input type="number" name="asE" id="asE"><br>
		<input type="submit" value="Reservar">
		

	</form:form> --%>
	
</body>
</html>