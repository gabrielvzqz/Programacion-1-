package Repaso_Bucles;

import java.util.Scanner;

/*21. Pedir 10 números, y mostrar al final si se ha introducido
alguno negativo.*/

public class Ejercicio21 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int num=0;
		int negativo=0;
		
		for(int i=0;i<10;i++) {
			System.out.println("Introduce un número: ");
			num=sc.nextInt();
			if(num<0) {
				negativo++;
			}
		}
			if(negativo>0) {
				System.out.println("Se ha introducido algún número negativo.");
			
			}
			else{
				System.out.println("No se ha introducido ningun número negativo.");
		}
		sc.close();
	}

}
