package Repaso_Bucles;

import java.util.Scanner;

/*3. Leer números hasta que se introduzca un 0. Para cada uno
indicar si es par o impar.*/

public class Ejercicio03 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int num = 1;
			while (num != 0) {
				System.out.println("Introduzca un número: ");
				num = sc.nextInt();
			if (num%2==0 && num!=0) {
				System.out.println("El número introducido es par.");
			}
			else if(num%2!=0) {
				System.out.println("El número introducido es impar.");
			}
			else if (num==0) {
				System.out.println("El programa ha finalizado.");
			}
			
			}
			sc.close();

	}

}
