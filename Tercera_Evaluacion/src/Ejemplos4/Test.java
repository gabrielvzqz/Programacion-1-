package Ejemplos4;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;

public class Test {
	public static void main(String[] args) {
		Motocicleta MotoBarata = new Motocicleta(Color.red, (short) 125, (short) 25);
		Motocicleta MotoBarata2 = new Motocicleta(Color.red, (short) 125, (short) 25);
		Motocicleta MotoCara = new Motocicleta(Color.yellow, (short) 1000, (short) 90);

		Camion CamionNormal = new Camion(Color.red, (byte) 4, (byte) 2, (short) 4000, (short) 300);
		Camion CamionEnorme = new Camion(Color.red, (byte) 24, (byte) 6, (short) 15000, (short) 800);
		Coche cochecito = new Coche(Color.CYAN, (byte) 4, (byte) 5, (short) 104, (short) 5);

		MotoBarata.setNumeroDePlazas((byte) 1);
		/*System.out.println(MotoBarata.getNumeroDePlazas());
		System.out.println(MotoBarata2.getCilindrada());
		System.out.println(CamionEnorme.getEjes());
		System.out.println(CamionNormal.getEjes());
		System.out.println(MotoCara.getCilindrada());*/
		
		
		ArrayList<Vehiculo> lista = new ArrayList<Vehiculo>();
		
		lista.add(CamionEnorme);
		lista.add(MotoBarata2);
		lista.add(MotoBarata);
		lista.add(MotoCara);
		lista.add(CamionNormal);
		lista.add(cochecito);


		for(Vehiculo v: lista) {
			System.out.println(v);
			System.out.println("A pagar: " + v.pagarRodaje());
		}
		
		Collections.sort(lista);
		
		System.out.println("Ordenados de mayor a menor");
		for(Vehiculo v : lista) {
			System.out.println(v);
			System.out.println("A pagar: " + v.pagarRodaje());
		}
		System.out.println("REPOSTAMOS...");
		for(Vehiculo v : lista) {
			System.out.println(v);
			System.out.println(v.pagarCarburante());
		}
	}
}