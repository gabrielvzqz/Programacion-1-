package TiendaMascotas;

public class PerroMediano extends Perros{

	enum razas {
		COLLIE, DÁLMATA, BULLDOG, GALGO, SABUESO
	}
	
	public PerroMediano(String nombre, int edad, String color ,String peso, boolean muerde, razas raza) {
		super(nombre, edad, color, peso, muerde);
		this.raza=raza;
	}
	//ATRIBUTO
	private razas raza;

	@Override
	public String toString() {
		return "PerroPequeño [raza=" + raza + ", peso=" + peso + ", muerde=" + muerde + ", nombre=" + nombre
				+ ", edad=" + edad + ", color=" + color + "]";
	}
	
	

}
