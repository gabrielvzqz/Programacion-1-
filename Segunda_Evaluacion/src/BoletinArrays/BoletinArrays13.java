/*13. Leer 10 enteros. Guardar en otra tabla los elementos
pares de la primera, y a continuación los elementos
impares. Realizar dos versiones: una trabajando con los
valores y otra trabajando con los índices.*/

package BoletinArrays;

import java.util.Arrays;
import java.util.Scanner;

public class BoletinArrays13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arrpares = new int[10];
		int[] arrimpares = new int[10];
		int[] indpares = new int[5];
		int[] indimpares = new int[5];
		int numero = 0;
		int k = 0;
		int j = 0;
		int r = 0;
		int s = 0;

		System.out.println("Introuduzca 10 números.");

		for (int i = 0; i < 10; i++) {
			System.out.println("Introduce un número: ");
			numero = sc.nextInt();
			if (numero % 2 == 0) {
				arrpares[k] = numero;
				k++;
			} 
			if(numero % 2!= 0) {
				arrimpares[j] = numero;
				j++;
			}
			if (i % 2 == 0) {
				indpares[r] = numero;
				r++;
			} 
			if (i%2!=0) {
				indimpares[s] = numero;
				s++;
			}

		}
		System.out.println(Arrays.toString(arrimpares));
		System.out.println(" ");
		System.out.println(Arrays.toString(arrpares));
		System.out.println(" ");
		System.out.println(Arrays.toString(indimpares));
		System.out.println(" ");
		System.out.println(Arrays.toString(indpares));
		sc.close();
	}
}