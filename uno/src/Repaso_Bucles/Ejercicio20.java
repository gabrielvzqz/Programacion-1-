package Repaso_Bucles;

import java.util.Scanner;

/*20. Pedir un número N, introducir N sueldos, y mostrar el sueldo
máximo.*/

public class Ejercicio20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numerosueldos = 0;
		int sueldo = 0;
		int mayorsueldo = 0;
		
		System.out.println("Introduce un número pequeño: ");
		numerosueldos=sc.nextInt();
		for(int i=0; i< numerosueldos;i++) {
			System.out.println("Introduce un sueldo: ");
			sueldo = sc.nextInt();
			
		while(sueldo>mayorsueldo) {
			mayorsueldo=sueldo;
		}
	}
		System.out.println("El sueldo introducido más grande fue de: " + mayorsueldo + "€.");
				
		sc.close();
	}

}
