package Repaso_Bucles;

/*10. Pedir 15 números y escribir la suma total.*/

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		int num=0;
		int suma=0;
		for(int i=1; i<=15;i++) {
		
		while (i<=15) {
			
			System.out.println("Introduce 15 números para sumarlos: ");
			num=sc.nextInt();
			suma=suma+num;
			i++;
		}
		System.out.println("Suma="+suma);
		sc.close();
		}
		
	}

}
