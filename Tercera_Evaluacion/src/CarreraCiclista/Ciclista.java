package CarreraCiclista;

public abstract class Ciclista {
	private String nombre;
	private int totalTiempo=0;
	private int identificador;

	public Ciclista(String nombre, int totalTiempo, int identificador) {
		super();
		this.nombre=nombre;
		this.totalTiempo=totalTiempo;
		this.identificador=identificador;

	}
	abstract public void imprimirTipo();
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTotalTiempo() {
		return totalTiempo;
	}
	public void setTotalTiempo(int totalTiempo) {
		this.totalTiempo = totalTiempo;
	}
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	
}