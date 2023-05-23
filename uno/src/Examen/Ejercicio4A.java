package Examen;

public class Ejercicio4A {
	private static int numCuentas = 0;

	double saldo;
	double deposito;
	double retiro;
	double interes;
	String NombreTitular;
	double NumeroCuenta;
	public static int countCuentas() {
		return numCuentas;
	}

	public Ejercicio4A(double saldo, double deposito,double retiro,
			double interes, String NombreTitular, double NumeroCuenta) {
		this.saldo = saldo;
		this.deposito = deposito;
		this.retiro = retiro;
		this.interes = interes;
		numCuentas++;
	}
	public double Saldocuenta(double saldo) {
		return saldo;
	}	
	public double Deposito(double saldo, double deposito) {
		return saldo=saldo+deposito;
	}	
	public double Retiro(double saldo, double retiro) {
		return saldo=saldo-retiro;
	}	
	public double Interes(double saldo, double interes) {
		return saldo=saldo*((100+interes)/100);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public double getRetiro() {
		return retiro;
	}

	public void setRetiro(double retiro) {
		this.retiro = retiro;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public String getNombreTitular() {
		return NombreTitular;
	}

	public void setNombreTitular(String nombreTitular) {
		NombreTitular = nombreTitular;
	}

	public double getNumeroCuenta() {
		return NumeroCuenta;
	}

	public void setNumeroCuenta(double numeroCuenta) {
		NumeroCuenta = numeroCuenta;
	}

	@Override
	public String toString() {
		return "Ejercicio4A [saldo=" + saldo + ", deposito=" + deposito + ", retiro=" + retiro + ", interes=" + interes
				+ ", NombreTitular=" + NombreTitular + ", NumeroCuenta=" + NumeroCuenta + "]";
	}	

}
