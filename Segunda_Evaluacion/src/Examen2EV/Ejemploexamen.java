/*Pedir por teclado dos series de 7 enteros. Posteriormente se
ordenarán crecientemente por el método quicksort. Por último se
fusionaran las dos tablas en una tercera, de forma que sigan
ordenados de forma creciente.*/

package Examen2EV;

import java.util.Arrays;

import java.util.Scanner;

public class Ejemploexamen {

	public static void ordena(int[] arr) {
		Arrays.sort(arr);
	}

	public static void InvertirArray(int[] arr) {
		int aux;
		for (int i = arr.length; i > 0; i--) {
			for (int j = 0; j < i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					aux = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = aux;
				}
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] lista1 = new int[6];
		int[] lista2 = new int[6];
		int[] lista3 = new int[12];
		System.out.println("Lista 1");
		for (int i = 0; i < lista1.length; i++) {
			System.out.println("Introduce un numero");
			lista1[i] = sc.nextInt();
		}
		System.out.println("Lista 2");
		for (int i = 0; i < lista2.length; i++) {
			System.out.println("Introduce un numero");
			lista2[i] = sc.nextInt();
		}
		ordena(lista1);
		System.out.println(Arrays.toString(lista1));
		ordena(lista2);
		System.out.println(Arrays.toString(lista2));
		for (int i = 0; i < 6; i++) {
			lista3[i] = lista1[i];
		}
		for (int i = 0; i < 6; i++) {
			lista3[i + 6] = lista2[i];
		}
		ordena(lista3);
		InvertirArray(lista3);
		System.out.println(Arrays.toString(lista3));
		sc.close();
	}
}