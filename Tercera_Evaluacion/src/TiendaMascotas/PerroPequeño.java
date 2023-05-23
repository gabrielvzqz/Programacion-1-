package TiendaMascotas;

public class PerroPequeño extends Perros {

	enum razas {
		YORKSHIRE, CANICHE, CHIHUAHUA, SNAUZER
	}

	public PerroPequeño(String nombre, int edad, String color ,String peso, boolean muerde, razas raza) {
		super(nombre, edad, color, peso, muerde);
		this.raza=raza;
	}
	//ATRIBUTO
	private razas raza;

	@Override
	public String toString() {
		return "PerroPequeño [raza=" + raza + ", tamaño=" + peso + ", muerde=" + muerde + ", nombre=" + nombre
				+ ", edad=" + edad + ", color=" + color + "]";
	}
	
	

}
