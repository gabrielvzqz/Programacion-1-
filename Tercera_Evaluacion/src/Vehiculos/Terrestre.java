package Vehiculos;

public class Terrestre extends Vehiculo implements Motor{

	public Terrestre(int velocidadActual, int velocidadMaxima) {
		super(velocidadActual, velocidadMaxima);
	}
	
	@Override
	public String toString() {
		return "Terrestre [velocidadActual=" + velocidadActual + ", velocidadMaxima=" + velocidadMaxima + "]";
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

}
