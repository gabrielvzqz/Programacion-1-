/*8. Diseñar una aplicación que declare una tabla de 10
elementos enteros. Leer mediante el teclado 8 números.
Después se debe pedir un número y una posición, insertarlo
en la posición indicada, desplazando los que estén detrás.*/

package BoletinArrays;

import java.util.Arrays;

import java.util.Scanner;

public class BoletinArrays08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int posicion = 0;
		int posicion2 = 0;
		int[] arr = new int[8];
		int[] arr1 = new int[2];

		System.out.println("Introuduzca primero 8 números.");
		for (int i = 0; i < 8; i++) {
			System.out.println("Introduce un número: ");
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
			System.out.println("En que posicion de desea insertar el siguiente número");
			posicion = sc.nextInt();
			System.out.println("Introduce un número: ");
			arr1[0] = sc.nextInt();
			System.out.println("En que posicion de desea insertar el siguiente número");
			posicion2 = sc.nextInt();
			System.out.println("Introduce un número: ");
			arr1[1] = sc.nextInt();
			for (int k = 0; k < posicion; k++) {
				System.out.print(arr[k]);
				System.out.print(", ");
			}
			System.out.print(arr1[0]);
			for (int k = posicion; k < posicion2; k++) {
				System.out.print(", ");
				System.out.print(arr[k]);
			}
			System.out.print(", ");
			System.out.print(arr1[1]);
			for (int k = posicion2 + 1; k < 8; k++) {
				System.out.print(", ");
				System.out.print(arr[k]);
			}
			System.out.println(" ");
		sc.close();
	}
}