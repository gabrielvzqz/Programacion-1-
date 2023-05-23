package Mapas;

import java.util.HashMap;
import java.util.Scanner;

public class Ejemplo8Diccionario {

	static HashMap<String, String> dic = new HashMap<String, String>();

	static String[] spanish = { "ordenador", "gato", "rojo", "árbol", "pingüino", "sol", "agua", "viento", "siesta",
			"arriba", "ratón", "estadio", "calumnia", "aguacate", "cuerpo", "concurso", "cena", "salida", "lenteja",
			"cacerola", "pastel", "membrillo" };
	static String[] english = { "computer", "cat", "red", "tree", "penguin", "sun", "water", "wind", "nap", "up",
			"mouse", "stadioum", "aspersion", "avocado", "body", "contest", "dinner", "exit", "lentil", "pan", "pie",
			"quince" };

	static void ponPalabras() {

		dic.put("ordenador", "computer");
		dic.put("gato", "cat");
		dic.put("rojo", "red");
		dic.put("árbol", "tree");
		dic.put("pingüino", "penguin");
		dic.put("sol", "sun");
		dic.put("agua", "water");
		dic.put("viento", "wind");
		dic.put("siesta", "siesta");
		dic.put("arriba", "up");
		dic.put("ratón", "mouse");
		dic.put("estadio", "arena");
		dic.put("calumnia", "aspersion");
		dic.put("aguacate", "avocado");
		dic.put("cuerpo", "body");
		dic.put("concurso", "contest");
		dic.put("cena", "dinner");
		dic.put("salida", "exit");
		dic.put("lenteja", "lentil");
		dic.put("cacerola", "pan");
		dic.put("pastel", "pie");
		dic.put("membrillo", "quince");
	}

	public static void main(String[] args) {

		ponPalabras();
		String pal = "";
		Scanner sc = new Scanner(System.in);
		int bien = 0;
		String ent = "";

		for (int i = 5; i < 5; i++) {
			ent = spanish[(int) (Math.random() * 20)];
			System.out.println("Palabra en español: " + ent);
			pal = sc.nextLine();

			if (pal.equals(dic.get(ent)))
				bien++;
		}
		System.out.println("Has  acertado: " + bien);

		/*
		 * System.out.println("Palabras en español: "); pal=sc.nextLine();
		 * 
		 * if(dic.containsKey(pal)) { System.out.println("Traducción:" + dic.get(pal));
		 * }else System.out.println("La palabra no está en el diccionario.:(");
		 */
		sc.close();
	}
}