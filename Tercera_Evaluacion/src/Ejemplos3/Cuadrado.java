package Ejemplos3;

import java.awt.Color;
import java.util.Arrays;

public class Cuadrado extends Figura{

	private double Lado;

	public Cuadrado(double Lado) {
		setLado(Lado);
		// TODO Auto-generated constructor stub
	}

	public Cuadrado(Color color, double Lado) {
		super(color);
		setLado(Lado);
	}

	public Cuadrado(double Lado, Color color, int[] Posicion) {
		super(color, Posicion);
		setLado(Lado);
	}

	public double getLado() {
		return Lado;
	}
	public void setLado(double lado) {
		Lado = lado;
	}

	@Override
	public String toString() {
		return "Cuadrado [Lado=" + Lado + ", ColorFigura=" + ColorFigura + ", Posicion=" + Arrays.toString(Posicion)
				+ "]";
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Lado * Lado;
	}
	
	
	
}