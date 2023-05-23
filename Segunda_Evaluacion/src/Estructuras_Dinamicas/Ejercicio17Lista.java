package Estructuras_Dinamicas;

import java.util.ArrayList;

public class Ejercicio17Lista {

	public static void main(String[] args) {
		
		//constructores
		ArrayList<String> lista = new ArrayList<String>();
		//constructor con size
		ArrayList<String> otra = new ArrayList<String>(12);

		
		//void add(int index, E element)
		
		lista.add("uno");
		lista.add(1, "dos");
		
		System.out.println(lista);
		
		otra.add("uno");
		otra.add(0,"dos");
		System.out.println(otra);
		
		//void clear() Permite limpiar el ArrayList
		
		otra.clear();
		System.out.println(otra);
		
		//boolean isEmpty();
		System.out.println(otra.isEmpty());
		
		//E get(int index) Obtiene el elemento de la posición pasada por parámetro
		
		/*int lastIndexOf(Object o)
		 * Devuelve el indice de la última ocurrencia del elemento. Si el elemento no se encuentra por un rato devuelve -1*/
		
		System.out.println(lista.lastIndexOf("tres"));
		
		System.out.println(lista.lastIndexOf("dos"));
		
		/*Object clone();
		 * Permite realizar el clone de un ArrayList*/
		ArrayList<String> doble;
		
		doble=(ArrayList<String>) lista.clone();
		System.out.println(lista);
		System.out.println(doble);

		lista.add("tres");
		doble.add(0,"cero");
		
		System.out.println(lista);
		System.out.println(doble);
		
		/*boolean contains(Object o)
		 * Devuelve TRUE si el objeto pasado por parámetro existe*/
		
		System.out.println(lista.contains("cero"));
		
		/*E remove(int index)
		 * Elimina el elemento que ocupa la posición pasada por parámetro*/
		
		doble.remove(2);
		System.out.println(doble);
		
		/*boolean remove(Object o)
		 * Elimina la primera ocurrencia del elemento pasado por parámetro*/
		
		System.out.println(doble.remove("cero"));
		System.out.println(doble);
		
		/*E se(int index, E element)  Remplaza el elemento pasado por parámetro en la posición indicada*/
		
		lista.set(0, "ochomil");
		System.out.println(lista);

		
	}
}
