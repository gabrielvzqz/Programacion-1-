package Array;

import java.util.Arrays;

public class Ejercicio614 {
	
	public static int[] obtenerLongCadenas(String[] arr) {
		int[] largos = new int[arr.length];
		
		for(int i = 0; i<arr.length;i++) {
			largos[i]=arr[i].length();
			}
		return largos;
	}
	public static void main(String[] args) {
		
		String parrafo = "Hola buenas tardes Pepe,   soy Gabriel";
		String cads[] = parrafo.split(" ");
		
		System.out.println(Arrays.toString(obtenerLongCadenas(cads)));
	}

}