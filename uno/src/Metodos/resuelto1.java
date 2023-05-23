package Metodos;

import java.util.Scanner;

public class resuelto1 {

	public static double celsiusToFarenheit(double temp) {
		return (1.8) * temp + 32;
	}

	public static double farenheitToCelsius(double temp) {
		return (temp - 32) / 1.8;
	}

public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	int opcion=0;
	int temperatura;
	
	do {
	System.out.println("Pulsa 1 para pasar de Cº a Fº");
	System.out.println("Pulsa 2 para pasar de Fº a Cº");
	System.out.println("Pulsa 3 para salir");
	opcion = sc.nextInt();
	
	switch (opcion) {
	case 1:
	System.out.println("Introduce los Cº qu desea cambiar: ");
	temperatura = sc.nextInt();	
	System.out.println("Son " + celsiusToFarenheit(temperatura) + "Fº");
		break;
		
	case 2:
	System.out.println("Introduce los Fº qu desea cambiar: ");
	temperatura = sc.nextInt();
	System.out.println("Son " + farenheitToCelsius(temperatura) + "Cº");
		break;
		
	case 3:
	System.out.println("Se acabó el programa.");
	default:
		System.out.println("¡Opción no válida!");
	
	}
	}while (opcion == 1 || opcion == 2);

	sc.close();
	}
}