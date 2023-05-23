package ExamenGabrielVazquez;

import java.util.Scanner;

/*Pedir por teclado la introducción de una tabla de 10 elementos
numéricos enteros.
Eliminar el elemento situado en una posición pedida por teclado al
usuario sin dejar huecos en la tabla.
Mostrar la tabla por consola después de la eliminación de dicho
elemento.*/
public class Ejercicico1A {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr= new int [10];
		int numero=0;
		
		for (int i=0; i<arr.length; i++) {
			System.out.println("Introduce un número: ");
			numero=sc.nextInt();
		
			arr[i]=numero;
		}
		int elim = 0;
		System.out.println("¿Que posición deseas eliminar?");
		elim=sc.nextInt();
		for(int i=0;i<elim;i++) {
			System.out.print(arr[i]);
			System.out.print(", ");
		}
		for(int i=elim+1;i<10;i++) {
			System.out.print(arr[i]);
			System.out.print(", ");
		}
	sc.close();
	}
}
