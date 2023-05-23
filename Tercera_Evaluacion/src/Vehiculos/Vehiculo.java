package Vehiculos;

abstract public class Vehiculo {
	protected int velocidadActual;
	protected int velocidadMaxima;
	public Vehiculo(int velocidadActual, int velocidadMaxima) {
		super();
		this.velocidadActual=velocidadActual;
		this.velocidadMaxima=velocidadMaxima;
	}
	abstract public void acelerar(int velocidad);
	abstract public void frenar(int velocidad) ;
	
	@Override
	public String toString() {
		return "Vehiculo [velocidadActual=" + velocidadActual + ", velocidadMaxima=" + velocidadMaxima + "]";
	}
	
}
