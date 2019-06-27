<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
      
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>

</head>
<body>
	<h1>Reserva</h1>
	<form:form action="${pageContext.request.contextPath}/addReserva" method="post" modelAttribute="reservaDTO">
	<label>${funcion.casientoe}</label><br>
	<label>${funcion.formato.formato}</label><br>
	<label>${funcion.hora}</label><br>
	<label>Cantidad de Asientos: </label>
	<form:input type="hidden" name="fecha" path="fecha" value="${funcion.fecha}" />
	
	<form:input type="text" id="asiento" name="asiento" path="asiento" /><br>
	<script>
		function check(){
			var n = document.getElementById("asiento").value;
			if (n > 15){
				swal("No puede reservar mas de 15 asientos", {
		 	    	icon: "error",
 		   		});
				}
			}
	</script>
	<label>Desea utilizar su saldo?</label>
		<input type="checkbox" name="is" id="is" ><br>
		<label>Ingrese cantidad:</label>
		<form:input type="text" name="saldo" id="saldo" path="saldo" disabled="true"/><br>
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
		<form:input type="hidden" name="idUsuario" path="idUsuario" id="idUsuario"/>
		<script>
			$("#idUsuario").val(localStorage.getItem("idUsuario"));
		</script>
		<form:input type="hidden" name="idFuncion" path="idFuncion" value="${funcion.idFuncion}" />
	<input type="submit" value="Reservar">
	</form:form>
	
</body>
</html>