package Ejemplos4;

import java.awt.Color;

public class Camion extends Vehiculo {

	private byte NumeroDeEjes;

	Camion(byte NumeroDeRuedas) {
		super(NumeroDeRuedas);
	}

	Camion(Color color, byte NumeroDeRuedas) {
		super(color, NumeroDeRuedas);
	}

	Camion(Color color, byte NumeroDeRuedas, short Cilindrada) {
		super(color, NumeroDeRuedas, Cilindrada);
	}

	Camion(Color color, byte NumeroDeRuedas, short Cilindrada, short Potencia) {
		super(color, NumeroDeRuedas, Cilindrada, Potencia);
	}

	Camion(Color color, byte NumeroDeRuedas, byte NumeroDeEjes, short Cilindrada, short Potencia) {
		super(color, NumeroDeRuedas, Cilindrada, Potencia);
		setEjes(NumeroDeEjes);
	}

	public byte getEjes() {
		return NumeroDeEjes;
	}

	public void setEjes(byte NumeroDeEjes) {
		this.NumeroDeEjes = NumeroDeEjes;
	}
	public double pagarRodaje() {
		return super.pagarRodaje() + 2.17*getCilindrada();
	}
	public double pagarCarburante() {
		return super.pagarCarburante() + GASOIL*pideLitros();
	}

}
