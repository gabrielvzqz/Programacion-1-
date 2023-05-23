package Repaso_Bucles;

import java.util.Scanner;

/*23. Pedir 5 números e indicar si alguno es múltiplo de 3.*/

public class Ejercicio23 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int num=0;
		int suspenso=0;
		
		for(int i=0;i<5;i++) {
			System.out.println("Introduce un número: ");
			num=sc.nextInt();
			if(num%3==0) {
				suspenso++;
			}
		}
			if(suspenso>0) {
				System.out.println("Hay algún múltiplo de 3.");
			
			}
			else{
				System.out.println("No hay ningún múltiplo de 3.");
		}
		sc.close();
	}
}