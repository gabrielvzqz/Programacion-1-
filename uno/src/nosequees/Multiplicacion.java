package nosequees;

import java.util.Scanner;

public class Multiplicacion {
	
	public static int MulIterando(int multiplicando, int multiplicador) {
		int producto=0;
		for(int i=0;i<multiplicador; i++) {
			producto=producto+multiplicando;
		}
		return producto;
	}
	public static int MulRecursiva(int multiplicando, int multiplicador) {

		if(multiplicador==1) 
			return multiplicando;
		else 
			return multiplicando+MulRecursiva(multiplicando, multiplicador-1);
	}
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int multiplicando=0;
		int multiplicador=0;
		int producto =1;
		
		System.out.println("Introduce multiplicando: ");
		multiplicando=sc.nextInt();
		System.out.println("Introduce multiplicador: ");
		multiplicador=sc.nextInt();
		producto=multiplicando*multiplicador;
		System.out.println("El producto es " + producto);
		System.out.println("__________________________________________________________________________________________________");
		System.out.println("El producto es " + MulIterando(multiplicando,multiplicador));
		System.out.println("__________________________________________________________________________________________________");
		System.out.println("El producto es " + MulRecursiva(multiplicando,multiplicador));

		sc.close();
	}

}
