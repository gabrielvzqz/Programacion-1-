package Programas_sencillos;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double peso=0;
		double altura=0;
		System.out.println("Introduce tu peso: ");
		peso=sc.nextDouble();
		System.out.println("Introduce tu altura: ");
		altura=sc.nextDouble();
		double ims=(peso/(altura*altura));
		System.out.println("El IMS es: "+ims);
		if (ims<18 || ims>25)
		System.out.println("Usted no está saludable.");
		else 
		System.out.println("Usted está saludable.");
	sc.close();
	}

}
