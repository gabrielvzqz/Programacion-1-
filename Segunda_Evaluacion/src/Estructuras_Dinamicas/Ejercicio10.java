package Estructuras_Dinamicas;

import java.util.Collections;

import java.util.ArrayList;

public class Ejercicio10 {

	public static void main(String[] args) {

		ArrayList<String> colores = new ArrayList<String>();
		colores.add("marrón");
		colores.add("azul");
		colores.add("verde");
		colores.add("amarillo");

		System.out.println("\nColores en el orden original: ");
		for (String s : colores) {
			System.out.println(s);
		}
		//ES NOVEDOSO
		Collections.sort(colores);
		System.out.println("\nColores ordenados alfabeticamente:");
		for (String s : colores) {
			System.out.println(s);
		}
	}
}

