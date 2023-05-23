package Ejemplos4;

import java.awt.Color;

public class Coche extends Vehiculo{

	private int NumeroPuertas;
	
	Coche(byte NumeroDeRuedas) {
		super(NumeroDeRuedas);
	}

	Coche(Color color, byte NumeroDeRuedas) {
		super(color, NumeroDeRuedas);
	}

	Coche(Color color, byte NumeroDeRuedas, short Cilindrada) {
		super(color, NumeroDeRuedas, Cilindrada);
	}

	Coche(Color color, byte NumeroDeRuedas, short Cilindrada, short Potencia) {
		super(color, NumeroDeRuedas, Cilindrada, Potencia);
	}

	Coche(Color color, byte NumeroDeRuedas, byte NumeroDeEjes, short Cilindrada, short Potencia) {
		super(color, NumeroDeRuedas, Cilindrada, Potencia);
		setNumeroPuertas(NumeroPuertas);
	}

	public int getNumeroPuertas() {
		return NumeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		NumeroPuertas = numeroPuertas;
	}

	@Override
	public String toString() {
		return "Coche [NumeroPuertas=" + NumeroPuertas + ", ColorVehiculo=" + ColorVehiculo + ", NumRuedas=" + NumRuedas
				+ ", Cilindrada=" + Cilindrada + ", Potencia=" + Potencia + "]";
	}
	public double pagarRodaje() {
		return super.pagarRodaje() + 40*getNumeroPuertas()+0.18*getPotencia();
	}
	public double pagarCarburante() {
		if (esDiesel())
			return super.pagarCarburante() + GASOIL*pideLitros();
		else
			return super.pagarCarburante() + GASOLINA*pideLitros();

	}
	
}
