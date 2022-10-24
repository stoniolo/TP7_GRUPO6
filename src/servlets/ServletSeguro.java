package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.Seguro;
import dominio.SeguroDao;

/**
 * Servlet implementation class servletUsuario
 */

@WebServlet("/ServletSeguro")
public class ServletSeguro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


    public ServletSeguro() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		if(request.getParameter("btnFiltrar")!=null)
		{
			Integer idTipo = null;
			switch(request.getParameter("selectTipo")) {
			case "Seguro de casas":
				idTipo = 1;
			case "Seguro de vida":
				idTipo = 2;
			case "Seguro de motos":
				idTipo = 3;
			}
			
			SeguroDao sdao = new SeguroDao();
			ArrayList<Seguro> lista= sdao.obtenerSeguros(idTipo);
			
			request.setAttribute("listaS", lista);
			
			RequestDispatcher rd = request.getRequestDispatcher("/ListarSeguros.jsp");   
	        rd.forward(request, response);
			
		}
		
		
		int filas=0;
		if(request.getParameter("btnAceptar")!=null)
		{
			
			Integer idTipo = null;
			switch(request.getParameter("selectTipo")) {
			case "Seguro de casas":
				idTipo = 1;
			case "Seguro de vida":
				idTipo = 2;
			case "Seguro de motos":
				idTipo = 3;
			}
			Seguro s  =  new Seguro();
			s.setDescripcion(request.getParameter("txtDescripcion"));
			s.setTipo(idTipo);
			s.setCostoContrato(Double.parseDouble(request.getParameter("txtCostoContrato")));
			s.setCostoAsegurado(Double.parseDouble(request.getParameter("txtCostoAsegurado")));
			
			SeguroDao sdao = new SeguroDao();
			filas=sdao.agregarSeguro(s);
			//REQUESTDISPATCHER
			request.setAttribute("cantFilas", filas);
			RequestDispatcher rd = request.getRequestDispatcher("/AgregarSeguro.jsp");   
	        rd.forward(request, response);    
			
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("btnFiltrar")!=null)
		{
			SeguroDao sdao = new SeguroDao();
			ArrayList<Seguro> lista= sdao.obtenerSeguros();
			
			request.setAttribute("listaS", lista);
			
			RequestDispatcher rd = request.getRequestDispatcher("/ListarSeguros.jsp");   
	        rd.forward(request, response);
		}
	
	}

}
