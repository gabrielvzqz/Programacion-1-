package Repaso_Bucles;

import java.util.Scanner;

/*2. Leer un número e indicar si es positivo o negativo. El
proceso se repetirá hasta que se introduzca un 0.*/

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1;
		while (num != 0) {
			System.out.println("Introduzca un número: ");
			num = sc.nextInt();
		if (num > 0) {
			System.out.println("El número introducido es positivo");
		}
		else if(num <0) {
			System.out.println("El número introducido es negativo");
		}
		else if(num==0) {
			System.out.println("El programa ha finalizado.");
		}
		
		}
		sc.close();
	}

}
