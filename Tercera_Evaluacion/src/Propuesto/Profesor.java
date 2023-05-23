package Propuesto;

public class Profesor extends Persona {

	protected String departamento;
	protected String categoria;

	public Profesor(String nombre, String direccion, String departamento, String categoria) {
		super(nombre, direccion);
		this.departamento = departamento;
		this.categoria = categoria;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
