package nosequees;

import java.util.Scanner;

public class aritmeticas {

	public static void main(String[] args) {
		
		/*int cont = 0;
		//PROGRESIÓN Aritmética
		//término inicial 1
		//razon 3
		//1, 4, 7, 10, 13...
		for(int i=1; i<=100; i=i+4) {
			System.out.println(i + ", ");
			cont++;
		}
		System.out.println();
		System.out.println("Has listado " + cont + " números.");*/
		
		Scanner sc = new Scanner(System.in);
		int ini;
		int relacion;
		int corte;
		int cont = 0;
		
		System.out.println("GENERADOR DE PROGRESIÓN ARITMÉTICA");
		System.out.println("Término inicial: ");
		ini=sc.nextInt();
		System.out.println("Relación: ");
		relacion=sc.nextInt();
		System.out.println("Corte del bucle:");
		corte=sc.nextInt();
		for(int i=ini; i<=corte; i=i+relacion) {
			System.out.println(i + ", ");
			cont++;
			}
		System.out.println("Has listado " + cont + " números.");
		sc.close();
	}

}
