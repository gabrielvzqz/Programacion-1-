package BoletinArraysString;

import java.util.Random;
import java.util.Scanner;

public class BoletinArraysString05Pepe {

	public static final String PALABRA_SECRETA = generaPalabra();
	
	public static String generaPalabra() {
		Random r;
		String palabra="";
		for(int i=0;i<4;i++) {
			r=new Random();
			char letra = (char) (r.nextInt(26)+97);
			palabra=palabra+letra;
			System.out.println(palabra);
		}
		return palabra;
	}
	public static void main(String[] args) {
		
		int intentos=0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Empezamos el juego.");
		System.out.println("Adivina una palabra del diccionario.");
		boolean acierto = false;
		while (!acierto) {
			System.out.println("Que palabra creess que es?");
			String palabra = sc.next();
			sc.nextLine();
			//metodo compareTo
			int posicion =palabra.compareTo(PALABRA_SECRETA);
			/*y sigue pero no lo pude copiar >:(*/

		}
	}
}
