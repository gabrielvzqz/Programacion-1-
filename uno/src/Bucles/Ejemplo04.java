package Bucles;

public class Ejemplo04 {

	public static void main(String[] args) {
		int numero= 1;
		while(numero<= 10) {//avaluando una expresión lógica
			//bucle que cuenta hasta 10
			System.out.println(numero);
			numero++;//incrementamos el valor de la variable
		}
		
		System.out.println("_____________________________");
		numero=1;
		do {
			System.out.println(numero);
			numero++;//incrementamos el valor de la variable
		}
		while (numero<=10);
		
		System.out.println("_____________________________");
		
		for(int i=1; i<=10; i++)
			System.out.println(i);
		System.out.println("_____________________________");
		
		for(int i=100; i>=80; i--)
			System.out.println(i);
		
		System.out.println("Fin del programa.");
		
	}
}
