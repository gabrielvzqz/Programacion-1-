package Mapas;

public class Moneda {

	String[] Vlado = {"Cara", "Cruz"};
	String[] Valor = {"1 cents","2 cents","5 cents","10 cents","20 cents","50 cents", "1 euro", "2 euros"};
	
	String valor;
	String lado;
	
	Moneda(String v, String l){
		this.valor=v;
		this.lado=l;
	}
	
	Moneda(){
		this.valor=generarValor();
		this.lado=generarLado();
	}
	public String generarLado() {
		int valor = (int) (Math.random()*2);
		return Vlado[valor];
	}
	
	public String generarValor() {
		int valor = (int) (Math.random()*8);
		return Valor[valor];
	}
	
	public String getValor() {
		return valor;
	}

	public String getLado() {
		return lado;
	}

	@Override
	public String toString() {
		return "Moneda [valor=" + valor + ", lado=" + lado + "]";
	}

}
