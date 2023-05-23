package Metodos;

public class Propuesto9 {
//40 numeros entre 1 y 99. y mostrar un resultado final indicando cuantos d ellos son pares//
	public static int getNumber() {
		return (int) (Math.random() * 99);
	}

	public static void main(String[] args) {
		int contador = 0;
		int numero;
		for (int i = 0; i < 20; i++) {

			numero = getNumber();
			System.out.println("Generados: " + numero);
			if (numero % 2 == 0) {
				contador++; // numero=numero+1; contamos una vocal más//
				System.out.println("Par");
			}

		}
		System.out.println("Hay " + contador + " pares.");
	}
}