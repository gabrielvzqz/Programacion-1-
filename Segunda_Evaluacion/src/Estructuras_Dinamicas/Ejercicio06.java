package Estructuras_Dinamicas;

import java.util.ArrayList;

public class Ejercicio06 {
	public static void main(String[] args) {
		ArrayList<String> colorines = new ArrayList<String>();
		colorines.add("rojo");
		colorines.add("verde");
		colorines.add("azul");
		colorines.add("blanco");
		colorines.add("amarillo");
		System.out.println("Contenido del vector: ");
		for (String color : colorines)
			System.out.println(color);
		colorines.set(2, "turquesa");
		System.out.println("Contenido del vector después de machacar laposición 2: ");
		for (String color : colorines) {
			System.out.println(color);
		}
	}
}