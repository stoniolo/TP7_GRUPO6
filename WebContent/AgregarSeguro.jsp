<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AgregarSeguro</title>
</head>
<body>

<form action="AgregarSeguro.jsp" method="get">
	<h1>Agregar Seguros</h1>
	Id Seguro:
	<br>
	Descripción <input type="text" name="txtDescripcion">
	<br>
	Tipo de seguro <select name="seguro"></select>
	<br>
	Costo Contratación <input type="text" name="txtCostoContratacion">
	<br>
	Costo Maximo Asegurado <input type="text" name="txtCostoMaximoAsegurado" >
	<br>
	<input type="submit" name="btnSaludar" value="Aceptar" />

</form>

</body>
</html>