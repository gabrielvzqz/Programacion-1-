package SegundoCapEjemplo2;

import java.util.ArrayList;

public class Test3 {

	public class TestSeleccion2 {

		// ArrayList de objetos SeleccionFutbol. Independientemente de la clase hija a
		// la que pertenezca el objeto
		public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

		public static void main(String[] args) {

			Entrenador Cholo = new Entrenador(7, "Dieho", "Simeone", 52, "284EZ89");
			Futbolista grisman = new Futbolista(34, "Toño", "Grizman", 28, 12, "Interior derecho");
			Masajista raulMartinez = new Masajista(3, "Raúl", "Martínez", 41, "Licenciado en Fisioterapia", 18);

			integrantes.add(Cholo);
			integrantes.add(grisman);
			integrantes.add(raulMartinez);
			
			for(SeleccionFutbol sf : integrantes) {
				System.out.println(sf.toString());
			}
			//bucle foreach donde cada objeto solo llame a sus métodos específicos
			for(SeleccionFutbol sf : integrantes) {
				System.out.println(sf.toString());
				//si es entrenador
				if(sf instanceof Entrenador) {
					((Entrenador) sf).dirigirEntrenamiento();
					((Entrenador) sf).dirigirPartido();
				}
				//si es futbolista
				if(sf instanceof Futbolista) {
					((Futbolista) sf).jugarPartido();
					((Futbolista) sf).entrenar();
				//si es masajista
				if(sf instanceof Masajista) {
					((Masajista) sf).darMasaje();
				}
			}
		}
	}
}
}
