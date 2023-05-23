package BoletinArraysString;

import java.util.Arrays;
import java.util.Scanner;

public class BoletinArraysString02 {

	public static final int NUM_PALABRAS = 10;

	public static void main(String[] args) {
		
		String[] arr= new String[NUM_PALABRAS];
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Escribe " + NUM_PALABRAS + " palabras separadas por espacios.");
		
		System.out.println("Las puedes escribir en líneas de texto diferente, si quieres.");
		
		for (int i = 0; i < NUM_PALABRAS; i++) {
			// Va leyendo palabras una por una.
			// Recordar el comportamiento lectura de secuencias de datos por teclado.
			String palabra = lector.next();
			System.out.println("Palabra " + i);
			arr[i]=palabra;
			System.out.println("Has escrito " + palabra);
		}
		System.out.println(Arrays.toString(arr));
		// Se lee el resto de la línea y se ignora el contenido.
		lector.nextLine();
		lector.close();
	}
}