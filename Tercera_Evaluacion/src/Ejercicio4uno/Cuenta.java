package Ejercicio4uno;

public class Cuenta {

	//Atributos
	protected float saldo;
	protected int numMovimientos=0;
	protected int numRetiros=0;
	protected float tasaAnual;
	protected float comisionMensual=0;

	//Constructor
	Cuenta(float saldo, float tasaAnual){
		this.saldo = saldo;
		this.tasaAnual = tasaAnual;
	}
	//Métodos
	public void Consignar(float Cantidad) {
		saldo += Cantidad;
		numMovimientos ++;
	}
	public void retirar(float Cantidad) {
		if(Cantidad<saldo) {
		saldo += Cantidad;
		numRetiros++;
		}else {
		System.out.println("No tienes tanto dinero maestro");	
		}
	}
	public void calcularInteres() {
		float interesMensual = saldo * tasaAnual / 12;
		saldo += interesMensual;
	}
	public void extractoMensual() {
		saldo -= comisionMensual;
		calcularInteres();
	}
	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", numMovimientos=" + numMovimientos + ", numRetiros=" + numRetiros
				+ ", tasaAnual=" + tasaAnual + ", comisionMensual=" + comisionMensual + "]";
	}
	
	
}