/*6. Leer los datos correspondientes a dos tablas de 12
elementos numéricos, y mezclarlos en una tercera de la
forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de
la B, etc*/

package BoletinArrays;

import java.util.Arrays;

import java.util.Scanner;

public class BoletinArrays06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr1 = new int[12];
		int[] arr2 = new int[12];
		int[] arr3 = new int[24];

		for (int j = 0; j < 24; j=j+0) {
			System.out.println("Tabla 1");
			for (int i = 0; i < 3; i++) {
				System.out.println("Introduce un número: ");
				arr1[i] = sc.nextInt();
				arr3[j] = arr1[i];
				j++;
			}
			System.out.println("Tabla 2");
			for (int i = 0; i < 3; i++) {
				System.out.println("Introduce un número: ");
				arr2[i] = sc.nextInt();
				arr3[j] = arr1[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(arr3));
		sc.close();

	}
}