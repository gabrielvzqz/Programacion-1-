package Ejercicio4uno;

public class CuentaAhorro extends Cuenta {

	protected boolean Activa;

	public CuentaAhorro(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
	}

	public void Consignar(float Cantidad) {
		//
		if (estaActiva())
			super.Consignar(Cantidad);
		else
			System.out.println("La cuenta no está activa");
	}

	public void retirar(float Cantidad) {
		if (estaActiva())
			super.retirar(Cantidad);
		else
			System.out.println("La cuentano está activa");
	}

	@Override
	public void extractoMensual() {
		// TODO Auto-generated method stub
		if (estaActiva()) {

			if (numRetiros > 4) {
				comisionMensual += 1000*(numRetiros-4);
				super.extractoMensual();
			} else {
				super.extractoMensual();
			}
		} else {
			System.out.println("La cuenta no está activa");
		}
	}

	@Override
	public String toString() {
		return "CuentaAhorro [Activa=" + Activa + ", saldo=" + saldo + ", numMovimientos=" + numMovimientos
				+ ", numRetiros=" + numRetiros + ", comisionMensual=" + comisionMensual + "]";
	}

	public boolean estaActiva() {
		return Activa;
	}
}
