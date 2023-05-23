package nosequees;

import java.util.Scanner;

public class factorialpepe_metodo {
	
	public static int factorialIterativo(int numero) {
		int factorial = 1;
		
		for (int i=1; i <=numero; i++) {
			factorial=factorial*i;
		}
		return factorial;
	}
	public static int factorialRecursivo(int numero){
		
		if(numero==1)
			return 1;
		else 
			return numero*factorialRecursivo(numero-1);
			
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Introduce un número entero: ");
		numero=sc.nextInt();
		System.out.println("El factorial iterativo de " + numero + " es: " + factorialIterativo(numero));
		
		System.out.println("________________________________________________________________/n");
		
		System.out.println("El factorial por recursividad de " + numero + " es: " + factorialRecursivo(numero));
		

		sc.close();
	}

}
