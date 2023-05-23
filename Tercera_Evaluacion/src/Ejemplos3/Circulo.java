package Ejemplos3;

import java.awt.Color;
import java.util.Arrays;

public class Circulo extends Figura {
	private double Radio;

	Circulo(double Radio) {
		setRadio(Radio);

	}

	Circulo(double Radio, Color color) {
		super(color);
		setRadio(Radio);
	}

	Circulo(double Radio, Color color, int[] Posicion) {
		super(color, Posicion);
		setRadio(Radio);
	}

	public void setRadio(double Radio) {
		this.Radio = Radio;
	}

	public double getRadio() {
		return Radio;
	}

	@Override
	public String toString() {
		return "Circulo [Radio=" + Radio + ", C olorFigura=" + ColorFigura + ", Posicion=" + Arrays.toString(Posicion)
				+ "]";
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(Radio,2);
	}
}