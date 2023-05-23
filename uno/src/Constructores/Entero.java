package Constructores;

public class Entero {
	
	//Atributo

	int valor;
	Entero(){
		valor=0;
	}
	Entero(int v){
		valor=v;
	}
	public int resuelvesuma(int valor, int numero) {
		return valor+=numero;
	}
	public int resuelveresta(int valor, int numero) {
		return valor-=numero;
	}	
	public double resuelvedoble(int valor) {
		return valor*2;
	}	
	public double resuelvetriple(int valor) {
		return valor*3;
	}
	@Override
	public String toString() {
		return "Entero [valor=" + valor + "]";
	}
	public int getValor() {
		return valor;
	}

}