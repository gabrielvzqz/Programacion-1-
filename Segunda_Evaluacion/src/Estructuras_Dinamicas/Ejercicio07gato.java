package Estructuras_Dinamicas;

public class Ejercicio07gato implements Comparable<Ejercicio07gato> {
	private String nombre;
	private String color;
	private String raza;
	private int edad;
	
	public Ejercicio07gato() {
		nombre = "anonimo";
		color = " ";
		raza = " ";
	}

	public Ejercicio07gato(String nombre, String color, String raza, int edad) {
		this.nombre = nombre;
		this.color = color;
		this.raza = raza;
		this.edad=edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getRaza() {
		return raza;
	}

	public String getColor() {
		return color;
	}
	public int getEdad() {
		return edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}


	// ESTOS DOS METODOS LOS TENEMOS QUE ESCRIBIR NOSOTROS


	//Ordena por orden alfabetico del nombre
	
	/*public int compareTo(Ejercicio07gato g) {
		return (this.nombre).compareTo(g.getNombre());
	}*/
	//Ordena de menos a mas por edad
	
	public int compareTo(Ejercicio07gato g) {
		return this.edad-g.getEdad();
	}

	/*Odena de más a menos por edad
	 * 	public int compareTo(Ejercicio07gato g) {
		return -(this.edad-g.getEdad());
	}
	 */

	@Override
	public String toString() {
		return "Ejercicio07gato [nombre=" + nombre + ", color=" + color + ", raza=" + raza + ", edad=" + edad + "]";
	}

	public boolean equals(Ejercicio07gato g) {

		return (this.nombre).equals(g.getNombre());
	}
}