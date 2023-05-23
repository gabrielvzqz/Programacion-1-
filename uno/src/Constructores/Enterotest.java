package Constructores;

import java.util.Scanner;

public class Enterotest {

	public static void main(String[] args) {
		
		//Creo un scanner para obtener los datos con los que se deseé realizar las operaciones
		//Creo variables a las que le doy valor más tarde
		
		Scanner sc = new Scanner(System.in); 
		Entero operaciones = new Entero();
		int valor, numero;
		int suma;
		int resta;
		int doble;
		int triple;
		
		//Realizo las operaciones y doy las respuestas con sysos
		
		System.out.println("Dime el valor con el que desea operar: ");
		valor=sc.nextInt();
		System.out.println("Digame que numero desea sumarle: ");
		numero=sc.nextInt();
		suma = operaciones.resuelvesuma(valor, numero);
		System.out.println("La suma será "+ suma);
		
		System.out.println("Dime el valor con el que desea operar: ");
		valor=sc.nextInt();
		System.out.println("Digame que numero desea restarle: ");
		numero=sc.nextInt();
		resta = operaciones.resuelveresta(valor, numero);
		System.out.println("La resta será "+ resta);
		
		System.out.println("Dime el valor con el que desea operar: ");
		valor=sc.nextInt();
		doble = (int) operaciones.resuelvedoble(valor);
		System.out.println("El doble será "+ doble);
		
		System.out.println("Dime el valor con el que desea operar: ");
		valor=sc.nextInt();
		triple =(int)operaciones.resuelvetriple(valor);
		System.out.println("El triple será "+ triple);
		
		sc.close();
		
	}
}
