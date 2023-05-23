package BoletinArraysString;

import java.util.Scanner;

public class BoletinArraysString04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe una línea de texto cualquiera y pulsa retorno: ");

		String texto = sc.nextLine();

		System.out.println("¿Qué carácter quieres buscar?");
		String charText = sc.next();
		sc.nextLine();
		char charBusca = charText.charAt(0);
		int veces = 0;

		// metodos indexOf
		// metodos lastIndexOf

			if(texto.indexOf(charBusca)==-1) {
				System.out.println("No se ha encontrado el caracter " + charBusca);
			}else {		
				for(int i=0;i<texto.length();i++) {
					if(texto.charAt(i)==charBusca) veces++;
			}
				System.out.println("El caracter " + charBusca + " aparece " + veces + " veces.");
		}
		sc.close();
	}
}

