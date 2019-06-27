<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>login xd</h1>
	<form id="login">
	<input type="text" name="user" placeholder="Usuario">
	<input type="password" name="pass" placeholder="Contraseña">
	<input type="submit" value="Iniciar Sesión">
	</form>
	<script type='text/javascript'>
		
	   	$("#login").on('submit', function (e) {
			e.preventDefault();
			$.ajax(
				{
					url: "${pageContext.request.contextPath}/login",
					data:  $("#login").serialize(),
					type: 'POST', 
					success: function (result) {
						console.log(result);
						localStorage.setItem("idUsuario",result);
						location.href = "${pageContext.request.contextPath}/cartelera"
					},
					error: function (result) {
						swal("Usuario o contraseña inválido", {
				 	    	icon: "error",
		 		   		});
					}
				});
		});
    </script>
</body>
</html>