package Repaso_Bucles;

import java.util.Scanner;

/*6. Pedir números hasta que se teclee un 0, mostrar la suma de
todos los números introducidos.*/

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1;
		int suma=0;
		while (num != 0) {
			System.out.println("Introduzca un número: ");
			num = sc.nextInt();
		if (num!=0) {
			suma=suma+num;
		}
		else if(num==0) {
			System.out.println("La suma de los números introducidos es: " + suma);
		}
		
		}
		sc.close();

	}

}
