<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

</head>
<body>

	<form action="" method="post">
		<label>Seleccione un horario:</label><br>
		<c:forEach items="${funciones}" var="funciones">
			<input type=radio name="horas" value="${funciones.hora }">
			<label>${funciones.hora}</label><br>
		</c:forEach>
		<select>
			<c:forEach items="${formato}" var="formato">
				<option value="${formato.id_formato}">${formato.formato}</option><br>
			</c:forEach>
		</select><br>
		<label>Desea utilizar su saldo?</label>
		<input type="checkbox" name="is" id="is" value="true" >
		<input type="text" name="saldo" id="saldo" disabled ><br>
		<script>
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
		<label>Asientos Disponibles: </label><br>
		<label>Cantidad de asientos</label>
		<input type="number" name="cAsientos" >
	</form>
	
</body>
</html>