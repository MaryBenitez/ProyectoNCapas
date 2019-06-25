<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div style="width:50%; margin: auto;">
	<h1 >Inserte los datos de Pelicula</h1>
		<form:form class="text-center border border-light" action="${pageContext.request.contextPath}/pelis" method="post" modelAttribute="peli">
		<form:input type="hidden" name="idPeli" path="idPelicula" value="${peli.idPelicula}" />
		<label>Ingrese un nombre : </label>
		<form:input class="form-control" type="text" name="nombre" path="nombre" value="${peli.nombre}"/>
		<label>Ingrese duracion (en minutos): </label>
		<form:input class="form-control" type="text" name="duracion" path="duracion" value="${peli.duracion}"/>
		<label>Estado: </label>
		<form:radiobutton name="estado" path="estado" value="true"/><label>Activo</label>
		<form:radiobutton name="estado" path="estado" value="false"/><label>Inactivo</label><br>
		<label>Descripcion: </label>
		<form:input class="form-control" type="text" name="descripcion" path="descripcion" value="${peli.descripcion}"/>
		<label>Imagen:</label>
		<form:input type="file" name="image" path="img" onchange="encodeImagetoBase64(this)"/>
		<input id="xd" name="xd" type="hidden">
    	<img height="300px" width="200px" id="mi_imagen" src="" alt="">
    	<input type="hidden" id="otra" name="otra" value="${peli.imgDelegate}"/>
    	<img height="300px" width="200px" src="data:image/jpeg;base64,${peli.imgDelegate}" />
		<input class="btn btn-info my-4 btn-block" type="submit" value="Actualizar">
	</form:form>
	</div>
	
	<script type="text/javascript">

   function encodeImagetoBase64(element) {

	  var file = element.files[0];

	  var reader = new FileReader();

	  reader.onloadend = function() {

	    $(".link").attr("href",reader.result);

	    $(".link").text(reader.result);

	    $("#mi_imagen").attr("src",reader.result);
	    
	    $("#xd").val(reader.result);
		
	    $("#otra").val(reader.result);
	    
	  }

	  reader.readAsDataURL(file);

	}

</script>
</body>
</html>