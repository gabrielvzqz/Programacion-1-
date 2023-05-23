package Mapas;

import java.util.ArrayList;

import java.util.Collections;

public class Ejemplo6Cartas {

	
	static ArrayList<Carta> mano = new ArrayList<>();
	
	public static void main(String[] args) {
		
			Carta c = new Carta();
			System.out.println(c.toString());
			mano.add(c);
			
			do {
				
				Carta nueva = new Carta();
				
				if(!mano.contains(nueva)) {
					System.out.println(nueva.toString());
					mano.add(nueva);
				}else {
					System.out.println(nueva.toString());
					System.out.println("Carta repetida");
				}
				
			}while(mano.size()<5);
			
		System.out.println("Mano obtenida");
		for(Carta car : mano) {
			System.out.println(car.toString());
		}
		
		Collections.sort(mano);
		System.out.println("Mano obtenida ordenada");
		for(Carta car : mano) {
			System.out.println(car.toString());
		}
	}
}
