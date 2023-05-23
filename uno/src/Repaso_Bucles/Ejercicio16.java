package Repaso_Bucles;

import java.util.Scanner;

/*16. Pide un número (que debe estar entre 0 y 10) y mostrar la
tabla de multiplicar de dicho número.*/

public class Ejercicio16 {

	public static void main(String[] args) {
		
		int num=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introzca un número entre 0 y 10: ");
		num=sc.nextInt();
		if (num>=0 && num<=10) {
		for (int i=0; i<=10; i++) {
			System.out.println(num +" x "+i+" es "+num*i);
			sc.close();
			}
		}
		else{
			System.out.println("El " + num + " no está entre el 1 y el 10.");
		}
	}
}