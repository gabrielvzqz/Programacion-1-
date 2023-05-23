package Constructores;

public class Prueba {

	String nombre;
	
	public Prueba(String n) {
		this.nombre=n;
	}
	public void primero() {
		System.out.println("Has llamado al método primero.");
	}
	public void segundo() {
		System.out.println("Primera llamada.");
		primero();
		System.out.println("Segunda llamada");
		this.primero();
	}
	public static void main(String[] args) {
		
		//testeo de la clase prueba
		Prueba p= new Prueba("Estamos creando un objeto para llamar a los métodos.");
		//llamamos al segundo y comprobamos
		p.segundo();
	}
}
