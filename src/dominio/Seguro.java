package dominio;

public class Seguro {

	private int id;
	private String descripcion;
	private String tipo;
	private double costoContrato;
	private double costoAsegurado;
	private static int cont=1;
	
	public Seguro()
	{}

	public Seguro(String descripcion, String tipo, double costoContrato, double costoAsegurado) {
		this.id = cont;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.costoContrato = costoContrato;
		this.costoAsegurado = costoAsegurado;
		cont++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getCostoContrato() {
		return costoContrato;
	}

	public void setCostoContrato(double costoContrato) {
		this.costoContrato = costoContrato;
	}

	public double getCostoAsegurado() {
		return costoAsegurado;
	}

	public void setCostoAsegurado(double costoAsegurado) {
		this.costoAsegurado = costoAsegurado;
	}

	@Override
	public String toString() {
		return "Seguro [id=" + id + ", descripcion=" + descripcion + ", tipo=" + tipo + ", costoContrato="
				+ costoContrato + ", costoAsegurado=" + costoAsegurado + "]";
	}
	
	
}
