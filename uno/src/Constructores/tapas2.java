package Constructores;

public class tapas2 {

	double chocos;
	double patatasbravas;

	tapas2() {
		chocos = 0;
		patatasbravas = 0;
	}

	tapas2(double p, double c) {
		this.patatasbravas = p;
		this.chocos = c;
	}

	@Override
	public String toString() {
		return "tapas2 [chocos=" + chocos + ", patatas=" + patatasbravas + "]";
	}

	public double getpatatasbravas() {

		return patatasbravas;
	}

	public void setpatatasbravas(double patatasbravas) {

		this.patatasbravas = patatasbravas;
	}

	public double getchocos() {

		return chocos;
	}

	public void setchocos(double chocos) {

		this.chocos = chocos;
	}

	public void addpatatasbravas (int x) {
		patatasbravas =+ x;
	}

	public void addchocos (int y) {
		chocos =+ y;
	}
	
	public  double numeroClientes() {
		
		double numeroClientes=0;
		if (patatasbravas >= 1 && chocos >= 0.5) {
			
	
		if (2*chocos <= patatasbravas) {
			numeroClientes=(double) chocos*6;
			patatasbravas -= 2*chocos;
			chocos -= chocos;
		}
		else {
			numeroClientes=(double) patatasbravas*3;
			chocos -= patatasbravas/2;
			patatasbravas -= patatasbravas;
		}
		return (int) numeroClientes;
				
	}
		else {
			System.out.println("No se puede preparar el plato :(.");
		}
		return numeroClientes;
}
}
