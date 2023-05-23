package Estructuras_Dinamicas;

import java.util.Scanner;

import java.util.ArrayList;

public class Ejercicio08 {

	public static ArrayList<Ejercicio07gato> poblarLista(int numero){
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Ejercicio07gato> lista = new ArrayList<Ejercicio07gato>();
		
		for(int i=0; i<numero;i++) {
			
			Ejercicio07gato g = new Ejercicio07gato();

			System.out.println("Dime un nombre: ");
			g.setNombre(sc.next());
			System.out.println("Dime un color: ");
			g.setColor(sc.next());
			System.out.println("Dime una raza: ");
			g.setRaza(sc.next());
			//añadir
			lista.add(g);
		}
		return lista;
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Ejercicio07gato> miLista; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime cuantos gatos quieres: ");

		miLista=poblarLista(sc.nextInt());
		
		System.out.println(miLista);
		
		
		sc.close();
	}
}
