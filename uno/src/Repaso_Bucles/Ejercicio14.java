package Repaso_Bucles;

import java.util.Scanner;

/*14. Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de
1000€.*/


public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sueldo = 0;
		int suma = 0;
		int mil = 0;
		for(int i =1;i<=10;i++) {
			System.out.println("Introduce 10 sueldos: ");
			sueldo=sc.nextInt();
			suma=suma+sueldo;
			if(sueldo>1000) {
				mil++;
			}
		}
			System.out.println("Los 10 sueldos sumados son " + suma + " €.");
			System.out.println("Hay " + mil + " sueldos por encima de 1000€.");

		sc.close();
	}

}
