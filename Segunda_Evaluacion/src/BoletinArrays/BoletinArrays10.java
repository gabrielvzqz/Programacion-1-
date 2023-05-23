/*10. Ídem, desplazar N posiciones (N es introducido por el
usuario).*/

package BoletinArrays;

import java.util.Scanner;

public class BoletinArrays10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];
		int posiciones = 0;

		System.out.println("Introuduzca 10 números.");
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduce un número: ");
			arr[i] = sc.nextInt();
		}
		System.out.println("¿Cuantas posiciones deseas desplazarlo? ");
		posiciones = sc.nextInt();

		for(int i=10-posiciones;i<10;i++) {
			System.out.print(arr[i]);			
			System.out.print(", ");
		}
		for (int i =  0; i < 10-posiciones; i++) {
			System.out.print(arr[i]);
			System.out.print(", ");
		}

		sc.close();
	}
}