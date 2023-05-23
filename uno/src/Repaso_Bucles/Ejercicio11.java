package Repaso_Bucles;

/*11. Diseñar un programa que muestre el producto de los 10
primeros números impares.*/

public class Ejercicio11 {

	public static void main(String[] args) {
		
		
		int num=1;
		int multiplicacion = 1;
		
		for(int i=1;i<10;i++) {
			num=num+2;
			multiplicacion=multiplicacion*num;
			System.out.println(multiplicacion);
		}

	}

}
