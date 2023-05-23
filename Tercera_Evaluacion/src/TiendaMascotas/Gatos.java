package TiendaMascotas;

public class Gatos extends Mascota{
	
	protected double alturaS;
	protected double longitudS;
	
	public Gatos(String nombre, int edad, String color, double alturaS, double longitudS) {
		super(nombre, edad, color);
		this.alturaS=alturaS;
		this.longitudS=longitudS;
	}

	@Override
	public String sonido() {
		return "Los gatos maullan y ronronean.";
	}

	@Override
	public String toString() {
		return "Gatos [alturasS=" + alturaS + ", longitudS=" + longitudS + ", nombre=" + nombre + ", edad=" + edad
				+ ", color=" + color + "]";
	}
	
}
