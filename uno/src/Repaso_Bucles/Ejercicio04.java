package Repaso_Bucles;

import java.util.Scanner;

/*4. Pedir números hasta que se teclee uno negativo, y mostrar
cuántos números se han introducido.*/

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		for(int i = 0; num>=0;i++) {
			
			while(num >=0) {
				System.out.println("Introduzca un número: ");
				num = sc.nextInt();
			if(num >= 0) {
				i++;
			}
			else {

				System.out.println("El programa ha finalizado.");
				System.out.println("Se han introducido "+ i +" números.");
			}
				
			}
		}
	
		sc.close();


	}

}
