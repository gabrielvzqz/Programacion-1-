package Ejemplos4;

import java.awt.Color;
import java.util.Scanner;

public class Vehiculo implements Comparable<Object>, EstacionServicio  {
	protected Color ColorVehiculo;
	protected byte NumRuedas;
	protected short Cilindrada;
	protected short Potencia;

	Vehiculo(Color color) {
		setColor(color);
	}

	Vehiculo(byte NumRuedas) {
		this.NumRuedas = NumRuedas;
	}

	Vehiculo(short Cilindrada) {
		this.Cilindrada = Cilindrada;
	}

	Vehiculo(Color color, byte NumRuedas) {
		this(color);
		this.NumRuedas = NumRuedas;
	}

	Vehiculo(Color color, byte NumRuedas, short Cilindrada) {
		this(color, NumRuedas);
		this.Cilindrada = Cilindrada;
	}

	Vehiculo(Color color, byte NumRuedas, short Cilindrada, short Potencia) {
		this(color, NumRuedas, Cilindrada);
		this.Potencia = Potencia;

	}

	public void setColor(Color color) {
		ColorVehiculo = color;
	}

	public Color getColor() {
		return ColorVehiculo;
	}

	public byte getNumRuedas() {
		return NumRuedas;
	}

	public short getCilindrada() {
		return Cilindrada;
	}

	public short getPotencia() {
		return Potencia;
	}

	@Override
	public String toString() {
		return "Vehiculo [ColorVehiculo=" + ColorVehiculo + ", NumRuedas=" + NumRuedas + ", Cilindrada=" + Cilindrada
				+ ", Potencia=" + Potencia + "]";
	}
	
	public double pagarRodaje() {
		return 53.27d;
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		Vehiculo v = (Vehiculo) arg0;
		if(this.pagarRodaje() > v.pagarRodaje())
			return -1;
		else if(this.pagarRodaje() == v.pagarRodaje())
			return 0;
		else
			return 1;
	}
	@Override
	public double pagarCarburante() {
		// TODO Auto-generated method stub
		System.out.println("Impuesto general a todos");
		return 1.55;
	}
	public double pideLitros() {
		Scanner sc = new Scanner(System.in);
		sc.close();
		System.out.println("Numero de litros: ");
		double litros = sc.nextDouble();
		return litros;
	}
	
	public boolean esDiesel() {
		Scanner sc = new Scanner(System.in);
		sc.close();
		System.out.println("Es diesel.");
		char respuesta = sc.nextLine().charAt(0);
		if(respuesta == 's') {
			return true;
		}else
			return false;
		
	}

}