package Metodos;

import java.util.Scanner;

public class rebajas3 {
	public static double descubreActual(double original, double porcentaje) {
		return (original - ((porcentaje / 100) * original));
			}
	//construye por último un método al que le pasamos el precio original y
	//un porcentaje 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double original, porcentaje;
		double actual;
		System.out.println("Dime cuanto costaba: ");
		
		original = sc.nextDouble();
		
		System.out.println("Dime el descuento: ");
		
		porcentaje = sc.nextDouble();
		
		actual= descubreActual(original, porcentaje);
		
		System.out.println("El precio actual es:  "+ actual +"€");
		
		sc.close();
	}
}
