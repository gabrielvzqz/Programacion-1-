package Programas_sencillos;

import java.util.Scanner;

/*construir un programa que, dado el radio de una esfera, calcule
 * y devuelva por pantalla el valor de la superficie
 * y el volumen de la esfera correspondiente
 * volumen 4PIR^3 / 3
 * superficie= 4PIR^2
 * */
public class Ejercicio15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double radio=0;
		System.out.println("Introduce el valor del radio: ");
		radio=sc.nextDouble();
		
		System.out.println("El volumen es: "+((radio*radio*radio*4*3.1415)/3));		
		System.out.println("La superficie es: "+(radio*radio*4*3.1415));

		sc.close();
	}

}
