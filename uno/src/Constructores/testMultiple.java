package Constructores;

import java.util.Scanner;

public class testMultiple {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Introduce tu nombre: ");
	String n = sc.nextLine();
	
	Ejemplo1 s = new Ejemplo1 (n);
	System.out.println("SALUDO");
	s.mostrarSaludo();
	System.out.println();
	System.out.println();
	System.out.println("DESPEDIDA");
	Ejemplo2 d = new Ejemplo2 (n);
	d.mostrarDespedida();
	
	
	sc.close();
	}
}
