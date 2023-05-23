package Estructuras_Dinamicas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(18);
		numeros.add(22);
		numeros.add(-30);
		System.out.println("No de elementos: " + numeros.size());
		System.out.println("El elemento que hay en la posición 1 es " + numeros.get(numeros.size()));
		
		System.out.println(numeros);
		
		System.out.println("Cuidado con los set.");
		numeros.set(1, 55);
		System.out.println(numeros);
		
		//Utilizar un foreach versión 2.0
		
		int i = 0;
		for (Integer n:numeros) {
			System.out.println("Posición: " + i + " valor: " + n);
			i++;
		}
		//Utilizar un foreach versión 3.0 permite modificar el valor del array.
		
		int j = 0;
		for (Integer n:numeros) {
			Integer ent = new Integer(0);
			ent=numeros.get(j);
			System.out.println("Posición: " + j + " valor: " + n);
			System.out.println("Nuevo valor: ");
			ent=sc.nextInt();
			numeros.set(j, ent);
			j++;
		}
		System.out.println(numeros);
		sc.close();
	}
}