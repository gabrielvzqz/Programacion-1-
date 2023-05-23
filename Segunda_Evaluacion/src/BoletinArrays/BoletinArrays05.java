/*5. Leer por teclado dos tablas de 10 números enteros y
mezclarlas en una tercera de la forma: el 1o de A, el 1o de
B, el 2o de A, el 2o de B, etc.*/

package BoletinArrays;

import java.util.Arrays;
import java.util.Scanner;

public class BoletinArrays05 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		int[] arr3 = new int[20];
		System.out.println("Tabla 1");
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduce un número: ");
			arr1[i]=sc.nextInt();
			arr3[i*2]=arr1[i];
		}
		System.out.println("Tabla 2");
		for(int i = 0; i < 10;i++) {
			System.out.println("Introduce un número: ");
			arr2[i]=sc.nextInt();
			arr3[i*2+1]=arr1[i];
		}
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr1));

		sc.close();

	}

}
