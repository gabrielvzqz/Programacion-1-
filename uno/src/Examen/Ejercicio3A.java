package Examen;

import java.util.Scanner;

public class Ejercicio3A {
	
	public static double cmpies(double cm) {
		
		double pies = cm/30.48;
		return pies;
	}
	public static double cmpulgadas(double cm) {
		
		double pulgadas = cm/2.54;
		return pulgadas;
	}
	public static double piescm(double pies) {
		
		double cm = pies*30.48;
		return cm;
	}
	public static double pulgadascm(double pulgadas) {
		
		double cm = pulgadas*2.54;
		return cm;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double alturacm;
		double alturapies;
		double alturapulgadas;
		
		System.out.println("Introuduzca su altura en cm: ");
		alturacm=sc.nextDouble();
		alturapies=cmpies(alturacm);
		alturapulgadas=cmpulgadas(alturacm);
		System.out.println("La altura en pies son: " + alturapies + " pies; y en pulgadas son : " + alturapulgadas + " pulgadas.");
		
		System.out.println("Introuduzca su altura en pies: ");
		alturapies=sc.nextDouble();
		alturacm=piescm(alturapies);
		System.out.println("La altura en pies son: " + alturacm + " cm");

		
		System.out.println("Introuduzca su altura en pulgadas: ");
		alturapulgadas=sc.nextDouble();
		alturacm=pulgadascm(alturapulgadas);
		System.out.println("La altura en cm son: " + alturacm + " cm");


		sc.close();
		
	}

}
