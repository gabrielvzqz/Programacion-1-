package Programas_sencillos;

import java.util.Scanner;

/*programa que calculala longitud de una circunferencia de radio r*/

public class Ejemplo6 {
	final static double PI= 3.141592;
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		double radio = 0;
		double longitud;
		double area;
		System.out.println("Dame el valor del radio");
		radio=sc.nextDouble();
		longitud=2*PI*radio;
		area=PI*(Math.pow(radio, 2));
		System.out.println("la longitud de la circunferencia es: " + longitud);
		System.out.println("El area es: " + area);
		sc.close();
	}

}
