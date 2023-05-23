package interfaz;

public class triangulo extends figura implements areafigura, perimetrofigura {
	
	double altura;
	double base;
	
	triangulo(double altura, double base){
		this.altura=altura;
		this.base=base;
	}


	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public String toString() {
		return "triangulo [altura=" + altura + ", base=" + base + "]";
	}



	@Override
	public int area() {
		// TODO Auto-generated method stub
		return (int)(this.base*this.altura)/2;
	}


	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
}
	