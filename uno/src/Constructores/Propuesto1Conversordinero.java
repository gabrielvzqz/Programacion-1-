package Constructores;

import java.util.Scanner;

public class Propuesto1Conversordinero {

	public static void main(String[] args) {

		double dinero;
		int opcion=0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Pulsa 1 para cambio por defecto \n" + 
		"Pulsa 2 para cambio personalizado");
		opcion=sc.nextInt();
		
		if (opcion == 1) {
			// CONSTRUCTOR POR DEFECTO
			Convertirdinero enero = new Convertirdinero();
			System.out.println(enero.toString());

			System.out.println("Mete los dólares que quieres convertir a euros: ");
			dinero = sc.nextDouble();
			System.out.println(dinero + " $ son " + enero.dolaraeuro(dinero) + " €");

			System.out.println("Mete los euros que quieres convertir a dólares: ");
			dinero = sc.nextDouble();
			System.out.println(dinero + " € son " + enero.euroadolar(dinero) + " $");
			} 
		else if (opcion == 2) {
			// CONSTRUCTOR PASÁNDOLE EL CAMBIO QUE QUERAMOS
			System.out.println("Introduce el cambio: ");
			double cambio = sc.nextDouble();
			
			Convertirdinero octubre = new Convertirdinero(cambio);
			System.out.println(octubre.toString());

			System.out.println("Mete los dólares que quieres convertir a euros: ");
			dinero = sc.nextDouble();
			System.out.println(dinero + " $ son " + octubre.dolaraeuro(dinero) + " €");

			System.out.println("Mete los euros que quieres convertir a dólares: ");
			dinero = sc.nextDouble();
			System.out.println(dinero + " € son " + octubre.euroadolar(dinero) + " $");
			} else {
			System.out.println("El valor introducido no es correcto");
			}

			sc.close();
	}

}
