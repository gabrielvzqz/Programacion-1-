package Ejemplos2;

public class Periodico extends Publicacion {

	// atributos
	public String Nombre;
	public String Fecha;
	
	public Periodico() {
		super();
	}
	public Periodico(int ndp, float p, String nombre, String fecha) {
		super(ndp,p);
		Nombre = nombre;
		Fecha = fecha;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getFecha() {
		return Fecha;
	}
	public void setFecha(String fecha) {
		Fecha = fecha;
	}
	@Override
	public String toString() {
		return "Periodico [Nombre=" + Nombre + ", Fecha=" + Fecha + ", Precio=" + Precio + "]";
	}
	

}
