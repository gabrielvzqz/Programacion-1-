package Animales;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<Animal> animales = new ArrayList<Animal>();

		animales.add(new Gato());
		animales.add(new Perro());
		animales.add(new Lobo());
		animales.add(new Leon());

		for (int i = 0; i < animales.size(); i++) {
			if (animales.get(i) instanceof Canido)

				((Canido) animales.get(i)).hola();
			if (animales.get(i) instanceof Felino)
				((Felino) animales.get(i)).hola();

			System.out.println(animales.get(i).getNombreCientifico());
			System.out.println(animales.get(i).getSonido());
			System.out.println(animales.get(i).getAlimento());
			System.out.println(animales.get(i).getHabitat());
			System.out.println();
		}
	}
}
