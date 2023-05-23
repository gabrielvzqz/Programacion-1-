package Estructuras_Dinamicas;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		//Como convertir un array estático en un array dinámico
		
		String[] unas = {"A Coruña", "Ourense", "Lugo","Pontevedra"};
		
		ArrayList<String> provincias = new ArrayList<String> (Arrays.asList(unas));
		
		System.out.println(provincias);
		
		//Utilizar un foreach versión 2.0
		
		int i = 0;
		for (String p:provincias) {
			System.out.println("Posición: " + i + " valor: " + p);
			i++;
		}
		//Utilizar un foreach versión 3.0 permite modificar el valor del array.
		
		int j = 0;
		for (String p:provincias) {
			//String ent = new Integer(0);
			//ent=provincias.get(j);
			System.out.println("Posición: " + j + " valor: " + p);
			System.out.println("Nuevo valor: ");
			p=sc.next();
			provincias.set(j, p);
			j++;
		}
		System.out.println(provincias);
		sc.close();
	}
	}

