package Estructuras_Dinamicas;

import java.util.Collections;

import java.util.ArrayList;

public class Ejercicio12 {
	public static void main(String[] args) {
		ArrayList<Ejercicio07gato> g = new ArrayList<Ejercicio07gato>();
		g.add(new Ejercicio07gato("Garfield", "naranja", "mestizo",2));
		g.add(new Ejercicio07gato("Pepe", "gris", "angora",3));
		g.add(new Ejercicio07gato("Mauri", "blanco", "manx",3));
		g.add(new Ejercicio07gato("Ulises", "marrón", "persa",5));
		g.add(new Ejercicio07gato("Adán", "negro", "angora",7));
		Collections.sort(g);
		System.out.println("\nDatos de los gatos ordenados por edad de más a menos: ");
		for (Ejercicio07gato gatoAux : g) {
			System.out.println(gatoAux + "\n");
		}
	}
}
/*El orden depende del Ejercicio07gato.java en el compareTo*/