package Array;

import java.util.Arrays;

public class Resuelto03 {
	
	public static int sumaValores(int[] arr) {
		int suma=0;
		for(int i=0;i<arr.length;i++) {
			suma+=arr[i] = 2*i;
		}
		return suma;
	}

	public static int[] rellenaPares(int[] arr) {
		
		for(int i =0; i<arr.length;i++) {
			arr[i]=2*i;
		}
		return arr;
	}
	public static int[] rellenaImpares(int[] arr) {
		
		for(int i =0; i<arr.length;i++) {
			arr[i]=2*i+1;
		}
		return arr;
	}
	public static void main(String[] args) {
		
		int[] proba = new int[15];
		int[] sumaPar;
		int [] sumaImpar;
		
		sumaPar = rellenaPares(proba);
		sumaImpar = rellenaImpares(proba);

		System.out.println(Arrays.toString(sumaPar));
		System.out.println(Arrays.toString(sumaImpar));
		System.out.println(Arrays.toString(rellenaPares(proba)));
		System.out.println("Suma del array de pares: " + sumaValores(sumaPar));
		System.out.println("Suma del array de impares: " + sumaValores(sumaImpar));

	}
}
