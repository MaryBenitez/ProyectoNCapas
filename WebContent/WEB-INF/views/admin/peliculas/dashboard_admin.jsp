<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>
<h1>login xd</h1>
<p>PAGINA ADMINISTRADOR</p>

<table>
	<tr>
		<td> 
			<form action="${pageContext.request.contextPath}/adminMovies" method="post">
				<input class="btn btn-outline-dark" type="submit" value="Administrar Peliculas">
			</form>
		</td>
		<td> 
			<form action="${pageContext.request.contextPath}/adminUsers" method="post">
			<input class="btn btn-outline-dark" type="submit" value="Administrar Usuarios">
			</form>
		</td>
		<td> 
			<form action="${pageContext.request.contextPath}/adminFunciones" method="post">
			<input class="btn btn-outline-dark" type="submit" value="Administrar Funciones">
			</form>
		</td>
	</tr>
</table>
	

</body>
</html>