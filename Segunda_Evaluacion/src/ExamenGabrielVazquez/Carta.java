package ExamenGabrielVazquez;

import java.util.Arrays;
import java.util.Objects;

public class Carta implements Comparable {

		String valor;
		String palo;

		String[] valores = { "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
		String[] palos = { "corazones", "diamantes", "picas", "treboles" };

		public String generaPalo() {
			int ind = (int) (Math.random() * 4);
			return palos[ind];
		}

		public String generaValor() {
			int ind = (int) (Math.random() * 13);
			return valores[ind];

		}

		Carta() {
			this.valor = generaValor();
			this.palo = generaPalo();
		}

		public String getValor() {
			return valor;
		}

		public String getPalo() {
			return palo;
		}

		@Override
		public String toString() {
			return "Carta [valor=" + valor + ", palo=" + palo + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + Arrays.hashCode(palos);
			result = prime * result + Arrays.hashCode(valores);
			result = prime * result + Objects.hash(palo, valor);
			return result;
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
			return Objects.equals(palo, other.palo) && Arrays.equals(palos, other.palos)
					&& Objects.equals(valor, other.valor) && Arrays.equals(valores, other.valores);
		}

		@Override
		public int compareTo(Object obj) {
			// TODO Auto-generated method stub
			// primero por palo
			Carta car = (Carta) obj;

			//si son palos distintos ordena por palo
			if (!this.getPalo().equals(car.getPalo()))
				return this.getPalo().compareTo(car.getPalo());
			//si son del mismo palo ordena por valor
			else
				return this.getValor().compareTo(car.getValor());

		}

	}
