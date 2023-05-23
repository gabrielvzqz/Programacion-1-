/*2. Leer 5 números y mostrarlos en orden inverso al
introducido.*/
package BoletinArrays;

import java.util.Scanner;

public class BoletinArrays02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		int numero = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Introduce un número: ");
			numero = sc.nextInt();
			arr[i] = numero;
		}
		System.out.print("[");

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + ", ");

		}
		System.out.print("]");

		sc.close();

	}

}