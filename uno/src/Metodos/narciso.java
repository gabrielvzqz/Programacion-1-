package Metodos;

import java.util.Scanner;

public class narciso {

	public static int contarCifras(int numero) {

		int cifras=1;
		
		while(numero>=10) {
			
			numero=numero/10;
			cifras++;
		}
		return cifras;
		
	}
	public int calculaPotencias(int numero) {
		int total=0;
		int cifras=contarCifras(numero);
		int temp=numero;
		while(numero/10!=0) {
			temp=temp/10;
			total=(int)Math.pow(numero%10, cifras);
		}
		return total;
	}
	public static void main(String[] args) {
		
		int num=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número: ");
		num=sc.nextInt();
		System.out.println("El número tiene "+contarCifras(num)+" cifras.");
		sc.close();
	}

}
