package Ejercicio4uno;

public class CuentaCorriente extends Cuenta {

	float Sobregiro = 0;

	public CuentaCorriente(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
	}
	
	@Override
	public void retirar(float Cantidad) {
		// TODO Auto-generated method stub
		if (saldo >= Cantidad) {
			saldo -= Cantidad;
			numRetiros++;
		} else {
			saldo = 0;
			Sobregiro = Cantidad - saldo;
		}
	}

	@Override
	public void Consignar(float Cantidad) {
		// TODO Auto-generated method stub
		if (Sobregiro > 0) {
			if (Cantidad - Sobregiro >= 0) {
				super.Consignar(Cantidad - Sobregiro);
				Sobregiro = 0;
			} else {
				Sobregiro -= Cantidad;
			}
		} else
			super.Consignar(Cantidad);
	}

	@Override
	public String toString() {
		return "CuentaCorriente [Sobregiro=" + Sobregiro + ", saldo=" + saldo + ", numMovimientos=" + numMovimientos
				+ ", numRetiros=" + numRetiros + ", comisionMensual=" + comisionMensual + "]";
	}

}
