/*7. Leer por teclado una serie de 10 números enteros. La
aplicación debe indicarnos si los números están ordenados
de forma creciente, decreciente, o si están desordenados.*/

package BoletinArrays;

import java.util.Scanner;

public class BoletinArrays07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];

		System.out.println("Tabla.");
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduce un número: ");
			arr[i] = sc.nextInt();
		}
		if (arr[0] < arr[1] && arr[1] < arr[2] && arr[2] < arr[3] && arr[3] < arr[4] && arr[4] < arr[5] && arr[5] < arr[6] && arr[6]
				< arr[7] && arr[7] < arr[8] && arr[8] < arr[9]) {
			System.out.println("Los números están ordenados de forma creciente.");
		}
		else if (arr[0] > arr[1] && arr[1] > arr[2] && arr[2] > arr[3] && arr[3] > arr[4] && arr[4] > arr[5] && arr[5] > arr[6] && arr[6]
				> arr[7] && arr[7] > arr[8] && arr[8] > arr[9]) {
			System.out.println("Los números están ordenados de forma decreciente.");
		}
		else {
			System.out.println("Los números están desordenados");
		}
		sc.close();

	}
}
