package Array;

import java.util.Arrays;

public class Primeros100Pares {

	public static void main(String[] args) {
		//Habrá que almacenar 20 enteros.
		int[] arr = new int[100];
		
		//La primera posición la ponemos directamente.
		arr[0]=0;
		arr[1]=2;
		
		//El resto se va llenando secuencialmente, a base de cálculos.
		for(int i = 2; i < arr.length; i++) {
			arr[i] = arr[i-1]+arr[1];//procedimiento
		}
		System.out.println(Arrays.toString(arr));
	}
	
}
