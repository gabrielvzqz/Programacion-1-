package Vehiculos;

public class Acuatico extends Vehiculo implements Motor, Vela{
	
	public Acuatico(int velocidadActual, int velocidadMaxima) {
		super(velocidadActual, velocidadMaxima);
	}
	
	public void acelerar(int incremento) {
		int vel = velocidadActual + incremento;
		if (vel > velocidadMaxima) {
			System.out.println("Supera la velocidad máxima permitida");
		}else {
			velocidadActual = vel;
		}
	}
	
	public void frenar(int incremento) {
		int vel = velocidadActual - incremento;
		if (vel < 0) {
			System.out.println("La velocidad no puede ser negativa");
		}else {
			velocidadActual = vel;
		}
	}
	
	
	public int calcularRevolucionesMotor(int fuerza, int radio) {
		return (fuerza*radio);
	}
	
	
	public void recomendarVelocidad(int velocidadViento) {
		if (velocidadViento > 80 || velocidadViento < 10) {
			velocidadActual =0;
		}
	}

	@Override
	public String toString() {
		return "Acuatico [velocidadActual=" + velocidadActual + ", velocidadMaxima=" + velocidadMaxima + "]";
	}
}
