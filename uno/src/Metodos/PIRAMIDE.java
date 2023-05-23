package Metodos;

import java.util.Scanner;

public class PIRAMIDE {
	
	public static int elemento(int fila, int columna) {
		if (columna == 1)
			return 1;
		if (columna < 1 || columna > fila)
			return 0;
		return elemento(fila-1, columna) + elemento(fila-1, columna-1);
	}
	
	public static void main(String[] args) {
		
		int numfilas=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuantas filas desea formar? ");
		numfilas = sc.nextInt();
		for (int i=1;i<(numfilas+1);i++) {
			for(int e=0; e<(numfilas-i);e++) {
				System.out.print(" ");
			}
			for(int j=1; j<(numfilas+1);j++) {
				int dato=elemento(i,j);
				
				if(dato>0 && dato<10)
					System.out.print(" " + dato + " ");
				if (dato>=10)
				System.out.print(dato + " ");
			}
			System.out.println(" ");
		}
		sc.close();
	}

}
