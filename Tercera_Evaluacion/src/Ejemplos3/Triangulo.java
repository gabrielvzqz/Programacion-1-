package Ejemplos3;

import java.awt.Color;

import java.util.Arrays;

public class Triangulo extends Figura {

	double base;
	double altura;

	Triangulo(double base, double altura) {
		setBase(base);
		setAltura(altura);
	}

	Triangulo(double base, double altura, Color color) {
		super(color);
		setBase(base);
		setAltura(altura);
	}

	Triangulo(double base, double altura, Color color, int[] Posicion) {
		super(color, Posicion);
		setBase(base);
		setAltura(altura);
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return base*altura/2;
	}

	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + ", ColorFigura=" + ColorFigura + ", Posicion="
				+ Arrays.toString(Posicion) + "]";
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}