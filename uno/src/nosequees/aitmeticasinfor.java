package nosequees;

import java.util.Scanner;

public class aitmeticasinfor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int ini;
		int relacion;
		int corte;
		int cont = 0;
		int suma =0;
		
		System.out.println("GENERADOR DE PROGRESIÓN ARITMÉTICA");
		System.out.println("Término inicial: ");
		ini=sc.nextInt();
		System.out.println("Relación: ");
		relacion=sc.nextInt();
		System.out.println("Corte del bucle:");
		corte=sc.nextInt();
		while (ini<=corte) {
			System.out.println(ini + ", ");
			ini=ini+relacion;
			suma=suma+ini;
			cont++;
			}
		System.out.println("Has listado " + cont + " números.");
		System.out.println("La suma de los números es: " + suma);
		sc.close();
	}

}