package SegundoCapEjemplo1;

import java.util.ArrayList;

public class TestAlquileres2 {
	
	public static ArrayList<Vehiculo> misAlquileres = new ArrayList <Vehiculo>();

	public static void main(String[] args) {
		
		Vehiculo veh1 = new Vehiculo("4050 ABJ", "Volkswagen", "GTI", "Blanco", 100.0);
		Turismo tur1 = new Turismo("2345 JVM", "Seat", "Leon", "Negro", 80.0, 3, false);	
		Deportivo dep1 = new Deportivo("1234 MNL", "Seat", "600E", "beige", 0.5, 850);
		Vehiculo fur1 = new Furgoneta("3456 BNT", "citroen", "c15", "indefinido", 500.0, 1000, 150);	

		//añado vehiculos a la lista
		misAlquileres.add(veh1);
		misAlquileres.add(dep1);
		misAlquileres.add(tur1);
		misAlquileres.add(fur1);
		
		for(Vehiculo v : misAlquileres) {
			System.out.println(v.toString());
		}
		
		for(Vehiculo v : misAlquileres) {
			v.arranca();
		}
		
		/*Vehiculo miVehiculo = new Turismo("4090 TUR", "Skoda", "Fabia", "Negro", 90.0, 2, true);
		System.out.println("INFO " + miVehiculo.toString());
		
		Vehiculo miVehiculo2 = new Deportivo("2090 GVX", "Ferrari", "911" , "rojo", 10000, 56);
		System.out.println("INFO " + miVehiculo2.toString());

		Vehiculo miVehiculo3 = new Furgoneta("3765 BGC", "Seat", "Picasso", "Blanco", 230, 123, 9000);
		System.out.println("INFO " + miVehiculo3.toString());*/
		
		//Ejemplo de downcasting
		
		Vehiculo miVehiculo = new Turismo("4090 TUR", "Skoda", "Fabia", "Negro", 90.0, 2, true);
		
		Turismo miNuevoTurismo = (Turismo) miVehiculo;
		
		if(miNuevoTurismo instanceof Turismo)
			System.out.println("Turismo: " + miNuevoTurismo);
		/*
		//ERROR GRAVE
		Deportivo miNuevoDeportivo = (Deportivo) miVehiculo;		
		if(miNuevoDeportivo instanceof Deportivo)
			System.out.println("Deportivo: " + miNuevoDeportivo);
		
		//ERROR GRAVE
		Furgoneta miNuevaFurgoneta = (Furgoneta) miVehiculo;	
		if(miNuevaFurgoneta instanceof Furgoneta)
			System.out.println("Furgoneta: " + miNuevaFurgoneta);
		*/

	}
}
