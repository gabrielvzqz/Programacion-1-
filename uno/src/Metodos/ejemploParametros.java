package Metodos;

import java.util.Arrays;

public class ejemploParametros {
	
	public static void cambiar(int x) {
		x++;
	}

	public static void cambiar2(int [] par) {
		int[] aux=par;
		aux[0]++;
	}
	public static void main(String[] args) {
		int x=3;
		int[] matriz = {1,2,3};
		
		cambiar(x); //no hemos cambiado la variable original
		System.out.println(x);
		
		cambiar2(matriz);
		System.out.println(Arrays.toString(matriz));
		
	}
}
