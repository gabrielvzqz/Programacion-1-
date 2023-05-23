package ExamenGabrielVazquez;

import java.util.Arrays;

/*Ingresa un texto de al menos 8 palabras 
 *e indique que letras no han aparecido en el texto*/

import java.util.Scanner;

public class Ejercicio4A {

	public static void main(String[] args) {

		int contador = 0;
		Scanner sc = new Scanner(System.in);
		char[] letras = new char[26];
		int[] veces = new int[26];
		for (int j = 0; j < letras.length; j++) {
			letras[j] = (char) ('a' + j);
		}
		boolean seguir = true;

		System.out.println("Introduce palabras(Mínimo 6): ");
		String analisis = sc.nextLine();
		
		do {
			String[] trozos = analisis.split(" ");
			contador = trozos.length;
			if (contador >= 6) {
				seguir = false;
			} else {
				System.out.println("Introduce palabras(Mínimo 6): ");
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