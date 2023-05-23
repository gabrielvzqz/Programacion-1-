package BoletinArraysString;

import java.util.Arrays;
import java.util.Scanner;

public class BoletinArraysString03 {

	public static final int NUM_FRASES = 4;

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		
		String[] arr= new String[NUM_FRASES];
		
		System.out.println("Escribe " + NUM_FRASES + " frases.");
		
		System.out.println("Para terminar una frase, pulsa la tecla de retorno.");
		for (int i = 0; i < NUM_FRASES; i++) {

			String frase = lector.nextLine();
			System.out.println("Frase " + i + ": Has escrito \" " + frase);

			arr[i]=frase;
		}
		System.out.println(Arrays.toString(arr));
		lector.nextLine();
		lector.close();

	}

}

