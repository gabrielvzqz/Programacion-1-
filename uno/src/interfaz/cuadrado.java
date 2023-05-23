package interfaz;

public class cuadrado extends figura implements areafigura, perimetrofigura{
	
	private int lado;
	
	public cuadrado(int lado) {
		this.lado=lado;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "cuadrado [lado=" + lado + "]";
	}

	@Override
	public int area() {
		// TODO Auto-generated method stub
		return this.lado*this.lado;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return lado*4;
	}
}
	