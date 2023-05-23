package Programas_sencillos;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horas = 0;
		System.out.println("Introduce las horas que desee transformar en semanas, días y horas: ");
		horas = sc.nextInt();
		System.out.println("El valor introducido equivale a " + (horas / 168) + " semanas " + ((horas % 168) / 24)
		+ " días y " + (horas % 24) + " horas.");

		sc.close();

	}

}
