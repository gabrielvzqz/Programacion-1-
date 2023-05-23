package Array;

import java.util.Arrays;

import java.util.Scanner;

// Un programa que lee un número conocido de valores enteros.
public class LectorValoresConocidos {
	
	// Se leerán 10 valores.
	public static final int NUM_VALORES = 30;

	public static void main(String[] args) {
	
		Scanner lector = new Scanner(System.in);
		int[] arr= new int[NUM_VALORES];
		System.out.println("Escribe " + NUM_VALORES + " enteros. Se puede hacer en diferentes líneas.");
		
		
		int numValoresLeidos = 0;
		while (numValoresLeidos < NUM_VALORES) {
			// Antes de leer, comprobamos si realmente hay un entero.
			if (lector.hasNextInt()) {
				int valor = lector.nextInt();
				if (valor>=0 && valor<=10) {
				arr[numValoresLeidos]=valor;
				System.out.println("Valor " + numValoresLeidos + " leído: " + valor);
				numValoresLeidos++;}else {
					System.out.println("Valor no válido.");
				}
			} else {
				lector.next();
			}
		}
		// Los valores que sobren en la última línea escrita se descartan.
		lector.nextLine();
		System.out.println("Ya se han leído " + NUM_VALORES + " valores.");
		System.out.println(Arrays.toString(arr));
		lector.close();
	}
}