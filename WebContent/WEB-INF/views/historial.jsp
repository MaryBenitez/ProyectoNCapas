<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

<meta charset="UTF-8">
<style>
body{
	margin: 0px;
}
</style>
<title>Insert title here</title>
</head>
<body>
	<div style="width:75%; margin: auto;">
	<h1 class="display-3">Historial</h1>
	<form  action="${pageContext.request.contextPath}/filtro" method="POST">
		<input type="hidden" name="cu" id="idUsuario">
		<label>Fecha Inicio: </label>
		<input id="fechaI" class="form-control" type="date" name="fechaI" required/><br>
		
		<label>Fecha Fin: </label>
		<input id="fechaF" class="form-control" type="date" name="fechaF" required/><br>
				
		<input type="submit" value="Buscar" class="btn btn-outline-dark"><br> 
	</form>
	
	</div><br><br>	
	<div class="table-responsive center">          
  		<table class="table table-hover">
    		<thead>
      			<tr>
        			<th>Acción</th>
        			<th>Número Transacción</th>
        			<th>Fecha Transacción</th>
      			</tr>
    		</thead>
    	<tbody>
        		<c:forEach items="${reserva}" var="reserva">
        			<tr>
        			<td>
  						<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#${reserva.idReserva}">Ver Detalle</button>
        				</td>	
        				<td>0000000${reserva.idReserva}</td>
        				<td>${reserva.fecha}</td>
        			</tr>
        			
        			
        			<div class="modal fade" id="${reserva.idReserva}" role="dialog" aria-hidden="true" tabindex="-1">
        					<div class="modal-dialog" role="document">
        						<div class="modal-content">
        							<button type="button" class="close" data-dismiss="modal" aria-label="Close">
        								<span aria-hidden="true">&times;</span>
        							</button>
        							<div class="card">
									<div class="center">
									<h1>Detalle</h1>
        						 	<label>Nombre pelicula: ${reserva.funcion.pelicula.nombre}</label><br>
									<label>Asientos: ${reserva.aCantidad} </label><br> 
							
									</div>
									</div>
								</div>
							</div>
						</div>
        		</c:forEach>
    	</tbody>
  		</table>
  	</div>
</body>
		<script>
			$("#idUsuario").val(localStorage.getItem("idUsuario"));
		</script>	
</html>