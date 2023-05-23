package BoletinArraysString;

import java.util.Scanner;

public class BoletinArraysString07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String cadena1, cadena2;
		System.out.println("Introduce una cadena: ");
		cadena1= sc.nextLine();
		System.out.println("Introduce otra cadena: ");
		cadena2= sc.nextLine();
		
		String[] arr1 = cadena1.split(" ");
		/*String[] arr2 = cadena1.split(" ");*/
		
		/*for(int i = 0; i<arr1.length;i++) {
			for (int j = 0; j<arr2.length;j++) {
				if(arr1[i].equals(arr2[j])) {
					arr1[i]=arr1[i].toUpperCase();
				}
			}
		}*/
		for(int i = 0; i<arr1.length;i++) {
			if(cadena2.contains(arr1[i]))
					arr1[i]=arr1[i].toUpperCase();
				}

		System.out.println("Esta es la primera frase: " + cadena1);
		System.out.println("Esta es la segunda frase: " + cadena2);

		String cadenaNueva = "";
		for (int i = 0; i <arr1.length;i++) {
			cadenaNueva = cadenaNueva.concat(arr1[i]) + " ";
		}
		System.out.println("Esta es la pimera cadena modificada: " + cadenaNueva);
		sc.close();
	}
}
