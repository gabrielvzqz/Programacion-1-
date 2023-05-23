package Ejemplos3;

import java.awt.Color;
import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		int[] Posicion = { 10, 20 };
		double[] Lados = { 50d, 100d };

		Triangulo MiTriangulo = new Triangulo(5.4, 6.3, Color.YELLOW, Posicion);
		Circulo MiCirculo = new Circulo(3d, Color.red, Posicion);
		Rectangulo MiRectangulo = new Rectangulo(Lados, Color.blue, Posicion);
		Cuadrado MiCuadrado = new Cuadrado(5.6d, Color.red, Posicion);

		System.out.println(MiCirculo.getRadio());
		int[] Centro = MiCirculo.getCentro();
		System.out.println(Centro[0]);
		System.out.println(Centro[1]);

		System.out.println(MiRectangulo);
		System.out.println(MiCuadrado);
		
		
		System.out.println("El area del circulo es: " + MiCirculo.calcularArea());
		System.out.println("El area del rectángulo es: " + MiRectangulo.calcularArea());
		System.out.println("El area del triangulo es: " + MiTriangulo.calcularArea());

		
		/*<--------------------------------------->*/

		ArrayList<Figura> figuras = new ArrayList<Figura>();
		figuras.add(MiRectangulo);
		figuras.add(MiCirculo);
		figuras.add(MiCuadrado);
		figuras.add(MiTriangulo);
		
		for(Figura i : figuras) {
			System.out.println(i);
			System.out.println("Su área es: " + i.calcularArea());
		}
	}
}
