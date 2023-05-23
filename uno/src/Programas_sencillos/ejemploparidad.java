package Programas_sencillos;

import java.util.*;

public class ejemploparidad {
	public static void main(String[] args) {

		Random rnd = new Random();
		int valor = rnd.nextInt();
		int mejor = 0;
		for (int j= 0; j< 40; j++) {
			mejor = (int)(rnd.nextDouble() *101 + 100);
			System.out.println("Has generado el número: " + mejor);
			System.out.println(valor);
		}
}
}