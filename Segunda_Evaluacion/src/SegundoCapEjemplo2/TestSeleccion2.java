package SegundoCapEjemplo2;

import java.util.ArrayList;

public class TestSeleccion2 {

	// ArrayList de objetos SeleccionFutbol. Independientemente de la clase hija a
	// la que pertenezca el objeto
	public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

	public static void main(String[] args) {
		
		Entrenador delBosque = new Entrenador (1, "Vicente", "Del Bosque", 60, "284EZ89");
		Futbolista Iniesta = new Futbolista (2, "Andrés", "Iniesta", 29, 6, "Interior derecho");
		Masajista raulMartinez = new Masajista (3, "Raúl", "Martínez", 41, "Licenciado en Fisioterapia", 18);

		integrantes.add(delBosque);
		integrantes.add(Iniesta);
		integrantes.add(raulMartinez);
		
		//CONCENTRACION
		System.out.println("\nTodos los integrantes se concentran. (NO todos ejecutan el mismo método)");
		for(SeleccionFutbol integrante : integrantes) {
			System.out.println(integrante.toString()+ " -> ");
			integrante.Concentrarse();
		}
		
		//VIAJE
		System.out.println("__________________________________________________________________________________________");
		System.out.println("\nTodos los integrantes viajan para jugar un partido. (NO todos ejecutan el mismo método)");
		for(SeleccionFutbol integrante : integrantes) {
		System.out.print(integrante.toString()+ " -> ");
		integrante.Viajar();			
		}

		/*
		//ENTRENAMIENTO
		System.out.println("__________________________________________________________________________________________");
		System.out.println("\nEntrenamiento: Solamente el entrenador y el futbolista tienen métodos para entrenar.");
		System.out.print(delBosque.toString()+ " -> ");
		delBosque.dirigirEntrenamiento();	
		System.out.print(Iniesta.toString()+ " -> ");
		Iniesta.entrenar();	
		
		//MASAJE
		System.out.println("__________________________________________________________________________________________");
		System.out.println("\nSolo el masajista puede dar masajes.");
		System.out.print(raulMartinez.toString()+ " -> ");
		raulMartinez.darMasaje();
		
		//PARTIDO DE FUTBOL
		System.out.println("__________________________________________________________________________________________");
		System.out.println("\nEntrenamiento: Solamente el entrenador y el futbolista tienen métodos para el partido de futbol.");
		System.out.print(delBosque.toString()+ " -> ");
		delBosque.dirigirPartido();	
		System.out.print(Iniesta.toString()+ " -> ");
		Iniesta.jugarPartido();	
		*/
		}
}
