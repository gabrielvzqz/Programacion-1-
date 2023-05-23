package Estructuras_Dinamicas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*Escribe un programa que ordene 10 números introducidos
 *por teclado y almacenados en un objeto de la clase Array*/

public class Ejercicio15 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for (int i = 0; i<10;i++) {
			System.out.println("Introduce un número: ");
			numbers.add(sc.nextInt());
		}
		System.out.println(numbers);
		Collections.sort(numbers);
		System.out.println(numbers);
		
		sc.close();
	}
}
