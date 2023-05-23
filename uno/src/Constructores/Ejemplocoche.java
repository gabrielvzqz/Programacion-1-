package Constructores;

public class Ejemplocoche {

	//ATRIBUTOS
	int numero_ruedas;
	String color;
	String marca;
	String modelo;
	int numero_de_puertas;
	double consumo;
	int potencia;
	
	//Constructor con todos los parámetros
	public Ejemplocoche() {
		
	}
	
	public Ejemplocoche(int numero_ruedas, String color, String marca, String modelo, int numero_de_puertas,
			double consumo, int potencia) {
		this.numero_ruedas = numero_ruedas;
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.numero_de_puertas = numero_de_puertas;
		this.consumo = consumo;
		this.potencia = potencia;
	}
	
	//Métodos
	
	public void arrancar() {
		System.out.println("Está arrancando.");
	}

	public void frenar() {
		System.out.println("Está frenando.");
	}
	public void acelerar() {
		System.out.println("Está acelerando.");
	}
	public void acelerar(int c) {
		System.out.println("Has acelerado.");
	}
	public void pasarITV() {
		System.out.println("Rezar mucho.");
	}
	
		
	
		@Override
	public String toString() {
		return "Ejemplocoche [numero_ruedas=" + numero_ruedas + ", color=" + color + ", marca=" + marca + ", modelo="
				+ modelo + ", numero_de_puertas=" + numero_de_puertas + ", consumo=" + consumo + ", potencia="
				+ potencia + "]";
		
	}
}