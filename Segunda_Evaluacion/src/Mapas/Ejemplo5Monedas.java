package Mapas;

import java.util.ArrayList;

public class Ejemplo5Monedas {

	static ArrayList<Moneda> lista = new ArrayList();

	public static void main(String[] args) {

		// Lista con 6 monedas

		/*
		 * for(int i=0; i<10;i++) { Moneda m = new Moneda();
		 * System.out.println(m.toString()); }
		 */

		int contador = 1;
		Moneda m = new Moneda();
		System.out.println(m.toString());
		lista.add(m);
		do {
			Moneda ultima = new Moneda();
			if (ultima.getLado().equals(m.getLado()) || ultima.getValor().equals(m.getValor())) {
				lista.add(ultima);
				System.out.println(ultima.toString());
				m = ultima;
			} else
				//System.out.print(ultima.toString());
				//System.out.println(" no vale");
				;

		} while (lista.size() < 6);
		System.out.println("6 monedas generadas");
		for (Moneda mon : lista) {
			System.out.println(mon.toString());
		}

	}
}