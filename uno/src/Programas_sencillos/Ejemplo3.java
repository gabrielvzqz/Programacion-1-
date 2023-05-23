package Programas_sencillos;

import java.util.Scanner;

public class Ejemplo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		int edad = 0;
		System.out.println("Cual es tu Nombre?");
		nombre = sc.nextLine();
		System.out.println("Cuantos años tienes?");
		edad = sc.nextInt();
		System.out.println("Tu nombre es: " + nombre);
		System.out.println("Y tu edad es: " + edad);
		sc.close();
	}

}
