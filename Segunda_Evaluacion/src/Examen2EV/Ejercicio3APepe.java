package Examen2EV;

public class Ejercicio3APepe {
	public static void insertionSortInverted(int[] data) {
		for (int i = 1; i < data.length; i++) {
		Integer aux = data[i];
		int j = i - 1;
		while (j >= 0 && data[j] < aux) {
		data[j + 1] = data[j];
		j--;
		}
		data[j + 1] = aux;
		}
		}

		public static int[] fusionArrays(int[] arr1, int[] arr2) {
		int[] arr = new int[arr1.length + arr2.length];
		int i = 0, j = 0;
		for (int k = 0; k < arr.length; k++) {
		if (i < arr1.length && j < arr2.length) {
		if (arr1[i] >= arr2[j]) {
		arr[k] = arr1[i];
		i++;
		if (i == arr1.length) k++;

		} else {
		arr[k] = arr2[j];
		j++;
		if (j == arr2.length) k++;
		}
		}
		if (i < arr1.length && j >= arr2.length) {
		arr[k] = arr1[i];
		i++;
		}
		if (j < arr2.length && i >= arr1.length) {
		arr[k] = arr2[j];
		j++;
		}
		}

		return arr;
		}

}
