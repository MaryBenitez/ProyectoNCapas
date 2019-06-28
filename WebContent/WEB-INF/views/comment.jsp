<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<title>Insert title here</title>
</head>
<body>
	<div class="form-group">
	<form action="${pageContext.request.contextPath}/statusUsr">
		<input type="hidden" name="codigo" value="${codigo}">
    	<label for="exampleFormControlTextarea1">Motivo de la desactivaci&oacute;n</label>
    	<textarea class="form-control" id="exampleFormControlTextarea1" rows="3" name="coment"></textarea>
    	<input type="submit" value="Enviar">
	</form>
  </div>
</body>
</html>