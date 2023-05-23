package Repaso_Bucles;

import java.util.Scanner;

/*19. Dadas 6 notas, escribir la cantidad de alumnos aprobados,
condicionados (=4) y suspensos.*/

public class Ejercicio19 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int nota = 0;
		int suspenso = 0;
		int aprobado = 0;
		int condicionado = 0;
		for(int i=0; i<6;i++) {
		System.out.println("Introduce una nota del 1 al 10: ");
		nota=sc.nextInt();
		
		if(nota>=0 && nota<=10) {
			if(nota>4) {
				aprobado++;
			}
			if(nota==4) {
				condicionado++;
			}
			if(nota<4) {
				suspenso++;
			}

		}
		}
		System.out.println("Hay " + aprobado + " aprobados.");
		System.out.println("Hay " + suspenso + " suspensos.");
		System.out.println("Hay " + condicionado + " condicionados.");
		sc.close();
	}

}
