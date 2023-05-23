package Examen2EV;

import java.util.Scanner;

public class Ejercicio3BPepe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean keep = true;
		String result = "a";

		System.out.println("Introduce palabras hasta encontrar la palabra /fin/");
		while (keep) {
			System.out.println("Palabra: ");
			String word = sc.next();
			if (word.equalsIgnoreCase("fin"))
				keep = false;
			if (result.compareToIgnoreCase(word) < 0)
				result = word;
		}

		System.out.println("Ultima palabra alfabeticamente: " + result);

		sc.close();
	}

}
