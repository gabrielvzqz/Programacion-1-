package Constructores;

public class Coche2 {


	private int velocidad;
	Coche2(){
		velocidad=0;
	}
	public int getVelocidad() {
		velocidad=40;
		return this.velocidad;
	}
	public void acelerar(int parametro) {
		velocidad=velocidad+parametro;
	}
	public void frenar(int anonimo) {
		velocidad-=anonimo;
	}
	@Override
	public String toString() {
		return "Coche [velocidad=" + velocidad + "]";
	}
}