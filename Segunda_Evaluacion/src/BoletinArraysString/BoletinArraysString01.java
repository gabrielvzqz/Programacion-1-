/*1: Haga un programa que muestre por pantalla una cadena de texto, pero escrita del revés
 * Por ejemplo, si se parte de la cadena Hola Mundo se debe mostrar odnuM aloH.*/

package BoletinArraysString;

import java.util.Scanner;

public class BoletinArraysString01 {

	public static void main(String[] args) {
		
		String cadena, inversa;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cadena para invertirla: ");
		cadena=sc.nextLine();
		
		//Escrita en orden inverso
		
		StringBuilder sb = new StringBuilder(  cadena  );
		inversa=sb.reverse().toString();
		System.out.println(cadena);
		System.out.println(inversa);
		sc.close();
	}
}
