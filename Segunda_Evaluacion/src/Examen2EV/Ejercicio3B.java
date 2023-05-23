/*Código que vaya leyendo palabras desde el teclado hasta encontrar la
palabra "fin".
Cuando esto sucede, debe mostrar por pantalla la palabra que estaría
en la última posición alfabética de entre todas las escritas. La
palabra "fin" queda excluida.*/

package Examen2EV;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Scanner;

public class Ejercicio3B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> cadena = new ArrayList<String>();

		
		for (int i = 0; i < 2; i++) {
			System.out.println("Introduce una palabra: ");
			cadena.add(sc.next());
			if (cadena.contains("fin")) {
				System.out.println("Se acabó el listado.");
				cadena.remove("fin");
				Collections.sort(cadena);
				Collections.reverse(cadena);
				System.out.println("La palabra en la última posición alfabética es: " + cadena.get(0));
				i++;
			}else {
				i--;
			}
		}
		sc.close();
	}
}