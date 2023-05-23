package Array;

import java.util.Arrays;

public class Resuelto01B {

	public static int getRandom() {
		return (int) (Math.random()*100+1);
	}
	
	public static void listar(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
	
	public static void ordena(int[] arr) {
		Arrays.sort(arr);
	}
	
	public static int[] generaArray() {
		
		int[] fuera = new int[30];
		
		for (int i=0; i<fuera.length; i++) {
			fuera[i] = getRandom();
	}
		return fuera;
}
	
	public static void main(String[] args) {
		
		
		int[] este = generaArray();
		listar(este);
		ordena(este);
		listar(este);
	}
}
