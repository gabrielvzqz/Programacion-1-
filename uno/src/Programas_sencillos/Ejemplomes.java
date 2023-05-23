package Programas_sencillos;

import java.util.Scanner;

//Introduce un mes e indica cuantos días tiene
public class Ejemplomes {

	public static void main(String[]args) {
		
		int mes;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número de mes del que \n"
				+ "desea saber la cantidad de días");
		mes = sc.nextInt();
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			System.out.println("El mes tiene 31 días");}
		
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				System.out.println("El mes tiene 30 días");
			}
		if (mes == 2){
				System.out.println("El mes tiene 28 días");
		}
		sc.close();
	}
}
