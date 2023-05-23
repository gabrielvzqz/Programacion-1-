package BoletinArraysString;

import java.util.Scanner;

public class BoletinArraysString05 {

	// public static final String PALABRA_SECRETA = "java";
	public static final int INTENTOS = 30;
	
	public static String generaPalabra (int n) {
		String palabra = "";
		for (int i = 0 ; i < n ; i++) {
			int codigoAscii = (int) Math.floor(Math.random() * (122-97) + 97);
			palabra = palabra + (char) codigoAscii;
		}
		return palabra;
	}
	
	public static void main(String[] args) {
		
		int intentos = 0;
		Scanner lector = new Scanner (System.in);
		System.out.println("Introduce el numero de letras: ");
		int num = Integer.parseInt(lector.nextLine());
		
		String secreta = generaPalabra(num);
		
		System.out.println("Empecemos el juego");
		System.out.println("Adivina la palabra secreta");
		boolean hasAcertado = false;
		
		while (!hasAcertado && intentos < INTENTOS) {
			System.out.println("Te quedan " + (INTENTOS-intentos) + " intentos");
			System.out.println("Que palabra crees que es?");
			String palabraUsuario = lector.next();
			lector.nextLine();
			
			int valor = palabraUsuario.compareTo(secreta);		
			
			if (valor < 0) {
				System.out.println("Has fallado mancoo!! despues alfab");
			} else if (valor > 0){
				System.out.println("Has fallado mancoo!! antes alfab");
			} else {
				hasAcertado = true;
			}
			intentos++;
		}
		
		if (hasAcertado) {
			System.out.println("Acertaste fiera!!");
			System.out.println("Necesitaste " + intentos + " intentos");
		} else {
			System.out.println("Has usado todos los intentos");
		}
		lector.close();
	}

}
