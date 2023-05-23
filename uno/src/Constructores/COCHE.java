package Constructores;

import java.util.Scanner;
/*8. Crea la clase coche con dos constructores. Uno no toma parámetros y eñl otro sí.
 * Los dos constructores inicializarán los atributos marca y modelo de la clase.
 * Crea dos objetos (cada objeto llama a un constructor distinto) y verifica
 * que todo funcioa correctamente*/
public class COCHE {
	//atributos
	String marca;
	String modelo;
	
	COCHE(){
		this.marca="";
		this.modelo="";
		
	}
	COCHE(String mar, String mod){
		this.marca=mar;
		this.modelo=mod;
	}
	

	@Override
	public String toString() {
		return "COCHE [marca=" + marca + ", modelo=" + modelo + "]";
	}
	public static void main(String[] args) {
		String marca, modelo;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿De que marca es el coche? ");
		marca=sc.nextLine();
		System.out.println("¿Que modelo es el coche? ");
		modelo=sc.nextLine();
		
		COCHE vacio= new COCHE();
		COCHE lleno= new COCHE(marca, modelo);
		System.out.println(vacio.toString());
		System.out.println(lleno.toString());
		sc.close();

	}

}
