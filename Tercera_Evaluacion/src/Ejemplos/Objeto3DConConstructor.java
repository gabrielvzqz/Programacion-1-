package Ejemplos;

public class Objeto3DConConstructor {
	private double x =0d;
	private double y =0d;
	private double z =0d;
	private String TipoMedida = "centimentro";
	
	public void Dimensiones3D(double Ancho, double Alto, double Profundo) {
		
		x = Ancho;
		y = Alto;
		z = Profundo;
	}
	
	public void TipoMedida(String Medida) {
		TipoMedida = Medida;
	}
	//EL MÉTODO DIMNESIONES ESTÁ SOBRECARGADO
	public void Dimensiones(String Medida, double Ancho, double Alto, double Profundo) {
		Dimensiones3D(Ancho,Alto,Profundo);
		TipoMedida(Medida);
	}
	public void Dimensiones(double Ancho, String Medida, double Alto, double Profundo) {
		Dimensiones(Medida,Ancho,Alto,Profundo);
	}
	public void Dimensiones(double Ancho, double Alto, String Medida, double Profundo) {
		Dimensiones(Medida,Ancho,Alto,Profundo);
	}
	public void Dimensiones(double Ancho, double Alto, double Profundo,String Medida) {
		Dimensiones(Medida,Ancho,Alto,Profundo);
	}
	public void Dimensiones(String Medida) {
		TipoMedida(Medida);
	}
	public void Dimensiones(double Ancho, double Alto, double Profundo) {
		Dimensiones(Ancho,Alto,Profundo);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public String getTipoMedida() {
		return TipoMedida;
	}

	public void setTipoMedida(String tipoMedida) {
		TipoMedida = tipoMedida;
	}

	@Override
	public String toString() {
		return "Objeto3D [x=" + x + ", y=" + y + ", z=" + z + ", TipoMedida=" + TipoMedida + "]";
	}
	
	//GETTERS
	
}
