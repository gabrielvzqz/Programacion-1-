package Metodos;

import java.util.Scanner;

public class Ejerciciocelsiusafarenheit {
	//Vamos a preparar un método que haga la conversion de celsius a farenheit//
	public static double fahrenheitacelsius(double f) {
		
		double c = 5*(f-32)/9;
		return c;
	}
	public static double celsiusafahrenheit(double c) {
		
		double f = (9*c/5)+32;
		return f;
	}
	

	public static void main(String[] args) {
		double fahrenheit,celsius;
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor introduzca número de grados celsius: ");
		celsius =sc.nextDouble();
		fahrenheit=celsiusafahrenheit(celsius);
		System.out.println("En fahrenheit son "+fahrenheit+" ºF.");
		
		System.out.println("Introduce fahrenheit: ");
		fahrenheit=sc.nextDouble();
		celsius=fahrenheitacelsius(fahrenheit);
		System.out.println("En celsius son "+celsius+" ºC.");

		
		
		
		sc.close();
	}

}