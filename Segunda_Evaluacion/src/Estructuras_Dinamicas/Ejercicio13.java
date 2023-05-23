package Estructuras_Dinamicas;

import java.util.ArrayList;
import java.util.Collections;

/*Ejercicio 1
Crea un ArrayList con los nombres de 6 compañeros de
clase. A continuación,
muestra esos nombres por pantalla. Utiliza para ello un
bucle for que recorra
todo el ArrayList sin usar ningún índice.*/
public class Ejercicio13 {

	public static void main(String[] args) {
		
		ArrayList<String> compis = new ArrayList<String>();
		
		compis.add("Ana");
		compis.add("Dani");
		compis.add("Luis");
		compis.add("Laura");
		compis.add("Gabo");
		compis.add("Sara");
		
		Collections.sort(compis);
		
		for(String s:compis)
		System.out.println(s);

	}
}
