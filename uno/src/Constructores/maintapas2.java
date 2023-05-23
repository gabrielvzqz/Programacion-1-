package Constructores;

import java.util.Scanner;

public class maintapas2 {
	public static void main(String[]args) {
		
		Scanner sc= new Scanner (System.in);
		double p;
		double c;
		
		System.out.println("Cuantos kilos de patatas hay? ");
		p=sc.nextDouble();
		System.out.println("Cuantos kilos de chocos hay? ");
		c=sc.nextDouble();
		
		tapas2 almacen = new tapas2(p, c);
		System.out.println(almacen.toString());

		System.out.println("El número de comensales es: " + almacen.numeroClientes());
		
		System.out.println(almacen.toString());
		sc.close();
	}

}