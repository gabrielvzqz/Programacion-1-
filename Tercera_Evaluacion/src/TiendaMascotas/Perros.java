package TiendaMascotas;

public class Perros extends Mascota{
	protected String peso;
	protected boolean muerde;
	
	public Perros (String nombre, int edad, String color ,String peso, boolean muerde) {
		super(nombre, edad, color);
		this.peso=peso;
		this.muerde=muerde;
	}
	
	@Override
	public String sonido() {
		return "Los peros ladran.";
	}

	@Override
	public String toString() {
		return "Perros [peso=" + peso + ", muerde=" + muerde + ", nombre=" + nombre + ", edad=" + edad + ", color="
				+ color + "]";
	}
	
	
	
}
