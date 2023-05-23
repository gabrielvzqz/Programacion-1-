package Constructores;

public class Ejemplo1 {
	
	String nombre;
	
	Ejemplo1(String nombre){
		this.nombre=nombre;
	}
	public void mostrarSaludo() {
		System.out.println("Hola " + getNombre().toUpperCase());
	}
	public String getNombre() {
		
		return this.nombre;
	}
}