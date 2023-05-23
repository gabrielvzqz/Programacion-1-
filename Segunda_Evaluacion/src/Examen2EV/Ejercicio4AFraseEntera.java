package Examen2EV;

/*Ingresa un texto de al menos 8 palabras 
 *e indique que letras no han aparecido en el texto*/

import java.util.Scanner;

public class Ejercicio4AFraseEntera {

	public static void main(String[] args) {
		
		char[] letras = new char[26];
		
		for (int j=0; j<letras.length;j++) {
			letras[j]= (char) ('a'+j);
		}

		//System.out.println(Arrays.toString(letras));
		
		/* String[] proceso = new String[20];
		boolean seguir = true;*/
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce palabras(Mínimo 8): ");
		// String resultado="a"
		//int contador = 0;
		String analisis=sc.nextLine();

		
		/*while (seguir) {
			String word = sc.next();
			proceso[contador] = word;
			contador++;
			if (word.equals("fin") && contador >= 8) {
				seguir = false;
			}
		}*/
		/*System.out.println(Arrays.toString(proceso));


		
		for (int i=0;i<contador-1;i++) {
			analisis+=proceso[i];
		}*/
		System.out.println(analisis);
		
		
		for (int i=0;i<letras.length;i++) {
			if (analisis.indexOf(letras[i])==-1) {
				System.out.println("La letra " + letras[i] + " no aparece en el texto.");
			}
		}
		sc.close();
	}
}