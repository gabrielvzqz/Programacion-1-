package Programas_sencillos;

import java.util.Scanner;

public class multiplica {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un  número del 1 al 10: ");
		int num =sc.nextInt();
		System.out.println("Tabla de multiplicar del número " + num);
		for(num=0; num<=10; num++) {
			System.out.println("Tabla de multiplicar del "+num);
			
		
		for (int i=0; i<=10; i++) {
			System.out.println(num +" x "+i+" es "+num*i);
			sc.close();
		}
		}
		
	}

}
