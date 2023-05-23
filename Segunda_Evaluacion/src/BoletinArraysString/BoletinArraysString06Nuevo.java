package BoletinArraysString;

import java.util.Arrays;

public class BoletinArraysString06Nuevo {

	public static void burbuja(String[] arr) {

		String aux;
		for (int i = arr.length; i > 0; i--) {
			for (int j = 0; j < i - 1; j++) {
				// swap --> use usted compareTo
				//if (arr[j] > arr[j + 1]) {
				if(arr[j].compareTo(arr[j+1]) > 0) {
					aux = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = aux;
				}
			}
		}
	}

	public static void main(String[] args) {

		String[] arr = { "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez" };
		System.out.println(Arrays.toString(arr));
		// Usar compareTo para ordenar
		burbuja(arr);
		System.out.println(Arrays.toString(arr));
		//Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr));
		float[] mat= {1.1f,2.34f,1.15f,7.3f,6.2f};
		System.out.println(Arrays.toString(mat));
	}
}