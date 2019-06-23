<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reservation</title>
</head>
<body>
	<h1>Cartelera</h1>
	<table class="table table-hover">
		<thead class="thead-dark">
		<tr>
			<th>Nombre</th>
			<th>Duracion</th>
			<th>Descripcion</th>
			
		</tr>
		</thead >
		<c:forEach items="${pelicula}" var="pelicula">
			<tr>
				<td>${pelicula.nombre}</td>
				<td>${pelicula.duracion}</td>
				<td>${pelicula.descripcion}</td>
			
			
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>