package Programas_sencillos;

import java.util.Scanner;

public class Resuelto3 {

	public static void main(String[] args) {
		/*Verdadero se la edad es menor o igual a 28,
		 * el nivel de ingresos es mayor que tres
		 * y los ingresos superan los 28.000 (euros).
		 */
		Scanner sc = new Scanner(System.in);
		int edad;
		int ingresos;
		int nivel_de_estudios;
		boolean jasp=false;
		
		System.out.println("Dime tu edad: ");
		edad=sc.nextInt();
		System.out.println("Dime tus ingresos: ");
		ingresos=sc.nextInt();
		System.out.println("Dime tu nivel de estudios: ");
		nivel_de_estudios=sc.nextInt();
		
		jasp = ((edad<=28)  && (nivel_de_estudios>3) && (ingresos>28000));
		System.out.println("¿Eres Jasp? "+jasp);
		sc.close();
	}

}
