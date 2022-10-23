<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="AgregarSeguro.jsp" method="get">
	<h2>"Tipo de seguros de la base de datos"</h2>
	Búsqueda por tipo de Seguros:<select name="seguro"></select><input type="submit" name="btnSaludar" value="Filtrar" />
	<br>
	<table>
  <tr>
    <th scope="col">ID seguro</th>
    <th scope="col">Descripcion Seguro</th>
    <th scope="col">Descripcion tipo seguro</th>
    <th scope="col">Costo Contratación</th>
    <th scope="col">Costo Máximo asegurado</th>
  </tr>

  <tr>
    <td>Seguro1</td>
    <td>Descripcion1</td>
    <td>DescTipoSeguro1</td>
    <td>CostoContratacion1</td>
    <td>CostoMáximoAsegurado</td>
  </tr>

</table>
</form>
</body>
</html>