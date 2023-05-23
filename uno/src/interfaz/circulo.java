package interfaz;

public class circulo extends figura implements areafigura, perimetrofigura {
	
	final static double PI=3.1416;
	int radio;
	
	circulo(int radio){
		this.radio=radio;
	}

	public int getRadio() {
		return this.radio;
	}

	public void setRadio(int r) {
		this.radio = r;
	}

	@Override
	public String toString() {
		return "circulo [radio=" + radio + "]";
	}

	@Override
	public int area() {
		// TODO Auto-generated method stub
		return (int) PI*this.radio*this.radio;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 2*PI*this.radio;
	}


}
