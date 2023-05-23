package Examen2EV;

import java.util.Arrays;
import java.util.Scanner;

/*Ingrese un texto de al menos 8 palabras e indique qué tres letras
han aparecido en el texto más veces, indicando las mismas.*/

public class Ejercicio4B {

	public static void main(String[] args) {

		int contador = 0;
		Scanner sc = new Scanner(System.in);
		char[] letras = new char[26];
		int[] veces = new int[26];
		for (int j = 0; j < letras.length; j++) {
			letras[j] = (char) ('a' + j);
		}
		boolean seguir = true;

		System.out.println("Introduce palabras(Mínimo 8): ");
		String analisis = sc.nextLine();
		
		do {
			String[] trozos = analisis.split(" ");
			contador = trozos.length;
			if (contador >= 8) {
				seguir = false;
			} else {
				System.out.println("Introduce palabras(Mínimo 8): ");
				analisis = sc.nextLine();
			}

		} while (seguir);

		System.out.println(analisis);
		
		for(int i =0;i<letras.length;i++) {
			//coontar cuantas veces aparece cada letra
			for(int j=0;j<analisis.length();j++) {
				if(analisis.charAt(j)==letras[i]) {
					veces[i]++;
					
				}
			}
		}
		System.out.println(Arrays.toString(letras));
		System.out.println(Arrays.toString(veces));

		
		sc.close();
	}
}
