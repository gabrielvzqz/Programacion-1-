package Mapas;

import java.util.Objects;



public class Carta implements Comparable {

	static String[] valores = { "As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Sota", "Caballo", "Rey" };
	static String[] palos = { "Oros", "Espadas", "Copas", "Bastos" };

	String valor;
	String palo;

	public Carta() {
		this.valor = generarValor();
		this.palo = generarPalo();
	}

	public String generarPalo() {
		int ind = (int) (Math.random() * 4);
		return palos[ind];
	}

	public String generarValor() {
		int ind = (int) (Math.random() * 10);
		return valores[ind];
	}
	public String getValor() {
		return valor;
	}

	public String getPalo() {
		return palo;
	}

	@Override
	public String toString() {
		return "Cartas [valor=" + valor + ", palo=" + palo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(palo, valor);
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Carta other = (Carta) obj;
		return Objects.equals(palo, other.palo) && Objects.equals(valor, other.valor);
	}

	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		//primero por palo
		Carta car = (Carta) obj;
		
		if(!this.getPalo().equals(car.getPalo()))
			return this.getPalo().compareTo(car.getPalo());
		else
			return this.getValor().compareTo(car.getValor());
	}
	
}
