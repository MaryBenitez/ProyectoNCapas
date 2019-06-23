<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reservation</title>
</head>
<body>
	<h1>Cartelera</h1>
	<table class="table table-hover" border="1">
		
		<c:forEach items="${pelicula}" var="pelicula">
			<tr>
				<td height="300px" width="200px">${pelicula.nombre}
				<!-- <img src="data:image/png;base64,${imagen}" /></td> -->
				<img height="300px" width="200px" src="data:image/jpeg;base64,${imagen}" /></td>
				

			</tr>
		</c:forEach>
	</table>
	
</body>
</html>