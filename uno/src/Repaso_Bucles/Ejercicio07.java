package Repaso_Bucles;

import java.util.Scanner;

/*7. Pedir números hasta que se introduzca uno negativo, y
calcular la media.*/

public class Ejercicio07 {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			int num = 1;
			int suma=0;
			int media =0;
			int divisor = 0;
			while (num > 0) {
				System.out.println("Introduzca un número: ");
				num = sc.nextInt();
			if (num>0) {
				divisor= divisor +1;
				suma=suma+num;
			}
			else if(num<0) {
				media=suma/divisor;
				System.out.println("La suma de los números introducidos es: " + media);
			}
			
			}
			sc.close();

	}

}