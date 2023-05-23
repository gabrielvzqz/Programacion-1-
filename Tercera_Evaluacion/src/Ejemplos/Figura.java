package Ejemplos;

import java.util.Arrays;

import java.awt.Color;

public class Figura {
	private Color ColorFigura;
	private int[] Posicion = new int[2];

	Figura(Color color) {
		setColor(color);
	}

	Figura(Color color, int[] Posicion) {
		setColor(color);
		setColor(Posicion);
	}

	public void setColor(Color color) {
		ColorFigura = color;
	}

	public Color getColor() {
		return ColorFigura;
	}

	public void setCentro(int[] Posicion) {
		this.Posicion[0] = Posicion[0];
		this.Posicion[1] = Posicion[1];
	}

	public int[] getCentro() {
		return Posicion;
	}

	@Override
	public String toString() {
		return "Figura [Posicion=" + Arrays.toString(Posicion) + "]";
	}
}