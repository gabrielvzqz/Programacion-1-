package Repaso_Bucles;

import java.util.Scanner;

/*12. Pedir un número y calcular su factorial.*/

public class Ejercicio12 {

	public static void main(String[] args) {
		
		int num=0;
		int multi = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		num=sc.nextInt();
		for(int i=1; i<=num;i++) {
			multi=multi*i;
		}
		System.out.println("Su factorial es: " + multi);

		
		sc.close();
	}

}
