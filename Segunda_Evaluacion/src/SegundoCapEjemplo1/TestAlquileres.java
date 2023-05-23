package SegundoCapEjemplo1;

public class TestAlquileres {

	public static void main(String[] args) {
		
		//Se crean dos instancias de la clase vehiculo
		Vehiculo vehiculo1 = new Vehiculo("4050 ABJ", "Volkswagen", "GTI", "Blanco", 100.0);
		Vehiculo vehiculo2 = new Vehiculo("2345 JVM", "Seat", "Leon", "Negro", 80.0);
		
		//Se crea una instancia de la clase Cliente
		Cliente cliente1 = new Cliente("30435624X", "Juan", "Pérez");
		
		//Se crea una instancia de la clase VehiculoAlquilado que relaciona al cliente1
		//con el vehiculo1, el vehiculo se alquila con fecha 11/11/2011 durante 2 días.
		
		VehiculoAlquilado alquiler1 = new VehiculoAlquilado(cliente1, vehiculo1, 11, 11, 2011, 2);
		
		System.out.println("Vehiculo alquilado");
		System.out.println("Cliente: " +
		alquiler1.getCliente().getNif() + " " + 
		alquiler1.getCliente().getNombre() + " " + 
		alquiler1.getCliente().getApellidos());
		System.out.println("Vehiculo: " +
		alquiler1.getVehiculo().getMatricula());
		System.out.println("Dias de alquiler: ");
		System.out.println(alquiler1.getTotalDiasAlquiler());
		
	}
}
