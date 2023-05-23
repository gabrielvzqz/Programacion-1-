package Constructores;

public class Convertirdinero {
	//Vamos a preparar un método que haga la conversion de celsius a farenheit//
	final static double CAMBIO_POR_DEFECTO=1.36;
	double cambio;

	public double euroadolar(double e) {
		
		double d = e*cambio;
		return d;
	}
	public double dolaraeuro(double d) {
		
		double e = d/cambio;
		return e;
	}
	Convertirdinero(){
		this.cambio =CAMBIO_POR_DEFECTO;
	}
	Convertirdinero(double c){
		this.cambio=c;
	}
	@Override
	public String toString() {
		return "Convertirdinero [cambio=" + cambio + "]";
	}
	
}