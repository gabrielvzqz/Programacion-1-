package Repaso_Bucles;

import java.util.Scanner;


/*1. Leer un número y mostrar su cuadrado, repetir el proceso
hasta que se introduzca un número negativo.*/

public class Ejercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=0;
		while (n>=0) {
			System.out.println("Introduce un número: ");
			n=sc.nextInt();
			System.out.println("El cuadrado del número introducido es " + n*n);
			
		}
		sc.close();
	}

}
