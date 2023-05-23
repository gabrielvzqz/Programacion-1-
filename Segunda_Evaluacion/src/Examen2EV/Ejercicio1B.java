/*Generar 15 números enteros entre 300 y 500 y almacenarlos en un
ARRAY. Listar por pantalla en qué posiciones se encuentran los
números terminados en 7.*/

package Examen2EV;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1B {

	public static int generarNumero() {
		Random r = new Random();
		return r.nextInt(300, 500);
	}

	public static void main(String[] args) {

		double[] arr = new double[20];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = generarNumero();
		}
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if (((arr[i]-7) % 10)== 0) {
				System.out.println("El número " + arr[i] + " en la posición " + i + " acaba en 7.");
			}
		}
	}

}
