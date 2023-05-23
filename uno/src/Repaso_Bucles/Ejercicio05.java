package Repaso_Bucles;

import java.util.Random;

import java.util.Scanner;

/*5. Realizar un juego para adivinar un número. Para ello pedir un
número N, y luego ir pidiendo números indicando “mayor” o
“menor” según sea mayor o menor con respecto a N. El proceso
termina cuando el usuario acierta.*/

public class Ejercicio05 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int i = 0;
		Random rnd= new Random();
		int random = 0 + rnd.nextInt(1001);
			while(num != random && i<5) {
				i++;
				System.out.println("Introduzca un número del 1 al 1000: ");
				num = sc.nextInt();
			
			if (num < random) {
				System.out.println("El número es mayor.");
			}
			else if (num > random) {
				System.out.println("El número es menor.");
			}
			else {

				System.out.println("¡Acertaste el número!");
				System.out.println("El programa ha finalizado.");
				}
			}	
			sc.close();
		}
}