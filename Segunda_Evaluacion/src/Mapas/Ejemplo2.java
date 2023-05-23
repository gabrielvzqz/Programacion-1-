package Mapas;

import java.util.HashMap;
import java.util.Map;

public class Ejemplo2 {

	public static void main(String[] args) {
		
		//declaramos un mapa
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		
		//metodo para añadir parejas al map
		m.put(924, "Amalia Núñez");
		m.put(921, "Cindy Nero");
		m.put(700, "César Vázquez");
		m.put(219, "Víctor Tilla");
		m.put(537, "Alan Brito");
		m.put(605, "Esteban Quito ");
		
		System.out.println(m.get(924));
		System.out.println(m.get(700));
		if(m.containsKey(135))
			System.out.println(m.get(135));
		else
			System.out.println("Clave no existente");
		
		System.out.println("Todas las entradas del diccionario extraídas con entrySet");
		System.out.println(m.entrySet());
		
		System.out.println("\nExtraídas del diccionario una por una");
		for(Map.Entry pareja : m.entrySet()) {
			System.out.println(pareja);
		}
		for (Map.Entry pareja : m.entrySet()) {
			System.out.print(pareja.getKey() + "\t");
			System.out.println(pareja.getValue());
		}

}
}
