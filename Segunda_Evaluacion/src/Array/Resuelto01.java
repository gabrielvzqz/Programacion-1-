package Array;

import java.util.Arrays;

public class Resuelto01 {
	
	private static int[] lista;
	final static int POS=50;
	final static int LIMITE=100;
	
	public static int getRandom() {
		return (int) (Math.random()*LIMITE+1);
	}
	
	public static void muestra() {
		for (int i=0; i<lista.length; i++) {
			System.out.println(lista[i] + " ");
		}
	}
	public static void listar() {
		Arrays.toString(lista);
	}
	
	public static void ordena() {
		Arrays.sort(lista);
	}
	
	public static void generaArray() {
		for (int i=0; i<lista.length; i++) {
			lista[i] = getRandom();
	}
	}
	
	public static void main(String[] args) {
		
		lista = new int[POS];
		generaArray();
		System.out.println("Array desordenado");
		muestra();
		ordena();
		System.out.println();
		System.out.println("Array ordenado");
		muestra();
		}
	}


