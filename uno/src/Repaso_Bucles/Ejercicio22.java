package Repaso_Bucles;

import java.util.Scanner;

/*22. Pedir 5 calificaciones de alumnos y decir al final si hay
algún suspenso.*/

public class Ejercicio22 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int nota=0;
		int suspenso=0;
		
		for(int i=0;i<5;i++) {
			System.out.println("Introduce una nota: ");
			nota=sc.nextInt();
			if(nota<5) {
				suspenso++;
			}
		}
			if(suspenso>0) {
				System.out.println("Hay algún suspenso.");
			
			}
			else{
				System.out.println("No hay ningún suspenso.");
		}
		sc.close();
	}

}
