package dominio;

public class Seguro {

	private int id;
	private String descripcion;
	private Integer tipo;
	private double costoContrato;
	private double costoAsegurado;
	
	public Seguro()
	{}

	public Seguro(int id, String descripcion, Integer tipo, double costoContrato, double costoAsegurado) {
		this.id = id;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.costoContrato = costoContrato;
		this.costoAsegurado = costoAsegurado;
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

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
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
