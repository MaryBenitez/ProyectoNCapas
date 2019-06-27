<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reservation</title>

<style>
	.container{
		display:grid;
		grid-template-columns:repeat(3, 33%);
		grid-row-gap:3em;
	}
	.container2{
		margin: 0 auto;
	}
	span, input{
		display:block;
		text-align:center;
		font-weight:bold;
		margin: 0 auto;
	}
	
</style>

</head>
<body>
	<h1>Cartelera</h1>
	<%-- <table class="table table-hover" border="1">
		
		<c:forEach items="${pelicula}" var="pelicula">
			<tr>
				<td height="300px" width="200px">${pelicula.nombre}
				<!-- <img src="data:image/png;base64,${imagen}" /></td> -->
				<img height="300px" width="200px" src="data:image/jpeg;base64,${pelicula.imgDelegate}" />
				<form action="${pageContext.request.contextPath}/reserva" method="post">
					<input type="submit" value="Reservar">
				</form>
				</td>
			</tr>
		</c:forEach>
	</table> --%>
	<div class='container'>
	<c:forEach items="${pelicula}" var="pelicula">
				<!-- <img src="data:image/png;base64,${imagen}" /></td> -->
				<div class="container2">
				<span>${pelicula.nombre}</span>
				<br>
				<img height="300px" width="200px" src="data:image/jpeg;base64,${pelicula.imgDelegate}" />
				<form action="${pageContext.request.contextPath}/reserva" method="post">
					<input type="hidden" value="${pelicula.idPelicula }" name="idPeli">
					<input type="submit" value="Reservar">
				</form>
				</div>
		</c:forEach>
	</div>
</body>
</html>