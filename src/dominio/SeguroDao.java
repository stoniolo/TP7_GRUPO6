package dominio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class SeguroDao {

	private String host = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String pass = "admin";
	private String dbName = "segurosgroup";


	
	public int eliminarSeguro(int id)
	{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int filas=0;
		Connection cn = null;
		try
		{
			cn = DriverManager.getConnection(host+dbName, user,pass);
			Statement st = cn.createStatement();
			String query = "delete from seguros where id="+id;
			filas=st.executeUpdate(query);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return filas;
	}

	
	public int agregarSeguro(Seguro seguro)
	{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		int filas=0;
		Connection cn = null;
		try
		{
			cn = DriverManager.getConnection(host+dbName, user,pass);
			Statement st = cn.createStatement();
			String query = "Insert into seguros(descripcion,idTipo,costoContratacion,costoAsegurado) values ('"+seguro.getDescripcion()+"','"+seguro.getTipo()+"','"+seguro.getCostoContrato()+"','"+seguro.getCostoAsegurado()+"')";
			filas=st.executeUpdate(query);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return filas;
	}
	
	public ArrayList<Seguro> obtenerSeguros() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<Seguro> lista = new ArrayList<Seguro>();
		Connection conn = null;
		try{
			conn = DriverManager.getConnection(host + dbName, user, pass);
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery("Select idSeguro,descripcion,idTipo,costoContratacion,costoAsegurado FROM seguros");
			
			while(rs.next()){
				
				Seguro seguroRs = new Seguro();
				seguroRs.setId(rs.getInt("idSeguro"));
				seguroRs.setDescripcion(rs.getString("descripcion"));
				seguroRs.setTipo(Integer.parseInt(rs.getString("idTipo")));
				seguroRs.setCostoContrato(rs.getDouble("costoContratacion"));
				seguroRs.setCostoAsegurado(rs.getDouble("costoAsegurado"));
				
				lista.add(seguroRs);
			}
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
		
		}
		
		return lista;
	}

	public ArrayList<Seguro> obtenerSeguros(Integer idTipo) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<Seguro> lista = new ArrayList<Seguro>();
		Connection conn = null;
		try{
			conn = DriverManager.getConnection(host + dbName, user, pass);
			PreparedStatement st = conn.prepareStatement("Select idSeguro,descripcion,idTipo,costoContratacion,costoAsegurado FROM seguros where idTipo = ?");
			st.setInt(1, idTipo); //Cargo el ID recibido
			ResultSet rs = st.executeQuery();
			
			while(rs.next()){
				
				Seguro seguroRs = new Seguro();
				seguroRs.setId(rs.getInt("idSeguro"));
				seguroRs.setDescripcion(rs.getString("descripcion"));
				seguroRs.setTipo(Integer.parseInt(rs.getString("idTipo")));
				seguroRs.setCostoContrato(rs.getDouble("costoContratacion"));
				seguroRs.setCostoAsegurado(rs.getDouble("costoAsegurado"));
				
				lista.add(seguroRs);
			}
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
		
		}
		
		return lista;
	}
	
	
	
	public Seguro obtenerUnSeguro(int id)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Seguro seguro = new Seguro();
		Connection con = null;
		try{
			con = DriverManager.getConnection(host + dbName, user, pass);
			PreparedStatement miSentencia = con.prepareStatement("Select * from seguros where idSeguro = ?");
			miSentencia.setInt(1, id); //Cargo el ID recibido
			ResultSet resultado = miSentencia.executeQuery();
			resultado.next();
			
			seguro.setId(resultado.getInt(1));
			seguro.setDescripcion(resultado.getString(2));
			seguro.setTipo(Integer.parseInt(resultado.getString(3)));
			seguro.setCostoContrato(resultado.getDouble(3));
			seguro.setCostoAsegurado(resultado.getDouble(3));
		    
		    con.close();
		}
		catch(Exception e)
		{
			System.out.println("Conexion fallida");
		}
		finally
		{
		}
		return seguro;
	}
	
}
