package Repaso_Bucles;

import java.util.Scanner;

/*17. Una empresa que se dedica a la venta de desinfectantes
necesita un programa para gestionar las facturas. En cada
factura figura: el código del artículo, la cantidad vendida en
litros y el precio por litro.
Se pide de 5 facturas introducidas: Facturación total, cantidad
en litros vendidos del artículo 1 y cuantas facturas se
emitieron de más de 600 €.*/

public class Ejercicio17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int codigoarticulo = 0;
		int articulo1 = 0;
		double litros;
		double litros1 = 0;
		double precio;
		double costo = 0;
		double preciototal = 0;
		int masde600 = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Introduzca el código del artículo: ");
			codigoarticulo = sc.nextInt();
			System.out.println("¿Qué cantidad de litros de desinfectante ha comprado? ");
			litros = sc.nextDouble();
			System.out.println("¿Cual es el precio por litro de dicho desinfectante? ");
			precio = sc.nextDouble();
			costo = precio * litros;
			preciototal = preciototal + costo;
			if (i < 1) {
				articulo1 = codigoarticulo;
			}
			if (codigoarticulo == articulo1) {
				litros1 = litros1 + litros;
			}
			if (costo > 600) {
				masde600++;
			}
		}

		System.out.println("Facturación total: " + preciototal + "€.");
		System.out.println("Se han vendido " + litros1 + "L del primer artículo.");
		System.out.println("Se emitieron " + masde600 + " facturas de más de 600€.");
		sc.close();
	}
}
