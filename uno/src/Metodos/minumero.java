package Metodos;

import java.util.Scanner;

public class minumero {

	// Métodos del programa

	public static double descubreDoble(double numero) {
		return numero*2;
	}

	public static double descubreTriple(double numero) {
		return numero*3;
	}

	public static double descubreCuadruple(double numero) {
		return numero*4;
	}

	// Funciones del programa

	public static void main(String[] args) {
		boolean continuar = true;
		Scanner sc = new Scanner(System.in);
		while (continuar) {
			System.out.println(
					"Seleccione 1 para calcular el doble,\n"
					+ " 2 para calcular el triple,\n"
					+ " 3 para calcular el triple\n"
					+ " y 4 para cerrar el programa.");
			int opcion = sc.nextInt();
			double numero;
			switch (opcion) {

			case 1:
				System.out.println("Dime el número: ");

				numero = sc.nextDouble();

				numero = descubreDoble(numero);
				System.out.println("El doble es "+ numero);
				break;

			case 2:
				System.out.println("Dime el número: ");
				numero = sc.nextDouble();

				numero = descubreTriple(numero);


				System.out.println("El triple es "+ numero);
				break;

			case 3:
				System.out.println("Dime el número: ");
				numero = sc.nextDouble();

				numero = descubreCuadruple(numero);

				System.out.println("El cuadruple es "+ numero);

				break;

			case 4:
				System.out.println("El programa ha finalizado. ");
				continuar = false;
				break;
			default:
				System.out.println("Con este valor el programa no funcionará.");
				sc.close();

			}
		}

	}

}
