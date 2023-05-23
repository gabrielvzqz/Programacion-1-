package Examen;

import java.util.Scanner;

public class Ejercicio2A {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int num1copia=0;
		int num2copia=0;

		
		System.out.println("Introduce un numero: ");
		num1=sc.nextInt();
		System.out.println("Introduce un numero: ");
		num2=sc.nextInt();
		for (int i=1; i<num1; i++) {

			if (num1%i==0){
				num2copia=num2copia+i;
			}
		}
		for (int i=1; i<num2; i++) {

			if (num2%i==0){
				num1copia=num1copia+i;
			}
		}
		if (num1copia==num1 && num2copia==num2){
			System.out.println("Son dos numeros amigos");
		}
		else 
			System.out.println("No son números amigos");
		sc.close();
	}
}
