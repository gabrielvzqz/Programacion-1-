/*4. Leer 10 números enteros. Debemos mostrarlos en el
siguiente orden: el primero, el último, el segundo, el
penúltimo, el tercero, etc.*/

package BoletinArrays;

import java.util.Arrays;

import java.util.Scanner;

public class BoletinArrays04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];

		int numero = 0;
		for (int i = 0; i < 10; i=i+2) {
			System.out.println("Introduce un número: ");
			numero=sc.nextInt();
			arr[i]=numero;
		}
		for(int i = 9; i > 0;i=i-2) {
			System.out.println("Introduce un número: ");
			numero=sc.nextInt();
			arr[i]=numero;
		}
		System.out.println(Arrays.toString(arr));
		sc.close();

	}

}
