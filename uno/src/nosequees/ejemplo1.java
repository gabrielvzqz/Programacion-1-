package nosequees;

public class ejemplo1 {

	public static void main(String[] args) {
		
		
		byte[] temperaturas; //declarar un array de temperaturas
		
		temperaturas = new byte [10]; //0 0 0 0 0 0 0 0 0 0
		
		//Quedan organizados por un ímdice de la posición: 0,1,2,3...n-1.
		
		//bucle clásico de recorrido de las posiciones de un array
		for (int i=0; i<temperaturas.length; i++) {
			temperaturas[i]=(byte) i;
			System.out.println("La temperatura para la posicion(indice) " + i + " es: " + temperaturas[i]);
		}
		
	}
}
