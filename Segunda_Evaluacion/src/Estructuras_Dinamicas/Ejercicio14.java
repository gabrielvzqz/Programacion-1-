package Estructuras_Dinamicas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio14 {

	public static int generaValorRandom() {
		Random r = new Random();
		return r.nextInt(0,101);
	}
	public static int generarTamaño() {
		Random r = new Random();
		return r.nextInt(0,21);
	}
	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		for(int i =0;i<generarTamaño();i++) {
			lista.add(generaValorRandom());
		}
		System.out.println("Tamaño: " + lista.size());
		System.out.println(lista);
		
		int suma=0;
		for(Integer n: lista) suma+=n;
		
		System.out.println("La suma es: " + suma);
		System.out.println("La media es: " + (double)suma/lista.size());
		
		int minimo=100;
		int maximo=0;
		for(Integer n: lista) {
			if(n>maximo) maximo=n;
			if(n<minimo) minimo=n;
		}
		System.out.println("Máximo es: " + maximo);
		System.out.println("Mínimo es: " + minimo);
		//NOTA: PRIMERO SE ORDENA LA LISTA Y DESPUÉS SE MUESTRA
		Collections.sort(lista);
		System.out.println(lista);
		
		int max = Collections.max(lista);
		int min = Collections.min(lista);
		
		System.out.println(max);
		System.out.println(min);
		
	}
}
