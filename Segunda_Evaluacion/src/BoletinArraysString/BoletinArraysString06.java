package BoletinArraysString;

import java.util.Arrays;

/*Reto 4: usando el método compareTo, debe ordenar alfabeticamente un array de cadenas de texto*/

public class BoletinArraysString06 {

	public static void main(String[] args) {
		
		String[] arr= {"uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez"};
		System.out.println(Arrays.toString(arr));
		
		//Usar compareTo para ordenar
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
