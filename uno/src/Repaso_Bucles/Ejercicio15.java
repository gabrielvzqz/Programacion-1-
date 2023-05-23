package Repaso_Bucles;

import java.util.Scanner;

/*15. Dadas las edades y alturas de 5 alumnos, mostrar la edad y
la estatura media, la cantidad de alumnos mayores de 18 años, y
la cantidad de alumnos que miden más de 1.75.*/

public class Ejercicio15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int altura = 0;
		int edad = 0;
		int sumaaltura = 0;
		int mediaaltura = 0;
		int sumaedad = 0;
		int mediaedad = 0;
		int mayores = 0;
		int altos = 0;
		for(int i =1;i<=5;i++) {
			System.out.println("Introduce altura en centimetros: ");
			altura=sc.nextInt();
			
			sumaaltura=sumaaltura+altura;
			mediaaltura=sumaaltura/5;
			System.out.println("Introduce edad: ");
			edad=sc.nextInt();

			sumaedad=sumaedad+edad;
			mediaedad=sumaedad/5;

			if(edad>18) {
				mayores++;
			}
			if(altura>175) {
				altos++;
			}
		}
			System.out.println("La altura media es de " + mediaaltura + " centímetros.");
			System.out.println("La edad media es de " + mediaedad + " años.");

			System.out.println("Hay " + mayores + " con más de 18 años.");
			System.out.println("Hay " + altos + " que miden más de 1.75.");
		sc.close();		

	}

}
