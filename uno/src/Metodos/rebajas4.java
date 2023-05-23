package Metodos;

import java.util.Scanner;

public class rebajas4 {

	// Métodos del programa

	public static double descubrePorcentaje(double original, double actual) {
		return (original - actual) * 100 / original;
	}

	public static double descubreOriginal(double porcentaje, double actual) {
		return (actual / (100 - porcentaje) * 100);
	}

	public static double descubreActual(double original, double porcentaje) {
		return (original / 100) * (100 - porcentaje);
	}

	// Funciones del programa

	public static void main(String[] args) {
		boolean continuar = true;
		Scanner sc = new Scanner(System.in);
		while (continuar) {
			System.out.println(
					"Seleccione 1 para calcular el porcetaje de descuento, 2 para calcular un precio original, 3 para calcular un precio con descuento y 4 para cerrar el programa: ");
			int opcion = sc.nextInt();
			double original;
			double actual;
			double porcentaje;
			switch (opcion) {

			case 1:
				System.out.println("Dime cuanto costaba: ");

				original = sc.nextDouble();

				System.out.println("Dime cuanto cuesta actualmente: ");

				actual = sc.nextDouble();

				porcentaje = descubrePorcentaje(original, actual);

				System.out.println("El descuento es de un " + porcentaje + "%");
				break;

			case 2:
				System.out.println("Dime cuanto cuesta: ");

				actual = sc.nextDouble();

				System.out.println("Dime el porcentaje de descuento: ");

				porcentaje = sc.nextDouble();

				original = descubreOriginal(porcentaje, actual);

				System.out.println("El precio era de  " + original + "€");
				break;

			case 3:
				System.out.println("Dime cuanto costaba: ");

				original = sc.nextDouble();

				System.out.println("Dime el descuento: ");

				porcentaje = sc.nextDouble();

				actual = descubreActual(original, porcentaje);

				System.out.println("El precio actual es:  " + actual + "€");

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
