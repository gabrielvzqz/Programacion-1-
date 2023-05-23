package Vehiculos;

import java.util.ArrayList;

public class TEST {

	public static void main(String[] args) {
		ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		
		Terrestre camioneta = new Terrestre(50, 100);
		vehiculos.add(camioneta);
		Acuatico motoagua = new Acuatico(40, 120);
		vehiculos.add(motoagua);
		
		System.out.println(camioneta.toString());
		System.out.println(motoagua.toString());
		
		System.out.println("Revoluciones del motor: " + motoagua.calcularRevolucionesMotor(1200, 20));
		
		motoagua.recomendarVelocidad(20);
		System.out.println(motoagua.toString());
	}
}
