/*9. Crear un programa que lea por teclado una tabla de 10
números enteros y la desplace una posición hacia abajo: el
primero pasa a ser el segundo, el segundo pasa a ser el
tercero y así sucesivamente. El último pasa a ser el
primero.*/

package BoletinArrays;

import java.util.Arrays;

import java.util.Scanner;

public class BoletinArrays09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];

		System.out.println("Introuduzca 10 números.");
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduce un número: ");
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));

		System.out.print(arr[9]);

		for (int i =  0; i < 9; i++) {
			System.out.print(", ");
			System.out.print(arr[i]);;
		}

		sc.close();
	}
}