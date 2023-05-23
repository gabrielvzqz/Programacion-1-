package Repaso_Bucles;

import java.util.Scanner;

/*18. Igual que el anterior pero suponiendo que no se introduce el
precio por litro. Solo existen tres productos con precios:
1- 0,6 €/litro, 2- 3 €/litro y 3- 1,25 €/litro.*/

public class Ejercicio18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int codigoarticulo = 0;
		double litros = 0;
		double litros1 = 0;
		double precio= 0;
		int articulo1 = 1;
		int articulo2 = 2;
		int articulo3 = 3;
		double costototal= 0;
		int masde600 = 0;
		System.out.println("Los artículos a la venta son los siguientes:\n"
				+ "Artículo 1: 0,6 €/litro"
				+ "Artículo 2: 3 €/litro"
				+ "Artículo 3: 1,25 €/litro");
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduzca el código del artículo: ");
			codigoarticulo = sc.nextInt();
			System.out.println("¿Qué cantidad de litros de desinfectante ha comprado? ");
			litros = sc.nextDouble();
			
			if (codigoarticulo == articulo1) {
				precio=litros*0.6;
				litros1 = litros1 + litros;
			}
			if (codigoarticulo == articulo2) {
				precio=litros*3;
			}
			if (codigoarticulo == articulo3) {
				precio=litros*1.25;
			}
			costototal=costototal +precio;
			if (precio > 600) {
				masde600++;
			}
		}
		System.out.println("Facturación total: " + costototal + "€.");
		System.out.println("Se han vendido " + litros1 + "L del primer artículo.");
		System.out.println("Se emitieron " + masde600 + " facturas de más de 600€.");
		sc.close();
	}
}