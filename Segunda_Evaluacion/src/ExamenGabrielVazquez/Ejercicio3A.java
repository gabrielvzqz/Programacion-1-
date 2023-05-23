package ExamenGabrielVazquez;

import java.util.Scanner;

/*Programa que pida al usuario la introducción de dos cadenas de
caracteres.
A continuación construya una tercera cadena intercalando las
palabras de las cadenas recibidas.
Muestre dicha cadena por pantalla.*/

public class Ejercicio3A {

	public static final int NUM_PALABRAS = 1000;

	
	public static void main(String[] args) {
		
		String cadena1, cadena2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cadena: ");
		cadena1=sc.nextLine();
		System.out.println("Introduce otra cadena: ");
		cadena2=sc.nextLine();
		for (int i = 0; i < NUM_PALABRAS; i++) {
			// Va leyendo palabras una por una.
			// Recordar el comportamiento lectura de secuencias de datos por teclado.
			String palabra = lector.next();
			System.out.println("Palabra " + i);
			arr[i]=palabra;
			System.out.println("Has escrito " + palabra);
		}
	}
}
