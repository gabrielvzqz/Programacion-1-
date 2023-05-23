package ExamenGabrielVazquez;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import Mapas.Carta;

public class Ejercicio6A {

	static HashMap<String,Integer> puntaje = new HashMap<String,Integer>();
	
	static void ponPuntosMapa() {
		puntaje.put("A", 11);
		puntaje.put("K", 10);
		puntaje.put("Q", 10);
		puntaje.put("J", 10);
		puntaje.put("10", 10);
		puntaje.put("9", 9);
		puntaje.put("8", 8);
		puntaje.put("7", 7);
		puntaje.put("6", 6);
		puntaje.put("5", 5);
		puntaje.put("4", 4);
		puntaje.put("3", 3);
		puntaje.put("2", 2);

	}

	static ArrayList<Carta> mano = new ArrayList<Carta>();
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		ponPuntosMapa();

		do {

			Carta nueva = new Carta();

			if (!mano.contains(nueva)) {
				mano.add(nueva);
			} else {
				System.out.println("Carta repetida");
			}

		} while (mano.size() < 7);

		Collections.sort(mano);
		System.out.println("Mano obtenida ordenada");
		for (Carta car : mano) {
			System.out.println(car.toString());
		}
		

	}
}