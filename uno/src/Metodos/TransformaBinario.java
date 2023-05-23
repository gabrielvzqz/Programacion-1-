package Metodos;

import java.util.Scanner;

public class TransformaBinario {
	
	//la base será siempre 2
	public static void transforma2(int dato) {
		if (dato<2)
			System.out.print(dato);
		else {
			transforma2(dato/2);
			System.out.print(dato%2);
		}
		
	}
	
	//la base será siempre 8
	public static void transforma8(int dato) {
		if (dato<8)
			System.out.print(dato);
		else {
			transforma8(dato/8);
			System.out.print(dato%8);
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un dato: ");
		int dato = sc.nextInt();
		System.out.println("Pasado a binario es: ");
		transforma2(dato);
		System.out.println(" ");
		System.out.println("Pasado a octal es: ");
		transforma8(dato);		
		
		
		sc.close();
	}

}
