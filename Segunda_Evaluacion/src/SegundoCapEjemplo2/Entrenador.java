package SegundoCapEjemplo2;

public class Entrenador extends SeleccionFutbol {

	private String idFederacion;

	public Entrenador() {
		super();
	}

	public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
		super(id, nombre, apellidos, edad);
		this.idFederacion = idFederacion;
	}

	public String getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}
	
	@Override
	public void Concentrarse() {
		// TODO Auto-generated method stub
		// super.Concentracion();
		System.out.println("Tiene una cama doble.");
	}

	@Override
	public void Viajar() {
		// TODO Auto-generated method stub
		//super.Viajar();
		System.out.println("Viaja en primera clase en avión.");
	}
	
	public void dirigirPartido() {
		System.out.println("Dirige un partido");
	}

	public void dirigirEntrenamiento() {
		System.out.println("Dirige un entrenamiento");
	}

	@Override
	public String toString() {
		return "Entrenador [idFederacion=" + idFederacion + "]";
	}

}