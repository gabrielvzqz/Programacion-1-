package Programas_sencillos;

import java.util.Scanner;

public class Ejemplo1else {
	
	public static void main(String[] args) {
		
		int a;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame valor de a: ");
		a=sc.nextInt();
		System.out.println("Has introducido el valor de a:" + a );
		
		if (a == 4) {
		System.out.println("La variable es igual a 4");
		}
		else{
		System.out.println ("La variable es menor que 6");
		}
		if (a > 5) {
		System.out.println("La variable es mayor a 5");
		}
		else if(a == 5){
		System.out.println("La variable es igual a 5");
		}
		else{
		System.out.println ( "La variable es menor que 5");
		sc.close();
		}
		
		
	}

}
