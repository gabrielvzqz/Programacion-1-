/*11. Leer 5 elementos numéricos que se introducirán
ordenados de forma creciente. Éstos los guardaremos en una
tabla de tamaño 10. Leer un número N, e insertarlo en el
lugar adecuado para que la tabla continúe ordenada.*/

package BoletinArrays;

import java.util.Arrays;

import java.util.Scanner;

public class BoletinArrays11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];
		int[] arr1 = new int[5];

		System.out.println("Introuduzca 5 números ordenados.");
		System.out.println("Introduce un número: ");
		arr[0] = sc.nextInt();
		
		for (int i = 1; i < 5; i++) {
			System.out.println("Introduce un número: ");
			arr[i] = sc.nextInt();
			if(arr[i]<arr[i-1]) {
				System.out.println("Valor incorrecto.");
				i--;
			}
			else {
				System.out.println("Valor correcto.");
		}			
		}
		System.out.println(Arrays.toString(arr));


		for (int i=0;i<5;i++) {
			System.out.println("Introduce un número: ");
			arr1[i] = sc.nextInt();
			for(int k=0; k<10;k++) {
				if(arr1[i]>arr[k]) {
				}
					else {
						
					}
			}
	}
		sc.close();
}
}