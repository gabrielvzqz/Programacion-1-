/*3. Leer 5 números por teclado y a continuación realizar la
media de los números positivos, la media de los negativos y
contar el número de ceros.*/

package BoletinArrays;

import java.util.Scanner;

public class BoletinArrays03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double[] arr = new double[5];
		double numero = 0;
		double positivo = 0;
		double numpositivos = 0;
		double negativo = 0;
		double numnegativos = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Introduce un número: ");
			numero=sc.nextDouble();
			arr[i] = numero;
			if (arr[i]>=0) {
				positivo = positivo +numero;
				numpositivos++;
			}
			else{
				negativo = negativo +numero;
				numnegativos++;
			}
		}
			positivo=positivo/numpositivos;
			negativo=negativo/numnegativos;
			System.out.println("La media de los positivos introducidos es: " + positivo);
			System.out.println("La media de los negativos introducidos es: " + negativo);
	
		sc.close();

}
}