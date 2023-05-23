package Metodos;

import java.util.Scanner;

public class ejerciciometodos {
	//Vamos a preparar un método que haga la conversion de metros a kilometros//
	public static double MetrosaKilometros(double m) {
		
		double k = m/1000;
		return k;
	}
public static double KilometrosaMetros(double k) {
		
		double m = k*1000;
		return m;
	}
	

	public static void main(String[] args) {
		double metros,kilometros;
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor introduzca número de metros: ");
		metros =sc.nextDouble();
		kilometros=MetrosaKilometros(metros);
		System.out.println("En kilometros son "+kilometros+" km.");
		
		System.out.println("Introduce kilometros: ");
		kilometros=sc.nextDouble();
		metros=KilometrosaMetros(kilometros);
		System.out.println("En metros son "+metros+" m.");

		
		
		
		sc.close();
	}

}