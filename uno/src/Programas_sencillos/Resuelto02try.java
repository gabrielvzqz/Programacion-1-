package Programas_sencillos;

import java.util.Scanner;

public class Resuelto02try {

	public static void main(String[] args) {
		int filas=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantas filas quieres? ");
		filas= sc.nextInt();

		int i, j, k;
		for (i = 1; i <= filas; i++) {
			for (k = 1; k <= filas 	-i; k++) {
				System.out.print(" ");

			}
		for (j = 1; j <= 2*(i-1)+1; j++) {
			System.out.print("*");
	}
		System.out.println("");
		}
}
}
