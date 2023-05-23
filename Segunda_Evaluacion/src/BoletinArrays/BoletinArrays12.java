/*12. Leer por teclado una tabla de 10 elementos numéricos
enteros y una posición (entre 0 y 9). Eliminar el elemento
situado en la posición dada sin dejar huecos.*/

package BoletinArrays;

import java.util.Scanner;

public class BoletinArrays12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];
		int posicion = 0;

		System.out.println("Introuduzca 10 números.");
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduce un número: ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Qué posición desea eliminar? ");
		posicion=sc.nextInt();
		for(int i=0;i<posicion;i++) {
			System.out.print(arr[i]);
			System.out.print(", ");
		}
		for(int i=posicion+1;i<10;i++) {
			System.out.print(arr[i]);
			System.out.print(", ");
		}
		sc.close();
	}
}