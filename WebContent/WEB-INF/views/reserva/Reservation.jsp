<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
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
<body style="text-align: center">
	<h1 class="display-3">Cartelera</h1>

	<div class='container'>
	<c:forEach items="${pelicula}" var="pelicula">
				<!-- <img src="data:image/png;base64,${imagen}" /></td> -->
				<div class="container2">
				<span>${pelicula.nombre}</span>
				<br>
				<img height="300px" width="200px" src="data:image/jpeg;base64,${pelicula.imgDelegate}" />
				<br><br>
				<form action="${pageContext.request.contextPath}/reserva" method="post">
					<input type="hidden" value="${pelicula.idPelicula }" name="idPeli">
					
					<input class="btn btn-outline-dark" style="width:200px;" type="submit" value="Reservar">
				</form>
				</div>
		</c:forEach>
	</div>
</body>
</html>