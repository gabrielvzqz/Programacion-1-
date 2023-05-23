package Constructores;

public class Resuelto05 {
	private double meridiano;
	private double paralelo;
	private double distancia_tierra;

	Resuelto05 (double m,double p,double d){
		meridiano=m;
		paralelo=p;
		distancia_tierra=d;
		}

	Resuelto05 (){
		meridiano=paralelo=distancia_tierra=0;
		}

	public void setPosicion(double m, double p, double d) {
		meridiano = m;
		paralelo = p;
		distancia_tierra = d;
	}

	@Override
	public String toString() {
		return "Resuelto05 [meridiano=" + meridiano + ", paralelo=" + paralelo + ", distancia_tierra="
				+ distancia_tierra + "]";
	}

}
