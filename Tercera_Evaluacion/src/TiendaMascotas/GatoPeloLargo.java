package TiendaMascotas;

public class GatoPeloLargo extends Gatos{

	enum razas {
		ANGORA, HIMALAYO, BALINÉS, SOMALÍ
	}
	
	public GatoPeloLargo(String nombre, int edad, String color, double alturaS, double longitudS, razas raza) {
		super(nombre, edad, color, alturaS, longitudS);
		this.raza=raza;
	}

	//ATRIBUTO
	private razas raza;

	@Override
	public String toString() {
		return "GatoSinPelo [raza=" + raza + ", alturaS=" + alturaS + ", longitudS=" + longitudS + ", nombre=" + nombre
				+ ", edad=" + edad + ", color=" + color + "]";
	}
	
	
}
