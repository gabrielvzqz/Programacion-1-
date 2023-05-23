package Examen;

import java.util.Scanner;

public class Ejercicio1A {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double precio;
		int tarjeta;
		double ORO =0.80;
		double PLATA=0.90;
		double BRONCE=0.95;
		double si=1;
		double STAR = 0.05;
		

		
		System.out.println("Cual es el precio? ");
		precio = sc.nextInt();
		System.out.println("Su tarjeta es Star? ");
		STAR=sc.nextDouble();
		if (STAR==si) {
			ORO=ORO-STAR;
			PLATA=PLATA-STAR;
			BRONCE=BRONCE-STAR;
		}
		System.out.println("Con que tarjeta vas a pagar? (EN MAYUSCULAS)");
		tarjeta=sc.nextInt();
		if (tarjeta==ORO) {
			precio=precio*ORO;
			System.out.println("El precio con el descuento aplicado será " + precio + " €.");
		}
		else if (tarjeta==PLATA) {
			precio=precio*PLATA;
			System.out.println("El precio con el descuento aplicado será " + precio + " €.");
		}
		else if (tarjeta==BRONCE) {
			precio=precio*BRONCE;
			System.out.println("El precio con el descuento aplicado será " + precio + " €.");

	}

		
		sc.close();

}
}
