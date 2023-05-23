package Constructores;

public class Ejemplocarta {
	
	//ATRIBUTOS
	
	int numerodecartas;
	String palo;
	String color;
	String numero;
	String estado;
	
	//Constructor con todos los parámetros
	
	public Ejemplocarta(int numerodecartas, String palo, String color, String numero, String estado) {
		this.numerodecartas = numerodecartas;
		this.palo = palo;
		this.numero = numero;
		this.estado = estado;
	}
	
	//MÉTODOS
	
	public void echar(){
			System.out.println("Está echando la carta.");

		}
		
	public void coger(){
			System.out.println("Está cogiendo la carta.");

		}
	public void cambiar(){
			System.out.println("Está cambiando la carta.");

		}
	public void retirar(){
			System.out.println("Está retirando la carta.");

	}

	@Override
	public String toString() {
		return "Ejemplocarta [numerodecartas=" + numerodecartas + ", palo=" + palo + ", numero=" + numero + ", estado="
				+ estado + "]";
	}
	
}


