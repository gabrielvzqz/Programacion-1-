package Metodos;

import java.util.Scanner;

public class rebajas {
	public static double descubrePorcentaje(double original, double actual) {
		return(original-actual)*100/original;
			}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double original, actual;
		double porcentaje;
		System.out.println("Dime cuanto costaba: ");
		
		original = sc.nextDouble();
		
		System.out.println("Dime cuanto cuesta actualmente: ");
		
		actual = sc.nextDouble();
		
		porcentaje= descubrePorcentaje(original, actual);
		
		System.out.println("El descuento es de un "+ porcentaje +"%");
		
		sc.close();
	}
}