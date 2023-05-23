package ExamenGabrielVazquez;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*Genera un array de 50 posiciones enteras que tomarán valores entre
-100 y 100.
Recorriendo dicho array separe en dos arrays distintos los valores
positivos de los negativos.
Ordene ambos arrays por el método de la Burbuja. Considere el cero
positivo.
Mostrar por teclado ambos arrays obtenidos y ordenados.
*/
public class Ejercicico2A {
	public static void burbuja(int[] arr) {
		
		int aux;
		for(int i=arr.length;i>0;i--) {
			for(int j=0; j<i-1;j++) {
				if(arr[j]>arr[j+1]) {
					aux=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=aux;
				}
			}

		}
	}
	public static void main(String[] args) {
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int[] arr= new int [50];
		int pos=0;
		int neg=0;
		
		for (int i=0; i<arr.length; i++) {
			arr[i]=r.nextInt(-100,100);
		}
		
		for (int i=0; i<arr.length; i++) {
			if(arr[i]>=0) {
				pos++;
			}else	neg++;
		}	

		int[] positivos =new int [50];
		int[] negativos =new int [50];

		for (int i=0; i<arr.length; i++) {
			if(arr[i]>=0) {
				positivos[i]=arr[i];
			}else	
				negativos[i]=arr[i];
		}
		burbuja(positivos);
		burbuja(negativos);
		
		System.out.println(Arrays.toString(positivos));
		System.out.println(Arrays.toString(negativos));
		sc.close();

		}

}
