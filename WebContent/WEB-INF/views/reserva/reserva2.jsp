<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
      
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  	<script src="https://cdn.jsdelivr.net/npm/sweetalert2@8"></script>

</head>
<body>
<div style="width:50%; margin: auto;">
	<h1>Reserva</h1>
	<form:form id="target" class="text-center border border-light" action="${pageContext.request.contextPath}/addReserva" method="post" modelAttribute="reservaDTO">
	<label style="font-weight:bold;">Asientos Disponibles: </label>
	<label>${funcion.casientoe}</label><br>
	<label style="font-weight:bold;">Formato:</label>
	<label>${funcion.formato.formato}</label><br>
	<label style="font-weight:bold;">Hora de la Funcion:</label>
	<label>${funcion.hora}</label><br>
	<label style="font-weight:bold;">Cantidad de Asientos: </label>
	<form:input type="hidden" name="fecha" path="fecha" value="${funcion.fecha}" />
	
	<form:input class="form-control" type="text" id="asiento" name="asiento" path="asiento"/><br>
	<label>Desea utilizar su saldo?</label>
		
		<input type="checkbox" name="is" id="is" ><br>
		<label>Ingrese cantidad:</label>
		<form:input class="form-control" type="text" name="saldo" id="saldo" path="saldo" value="0" /><br>
		<script>
				localStorage.getItem("idUsuario");
				$( function() {
				    $("#is").change( function() {
				        if ($(this).prop("checked")) {
				            $("#saldo").prop("disabled", false);
				        } else {
				            $("#saldo").prop("disabled", true);
				            $("#saldo").val('0');
				        }
				    });
				});
		</script>
		<form:input type="hidden" name="idUsuario" path="idUsuario" id="idUsuario"/>
		<script>
			$("#idUsuario").val(localStorage.getItem("idUsuario"));
		</script>
		<form:input type="hidden" name="idFuncion" path="idFuncion" value="${funcion.idFuncion}" />
	<input  class="btn btn-info my-4 btn-block" type="submit" value="Reservar">
	</form:form>
</div>
	
</body>
	<script>
		function check(){
			/* var n = document.getElementById("asiento").value;
			if (n > 15){
				
					Swal.fire({
						  title: 'Warning',
						  text: 'No se puede reservar mas de 15 asientos',
						  type: 'warning',
						  confirmButtonText: 'Ok',
						 
						});
				}
			} */
			$( "#target" ).submit(function( event ) {
				var n = document.getElementById("asiento").value;
				if (n > 15){
					
						Swal.fire({
							  title: 'Warning',
							  text: 'No se puede reservar mas de 15 asientos',
							  type: 'warning',
							  confirmButtonText: 'Ok',
							 
							});
					}
				});
	</script>
</html>