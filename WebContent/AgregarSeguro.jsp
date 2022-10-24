<%@page import="dominio.SeguroDao"%>
<%@page import="dominio.Seguro"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Agregar seguros</h1>

<form action="servletSeguro" method="get">
	Id seguro: <input type="text" name="txtId" readonly> <br>
	Descripcion:  <input type="text" name="txtDescripcion"> <br>
	Tipo: <select name="selectTipo"> 
		<option value="value1" selected>Seguro de casas</option>
  		<option value="value2">Seguro de vida</option>
  		<option value="value3">Seguro de motos</option>
	</select> <br>
	Costo de contratacion: <input type="text" name="txtCostoContrato" > <br>
	Costo max. asegurado:  <input type="text" name="txtCostoAsegurado"> <br>
	<input type="submit" value="Aceptar" name="btnAceptar">
</form>

<%
	int filas=0;
	if(request.getAttribute("cantFilas")!=null)
		filas= (int)request.getAttribute("cantFilas");

%>


<% if(filas==1) 
	{
%>
		Seguro agregado con éxito
<%} %>

</body>
</html>