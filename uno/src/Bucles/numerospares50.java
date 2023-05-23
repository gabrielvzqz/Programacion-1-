package Bucles;

//11. Realiza un programa que muestre por pantalla los 50 primeros números pares.

public class numerospares50 {

	public static void main(String[] args) {
		
		for(int j=2; j<=100;j=j+2) {
			System.out.println("Par: "+ j);	
		}
		System.out.println("---------------------");
		for(int i=1; i<=50; i++) {
			System.out.println("Par: " + i*2);
		}

	}

}
