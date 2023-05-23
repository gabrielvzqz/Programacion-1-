package Array;

import java.util.Arrays;
import java.util.Scanner;

/*Ejercicio 6
 * Escribe un programa que lea 15 numeros por teclado y que los almacena en un array.
 *  Rota los elementos de ese array, es decir, el elemento de la posicion 0 a la 1, etc.
 *  El elemento de la última posición debe pasar a la posicion 0. Mustra el array resultante*/
public class Repaso02 {


	static int[] pideNumeros(int[] a) {
		
		Scanner sc = new Scanner(System.in);
		for (int i =0; i<a.length;i++) {
			System.out.println("Indice " + i + ": ");
			a[i]=sc.nextInt();
		}
		return a;
	}
	static int[] rotarPosicion(int[] a) {

		int aux=0;
		aux=a[a.length-1];
		
		for(int i = a.length-1;i>0;i--) {
			a[i]=a[i-1];
		}
		a[0]=aux;
		return a;
		
	}
	static int[] rotarVariasPosiciones(int[]a, int pos) {
		for (int j=0;j<pos;j++) rotarPosicion(a);
		return a;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int [15];
		int numr=0;
		pideNumeros(arr);
		System.out.println(Arrays.toString(arr));
		rotarPosicion(arr);
		System.out.println("Rotando uno a la derecha: ");
		System.out.println(Arrays.toString(arr));
		System.out.println("Cuantas veces quieres que rote? ");
		numr=sc.nextInt();
		for (int i=0;i<numr;i++) {rotarPosicion(arr);
		}
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
}
