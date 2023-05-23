package Programas_sencillos;

import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		System.out.println("Cual es tu Nombre?");
		nombre = sc.nextLine();
		System.out.println("Tu nombre es: " + nombre);

		sc.close();
	}

}
