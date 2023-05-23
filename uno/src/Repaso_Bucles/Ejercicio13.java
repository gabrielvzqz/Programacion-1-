package Repaso_Bucles;

import java.util.Scanner;

/*13. Pedir 10 números. Mostrar la media de los números positivos,
la media de los números negativos y la cantidad de ceros.*/

public class Ejercicio13 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		double num=0;
		int npositivos = 0;
		double sumapositivos = 0;
		double mediapositivos = 0;
		int nnegativos = 0;
		double sumanegativos = 0;
		double medianegativos = 0;
		int numeroceros = 0;

		for(int i=1; i<=10; i++) {
			System.out.println("Introduce un número cualquiera: ");
			num=sc.nextInt();
		
			if(num<0) {
				sumanegativos = sumanegativos + num;
				nnegativos++;
				medianegativos = sumanegativos/nnegativos;
			}
			else if(num>0) {
				sumapositivos = sumapositivos + num;
				npositivos++;
				mediapositivos = sumapositivos/npositivos;
			}
			else if(num==0) {
				numeroceros++;
			}
		}
		System.out.println("La media de los negativos es: " + medianegativos);
		System.out.println("La media de los positivos es: " + mediapositivos);
		System.out.println("Has escrito " + numeroceros + " ceros.");
			
		sc.close();
	}

}
