package Constructores;

public class Ejemplo2 {
	
	String nombre;
	
	Ejemplo2(String nombre){
		this.nombre=nombre;
	}
	public void mostrarDespedida() {
		System.out.println("Adios " + getNombre().toUpperCase());
	}
	public String getNombre() {
		
		return this.nombre;
	}
}