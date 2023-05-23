package Metodos;

import java.util.Scanner;

public class rebajas2 {
	public static double descubreOriginal(double porcentaje, double actual) {
		return(actual/(100-porcentaje)*100);
			}
	//construye por último un método al que le passamos el precio original y
	//un porcentaje 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double porcentaje, actual;
		double original;
		System.out.println("Dime cuanto cuesta: ");
		
		actual = sc.nextDouble();
		
		System.out.println("Dime el porcentaje de descuento: ");
		
		porcentaje = sc.nextDouble();
		
		original= descubreOriginal(porcentaje, actual);
		
		System.out.println("El precio era de  "+ original +"€");
		
		sc.close();
	}
}
