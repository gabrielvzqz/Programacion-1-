package Estructuras_Dinamicas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio07gato2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Ejercicio07gato> g = new ArrayList<Ejercicio07gato>();
		
		Ejercicio07gato uno = new Ejercicio07gato("Pepe", "gris", "Angora",6);
		
		g.add(new Ejercicio07gato("Garfield", "naranja", "mestizo",3));
		g.add(new Ejercicio07gato("Pepe", "gris", "angora",5));
		g.add(new Ejercicio07gato("Mauri", "blanco", "manx",7));
		g.add(new Ejercicio07gato("Ulises", "marrón", "persa",9));
		
		System.out.println("\nDatos de los gatos:\n");
		
		for (Ejercicio07gato gatoAux : g) {
			
			System.out.println(gatoAux + "\n");
		}
		
		//int=0;
		//cambiar nombre a los gatos
		for (Ejercicio07gato gato : g) {
			System.out.println(gato.getNombre());
			System.out.println("Nuevo nombre: ");
			String n = sc.nextLine();
			gato.setNombre(n);
			//g.set(i,g);
			
		}
		System.out.println(g);
		sc.close();
	}
}