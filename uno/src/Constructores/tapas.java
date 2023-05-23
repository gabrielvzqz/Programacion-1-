package Constructores;

import java.util.Scanner;

public class tapas {

	public static double numeroClientes(double patatasbravas, double chocos) {
		
		double numeroClientes=0;
		
		if (2*chocos <= patatasbravas) {
			numeroClientes=(double) chocos*6;
		} 
		else {
			numeroClientes=(double) patatasbravas*3;
		}
		
		return (int) numeroClientes;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double patatasbravas; // en kilos
		double chocos; // en kilos

		System.out.println("Cuantos kilos de patatas hay? ");
		patatasbravas = sc.nextDouble();
		System.out.println("Cuantos kilos de chocos hay? ");
		chocos = sc.nextDouble();

		System.out.println("El número de comensales es: " + numeroClientes(patatasbravas, chocos));
		sc.close();
	}
}
