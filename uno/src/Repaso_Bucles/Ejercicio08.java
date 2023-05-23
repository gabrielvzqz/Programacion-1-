package Repaso_Bucles;

import java.util.Scanner;

/*8. Pedir un número N, y mostrar todos los números del 1 al N.*/

public class Ejercicio08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("Introduzca un número: ");
		num=sc.nextInt();
		for(int i =1; i<=num; i++) {
		System.out.println(i);
		sc.close();
	}
	}
}
