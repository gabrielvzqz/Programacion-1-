package Programas_sencillos;

import java.util.Scanner;

public class Cadenas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nombre;
		String apellido;
		System.out.println("Introduce tu nombre: ");
		nombre = sc.nextLine();
		System.out.println("Introduce tu apellido: ");
		apellido = sc.nextLine();
		nombre=apellido;
		System.out.println("Tu nombre es " + nombre + " " + apellido);
		
		sc.close();
	}
}