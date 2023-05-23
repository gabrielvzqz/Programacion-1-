package Array;

import java.util.Arrays;
import java.util.Random;

/*Ejercicio 4 Define tres arrays de 20 numeros enteros cada uno, con 
 * nombre, numero, cuadrado y cubo.carga el array numero con valores entre 0 y 100.
 * En el cuadrado se deben almacenar los cuadrados de los valores que hay en el array 
 * numero. En el arrat cubi se deben almacenar los cubos de los valores que hay en número.
 * A continuacion, muestra el contenido de los tres arrays dispuesto en tres columnas
 */
public class Repaso01 {

	public static int generarNumero() {
		Random r = new Random();
		return r.nextInt(10);
	}

	public static void burbuja(int[] arr) {

		int aux;
		for (int i = arr.length; i > 0; i--) {
			for (int j = 0; j < i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					aux = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = aux;
				}
			}

		}

	}

	public static void main(String[] args) {

		int[] numero = new int[20];
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];

		for (int i = 0; i < numero.length; i++) {
			numero[i] = generarNumero();
		}
		System.out.println(Arrays.toString(numero));
		for (int i = 0; i < numero.length; i++) {
			cuadrado[i] = (int) Math.pow(numero[i], 2);
		}
		System.out.println(Arrays.toString(cuadrado));

		for (int i = 0; i < numero.length; i++) {
			cubo[i] = (int) Math.pow(numero[i], 3);
		}
		System.out.println(Arrays.toString(cubo));

		// ordenado por columnas

		System.out.println("Numero---Cuadrado---Cubo");
		for (int j = 0; j < numero.length; j++) {
			System.out.print(numero[j] + " ");
			System.out.print(cuadrado[j] + " ");
			System.out.print(cubo[j] + " ");
			System.out.println("");
		}
		// por burbuja
		burbuja(numero);
		burbuja(cuadrado);
		burbuja(cubo);
		System.out.println(Arrays.toString(numero));
		System.out.println(Arrays.toString(cuadrado));
		System.out.println(Arrays.toString(cubo));
	}
}
