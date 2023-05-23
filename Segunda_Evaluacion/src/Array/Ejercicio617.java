package Array;

import java.util.Scanner;

public class Ejercicio617 {
	
	public static int obtenerNumCar(String[] arr, char c) {
		
		int total = 0;
		for (int k = 0; k <arr.length; k++) {
			
			System.out.println("Cadena: " + k + " es " + arr[k]);
			int parcial=0;
			for(int j=0;j<arr[k].length();j++) {
				System.out.println("Carácter: " + j + " es: " + arr[k].charAt(j));
				char letra = arr[k].charAt(j);
				if (letra==c) parcial++;
				}
			System.out.println("Esta cadena tiene " + parcial + " veces la letra " +c);
			total+=parcial;
		}
		return total;

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String parrafo = "v are uvhj aeiou bkjhkj aeiou   rg";		
		String cads[] = parrafo.split(" ");	
	sc.close();
}
}
