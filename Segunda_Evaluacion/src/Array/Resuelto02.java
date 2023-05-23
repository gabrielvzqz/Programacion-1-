package Array;

import java.util.Arrays;

public class Resuelto02 {
	
	public static int[] completarArray(int[] arr) {
		
		for(int i=0;i<arr.length; i++) arr[i]=i;
			return arr;
	}
	
	public static int[] rellenarArray(int[] arr, int valor){
		
		return arr;
	}
	public static void main(String[] args) {
		
		int[] altos = {111,222,333,444,555,666,777,888,999};
		System.out.println(Arrays.toString(altos));
		
		completarArray(altos);
		System.out.println(Arrays.toString(altos));
	}

}
