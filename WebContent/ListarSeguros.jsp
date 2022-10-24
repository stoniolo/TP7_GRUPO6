<%@page import="dominio.Seguro"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form method="post" action="servletSeguro">
	<select name="selectTipo"> 
		<option value="value1" selected>Seguro de casas</option>
  		<option value="value2">Seguro de vida</option>
  		<option value="value3">Seguro de motos</option>
	</select>
	<input type="submit" name="btnMostrarUsuarios" value="Mostrar seguros">
</form>

<br/>
<br/>
<br/>

<%
	ArrayList<Seguro> listaSeguros = null;
	if(request.getAttribute("listaS")!=null)
	{
		listaSeguros = (ArrayList<Seguro>) request.getAttribute("listaS");
	}
%>


<table id="table_id" class="display">
    <thead>
        <tr>
            <th>ID seguro</th>
            <th>Descripcion seguro</th>
            <th>Descripcion tipo seguro</th>
            <th>Costo contratacion</th>
            <th>Costo maximo asegurado</th>
        </tr>
    </thead>
    <tbody>
       <%
       	if(listaSeguros!=null)
       		for(Seguro seguro : listaSeguros) 
       		{
       %>
		<tr>  
		    <form name="formulario" action="servletSeguro?idSeguro=<%=seguro.getId()%>" method="get">
				<td><%=seguro.getId() %>    <input type="hidden" name="idUsuario" value="<%=seguro.getId()%>"> </td> 
				<td><%=seguro.getDescripcion() %></td>   
				<td><%=seguro.getTipo() %></td>
				<td><%=seguro.getCostoContrato() %></td>   
				<td><%=seguro.getCostoAsegurado() %></td>   
			</form> 
		</tr>
	<%  } %>
    </tbody>
</table>

</body>
</html>