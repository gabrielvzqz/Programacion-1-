package Programas_sencillos;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		System.out.println("Introduce el valor de a: ");
		a = sc.nextInt();
		System.out.println("Introduce el valor de b: ");
		b = sc.nextInt();
		System.out.println("Introduce el valor de c: ");
		c = sc.nextInt();
		if (((b*b-(4*a*c))) > 0) {
			System.out.println("La ecuación de segundo grado a resolver será: "+a+"x^2+"+b+"x+"+c+"=0");
			System.out.println("La incógnita x valdrá: "+((-b+(Math.sqrt(b*b-4*a*c)))/(2*a))+ " y "+ ((-b-(Math.sqrt(b*b-4*a*c)))/(2*a))) ;
			}else
				if (((b*b-(4*a*c))) == 0){
			System.out.println("La ecuación de segundo grado a resolver será: "+a+"x^2+"+b+"x+"+c+"=0");
			System.out.println("La incógnita x valdrá: "+((-b/(2*a)))) ;
				}else
				if (((b*b-(4*a*c))) < 0) {
			System.out.println("La ecuación de segundo grado a resolver será: "+a+"x^2+"+b+"x+"+c+"=0");
			System.out.println("No hay solución a la ecuación.") ;
		}
		sc.close();
	}

}