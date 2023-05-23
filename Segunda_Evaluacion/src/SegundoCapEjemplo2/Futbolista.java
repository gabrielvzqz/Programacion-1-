package SegundoCapEjemplo2;

public class Futbolista extends SeleccionFutbol {

	private int dorsal;
	private String desmarcacion;

	public Futbolista() {
		super();
	}

	public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String desmarcacion) {
		super(id, nombre, apellidos, edad);
		this.dorsal = dorsal;
		this.desmarcacion = desmarcacion;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDesmarcacion() {
		return desmarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.desmarcacion = demarcacion;
	}

	@Override
	public void Concentrarse() {
		// TODO Auto-generated method stub
		// super.Concentracion();
		System.out.println("Se concentra con un compañero.");
	}
	
	public void jugarPartido() {
		System.out.println("Juega un partido");
	}

	public void entrenar() {
		System.out.println("Entrena");
	}

	@Override
	public String toString() {
		return "Futbolista [dorsal=" + dorsal + ", demarcacion=" + desmarcacion + "]";
	}

}