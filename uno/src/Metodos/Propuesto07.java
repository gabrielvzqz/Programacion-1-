package Metodos;

import java.util.Scanner;

/*crea una clase con un método millasAMetros() que toma como parámetro de entrada
*un valor en millas marinas y las convierta a metros.
*Una vez tengas este método escribe otro millasAKilometros() que realice la misma conversión
*pero esta vez exprese el resultado en kilometros.
*Nota: 1 milla marina son 1852 metros*/
public class Propuesto07 {

	//Ambos métodos ststic
	
	//Un método hay que escribirlo
	
	//El segundo método usa el primero
	public static double millasAmetros(double millas) {
		return millas*1852;
	}
	public static double millasAKilometros(double millas) {
		return millasAmetros(millas)/1000;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double metros;
		System.out.println("Introduce las millas: ");
		metros=sc.nextDouble();
		System.out.println("En metros son "+millasAmetros(metros)+"m.");
		System.out.println("En kilometros son "+millasAKilometros(metros)+"km.");
		
		
		sc.close();

	}

}
